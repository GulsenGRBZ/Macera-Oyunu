
public abstract class battleLocation extends Location {

	protected obstacle canavar ;
	protected String ödül;
	

	battleLocation(Player play,String name,obstacle canavar,String ödül ) {
		super(play);
		this.canavar = canavar;
		this.name = name;
		this.ödül=ödül;
	}
	
	public boolean getLocation () {
		int canavarsayýsý = canavar.CanavarSayýsý();
		System.out.println("þuan buadasýnýz :   "+this.getName());
		System.out.println("dikkatli olun !!!! burada "+ canavarsayýsý+"tane"+canavar.getAdý()+"yaþýyor.");
		System.out.println("<S> = savaþ  /  <K>  = kaç  ");
		String seçimi=sc.nextLine();
		seçimi = seçimi.toUpperCase();
		if (seçimi.equals("S")) {
			if(savaþ(canavarsayýsý)) {
				
				System.out.println(this.getName()+" bölgesindeki tüm düþmanlarý temizlediniz ");  
				if(this.ödül.equals("food") && player.getStok().isYiyecek()== false) {
					System.out.println(this.ödül+"kazandýnýz.");
					player.getStok().setYiyecek(true);
				}
				else if (this.ödül.equals("su") && player.getStok().isSu()== false) {
					System.out.println(this.ödül+"kazandýnýz.");
					player.getStok().setSu(true);
				}
				else if (this.ödül.equals("yakacakOdun") && player.getStok().isYakacakodun()== false) {
					System.out.println(this.ödül+"kazandýnýz.");
					player.getStok().setYakacakodun(true);
					
				}
				return true;
			}
			
			
			if(player.getSaglýk()<=0) {
				System.out.println("öldünüz !!");
				return false;
			}
			
		}
		return true;
	}
	public void oyuncuÝstatistigi() {
		System.out.println("oyuncu deðerleri \n-------------");
		System.out.println("can : "+player.getSaglýk());
		System.out.println("hasar "+ player.getToplamhasar());
		System.out.println("parasý : "+player.getPara());
		if (player.getStok().getHasar() >0) {
			System.out.println("silah ý : "+player.getStok().getSilahAdý());
		}
		if (player.getStok().getZýrh()>0) {
			System.out.println("zýrh ý : "+player.getStok().getZýrhAdý());
		}
		
	}
    public void düþmanÝstatistigi() {
		
		System.out.println(canavar.getAdý()+" Düþman deðerleri :");
		System.out.println("-------------------");
		System.out.println("can"+ canavar.getSaglýk());
		System.out.println("hasar : "+canavar.getHasar());
		System.out.println("ödüll :"+canavar.getÖdülpara());
	}

	public boolean savaþ (int canavarsayýsý ) {
		for (int i = 0; i < canavarsayýsý; i++) {
			int varsayýlanCanavarSAðlýðý = canavar.getSaglýk();
			 oyuncuÝstatistigi();
			 düþmanÝstatistigi();
			 while (player.getrsaglýk()>0 && canavar.getSaglýk()> 0) {
				 System.out.println("<V> = vur || <K> = kaç ");
				 String seçim = sc.nextLine();
				 seçim =seçim.toUpperCase();
				 if ( seçim.equals("V")) {
					 System.out.println("canavara vurdunuz !!");
					 canavar.setSaglýk(canavar.getSaglýk()- player.getToplamhasar());
					 vuruþtanSonra();
					 if (canavar.getSaglýk() >0) {
						 System.out.println("canavar size vurdu");
						 System.out.println();
						 player.setSaglýk(player.getSaglýk()-(canavar.getHasar()-player.getStok().getZýrh()));
						 
						 vuruþtanSonra();
					 }
					
				 }
				 else {
					 return false;
				 } 
			 }
			 if(canavar.getSaglýk()< player.getSaglýk()) {
				 System.out.println(" düþmaný yendiniz !!");
				 player.setPara(player.getPara()+canavar.getÖdülpara());
				 System.out.println("güncel paranýz : "+player.getPara());
				 canavar.setSaglýk(varsayýlanCanavarSAðlýðý);
				 // return true;
			 }
			 else {
				 return false;
			 }
			
			 
			 System.out.println("--------------------");
		}
		return true;
	}
	public void vuruþtanSonra() {
		System.out.println("oyuncu caný :"+player.getSaglýk());
		 System.out.println(canavar.getAdý()+" canavarýnýn caný :"+canavar.getSaglýk());
		
	}

	
	


}
