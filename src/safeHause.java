
public class safeHause extends normalLocation {

	public safeHause(Player player) {
		super(player, "g�venli ev ");
		
	}
	public boolean getLocation() {
		 player.setSagl�k(player.getrsagl�k());
		 System.out.println("iyile�tiniz ");
		 System.out.println("g�venli evdesiniz ");
		return true;
		
	}

}
