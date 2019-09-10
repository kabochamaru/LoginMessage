package kabochamaru.LoginMessage;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class LoginMessage extends JavaPlugin implements Listener{
	public void onEnable() {
		getServer().getPluginManager().registerEvents(this, this);
		getLogger().info("プラグインが有効になりました");
	}
	@EventHandler
	public void onJoin(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		String name = player.getName();
		event.setJoinMessage("§f>>>§b[INFO]§f " + name + " が§dJoin§fしました");
	}
	@EventHandler
	public void onQuit(PlayerQuitEvent event) {
		Player player = event.getPlayer();
		String name = player.getName();
		event.setQuitMessage("§f>>>§b[INFO]§f " + name + " が§dQuit§fしました");
	}
}
