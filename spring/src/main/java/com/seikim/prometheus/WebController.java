package com.seikim.prometheus;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class WebController {

    @GetMapping("/get")
    public ResponseEntity<WebResponse> get() {
        LocalDateTime startTime = LocalDateTime.now();
        log.info("Request Get");
        LocalDateTime endTime = LocalDateTime.now();
        return ResponseEntity.ok(new WebResponse(startTime, endTime));
    }

    @GetMapping("delay")
    public ResponseEntity<WebResponse> delay() throws InterruptedException {
        LocalDateTime starTime = LocalDateTime.now();
        log.info("Request Delay Get");
        Thread.sleep(2_000L);
        LocalDateTime endTime = LocalDateTime.now();
        return ResponseEntity.ok(new WebResponse(starTime, endTime));
    }

    @PostMapping("/post")
    public ResponseEntity<WebResponse> post() {
        LocalDateTime starTime = LocalDateTime.now();
        log.info("Request Post");
        LocalDateTime endTime = LocalDateTime.now();
        return ResponseEntity.status(HttpStatus.CREATED).body(new WebResponse(starTime, endTime));
    }

    @DeleteMapping("/delete")
    public ResponseEntity<WebResponse> delete() {
        LocalDateTime starTime = LocalDateTime.now();
        log.info("Request Delete");
        LocalDateTime end = LocalDateTime.now();
        return ResponseEntity.ok(new WebResponse(starTime, end));
    }

    @GetMapping("/exception")
    public ResponseEntity<?> exception() {
        log.info("Request Exception");
        throw new RuntimeException();
    }
}
