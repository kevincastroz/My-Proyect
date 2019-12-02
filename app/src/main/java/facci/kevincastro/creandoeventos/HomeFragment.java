package facci.kevincastro.creandoeventos;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    View view;
    private RecyclerView myrecyclerview;
    private List<Eventos> listEvents;


    public HomeFragment(){
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_home,container,false);
        myrecyclerview = (RecyclerView)view.findViewById(R.id.home_recyclerview);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(),listEvents);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recyclerViewAdapter);
        return view;
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        listEvents = new ArrayList<>();
        listEvents.add(new Eventos("Survivor Party","30/11/2019","Discoteca Sensation","Kevin Castro","20:00",R.drawable.perfil));
        listEvents.add(new Eventos("Survivor Party","30/11/2019","Discoteca Sensation","Kevin Castro","20:00",R.drawable.perfil));
        listEvents.add(new Eventos("Survivor Party","30/11/2019","Discoteca Sensation","Kevin Castro","20:00",R.drawable.perfil));
        listEvents.add(new Eventos("Survivor Party","30/11/2019","Discoteca Sensation","Kevin Castro","20:00",R.drawable.perfil));
        listEvents.add(new Eventos("Survivor Party","30/11/2019","Discoteca Sensation","Kevin Castro","20:00",R.drawable.perfil));
        listEvents.add(new Eventos("Survivor Party","30/11/2019","Discoteca Sensation","Kevin Castro","20:00",R.drawable.perfil));
        listEvents.add(new Eventos("Survivor Party","30/11/2019","Discoteca Sensation","Kevin Castro","20:00",R.drawable.perfil));
        listEvents.add(new Eventos("Survivor Party","30/11/2019","Discoteca Sensation","Kevin Castro","20:00",R.drawable.perfil));
        listEvents.add(new Eventos("Survivor Party","30/11/2019","Discoteca Sensation","Kevin Castro","20:00",R.drawable.perfil));
        listEvents.add(new Eventos("Survivor Party","30/11/2019","Discoteca Sensation","Kevin Castro","20:00",R.drawable.perfil));
        listEvents.add(new Eventos("Survivor Party","30/11/2019","Discoteca Sensation","Kevin Castro","20:00",R.drawable.perfil));
        listEvents.add(new Eventos("Survivor Party","30/11/2019","Discoteca Sensation","Kevin Castro","20:00",R.drawable.perfil));
        listEvents.add(new Eventos("Survivor Party","30/11/2019","Discoteca Sensation","Kevin Castro","20:00",R.drawable.perfil));
        listEvents.add(new Eventos("Survivor Party","30/11/2019","Discoteca Sensation","Kevin Castro","20:00",R.drawable.perfil));
        listEvents.add(new Eventos("Survivor Party","30/11/2019","Discoteca Sensation","Kevin Castro","20:00",R.drawable.perfil));
        listEvents.add(new Eventos("Survivor Party","30/11/2019","Discoteca Sensation","Kevin Castro","20:00",R.drawable.perfil));
        listEvents.add(new Eventos("Survivor Party","30/11/2019","Discoteca Sensation","Kevin Castro","20:00",R.drawable.perfil));
        listEvents.add(new Eventos("Survivor Party","30/11/2019","Discoteca Sensation","Kevin Castro","20:00",R.drawable.perfil));
        listEvents.add(new Eventos("Survivor Party","30/11/2019","Discoteca Sensation","Kevin Castro","20:00",R.drawable.perfil));
        listEvents.add(new Eventos("Survivor Party","30/11/2019","Discoteca Sensation","Kevin Castro","20:00",R.drawable.perfil));
        listEvents.add(new Eventos("Survivor Party","30/11/2019","Discoteca Sensation","Kevin Castro","20:00",R.drawable.perfil));

    }
}

