package com.senac.algoritmos;

import java.util.Scanner;

import com.senac.estruturas.PilhaCheia;
import com.senac.estruturas.PilhaOperador;
import com.senac.estruturas.PilhaVazia;

public class AvaliadorRPN {
	public static double avalia (String expressao) throws PilhaCheia, PilhaVazia, InvalidOperator
	{	
		PilhaOperador pilha = new PilhaOperador(50);
		
		Scanner sc = new Scanner(expressao);
		
		while (sc.hasNext()) {
			if (sc.hasNextInt()) {
				pilha.push(sc.nextInt());
			} else {
				String op = sc.next();
				double rhs = pilha.pop();
				double lhs = pilha.pop();
				pilha.push( executaOperador(op.charAt(0), lhs, rhs) );
			}
		}
		
		return pilha.pop();
	}

	private static double executaOperador(char op, double lhs, double rhs) throws InvalidOperator
	{
		switch (op) {
			case '+': return lhs + rhs;
			case '-': return lhs - rhs;
			case '*': return lhs * rhs;
			case '/': return lhs / rhs;
			default: throw new InvalidOperator(op);
		}
	}
}
