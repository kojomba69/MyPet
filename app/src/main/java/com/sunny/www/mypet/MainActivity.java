package com.sunny.www.mypet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox checkAgree;
    RadioGroup rGroup;
    RadioButton rdoDog, rdoCat, rdoRabit;
    Button btnOk;
    ImageView imgPet;
    TextView text1, text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1 = (TextView)findViewById(R.id.text1);
        text2 = (TextView)findViewById(R.id.text2);
        checkAgree= (CheckBox)findViewById(R.id.chkAgree);
        this.rGroup=(RadioGroup) findViewById(R.id.rGrop1);
        this.rdoDog=(RadioButton) findViewById(R.id.rdoDog);
        this.rdoCat=(RadioButton) findViewById(R.id.rdoCat);
        this.rdoRabit=(RadioButton) findViewById(R.id.rdoRabit);
        this.btnOk=(Button) findViewById(R.id.btnOk);
        this.imgPet=(ImageView) findViewById(R.id.imgPat);
        checkAgree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(checkAgree.isChecked()){
                    text2.setVisibility(View.VISIBLE);
                    rGroup.setVisibility(View.VISIBLE);
                    btnOk.setVisibility(View.VISIBLE);
                    imgPet.setVisibility(View.VISIBLE);
                }
                else{
                    text2.setVisibility(View.INVISIBLE);
                    rGroup.setVisibility(View.INVISIBLE);
                    btnOk.setVisibility(View.INVISIBLE);
                    imgPet.setVisibility(View.INVISIBLE);
                }
            }
        });
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (rGroup.getCheckedRadioButtonId()){
                    case R.id.rdoDog:
                    imgPet.setImageResource(R.drawable.dog2);break;
                    case R.id.rdoCat:
                    imgPet.setImageResource(R.drawable.cat);break;
                    case R.id.rdoRabit:
                    imgPet.setImageResource(R.drawable.rabbit);break;
                    default:
                        Toast.makeText(getApplication(),"동물을 선택하세요", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
