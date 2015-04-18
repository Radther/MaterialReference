package ink.designdev.materialreference.model;

import io.realm.RealmObject;

/**
 * Created by TomSingleton on 18/04/15.
 */
public class CheatCard extends RealmObject {

    private String title;
    private String content;
    private String codeBlock;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCodeBlock() {
        return codeBlock;
    }

    public void setCodeBlock(String codeBlock) {
        this.codeBlock = codeBlock;
    }
}
