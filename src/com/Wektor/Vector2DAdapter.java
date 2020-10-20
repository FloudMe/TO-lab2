package com.Wektor;

public class Vector2DAdapter implements IVector
{

    Vector2DPolarCords vector;
    public Vector2DAdapter(Vector2DPolarCords vector)
    {
        this.vector = vector;
    }

    @Override
    public double abs()
    {
        return vector.abs();
    }

    @Override
    public double[] getComponents()
    {
        return vector.getComponents();
    }

    @Override
    public double[] getAngels()
    {
        return vector.getAngels();
    }

    @Override
    public double cdot(IVector i)
    {
        return vector.cdot(i);
    }
}
