package belajar.blocktemplate;

public abstract class BlockTemplate {
    public final void start(){
        // keyword final artinya method didalamnya akan permanen dan tidak akan bisa dirubah logicnya
        System.out.println(getTitle());
        for(int h = 0; h < getHeight(); h++){
            for(int w = 0; w < getWidth(); w++){
                System.out.print(getKarakter());
            }
            System.out.println();
        }
        System.out.print(getEndTitle());
        System.out.println("\n\n");

    }
    public abstract String getTitle();
    public abstract String getEndTitle();
    public abstract String getKarakter();

    public abstract int getHeight();
    public abstract int getWidth();

}
