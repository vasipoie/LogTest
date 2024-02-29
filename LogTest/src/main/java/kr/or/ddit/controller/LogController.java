package kr.or.ddit.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {
	
	private final Logger logger = LoggerFactory.getLogger("LoggerController의 로그");
	
	@GetMapping("/log")
	public void log() {
		logger.info("--------- Log 테스트 ----------");
	}
}
