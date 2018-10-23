package com.ykk.pluglin_video.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.ykk.pluglin_video.R;
import com.ykk.pluglin_video.R2;
import com.ykk.pluglin_video.entity.HistoryInfo;
import com.ykk.pluglin_video.utils.ScreenUtils;
import com.ykk.pluglin_video.video.MainActivity;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by yukun on 17-11-20.
 */

public class ToolsRVAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    Context context;
    List<Integer> imageList;
    List<String> mListName;
    HashMap<String,Class> mClassHashMap=new HashMap<>();
    public ToolsRVAdapter(Context context, List<Integer> imageList,List<String> mListName) {
        this.context = context;
        this.imageList = imageList;
        this.mListName= mListName;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.tool_item_layout, null);
        return new MHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        if (holder instanceof MHolder) {
            Glide.with(context).load(imageList.get(position)).into(((MHolder) holder).mTvIcon);
            ((MHolder) holder).mTvName.setText(mListName.get(position));
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        }
    }

    @Override
    public int getItemCount() {
        return imageList.size();
    }

    class MHolder extends RecyclerView.ViewHolder {

        @BindView(R2.id.tv_tool_name)
        TextView mTvName;
        @BindView(R2.id.iv_image)
        ImageView mTvIcon;
        @BindView(R2.id.ll_contain)
        LinearLayout ll_contain;
        public MHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            ViewGroup.LayoutParams params=ll_contain.getLayoutParams();
            params.height= ScreenUtils.instance().getWidth(context)/2;
           ll_contain.setLayoutParams(params);
        }
    }
}
