package com.example.demo.ex1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Apicontroller_Ex1c {
@GetMapping("hello")
public String getMyfav(@RequestParam String colour)
{
	return "My Favourite colour is "+colour+"!";
}
}
