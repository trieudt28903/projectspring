package com.dev.shopdienthoai.demo.domain.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Meta {
    private int page;
    private int pageSize;
    private long total;
    private int pages;
}
