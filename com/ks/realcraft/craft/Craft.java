/*
 ItemStack potion = new ItemStack(Material.POTION);
 PotionMeta meta = (PotionMeta) potion.getItemMeta();
 meta.setBasePotionData(new PotionData(PotionType.FIRE_RESISTANCE, true, false));
 potion.setItemMeta(meta);
*/


package com.ks.realcraft.craft;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.*;
import org.bukkit.inventory.meta.ItemMeta;


import java.util.List;


public class Craft {

    public static void init(){ create_recipes(); }

    public static void create_recipes() { //sl = shapeless

        Axolotl_bucket(); //1.0.0_pre-alpha_3 = sl
        Blaze_spawn_egg();  //1.0.0_pre-alpha_2
        Cod_bucket(); //1.0.0_pre-alpha_3 = sl
        Enchanted_two_apple(); //1.0.0_pre-alpha_2 -> changed 1.0.0_pre-alpha_3 = sl*
        Experience_bottle(); //1.0.0_pre-alpha_2
        Lava_stone_bucket(); //1.0.0_pre-alpha_3 = sl
        Pufferfish_bucket(); //1.0.0_pre-alpha_3 = sl

    }

    public static void Axolotl_bucket() {
        ShapelessRecipe axolotl_bucket_rec = new ShapelessRecipe(NamespacedKey.minecraft("axolotl_bucket"), new ItemStack(Material.AXOLOTL_BUCKET));
        axolotl_bucket_rec.addIngredient(Material.AXOLOTL_SPAWN_EGG);
        axolotl_bucket_rec.addIngredient(Material.BUCKET);
        Bukkit.addRecipe(axolotl_bucket_rec);
    }

    public static void Blaze_spawn_egg() {
        ShapedRecipe Blaze_spawn_egg_rec = new ShapedRecipe(NamespacedKey.minecraft("blaze_spawn_egg"),new ItemStack(Material.BLAZE_SPAWN_EGG));
        Blaze_spawn_egg_rec.shape(" X ","AAA","AAA");
        Blaze_spawn_egg_rec.setIngredient('X',Material.CARVED_PUMPKIN);
        Blaze_spawn_egg_rec.setIngredient('A',Material.BLAZE_ROD);
        Bukkit.addRecipe(Blaze_spawn_egg_rec);
    }

    public static void Cod_bucket() {
        ShapelessRecipe cod_bucket_rec = new ShapelessRecipe(NamespacedKey.minecraft("cod_bucket"), new ItemStack(Material.COD_BUCKET));
        cod_bucket_rec.addIngredient(Material.COD_SPAWN_EGG);
        cod_bucket_rec.addIngredient(Material.BUCKET);
        Bukkit.addRecipe(cod_bucket_rec);
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
        Enchanted_golden_apple_rec.shape("XXX"); //changed 1.0.0_pre-alpha_3
        Enchanted_golden_apple_rec.setIngredient('X',new RecipeChoice.ExactChoice(compressed_golden_apple));
        Bukkit.addRecipe(Enchanted_golden_apple_rec);
    }

    public static void Experience_bottle() {
        FurnaceRecipe Experience_bottle_rec = new FurnaceRecipe(NamespacedKey.minecraft("experience_bottle"), new ItemStack(Material.EXPERIENCE_BOTTLE),
                Material.GLASS_BOTTLE, 0.0f, 10 * 20);
        Bukkit.addRecipe(Experience_bottle_rec);
    }

    public static void Lava_stone_bucket() {
        ItemStack stone_bucket = new ItemStack(Material.BUCKET);
        ItemMeta stone_bucket_meta = stone_bucket.getItemMeta();
        stone_bucket_meta.setDisplayName(ChatColor.GREEN+""+ChatColor.BOLD+"石頭桶");
        stone_bucket_meta.setLore(List.of(ChatColor.LIGHT_PURPLE+"裝著石頭的桶子","聽說拿去熔爐燒就會變成熔岩喔","記得是熔爐不是高爐"));
        stone_bucket.setItemMeta(stone_bucket_meta);
        ShapelessRecipe stone_bucket_rec = new ShapelessRecipe(NamespacedKey.minecraft("stone_bucket"),stone_bucket);
        stone_bucket_rec.addIngredient( Material.STONE);
        stone_bucket_rec.addIngredient(Material.BUCKET);
        Bukkit.addRecipe(stone_bucket_rec);

        //lava
        FurnaceRecipe lava_bucket_rec = new FurnaceRecipe(NamespacedKey.minecraft("lava_bucket"), new ItemStack(Material.LAVA_BUCKET),
                new RecipeChoice.ExactChoice(stone_bucket), 50.0f, 60*20);
        Bukkit.addRecipe(lava_bucket_rec);
        //wrong use

        ItemStack failed_lava = new ItemStack(Material.RAW_IRON,2);
        ItemMeta failed_lava_meta = failed_lava.getItemMeta();
        failed_lava_meta.setDisplayName(ChatColor.DARK_GRAY+""+ChatColor.BOLD+"廢鐵");
        failed_lava_meta.setLore(List.of(ChatColor.RED+"你不小心用錯爐子","桶子融化造成熔煉失敗","現在只剩這堆廢鐵"));
        failed_lava.setItemMeta(failed_lava_meta);
        BlastingRecipe lava_failed_rec = new BlastingRecipe(NamespacedKey.minecraft("lava_failed"), failed_lava,
                new RecipeChoice.ExactChoice(stone_bucket), 1.0f, 10*20);
        Bukkit.addRecipe(lava_failed_rec);
    }

    public static void Pufferfish_bucket() {
        ShapelessRecipe pufferfish_bucket_rec = new ShapelessRecipe(NamespacedKey.minecraft("pufferfish_bucket"), new ItemStack(Material.PUFFERFISH_BUCKET));
        pufferfish_bucket_rec.addIngredient(Material.PUFFERFISH_SPAWN_EGG);
        pufferfish_bucket_rec.addIngredient(Material.BUCKET);
        Bukkit.addRecipe(pufferfish_bucket_rec);
    }

}
