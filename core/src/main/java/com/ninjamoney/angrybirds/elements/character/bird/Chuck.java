package com.ninjamoney.angrybirds.elements.character.bird;

import com.badlogic.gdx.graphics.Texture;

public class Chuck extends Birds {
    private com.ninjamoney.angrybirds.elements.struct.specialAbility specialAbility;
    private final Texture chuckTexture;

    public Chuck() {
        super("Chuck", 100);
        chuckTexture = new Texture("elements/char/chuck.png");
    }

    public Texture getChuckTexture() {
        return chuckTexture;
    }
}