package mod;

import static net.mineworld.blocks.BlockDefinition.registerBlock;

public class Main {

    public static void main(String[] args) {
        // Register a custom block like net.mineworld.blocks.BlockDefinition.registerBlock
        registerBlock(
                (byte) 4,
                1.5f,
                0,
                0,
                0,
                "test1234",
                true,
                new byte[]{2,0}, //front
                new byte[]{2,0}, //back
                new byte[]{2,0}, //right
                new byte[]{2,0}, //left
                new byte[]{2,0}, //top
                new byte[]{2,0},  //bottom
                (byte) 1,
                true,
                false,
                false,
                null,
                "stone_3",
                "stone_2",
                false,
                false,
                0,
                true,
                null
        );

        // Other mod code...
    }
}
