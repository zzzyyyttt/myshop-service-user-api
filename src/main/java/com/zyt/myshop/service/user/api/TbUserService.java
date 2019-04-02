package com.zyt.myshop.service.user.api;

import com.github.pagehelper.PageInfo;
import com.zyt.myshop.commons.domain.TbUser;

import java.util.List;

public interface TbUserService {

    /**
     * 查询全部数据
     * @return
     */
    List<TbUser> selectAll();

    /**
     * 分页查询
     * @param pageNum 页码
     * @param pageSize 笔数
     * @return
     */
    PageInfo<TbUser> page(int pageNum, int pageSize);
}
