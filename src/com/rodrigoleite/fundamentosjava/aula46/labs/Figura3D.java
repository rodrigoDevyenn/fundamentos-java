package com.rodrigoleite.fundamentosjava.aula46.labs;

public abstract class Figura3D extends FiguraGeometrica implements DimensaoSuperficial, DimensaoVolumetrica{
 
    public abstract double calcularVolume();
    public abstract double calcularArea();
    
}
