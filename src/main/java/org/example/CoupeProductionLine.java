package org.example;

public class CoupeProductionLine  implements  ProductionLine {
    @Override
    public void work() {
        System.out.println("Coupe built");
    }
}
