package apps.abhibhardwaj.com.retrofitsimpleexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

  List<UserModel> userList;

  ListView listView;
  ListViewAdapter adapter;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    listView = findViewById(R.id.list_view);

    RetrofitInterface service = RetrofitClient.initializeRetrofitInstance().create(RetrofitInterface.class);

    Call<List<UserModel>> call = service.getUsers();

    call.enqueue(new Callback<List<UserModel>>() {
      @Override
      public void onResponse(Call<List<UserModel>> call, Response<List<UserModel>> response) {
            userList = response.body();
            int i = userList.size();

            adapter = new ListViewAdapter(MainActivity.this, userList);
            listView.setAdapter(adapter);
      }

      @Override
      public void onFailure(Call<List<UserModel>> call, Throwable t) {
        Log.d("Retro", "Error " + t.getMessage());
      }
    });










  }
}
