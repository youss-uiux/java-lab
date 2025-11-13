package com.javalab.mainapp;

import com.javalab.core.utils.Logger;
import com.javalab.demos.lombokdemo.LombokDemo;

import java.util.Scanner;

/**
 * Application principale pour lancer les démonstrations du Java Lab
 */
public class MainApp {
    
    public static void main(String[] args) {
        Logger.info("Bienvenue dans Java Lab!");
        Logger.info("Laboratoire pour tester diverses fonctionnalités Java");
        
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        
        while (running) {
            displayMenu();
            
            String choice = scanner.nextLine().trim();
            
            switch (choice) {
                case "1":
                    runLombokDemo();
                    break;
                case "0":
                    Logger.info("Au revoir!");
                    running = false;
                    break;
                default:
                    Logger.error("Option invalide. Veuillez réessayer.");
            }
            
            if (running) {
                System.out.println("\nAppuyez sur Entrée pour continuer...");
                scanner.nextLine();
            }
        }
        
        scanner.close();
    }
    
    private static void displayMenu() {
        System.out.println("\n" + "=".repeat(50));
        System.out.println("MENU PRINCIPAL - Java Lab");
        System.out.println("=".repeat(50));
        System.out.println("1. Démonstration Lombok");
        System.out.println("0. Quitter");
        System.out.println("=".repeat(50));
        System.out.print("Choisissez une option: ");
    }
    
    private static void runLombokDemo() {
        try {
            LombokDemo demo = new LombokDemo();
            demo.run();
        } catch (Exception e) {
            Logger.error("Erreur lors de l'exécution de la démo Lombok: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
