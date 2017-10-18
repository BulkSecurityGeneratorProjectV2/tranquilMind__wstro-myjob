package com.wstro.service.echat;

import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.service.IService;
import com.wstro.entity.echat.ChatBaseUser;

/**
 * 聊天用户类
 *
 * @author wangwenhao
 * @date 2017-09-28
 *
 */
public interface TsBaseUserService extends IService<ChatBaseUser> {
	/**
	 * 查询用户类列表
	 * 
	 * @param map
	 *            Map
	 * @return List<P3ImTSBaseUser>
	 */
	List<ChatBaseUser> queryList(Map<String, Object> map);
}
