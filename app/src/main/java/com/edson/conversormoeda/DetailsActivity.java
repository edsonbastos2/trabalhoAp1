package com.edson.conversormoeda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DetailsActivity extends AppCompatActivity implements View.OnClickListener {

    private  ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        this.mViewHolder.buttonid = findViewById(R.id.button_id);
        this.mViewHolder.buttonid.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.button_id){
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }

    }

    private static class ViewHolder{
        Button buttonid;
    }
}
