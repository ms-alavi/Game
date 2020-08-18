package com.example.game;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class TicTocToaFragment extends Fragment {
    private Button m4InRawFragment;
    private Button mBtn1;
    private Button mBtn2;
    private Button mBtn3;
    private Button mBtn4;
    private Button mBtn5;
    private Button mBtn6;
    private Button mBtn7;
    private Button mBtn8;
    private Button mBtn9;
    private Button mBtnSetting;
    private TextView mTxtTurn;
    private int mTurn;


    public TicTocToaFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_tic_toc_toa, container, false);
        findViews(view);
        setListeners();

        return view;
    }

    private void setListeners() {
        m4InRawFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
           Intent intent=new Intent(getContext(), FourInRawActivity.class);
           startActivity(intent);
           getActivity().finish();
            }
        });
        mBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mTurn%2==0){
                    mBtn1.setText("X");
                }
            }
        });  mBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });  mBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });  mBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });  mBtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });  mBtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });  mBtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });  mBtn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });  mBtn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });  mBtnSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    private void findViews(View view) {
        m4InRawFragment=view.findViewById(R.id.btn_ticTocToa_4InRaw);
        mBtn1=view.findViewById(R.id.btn_ticTocToa_1);
        mBtn2=view.findViewById(R.id.btn_ticTocToa_2);
        mBtn3=view.findViewById(R.id.btn_ticTocToa_3);
        mBtn4=view.findViewById(R.id.btn_ticTocToa_4);
        mBtn5=view.findViewById(R.id.btn_ticTocToa_5);
        mBtn6=view.findViewById(R.id.btn_ticTocToa_6);
        mBtn7=view.findViewById(R.id.btn_ticTocToa_7);
        mBtn8=view.findViewById(R.id.btn_ticTocToa_8);
        mBtn9=view.findViewById(R.id.btn_ticTocToa_9);
        mBtnSetting=view.findViewById(R.id.btn_ticTocToa_setting);
        mTxtTurn=view.findViewById(R.id.txt_ticTocToa_turn);
    }
}