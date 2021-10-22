package com.example.dockerdemo.dockerdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {
	@GetMapping("/get")
	public String test1() {
		return "From the controller get method";
	}
	@GetMapping("/post")
	public String test2() {
		return "From the controller post method";
	}

}
