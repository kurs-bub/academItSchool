package ru.bubenova.completedTask.lesson12;

public class Url {
    public static void main(String[] args) {
        String url1 = "https://SomeServerName/abcd/dfdf.htm?dfdf=dfdf";
        String url2 = "http://SomeServerName/abcd/dfdf.htm?dfdf=dfdf";
        String url3 = "http://SomeServerName";

        String serverName1 = getServerName(url1);
        String serverName2 = getServerName(url2);
        String serverName3 = getServerName(url3);

        System.out.println(serverName1);
        System.out.println(serverName2);
        System.out.println(serverName3);
    }

    public static String getServerName(String url) {
        int startIndex = url.indexOf("://") + 3;
        int endIndex = url.indexOf("/", startIndex);

        if (endIndex > 0) {
            return url.substring(startIndex, endIndex);
        }

        return url.substring(startIndex);
    }
}