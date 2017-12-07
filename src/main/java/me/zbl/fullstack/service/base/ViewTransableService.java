package me.zbl.fullstack.service.base;

import java.util.List;

/**
 * 通用包含视图转换功能的业务抽象类
 *
 * @param <E> 数据查询结果实体类
 * @param <V> 视图类
 */
public abstract class ViewTransableService<E, V> {

  protected abstract List<V> transEntitytoView(List<E> entityList);
}
