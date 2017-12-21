package me.zbl.fullstack.service.base;

import java.util.List;

/**
 * 通用包含视图转换功能的业务抽象类
 *
 * @param <E> 数据查询结果实体类
 * @param <V> 视图类
 */
public abstract class ViewTransableService<E, V> {

  /**
   * 将数据实体类对象转换为视图类对象
   *
   * @param entityList 数据实体类对象集合
   *
   * @return 视图模型类对象集合
   */
  protected abstract List<V> transEntityToView(List<E> entityList);
}
