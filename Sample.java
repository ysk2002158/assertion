package com.example;

public class Sample {

	public static String getColor(int rgb) {
		switch (rgb) {
		case 1:
			return "��";
		case 2:
			// �{���́u�΁v
			return "��";
		case 3:
			return "��";
		}
		throw new IllegalArgumentException();
	}
}