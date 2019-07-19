/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author anibal
 */
public class Prueba {
   
    
    public static void main(String [] args)
    {
        SessionIdentifierGenerator codigo = new SessionIdentifierGenerator();
        DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Calendar cal = Calendar.getInstance();
        String fecha = sdf.format(cal.getTime());
        System.out.println(fecha);
        System.out.println(codigo.nextSessionId().substring(0, 10));
        
        String hola = "hola";
        String chao = "chao";
        
        ArrayOfstring det = new ArrayOfstring();
        det.getString().add(hola);
        det.getString().add(chao);
        
        for(int i = 0; i < det.getString().size(); i++)
        {
            System.out.println(det.getString().get(i));
        }

    }
}
