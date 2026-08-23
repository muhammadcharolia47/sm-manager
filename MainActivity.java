package com.smmanager.app;
import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
 @Override public void onCreate(Bundle savedInstanceState) {
  super.onCreate(savedInstanceState); setContentView(R.layout.activity_main);
  int[] ids={R.id.btnSales,R.id.btnPurchase,R.id.btnStock,R.id.btnCustomers,R.id.btnExpenses,R.id.btnReports};
  String[] names={"Sales & Invoices","Purchase Bills","Stock","Customers","Expenses","Reports"};
  for(int i=0;i<ids.length;i++){ final String n=names[i]; findViewById(ids[i]).setOnClickListener(v->Toast.makeText(this,n+" module coming next",Toast.LENGTH_SHORT).show()); }
 }
}