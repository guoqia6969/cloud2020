package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


@RestController
@Slf4j
/**
 * @author wangsh
 * @Classname PaymentController
 * @Description 流水控制层
 * @Date 2020/9/23 22:37
 */
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private  String serverPort;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("***************插入结果"+result);
        if(result>0){
            return new CommonResult(200,"成功,serverPort:"+serverPort,result);
        }else{
            return new CommonResult(444,"失败",null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> create(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("******查询结果"+payment);
        if(payment != null){
            return new CommonResult(200,"查询成功~~~~serverPort:"+serverPort,payment);
        }else{
            return new CommonResult(444,"查询失败",null);
        }
    }


}
