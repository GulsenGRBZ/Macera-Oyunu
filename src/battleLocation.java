
public abstract class battleLocation extends Location {

	protected obstacle canavar ;
	protected String �d�l;
	

	battleLocation(Player play,String name,obstacle canavar,String �d�l ) {
		super(play);
		this.canavar = canavar;
		this.name = name;
		this.�d�l=�d�l;
	}
	
	public boolean getLocation () {
		int canavarsay�s� = canavar.CanavarSay�s�();
		System.out.println("�uan buadas�n�z :   "+this.getName());
		System.out.println("dikkatli olun !!!! burada "+ canavarsay�s�+"tane"+canavar.getAd�()+"ya��yor.");
		System.out.println("<S> = sava�  /  <K>  = ka�  ");
		String se�imi=sc.nextLine();
		se�imi = se�imi.toUpperCase();
		if (se�imi.equals("S")) {
			if(sava�(canavarsay�s�)) {
				
				System.out.println(this.getName()+" b�lgesindeki t�m d��manlar� temizlediniz ");  
				if(this.�d�l.equals("food") && player.getStok().isYiyecek()== false) {
					System.out.println(this.�d�l+"kazand�n�z.");
					player.getStok().setYiyecek(true);
				}
				else if (this.�d�l.equals("su") && player.getStok().isSu()== false) {
					System.out.println(this.�d�l+"kazand�n�z.");
					player.getStok().setSu(true);
				}
				else if (this.�d�l.equals("yakacakOdun") && player.getStok().isYakacakodun()== false) {
					System.out.println(this.�d�l+"kazand�n�z.");
					player.getStok().setYakacakodun(true);
					
				}
				return true;
			}
			
			
			if(player.getSagl�k()<=0) {
				System.out.println("�ld�n�z !!");
				return false;
			}
			
		}
		return true;
	}
	public void oyuncu�statistigi() {
		System.out.println("oyuncu de�erleri \n-------------");
		System.out.println("can : "+player.getSagl�k());
		System.out.println("hasar "+ player.getToplamhasar());
		System.out.println("paras� : "+player.getPara());
		if (player.getStok().getHasar() >0) {
			System.out.println("silah � : "+player.getStok().getSilahAd�());
		}
		if (player.getStok().getZ�rh()>0) {
			System.out.println("z�rh � : "+player.getStok().getZ�rhAd�());
		}
		
	}
    public void d��man�statistigi() {
		
		System.out.println(canavar.getAd�()+" D��man de�erleri :");
		System.out.println("-------------------");
		System.out.println("can"+ canavar.getSagl�k());
		System.out.println("hasar : "+canavar.getHasar());
		System.out.println("�d�ll :"+canavar.get�d�lpara());
	}

	public boolean sava� (int canavarsay�s� ) {
		for (int i = 0; i < canavarsay�s�; i++) {
			int varsay�lanCanavarSA�l��� = canavar.getSagl�k();
			 oyuncu�statistigi();
			 d��man�statistigi();
			 while (player.getrsagl�k()>0 && canavar.getSagl�k()> 0) {
				 System.out.println("<V> = vur || <K> = ka� ");
				 String se�im = sc.nextLine();
				 se�im =se�im.toUpperCase();
				 if ( se�im.equals("V")) {
					 System.out.println("canavara vurdunuz !!");
					 canavar.setSagl�k(canavar.getSagl�k()- player.getToplamhasar());
					 vuru�tanSonra();
					 if (canavar.getSagl�k() >0) {
						 System.out.println("canavar size vurdu");
						 System.out.println();
						 player.setSagl�k(player.getSagl�k()-(canavar.getHasar()-player.getStok().getZ�rh()));
						 
						 vuru�tanSonra();
					 }
					
				 }
				 else {
					 return false;
				 } 
			 }
			 if(canavar.getSagl�k()< player.getSagl�k()) {
				 System.out.println(" d��man� yendiniz !!");
				 player.setPara(player.getPara()+canavar.get�d�lpara());
				 System.out.println("g�ncel paran�z : "+player.getPara());
				 canavar.setSagl�k(varsay�lanCanavarSA�l���);
				 // return true;
			 }
			 else {
				 return false;
			 }
			
			 
			 System.out.println("--------------------");
		}
		return true;
	}
	public void vuru�tanSonra() {
		System.out.println("oyuncu can� :"+player.getSagl�k());
		 System.out.println(canavar.getAd�()+" canavar�n�n can� :"+canavar.getSagl�k());
		
	}

	
	


}
