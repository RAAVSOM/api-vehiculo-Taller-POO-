
package api.vehiculo.domain.services;

import api.vehiculo.model.*;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuPrincipal {
    private ArrayList<Carro> carros = new ArrayList<>();
    private ArrayList<Moto> motos = new ArrayList<>();
    
    
    public void mostrarMenu(){
        int ctrl = 0;
        Scanner scn = new Scanner(System.in);
        System.out.println("1- Ver Carros  2- Ver Motos  3- Agregar Vehiculo  0- Salir");
        ctrl = scn.nextInt();
        
        switch (ctrl) {
            case 1 -> verCarros();
            case 2 -> verMotos();
            case 3 -> agregarVehiculo();
            case 0 -> System.out.println("Saliendo...");
            default -> {
                System.out.println("numero fuera de rango");
                mostrarMenu();
            }
        }
    }
    
    private void verCarros(){
        for (Carro carro : carros) {
            System.out.println("- "+carro.getMarca()+" "+carro.getModelo()+" "+carro.getPlaca()+" "+carro.getVelocidadMAX());
        }
        mostrarMenu();
    }
    
    private void verMotos(){
        for (Moto moto : motos) {
            System.out.println("- "+moto.getMarca()+" "+moto.getModelo()+" "+moto.getPlaca()+" "+moto.getCilindraje()+" "+moto.getVelocidadMAX());
        }
        mostrarMenu();
    }
    
    private void agregarVehiculo(){
        int ctrl = 0;
        Scanner scn = new Scanner(System.in);
        System.out.println("1- agregar Moto  2-agregar Carro  0- Regresar");
        ctrl = scn.nextInt();
        
        switch (ctrl) {
            case 1 -> agregarMoto();
            case 2 -> agregarCarro();
            case 0 -> {
                System.out.println("Regresando...");
                mostrarMenu();
            }
            default -> {
                System.out.println("numero fuera de rango");
                agregarVehiculo();
            }
        }
    }
    
    private void agregarCarro(){
        int[] pruebasRealizadas = new int[4]; 
        
        Scanner scnLn = new Scanner(System.in);
        Scanner scnInt = new Scanner(System.in);
        
        System.out.println("Coloque marca");
        String marca = scnLn.nextLine();
        System.out.println("Coloque modelo");
        int modelo = scnInt.nextInt();
        System.out.println("Coloque placa");
        String placa = scnLn.nextLine();
        System.out.println("Coloque velocidad maxima");
        int velocidadMAX = scnInt.nextInt();
        
        Carro carro = new Carro(marca, modelo, placa, velocidadMAX);
        
        int ctrl = 0;
        int permitido = 0;
        
        while(permitido < 4){
            System.out.println("1- prueba de aceleracion  2- prueba de freno  3- prueba de estacionamiento  4- prueba de direccion");
            ctrl = scnInt.nextInt();
            switch (ctrl) {
                case 1 -> {
                    permitido = permitido + revisar(ctrl, pruebasRealizadas);
                    carro.acelerar();
                    pruebasRealizadas[permitido - 1] = ctrl;
                }
                case 2 -> {
                    permitido = permitido + revisar(ctrl, pruebasRealizadas);
                    carro.frenar();
                    pruebasRealizadas[permitido - 1] = ctrl;
                }
                case 3 -> {
                    permitido = permitido + revisar(ctrl, pruebasRealizadas);
                    carro.estacionar();
                    pruebasRealizadas[permitido - 1] = ctrl;
                }
                case 4 -> {
                    permitido = permitido + revisar(ctrl, pruebasRealizadas);
                    carro.direccionar();
                    pruebasRealizadas[permitido - 1] = ctrl;
                }
                default -> System.out.println("numero fuera de rango");
            }
        }
        
        carros.add(carro);
        System.out.println("Pruebas del vehiculo realizadas exitosamente");
        mostrarMenu();
    }
    
    private void agregarMoto(){
        int[] pruebasRealizadas = new int[4]; 
        Scanner scnLn = new Scanner(System.in);
        Scanner scnInt = new Scanner(System.in);
        
        System.out.println("Coloque marca");
        String marca = scnLn.nextLine();
        System.out.println("Coloque modelo");
        int modelo = scnInt.nextInt();
        System.out.println("Coloque placa");
        String placa = scnLn.nextLine();
        System.out.println("Coloque velocidad maxima");
        int velocidadMAX = scnInt.nextInt();
        System.out.println("Coloque cilindraje");
        int cilindraje = scnInt.nextInt();
        
        Moto moto = new Moto(marca, modelo, placa, velocidadMAX, cilindraje);
        
        int ctrl = 0;
        int permitido = 0;
        
        while(permitido < 4){
            System.out.println("1- prueba de aceleracion  2- prueba de freno  3- prueba de estacionamiento  4- prueba de direccion");
            ctrl = scnInt.nextInt();
            switch (ctrl) {
                case 1 -> {
                    permitido = permitido + revisar(ctrl, pruebasRealizadas);
                    moto.acelerar();
                    pruebasRealizadas[permitido - 1] = ctrl;
                }
                case 2 -> {
                    permitido = permitido + revisar(ctrl, pruebasRealizadas);
                    moto.frenar();
                    pruebasRealizadas[permitido - 1] = ctrl;
                }
                case 3 -> {
                    permitido = permitido + revisar(ctrl, pruebasRealizadas);
                    moto.estacionar();
                    pruebasRealizadas[permitido - 1] = ctrl;
                }
                case 4 -> {
                    moto.direccionar();
                    pruebasRealizadas[permitido - 1] = ctrl;
                }
                default -> System.out.println("numero fuera de rango");
            }
        }
        
        motos.add(moto);
        System.out.println("Pruebas del vehiculo realizadas exitosamente");
        mostrarMenu();
    }
    
    private int revisar(int ctrl, int[] pruebasRealizadas){
        for (int i = 0; i < pruebasRealizadas.length; i++) {
            if(pruebasRealizadas[i] != ctrl){
                if((i + 1) == pruebasRealizadas.length){
                    return 1;
                }
            }else{
                break;
            }
        }
        System.out.println("Esta prueba ya se ha realizado");
        return 0;
    }
}
