import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.util.concurrent.TimeUnit;
import java.lang.Runtime;


//TO DO: track memory usage -> https://cruftex.net/2017/03/28/The-6-Memory-Metrics-You-Should-Track-in-Your-Java-Benchmarks.html
 
public class ImUtils
{      

    private static final int MegaBytes = 1024 * 1024;

         protected void rotateImage(String filepath) {
                long lStartTime = System.nanoTime();
                File file = new File(filepath);
                BufferedImage image = null;

            try{
                image = ImageIO.read(file);
                            } 
            catch (IOException e){
                e.printStackTrace();
            }

                int         width  = image.getWidth();
                int         height = image.getHeight();
                BufferedImage   newImage = new BufferedImage( height, width, image.getType() );
            
                for( int i=0 ; i < width ; i++ )
                    for( int j=0 ; j < height ; j++ )
                        newImage.setRGB( height-1-j, i, image.getRGB(i,j) );

            try{
                ImageIO.write(newImage, "png", new File("/home/mclovin/imageOps/newImage.png"));
                            } 
            catch (IOException e){
                e.printStackTrace();
            }

            long lEndTime = System.nanoTime();
            long output = lEndTime - lStartTime;
            System.out.println("Elapsed time in milliseconds: " + output / 1000000);
         }
}



