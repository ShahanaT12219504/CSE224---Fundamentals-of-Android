package com.example.application8_10

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.example.application8_10.R

class RecipeApp : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe_app)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.title = "Recipe App"

        val breakfastButton: Button = findViewById(R.id.button2)
        val lunchButton: Button = findViewById(R.id.button6)
        val snacksButton: Button = findViewById(R.id.button7)
        val dinnerButton: Button = findViewById(R.id.button8)
        val exitButton: Button = findViewById(R.id.button9)

        breakfastButton.setOnClickListener { showPopup(it, R.menu.breakfast_menu) }
        lunchButton.setOnClickListener { showPopup(it, R.menu.lunch_menu) }
        snacksButton.setOnClickListener { showPopup(it, R.menu.snacks_menu) }
        dinnerButton.setOnClickListener { showPopup(it, R.menu.dinner_menu) }

        exitButton.setOnClickListener {
            val exitDialog = AlertDialog.Builder(this)
                .setTitle("Exit")
                .setMessage("Do you want to exit?")
                .setPositiveButton("Yes") { _, _ -> finish() }
                .setNegativeButton("No") { dialog, _ -> dialog.dismiss() }
                .setCancelable(false)
                .create()
            exitDialog.show()
        }
    }

    private fun showPopup(view: View, menuRes: Int) {
        val popup = androidx.appcompat.widget.PopupMenu(this, view)
        popup.menuInflater.inflate(menuRes, popup.menu)
        popup.setOnMenuItemClickListener { item ->
            val intent = Intent(this, RecipeActivity::class.java)
            intent.putExtra("DISH_NAME", item.title.toString())
            startActivity(intent)
            true
        }
        popup.show()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.recipe_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.menu_get_ideas -> Toast.makeText(this, "Get Ideas clicked", Toast.LENGTH_SHORT).show()
            R.id.menu_recipe_of_the_day -> Toast.makeText(this, "Recipe of the Day clicked", Toast.LENGTH_SHORT).show()
            R.id.menu_popular -> Toast.makeText(this, "Popular clicked", Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }
}
