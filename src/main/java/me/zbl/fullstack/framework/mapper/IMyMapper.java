package me.zbl.fullstack.framework.mapper;

import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.ExampleMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;
import tk.mybatis.mapper.common.ids.DeleteByIdsMapper;
import tk.mybatis.mapper.common.ids.SelectByIdsMapper;

/**
 * Mapper 基础接口
 * 其他 Mapper 接口需集成本接口
 *
 * @param <T> 实体类型
 * @author James
 * fixme 此接口不能被扫描到，否则出错
 * @since 1.10.29
 */
public interface IMyMapper<T> extends Mapper<T>,
        MySqlMapper<T>,
        DeleteByIdsMapper<T>,
        ConditionMapper<T>, ExampleMapper<T>,
        SelectByIdsMapper {
}
