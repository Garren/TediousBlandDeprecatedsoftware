package com.oozinoz.applications;

//import com.sun.java.swing.*;
import java.awt.Graphics;

import javax.swing.JPanel;

import com.oozinoz.ballistics.BallisticsFunction;

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
 * Plot a ballistics function. This class's name contains
 * an underscore--a hint that this class is a candidate for
 * refactoring.
 * 
 * @author Steven J. Metsker
 */
public class BallisticsPanel_1 extends JPanel 
{
protected void paintComponent(Graphics g)
{
	super.paintComponent(g); // paint the background
	for (int i = 0; i < nPoint; i++)
	{
		double t = ((double) i) / (nPoint - 1);
		x[i] = (int) (t * getWidth());
		y[i] =
			(int) (getHeight() * (1 - func.function(t, tPeak)));
	}
	g.drawPolyline(x, y, nPoint);
}

	protected BallisticsFunction func;
	protected int nPoint = 101;
	protected double tPeak = 0.0;
	protected int[] x = new int[nPoint];
	protected int[] y = new int[nPoint];

/**
 * Create a panel that can display the provided function.
 *
 * @param func the ballistics function to plot. Ballistics
 *             functions vary with time and with the time
 *             of peak burn area.
 */
public BallisticsPanel_1(BallisticsFunction func)
{
	this.func = func;
}

/**
 * Set the time at which the peak burn area is reached.
 *
 * @param tPeak the time at which the peak burn area is 
 *              reached
 */
public void setTPeak(double tPeak)
{
	this.tPeak = tPeak;
	repaint();
}
}