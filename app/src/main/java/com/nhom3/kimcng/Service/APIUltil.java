package com.nhom3.kimcng.Service;

public class APIUltil {
    public static final String baseUrl = "http://192.168.0.102/QLSV/";

    public static DataClient getData(){
        return RetrofitClient.getRetrofit(baseUrl).create(DataClient.class);
    }
}
