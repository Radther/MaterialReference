package ink.designdev.materialreference.screens;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import com.rengwuxian.materialedittext.MaterialEditText;

import ink.designdev.materialreference.R;


public class CheatCardActivity extends ActionBarActivity {

    private MaterialEditText titleET;
    private ImageButton titleEditCheck;
    private boolean titleEditMode = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cheat_card);

        titleET = (MaterialEditText)findViewById(R.id.cheatcard_page_title_et);
        titleEditCheck = (ImageButton)findViewById(R.id.cheatcard_page_title_check);

        editToText();

        titleEditCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                titleEditMode = !titleEditMode;
                editToText();
            }
        });

    }

    private void editToText(){
        if (titleEditMode){
            titleET.setHideUnderline(false);
            titleET.setSingleLineEllipsis(true);
            titleET.setEnabled(true);
            titleEditCheck.setImageDrawable(getResources().getDrawable(R.drawable.ic_check_white_24dp));
        }
        else {
            titleET.setHideUnderline(true);
            titleET.setSingleLineEllipsis(false);
            titleET.setEnabled(false);
            titleEditCheck.setImageDrawable(getResources().getDrawable(R.drawable.ic_create_white_24dp));
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_cheat_card, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
