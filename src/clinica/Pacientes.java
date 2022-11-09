/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica;

import java.util.LinkedList;

/**
 *
 * @author Cano
 */
public class Pacientes {
    
    String nombre;
   static LinkedList<Pacientes> paciente = new LinkedList();
   
   

    public Pacientes(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static void AgregarPaciente()
    {
        
     paciente.add(new Pacientes("Jose Gomez"));
     paciente.add(new Pacientes("Manuely Rocha"));
     paciente.add(new Pacientes("Anderson Oliveira"));
    
        for (Pacientes elemento : paciente) {
            System.out.println("Nombre:" +elemento.getNombre());
            
        }
    
    }
    
    
    
    
    
}
