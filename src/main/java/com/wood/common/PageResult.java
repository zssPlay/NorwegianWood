package com.wood.common;

import com.wood.common.ResponseResult;
import lombok.Data;

import java.util.List;


@Data
public class PageResult<T> extends ResponseResult {

    private Long currentPage;
    private Long size;
    private Long total;
    private List<T> data;


    public PageResult(Long currentPage, Long size, Long total, List<T> data)
    {
        this.currentPage = currentPage;
        this.size = size;
        this.total = total;
        this.data = data;
    }

}
