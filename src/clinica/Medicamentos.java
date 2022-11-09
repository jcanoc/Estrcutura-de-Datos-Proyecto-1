/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica;

import static clinica.Pacientes.paciente;
import java.util.LinkedList;

/**
 *
 * @author Cano
 */
public class Medicamentos {


    String nombre;
    static LinkedList<Medicamentos> medicamento = new LinkedList();

    public Medicamentos(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static void AgregarMedicamento()
    {
        
        medicamento.add(new Medicamentos("Tramal"));
        medicamento.add(new Medicamentos("Gabapentina"));
        medicamento.add(new Medicamentos("Neurobion"));
        medicamento.add(new Medicamentos("Cloroferamina"));
        
        for (Medicamentos elemento : medicamento) {
            System.out.println("Medicamento:" +elemento.getNombre());
            
     }
    
   }
    
      
}