package com.predio.gesta.gesta_predio.activity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.predio.gesta.gesta_predio.activity.LoginActivity;


import java.util.ArrayList;
import java.util.List;

import com.predio.gesta.gesta_predio.R;
import com.predio.gesta.gesta_predio.fragments.CondominoFragment;
import com.predio.gesta.gesta_predio.fragments.SindicoFragment;
import com.predio.gesta.gesta_predio.fragments.ConstrutoraFragment;

import com.predio.gesta.gesta_predio.helper.*;


public class PrincipalActivity extends AppCompatActivity {

    //Drawerr com valor nulo para fechar caso o usuario aperte "voltar"
    //private Drawer result = null;

    private String nomeUser, emailUser, fotoUser;

    private ProgressDialog mProgressDialog;

    //private FirebaseAuth autenticacaoUsuario;
    //private GoogleApiClient googleApiClient;

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        //toolbar = findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        //autenticacaoUsuario = ConfiguracaoFirebase.getFirebaseAutenticacao();

        viewPager = findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

        setupTabIcons();

        //toolbar = findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
        // Pegar o ID do usuário logado
        //Preferencias preferencesUser = new Preferencias(PrincipalActivity.this);
        //String idUsuarios = preferencesUser.getIdentificador();


    }

    private void setupTabIcons() {

        TextView tabOne = (TextView) LayoutInflater.from(PrincipalActivity.this).inflate(R.layout.custom_tab, null);
        tabOne.setText("Construtora");
        tabOne.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_tab_agenda, 0, 0);
        tabLayout.getTabAt(0).setCustomView(tabOne);

        TextView tabTwo = (TextView) LayoutInflater.from(PrincipalActivity.this).inflate(R.layout.custom_tab, null);
        tabTwo.setText("Síndico");
        tabTwo.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_tab_favoritos, 0, 0);
        tabLayout.getTabAt(1).setCustomView(tabTwo);

        TextView tabThree = (TextView) LayoutInflater.from(PrincipalActivity.this).inflate(R.layout.custom_tab, null);
        tabThree.setText("Condomino");
        tabThree.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_tab_mapa, 0, 0);
        tabLayout.getTabAt(2).setCustomView(tabThree);
    }

    private void setupViewPager(ViewPager viewPager) {

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new ConstrutoraFragment(), "Consultas");
        adapter.addFragment(new SindicoFragment(), "Favoritos");
        adapter.addFragment(new CondominoFragment(), "Localização");
        viewPager.setAdapter(adapter);
    }

    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }


}