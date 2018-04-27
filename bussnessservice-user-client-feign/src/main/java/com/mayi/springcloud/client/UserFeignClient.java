package com.mayi.springcloud.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="service-user")
public interface UserFeignClient {
	
	@GetMapping("/listUsers")
	public String listUsers();
	
}
