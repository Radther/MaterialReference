package ink.designdev.materialreference.model;

import java.util.ArrayList;

import io.realm.RealmList;
import io.realm.RealmObject;

/**
 * Created by TomSingleton on 18/04/15.
 */
public class GuideSheet extends RealmObject {

    private String title;
    private String author;
    private String description;
    private RealmList<MatRef> matRefs;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public RealmList<MatRef> getMatRefs() {
        return matRefs;
    }

    public void setMatRefs(RealmList<MatRef> matRefs) {
        this.matRefs = matRefs;
    }
}
