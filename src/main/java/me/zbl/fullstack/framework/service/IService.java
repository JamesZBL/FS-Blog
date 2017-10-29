package me.zbl.fullstack.framework.service;

import org.apache.ibatis.exceptions.TooManyResultsException;
import tk.mybatis.mapper.entity.Condition;

import java.util.List;

/**
 * Service 基础接口
 * 其他 Service 接口需继承自本接口
 *
 * @param <T> 实体类型
 * @author James
 * @since 1.10.29
 */
public interface IService<T> {
    //插入
    void save(T model);

    //批量插入
    void save(List<T> models);

    //通过主鍵刪除
    void deleteById(Integer id);

    //批量刪除 eg：ids -> “1,2,3,4”
    void deleteByIds(String ids);

    //更新
    void update(T model);

    //通过ID查找
    T findById(Integer id);

    //通过某个成员属性查找,value需符合unique约束
    T findBy(String property, Object value) throws TooManyResultsException;

    //通过多个ID查找//eg：ids -> “1,2,3,4”
    List<T> findByIds(String ids);

    //根据条件查找
    List<T> findByCondition(Condition condition);

    //获取所有
    List<T> findAll();
}
