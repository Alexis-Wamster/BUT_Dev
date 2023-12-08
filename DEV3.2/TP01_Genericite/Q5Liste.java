public class Q5Liste <T>{
	private Q4Association[] liste;
	
	public Q5Liste(Q4Association[] liste){
		this.liste = liste;
	}
	
	public <T> void ajouter(T element){
		boolean flag = true;
		for (int i=0; i < this.liste.length && flag == true; i++){
			if (element.equals(this.liste[i].getElement())){
				this.liste[i].setFrequence(this.liste[i].getFrequence()+1);
				flag = false;
			}
		}
		if (flag == true){
			// new Q4Association(element, 1);
		}
	}

	@Override
	public String toString(){
		return "";
	}
}

