package com.imooc.VO;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 商品详情
 * Created by 廖师兄
 * 2017-05-12 14:25
 */
@Data
public class ProductInfoVO {

    @JSONField(name="id")
    private String productId;

    @JSONField(name="name")
    private String productName;

    @JSONField(name="price")
    private BigDecimal productPrice;

    @JSONField(name="description")
    private String productDescription;

    @JSONField(name="icon")
    private String productIcon;
}
