package com.seikim.loadbalancer;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

	@Value("${spring.application.name}")
	private String serverName;

	@GetMapping("/")
	public ResponseEntity<ServerStatusResponse> getServerStatus() {
		return ResponseEntity.ok(new ServerStatusResponse(serverName, LocalDateTime.now()));
	}
}
