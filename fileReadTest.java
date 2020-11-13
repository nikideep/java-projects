package test;
import org.junit.Test;
import fileReadin.fileRead;
import junit.framework.Assert;


/**
 * testing whether the file can be read successfully
 * 
 */
@SuppressWarnings("deprecation")
public class fileReadTest 
{
	@SuppressWarnings("deprecation")
	@Test
	public void testFileRead() 
	{
		fileRead fr = new fileRead();
		String expected = "P|R||||0037590|F||||U|||ECOL|||10EA0420077|||AST-N103|1455|19330316||1030||||1||37||||N|000|2|2.51097|A|||EOT\r\n"
				+ "A||AM|?|<=2||S||||||||1|||16|19|4|8|||||2.00|0|0.00||||||||EOT\r\n"
				+ "A||AMC|?|<=2||S|||AUGMENTIN|||||1|||16|21|4|8|||||2.00|0|0.00||||||||EOT\r\n"
				+ "A||TIC|?|<=8||S|||TICARPEN|||||1|||22|24|8|16|||||1.00|0|0.00||||||||EOT\r\n"
				+ "A||TZP|?|<=4||S|||TAZOCILLIN|||||1|||17|21|8|16|||||2.00|0|0.00||||||||EOT\r\n"
				+ "A||CF|?|4||S|||KEFLIN|||Voie parentérale||1|||12|18|8|32|||||2.00|0|0.00||||||||EOT\r\n"
				+ "A||FOX|?|<=4||S|||MEFOXIN|||Voie parentérale||1|||15|22|8|32|||||2.00|0|0.00||||||||EOT\r\n"
				+ "A||CTX|?|<=1||S|||CLAFORAN|||Voie parentérale||1|||23|26|1|2|||||1.00|0|0.00||||||||EOT\r\n"
				+ "A||CAZ|?|<=1||S|||FORTUM|||Voie parentérale||1|||19|26|1|8|||||1.00|0|0.00||||||||EOT";
		String actual = fr.getFileData("resources//acceptance.txt").toString();
		Assert.assertNotNull(actual);
		Assert.assertEquals(expected, actual);
	}
	
	/**
	 * 
	 * testing whether file not found exception is caught or not when the file path is wrong or the file is not found at all
	 */
	@Test
    public void testFileNotFoundException()
	{
        fileRead fr = new fileRead();
        String Expected = "file not found";
        String actual = fr.getFileData("src//accept");
       Assert.assertEquals(Expected,actual);

	}
	
}
	

