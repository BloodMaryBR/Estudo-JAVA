package oo.abstrato;

public abstract class Mamifero extends Animal {
	@Override
	public String mover() {
		// TODO Auto-generated method stub
		return "Usando as patas" ;
		
		
	}
	public  final String mamar() {
		return "Usando leite";
	} ;
}
