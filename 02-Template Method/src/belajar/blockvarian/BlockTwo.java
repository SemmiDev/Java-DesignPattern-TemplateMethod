package belajar.blockvarian;

import belajar.blocktemplate.BlockTemplate;

public class BlockTwo extends BlockTemplate {

    @Override
    public String getTitle() {
        return "BLOCK GAME 2";
    }

    @Override
    public String getEndTitle() {
        return "AKHIR BLOCK GAME 2";
    }

    @Override
    public String getKarakter() {
        return "B";
    }

    @Override
    public int getHeight() {
        return  15;
    }

    @Override
    public int getWidth() {
        return 10;
    }
}
