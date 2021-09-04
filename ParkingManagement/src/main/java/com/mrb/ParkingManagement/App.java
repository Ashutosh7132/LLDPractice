package com.mrb.ParkingManagement;

import java.util.Scanner;

/**
 * Parking Management Application
 *
 * @author MayurB
 *
 */
public class App 
{
	public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
        
        while(!isShutdown(sc)){
            System.out.print( "Enter N= ");
            int N = sc.nextInt(); 
            System.out.println( "Given Number is : " + N + "\n" );
           
        }
        System.out.println( "Shutting Down");
        sc.close();
    }
    
    private static boolean isShutdown(Scanner sc) {
    	System.out.println( "Please press 0 to shutdown else press any other number to continue" );
    	int T = 1;
        try { T = sc.nextInt(); }catch(Exception e) {}
        if(T == 0) {
        	return true;
        }
        return false;
    }
}
