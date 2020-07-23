package ru.bubenova.inProgressTask;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class ImageBlur {
    public static void main(String[] args) throws IOException {
 /*       // читаем картинку из файлу image.jpg в объект класса BufferedImage
        BufferedImage image = ImageIO.read(new File("image.jpg"));

        // получаем растр - объект, внутри которого содержится двумерный массив пикселей
        WritableRaster raster = image.getRaster();

        // получаем ширину и высоту картинки
        int width = raster.getWidth();
        int height = raster.getHeight();

        //создаем копию изображения, изменять будем его, беря значения из исходной картинки
        BufferedImage tempImage = new BufferedImage(image.getWidth(), image.getHeight(), image.getType());

        // получаем растр из скопированной картинки - объект, внутри которого содержится двумерный массив пикселей
        WritableRaster tempRaster = tempImage.getRaster();
*/
        // просим пользователя определить степень размытия
        Scanner scanner = new Scanner(System.in);

        int blurCoefficient;
        int minBlurCoefficient = 3;

        for (; ; ) {
            System.out.println("Введите коэффициент размытия: ");
            blurCoefficient = scanner.nextInt();

            if (blurCoefficient > minBlurCoefficient || blurCoefficient % 2 != 0) {
                break;
            }

            System.out.println("Коэффициент должен быть 1) нечетным; 2) больше или равен " + minBlurCoefficient);
        }

        System.out.println(blurCoefficient);






       // ImageIO.write(image, "png", new File("blur.png"));
    }
}