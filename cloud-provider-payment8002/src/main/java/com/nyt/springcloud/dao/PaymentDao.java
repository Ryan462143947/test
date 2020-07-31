package com.nyt.springcloud.dao;

import com.nyt.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentDao {
    public  int create(Payment payment);//写操作

    public  Payment getPaymentById(@Param("id") Long id);//读操作

}
