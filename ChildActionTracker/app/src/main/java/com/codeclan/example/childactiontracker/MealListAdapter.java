package com.codeclan.example.childactiontracker;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import static android.R.id.list;

/**
 * Created by user on 31/05/2017.
 */

public class MealListAdapter extends ArrayAdapter<Action> {

        public MealListAdapter(Context context, ArrayList<Action> meals) {
            super(context, 0, meals);
        }

        @Override
        public View getView(int position, View listItemView, ViewGroup parent) {
            if (listItemView == null) {
                listItemView = LayoutInflater.from(getContext()).inflate(R.layout.activity_meal_list, parent, false);
            }
            Action currentMeal = getItem(position);

            TextView time = (TextView) listItemView.findViewById(R.id.time);
            time.setText(currentMeal.getTime().toString());

            TextView activity = (TextView) listItemView.findViewById(R.id.activity);
            activity.setText(currentMeal.getActivity().toString());

            TextView activityResult = (TextView) listItemView.findViewById(R.id.activityResult);
            activityResult.setText(currentMeal.getActivityResult().toString());

            listItemView.setTag(currentMeal);
            return listItemView;

        }
}

