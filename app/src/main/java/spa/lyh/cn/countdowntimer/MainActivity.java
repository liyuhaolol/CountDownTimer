package spa.lyh.cn.countdowntimer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import spa.lyh.cn.lib_timer.CountDownTimer;

public class MainActivity extends AppCompatActivity {
    TextView text;

    int time = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.text);
        text.setText(time+"");
        new CountDownTimer(time*1000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                text.setText(time--+"");
            }

            @Override
            public void onFinish() {
                text.setText("结束");
            }
        }.start();
    }
}
