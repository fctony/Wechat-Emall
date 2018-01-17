package org.web.emall.service;

import java.util.List;

/**
 * 公用方法接口
 * @param <T>
 */
public interface BaseService<T> {

    /**
     * 获取所有
     * @return
     */
    List<T> getAll();

    /**
     * 通过id获取对象
     * @param id
     * @return
     */
    T findById(Integer id);


}
