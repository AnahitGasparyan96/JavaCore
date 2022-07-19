package homework.file;

import java.io.*;
import java.util.Scanner;

public class FileUtil {

    private static Scanner scanner = new Scanner(System.in);
    static String path = "C:\\Users\\Anahit\\IdeaProjects\\JavaCore";

    public static void main(String[] args) throws IOException {
//        fileSearch();
//        contentSearch();
//        findLines();
//        printSizeOfPackage();
        createFileWithContent();
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - fileName - ֆայլի անունը, որը փնտրում ենք։
    //Որպես արդյունք պտի ծրագիրը տպի true եթե կա էդ ֆայլը էդ պապկի մեջ, false եթե չկա։
    static void fileSearch() {
        System.out.println("Please input folder name");
        String foldername = scanner.nextLine();
        System.out.println("Please input file name");
        String fileName = scanner.nextLine();
        File file = new File(path);
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File file1 : files) {

                if (file1.getName().equals(foldername)) {
                    file = new File(foldername);
                    if (file.isDirectory()) {
                        File[] innerPac = file.listFiles();
                        for (File file2 : innerPac) {

                            if (file2.getName().equals(fileName)) {
                                file = new File(file.getAbsolutePath(), fileName);
                                System.out.println(file.exists());
                            }


                        }
                    }
                }


            }
        }
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - keyword - ինչ որ բառ
    // Մեթոդը պետք է նշված path-ում գտնի բոլոր .txt ֆայլերը, և իրենց մեջ փնտրի
    // մեր տված keyword-ը, եթե գտնի, պետք է տպի տվյալ ֆայլի անունը։
    static void contentSearch() throws IOException {
        System.out.println("Please input keyword");
        String keyword = scanner.nextLine();
        File file = new File(path);
        File[] files = file.listFiles();
        if (files != null) {
            for (File file1 : files) {
                if (file1.isFile() && file1.getName().endsWith(".txt")) {
                    try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file1))) {
                        String line;
                        boolean exist = false;
                        while ((line = bufferedReader.readLine()) != null) {
                            if (line.contains(keyword)) {
                                System.out.println(file1.getName());
                                exist = true;
                            }
                        }
                        if (!exist) {
                            System.out.println("No file");
                        }
                    }

                }
            }
        }


    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - txtPath txt ֆայլի փաթը
    // 2 - keyword - ինչ որ բառ
    // տալու ենք txt ֆայլի տեղը, ու ինչ որ բառ, ինքը տպելու է էն տողերը, որտեղ գտնի էդ բառը։
    static void findLines() throws IOException {

        File file = new File(path);
        File[] files = file.listFiles();
        if (files != null) {
            String getPathTxt;
            for (File file1 : files) {
                if (file1.isFile() && file1.getName().endsWith(".txt")) {
                    getPathTxt = file1.getAbsolutePath();
                    System.out.println(getPathTxt);
                    System.out.println(getPathTxt);
                    System.out.println("Please input file path");
                    String filepath = scanner.nextLine();
                    System.out.println("Please input keyword");
                    String keyword = scanner.nextLine();
                    if (filepath.equals(getPathTxt)) {
                        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file1))) {
                            String line;
                            while ((line = bufferedReader.readLine()) != null) {
                                if (!line.contains(keyword)) {
                                    continue;
                                }
                                System.out.println(line);
                            }
                        }
                    }
                }
            }
        }
    }


    //այս մեթոդը պետք է սքաններով վերցնի մեկ string.
    // 1 - path թե որ ֆոլդերի չափն ենք ուզում հաշվել
    // ֆոլդերի բոլոր ֆայլերի չափսերը գումարում ենք իրար, ու տպում
    static void printSizeOfPackage() {
        System.out.println("Please input folder path");
        String folder = scanner.nextLine();
        File file = new File(folder);
        File[] files = file.listFiles();
        if (files != null) {
            int size = 0;
            for (File file1 : files) {
                size += file1.length();

            }
            System.out.println("Size of all files: " + size);
        }


    }

    //այս մեթոդը պետք է սքաններով վերցնի երեք string.
    // 1 - path պապկի տեղը, թե որտեղ է սարքելու նոր ֆայլը
    // 2 - fileName ֆայլի անունը, թե ինչ անունով ֆայլ է սարքելու
    // 3 - content ֆայլի պարունակությունը։ Այսինքն ստեղծված ֆայլի մեջ ինչ է գրելու
    // որպես արդյունք պապկի մեջ սարքելու է նոր ֆայլ, իրա մեջ էլ լինելու է content-ով տվածը
    static void createFileWithContent() throws IOException {
        System.out.println("Please input folderName");
        String folderName = scanner.nextLine();
        System.out.println("Please input fileName");
        String fileName = scanner.nextLine();
        System.out.println("Please input content");
        String content = scanner.nextLine();
        File file = new File(path);
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (!file1.getName().equals(folderName)) {
                file = new File(folderName);
                file.mkdir();
                if (file.isDirectory()) {
                    if (fileName.endsWith(".txt") || fileName.endsWith(".html") || fileName.endsWith(".java")) {
                        File createFile = new File(file.getAbsolutePath() + File.separator + fileName);
                        createFile.createNewFile();
                        if (createFile.isFile()) {
                            try {
                                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(createFile));
                                bufferedWriter.write(content);
                                bufferedWriter.close();
                            } catch (IOException e) {
                                System.out.println(e.getMessage());
                            }

                        }
                    } else {
                        System.out.println("Invalid file format!");
                        break;
                    }

                }

            }

        }

    }
}
