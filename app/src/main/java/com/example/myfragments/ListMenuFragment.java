package com.example.myfragments;


import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class ListMenuFragment extends ListFragment
{
    String[] users = new String[]
            { "Akansha","Harish","Tirtharaj","Sandhya","Varad"};
    String[] location = new String[]
            {"Hyderabad","Chennai","Kolkata","Bangalore","Varanasi"};
    String[] description = new String[]
            {
                    "She is a dedicated Software Professional, Traveller and Music Lover.",
                    "He is a budding Android Developer, Basketball Player and loves to watch Tamil Movies.",
                    "He is a multi-talented guy, with sheer interest in becoming a CEO.",
                    "She is a graduate student, previously working for an Health Oriented-IT Company.",
                    "He is a graduate student who wishes to be a successful person in his life.",
            };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.listitems_info, container, false);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1, users);
        setListAdapter(adapter);
        return view;
    }


    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        DetailsFragment txt = (DetailsFragment)getFragmentManager().findFragmentById(R.id.fragment2);
        txt.change("Name: "+ users[position],"Location: "+ location[position],"Description: "+description[position]);
        getListView().setSelector(android.R.color.holo_blue_dark);
    }
}