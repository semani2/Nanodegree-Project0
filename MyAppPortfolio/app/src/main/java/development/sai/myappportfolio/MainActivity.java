package development.sai.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements Button.OnClickListener {

    private Button btnPopularMovies;
    private Button btnStockHawk;
    private Button btnBuildItBigger;
    private Button btnMakeAppMaterial;
    private Button btnGoUbiq;
    private Button btnCapstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initControls();
    }

    private void initControls() {
        btnPopularMovies = (Button) findViewById(R.id.popularMoviesButton);
        btnStockHawk = (Button) findViewById(R.id.stockHawkButton);
        btnBuildItBigger = (Button) findViewById(R.id.buildItBiggerButton);
        btnMakeAppMaterial = (Button) findViewById(R.id.makeAppMaterialButton);
        btnGoUbiq = (Button) findViewById(R.id.goUbiButton);
        btnCapstone = (Button) findViewById(R.id.capstoneButton);

        btnPopularMovies.setOnClickListener(this);
        btnStockHawk.setOnClickListener(this);
        btnBuildItBigger.setOnClickListener(this);
        btnMakeAppMaterial.setOnClickListener(this);
        btnGoUbiq.setOnClickListener(this);
        btnCapstone.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view instanceof Button) {
            showToast(((Button)view).getText().toString());
        }
    }

    private void showToast(String appname) {
        Toast.makeText(this, getString(R.string.strButtonLaunch, appname), Toast.LENGTH_LONG).show();
    }
}
