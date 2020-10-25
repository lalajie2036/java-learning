package com.lalajie.java.week3;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Myresult
 * @Description TODO
 * @Author Mister-Lu
 * @Date 2020/10/19
 **/
@Builder
@Data
@AllArgsConstructor@NoArgsConstructor
public class MyResult {
    private Integer max;
    private Integer min;
    private Integer sum;

}




