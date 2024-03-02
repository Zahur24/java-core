package com.learning.core.day1;

public class D01P02 {
	public static void main(String[]args)
	{
		Tablet i1 = new Tablet();
		Syrup i2 = new Syrup();
		Ointment i3 = new Ointment();
		MedicineInfo z1 = i1;
		MedicineInfo z2 = i2;
		MedicineInfo z3 = i3;
		z1.displayLabel();
		z2.displayLabel();
		z3.displayLabel();
	}
}
