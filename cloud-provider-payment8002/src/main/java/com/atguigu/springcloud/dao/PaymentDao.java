package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author wangsh
 * @Classname PaymentDao
 * @Description 流水数据访问层
 * @Date 2020/9/23 22:37
 */
@Mapper
public interface PaymentDao {
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
