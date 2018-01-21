package com.imooc.VO;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * 商品(包含类目)
 * Created by 廖师兄
 * 2017-05-12 14:20
 */
@Data
public class ProductVO {

    @JSONField(name="name")
    private String categoryName;
    @JSONField(name="type")
    private Integer categoryType;

    @JSONField(name="foods")
    private List<ProductInfoVO> productInfoVOList;
}
