package pers.ouroborosno2;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MainTest {
    String[] args;
    @Test
    public void main() {
        args = new String[2];
        args[0] = "D:\\Code\\PaperCheck\\src\\main\\resources\\origin2_cn.txt";
        args[1] = "D:\\Code\\PaperCheck\\src\\main\\resources\\copy2_cn.txt";
        Main.main(args);

        args = new String[3];
        args[0] = "D:\\Code\\PaperCheck\\src\\main\\resources\\origin2_cn.txt";
        args[1] = "D:\\Code\\PaperCheck\\src\\main\\resources\\copy2_cn.txt";
        args[2] = "D:\\Code\\PaperCheck\\src\\main\\resources\\target2_cn.txt";
        Main.main(args);
    }
}