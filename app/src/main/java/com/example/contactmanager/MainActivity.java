package com.example.contactmanager;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.contactmanager.data.DatabaseHandler;
import com.example.contactmanager.model.Contact;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private ArrayList<String> contactArrayList;
    private ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview);
        contactArrayList = new ArrayList<>();

        DatabaseHandler db = new DatabaseHandler(MainActivity.this);

//        Log.d("Count", "onCreate: " + db.getCount());

//        Contact shehnaz = new Contact();
//        shehnaz.setName("Shehnaz Rahman");
//        shehnaz.setPhoneNumber("9707785851");
//        db.addContact(shehnaz);
//
//        db.addContact(new Contact("Atiqur Rahman", "7002018923"));
//        db.addContact(new Contact("Aminur Rahman", "8486265321"));
//        db.addContact(new Contact("Amina Rahman", "9678069530"));
//        db.addContact(new Contact("Sofiur Rahman", "8822943002"));
//        db.addContact(new Contact("Fatema Rahman", "9876543210"));
//        db.addContact(new Contact("Afsen Rahman", "9876543210"));
//        db.addContact(new Contact("Farhan Rahman", "9876543210"));



//        Contact c = db.getContact(4);
//        c.setName("Shehnaz Begum");
//        c.setPhoneNumber("8787794519");
//        int updateRow = db.updateContact(c);
//        Log.d("Main", "onCreate: " + "id: " + c.getId() + " Name: " + c.getName() + " Phone: " + c.getPhoneNumber());
//        db.deleteContact(c);
//
        List<Contact> contactList;
        contactList = db.getAllContacts();

        for (Contact contact : contactList) {
            Log.d("Contact", "onCreate: " + contact.getId() + " " + contact.getName());
            contactArrayList.add(contact.getName());
        }

        // create array adapter
        arrayAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                contactArrayList
        );

        // add to our listview
        listView.setAdapter(arrayAdapter);

        // Attach event listener to listview
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.d("List", "onItemClick: " + contactArrayList.get(i));
            }
        });
    }
}