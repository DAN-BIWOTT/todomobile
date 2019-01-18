package sean.princealchemy.todoekspert;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Objects;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private Button login_btn;
    private EditText userNameEditText;
    private EditText userPasswordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        userNameEditText = findViewById(R.id.user_name);
        userPasswordEditText = findViewById(R.id.user_psw);
        login_btn = (Button)findViewById(R.id.login_btn);
        login_btn.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        String username = userNameEditText.getText().toString();
        String password = userPasswordEditText.getText().toString();
        boolean isError = false;
        if (TextUtils.isEmpty(username)){
            isError = true;
            userNameEditText.setError(getString(R.string.this_field_is_required));
        }

        if (TextUtils.isEmpty(password)){
            isError = true;
            userPasswordEditText.setError(getString(R.string.this_field_is_required));
        }
        if (!isError){
            login(username,password);
        }
    }

    public void login(String username,String password){
        if (username.equals("username") && password.equals("password")){
            Toast.makeText(getApplicationContext(), "Success", Toast.LENGTH_SHORT).show();
            setContentView(R.layout.activity_todo_ekspert);
        }
    }
}
