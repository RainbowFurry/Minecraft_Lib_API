package net.rainbowfurry.minecraftLib.manager;

import org.bukkit.entity.Player;

import java.net.HttpURLConnection;
import java.net.URL;

public class PremiumCheck {

    public boolean isPlayerPremium(Player player) {

        try {
            URL url = new URL(
                    "https://api.mojang.com/users/profiles/minecraft/" + player.getName());

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");
            return connection.getResponseCode() == 200;

        } catch (Exception e) {
            return false;
        }

    }

}
