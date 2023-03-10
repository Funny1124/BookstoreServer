package com.guet_unknown.bookstoreserver.mvc.controller;

import com.guet_unknown.bookstoreserver.mvc.service.impl.FileServiceImpl;
import com.guet_unknown.bookstoreserver.util.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


@Slf4j
@CrossOrigin
@RestController
@RequestMapping("files")
@Api(tags = "(file)控制层")
public class FileController {
    @Autowired
    private FileServiceImpl fileService;

    @ApiOperation("文件上传")
    @PostMapping(value = "/upload")
    private R upload(@ApiParam(value = "文件") @RequestPart("files") MultipartFile[] files, Long uid) {
        return fileService.upload(files, uid);
    }

}
