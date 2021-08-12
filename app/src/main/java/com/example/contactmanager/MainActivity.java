package com.example.contactmanager;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import com.example.contactmanager.data.DatabaseHandler;
import com.example.contactmanager.model.Contact;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseHandler db = new DatabaseHandler(MainActivity.this);

        Contact shehnaz = new Contact();
        shehnaz.setName("Shehnaz Rahman");
        shehnaz.setPhoneNumber("9707785851");
        db.addContact(shehnaz);

        List<Contact> contactList;

        contactList = db.getAllContacts();

        for (Contact contact : contactList) {
            Log.d("Contact", "onCreate: " + contact.getName());
        }
    }
}