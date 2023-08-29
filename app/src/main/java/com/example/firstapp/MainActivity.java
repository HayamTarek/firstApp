package com.example.firstapp;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

class Course {
    String name;
    String code;
    int creditHours;

    public Course() {
    }

    public int getCreditHours() {
        return creditHours;
    }

    public String getGradeString(double grade) {
        return grade + "";
    }

    public double getGradeValue(String grade) {
        return Double.parseDouble(grade);
    }

}

class person {
    String name;
    int age;

    public person() {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sayHi();
        sayName("Hayam");
        Toast.makeText(this, "the current year is " + curr_year(), Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "this year is " + this_year(1999), Toast.LENGTH_SHORT).show();

    }

    //void method without parameter
    void sayHi() {
        Toast.makeText(this, "Hi", Toast.LENGTH_SHORT).show();
    }

    //void method with parameter
    void sayName(String name) {
        Toast.makeText(this, name, Toast.LENGTH_SHORT).show();
    }

    //return method without parameter
    int curr_year() {
        return 2023;
    }

    //return method with parameter
    int this_year(int year) {
        return year;
    }
}