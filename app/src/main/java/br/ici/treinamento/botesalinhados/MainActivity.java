package br.ici.treinamento.botesalinhados;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void trocarFoto(View view){

        ImageView imageViewFusca = findViewById(R.id.imageViewFusca);

       // ImageView imageViewcombi = findViewById(R.id.imageViewcombi);


        imageViewFusca.animate().scaleX(0.5f).scaleY(0.5f).setDuration(2000);
        //imageViewFusca.animate().rotation(360f).setDuration(2000);
        //imageViewFusca.animate().translationXBy(-1500f).setDuration(2000);
        //imageViewcombi.animate().alpha(0f).setDuration(2000);



    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*ImageView imageViewFusca = findViewById(R.id.imageViewFusca);

        imageViewFusca.setTranslationX(1500f);*/
    }
}
