package com.example.firstproject.repository;

import com.example.firstproject.entity.AccountResult;
import com.example.firstproject.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

// <관리대상, 관리대상 대표값의 타입>
public interface ArticleRepository extends JpaRepository<Article, Long> {
    @Query(value = "SELECT account_no as accountNo, account_name as accountName FROM article WHERE branch_code = :branchCode", nativeQuery = true)
    List<AccountResult> getAccountByBranchCode(@Param("branchCode") String branchCode);
}
