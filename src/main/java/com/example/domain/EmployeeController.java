/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.domain;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author rclavel
 */

@RestController
public class EmployeeController {

	private  List<Empleado> empleados = createList();
        
        
	@RequestMapping(value = "/empleados", method = RequestMethod.GET, produces = "application/json")
	public List<Empleado> firstPage() {
		return empleados;
	}
        
        
	@DeleteMapping(path = { "/{id}" })
	public Empleado delete(@PathVariable("id") int id) {
		Empleado deletedEmp = null;
		for (Empleado emp : empleados) {
			if (emp.getCi().equals(id)) {
				empleados.remove(emp);
				deletedEmp = emp;
				break;
			}
		}
		return deletedEmp;
	}

        
	@PostMapping
	public Empleado create(@RequestBody Empleado user) {
		empleados.add(user);
		System.out.println(empleados);
		return user;
	}

	private static List<Empleado> createList() {
		List<Empleado> tempEmployees = new ArrayList<>();
		Empleado emp1 = new Empleado();
		emp1.setNombre("emp1");
		emp1.setDesignacion("manager");
		emp1.setCi("1");
		emp1.setSalario(3000);

		Empleado emp2 = new Empleado();
		emp2.setNombre("emp2");
		emp2.setDesignacion("developer");
		emp2.setCi("2");
		emp2.setSalario(3000);
		tempEmployees.add(emp1);
		tempEmployees.add(emp2);
		return tempEmployees;
	}
}