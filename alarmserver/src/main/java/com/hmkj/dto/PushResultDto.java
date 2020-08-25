package com.hmkj.dto;

import com.alibaba.fastjson.JSON;

import java.util.HashMap;
import java.util.Map;

/**
 * @constructor: qxb
 * @description:
 * @create: 2020-08-25 11:02
 * @update: 2020-08-25 11:02
 */
public class PushResultDto {
    public String status;
    public String info;
    public Long Id;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("Id", "333");
        String result = JSON.toJSONString(map);
        PushResultDto dto = JSON.parseObject(result, PushResultDto.class);
        System.out.println(dto.getId());
    }
}
