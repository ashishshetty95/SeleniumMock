package DataDrivenTesting;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.spi.FileSystemProvider;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

public class ReadDataFromJSONFile {
	@Test
	public void testJSONFileTest() throws IOException, ParseException {
		FileReader fread=new FileReader(".\\src\\test\\resources\\JSONdata.json");
		JSONParser json=new JSONParser();
		Object obj = json.parse(fread);
		JSONObject map=(JSONObject) obj;
		System.out.println(map.get("url"));
		System.out.println(map.get("username"));
		System.out.println(map.get("password"));
	}
}
