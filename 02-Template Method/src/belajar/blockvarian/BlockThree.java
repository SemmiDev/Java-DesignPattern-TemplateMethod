package belajar.blockvarian;

import belajar.blocktemplate.BlockTemplate;

public class BlockThree extends BlockTemplate {

    @Override
    public String getTitle() {
        return "BLOCK GAME 3";
    }

    @Override
    public String getEndTitle() {
        return "AKHIR BLOCK GAME 3";
    }

    @Override
    public String getKarakter() {
        return "C";
    }

    @Override
    public int getHeight() {
        return  20;
    }

    @Override
    public int getWidth() {
        return 15;
    }
}
