package sg.edu.rp.c346.id19048236.demotodolist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<ToDoItem> items;

    public CustomAdapter(Context context, int resource, ArrayList<ToDoItem> objects){
        super(context,resource,objects);
        parent_context=context;
        layout_id=resource;
        items=objects;

    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)
                parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(layout_id, parent, false);

        TextView tvName = rowView.findViewById(R.id.textViewTitle);
        TextView tvVersion = rowView.findViewById(R.id.textViewDate);

        ToDoItem currentVersion = items.get(position);

        tvName.setText(currentVersion.getTitle());
        tvVersion.setText(currentVersion.toString());

        return rowView;
    }

}
