package com.lalajie.java.week2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Phone
 * @Description TODO
 * @Author Mister-Lu
 * @Date 2020/10/12
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Phone {
    private String branch;
    private Integer price;

}
