package com.tbcreational.converters;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CSVToTabConverter extends Converter{

	public CSVToTabConverter(File inFile, File outFile) {
		this.inPattern = ",";
		this.outPattern = "\t";
		this.fileToConvert = inFile;
		this.outputFile = outFile;
	}
	@Override
	public boolean convert() {
		String line;
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileToConvert));
			BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));
			
			if(!outputFile.exists()) {
				outputFile.createNewFile();
			}

			while((line = br.readLine()) != null) {
				String templine = line.replace(inPattern, outPattern);
				bw.write(templine);
				bw.write("\r\n");
			}
			br.close();
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

		return true;
	}
}
