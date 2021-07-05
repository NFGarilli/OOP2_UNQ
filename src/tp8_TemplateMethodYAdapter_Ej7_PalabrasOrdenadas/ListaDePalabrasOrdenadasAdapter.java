package tp8_TemplateMethodYAdapter_Ej7_PalabrasOrdenadas;

import javax.swing.DefaultListModel;



@SuppressWarnings("serial")
public class ListaDePalabrasOrdenadasAdapter extends DefaultListModel<String>{
	

	private ListaDePalabrasOrdenadas listaOrdenada;
	
	public ListaDePalabrasOrdenadasAdapter(ListaDePalabrasOrdenadas listaOrdenada) {
		super();
		this.setListaOrdenada(listaOrdenada);
	}
	
	@Override
	public void addElement(String element) {
		listaOrdenada.agregarPalabra(element);
	}

	public ListaDePalabrasOrdenadas getListaOrdenada() {
		return listaOrdenada;
	}

	public void setListaOrdenada(ListaDePalabrasOrdenadas listaOrdenada) {
		this.listaOrdenada = listaOrdenada;
	}
}