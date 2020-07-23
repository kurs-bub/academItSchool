package ru.bubenova.inProgressTask;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class ImageBlur {
    public static void main(String[] args) throws IOException {
        // читаем картинку из файлу image.jpg в объект класса BufferedImage
        BufferedImage image = ImageIO.read(new File("image.jpg"));

        // получаем растр - объект, внутри которого содержится двумерный массив пикселей
        WritableRaster raster = image.getRaster();

        // получаем ширину и высоту картинки
        int width = raster.getWidth();
        int height = raster.getHeight();

        // просим пользователя определить степень размытия
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите коэффициент размытия: ");
        int blurCoeficient = scanner.nextInt();





        ImageIO.write(image, "png", new File("blur.png"));
    }
}