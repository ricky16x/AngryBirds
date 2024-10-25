package com.ninjamoney.angrybirds;

import com.badlogic.gdx.graphics.Texture;

public class Bomb extends Birds {
    private com.ninjamoney.angrybirds.specialAbility specialAbility;
    private final Texture bombTexture;

    public Bomb() {
        super("Bomb", 100);
        bombTexture = new Texture("bomb.png");
    }

    public Texture getBombTexture() {
        return bombTexture;
    }
}
