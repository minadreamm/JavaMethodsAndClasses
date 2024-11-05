package com.minadag.javamethodsandclasses;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

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

        System.out.println(mathMethods(5,6));
        System.out.println(newMethods("mina"));
    }

    // Class

    public void MyAnimals(){
        Animals myCat = new Animals();
        myCat.name ="Pamuk";
        myCat.foot = 4;
    }

    // Methods
    public int mathMethods(int a, int b){
        return a +b;
    }

    public String newMethods (String string){
        return string + " dag";
    }

}

