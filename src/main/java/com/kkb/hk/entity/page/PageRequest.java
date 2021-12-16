package com.kkb.hk.entity.page;


import lombok.Data;

/**
 * 分页数据
 *
 * @author
 */
@Data
public class PageRequest {
    /**
     * 当前记页
     */
    private Integer pageNum;

    /**
     * 每页数量
     */
    private Integer pageSize;


}
