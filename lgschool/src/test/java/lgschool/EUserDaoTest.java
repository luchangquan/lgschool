package lgschool;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSONObject;
import com.lgschool.daos.IEUser189Dao;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:2017-data.xml")
public class EUserDaoTest {
	private Logger logger = LoggerFactory.getLogger(EUserDaoTest.class);

	@Autowired
	private IEUser189Dao userDao;

	@Test
	public void select() {
		logger.info("==========================================");

		System.out.println(JSONObject.toJSONString(userDao.getById("0096257f-ef8d-40f7-af65-a3438d492f78"))+"222222");

	}
}
