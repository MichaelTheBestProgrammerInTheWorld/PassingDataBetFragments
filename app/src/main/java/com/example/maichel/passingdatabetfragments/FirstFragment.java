package com.example.maichel.passingdatabetfragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment {

    EditText name, email, phone;
    Button next;

    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        name = view.findViewById(R.id.name);
        email = view.findViewById(R.id.email);
        phone = view.findViewById(R.id.phone);
        next = view.findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strName = name.getText().toString();
                String strEmail = email.getText().toString();
                String strPhone = phone.getText().toString();

                Bundle bundle = new Bundle();
                bundle.putString("name", strName);
                bundle.putString("email", strEmail);
                bundle.putString("phone", strPhone);

                Fragment secondFragment = new SecondFragment();
                secondFragment.setArguments(bundle);
                FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.frame_layout, secondFragment);
                ft.commit();
            }
        });

        return view;
    }

}
