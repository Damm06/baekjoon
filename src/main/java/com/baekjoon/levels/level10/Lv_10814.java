package com.baekjoon.levels.level10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Lv_10814 {
    public static void main(String[] args) throws IOException {
        //배열을 이용하지 않고 클래스 객체를 만들어 배열처럼 사용하는 방법
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Person[] p = new Person[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            p[i] = new Person(age, name);
        }

        Arrays.sort(p, new Comparator<Person>() { //타입을 Person으로 두고 나이순으로 정렬
            @Override
            public int compare(Person s1, Person s2) {
                return s1.age - s2.age;
            }
        });

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            //객체배열의 객체를 출력하면 해당 인덱스의 객체의 toString() 이 출력된다.
            sb.append(p[i]);
        }
        System.out.println(sb);
    }

    /*
    * 이 Person 클래스를 하나의 타입(=객체 타입)으로 하여 배열을 생성해준뒤,
    * 해당 객체의 나이끼리 비교하여 정렬.
    *
    * 정렬 방법은 Arrays.sort() 를 확장하여 정렬할 수 있다.
    * Person 클래스에 Comparable 을 통해 정렬을 할 수도 있다.
    * */
    public static class Person {
        int age;
        String name;

        public Person(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public String toString() {
            return age + " " + name + "\n";
        }
    }
}
