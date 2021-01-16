package com.assignment2.megabytesconverter;

// Assignment 2
// Name: Bagei Amoro Abdulai
// Class: Java Class A

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes < 0){
            System.out.println("Invalid Value.");
        }else{
            int  megabytes, kilobytes;
            int megToKilos = 1024;
            megabytes = kiloBytes / megToKilos;
            kilobytes = kiloBytes % megToKilos;
            System.out.println( kiloBytes + " KB = " + megabytes + " MB and " + kilobytes + " KB");
        }

    }
}
