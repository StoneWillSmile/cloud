package org.wwh.cloud.dao;

import org.apache.ibatis.annotations.Param;
import org.wwh.cloud.po.Payment;

/**
 * @auther zzyy
 * @create 2020-02-18 10:27
 */
public interface PaymentDao {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
