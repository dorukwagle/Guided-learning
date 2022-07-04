/*
 * File names and extensions.
Write a program that prompts the user for the drive letter (C), the path (\
Windows\System), the file name (Readme), and the extension (txt). Then
print the complete file name C:\Windows\System\Readme.txt.
 */

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        String drive, path, fileName, extension;

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the drive letter e.g. C,D : ");
        drive = scn.nextLine();
        System.out.println("Enter the file path just upto the folder: ");
        path = scn.nextLine();
        System.out.println("Enter the filename without format: ");
        fileName = scn.nextLine();
        System.out.println("Enter the file extension: ");
        extension = scn.nextLine();
        scn.close();

        System.out.printf("%s:\\%s\\%s.%s\n", drive, path, fileName, extension);
    }
}
