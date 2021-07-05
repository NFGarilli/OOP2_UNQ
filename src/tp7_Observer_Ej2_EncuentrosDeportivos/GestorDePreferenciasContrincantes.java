package tp7_Observer_Ej2_EncuentrosDeportivos;

import java.util.List;

public class GestorDePreferenciasContrincantes extends GestorDePreferenciasDeDeportes {
	
	List<String>	preferenciasContrincantes;

	public GestorDePreferenciasContrincantes (Observer observer) {
		super(observer);
	}
	
	@Override
	public Boolean estaInteresado(ResultadoPartido partido) {
		return this.estaInteresadoEnDeporte(partido.getDeporte()) || this.estaInteresadoEnContrincante(partido.getContrincantes());
	}

	private boolean estaInteresadoEnContrincante(List<String> contrincantes) {
		
		return this.preferenciasContrincantes.stream().anyMatch(contrincante -> contrincantes.contains(contrincante));
	}


	@Override
	public void setInteresEnContrincante(String contrincante) {
		this.preferenciasContrincantes.add(contrincante);
		
	}

	@Override
	public void removeInteresEnContrincante(String contrincante) {
		this.preferenciasContrincantes.remove(contrincante);
	}
S
	
	
	
	
}
