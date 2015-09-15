package vg.civcraft.mc.civmenu;

import org.bukkit.entity.Player;

public class CivMenuAPI {

	private static CivMenuAPI api;
	
	public CivMenuAPI() {
		api = this;
	}
	
	public static CivMenuAPI getInstance() {
		return api;
	}
	
	public void performAction(Player p, Menu menu) {
		menu.sendPlayer(p);
	}
}
