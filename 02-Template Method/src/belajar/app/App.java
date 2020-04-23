package belajar.app;
import belajar.blockvarian.*;

public class App {
    public static void main(String[] args) {
    BlockOne one = new BlockOne();
    one.start();
    BlockTwo two = new BlockTwo();
    two.start();
    BlockThree three = new BlockThree();
    three.start();
    }
}
