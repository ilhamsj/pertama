package net.skripsweet.pertama;
import java.util.Random;

/**
 * Created by ilham on 28/03/2018.
 */

public class kumpulanFakta {

    private String[] kumpulan_fakta = {
            "Flutter adalah Framework Cross platfrom terbaru",
            "Swift untuk build IOS App",
            "Flutter vs React",
            "android studio adalah IDE bukan bahasa pemrograman"
    };

    public String getFakta() {
        String fakta = "";

        //memilih fakta scara cak
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(kumpulan_fakta.length);

        //ammbil nilai fakta dari array
        fakta = kumpulan_fakta[randomNumber];
        return fakta;
    }
}
