package com.Wektor;

public class Vector2D implements IVector
{
    private double x;
    private double y;

    public Vector2D(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    @Override
    public double abs()
    {
        return Math.sqrt( Math.pow(x, 2) + Math.pow(y, 2) );
    }

    @Override
    public double[] getComponents()
    {
        return new double[]{x, y};
    }

    @Override
    public double[] getAngels()
    {
        double r = Math.sqrt( abs() ), phi = 0;

        if(x != 0  && r != 0)
            phi = Math.atan(y/x);

        return new double[]{r, phi};
    }

    @Override
    public double cdot(IVector i)
    {
        double[] tab = i.getComponents();
        return ( x * tab[0] ) + ( y * tab[1] );
    }
}
