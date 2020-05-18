package com.dev.cronjob.Cron;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class CronJobScheduling {
	
	private static Logger logger = LoggerFactory.getLogger(CronJobScheduling.class);
	
	private static final SimpleDateFormat dateFormat =  new SimpleDateFormat("HH:mm:ss");
	
	@Scheduled(fixedDelay = 5000)
	public void reportCurrentTime() {
		logger.info("The time is now {}" , dateFormat.format(new Date()));
	}

}
