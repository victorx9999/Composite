package composite;

public class Individuo implements ParticipanteComposite {
	private String name;
	private String assento;

	public Individuo(String name, String assento) {
		this.name = name;
		this.assento = assento;
	}

	public String getAssento() {
		return assento;
	}
}
