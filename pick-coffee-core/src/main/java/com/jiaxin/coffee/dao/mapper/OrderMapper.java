package com.jiaxin.coffee.dao.mapper;

import com.jiaxin.coffee.dao.entity.Order;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 订单表 Mapper 接口
 * </p>
 *
 * @author jiaxin.gong
 * @since 2018-12-27
 */
@Mapper
public interface OrderMapper extends BaseMapper<Order> {

}
