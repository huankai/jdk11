package com.hk;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hk.entity.BankCode;
import com.hk.respository.BankCodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author kevin
 * @date 2019-12-2 17:48
 */
@SpringBootApplication
public class Jdk11SpringBootApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Jdk11SpringBootApplication.class, args);
    }

    @Autowired
    private BankCodeRepository bankCodeRepository;

    @Override
    public void run(String... args) throws Exception {
        BankCode bankCode = bankCodeRepository.findById("ABC").orElse(null);
        System.out.println(new ObjectMapper().writeValueAsString(bankCode));
    }
}
