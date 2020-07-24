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

        // создаем копию изображения, изменять будем его, беря значения из исходной картинки
        BufferedImage tempImage = new BufferedImage(image.getWidth(), image.getHeight(), image.getType());

        // получаем растр из скопированной картинки - объект, внутри которого содержится двумерный массив пикселей
        WritableRaster tempRaster = tempImage.getRaster();

        // просим пользователя определить степень размытия
        Scanner scanner = new Scanner(System.in);

        int matrixSize;
        int minMatrixSize = 3;

        for (; ; ) {
            System.out.println("Введите коэффициент размытия: ");
            matrixSize = scanner.nextInt();

            if (matrixSize >= minMatrixSize && matrixSize % 2 != 0) {
                break;
            }

            System.out.println("Коэффициент должен быть нечетным, а также он должен быть больше или равен " + minMatrixSize);
        }

        // создаем матрицу свертки определенного размера в виде массива, заполняем массив коэффициентом размытия
        double blurCoefficient = (double) 1 / (matrixSize * matrixSize);
        double[][] blurMatrix = new double[matrixSize][matrixSize];

        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                blurMatrix[j][i] = blurCoefficient;
            }
        }

        // создаем массив, в котором будет содержаться текущий пиксель
        final int COLORS_COUNT_IN_RGB = 3;
        double[] pixel = new double[COLORS_COUNT_IN_RGB];

        // создаем рамку вокруг изображения, заливаем ее цветом (rgb:0)
        int frameSize = matrixSize / 2;

        for (int j = frameSize; j < height - frameSize; ++j) {
            for (int i = frameSize; i < width - frameSize; ++i) {
                pixel[0] = 0;
                pixel[1] = 0;
                pixel[2] = 0;

                // находим значения r, g, b внутри рамки
                int[] insideFramePixel = new int[COLORS_COUNT_IN_RGB];

                for (int k = j - frameSize; k <= j + frameSize; k++) {
                    for (int m = i - frameSize; m <= i + frameSize; m++) {
                        // получаем текущий пиксель с координатами (m, k) - его цвета кладутся в массив insideFramePixels
                        raster.getPixel(m, k, insideFramePixel);
                        pixel[0] += insideFramePixel[0] * blurMatrix[m - i + frameSize][k - j + frameSize];
                        pixel[1] += insideFramePixel[1] * blurMatrix[m - i + frameSize][k - j + frameSize];
                        pixel[2] += insideFramePixel[2] * blurMatrix[m - i + frameSize][k - j + frameSize];
                    }
                }

                // Контролируем переполнение переменных
                for (int k = 0; k < 3; k++) {
                    if (pixel[k] < 0) {
                        pixel[k] = 0;
                    } else if (pixel[k] > 255) {
                        pixel[k] = 255;
                    }
                }

                // записываем текущий пиксель с координатами (i, j) - его цвета кладутся в массив pixel
                tempRaster.setPixel(i, j, pixel);
            }
        }

        // сохрняем промежуточную картинку в конечный файл
        ImageIO.write(tempImage, "png", new File("out.png"));

        System.out.println("Полученное изображение вы найдете в корневой папке.");
    }
}