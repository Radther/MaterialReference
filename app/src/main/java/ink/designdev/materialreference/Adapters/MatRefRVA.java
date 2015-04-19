package ink.designdev.materialreference.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by TomSingleton on 19/04/15.
 */
public class MatRefRVA extends RecyclerView.Adapter<MatRefRVA.MatRefVH> {

    @Override
    public MatRefRVA.MatRefVH onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(MatRefRVA.MatRefVH holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    protected class MatRefVH extends RecyclerView.ViewHolder{

        public MatRefVH(View itemView) {
            super(itemView);
        }
    }

}
