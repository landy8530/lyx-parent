package lyx.test;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSONObject;

import lyx.com.util.Encrypt;
import lyx.sys.service.SysUserService;
@ContextConfiguration(locations = {"classpath:spring-context.xml" })
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
@Transactional(rollbackFor = Exception.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class BaseDaoTest {

	@Autowired
	private SysUserService sysUserService;
	
	@Test
	public void getList() throws Exception {
		List<JSONObject> list = this.sysUserService.getList();
		for(JSONObject json : list){
			System.out.println("==========" + json);
		}
	}
	
	@Test
	public void saveUser() throws Exception {
		JSONObject user = new JSONObject();
		user.put("USER_ID", "xiaoxiao");
		user.put("PASSWORD", Encrypt.md5("xiaoxiao"));
		user.put("USER_NAME", "xiaoxiao");
		user.put("ROLE_CODE", "SYS_ADMIN");
//		user.put("ORG_ID", "");
//		user.put("EMAIL", "");
		user.put("LOGIN_COUNT", 0);
		user.put("LAST_LOGIN_TIME", new Date());
//		user.put("LAST_LOGIN_IP", "");
		user.put("DISABLE_FLAG", "0");
//		user.put("DESC_INFO", "");
		user.put("CREATE_BY", "SYS_INIT");
		user.put("CREATE_TIME", new Date());
		user.put("UPDATE_BY", "SYS_INIT");
		user.put("UPDATE_TIME", new Date());
		this.sysUserService.insert(user);
	}
	
	@Test
	public void getById(){
		JSONObject user = this.sysUserService.getById("admin");
		System.out.println(user);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
