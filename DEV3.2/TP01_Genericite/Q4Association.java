public class Q4Association <T>{
	private T element;
	private int frequence;
	//private ??????????????????????????????????????????????????????????? suivant;
	
	public Q4Association(T element, int frequence){
		this.element = element;
		this.frequence =frequence;
	}
	public T getElement(){
		return this.element;
	}
	public void setElement(T element){
		this.element = element;
	}
	public int getFrequence(){
		return this.frequence;
	}
	public void setFrequence(int frequence){
		this.frequence = frequence;
	}
	@Override
	public String toString(){
		return "element = " + this.getElement().toString() + " ; frequence = " + this.getFrequence();
	}
}

