import java.util.Scanner;
 
public class Test
{    
    public static void main(String[] args)
    { 

        ImUtils  imageOps = new ImUtils();

        Scanner scan = new Scanner(System.in);
        //path to the image you would like to perform operations on
        System.out.println("Enter the filepath to image to edit: ");
        String filepath = scan.nextLine();


        //TODO: Add more options
        System.out.println("Select from the following image operations\n [0] Rotate \n");
        int option = scan.nextInt();


        switch(option){
            case 0:
            imageOps.rotateImage(filepath);
            System.out.println("rotated image stored in" + filepath + "/newImage.png");
            default:
        }
        

    }
}




