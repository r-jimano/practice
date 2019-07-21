import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class ConvFileEncode {
	
	// TODO 
//	private static String regex = "glob:*.{java,txt,log,csv}";
//	PathMatcher matcher = FileSystems.getDefault().getPathMatcher(regex);
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
		// TODO 拡張子でフィルタするところが残念
		// walkFileTree(Path, FileVisitor)を使う
		Files.walk(dir, FileVisitOption.FOLLOW_LINKS).filter(path -> {
			File f = path.toFile();
			return f.isFile() && (f.toString().endsWith(".java") || f.toString().endsWith(".txt") || f.toString().endsWith(".csv"));
		}).forEach(txtFile -> _convToUTF8(txtFile, oldCharset));
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
		try (BufferedReader br = new BufferedReader(new InputStreamReader(Files.newInputStream(txt), oldCharset))) {
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
