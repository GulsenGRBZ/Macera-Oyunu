import java.util.Scanner;

public class Player {
	private String karakter,oyuncuAd�;
	private int hasar,sagl�k,para,rsagl�k;
	Inventory stok ;
	public Player (String ad) {
		this.oyuncuAd� = ad;
		this.stok=new Inventory();
	}
	public void karakterSe�imi() {
	switch(menu()) {
	case 1 : 
		se�im ("samuray",5,21,15);
		break;
	case 2 : 
		se�im("ok�u",7,18,20);
		break;
		
	case 3 : 
		se�im("�ovalye",8,24,5);
		break;
		
	default :
		se�im ("samuray",5,21,15);
		break;
	}
	System.out.println( " karakter : " +getKarakter()+"  hasar : "+getHasar()+" sagl�k :  "
	+getSagl�k()+" para :  "+getPara());
	
	}
	
	public int menu() {
		Scanner sc = new Scanner(System.in);
		
	    System.out.println("1- karakter : samuray |hasar : 5 |sa�l�k: 21  |para: 15  | ");
		System.out.println("2- karakter : ok�u    |hasar : 7 |sa�l�k: 18  |para: 20  | ");
		System.out.println("3- karakter : �ovalye |hasar : 8 |sa�l�k: 24  |para: 5   | ");
		System.out.println("karakter se�iminizi yap�m�z :");
		
		 int Se�im = sc.nextInt();
		System.out.println("Se�iminiz :"+ Se�im);

		while (Se�im <0 || Se�im > 3  ) {
			
		System.out.println("ge�erli bir krakter se�imi yapmal�s�n�z !!!");
		 menu();
		Se�im = sc.nextInt();
		   }
		 return Se�im;
   }

	
	public void  se�im(String karakter ,int hsr, int sglk ,int pr) {
		setKarakter( karakter );
		setHasar(hsr);
		setSagl�k(sglk);
		setPara(pr);
		setrsagl�k(sglk);
	}
	public int getToplamhasar() {
		return this.getHasar()+ this.getStok().getHasar();
	}

	
	public int getHasar() {
		return hasar;
	}
	public void setHasar(int hasar) {
		this.hasar = hasar;
	}
	public int getSagl�k() {
		return sagl�k;
	}
	public void setSagl�k(int sagl�k) {
		this.sagl�k = sagl�k;
	}
	public int getPara() {
		return para;
	}
	public void setPara(int para) {
		this.para = para;
	}
	public String getKarakter() {
		return karakter;
	}
	public void setKarakter(String karakter) {
		this.karakter = karakter;
	}
	public String getOyuncuAd�() {
		return oyuncuAd�;
	}
	public void setOyuncuAd�(String oyuncuAd�) {
		this.oyuncuAd� = oyuncuAd�;
	}
	public int getrsagl�k() {
		return rsagl�k;
	}
	public void setrsagl�k(int rsagl�k) {
		this.rsagl�k = rsagl�k;
	}
	public Inventory getStok() {
		return stok;
	}
	
	
	

}
