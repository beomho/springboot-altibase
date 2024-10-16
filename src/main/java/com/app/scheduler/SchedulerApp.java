package com.app.scheduler;

import java.util.Date;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@Component
public class SchedulerApp {

	@Scheduled(cron = "0/10 * * * * *")
	public void alert(){
		log.info("{} ", new Date());
	}
}
