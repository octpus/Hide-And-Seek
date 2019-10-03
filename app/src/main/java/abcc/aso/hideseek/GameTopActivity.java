package abcc.aso.hideseek;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GameTopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_top);

        Button decide = (Button)findViewById(R.id.decideGroup);
        Button join = (Button)findViewById(R.id.joinGroup);

        decide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(GameTopActivity.this);
                builder
                        .setPositiveButton("戻る", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                // ボタンをクリックしたときの動作
                                //ダイアログを終了する
                                GameTopActivity.this.finish();

                            }
                        });
                builder.setTitle("グループID")
                        //グループIDを表示
                        .setTitle("＊＊＊＊")
                        .setNegativeButton("開始", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                // ボタンをクリックしたときの動作
                                Intent intent = new Intent( GameTopActivity.this, GameStandByActivity.class);

                            }
                        });
                builder.show();
            }
        });
        join.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(GameTopActivity.this);
                builder.setTitle("")
                        .setPositiveButton("戻る", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                // ボタンをクリックしたときの動作

                            }
                        });
                builder.setTitle("")
                        .setNegativeButton("決定", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                // ボタンをクリックしたときの動作

                            }
                        });
                builder.show();
            }
        });
    }
}
