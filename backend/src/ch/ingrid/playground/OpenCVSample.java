package ch.ingrid.playground;

import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

public class OpenCVSample {
	
	public static void main(String[] args)
	{
		System.loadLibrary(org.opencv.core.Core.NATIVE_LIBRARY_NAME);
		Mat mat = Mat.eye(3, 3, CvType.CV_8UC1);
		System.out.println("mat = \n" + mat.dump());
		
		Mat frame = new Mat();
		Mat logo = new Mat();
		logo = Imgcodecs.imread("resources/raw_images/penne_rezept.jpg");
		Imgproc.cvtColor(logo, frame, Imgproc.COLOR_BGR2GRAY);
		Imgcodecs.imwrite("resources/output/penne_rezept_gray.jpg", frame);
	}
}
