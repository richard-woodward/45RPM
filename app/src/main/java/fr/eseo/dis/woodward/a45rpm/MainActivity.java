package fr.eseo.dis.woodward.a45rpm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

  Button scanQrCodeBtn;
  ToggleButton interneBrowserTgl;
  ImageView record;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    interneBrowserTgl = (ToggleButton)findViewById(R.id.view_option_btn);
    scanQrCodeBtn = (Button)findViewById(R.id.scan_btn);
    record = (ImageView)findViewById(R.id.record);

    scanQrCodeBtn.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View v) {

      }
    });
  }
}
