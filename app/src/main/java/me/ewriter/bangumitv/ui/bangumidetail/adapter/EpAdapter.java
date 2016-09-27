package me.ewriter.bangumitv.ui.bangumidetail.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import me.ewriter.bangumitv.R;
import me.ewriter.bangumitv.api.entity.AnimeEpEntity;

/**
 * Created by Zubin on 2016/9/27.
 */

public class EpAdapter extends RecyclerView.Adapter<EpAdapter.ViewHolder> {

    List<AnimeEpEntity> mList;

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_ep_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        AnimeEpEntity entity = mList.get(position);

        holder.textView.setText(entity.getDisplayName());

        holder.textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public void setList(List<AnimeEpEntity> list) {
        mList = list;
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        TextView textView;

        public ViewHolder(View itemView) {
            super(itemView);
            textView = (TextView) itemView;
        }
    }
}
