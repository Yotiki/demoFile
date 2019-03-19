package com.example.demo;


import java.io.*;
import java.util.*;

public class FileDemo {


    public static void main(String[] args) {

        final String FINAL = "0";

        String firstLevel = "1";
        Level level = null;
        String choiceId = null;
        String choiceKeyboard;

        do {
            boolean validOption = false;
            level = getLine(null == level ? firstLevel : choiceId);
            final String ESC = "\033[";
            System.out.print(ESC + "2J");
            System.out.flush();
            System.out.println(level);
            System.out.println(readAscII(level.getId()).getTextSmile());
            System.out.println(Arrays.toString(level.getNextLevel().toArray()));/*
            for (Option nextLevel : level.getNextLevel()) {
                System.out.println(nextLevel.getText());
            }*/
            Scanner scannerChoice = new Scanner(System.in);
            choiceKeyboard = scannerChoice.nextLine();
            for (Option option : level.getNextLevel()) {
                if (option.getText().equals(choiceKeyboard)) {
                    validOption = true;
                    choiceId = option.getId();
                }
            }
            if (!validOption) {
                choiceId = "1";
                continue;
            }
        } while (!FINAL.equals(choiceId));

        System.out.println("COMPRA EL DLC CTM!!!!!");

        //writeLine("leva culiao");

        //readAscII();
        //Base64.getEncoder().
    }

    private static Level getLine(String idLevel) {

        Level level = null;
        try (Scanner scanner = new Scanner(Thread.currentThread().getContextClassLoader().getResourceAsStream("asdasd2.txt"))) {

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] values = line.split(";");

                level = new Level();
                level.setId(values[0]);
                level.setName(values[1]);
                //level.setDescription(values[2]);
                List nextLevels = new ArrayList();
                for (int i = 2; i < values.length; i++) {
                    String[] option = values[i].split(",");
                    nextLevels.add(new Option(option[1], option[0]));
                }

                level.setNextLevel(nextLevels);

                if (level.getId().equals(idLevel))
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return level;
    }

    private static void writeLine(String text) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\Documents\\asd123.txt"))) {
            bw.write(text);
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private static Smile readAscII(String id) {

        try (Scanner scanner = new Scanner(Thread.currentThread().getContextClassLoader().getResourceAsStream("asd123.txt")).useDelimiter("\\+nextline\\+")) {
            int count = 1;
            while (scanner.hasNext()) {

                String values[] = scanner.next().split(";");

                Smile smile = new Smile();
                smile.setId(values[0].trim());
                smile.setTextSmile(values[1].trim());

                /*System.out.println("El id del smile es: " + smile.getId());
                System.out.println("Smile: ");
                System.out.println(smile.getTextSmile());*/
                if (id.equals(smile.getId())){
                    return smile;
                }
                //System.out.println(count++ + " " + scanner.next().replace("\\n", System.getProperty("line.separator")));
            }
            return null;

        }


    }

}
