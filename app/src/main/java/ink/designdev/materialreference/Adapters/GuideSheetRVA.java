package ink.designdev.materialreference.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import ink.designdev.materialreference.R;
import ink.designdev.materialreference.model.GuideSheet;

/**
 * Created by TomSingleton on 19/04/15.
 */
public class GuideSheetRVA extends RecyclerView.Adapter<GuideSheetRVA.GuideSheetVH> {

    ArrayList<GuideSheet> guideSheets;

    public GuideSheetRVA(ArrayList<GuideSheet> guideSheets) {
        this.guideSheets = guideSheets;
    }

    @Override
    public GuideSheetVH onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.guide_sheet_card, parent, false);
        return new GuideSheetVH(view);

    }

    @Override
    public void onBindViewHolder(GuideSheetVH holder, int position) {

        holder.bindView(guideSheets.get(position));

    }

    @Override
    public int getItemCount() {
        return guideSheets.size();
    }

    protected class GuideSheetVH extends RecyclerView.ViewHolder{

        TextView gsTitle;
        TextView gsAuthor;
        TextView gsDesc;
        TextView gsRefCount;

        public GuideSheetVH(View itemView) {
            super(itemView);

            gsTitle = (TextView)itemView.findViewById(R.id.guide_sheet_title_tv);
            gsAuthor = (TextView)itemView.findViewById(R.id.guide_sheet_author_tv);
            gsDesc = (TextView)itemView.findViewById(R.id.guide_sheet_desc_tv);
            gsRefCount = (TextView)itemView.findViewById(R.id.guide_sheet_count_tv);

        }

        public void bindView(GuideSheet guideSheet){

            gsTitle.setText(guideSheet.getTitle());
            gsAuthor.setText(guideSheet.getAuthor());
            gsDesc.setText(guideSheet.getDescription());
            gsRefCount.setText(guideSheet.getMatRefs().size());

        }
    }

}
