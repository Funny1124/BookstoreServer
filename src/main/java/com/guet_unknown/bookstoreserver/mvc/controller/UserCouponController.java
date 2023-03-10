package com.guet_unknown.bookstoreserver.mvc.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import com.guet_unknown.bookstoreserver.mvc.domain.UserCoupon;
import com.guet_unknown.bookstoreserver.mvc.service.UserCouponService;
import com.guet_unknown.bookstoreserver.util.R;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (UserCoupon)表控制层
 *
 * @author cyan
 * @since 2022-12-19 19:22:57
 */
@Slf4j
@RestController
@RequestMapping("userCoupon")
@Api(tags = "(UserCoupon)表-控制层")
public class UserCouponController {
    /**
     * 服务对象
     */
    @Resource
    private UserCouponService userCouponService;

    /**
     * 查询所有
     *
     * @return 查询结果
     */
    @ApiOperation("查询所有")
    @GetMapping(value = "queryAll")
    public R queryAll() {
        return this.userCouponService.queryAll();
    }

    /**
     * 查询用户所有可用优惠券
     *
     * @param userId 用户id
     * @return 查询用户所有可用优惠券
     */
    @ApiOperation("查询用户所有可用优惠券")
    @GetMapping(value = "queryByUserId")
    public R queryByUserId(Long userId) {
        return this.userCouponService.queryByUserId(userId);
    }

    /**
     * 通过主键查询单条数据
     *
     * @param pageNum  页码
     * @param pageSize 页面大小
     * @return 单条数据
     */
    @ApiOperation("分页查询")
    @GetMapping(value = "queryByPage")
    public R queryByPage(@ApiParam(value = "页码") int pageNum, @ApiParam(value = "页面大小") int pageSize) {
        return this.userCouponService.queryByPage(pageNum, pageSize);
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ApiOperation("通过主键id查询")
    @GetMapping(value = "queryById")
    public R queryById(@ApiParam(value = "id 主键") @RequestParam("id") Long id) {
        return this.userCouponService.queryById(id);
    }

    /**
     * 新增数据
     *
     * @param userCoupon 实体
     * @return 新增结果
     */
    @ApiOperation("新增数据")
    @PostMapping(value = "insert")
    public R insert(@ApiParam(value = "userCoupon 实体") @RequestBody UserCoupon userCoupon) {
        return this.userCouponService.insert(userCoupon);
    }

    /**
     * 更新数据
     *
     * @param userCoupon 实体
     * @return 更新数据
     */
    @ApiOperation("更新数据")
    @PutMapping(value = "update")
    public R update(@ApiParam(value = "userCoupon 实体") @RequestBody UserCoupon userCoupon) {
        return this.userCouponService.update(userCoupon);
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @ApiOperation("删除数据")
    @DeleteMapping(value = "deleteById")
    public R deleteById(@ApiParam(value = "id 主键") @RequestParam("id") Long id) {
        return this.userCouponService.deleteById(id);
    }

}


