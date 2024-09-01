package javaIO;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class JavaIO {

    static String folderPath = "src/main/resources/books";
    static String filePath = "src/main/resources/books/app.txt";
    static String csvPath = "src/main/resources/cakes.csv";
    static String utfFilePath = "src/main/resources/input.txt";
    static String jarFile = "src/main/resources/books.zip";

    public static void main(String[] args) throws IOException {

        getHostName();
        readLineByLineUsingFiles();
        listDirectories();
        readAllLines();
        readUtfEncodedFile();
    }


    private static void getHostName() throws UnknownHostException {
        String hostName = InetAddress.getLocalHost().getHostName();
        System.out.println(hostName                                                                                                                                             );
    }

    static void readLineByLineUsingFiles() throws IOException {
        try (Stream<String> lines = Files.lines(Path.of(filePath))) {
            lines.forEach(System.out::println);
        }


    }

    private static void listDirectories() throws IOException {
        Predicate<String> predicates = file -> Files.isDirectory(Path.of(folderPath), LinkOption.NOFOLLOW_LINKS);
        System.out.println(predicates.test("src/main/resource/books"));
        try (Stream<Path> paths = Files.list(Path.of(folderPath))) {
            paths.filter(Files::isDirectory).forEach(each -> System.out.println("Its a directory"));
        }
    }


    static void readAllLines() throws IOException {
        List<String> files = Files.readAllLines(Path.of(filePath));
        files.forEach(System.out::println);


    }

    static void readUtfEncodedFile() throws IOException {

        try (Stream<String> files = Files.lines(Path.of(utfFilePath), StandardCharsets.UTF_8)) {
            files.forEach(System.out::println);
        }
    }
}
