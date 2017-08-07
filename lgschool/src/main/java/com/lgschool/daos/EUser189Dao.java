package com.lgschool.daos;

import org.springframework.stereotype.Repository;

import com.lgschool.dao.base.BaseDao;
import com.lgschool.po.EUser189;


@Repository
public class EUser189Dao extends BaseDao<EUser189> implements IEUser189Dao {


	/*@Override
	public List<EUser189> getListByCompanyId(String companyId) {
		Example example = new Example(EUser189.class);
		Criteria criteria = example.createCriteria();
		criteria.andEqualTo(EUser189.FIELD_COMPANYID, companyId);
		example.setOrderByClause(EUser189.ORDER_CREATE_TIME_ASC);
		return super.getListByExample(example);
	}*/


}
