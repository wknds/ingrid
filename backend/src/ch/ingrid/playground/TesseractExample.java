package ch.ingrid.playground;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class TesseractExample {

	public static void main(String[] args) {
		String inputFileName = "penne_rezept";
		File imageFile = new File("resources/raw_images/" + inputFileName + ".jpg");
		ITesseract instance = new Tesseract();
		instance.setDatapath("/home/yaw/Projects/ingrid/backend/libs/Tess4J");
		FileWriter fWriter = null;
		PrintWriter bWriter = null;
		String result = "";
		try {
			result = instance.doOCR(imageFile);
			System.out.println(result);
		} catch (TesseractException e){
			System.err.println(e.getMessage());

		}
		try {
			fWriter = new FileWriter("resources/output/" + inputFileName + ".txt", true);
			bWriter = new PrintWriter(fWriter);
			bWriter.write(result);
		} catch (IOException e) {
			System.err.println(e.getMessage());
		} finally {
			try {
				if (fWriter != null)
					fWriter.close();
				if (bWriter != null)
					bWriter.close();
			} catch (IOException e) {
				System.err.println(e.getMessage());
			}
		}
	}

}
