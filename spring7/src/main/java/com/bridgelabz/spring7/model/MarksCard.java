package com.bridgelabz.spring7.model;

public class MarksCard {

	 private int english;
	 private int kannada;
	 private int sanskrit;
	 private int maths;
	 private int science;
	 private int social;
	 
	 public MarksCard(int english,int kannada,int sanskrit,int maths,int science ,int social)
	 {
		 this.english=english;
		 this.kannada=kannada;
		 this.sanskrit=sanskrit;
		 this.maths=maths;
		 this.science=science;
		 this.social=social;
		 
		 
	 }
	 
	 public String toString()
	 {
		 return ("marks is  english: "+english+" Kannada: "+kannada+" sanskrit: "+sanskrit+" maths: "+maths+" science: "+science+" social"+ social);
		 
	 }
	 
	 
	
}
