package org.example;

public class CoupeProductionLine  implements  ProductionLine {
    @Override
    public void run() {
        System.out.println("Coupe built");
    }
}
