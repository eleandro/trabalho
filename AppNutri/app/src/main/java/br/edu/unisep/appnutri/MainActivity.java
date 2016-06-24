package br.edu.unisep.appnutri;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.Profile;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;
import com.facebook.login.widget.ProfilePictureView;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private LoginButton btnLogin;
    private ProfilePictureView imagemPerfil;


    private CallbackManager cbManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.btnLogin= (LoginButton)findViewById(R.id.btnLogin);
        this.imagemPerfil = (ProfilePictureView) findViewById(R.id.imagemPerfil);

       // this.inicializarFacebook();
        this.inicializaLogin();
    }

    private void inicializarFacebook(){
        AccessToken token = AccessToken.getCurrentAccessToken();
        if (token != null) {
            Profile perfil = Profile.getCurrentProfile();
            this.imagemPerfil.setProfileId(perfil.getId());


            startActivityObjetivo();
            finish();
        }
    }

    private void inicializaLogin(){
        this.cbManager = CallbackManager.Factory.create();

        this.btnLogin.setReadPermissions(Arrays.asList("public_profile"));
        this.btnLogin.registerCallback(cbManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {
                startActivityObjetivo();

            }

            @Override
            public void onCancel() {
                Toast.makeText(MainActivity.this, "o usuario cancelou o login", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onError(FacebookException error) {
                Toast.makeText(MainActivity.this, "error ao executar o login", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void startActivityObjetivo() {
        Intent i = new Intent(this, activity_objetivo.class);
        startActivity(i);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        cbManager.onActivityResult(requestCode, resultCode,data);
    }
}
