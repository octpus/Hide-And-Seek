package abcc.aso.hideseek;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class JoinGroupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join_group);
        //縦画面に固定
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        //イベントをセットするIDを取得
        EditText joinID = (EditText)findViewById(R.id.joinGroupID);
        Button decide = (Button)findViewById(R.id.decide);
        Button back = (Button)findViewById(R.id.back);

        //ボタン押下時のイベントを追加(決定ボタン)
        decide.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                //入力したグループIDが存在し、かつ参加人数が上限数に達していない時
                //if(  ){
                //Intent intent = new Intent(JoinGroupActivity.this, HomeActivty.class);
                //入力したグループIDが存在しない時
                //}else if(  ){
                    //
                //入力したグループIDは存在したが、参加人数が上限数に達していた時
                //}else if(  ){
                    //
                //}
            }
        });
        //ボタン押下時のイベントを追加(戻るボタン)
        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //Intent intent = new Intent(JoinGroupActivity.this, GameTopActivty.class);
            }
        });
    }
}
