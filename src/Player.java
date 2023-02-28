import java.util.Scanner;

public class Player {
	private String karakter,oyuncuAdı;
	private int hasar,saglık,para,rsaglık;
	Inventory stok ;
	public Player (String ad) {
		this.oyuncuAdı = ad;
		this.stok=new Inventory();
	}
	public void karakterSeçimi() {
	switch(menu()) {
	case 1 : 
		seçim ("samuray",5,21,15);
		break;
	case 2 : 
		seçim("okçu",7,18,20);
		break;
		
	case 3 : 
		seçim("şovalye",8,24,5);
		break;
		
	default :
		seçim ("samuray",5,21,15);
		break;
	}
	System.out.println( " karakter : " +getKarakter()+"  hasar : "+getHasar()+" saglık :  "
	+getSaglık()+" para :  "+getPara());
	
	}
	
	public int menu() {
		Scanner sc = new Scanner(System.in);
		
	    System.out.println("1- karakter : samuray |hasar : 5 |sağlık: 21  |para: 15  | ");
		System.out.println("2- karakter : okçu    |hasar : 7 |sağlık: 18  |para: 20  | ");
		System.out.println("3- karakter : şovalye |hasar : 8 |sağlık: 24  |para: 5   | ");
		System.out.println("karakter seçiminizi yapımız :");
		
		 int Seçim = sc.nextInt();
		System.out.println("Seçiminiz :"+ Seçim);

		while (Seçim <0 || Seçim > 3  ) {
			
		System.out.println("geçerli bir krakter seçimi yapmalısınız !!!");
		 menu();
		Seçim = sc.nextInt();
		   }
		 return Seçim;
   }

	
	public void  seçim(String karakter ,int hsr, int sglk ,int pr) {
		setKarakter( karakter );
		setHasar(hsr);
		setSaglık(sglk);
		setPara(pr);
		setrsaglık(sglk);
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
	public int getSaglık() {
		return saglık;
	}
	public void setSaglık(int saglık) {
		this.saglık = saglık;
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
	public String getOyuncuAdı() {
		return oyuncuAdı;
	}
	public void setOyuncuAdı(String oyuncuAdı) {
		this.oyuncuAdı = oyuncuAdı;
	}
	public int getrsaglık() {
		return rsaglık;
	}
	public void setrsaglık(int rsaglık) {
		this.rsaglık = rsaglık;
	}
	public Inventory getStok() {
		return stok;
	}
	
	
	

}
