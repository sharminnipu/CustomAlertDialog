package me.sharminnipu.customalertdilog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.custom_alert_dialog.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        alertDialog.setOnClickListener {
            val view = View.inflate(this@MainActivity, R.layout.payment_dialog, null)

            val builder = AlertDialog.Builder(this@MainActivity)
            builder.setView(view)

            val dialog = builder.create()
            dialog.show()
            dialog.window?.setBackgroundDrawableResource(android.R.color.transparent)
            dialog.setCancelable(false)

            view.btn_confirm.setOnClickListener {
                dialog.dismiss()

            }
        }
    }
}