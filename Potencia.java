class Potencia {

	int valorTotal = 1;
	
	public int calculaPotencia(int base, int potencia) {

		if (potencia != 0) {
			valorTotal = valorTotal * base;
			calculaPotencia(base, potencia - 1);
		}

		return valorTotal;

	}

}