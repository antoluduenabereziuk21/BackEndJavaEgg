/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Mains;


import EntidadesEjr3.Poliza;
import ServicioEjer3.PolizaService;
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Object;
import java.util.Calendar;
import static java.util.Calendar.DAY_OF_MONTH;
import static java.util.Calendar.MONTH;
import static java.util.Calendar.YEAR;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author antolube20
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calendar fechaActual= Calendar.getInstance();
        System.out.println("fecha Actual "+ fechaActual.get(YEAR)+" "+ (fechaActual.get(MONTH)+1)+" "+fechaActual.get(DAY_OF_MONTH));
    }
    
}
