package com.app.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Message;

@RestController
public class HelloController {

	@GetMapping("/")
	public String sayhelloFromGet() {
		return "Hello from GET method";
	}
	@GetMapping("/{name}")
	public String sayhelloFromGetByName(@PathVariable String name) {
		return "Hello "+name.toUpperCase()+" from GET method";
	}

	@PostMapping("/")
	public String sayhelloFromPost() {
		return "Hello from POST method";
	}
	@PostMapping("/message")
	public Message addMessage(@RequestBody Message message) {
		System.out.println(message);
		return message;
	}

	@PutMapping("/")
	public String sayhelloFromPut() {
		return "Hello from PUT method";
	}

	@PatchMapping("/")
	public String sayhelloFromPatch() {
		return "Hello from PATCH method";
	}

	@DeleteMapping("/")
	public String sayhelloFromDelete() {
		return "Hello from DELETE method";
	}

}
