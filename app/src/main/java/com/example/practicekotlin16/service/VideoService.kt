package com.example.practicekotlin16.service

import com.example.practicekotlin16.dto.VideoDto
import retrofit2.Call
import retrofit2.http.GET

interface VideoService {

    @GET("/v3/70a0afde-d74f-434b-936e-5ef9ba559a18")
    fun listVideos(): Call<VideoDto>
}