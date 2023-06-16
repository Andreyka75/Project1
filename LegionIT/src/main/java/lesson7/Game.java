package lesson7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Game {

    enum GameType {
        SOCCER,
        HOCKEY,
        RUGBY
    }

    public static void writeNumOfPlayersPerTeam(GameType game) {
        String fileName = "";
        int playersNum=0;

        try {

            switch (game) {
                case SOCCER:
                    fileName = "Soccer";
                    playersNum=11;

                    break;

                case HOCKEY:
                    fileName = "Hockey";
                    playersNum=5;

                    break;

                case RUGBY:
                    fileName = "Rugby";
                    playersNum=15;
                    break;

            }
        }
        catch (Exception err) {
                System.out.println("Something bad happened");
                throw err;
            }


        File file = new File(fileName);

        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("Error:can not create new file");
            throw new RuntimeException(e);

        }

        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileName);
            fileWriter.write(String.valueOf(playersNum));
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Error:can not write");
            throw new RuntimeException(e);
        }

        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                String row = scan.nextLine();
                System.out.println(row);
            }
            scan.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        }

    }

