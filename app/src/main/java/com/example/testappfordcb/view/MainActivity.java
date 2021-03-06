package com.example.testappfordcb.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import com.example.testappfordcb.R;
import com.example.testappfordcb.adapter.CharacterAdapter;
import com.example.testappfordcb.model.Characters;
import com.example.testappfordcb.response.CharacterResponse;
import com.example.testappfordcb.view_model.CharacterViewModel;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();
    private RecyclerView recyclerView;
    private ProgressBar progressBar;
    private LinearLayoutManager layoutManager;
    private ArrayList<Characters>charactersArrayList = new ArrayList<>();
    CharacterViewModel  characterVM;
    private CharacterAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar = findViewById(R.id.progress_bar);
        recyclerView = findViewById(R.id.characters_rv);
        layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setHasFixedSize(true);
        adapter = new CharacterAdapter(MainActivity.this,charactersArrayList);
        recyclerView.setAdapter(adapter);
        characterVM  = ViewModelProviders.of(this).get(CharacterViewModel.class);

        //init();
        getCharacters();


    }

    private void getCharacters() {

            progressBar.setVisibility(View.VISIBLE);
            final Observer<CharacterResponse> observer = new Observer<CharacterResponse>() {
                @Override
                public void onChanged(CharacterResponse characterResponse) {
                    if ( characterResponse.getResults() != null) {

                        progressBar.setVisibility(View.GONE);
                        List<Characters> charactersList = characterResponse.getResults();
                        charactersArrayList.addAll(charactersList);
                        adapter.notifyDataSetChanged();
                    }
                }
            };
            characterVM.getCharacterResponseLiveData().observe(this, observer);
        }

//    private void init(){
//    }
}