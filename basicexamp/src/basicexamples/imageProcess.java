package basicexamples;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by asus1 on 12.10.2017.
 */
public class imageProcess {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("C:/Users/asus1/Desktop/android.jpg");
        BufferedImage image = ImageIO.read(fis);

        int r = 0, g = 0, b = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        int key = 1;

        for (int y = 0; y < image.getHeight(); y++) {
            for (int x = 0; x < image.getWidth(); x++) {

                int piksel = image.getRGB(x,y);
                r= (piksel >> 16) & 0x000000FF;
                g =(piksel >> 8) & 0x000000FF;
                b =(piksel) & 0x000000FF;

                System.out.println(r +" "+ g + " "+ b + " ");

                hashMap.put(key, (r + g + b));
                key++;
            }
        }
        Set set1 = hashMap.entrySet();
        Iterator iterator = set1.iterator();
        while (iterator.hasNext()) {
            Map.Entry mapEntry = (Map.Entry) iterator.next();

         //   System.out.print(mapEntry.getKey() + ": ");

         //   System.out.println(mapEntry.getValue());
        }
    }
}   /*   Color c = new Color(image.getRGB(x, y));
                r = c.getRed();
                g = c.getGreen();
                b = c.getBlue();
*/