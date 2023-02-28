import java.util.Scanner;

public class Game {
	Player player;
	Location konum;
	Scanner sc = new Scanner(System.in);
	
	public void login() {
		Scanner sc = new Scanner(System.in);
		System.out.println("macera oyununa hoþ geldinizi!!");
		System.out.println(" adýnýzý giriniz : ");
		String  oyuncununAdý = sc.nextLine();
	   player = new Player ( oyuncununAdý);
		player.karakterSeçimi();
		Start();
	}
	public void Start() {
		while(true) {
			System.out.println();
			System.out.println("*******************************************");
			System.out.println();
		    System.out.println("1- güvenli ev --> size ait güvenli mekan");
		    System.out.println("2- maðara --> karþýnýza zombiler çýkabilir.");
		    System.out.println("3- orman  --> karþýnýza vampirler çýkabilir.");
		    System.out.println("4- nehir  --> karþýnýza ayýlar çýkabilir.");
		    System.out.println("5- maðaza --> ihityaçlarýnýzý karþýlayabilirsiniz .");
		    System.out.println("gitmek istediiniz yeri giriniz.");
		    int konumSeçimim = sc.nextInt();
		    while(konumSeçimim<0 || konumSeçimim > 5) {
		    	System.out.println("lütfen geçerli bir onum giriniz :");
		    	 konumSeçimim = sc.nextInt();
		    }
		    switch(konumSeçimim) {
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
		    		System.out.println("tebrikler oyunu kazandýnýz !!");
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


