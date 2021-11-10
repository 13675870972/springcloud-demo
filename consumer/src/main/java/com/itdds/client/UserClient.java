package com.itdds.client;

import com.itdds.client.fallback.UserClientFallback;
import com.itdds.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "user-service",fallback = UserClientFallback.class)
public interface UserClient {
    @GetMapping("/user/{id}")
    User getUserById(@PathVariable long id);
}