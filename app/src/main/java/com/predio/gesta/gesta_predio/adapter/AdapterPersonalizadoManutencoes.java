package com.predio.gesta.gesta_predio.adapter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import com.predio.gesta.gesta_predio.R;
import com.predio.gesta.gesta_predio.model.Manutencoes;

public class AdapterPersonalizadoManutencoes extends BaseAdapter {

    private final List<Manutencoes> manutencoes;
    private final Activity act;

    public AdapterPersonalizadoManutencoes(List<Manutencoes> favoritos, Activity act) {
        this.manutencoes = favoritos;
        this.act = act;
    }

    @Override
    public int getCount() {
        return manutencoes.size();
    }

    @Override
    public Object getItem(int position) {
        return manutencoes.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = act.getLayoutInflater().inflate(R.layout.lista_manutencoes_personalizada, parent, false);

        Manutencoes favoritos = this.manutencoes.get(position);

        TextView nome = view.findViewById(R.id.lista_favoritos_personalizada_nome);
        TextView data = view.findViewById(R.id.lista_favoritos_personalizada_descricao);
        ImageView imagem = view.findViewById(R.id.lista_favoritos_personalizada_imagem);

        nome.setText(favoritos.getNome());
        data.setText(favoritos.getData());

        return view;
    }
}
