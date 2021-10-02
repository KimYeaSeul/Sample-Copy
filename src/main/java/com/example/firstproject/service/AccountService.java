package com.example.firstproject.service;

import com.example.firstproject.entity.AccountResult;
import com.example.firstproject.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AccountService {
    @Autowired
    private ArticleRepository accountRepository;

    public List<AccountResult> getAccountByBranchCode(String branchCode){
        List<AccountResult> aa = accountRepository.getAccountByBranchCode(branchCode);
        return aa;
    }
}
