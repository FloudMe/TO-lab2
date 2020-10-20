package com.Wektor;

public abstract class Vector3DAbstract implements IVector {

    private IVector vector;

    public Vector3DAbstract(IVector newVector)
    {
        vector = newVector;
    }

    public double abs() { return vector.abs(); }
    public double[] getComponents()
    {
        return vector.getComponents();
    }
    public double[] getAngels()
    {
        return vector.getAngels();
    }
    public double cdot(IVector i)
    {
        return vector.cdot(i);
    }
}
