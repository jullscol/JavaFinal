package com.calculator;

import java.util.Scanner;

public class Calculator1 {
	
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);

    String operacion;
    double numero1;
    double numero2;
    double resultado=0;
    char escInt=' ';
    String cadena="";
    System.out.print("Ingrese número: ");
    numero1 = sc.nextDouble();      
    do
    {
    	char signo=' ';
    	do 
    	{
    		System.out.print("Por favor, digite la operación (+, -, *, /): ");
    		operacion = sc.next();
    		if(!operacion.isEmpty())
    			signo = operacion.charAt(0);       			
    	}while((signo != '+' && signo !='-' && signo!='*' && signo!='/') || operacion.length()!=1);
       	System.out.print("Ingrese número: ");
    	numero2 = sc.nextDouble();
    	cadena= cadena + numero1 + " " + signo + " "+ numero2;
    	switch(signo)
        {
            case '+':
            	resultado = numero1 + numero2;
            	break;
            case '-':
            	resultado = numero1 - numero2;
                 break;
            case '*':
            	resultado = numero1 * numero2;
            	break;
            case '/':
            	if(numero2==0)
            	{
            		System.out.println("no existe division para cero");
            	}else
            		resultado = numero1 / numero2;
            	break;
        }
    	numero1 = resultado;
    	cadena = cadena+ " = "+ resultado+ " | ";
        System.out.println(cadena);

        System.out.print("Presione S para salir o presione cualquier letra para continuar: ");
        String esc = sc.next();
        if(esc.isEmpty())
        	escInt = esc.charAt(0);
        
    }while(escInt != 'S' && escInt != 's');

}
}