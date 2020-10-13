package com.lalajie.java.week2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Group
 * @Description TODO
 * @Author Mister-Lu
 * @Date 2020/10/12
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Group {
    private String groupName;
    private Student[] students;
}
