package com.example.wisata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class WisataAlam extends AppCompatActivity {
    ListView listView;
    Button btkembali2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata_alam);

        btkembali2 = (Button) findViewById(R.id.button7);
        btkembali2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WisataAlam.this, MenuUtama.class);
                startActivity(intent);


            }
        });

        listView = (ListView) findViewById(R.id.list);
        String[] values = new String[]{"Air Terjun Batu Dinding", "Alam Mayang",
                "Bukit Buatan Lembah Sari", "Hutan Raya Pekanbaru","Jembangan",
                "Riau Fantasi","Pekanbaru City Park","Tugu Titik NOL Pekanbaru", "Citraland Waterpark","Taman Kota"

        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), Pantai.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), WadukSempor.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), Bukit.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), GoaJatijajar.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 4) {
                    Intent myIntent = new Intent(view.getContext(), Jembangan.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 5) {
                    Intent myIntent = new Intent(view.getContext(), Curug.class);
                    startActivityForResult(myIntent, 0);
                }


            }
        });
    }
}