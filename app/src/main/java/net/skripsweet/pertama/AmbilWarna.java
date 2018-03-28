package net.skripsweet.pertama;
import android.graphics.Color;

import java.util.Random;

/**
 * Created by ilham on 28/03/2018.
 */

public class AmbilWarna {
    private String[] mWarna = {
            "#e74c3c",
            "#e67e22",
            "#f1c40f",
            "#2ecc71",
            "#2c3e50",
            "#8e44ad",
            "#7f8c8d",
            "#16a085",
            "#27ae60"
    };

    public int getWarna() {
        String warna = "";

        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mWarna.length);

        warna = mWarna[randomNumber];
        int colorSebagaiInt = Color.parseColor(warna);

        return colorSebagaiInt;
    }
}
