
public class safeHause extends normalLocation {

	public safeHause(Player player) {
		super(player, "güvenli ev ");
		
	}
	public boolean getLocation() {
		 player.setSaglýk(player.getrsaglýk());
		 System.out.println("iyileþtiniz ");
		 System.out.println("güvenli evdesiniz ");
		return true;
		
	}

}
