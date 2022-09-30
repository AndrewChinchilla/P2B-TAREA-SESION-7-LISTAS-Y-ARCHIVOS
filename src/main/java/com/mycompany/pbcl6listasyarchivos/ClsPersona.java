/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pbcl6listasyarchivos;

/**
 *
 * @author chinc
 */
//public class ClsPersona {
    
    
import java.io.*;
import java.util.*;


/**
 *
 * @author Usuario
 */
public class ClsPersona implements IPersona{
    
    private static Scanner teclado = new Scanner(System.in);
    
    static List<ClsPersona> LecturaArchivo(){
        List<ClsPersona> Personas= new ArrayList();
        
        File Archivo = new File("C:\\Users\\chinc\\OneDrive\\DatosInfo\\ArchivoClsVendedores.");
        try{
            BufferedReader entrada = new BufferedReader(new FileReader(Archivo));
            String lectura; 
            lectura = entrada.readLine();
            int NoLinea = 1;
     
            System.out.println("\n");
            System.out.println("\t\t > LISTA DE VENDEDORES <");
            while ( lectura != null){ 
                System.out.println("\n");
                System.out.println(" > VENDEDOR "+NoLinea+": "+lectura);
                NoLinea++;
                lectura = entrada.readLine();
                
            }
            entrada.close();
        }catch(FileNotFoundException ex){
            System.out.println("El archivo no existe");
        }catch(IOException ex){
            System.out.println("Hay problemas de apertura");
        }
        
       return Personas;
    }

    static void Escribir(){
        String NewVen;
        File Archivo = new File("C:\\Users\\chinc\\OneDrive\\DatosInfo\\ArchivoClsVendedores.");
         System.out.println("\n");
        System.out.println("\t\t > AGREGAR NUEVO VENDEDOR <");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println(" > POR FAVOR INGRESE EL NOMBRE DE SU NUEVO VENDEDOR: ");
        NewVen = teclado.nextLine();
        try{
            PrintWriter salida = new PrintWriter(new FileWriter(Archivo,true));
            String Data = NewVen;
            salida.println(Data);
            salida.close();
            
        }catch(FileNotFoundException ex){
            System.out.println("El archivo no existe");
        }catch(Exception e){
            System.out.println("Hubo problemas");
        }
    }
    
    @Override
    public String getNombre(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNombre(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void llenar_informacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Cargar_información(String nombreArchivo) {
     
    }

    @Override
    public void guardar_información(String archivo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static void main(String[] args){
     //LecturaArchivo();
     Escribir();
     List<ClsPersona> RellenInfo = ClsPersona.LecturaArchivo();
     System.out.println(RellenInfo);

        

    }
}

