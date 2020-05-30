package com.xiaofeng.androidlibs;

import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class DemoViewHolder extends RecyclerView.ViewHolder {
	TextView tagText, tagSize;
	public DemoViewHolder(View itemView) {
		super(itemView);
		tagText = itemView.findViewById(R.id.tag_text);
		tagSize = itemView.findViewById(R.id.tag_count);
	}

	public void setTagText(String tag) {
		tagText.setText(tag);


	}


}
