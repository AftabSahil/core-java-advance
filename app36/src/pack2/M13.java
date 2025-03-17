package pack2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class M13 {
	public static void main(String[] args) throws IOException{
		File f1 = new File("D:\\sept-batch-dev\\core-java\\app85\\src\\java8");
		Stream<Path> files = Files.walk(f1.toPath()); //walk method introduced in JDK1.8
	    files.forEach(c1 -> System.out.println(c1.getFileName()));		
	}
}
