package com.devpx.model;

public enum GameStats {

    NON_STARTED("não iniciado"),
    INCOMPLETE("incompleto"),
    COMPLETE("completo");

    private String label;

    GameStats(final String label){
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
