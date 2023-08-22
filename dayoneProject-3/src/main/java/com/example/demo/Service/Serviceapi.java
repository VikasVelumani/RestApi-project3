package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Modelapi;
import com.example.demo.Repoisitory.Reposi;

@Service
public class Serviceapi {

@Autowired
Reposi re;
public Modelapi saveinfo(Modelapi m) {
	return re.save(m);
}
public List<Modelapi> showinfo(){
	return re.findAll();
}	


}
