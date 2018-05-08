package com.mayi.springcloud.fallback;

import org.springframework.stereotype.Component;

import com.mayi.springcloud.client.UserFeignClient;

@Component
public class UserFallback implements UserFeignClient{

	@Override
	public String listUsers() {
		// TODO Auto-generated method stub
		return "服务调用失败";
	}

}
