package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Modelapi;
import com.example.demo.Service.Serviceapi;

@RestController
public class Controllerapi {
	@Autowired
         Serviceapi ser;
         @PostMapping("addstudent")
         public Modelapi addinfo(@RequestBody Modelapi m) {
			return ser.saveinfo(m);
         }
	@GetMapping("showStudent")
	public List<Modelapi> show(){
		return ser.showinfo();
	}
}
