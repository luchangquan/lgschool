package com.lgschool.daos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;



import org.springframework.stereotype.Repository;

import com.lgschool.mapper1.TUserMapper;
import com.lgschool.po.TUser;
import com.lgschool.po.TUserExample;
import com.lgschool.po.TUserExample.Criteria;
@Repository
public class UserDaoImpl  implements  UserDao{
	/*@Autowired
	private TUserMapper tUserMapper;
	@Override
	public TUser login(String username, String password) {
		TUser tUser=null;
		
		TUserExample tUserExample = new TUserExample ();
		Criteria criteria = new Criteria();
		criteria.andUsernameEqualTo(username);
		criteria.andPasswordEqualTo(password);
		tUserExample.or(criteria);
		
		//List<TUser> selectByExample = tUserMapper.selectByExample(tUserExample);
		if(selectByExample.size() <= 0){
		 tUser = selectByExample.get(0);
		}
		return tUser;
	}
*/
	
}
