package belajar.blockvarian;

import belajar.blocktemplate.BlockTemplate;

public class BlockOne extends BlockTemplate {

    @Override
    public String getTitle() {
        return "BLOCK GAME";
    }

    @Override
    public String getEndTitle() {
        return "AKHIR BLOCK GAME 1";
    }

    @Override
    public String getKarakter() {
        return "A";
    }

    @Override
    public int getHeight() {
        return  10;
    }

    @Override
    public int getWidth() {
        return 5;
    }
}
