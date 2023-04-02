/*ItemStack superpotato = new ItemStack(Material.POTATO,3);
            ItemMeta superpotatometa = superpotato.getItemMeta();
            superpotatometa.setDisplayName(ChatColor.GREEN+""+ChatColor.BOLD+"Super potato!");
            superpotatometa.setLore(List.of("potato super power"));
            superpotato.setItemMeta(superpotatometa);
            ShapedRecipe superpotatorecipe = new ShapedRecipe(NamespacedKey.minecraft("potato"),superpotato);
            superpotatorecipe.shape("X","X","X");
            superpotatorecipe.setIngredient('X',Material.POTATO);
            Bukkit.addRecipe(superpotatorecipe);*/


package com.ks.realcraft.craft;

import com.ks.realcraft.Realcraft;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.*;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginBase;
import org.bukkit.potion.PotionData;
import org.bukkit.potion.PotionType;

import java.util.List;


public class Craft {

    public static void init(){ create_recipes(); }

    public static void create_recipes() {

        Blaze_spawn_egg();
        Enchanted_two_apple();
        Experience_bottle();

    }

    public static void Blaze_spawn_egg() {
        ShapedRecipe Blaze_spawn_egg_rec = new ShapedRecipe(NamespacedKey.minecraft("blaze_spawn_egg"),new ItemStack(Material.BLAZE_SPAWN_EGG));
        Blaze_spawn_egg_rec.shape(" X ","AAA","AAA");
        Blaze_spawn_egg_rec.setIngredient('X',Material.CARVED_PUMPKIN);
        Blaze_spawn_egg_rec.setIngredient('A',Material.BLAZE_ROD);
        Bukkit.addRecipe(Blaze_spawn_egg_rec);
    }

    public static void Enchanted_two_apple() {
        ItemStack compressed_golden_apple = new ItemStack(Material.GOLDEN_APPLE);
        ItemMeta compressed_golden_apple_meta = compressed_golden_apple.getItemMeta();
        compressed_golden_apple_meta.setDisplayName(ChatColor.GREEN+""+ChatColor.BOLD+"壓縮金蘋果");
        compressed_golden_apple_meta.setLore(List.of(ChatColor.RED+"請不要吃掉我","把我合成成附魔金蘋果吧"));
        compressed_golden_apple.setItemMeta(compressed_golden_apple_meta);
        ShapelessRecipe compressed_golden_apple_rec = new ShapelessRecipe(NamespacedKey.minecraft("compressed_golden_apple"),compressed_golden_apple);
        compressed_golden_apple_rec.addIngredient(3,Material.GOLDEN_APPLE);
        Bukkit.addRecipe(compressed_golden_apple_rec);

        //Enchanted apple
        ShapedRecipe Enchanted_golden_apple_rec = new ShapedRecipe(NamespacedKey.minecraft("enchanted_apple"), new ItemStack(Material.ENCHANTED_GOLDEN_APPLE));
        Enchanted_golden_apple_rec.shape("X","X","X");
        Enchanted_golden_apple_rec.setIngredient('X',new RecipeChoice.ExactChoice(compressed_golden_apple));
        Bukkit.addRecipe(Enchanted_golden_apple_rec);
    }

    public static void Experience_bottle() {
        FurnaceRecipe Experience_bottle_rec = new FurnaceRecipe(NamespacedKey.minecraft("experience_bottle"), new ItemStack(Material.EXPERIENCE_BOTTLE),
                Material.GLASS_BOTTLE, 0.0f, 10 * 20);
        Bukkit.addRecipe(Experience_bottle_rec);
    }




}
