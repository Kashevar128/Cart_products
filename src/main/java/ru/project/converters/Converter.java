package ru.project.converters;

public class Converter {

    public static long converterId(String objStr) {
        try{
            return Long.parseLong(objStr);
        } catch (Exception e) {
            System.out.println(e);
            return -1;
        }
    }
}
