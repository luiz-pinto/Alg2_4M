package com.senac;

import com.senac.algoritmos.AvaliadorRPN;

import static java.lang.System.*;

public class Planilha {
	public static void main(String[] args) throws Exception {
		out.println( AvaliadorRPN.avalia("2 3 4 + *") );
	}
}
