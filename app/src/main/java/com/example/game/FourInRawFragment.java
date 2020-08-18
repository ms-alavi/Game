package com.example.game;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class FourInRawFragment extends Fragment {
    private Button mBtnTicTocToa;




    public FourInRawFragment() {
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
        View view= inflater.inflate(R.layout.fragment_four_in_raw, container, false);
        mBtnTicTocToa=view.findViewById(R.id.btn_4InRaw_ticTocToa);
        mBtnTicTocToa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getContext(),TicTocToa.class);
                startActivity(intent);
                getActivity().finish();
            }
        });
        return view;
    }
}