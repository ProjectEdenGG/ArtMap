package me.Fupery.ArtMap.HelpMenu;

import me.Fupery.ArtMap.Utils.Lang;
import me.Fupery.InventoryMenu.API.InventoryMenu;
import me.Fupery.InventoryMenu.API.MenuButton;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.inventory.InventoryType;

import static me.Fupery.ArtMap.Utils.Lang.Array.*;

public class ToolMenu extends InventoryMenu {
    protected ToolMenu(InventoryMenu parent) {
        super(parent, ChatColor.DARK_BLUE + Lang.MENU_TOOLS.rawMessage(), InventoryType.HOPPER);
        addButtons(generateButtons());
    }

    private MenuButton[] generateButtons() {
        MenuButton[] buttons = new MenuButton[5];
        buttons[0] = new MenuButton.LinkedButton(new DyeMenu(this), Material.INK_SACK, TOOL_DYE.messages());
        buttons[0].setDurability((short) 1);
        buttons[0] = new MenuButton.StaticButton(Material.SIGN, Lang.Array.INFO_TOOLS.messages());
        buttons[1] = new MenuButton.StaticButton(Material.BUCKET, TOOL_PAINTBUCKET.messages());
        buttons[2] = new MenuButton.StaticButton(Material.COAL, TOOL_COAL.messages());
        buttons[3] = new MenuButton.StaticButton(Material.FEATHER, TOOL_FEATHER.messages());
        buttons[4] = new MenuButton.StaticButton(Material.COMPASS, TOOL_COMPASS.messages());
        return buttons;
    }
}
