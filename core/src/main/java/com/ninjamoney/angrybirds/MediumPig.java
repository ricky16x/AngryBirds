package com.ninjamoney.angrybirds;

import com.badlogic.gdx.graphics.Texture;

public class MediumPig {
    private Texture pigTexture;

    public MediumPig() {
        pigTexture = new Texture("mediumpig.png");
    }

    public Texture getPigTexture() {
        return pigTexture;
    }
}