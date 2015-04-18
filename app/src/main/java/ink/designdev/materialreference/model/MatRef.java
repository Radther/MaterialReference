package ink.designdev.materialreference.model;

import java.util.ArrayList;

import io.realm.RealmList;
import io.realm.RealmObject;

/**
 * Created by TomSingleton on 18/04/15.
 */
public class MatRef extends RealmObject {

    private String title;
    private boolean starred;
    private RealmList<CheatCard> cheatCards;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isStarred() {
        return starred;
    }

    public void setStarred(boolean starred) {
        this.starred = starred;
    }

    public RealmList<CheatCard> getCheatCards() {
        return cheatCards;
    }

    public void setCheatCards(RealmList<CheatCard> cheatCards) {
        this.cheatCards = cheatCards;
    }
}
