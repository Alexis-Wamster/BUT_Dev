package fr.iutfbleau.wamster.dev31.tp4.q1;

import java.net.*;

public class Q1Model{
    public static final String CHEMIN = "res/";
	public static final ClassLoader LOADER = Thread.currentThread().getContextClassLoader();
	public static final String EXTENSION = ".png";
    public int numImg;
    public final URL [] TabImg;
	
    public Q1Model(){
        this.numImg = 0;
		int numImage,i;
		this.TabImg = new URL[100];
		for (numImage=0, i=0; i<10000; i+=100, numImage++){
			this.TabImg[numImage] = this.LOADER.getResource(this.CHEMIN + Q1Model.add0(i)+ this.EXTENSION);
		}
    }


    public URL next() {
        this.numImg++;
        if (this.numImg >= this.TabImg.length){
            this.numImg = 0;
        }
        return this.TabImg[this.numImg];

    }
    public URL previous() {
        this.numImg--;
        if (this.numImg < 0){
            this.numImg = this.TabImg.length -1;
        }
        return this.TabImg[this.numImg];
    }

    public URL current() {
        return this.TabImg[this.numImg];
    }

    public static String add0(int number){
	int zeroAAjouter = 7 - Integer.toString(number).length();
	String resultat = "";
	for (int i=0; i < zeroAAjouter; i++){
	    resultat += "0";
	}
	resultat += Integer.toString(number);
	return resultat;
    }
}
