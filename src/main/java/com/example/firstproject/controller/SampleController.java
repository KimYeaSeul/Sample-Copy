package com.example.firstproject.controller;

import com.example.firstproject.entity.AccountResult;
import com.example.firstproject.service.AccountService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = "Sample Let's gootrianrk")
@RestController // data를 반환하겠다롱
public class SampleController {
    @Autowired
    private AccountService accountService;

//    @ApiOperation(value = "sample")
    @GetMapping("/acount")
    public List<AccountResult> getAccountInfo(String branchCode){
        return accountService.getAccountByBranchCode(branchCode);
    }

}
