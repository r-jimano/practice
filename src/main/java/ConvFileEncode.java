import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class ConvFileEncode {
    public static void main(String[] args) {
	try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
	    System.out.println("Dir : ");
	    Path path = Paths.get(br.readLine());
	    convToUTF8(path, "SJIS");
	} catch (IOException e) {
	    e.printStackTrace();
	}
	System.out.println("Finished.");
    }

    /**
     * 指定されたディレクトリ配下に存在するテキストファイルのエンコードをUTF-8に変更します。
     * 
     * @param dir
     * @param oldCharset
     * @throws IOException
     */
    static void convToUTF8(Path dir, String oldCharset) throws IOException {
	Files.walk(dir, FileVisitOption.FOLLOW_LINKS).filter(path -> path.toFile().isFile())
		.forEach(path -> _convToUTF8(path, oldCharset));
    }

    /**
     * テキストファイルのエンコードをUTF-8に変更します。
     * 
     * @param txt
     * @param oldCharset
     * @return
     * @throws IOException
     */
    static void _convToUTF8(Path txt, String oldCharset) {
	// Files.readAllLinesでCharset.forName()を利用してデコード文字セットを指定すると怒られた・・・
	try (BufferedReader br = new BufferedReader(
		new InputStreamReader(Files.newInputStream(txt), oldCharset))) {
	    List<String> lines = new ArrayList<>();
	    String line = null;
	    while ((line = br.readLine()) != null) {
		lines.add(line);
	    }
	    Path tmpPath = Files.createTempFile(txt.getParent(), txt.getFileName().toString(), null);
	    Files.copy(txt, tmpPath, StandardCopyOption.REPLACE_EXISTING);
	    Files.write(txt, lines, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING);
	    Files.deleteIfExists(tmpPath);
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }
}
