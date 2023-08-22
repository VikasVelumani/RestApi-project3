package com.example.demo.Repoisitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Modelapi;

public interface Reposi extends JpaRepository<Modelapi,Integer>
{
	
}

