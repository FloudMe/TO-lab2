package com.Wektor;

public class Vector3DSphericalCords implements IVector
{

    private Vector3D vector3D;

    public Vector3DSphericalCords(double r, double fi, double phi)
    {
        this.vector3D = new Vector3D(r * Math.sin(phi) * r * Math.cos(fi), r * Math.sin(phi) * Math.sin(fi), r * Math.cos(phi));
    }

    @Override
    public double abs() { return vector3D.abs(); }
    @Override
    public double[] getComponents()
    {
        return vector3D.getComponents();
    }
    @Override
    public double[] getAngels()
    {
        return vector3D.getAngels();
    }
    @Override
    public double cdot(IVector i)
    {
        return vector3D.cdot(i);
    }

    public Vector3D iloczynWektorowy(IVector i)
    {
        double[] a = getComponents();
        double[] b = i.getComponents();

        return new Vector3D(( a[1] * b[2] ) - ( a[2] * b[1] ) , ( a[2] * b[0] ) - ( a[0] * b[2] ) , ( a[0] * b[1] ) - ( a[1] * b[0] ) );
    }
}
