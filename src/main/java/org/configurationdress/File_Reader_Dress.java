package org.configurationdress;

import java.io.IOException;



public class File_Reader_Dress {
	private File_Reader_Dress() {

	}

	public static File_Reader_Dress get_FRM() {
		File_Reader_Dress read = new File_Reader_Dress();
		return read;

	}

	public Configuration_Reader_Dress get_CR() throws IOException  {
		Configuration_Reader_Dress reader = new Configuration_Reader_Dress();
		return reader;
	}

}