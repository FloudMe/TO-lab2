package com.Wektor;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        //System.out.println("first");
        Vector3D w = new Vector3D(2, 4, 5);
        Vector3D v = new Vector3D(2,4,6);

        System.out.println(w.cdot(v));
//        w.getAngels();
//        double[] tab = w.getComponents(), t = v.getComponents();
//        System.out.println(tab[0] + " " + tab[1]  + " " + Arrays.toString(t));
    }
}
