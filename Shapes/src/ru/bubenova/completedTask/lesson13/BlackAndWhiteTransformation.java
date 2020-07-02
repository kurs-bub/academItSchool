package ru.bubenova.completedTask.lesson13;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;


public class BlackAndWhiteTransformation {
    public static void main(String[] args) throws IOException {
        // читаем картинку из файлу image.jpg в объект класса BufferedImage
        BufferedImage image = ImageIO.read(new File("image.jpg"));

        // получаем растр - объект, внутри которого содержится двумерный массив пикселей
        WritableRaster raster = image.getRaster();

        // получаем ширину и высоту картинки
        int width = raster.getWidth();
        int height = raster.getHeight();

        final int COLORS_COUNT_IN_RGB = 3;

        // создаем массив, в котором будет содержаться текущий пиксель
        // это массив из 3 элементов, в нем по очереди лежат числа R, G, B
        int[] pixel = new int[COLORS_COUNT_IN_RGB];

        // цикл по строкам картинки
        for (int y = 0; y < height; ++y) {
            // цикл пикселям строки
            for (int x = 0; x < width; ++x) {
                // получаем текущий пиксель с координатами (x, y) - его цвета кладутся в массив pixel
                raster.getPixel(x, y, pixel);

                int result = (int)(0.3 * pixel[0] + 0.59 * pixel[1] + 0.11 * pixel[2]);

                for (int k = 0; k < COLORS_COUNT_IN_RGB; ++k) {
                    pixel[k] = result;
                }

                raster.setPixel(x, y, pixel);
            }
        }

        // сохраняем картинку в файл
        ImageIO.write(image, "png", new File("outWhiteBlack.png"));
    }
}