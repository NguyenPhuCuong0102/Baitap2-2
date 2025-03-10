package com.example.baitap2_2

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var titleTextView: TextView
    private lateinit var employeeNameTextView: TextView
    private lateinit var employeeButton: Button
    private lateinit var addButton: Button
    private lateinit var bookCheckbox1: CheckBox
    private lateinit var bookCheckbox2: CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        titleTextView = findViewById(R.id.titleTextView)
        employeeNameTextView = findViewById(R.id.employeeNameTextView)
        employeeButton = findViewById(R.id.employeeButton)
        addButton = findViewById(R.id.addButton)
        bookCheckbox1 = findViewById(R.id.bookCheckbox1)
        bookCheckbox2 = findViewById(R.id.bookCheckbox2)

        employeeButton.setOnClickListener {
            val employees = arrayOf("Nguyễn Văn A", "Trần Thị B", "Lê Văn C")
            AlertDialog.Builder(this)
                .setTitle("Chọn nhân viên")
                .setItems(employees) { _, which ->
                    employeeNameTextView.text = employees[which]
                }
                .show()
        }

        bookCheckbox1.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                // Checkbox 1 đã chọn
            } else {
                // Checkbox 1 đã bỏ chọn
            }
        }

        bookCheckbox2.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                // Checkbox 2 đã chọn
            } else {
                // Checkbox 2 đã bỏ chọn
            }
        }
    }
}