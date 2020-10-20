package com.Wektor;

public class Vector3D extends Vector2D implements IVector
{
    private double z;

    public Vector3D(double x, double y, double z)
    {
        super(x, y);
        this.z = z;
    }

    @Override
    public double abs()
    {
        double[] tab = super.getComponents();
        return Math.sqrt( Math.pow(tab[0], 2) + Math.pow(tab[1], 2) + Math.pow(z, 2) );
    }

    @Override
    public double[] getComponents()
    {
        double[] tab = super.getComponents();
        return new double[]{tab[0], tab[1], z};
    }

    @Override
    public double[] getAngels()
    {
        double r = abs(), fi = Math.atan( super.abs() / z ), phi = super.getAngels()[1];
        return new double[]{r, fi, phi};

    }

    @Override
    public double cdot(IVector i) // iloczyn skalarny
    {
        double[] tab = super.getComponents(), tab2 = i.getComponents();
        return ( tab[0]* tab2[0] ) + ( tab[1] * tab2[1] ) + ( z * tab2[2] );
    }

    public Vector3D iloczynWektorowy(IVector i)
    {
        double[] a = super.getComponents();
        double[] b = i.getComponents();

        return new Vector3D(( a[1] * b[2] ) - ( z * b[1] ) , ( z * b[0] ) - ( a[0] * b[2] ) , ( a[0] * b[1] ) - ( a[1] * b[0] ) );
    }
}
