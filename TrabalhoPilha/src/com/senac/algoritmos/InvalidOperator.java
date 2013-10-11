package com.senac.algoritmos;

public class InvalidOperator extends Exception {
	public InvalidOperator(char op)
	{
		super(String.format("Operador invalido: %c",op));
	}
}
