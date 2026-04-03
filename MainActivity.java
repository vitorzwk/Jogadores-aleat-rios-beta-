package com.jogadoressorteio.jogadoresaleatorios;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button btnSortear;
    TextView tvNome, tvNumero, tvPosicao, tvNacionalidade;
    ImageView ivJogador;

    String[] nomes = {
            "Zinedine Zidane",
            "Kylian Mbappé",
            "Neymar Jr",
            "Ronaldo Fenômeno",
            "Ronaldinho Gaúcho",
            "Lionel Messi",
            "Cristiano Ronaldo",
            "Pelé"
    };

    String[] posicoes = {
            "Meia",
            "Atacante",
            "Atacante",
            "Centroavante",
            "Meia-atacante",
            "Camisa 10",
            "Atacante",
            "Atacante"
    };

    String[] nacionalidades = {
            "França",
            "França",
            "Brasil",
            "Brasil",
            "Brasil",
            "Argentina",
            "Portugal",
            "Brasil"
    };

    int[] fotos = {
            R.drawable.zidane,
            R.drawable.mbappe,
            R.drawable.neymar,
            R.drawable.ronaldo,
            R.drawable.ronaldinho,
            R.drawable.messi,
            R.drawable.cristiano,
            R.drawable.pele
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSortear       = findViewById(R.id.btnSortear);
        tvNome           = findViewById(R.id.tvNome);
        tvNumero         = findViewById(R.id.tvNumero);
        tvPosicao        = findViewById(R.id.tvPosicao);
        tvNacionalidade  = findViewById(R.id.tvNacionalidade);
        ivJogador        = findViewById(R.id.ivJogador);

        btnSortear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sortear();
            }
        });
    }

    private void sortear() {
        Random random = new Random();
        int index = random.nextInt(nomes.length);

        tvNome.setText(nomes[index]);
        tvPosicao.setText("Posição: " + posicoes[index]);
        tvNacionalidade.setText("Nacionalidade: " + nacionalidades[index]);
        tvNumero.setText(String.valueOf(index + 1));
        ivJogador.setImageResource(fotos[index]);

        // Torna o card visível após o sorteio
        findViewById(R.id.cardResultado).setVisibility(View.VISIBLE);
    }
}