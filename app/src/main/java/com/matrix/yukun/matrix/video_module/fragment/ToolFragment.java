package com.matrix.yukun.matrix.video_module.fragment;

import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.view.View;
import android.widget.ImageView;

import com.matrix.yukun.matrix.R;
import com.matrix.yukun.matrix.video_module.BaseFragment;
import com.matrix.yukun.matrix.video_module.adapter.ToolsRVAdapter;
import com.matrix.yukun.matrix.video_module.play.ToolsActivity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Administrator on 2018/10/28.
 */

public class ToolFragment extends BaseFragment {

    private ImageView mIvBack;
    private RecyclerView mRvList;
    private GridLayoutManager mGridLayoutManager;
    private List<Integer> mListImage=new ArrayList<>();
    private ToolsRVAdapter mToolsRVAdapter;
    private List<String> mListName;

    public static ToolFragment getInstance(){
        ToolFragment toolFragment=new ToolFragment();
        return toolFragment;
    }
    @Override
    public int getLayout() {
        return R.layout.activity_tools;
    }

    @Override
    public void initView(View inflate, Bundle savedInstanceState) {
        mIvBack = (ImageView) inflate.findViewById(R.id.iv_back);
        mRvList = (RecyclerView)inflate. findViewById(R.id.rv_list);
        initData();
        mGridLayoutManager = new GridLayoutManager(getContext(),2);
        mRvList.setLayoutManager(mGridLayoutManager);
        mToolsRVAdapter = new ToolsRVAdapter(getContext(),mListImage,mListName);
        mRvList.setAdapter(mToolsRVAdapter);
        mRvList.addItemDecoration(new DevidemToolFragment(2,10,true));
        //移动
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(new ItemDragCallBack());
        itemTouchHelper.attachToRecyclerView(mRvList);
    }
    private void initData() {
        mListName= Arrays.asList(getResources().getStringArray(R.array.tools_name));
        mListImage.add(R.mipmap.icon_index_selected);
        mListImage.add(R.mipmap.icon_index_selected);
        mListImage.add(R.mipmap.me_index_icon);
        mListImage.add(R.mipmap.me_index_icon);
        mListImage.add(R.mipmap.me_index_icon);
        mListImage.add(R.mipmap.icon_index_selected);
        mListImage.add(R.mipmap.icon_index_selected);
        mListImage.add(R.mipmap.me_index_icon);
        mListImage.add(R.mipmap.me_index_icon);
        mListImage.add(R.mipmap.me_index_icon);
    }
    //
    class ItemDragCallBack extends ItemTouchHelper.Callback {
        //通过返回值来设置是否处理某次拖曳或者滑动事件
        @Override
        public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            if (recyclerView.getLayoutManager() instanceof GridLayoutManager) {
                int dragFlags = ItemTouchHelper.UP | ItemTouchHelper.DOWN |
                        ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT;
                int swipeFlags = 0;
                return makeMovementFlags(dragFlags, swipeFlags);
            } else {
                int dragFlags = ItemTouchHelper.UP | ItemTouchHelper.DOWN;
                //注意：和拖曳的区别就是在这里
                int swipeFlags = ItemTouchHelper.START | ItemTouchHelper.END;
//                int swipeFlags = 0;
                return makeMovementFlags(dragFlags, swipeFlags);
            }

//            dragFlags 是拖拽标志，
//            swipeFlags 是滑动标志，
//            swipeFlags 都设置为0，暂时不考虑滑动相关操作。
        }

        //当长按并进入拖曳状态时，拖曳的过程中不断的回调此方法
        @Override
        public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
            //拖动的 item 的下标
            int fromPosition = viewHolder.getAdapterPosition();
            //目标 item 的下标，目标 item 就是当拖曳过程中，不断和拖动的 item 做位置交换的条目。
            int toPosition = target.getAdapterPosition();
            if (fromPosition < toPosition) {
                for (int i = fromPosition; i < toPosition; i++) {
                    Collections.swap(mListImage, i, i + 1);
                    Collections.swap(mListName, i, i + 1);
                }
            } else {
                for (int i = fromPosition; i > toPosition; i--) {
                    Collections.swap(mListImage, i, i - 1);
                    Collections.swap(mListName, i, i -  1);
                }
            }
            mToolsRVAdapter.notifyItemMoved(fromPosition, toPosition);
            return true;
        }

        //滑动删除的回调
        @Override
        public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction) {
            int adapterPosition = viewHolder.getAdapterPosition();
//            mJokeAdapter.notifyItemRemoved(adapterPosition);
//            jokeInfoList.remove(adapterPosition);

        }

        @Override
        public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int actionState) {
            if (actionState != ItemTouchHelper.ACTION_STATE_IDLE) {
                //给被拖曳的 item 设置一个深颜色背景
                viewHolder.itemView.setBackgroundColor(getResources().getColor(R.color.color_73b4b3b3));
            }
            super.onSelectedChanged(viewHolder, actionState);
        }

        @Override
        public void clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            super.clearView(recyclerView, viewHolder);
            //给已经完成拖曳的 item 恢复开始的背景。
            //这里我们设置的颜色尽量和你 item 在 xml 中设置的颜色保持一致
            viewHolder.itemView.setBackgroundColor(getResources().getColor(R.color.color_34b4b3b3));

        }
    }

}

