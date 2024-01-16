import java.lang.*; 

private class Mobile 
{
	
	//--- atributs ---// 
	
	//entier de 0 a 255 pas possible d utiliser un byte car (-128…127)
	public char posX;
	public char posY;
	
	//réelles de 4 octet 
	public float vitesseX;
	public float vitesseY;	
	
	public boolean vehicule; //true = existe false = n'existe pas
	 
	 
	//---- méthodes ----//
	
	public void Mobile(char caratére, byte val_entiere) //constructeur
	{
		
	}
	
	private float ChoixVitesse() // accessible uniquement par cette class 
	{
		
	}
	
	public boolean Run() // renvoit True ou False si la methode a fonctionner
	{
		
	}	
}
	
	
	