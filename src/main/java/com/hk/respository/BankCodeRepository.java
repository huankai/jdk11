package com.hk.respository;

import com.hk.entity.BankCode;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author kevin
 * @date 2019-12-2 18:00
 */
public interface BankCodeRepository extends JpaRepository<BankCode,String> {
}
