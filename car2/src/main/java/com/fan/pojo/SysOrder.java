package com.fan.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SysOrder {
    private Integer oid;
    private Double oprice;
    private String cname;
    private String getcity;
    private String backcity;
    private String ostatus;
}
