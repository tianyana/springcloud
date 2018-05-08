package com.mayi.springcloud.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.mayi.springcloud.fallback.UserFallback;

@FeignClient(name="service-user", fallback=UserFallback.class)
public interface UserFeignClient {
	
	@GetMapping("/listUsers")
	public String listUsers();
	
}
