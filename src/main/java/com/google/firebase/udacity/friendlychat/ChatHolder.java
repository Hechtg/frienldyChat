package com.google.firebase.udacity.friendlychat;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Guy Hecht on 25/05/2017.
 */

public class ChatHolder extends RecyclerView.ViewHolder {
    private final TextView mNameField;
    private final TextView mTextField;

    public ChatHolder(View itemView){
        super(itemView);
        mNameField = (TextView) itemView.findViewById(android.R.id.text1);
        mTextField = (TextView) itemView.findViewById(android.R.id.text2);
    }

    public void setName(String name) {
        mNameField.setText(name);
    }

    public void setText(String text) {
        mTextField.setText(text);
    }
}
