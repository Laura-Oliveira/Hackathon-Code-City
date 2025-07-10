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
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import com.predio.gesta.gesta_predio.R;
import com.predio.gesta.gesta_predio.fragments.CondominoFragment;
import com.predio.gesta.gesta_predio.fragments.SindicoFragment;
import com.predio.gesta.gesta_predio.fragments.ConstrutoraFragment;


public class PrincipalActivity extends AppCompatActivity {

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
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED);

        //toolbar = findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        //autenticacaoUsuario = ConfiguracaoFirebase.getFirebaseAutenticacao();

        viewPager = findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

        setupTabIcons();

    }

    private void setupTabIcons() {

        TextView tabOne = (TextView) LayoutInflater.from(PrincipalActivity.this).inflate(R.layout.custom_tab, null);
        tabOne.setText("Construtora");
        tabOne.setCompoundDrawablesWithIntrinsicBounds(0, R.mipmap.ic_contrutora, 0, 0);
        tabLayout.getTabAt(0).setCustomView(tabOne);

        TextView tabTwo = (TextView) LayoutInflater.from(PrincipalActivity.this).inflate(R.layout.custom_tab, null);
        tabTwo.setText("Síndico");
        tabTwo.setCompoundDrawablesWithIntrinsicBounds(0, R.mipmap.ic_sindico, 0, 0);
        tabLayout.getTabAt(1).setCustomView(tabTwo);

        TextView tabThree = (TextView) LayoutInflater.from(PrincipalActivity.this).inflate(R.layout.custom_tab, null);
        tabThree.setText("Condomino");
        tabThree.setCompoundDrawablesWithIntrinsicBounds(0, R.mipmap.ic_condomininos, 0, 0);
        tabLayout.getTabAt(2).setCustomView(tabThree);
    }

    private void setupViewPager(ViewPager viewPager) {

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new ConstrutoraFragment(), "Consultas");
        adapter.addFragment(new SindicoFragment(), "Favoritos");
        adapter.addFragment(new CondominoFragment(), "Localização");
        viewPager.setAdapter(adapter);
    }

    public void click(View view) {
        Button buttonManutencao = findViewById(R.id.imageButton3);
        buttonManutencao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent principalIntent = new Intent(PrincipalActivity.this, ManutencaoActivity.class);
                    startActivity(principalIntent);
            }
        });
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