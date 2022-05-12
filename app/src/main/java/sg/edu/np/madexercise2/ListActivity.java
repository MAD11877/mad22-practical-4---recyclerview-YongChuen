package sg.edu.np.madexercise2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {

    private ImageView imageView2;
    private ArrayList<User> mUser = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        while (mUser.size()<20){
            User user = new User();
            mUser.add(user);
        }

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(mUser,this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));



        /*Intent act = new Intent(ListActivity.this, MainActivity.class);

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Profile");
        builder.setMessage("MADness");
        builder.setPositiveButton("View", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                int value = (int) Math.round((Math.random() * 1000000000)+1000000000);
                act.putExtra("key", value);
                startActivity(act);

            }

        });
        builder.setNegativeButton("Close", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
            }


        });*/

        imageView2 = findViewById(R.id.image1);

        /*imageView2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                builder.show();
            }
        });*/
    }


}