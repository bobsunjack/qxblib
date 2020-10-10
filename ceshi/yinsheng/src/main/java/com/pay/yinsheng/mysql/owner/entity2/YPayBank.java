package com.pay.yinsheng.mysql.owner.entity2;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * 专属码和银盛关系表
 * @constructor: qxb
 * @description:
 * @create: 2020-07-31 11:31
 * @update: 2020-07-31 11:31
 */
public class YPayBank {
    //开户行编号
    private String bankName;
    //开户行名称
    private String bankType;
    //开户行编号-支行
    private String openAccBanktype;
    //开户行名称-支行
    private String openAccBankname;
    //城市编号
    private String cityCode;

}
