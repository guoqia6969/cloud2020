package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author wangsh
 * @Classname PaymentService
 * @Description 流水服务层
 * @Date 2020/9/23 22:37
 */
public interface PaymentService {
    /**
     * 创建流水记录
     * @param payment
     * @return
     */
    public int create(Payment payment);

    /**
     * 根据id查询流水记录
     * @param id
     * @return
     */
    public Payment getPaymentById(@Param("id")Long id);
}
