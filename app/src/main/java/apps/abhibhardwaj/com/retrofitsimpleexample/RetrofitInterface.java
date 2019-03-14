package apps.abhibhardwaj.com.retrofitsimpleexample;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitInterface {

    @GET("users")
    Call<List<UserModel>> getUsers();

}
