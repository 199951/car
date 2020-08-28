package com.fan.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private Integer id;
    private Integer cid;
    private Integer uid;
    private Integer getid;
    private Integer backid;
    private Long oprice;
    private String status;
}
