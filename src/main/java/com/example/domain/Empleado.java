/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author rclavel
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Empleado {
    
    private String ci;
    private String nombre;
    private String designacion;
    private double salario;

}
