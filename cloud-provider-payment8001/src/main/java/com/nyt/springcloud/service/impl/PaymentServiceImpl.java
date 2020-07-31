package com.nyt.springcloud.service.impl;

import com.nyt.springcloud.dao.PaymentDao;
import com.nyt.springcloud.entities.Payment;
import com.nyt.springcloud.service.PaymentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource  //@Autowired作用一样
    private PaymentDao paymentDao;

    public  int create(Payment payment){
        return paymentDao.create(payment);
    }

    public  Payment getPaymentById(Long id){
        return paymentDao.getPaymentById(id);

    }


}
