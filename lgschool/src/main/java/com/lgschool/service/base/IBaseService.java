package com.lgschool.service.base;

import java.util.List;

import com.lgschool.common.pojo.enhanced.base.BaseEnhanced;
import com.lgschool.po.BasePo;
import com.lgschool.util.Pagination;

import tk.mybatis.mapper.entity.Example;


/**
 * @author jgshun
 * @date 2016-11-10 下午5:52:52
 * @version 1.0
 */
public interface IBaseService<T extends BasePo> {

	/**
	 * 统计总数
	 * 
	 * @param record
	 * @return
	 */
	int countByRecord(T record   );

	/**
	 * 统计总数
	 * 
	 * @param example
	 * @return
	 */
	int countByExample(Object example   );

	/**
	 * 根据id查询
	 * 
	 * @param id
	 * @return
	 */
	T getById(Object id   );

	/**
	 * 根据实体查询一条数据
	 * 
	 * @param record
	 * @return
	 */
	T getOneByRecord(T record   );

	/**
	 * 根据实体查询实体数据列表
	 * 
	 * @param record
	 * @return
	 */
	List<T> getListByRecord(T record   );

	/**
	 * 根据条件查询数据
	 * 
	 * @param example
	 * @return
	 */
	List<T> getListByExample(Example example   );

	/**
	 * 查询所有的数据
	 * 
	 * @return
	 */
	List<T> getAll( );

	/**
	 * 查询分页数据
	 * 
	 * @param pagination
	 * @return
	 */
	Pagination<T> getPagination(Pagination<T> pagination);

	/**
	 * 查询分页数据
	 * 
	 * @param pagination
	 * @param example
	 * @return
	 */
	Pagination<T> getPagination(Pagination<T> pagination , Example example   );

	/**
	 * 新增数据:所有的数据都会被插入
	 * 
	 * @param record
	 * @return
	 */
	T save(T record   );

	/**
	 * 新增数据 只插入不为空的字段 不会影响有默认值的字段
	 * 
	 * @param t
	 * @return
	 */
	T saveSelective(T record   );

	/**
	 * 批量插入数据:限制实体有id属性
	 * 
	 * @param records
	 * @return
	 */
	List<T> saveList(List<T> records   );

	/**
	 * 根据主键修改数据
	 * 
	 * @param record
	 * @return
	 */
	void updateByPrimaryKey(T record   );

	/**
	 * 根据主键修改数据，只修改不为null的字段
	 * 
	 * @param record
	 * @return
	 */
	void updateByPrimaryKeySelective(T record   );

	/**
	 * 根据条件修改数据
	 * 
	 * @param record
	 * @param example
	 * @return
	 */
	void updateByExample(T record , Example example   );

	/**
	 * 根据条件修改数据，只修改不为null字段
	 * 
	 * @param t
	 * @return
	 */
	void updateByExampleSelective(T record , Example example   );

	/**
	 * 根据主键删除
	 * 
	 * @param id
	 * @return
	 */
	void deleteById(Object id   );

	/**
	 * 根据条件:批量删除
	 * 
	 * @param values
	 *            值列表
	 * @param property
	 *            属性名
	 * @param clazz
	 *            实体class
	 * @return
	 */
	void deleteByKeys(List<Object> values,  String property , Class<T> clazz   );

	/**
	 * 根据条件删除数据
	 * 
	 * @param example
	 * @return
	 */
	void deleteByExample(Example example   );

	/**
	 * 删除对应的记录
	 * 
	 * @param record
	 * @return
	 */
	void delete(T record   );

	/**
	 * 根据主键id获取加强类对象
	 * 
	 * @param id
	 * @param userContext
	 * @return
	 */
	BaseEnhanced getEnhanced(Object id   );

	/**
	 * 根据主键列表获取加强类对象列表
	 * 
	 * @param ids
	 * @param userContext
	 * @return
	 */
	List<? extends BaseEnhanced> getEnhanceds(List<?> ids   );

	/**
	 * 单个数据实体类转化成加强类
	 * 
	 * @param po
	 * @return
	 */
	BaseEnhanced convent2Enhanced(BasePo po);

	/**
	 * 多个数据实体类转化成加强类
	 * 
	 * @param pos
	 * @return
	 */
	List<? extends BaseEnhanced> convent2Enhanceds(List<? extends BasePo> pos);

	/**
	 * 给单个加强类添加相应的关系
	 * 
	 * @param enhancedItem
	 * @param userContext
	 * @return
	 */
	BaseEnhanced appendEnhancedCommons(BaseEnhanced enhancedItem   );

	/**
	 * 给多个加强类添加相应的关系
	 * 
	 * @param enhancedItems
	 * @param userContext
	 * @return
	 */
	List<? extends BaseEnhanced> appendEnhancedCommons(List<? extends BaseEnhanced> enhancedItems   );

	/**
	 * 针对特定的用户给单个加强类添加对应的相关数据
	 * 
	 * @param enhancedItem
	 * @param userContext
	 * @return
	 */
	BaseEnhanced appendEnhancedExtralsForUser(BaseEnhanced enhancedItem   );

	/**
	 * 针对特定的用户给多个加强类添加对应的相关数据
	 * 
	 * @param enhancedItems
	 * @param userContext
	 * @return
	 */
	List<? extends BaseEnhanced> appendEnhancedExtralsForUser(List<? extends BaseEnhanced> enhancedItems   );

}
