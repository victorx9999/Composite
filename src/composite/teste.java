package composite;

public class teste {
	public static void main(String[] args) {
		
		Individuo victor = new Individuo("Victor", "A1");
		Individuo jailson = new Individuo("Jailson", "J2");
		
		Instituicao ifpb = new Instituicao("IF");
		
		Congresso iftech = new Congresso("IFTECH");
		
		ifpb.addParticipante(victor);
		iftech.addParticipante(victor);
		iftech.addParticipante(ifpb);
		
		iftech.totalAssentos();
		iftech.totalParticipantes();
		
	}
}
