package me.zbl.fullstack.framework.service;

import org.apache.ibatis.exceptions.TooManyResultsException;
import tk.mybatis.mapper.entity.Condition;

import java.util.List;

/**
 * Service 基础接口
 * 其他 Service 接口需继承自本接口
 *
 * @param <T> 实体类型
 *
 * @author James
 */
public interface IService<T> {

  /**
   * 插入
   *
   * @param model 模型
   */
  void save(T model);

  /**
   * 批量插入
   *
   * @param models 模型
   */
  void save(List<T> models);

  /**
   * 通过主鍵刪除
   *
   * @param id 主键
   */
  void deleteById(Integer id);

  /**
   * 批量删除
   *
   * @param ids 例如 “ 1,2,3,4 “
   */
  void deleteByIds(String ids);

  /**
   * 更新
   *
   * @param model 模型
   */
  void update(T model);

  /**
   * 通过 id 查找
   *
   * @param id id
   *
   * @return 实体
   */
  T findById(Integer id);

  /**
   * 通过某个成员属性查找,value 需符合 unique 约束
   *
   * @param property 属性名
   * @param value    属性值
   *
   * @return 实体
   *
   * @throws TooManyResultsException 结果集过大
   */
  T findBy(String property, Object value) throws TooManyResultsException;

  /**
   * 通过多个ID查找//eg：ids -> “1,2,3,4”
   *
   * @param ids ids
   *
   * @return 实体集合
   */
  List<T> findByIds(String ids);

  /**
   * 根据条件查找
   *
   * @param condition 条件
   *
   * @return 实体集合
   */
  List<T> findByCondition(Condition condition);

  /**
   * 获取所有
   *
   * @return 实体集合
   */
  List<T> findAll();

  /**
   * 创建条件
   *
   * @return 条件
   */
  Condition createCondition();
}
