package com.example.alc4phase1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    TextView tv_Name;
    TextView tv_track;
    TextView tv_country;
    TextView tv_email;
    TextView tv_phoneNum;
    TextView tv_slackUsername;
    UserProfile userProfile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        setTitle("My Profile");
        initComponent();

        updateInfo(userProfile);
    }

    private void updateInfo(UserProfile profile) {
        tv_Name.setText(profile.getName());
        tv_track.setText(profile.getTrack());
        tv_email.setText(profile.getEmail());
        tv_country.setText(profile.getCountry());
        tv_phoneNum.setText(profile.getPhoneNumber());
        tv_slackUsername.setText(profile.getSlackUserName());
    }

    private void initComponent() {
        userProfile = new UserProfile("Abdulazeez Abdullahi", "Android","Nigeria",
                "abdulazeezabdullahi57@gmail.com","+2348102951387",
                "@Abdullahi");

        tv_Name = findViewById(R.id.profile_name);
        tv_track = findViewById(R.id.learning_track);
        tv_country = findViewById(R.id.country);
        tv_email = findViewById(R.id.email_address);
        tv_phoneNum = findViewById(R.id.phone_num);
        tv_slackUsername = findViewById(R.id.slack_username);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home){
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
