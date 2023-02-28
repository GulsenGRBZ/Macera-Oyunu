
public class ToolStore extends normalLocation {

	public ToolStore(Player player) {
		super(player, "ma�aza");
		
	}
	public boolean getLocation() {
		System.out.println("para :"+getPlayer().getPara());
		System.out.println("1.silahlar");
		System.out.println("2.z�rhlar");
		System.out.println("3.��k��");
		System.out.println("Se�iminiz :");
		int se�im = sc.nextInt();
		int seldemId;
		
		switch(se�im) {
		case 1 :
			seldemId = silahMenu();
			silahsat�nal�m�(seldemId);
			
			break;
		case 2:
			seldemId = z�rhMenu();
			z�rhSat�nAl�m�(seldemId);
			break;
		case 3:
			break;
			default:
				break;
		}
		
		return true;
		
	}
	
	
	public int z�rhMenu() {
		System.out.println("1. hafif<engelleme = 1>|<para=15>");
		System.out.println("2. orta <engelleme = 3>|<para=25>");
		System.out.println("3. a��r <engelleme = 5>|<para=40>");
		System.out.println("4. ��k�� yap");
		System.out.println("z�rh�n�z� se�iniz");
		int z�rhse�imi = sc.nextInt();
		return z�rhse�imi;
	}
	public int  silahMenu() {
		System.out.println("1. tabanca <hasar =2>|<para=15> ");
		System.out.println("2. k�l��   <hasar =3>|<para=35> ");
		System.out.println("3. t�fek   <hasar =7>|<para=45> ");
		System.out.println("4. ��k�� yap ");
		System.out.println("silah se�iminiz :");
		int silahse�imi = sc.nextInt();
		return silahse�imi;
	}
	public void silahsat�nal�m�(int itemID) {
		int hasar=0,de�eri =0;
		String silahad� = null;
		if(itemID > 0 || itemID <4){
		switch(itemID) {
		case 1 :
			hasar =2;
			silahad� = "tabanca";
			de�eri =5;
			break;
		case 2:
			hasar =3;
			silahad� = "k�l��";
			de�eri =35;
			break;
			
		case 3:
			hasar =7;
			silahad� = "t�fek";
			de�eri =45;
			break;
		case 4 : 
			System.out.println("��k�� yap�l�yor !");
			break;
	   default:
		   System.out.println("ge�ersiz i�lem !");
		   break;
			
		}
		if( de�eri >0) {
		if(player.getPara()>= de�eri ) {
	  player.getStok().setHasar(hasar);
	  player.getStok().setSilahAd�(silahad�);
	  player.setPara(player.getPara()-de�eri);
	  System.out.println(silahad�+"  silah sat�n ald�n�z . �nceki hasar : "+player.getHasar()+ "  yeni hasar�m�z ise :  "+player.getToplamhasar());
	  System.out.println("kalan bakiye :"+player.getPara());
		}
		else {
		System.out.println("bakiye yetersiz !");	
		}
		
		}
		
		}
	
	}
   public void z�rhSat�nAl�m�(int itemId) {
	   
	   int engelleme =0,de�eri =0;
		String z�rhad� = null;
		if(itemId > 0 || itemId <4){
		switch(itemId) {
		case 1 :
			engelleme=1;
			z�rhad� = "hafif";
			de�eri =15;
			break;
		case 2:
			engelleme =3;
			z�rhad� = "orta";
			de�eri =25;
			break;
			
		case 3:
			engelleme =5;
			z�rhad� = "a��r";
			de�eri =40;
			break;
		case 4 : 
			System.out.println("��k�� yap�l�yor !");
			break;
	   default:
		   System.out.println("ge�ersiz i�lem !");
		   break;
			
		}
		if( de�eri >0) {
		if(player.getPara()> de�eri ) {
	  player.getStok().setZ�rh(engelleme);
	  player.getStok().setZ�rhAd�(z�rhad�);
	  player.setPara(player.getPara()-de�eri);
	  System.out.println(z�rhad�+"  z�rh� sat�n ald�n�z . engellenen hasar : "+player.getStok().getZ�rh() );
	  System.out.println("kalan bakiye :"+player.getPara());
		}
		else {
		System.out.println("bakiye yetersiz !");	
		}
		
		}
		
		}
		
		
	}
	}


