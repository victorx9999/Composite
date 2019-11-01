package composite;

import java.util.ArrayList;
import java.util.List;

public class Instituicao implements ParticipanteComposite{
	private String name;
	private ArrayList<ParticipanteComposite> lista = new ArrayList<ParticipanteComposite>();
	
	public Instituicao(String name) {
		this.name = name;
	}
	
	public ArrayList<ParticipanteComposite> getMembros() {
		return lista;
	}
	
	public void addParticipante(ParticipanteComposite participante) {
		lista.add(participante);
	}
	
	public void removeParticipante(ParticipanteComposite participante) {
		lista.remove(participante);
	}

}
