package com.zww.ssmbuild.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 书本实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {
    private  int bookID;
    private String bookName;
    private int bookCounts;
    private String detail;
}
