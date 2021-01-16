package com.example.udclient;

import com.example.udclient.classes.LoginDto;
import com.example.udclient.classes.MeetingDetailsDto;
import com.example.udclient.classes.MeetingListDto;
import com.example.udclient.classes.ProductListDto;
import com.example.udclient.classes.RegisterDto;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface HttpSevice {

    @POST ("ud-server/login")
    Call<Map<String,String>> login(@Body LoginDto loginDto);

    @POST("ud-server/register")
    Call<Void> register(@Body RegisterDto registerDto);

    @POST("ud-server/create_meeting")
    Call<Void> createMeeting(@Query("name") String name , @Query("password") String password);

    @POST("ud-server/join_meeting")
    Call<Void> joinMeeting(@Query("name") String name , @Query("password") String password);

    @GET("ud-server/meeting_details_code")
    Call<MeetingDetailsDto> getMeetingDetails(@Query("code") String code);

    @GET("ud-server/person_meetings")
    Call<MeetingListDto> getPersonsMeetingList(@Query("id_person") String idPerson);

    @GET("ud-server/products")
    Call<ProductListDto> getMeetingsProducts(@Query("id_meeting") String id_meeting);

}
