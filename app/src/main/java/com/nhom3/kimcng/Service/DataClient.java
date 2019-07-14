package com.nhom3.kimcng.Service;


import com.nhom3.kimcng.model.signup.SignUpModel;
import com.nhom3.kimcng.view.signup.SignUpView;

import java.util.List;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface DataClient {
    @Multipart
    @POST("uploadimage.php")
    Call<String> UploadPhot(@Part MultipartBody.Part photo);

    @FormUrlEncoded
    @POST("insert.php")
    Call<String> insertData(@Field("username") String username,
                            @Field("password") String password,
                            @Field("image") String image
    );

    @FormUrlEncoded
    @POST("login.php")
    Call<List<SignUpModel>> signinData(@Field("username") String user,
                                       @Field("password") String passwword
    );

}
