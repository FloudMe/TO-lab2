package com.Wektor;

public class Vector2DPolarCords {

    private double r;
    private double phi;

    public Vector2DPolarCords(double r, double phi)
    {
        this.r = r;
        this.phi = phi;
    }

    public double[] getComponents()
    {
        double x = r * Math.cos(phi), y = r * Math.sin(phi);
        return new double[]{x, y};
    }

    public double[] getAngels()
    {
        return new double[]{r, phi};
    }

    public double abs()
    {
        double[] tab = getComponents();
        return Math.sqrt( Math.pow(tab[0], 2) + Math.pow(tab[1], 2) );
    }

    public double cdot(IVector i)
    {
        double[] cords = getComponents();
        double[] tab = i.getComponents();
        return ( cords[0] * tab[0] ) + ( cords[1] * tab[1] );
    }

}
