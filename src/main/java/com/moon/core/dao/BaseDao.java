package com.moon.core.dao;

import java.util.List;

/**
 * @Author  liangquandeng
 * @Date    2016年01月02日
 * @Version 1.0V
 * @Description 所有Dao操作的父接口
 */
public interface BaseDao<T> {
    /**
     * 获取单个实体信息
     * @param params 参数
     * @return T 实体
     */
    public T get(String params);
    /**
     *
     * @param params
     * @return
     */
    public List<T> getList(String params);

}
