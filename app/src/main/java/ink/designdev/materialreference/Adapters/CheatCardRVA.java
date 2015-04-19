package ink.designdev.materialreference.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by TomSingleton on 19/04/15.
 */
public class CheatCardRVA extends RecyclerView.Adapter<CheatCardRVA.CheatCardVH> {

    @Override
    public CheatCardVH onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(CheatCardVH holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    protected class CheatCardVH extends RecyclerView.ViewHolder{

        public CheatCardVH(View itemView) {
            super(itemView);
        }
    }

}
