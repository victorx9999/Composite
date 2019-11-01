package composite;

import java.util.ArrayList;
import java.util.List;

public class Congresso implements ParticipanteComposite{
	private String name;
	private ArrayList<ParticipanteComposite> lista = new ArrayList<ParticipanteComposite>();

	public Congresso(String name) {
		this.name = name;
	}

	public void totalParticipantes() {
		int countIndividuo = 0;
		int countInstituicao = 0;
		for (ParticipanteComposite item : lista) {
			if (item instanceof Instituicao)
				countInstituicao++;
			else if (item instanceof Individuo)
				countIndividuo++;
		}
		System.out.println("Instituicoes: " + countInstituicao + " | Indivíduos: " + countIndividuo + " | Total: "
				+ (countIndividuo + countInstituicao));
	}

	public void totalAssentos() {
		int assentos = 0;
		for (ParticipanteComposite item : lista) {
			if (item instanceof Instituicao) {
				assentos += ( (Instituicao) item).getMembros().size();
			}
			else if (item instanceof Individuo)
				assentos++;
		}
		System.out.println("Total de assentos: " + assentos);
	}
	
	public void addParticipante(ParticipanteComposite participante) {
		lista.add(participante);
	}
	
	public void removeParticipante(ParticipanteComposite participante) {
		lista.remove(participante);
	}


}
