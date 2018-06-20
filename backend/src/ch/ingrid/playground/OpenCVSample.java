package ch.ingrid.playground;

import static org.bytedeco.javacpp.opencv_core.*;
import static org.bytedeco.javacpp.opencv_imgproc.*;

import org.bytedeco.javacpp.indexer.Indexer;

import static org.bytedeco.javacpp.opencv_imgcodecs.*;

public class OpenCVSample {
	
	public static void main(String[] args)
	{
		IplImage image = cvLoadImage("resources/raw_images/penne_rezept.jpg");
		Mat img = imread("resources/raw_images/penne_rezept.jpg",1);
		
        if (image != null) {
        	//cvSmooth(image, image);
            //cvSaveImage("resources/raw_images/penne_rezept.jpg", image)
            //cvReleaseImage(image);
        }
        
        if (img != null) {
        	Mat imgOut = new Mat();
        	Laplacian(img, imgOut, img.depth(), 1, 3, 0, BORDER_DEFAULT);
        	imwrite("resources/output/penne_rezept_smooth.jpg", imgOut);
        	
        	// Put salt on image
        	Indexer indexer = img.createIndexer();
        	for (int i=0; i<indexer.rows()*indexer.cols(); i++)
        	{
        		long[] pixel = {(long) (Math.random()*indexer.cols()), (long) (Math.random()*indexer.rows())};
        		indexer.putDouble(pixel, 5484);
        	}
        	imwrite("resources/output/penne_rezept_salt.jpg", img);
        }
	}
}
