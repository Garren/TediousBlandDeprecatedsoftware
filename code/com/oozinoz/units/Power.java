package com.oozinoz.units;

/*
 * Copyright (c) 2001 Steven J. Metsker.
 * 
 * Steve Metsker makes no representations or warranties about
 * the fitness of this software for any particular purpose, 
 * including the implied warranty of merchantability.
 *
 * Please use this software as you wish with the sole
 * restriction that you may not claim that you wrote it.
 */
 
/**
 * This class is a particular type of measure with the
 * dimension of power.
 *
 * @author Steve Metsker
 * @see Acceleration
 */
public class Power extends Measure 
{
/**
 * Create a measure of power with the given magnitude, noting
 * that this is an MKS system. 
 *
 * @param magnitude the magnitude of this power in
 *                  an MKS system
 */
public Power(double magnitude)
{
	super(magnitude, POWER);
}
}