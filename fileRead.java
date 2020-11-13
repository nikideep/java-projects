package fileReadin;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/*
 * fileRead class helps in reading the text file and storing the contents in
 * a buffer
 */

public class fileRead 
{
	final StringBuilder builder = new StringBuilder();
	
	/* Get's the file data reads it and then stores in a buffer.
	 * @param path
	 */
    public String getFileData(final String path) 
    {
        FileInputStream inputStream = null;
        try 
        {
            inputStream = new FileInputStream(path);
            int content;
            while ((content = inputStream.read()) != -1) 
            {
                builder.append((char) content);

            }
        }
        catch(FileNotFoundException e)
        {
            return ("file not found");
        }
        catch (final IOException io) 
        {
        	return("I/o exception");
        }
        return builder.toString();
    }
}