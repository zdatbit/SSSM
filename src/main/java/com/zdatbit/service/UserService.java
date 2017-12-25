/** 
 * @author  zhangdi 	
 * @date 创建时间：2017年12月25日 上午10:47:59  	
 */

package com.zdatbit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zdatbit.dao.IUserDao;
import com.zdatbit.pojo.User;

@Service("userService")
public class UserService {
	@Autowired
	private IUserDao userDao;
	
	public User getUserById(int userId){
		return this.userDao.selectByPrimaryKey(userId);
	}
}
