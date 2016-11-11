package com.example.dynamicframent;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dynamicframent.dummy.ResponseData;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by root on 4/11/16.
 */

public class DemoFragment extends Fragment {

    List<ResponseData.Response.AllApp> list = new ArrayList<>();


    public static DemoFragment getInstance() {
        return new DemoFragment();
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_demo, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        getArgumentsValue();
        initUI(view);

    }

    private void getArgumentsValue() {
        try {
            if (getArguments() != null) {
                list = getArguments().getParcelableArrayList("list");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void initUI(View view) {
        RecyclerView mRecyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);


        mRecyclerView.setAdapter(new DemoAdapter());

    }


    class DemoAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

        public DemoAdapter() {
        }

        class ViewHolder extends RecyclerView.ViewHolder {

            TextView mTextView;

            public ViewHolder(View itemView) {
                super(itemView);
                mTextView = (TextView) itemView.findViewById(R.id.tv_demo);
            }
        }


        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
            return new ViewHolder(itemView);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

            if (holder instanceof ViewHolder) {

                final ViewHolder user = ((ViewHolder) holder);

                user.mTextView.setText(list.get(position).getAppName());

                user.mTextView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {


                        Toast.makeText(getActivity(), user.mTextView.getText(), Toast.LENGTH_SHORT).show();
                    }
                });
            }

        }

        @Override
        public int getItemCount() {
            return list.size();
        }
    }


}
