package com.example.onlinelearning.service;

import java.util.List;
import java.util.Map;

public interface BaseService<T> {
    /**
     * 添加一个数据
     *
     * @param t
     */
    Integer save(T t);

    /**
     * 根据id数组删除对应数据
     *
     * @param idArray
     */
    Integer delete(String[] ids);

    /**
     * 更新数据
     *
     * @param t
     */
    Integer update(T t);

    /**
     * 获取数据列表
     *
     * @return
     */
    List getList(Map<?, ?> m);

    /**
     * 获得数据总数
     *
     * @return
     */
    Integer getTotal(T t);

    /**
     * 获取单个记录
     *
     */
    T getRecord(T t);

}
