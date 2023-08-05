package com.example.demo;

import com.example.demo.bean.RoomInfo;
import com.example.demo.bean.UserBean;

import java.util.concurrent.ConcurrentHashMap;

public class MemCons {

    // 온라인 사용자 목록
    public static ConcurrentHashMap<String, UserBean> userBeans = new ConcurrentHashMap<>();

    // 온라인 방 목록
    public static ConcurrentHashMap<String, RoomInfo> rooms = new ConcurrentHashMap<>();

}
