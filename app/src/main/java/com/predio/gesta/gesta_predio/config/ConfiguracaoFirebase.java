package com.predio.gesta.gesta_predio.config;

import android.app.Application;

import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public final class ConfiguracaoFirebase {

    private static FirebaseDatabase database;
    private static FirebaseApp ap;
    private static DatabaseReference referenciaFirebase; //Variável para acesso ao banco de dados do Firebase
    private static FirebaseAuth autenticacao; //Variável para acesso a autenticação de usuário no Firebase
    private static FirebaseUser user;

    public static DatabaseReference getFirebase() { //Método para obter uma instância do banco de dados do Firebase

        //ap.initializeApp(new Application());
        if (referenciaFirebase == null) {
            referenciaFirebase = FirebaseDatabase.getInstance().getReference();

        }
        return referenciaFirebase;
    }

    public static FirebaseDatabase getDatabase() {
        if (database == null) {
            database = FirebaseDatabase.getInstance();
            database.setPersistenceEnabled(true);
        }
        return database;
    }

    public static FirebaseAuth getFirebaseAutenticacao() { //Método para obter uma instância da Autenticação do Firebase

        if (autenticacao == null) {
            autenticacao = FirebaseAuth.getInstance();

        }
        return autenticacao;
    }

    public static FirebaseUser getUsuarioLogado() { // retorna o usuário que está logado no momento
        user = ConfiguracaoFirebase.getFirebaseAutenticacao().getCurrentUser(); // retorna o usuário logado

        return user;

    }

}
