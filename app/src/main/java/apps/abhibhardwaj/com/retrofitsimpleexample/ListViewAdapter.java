package apps.abhibhardwaj.com.retrofitsimpleexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.List;

public class ListViewAdapter extends BaseAdapter {

  Context context;
  List<UserModel> userList;

  public ListViewAdapter(Context context,
      List<UserModel> userList) {
    this.context = context;
    this.userList = userList;
  }

  @Override
  public int getCount() {
    return userList.size();
  }

  @Override
  public Object getItem(int position) {
    return null;
  }

  @Override
  public long getItemId(int position) {
    return 0;
  }

  @Override
  public View getView(int position, View view, ViewGroup parent) {

    view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);

    TextView name = view.findViewById(R.id.tv_user_name);
    TextView email = view.findViewById(R.id.tv_user_mail);

    UserModel user = userList.get(position);

    name.setText(user.getName());
    email.setText(user.getEmailAddress());


    return view;
  }
}
