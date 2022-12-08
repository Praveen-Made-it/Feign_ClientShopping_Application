package com.niit.jdp.BEJ_C2_S3_REST_API_MONGODB_PC_1.proxy;

import com.niit.jdp.BEJ_C2_S3_REST_API_MONGODB_PC_1.domain.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name="authentication-service",url = "authentication-service:8083")
public interface UserProxy {
    @PostMapping("/api/v2/register/")
    public ResponseEntity<?> saveUser(@RequestBody Customer user);
}
