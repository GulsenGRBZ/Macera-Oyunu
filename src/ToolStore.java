
public class ToolStore extends normalLocation {

	public ToolStore(Player player) {
		super(player, "maðaza");
		
	}
	public boolean getLocation() {
		System.out.println("para :"+getPlayer().getPara());
		System.out.println("1.silahlar");
		System.out.println("2.zýrhlar");
		System.out.println("3.çýkýþ");
		System.out.println("Seçiminiz :");
		int seçim = sc.nextInt();
		int seldemId;
		
		switch(seçim) {
		case 1 :
			seldemId = silahMenu();
			silahsatýnalýmý(seldemId);
			
			break;
		case 2:
			seldemId = zýrhMenu();
			zýrhSatýnAlýmý(seldemId);
			break;
		case 3:
			break;
			default:
				break;
		}
		
		return true;
		
	}
	
	
	public int zýrhMenu() {
		System.out.println("1. hafif<engelleme = 1>|<para=15>");
		System.out.println("2. orta <engelleme = 3>|<para=25>");
		System.out.println("3. aðýr <engelleme = 5>|<para=40>");
		System.out.println("4. çýkýþ yap");
		System.out.println("zýrhýnýzý seçiniz");
		int zýrhseçimi = sc.nextInt();
		return zýrhseçimi;
	}
	public int  silahMenu() {
		System.out.println("1. tabanca <hasar =2>|<para=15> ");
		System.out.println("2. kýlýç   <hasar =3>|<para=35> ");
		System.out.println("3. tüfek   <hasar =7>|<para=45> ");
		System.out.println("4. çýkýþ yap ");
		System.out.println("silah seçiminiz :");
		int silahseçimi = sc.nextInt();
		return silahseçimi;
	}
	public void silahsatýnalýmý(int itemID) {
		int hasar=0,deðeri =0;
		String silahadý = null;
		if(itemID > 0 || itemID <4){
		switch(itemID) {
		case 1 :
			hasar =2;
			silahadý = "tabanca";
			deðeri =5;
			break;
		case 2:
			hasar =3;
			silahadý = "kýlýç";
			deðeri =35;
			break;
			
		case 3:
			hasar =7;
			silahadý = "tüfek";
			deðeri =45;
			break;
		case 4 : 
			System.out.println("çýkýþ yapýlýyor !");
			break;
	   default:
		   System.out.println("geçersiz iþlem !");
		   break;
			
		}
		if( deðeri >0) {
		if(player.getPara()>= deðeri ) {
	  player.getStok().setHasar(hasar);
	  player.getStok().setSilahAdý(silahadý);
	  player.setPara(player.getPara()-deðeri);
	  System.out.println(silahadý+"  silah satýn aldýnýz . önceki hasar : "+player.getHasar()+ "  yeni hasarýmýz ise :  "+player.getToplamhasar());
	  System.out.println("kalan bakiye :"+player.getPara());
		}
		else {
		System.out.println("bakiye yetersiz !");	
		}
		
		}
		
		}
	
	}
   public void zýrhSatýnAlýmý(int itemId) {
	   
	   int engelleme =0,deðeri =0;
		String zýrhadý = null;
		if(itemId > 0 || itemId <4){
		switch(itemId) {
		case 1 :
			engelleme=1;
			zýrhadý = "hafif";
			deðeri =15;
			break;
		case 2:
			engelleme =3;
			zýrhadý = "orta";
			deðeri =25;
			break;
			
		case 3:
			engelleme =5;
			zýrhadý = "aðýr";
			deðeri =40;
			break;
		case 4 : 
			System.out.println("çýkýþ yapýlýyor !");
			break;
	   default:
		   System.out.println("geçersiz iþlem !");
		   break;
			
		}
		if( deðeri >0) {
		if(player.getPara()> deðeri ) {
	  player.getStok().setZýrh(engelleme);
	  player.getStok().setZýrhAdý(zýrhadý);
	  player.setPara(player.getPara()-deðeri);
	  System.out.println(zýrhadý+"  zýrhý satýn aldýnýz . engellenen hasar : "+player.getStok().getZýrh() );
	  System.out.println("kalan bakiye :"+player.getPara());
		}
		else {
		System.out.println("bakiye yetersiz !");	
		}
		
		}
		
		}
		
		
	}
	}


