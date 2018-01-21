package com.imooc.enums;

import lombok.Getter;

/**
 * Created by 吕宝山
 * 2018-01-21
 */
@Getter
public enum PayStatusEnum implements CodeEnum {

   WAIT(0, "等待支付"),
   SUCCCESS(1, "支付成功"),
    ;

   private Integer code;

   private String msg;

   private PayStatusEnum(Integer code, String msg){
       this.code = code;
       this.msg = msg;
   }
}
