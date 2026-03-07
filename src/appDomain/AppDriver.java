package appDomain;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import shapes.*; 
import utilities.*;


public class AppDriver {

    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "";
        String compareType = "";
        String sortAlgorithm = "";

        for (String s : args) {
            s = s.toLowerCase();
            
        	if (s.startsWith("-f")) fileName = s.substring(2);
            else if (s.startsWith("-t")) compareType = s.substring(2);
            else if (s.startsWith("-s")) sortAlgorithm = s.substring(2);
        }

        if (fileName.isEmpty() || compareType.isEmpty() || sortAlgorithm.isEmpty()) {
            System.out.println("Usage Error: Please provide -f[file], -t[type], and -s[sort].");
            return;
        }

        File file = new File(fileName);
        Scanner sc = new Scanner(file);
        int total = sc.nextInt();
        Shape[] myShapes = new Shape[total];

        for (int i = 0; i < total; i++) {
            String type = sc.next();
            double h = sc.nextDouble();
            double s = sc.nextDouble();
         
            switch(type) {
                case "Cylinder": myShapes[i] = new Cylinder(h, s); break;
                case "Cone": myShapes[i] = new Cone(h, s); break;
                case "Pyramid": myShapes[i] = new Pyramid(h, s); break;
                case "SquarePrism": myShapes[i] = new SquarePrism(h, s); break;
                case "TriangularPrism": myShapes[i] = new TriangularPrism(h, s); break;
                case "PentagonalPrism": myShapes[i] = new PentagonalPrism(h, s); break;
                case "OctagonalPrism": myShapes[i] = new OctagonalPrism(h, s); break;
            }
        }
        sc.close();

        java.util.Comparator<Shape> comp = null;
        if (compareType.equals("v")) comp = new VolumeComparator();
        else if (compareType.equals("a")) comp = new AreaComparator();
     
        long start = System.currentTimeMillis();

        switch (sortAlgorithm.toLowerCase()) {
            case "b": BubbleSort.bubbleSort(myShapes, comp); break;
            case "s": SelectionSort.selectionSort(myShapes, comp); break;
            case "i": InsertionSort.insertionSort(myShapes, comp); break;
            case "m": MergeSort.sort(myShapes, comp); break;
            case "q": QuickSort.quickSort(myShapes, comp); break;
            case "z": ShellSort.shellSort(myShapes, comp); break;
            default: System.out.println("Invalid sort algorithm"); return;
        }

        long end = System.currentTimeMillis();
        System.out.println("Sort run time: " + (end - start) + " ms");
        System.out.println("First element is: " + myShapes[0]);

        for (int i = 1000; i < myShapes.length; i += 1000) {
            System.out.println(i + "-th element: " + myShapes[i]);
        }
        System.out.println("Last element is: " + myShapes[myShapes.length - 1]);
    }
}
