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

        Log.d("Count", "onCreate: " + db.getCount());

//        Contact shehnaz = new Contact();
//        shehnaz.setName("Shehnaz Rahman");
//        shehnaz.setPhoneNumber("9707785851");
//        db.addContact(shehnaz);

//        Contact c = db.getContact(4);
//        c.setName("Shehnaz Begum");
//        c.setPhoneNumber("8787794519");
//        int updateRow = db.updateContact(c);
//        Log.d("Main", "onCreate: " + "id: " + c.getId() + " Name: " + c.getName() + " Phone: " + c.getPhoneNumber());
//        db.deleteContact(c);
//
//        List<Contact> contactList;
//        contactList = db.getAllContacts();
//
//        for (Contact contact : contactList) {
//            Log.d("Contact", "onCreate: " + contact.getId() + " " + contact.getName());
//        }
    }
}