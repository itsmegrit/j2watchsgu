package com.sgu.j2watch.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sgu.j2watch.entities.Voucher;

@Repository
public interface VoucherRepository extends CrudRepository<Voucher, Integer>{
    public Voucher findByCode(String code);
}
