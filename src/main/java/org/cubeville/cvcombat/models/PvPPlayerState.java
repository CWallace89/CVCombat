package org.cubeville.cvcombat.models;

import org.cubeville.cvgames.models.PlayerState;

public abstract class PvPPlayerState extends PlayerState {
    public int team;
    public Integer selectedKit;
    public int respawnTimer = -1;
    public int deaths = 0;
    public int kills = 0;


    public PvPPlayerState(int team) {
        this.team = team;
    }
}
