package com.gzy.im.repository;

import com.gzy.im.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

public interface AccountRepository extends JpaRepository<Account,Long> {

}
