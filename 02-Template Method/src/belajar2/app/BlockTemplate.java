package belajar2.app;

public class BlockTemplate {

    public void BlockShow(String getKarakter, int getHeight, int getWidth){
        for(int h = 0; h < getHeight; h++){
            for(int w = 0; w < getWidth; w++){
                System.out.print(getKarakter);
            }
            System.out.println();
        }
        System.out.println("\n\n");
    }
}
