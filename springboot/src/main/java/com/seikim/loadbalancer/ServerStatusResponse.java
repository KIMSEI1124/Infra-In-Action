package com.seikim.loadbalancer;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

public record ServerStatusResponse(
		@JsonProperty("server_name") String serverName,
		LocalDateTime date
) {
}
