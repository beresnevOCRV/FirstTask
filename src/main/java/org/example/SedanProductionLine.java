package org.example;

public class SedanProductionLine implements ProductionLine {
    @Override
    public void run() {
        System.out.println("Sedan built");
    }
}
