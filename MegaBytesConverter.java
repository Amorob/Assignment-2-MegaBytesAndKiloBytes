package com.assignment2.megabytesconverter;

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
