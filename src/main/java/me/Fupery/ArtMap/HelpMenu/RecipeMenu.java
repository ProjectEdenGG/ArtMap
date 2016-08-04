package me.Fupery.ArtMap.HelpMenu;

import me.Fupery.ArtMap.Recipe.ArtMaterial;
import me.Fupery.ArtMap.Utils.Lang;
import me.Fupery.ArtMap.Utils.Preview;
import me.Fupery.InventoryMenu.API.InventoryMenu;
import me.Fupery.InventoryMenu.API.MenuButton;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.List;

public class RecipeMenu extends InventoryMenu {

    public RecipeMenu(InventoryMenu parent) {
        super(parent, ChatColor.DARK_BLUE + Lang.MENU_RECIPE.rawMessage(), InventoryType.HOPPER);
        addButtons(generateButtons(this));
    }

    private static MenuButton[] generateButtons(InventoryMenu menu) {
        MenuButton[] buttons = new MenuButton[5];
        buttons[0] = new MenuButton.StaticButton(Material.SIGN, Lang.Array.INFO_RECIPES.messages());
        buttons[1] = new RecipeButton(ArtMaterial.EASEL);
        buttons[2] = new RecipeButton(ArtMaterial.CANVAS);
        buttons[3] = new RecipeButton(ArtMaterial.PAINT_BUCKET);
        buttons[4] = new MenuButton.CloseButton(menu, Lang.BUTTON_CLOSE.rawMessage());
        return buttons;
    }

    public static Inventory recipePreview(Player player, ArtMaterial recipe) {
        ItemStack[] ingredients = recipe.getPreview();

        Inventory inventory = Bukkit.createInventory(player, InventoryType.WORKBENCH,
                String.format(Lang.RECIPE_HEADER.rawMessage(),
                        recipe.name().toLowerCase()));

        for (int i = 0; i < ingredients.length; i++) {
            inventory.setItem(i + 1, ingredients[i]);
        }
        inventory.setItem(0, recipe.getItem());
        return inventory;
    }

    private static class RecipeButton extends MenuButton {

        final ArtMaterial recipe;

        public RecipeButton(ArtMaterial recipe) {
            super(recipe.getItem().getType());
            this.recipe = recipe;
            ItemMeta meta = recipe.getItem().getItemMeta();
            List<String> lore = meta.getLore();
            lore.set(lore.size() - 1, ChatColor.GREEN + Lang.RECIPE_BUTTON.rawMessage());// TODO: 3/08/2016 ADMIN FUNCTION
            meta.setLore(lore);
            setItemMeta(meta);
        }

        @Override
        public void onClick(JavaPlugin javaPlugin, Player player) {

            if (player.hasPermission("artmap.admin")) {
                ItemStack leftOver = player.getInventory().addItem(recipe.getItem()).get(0);

                if (leftOver != null) {
                    player.getWorld().dropItemNaturally(player.getLocation(), leftOver);
                }

            } else {
                player.closeInventory();
                Preview.inventory(player, recipePreview(player, recipe));
                player.updateInventory();
            }
        }
    }
}
