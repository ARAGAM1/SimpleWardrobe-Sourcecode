package de.ProgrammiererNoob.SW;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin implements Listener {
	
	public Inventory inv = null;

	public void onEnable(){
		System.out.println("[SimpleWardrobe] Made by ProgrammiererNoob");
		System.out.println("[SimpleWardrobe] http://youtube.com/programmierernoobde");
		Bukkit.getServer().getPluginManager().registerEvents(this, this);
		}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p = (Player) sender;
		if(cmd.getName().equalsIgnoreCase("wardrobe")) {
			if(args.length == 1) {
				if(args[0].equalsIgnoreCase("reload")) {
					// Reload (Soon)
					return true;
				}
			} else {
				if (args.length != 1) {
					inv = p.getServer().createInventory(null, 36, "Choose your outfit");
					
					ItemStack hat2 = new ItemStack(Material.LEATHER_HELMET);
					LeatherArmorMeta meta2 = (LeatherArmorMeta) hat2.getItemMeta();
					meta2.setDisplayName(ChatColor.BLACK + "Black Hat");
					meta2.setColor(Color.BLACK);
					hat2.setItemMeta(meta2);
					inv.setItem(2, hat2);
					
					ItemStack hat3 = new ItemStack(Material.LEATHER_HELMET);
					LeatherArmorMeta meta3 = (LeatherArmorMeta) hat3.getItemMeta();
					meta3.setDisplayName(ChatColor.WHITE + "White Hat");
					meta3.setColor(Color.WHITE);
					hat3.setItemMeta(meta3);
					inv.setItem(3, hat3);
					
					ItemStack hat4 = new ItemStack(Material.LEATHER_HELMET);
					LeatherArmorMeta meta4 = (LeatherArmorMeta) hat4.getItemMeta();
					meta4.setDisplayName(ChatColor.RED + "Red Hat");
					meta4.setColor(Color.RED);
					hat4.setItemMeta(meta4);
					inv.setItem(4, hat4);
					
					ItemStack hat5 = new ItemStack(Material.LEATHER_HELMET);
					LeatherArmorMeta meta5 = (LeatherArmorMeta) hat5.getItemMeta();
					meta5.setDisplayName(ChatColor.GREEN + "Green Hat");
					meta5.setColor(Color.GREEN);
					hat5.setItemMeta(meta5);
					inv.setItem(5, hat5);
					
					ItemStack hat6 = new ItemStack(Material.LEATHER_HELMET);
					LeatherArmorMeta meta6 = (LeatherArmorMeta) hat6.getItemMeta();
					meta6.setDisplayName(ChatColor.BLUE + "Blue Hat");
					meta6.setColor(Color.BLUE);
					hat6.setItemMeta(meta6);
					inv.setItem(6, hat6);
					
					ItemStack shirt3 = new ItemStack(Material.LEATHER_CHESTPLATE);
					LeatherArmorMeta shirt3m = (LeatherArmorMeta) shirt3.getItemMeta();
					shirt3m.setDisplayName(ChatColor.BLACK + "Black Shirt");
					shirt3m.setColor(Color.BLACK);
					shirt3.setItemMeta(shirt3m);
					inv.setItem(11, shirt3);
					
					ItemStack shirt4 = new ItemStack(Material.LEATHER_CHESTPLATE);
					LeatherArmorMeta shirt4m = (LeatherArmorMeta) shirt4.getItemMeta();
					shirt4m.setDisplayName(ChatColor.WHITE + "White Shirt");
					shirt4m.setColor(Color.WHITE);
					shirt4.setItemMeta(shirt4m);
					inv.setItem(12, shirt4);
					
					ItemStack shirt5 = new ItemStack(Material.LEATHER_CHESTPLATE);
					LeatherArmorMeta shirt5m = (LeatherArmorMeta) shirt5.getItemMeta();
					shirt5m.setDisplayName(ChatColor.RED + "Red Shirt");
					shirt5m.setColor(Color.RED);
					shirt5.setItemMeta(shirt5m);
					inv.setItem(13, shirt5);
					
					ItemStack shirt6 = new ItemStack(Material.LEATHER_CHESTPLATE);
					LeatherArmorMeta shirt6m = (LeatherArmorMeta) shirt6.getItemMeta();
					shirt6m.setDisplayName(ChatColor.GREEN + "Green Shirt");
					shirt6m.setColor(Color.GREEN);
					shirt6.setItemMeta(shirt6m);
					inv.setItem(14, shirt6);
					
					ItemStack shirt7 = new ItemStack(Material.LEATHER_CHESTPLATE);
					LeatherArmorMeta shirt7m = (LeatherArmorMeta) shirt7.getItemMeta();
					shirt7m.setDisplayName(ChatColor.BLUE + "Blue Shirt");
					shirt7m.setColor(Color.BLUE);
					shirt7.setItemMeta(shirt7m);
					inv.setItem(15, shirt7);
					
					ItemStack leggings4 = new ItemStack(Material.LEATHER_LEGGINGS);
					LeatherArmorMeta leggings4m = (LeatherArmorMeta) leggings4.getItemMeta();
					leggings4m.setDisplayName(ChatColor.BLACK + "Black Leggings");
					leggings4m.setColor(Color.BLACK);
					leggings4.setItemMeta(leggings4m);
					inv.setItem(20, leggings4);
					
					ItemStack leggings5 = new ItemStack(Material.LEATHER_LEGGINGS);
					LeatherArmorMeta leggings5m = (LeatherArmorMeta) leggings5.getItemMeta();
					leggings5m.setDisplayName(ChatColor.WHITE + "White Leggings");
					leggings5m.setColor(Color.WHITE);
					leggings5.setItemMeta(leggings5m);
					inv.setItem(21, leggings5);
					
					ItemStack leggings6 = new ItemStack(Material.LEATHER_LEGGINGS);
					LeatherArmorMeta leggings6m = (LeatherArmorMeta) leggings6.getItemMeta();
					leggings6m.setDisplayName(ChatColor.RED + "Red Leggings");
					leggings6m.setColor(Color.RED);
					leggings6.setItemMeta(leggings6m);
					inv.setItem(22, leggings6);
					
					ItemStack leggings7 = new ItemStack(Material.LEATHER_LEGGINGS);
					LeatherArmorMeta leggings7m = (LeatherArmorMeta) leggings7.getItemMeta();
					leggings7m.setDisplayName(ChatColor.GREEN + "Green Leggings");
					leggings7m.setColor(Color.GREEN);
					leggings7.setItemMeta(leggings7m);
					inv.setItem(23, leggings7);
					
					ItemStack leggings8 = new ItemStack(Material.LEATHER_LEGGINGS);
					LeatherArmorMeta leggings8m = (LeatherArmorMeta) leggings8.getItemMeta();
					leggings8m.setDisplayName(ChatColor.BLUE + "Blue Leggings");
					leggings8m.setColor(Color.BLUE);
					leggings8.setItemMeta(leggings8m);
					inv.setItem(24, leggings8);
					
					ItemStack boots8 = new ItemStack(Material.LEATHER_BOOTS);
					LeatherArmorMeta boots8m = (LeatherArmorMeta) boots8.getItemMeta();
					boots8m.setDisplayName(ChatColor.BLACK + "Black Boots");
					boots8m.setColor(Color.BLACK);
					boots8.setItemMeta(boots8m);
					inv.setItem(29, boots8);
					
					ItemStack boots9 = new ItemStack(Material.LEATHER_BOOTS);
					LeatherArmorMeta boots9m = (LeatherArmorMeta) boots9.getItemMeta();
					boots9m.setDisplayName(ChatColor.WHITE + "White Boots");
					boots9m.setColor(Color.WHITE);
					boots9.setItemMeta(boots9m);
					inv.setItem(30, boots9);
					
					ItemStack boots10 = new ItemStack(Material.LEATHER_BOOTS);
					LeatherArmorMeta boots10m = (LeatherArmorMeta) boots10.getItemMeta();
					boots10m.setDisplayName(ChatColor.RED + "Red Boots");
					boots10m.setColor(Color.RED);
					boots10.setItemMeta(boots10m);
					inv.setItem(31, boots10);
					
					ItemStack boots11 = new ItemStack(Material.LEATHER_BOOTS);
					LeatherArmorMeta boots11m = (LeatherArmorMeta) boots11.getItemMeta();
					boots11m.setDisplayName(ChatColor.GREEN + "Green Boots");
					boots11m.setColor(Color.GREEN);
					boots11.setItemMeta(boots11m);
					inv.setItem(32, boots11);
					
					ItemStack boots12 = new ItemStack(Material.LEATHER_BOOTS);
					LeatherArmorMeta boots12m = (LeatherArmorMeta) boots12.getItemMeta();
					boots12m.setDisplayName(ChatColor.BLUE + "Blue Boots");
					boots12m.setColor(Color.BLUE);
					boots12.setItemMeta(boots12m);
					inv.setItem(33, boots12);
										
					p.openInventory(inv);
					return true;
				}
			
			}
		}
		return false;
	}
	
	
	@EventHandler(priority = EventPriority.HIGHEST)
	public void Item(PlayerInteractEvent e) {
		if(e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK) {
			if(e.getMaterial() == Material.CHAINMAIL_CHESTPLATE) {
				Player p = (Player) e.getPlayer();
				if(p.hasPermission("wardrobe.use")) {
					p.performCommand("wardrobe");
			}
		}
	}
}
	
		
}
