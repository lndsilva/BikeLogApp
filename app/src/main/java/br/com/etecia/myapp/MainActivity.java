package br.com.etecia.myapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView idRecBikes;
    List<Bike> lstBike;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        idRecBikes = findViewById(R.id.idRecBikes);

        lstBike = new ArrayList<>();
        lstBike.add(new Bike("Mountain Bike", "É uma bicicleta projetada especificamente para pedalar em terrenos off-road, como trilhas, estradas de terra, montanhas e ambientes acidentados.", 5, "5.0", R.drawable.bicycle));
        lstBike.add(new Bike("Speed", "É uma bicicleta projetada especificamente para pedalar em terrenos off-road, como trilhas, estradas de terra, montanhas e ambientes acidentados.", 6, "6.0", R.drawable.speed));
        lstBike.add(new Bike("Urbana", "É uma bicicleta projetada especificamente para pedalar em terrenos off-road, como trilhas, estradas de terra, montanhas e ambientes acidentados.", 9, "9.0", R.drawable.bicycle));
        lstBike.add(new Bike("Elétrica (E-Bike)", "É uma bicicleta projetada especificamente para pedalar em terrenos off-road, como trilhas, estradas de terra, montanhas e ambientes acidentados.", 8, "8.0", R.drawable.bicycle));
        lstBike.add(new Bike("Gravel", "É uma bicicleta projetada especificamente para pedalar em terrenos off-road, como trilhas, estradas de terra, montanhas e ambientes acidentados.", 4, "4.0", R.drawable.bicycle));
        lstBike.add(new Bike("Dobrável", "É uma bicicleta projetada especificamente para pedalar em terrenos off-road, como trilhas, estradas de terra, montanhas e ambientes acidentados.", 3, "3.0", R.drawable.bicycle));
        lstBike.add(new Bike("BMX", "É uma bicicleta projetada especificamente para pedalar em terrenos off-road, como trilhas, estradas de terra, montanhas e ambientes acidentados.", 2, "2.0", R.drawable.bicycle));
        lstBike.add(new Bike("Cruiser / Passeio", "É uma bicicleta projetada especificamente para pedalar em terrenos off-road, como trilhas, estradas de terra, montanhas e ambientes acidentados.", 1, "1.0", R.drawable.bicycle));
        lstBike.add(new Bike("Fixa (Fixed Gear)", "É uma bicicleta projetada especificamente para pedalar em terrenos off-road, como trilhas, estradas de terra, montanhas e ambientes acidentados.", 9, "9.0", R.drawable.bicycle));
        lstBike.add(new Bike("Carga", "É uma bicicleta projetada especificamente para pedalar em terrenos off-road, como trilhas, estradas de terra, montanhas e ambientes acidentados.", 8, "8.0", R.drawable.bicycle));

        AdapterBike adapterBike = new AdapterBike(getApplicationContext(), lstBike);

        idRecBikes.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        idRecBikes.setHasFixedSize(true);

        idRecBikes.setAdapter(adapterBike);

    }
}