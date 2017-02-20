package com.helloWorld.drawFlag;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        /* The exercise -> draw this:

            * * * * * * ==================================
             * * * * *  ==================================
            * * * * * * ==================================
             * * * * *  ==================================
            * * * * * * ==================================
             * * * * *  ==================================
            * * * * * * ==================================
             * * * * *  ==================================
            * * * * * * ==================================
            ==============================================
            ==============================================
            ==============================================
            ==============================================
            ==============================================
            ==============================================
        */
        //drawOneByOne();
        DrawWithPolymorphism();
    }

    private static void DrawWithPolymorphism() {
        ArrayList<IDrawer> drawers = new ArrayList<>();
        drawers.add(new UglyDrawer());
        drawers.add(new ArrayDrawer());
        drawers.add(new SexyDrawer());

        for (IDrawer drawer:drawers) {
            System.out.println("\n" + drawer.getClass().getSimpleName() + " does this:");
            drawer.draw();
            System.out.println("done");
        }
    }

    private static void drawOneByOne() {
        System.out.println("UglyDrawer does this:");
        new UglyDrawer().draw();

        System.out.println("\nArrayDrawer does this:");
        new ArrayDrawer().draw();

        System.out.println("\nSexyDrawer does this:");
        new SexyDrawer().draw();
    }
}