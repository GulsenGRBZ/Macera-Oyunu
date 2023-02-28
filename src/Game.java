import java.util.Scanner;

public class Game {
	Player player;
	Location konum;
	Scanner sc = new Scanner(System.in);
	
	public void login() {
		Scanner sc = new Scanner(System.in);
		System.out.println("macera oyununa ho� geldinizi!!");
		System.out.println(" ad�n�z� giriniz : ");
		String  oyuncununAd� = sc.nextLine();
	   player = new Player ( oyuncununAd�);
		player.karakterSe�imi();
		Start();
	}
	public void Start() {
		while(true) {
			System.out.println();
			System.out.println("*******************************************");
			System.out.println();
		    System.out.println("1- g�venli ev --> size ait g�venli mekan");
		    System.out.println("2- ma�ara --> kar��n�za zombiler ��kabilir.");
		    System.out.println("3- orman  --> kar��n�za vampirler ��kabilir.");
		    System.out.println("4- nehir  --> kar��n�za ay�lar ��kabilir.");
		    System.out.println("5- ma�aza --> ihitya�lar�n�z� kar��layabilirsiniz .");
		    System.out.println("gitmek istediiniz yeri giriniz.");
		    int konumSe�imim = sc.nextInt();
		    while(konumSe�imim<0 || konumSe�imim > 5) {
		    	System.out.println("l�tfen ge�erli bir onum giriniz :");
		    	 konumSe�imim = sc.nextInt();
		    }
		    switch(konumSe�imim) {
		    case 1 :
		    	konum = new safeHause(player);
		    	break;
		    case 2 :
		    	konum = new Cave (player);
		    	break;
		    case 3:
		    	konum = new Forest(player);
		    	break;
		    case 4 :
		    	konum = new River(player);
		    	break;
		    case 5 :
		    	konum = new ToolStore(player);
		    	break;
		     default :
		    	 konum = new safeHause(player);
			   
		    } 
		    if ( konum.getClass().getName().equals("safeHouse")) {
		    	if ( player.getStok().isYiyecek()&& player.getStok().isSu()&& player.getStok().isYakacakodun()) {
		    		System.out.println("tebrikler oyunu kazand�n�z !!");
		    		break;
		    	}
		    }
			
		    if(!konum.getLocation()) {
		    	System.out.println("oyun bittii!!!!");
		    	break;
		    }
		
		}
		
	}
	}


