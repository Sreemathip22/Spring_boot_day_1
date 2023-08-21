package com.example.demo.ex1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Apicontroller_Ex1b {
@GetMapping("wel")
public String Wel(@RequestParam String name)
{
	return "Welcome "+name+"!";
}
}
