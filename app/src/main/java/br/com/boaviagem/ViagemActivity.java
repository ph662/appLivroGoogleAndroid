package br.com.boaviagem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ViagemActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nova_viagem);
    }

    public void selecionarOpcao(View view) {
        switch (view.getId()) {
            case R.id.nova_viagem:
                startActivity(new Intent(this, ViagemActivity.class));
                break;
        }
    }
}
