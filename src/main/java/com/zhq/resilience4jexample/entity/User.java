package com.zhq.resilience4jexample.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @DATE: 2024-03-11 22:22
 * @Author: zhq123
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Long id;

    private String name;
}
