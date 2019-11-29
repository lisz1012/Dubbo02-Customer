package com.lisz.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lisz.service.DemoService;

@RestController
@RequestMapping("/main")
public class MainController {
	@Reference(version = "1.0.0") //版本号必须指定Provider所提供的一个，否则报错，应用启动不起来
	private DemoService service;
	
	@RequestMapping("say")
	public String say() {
		return service.say("lisz");
	}
}
