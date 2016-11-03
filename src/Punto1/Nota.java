
import java.util.HashMap;
import punto1.Personal;

public class Nota {

	public Personal persona;
	private String nota;
	
	public Nota(Personal persona, String nota){
		this.persona = persona;
		this.nota = nota;
	}

	public Personal getPersona() {
		return persona;
	}

	public void setPersona(Personal persona) {
		this.persona = persona;
	}

	public String getNota() {
		return nota;
	}

	public void setNota(String nota) {
		this.nota = nota;
	}
	
	
	
}
