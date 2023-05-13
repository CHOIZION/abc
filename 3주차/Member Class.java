package com.javaex.problem01;

// 회원 클래스를 정의
public class Member {
    // 회원 아이디를 나타내는 필드
    private String id;

    // 회원 이름을 나타내는 필드
    private String name;

    // 회원의 포인트를 나타내는 필드
    private int point;

    // 기본 생성자
    public Member() {
    }

    // 회원 정보를 설정하는 생성자
    public Member(String id, String name, int point) {
        this.id = id;
        this.name = name;
        this.point = point;
    }

    // 회원 아이디를 반환하는 메소드
    public String getId() {
        return id;
    }

    // 회원 아이디를 설정하는 메소드
    public void setId(String id) {
        this.id = id;
    }

    // 회원 이름을 반환하는 메소드
    public String getName() {
        return name;
    }

    // 회원 이름을 설정하는 메소드
    public void setName(String name) {
        this.name = name;
    }

    // 회원 포인트를 반환하는 메소드
    public int getPoint() {
        return point;
    }

    // 회원 포인트를 설정하는 메소드
    public void setPoint(int point) {
        this.point = point;
    }
}
