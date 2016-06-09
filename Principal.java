class Principal {
	
	public static void main(String[] args) {

		int valor = 0;
		int baseValor = Integer.parseInt(args[0]);
		int potenciaValor = Integer.parseInt(args[1]);

		Potencia pot = new Potencia();
		valor = pot.calculaPotencia(baseValor,potenciaValor);

		System.out.println(baseValor + " elevado a " + potenciaValor + ": " + valor);

	}

}