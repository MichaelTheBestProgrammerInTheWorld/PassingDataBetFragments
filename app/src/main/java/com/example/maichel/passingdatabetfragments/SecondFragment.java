package com.example.maichel.passingdatabetfragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment {

    TextView name, email, phone;

    public SecondFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_second, container, false);

        name = view.findViewById(R.id.name2);
        email = view.findViewById(R.id.email2);
        phone = view.findViewById(R.id.phone2);

        Bundle b = this.getArguments();
        if(b != null){
            String strName = b.getString("name");
            String strEmail =b.getString("email");
            String strPhone = b.getString("phone");

            name.setText(strName);
            email.setText(strEmail);
            phone.setText(strPhone);
        }

        return view;
    }

}
