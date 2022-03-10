package Exercicio2;

public class Executar {

	public static void main(String[] args) {
		
		Cachorro c = new Cachorro();
		c.setSom(c.getsom()+" AuAu...");
		Cavalo cav = new Cavalo();
		cav.setSom(cav.getsom()+" Hehehuhull...");
		Preguica p = new Preguica();
		p.setSom(p.getsom()+" Aaahh...");
		
		Animal[] animais = new Animal[3];
		animais[0] = c;
		animais[1] = cav;
		animais[2] = p;
		
		for(Animal animal:animais)
		{
			System.out.println(animal.getSom());
		}
	}

}
