package com.example.application8_10

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class RecipeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe)

        val recipeImage: ImageView = findViewById(R.id.recipeImage)
        val recipeTitle: TextView = findViewById(R.id.recipeTitle)
        val preparationTime: TextView = findViewById(R.id.preparationTime)
        val ingredients: TextView = findViewById(R.id.ingredients)
        val steps: TextView = findViewById(R.id.steps)
        val videoLink: TextView = findViewById(R.id.videoLink)
        val backButton: Button = findViewById(R.id.backButton)


        val dishName = intent.getStringExtra("DISH_NAME") ?: "Unknown Recipe"

        when (dishName) {
            "Pancakes" -> {
                recipeImage.setImageResource(R.drawable.img_5)
                recipeTitle.text = dishName
                preparationTime.text = "Preparation Time: 10 minutes"
                ingredients.text = "Ingredients: Flour, Milk, Eggs, Sugar, Baking Powder"
                steps.text = "Steps:\n1. Mix ingredients.\n2. Heat a pan.\n3. Cook until golden brown."
                videoLink.setOnClickListener {
                    val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.allrecipes.com/recipe/21014/good-old-fashioned-pancakes/"))
                    startActivity(intent)
                }
            }
            "Omelette" -> {
                recipeImage.setImageResource(R.drawable.img_6)
                recipeTitle.text = dishName
                preparationTime.text = "Preparation Time: 5 minutes"
                ingredients.text = "Ingredients: Eggs, Cheese, Vegetables, Salt, Pepper"
                steps.text = "Steps:\n1. Beat eggs.\n2. Add ingredients.\n3. Cook in a pan."
                videoLink.setOnClickListener {
                    val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://joyfoodsunshine.com/omelette-recipe/"))
                    startActivity(intent)
                }
            }
            "French Toast" -> {
                recipeImage.setImageResource(R.drawable.img_7)
                recipeTitle.text = dishName
                preparationTime.text = "Preparation Time: 8 minutes"
                ingredients.text = "Ingredients: Bread, Eggs, Milk, Sugar, Cinnamon"
                steps.text = "Steps:\n1. Dip bread in mixture.\n2. Cook on a griddle."
                videoLink.setOnClickListener {
                    val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://tastesbetterfromscratch.com/classic-french-toast/"))
                    startActivity(intent)
                }
            }
            "Waffles" -> {
                recipeImage.setImageResource(R.drawable.img_8)
                recipeTitle.text = dishName
                preparationTime.text = "Preparation Time: 15 minutes"
                ingredients.text = "Ingredients: Flour, Eggs, Milk, Baking Powder, Butter"
                steps.text = "Steps:\n1. Mix ingredients.\n2. Pour into waffle iron.\n3. Cook until golden."
                videoLink.setOnClickListener {
                    val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.allrecipes.com/recipe/20513/classic-waffles/"))
                    startActivity(intent)
                }
            }


            // Lunch Recipes
            "Grilled Cheese Sandwich" -> {
                recipeImage.setImageResource(R.drawable.img_9)
                recipeTitle.text = dishName
                preparationTime.text = "Preparation Time: 10 minutes"
                ingredients.text = "Ingredients: Bread, Cheese, Butter"
                steps.text = "Steps:\n1. Butter bread.\n2. Add cheese.\n3. Cook in a pan."
                videoLink.setOnClickListener {
                    val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.recipetineats.com/grilled-cheese-sandwich/"))
                    startActivity(intent)
                }
            }
            "Caesar Salad" -> {
                recipeImage.setImageResource(R.drawable.img_10)
                recipeTitle.text = dishName
                preparationTime.text = "Preparation Time: 15 minutes"
                ingredients.text = "Ingredients: Lettuce, Croutons, Parmesan, Caesar Dressing"
                steps.text = "Steps:\n1. Toss ingredients together.\n2. Serve chilled."
                videoLink.setOnClickListener {
                    val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://natashaskitchen.com/caesar-salad-recipe/"))
                    startActivity(intent)
                }
            }
            "Spaghetti Bolognese" -> {
                recipeImage.setImageResource(R.drawable.img_2)
                recipeTitle.text = dishName
                preparationTime.text = "Preparation Time: 30 minutes"
                ingredients.text = "Ingredients: Spaghetti, Ground Beef, Tomato Sauce, Onion, Garlic"
                steps.text = "Steps:\n1. Cook spaghetti.\n2. Prepare sauce.\n3. Combine and serve."
                videoLink.setOnClickListener {
                    val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.recipetineats.com/spaghetti-bolognese/"))
                    startActivity(intent)
                }
            }
            "Chicken Wrap" -> {
                recipeImage.setImageResource(R.drawable.img_12)
                recipeTitle.text = dishName
                preparationTime.text = "Preparation Time: 15 minutes"
                ingredients.text = "Ingredients: Chicken, Tortilla, Vegetables, Sauce"
                steps.text = "Steps:\n1. Cook chicken.\n2. Wrap with vegetables and sauce."
                videoLink.setOnClickListener {
                    val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tamingtwins.com/chicken-wraps/"))
                    startActivity(intent)
                }
            }

            // Snacks Recipes
            "Nachos" -> {
                recipeImage.setImageResource(R.drawable.img_3)
                recipeTitle.text = dishName
                preparationTime.text = "Preparation Time: 10 minutes"
                ingredients.text = "Ingredients: Tortilla Chips, Cheese, Jalapeños, Salsa"
                steps.text = "Steps:\n1. Layer chips and cheese.\n2. Bake until cheese melts."
                videoLink.setOnClickListener {
                    val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.simplyrecipes.com/recipes/nachos/"))
                    startActivity(intent)
                }
            }
            "Spring Rolls" -> {
                recipeImage.setImageResource(R.drawable.img_13)
                recipeTitle.text = dishName
                preparationTime.text = "Preparation Time: 20 minutes"
                ingredients.text = "Ingredients: Vegetables, Wrapper, Soy Sauce"
                steps.text = "Steps:\n1. Prepare filling.\n2. Roll in wrapper.\n3. Fry until crispy."
                videoLink.setOnClickListener {
                    val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.recipetineats.com/spring-rolls/"))
                    startActivity(intent)
                }
            }
            "Granola Bar" -> {
                recipeImage.setImageResource(R.drawable.img_14)
                recipeTitle.text = dishName
                preparationTime.text = "Preparation Time: 15 minutes"
                ingredients.text = "Ingredients: Oats, Honey, Nuts, Dried Fruits"
                steps.text = "Steps:\n1. Mix ingredients.\n2. Bake in a pan.\n3. Cool and slice."
                videoLink.setOnClickListener {
                    val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.loveandlemons.com/granola-bars-recipe/"))
                    startActivity(intent)
                }
            }
            "Fruit Salad" -> {
                recipeImage.setImageResource(R.drawable.img_15)
                recipeTitle.text = dishName
                preparationTime.text = "Preparation Time: 10 minutes"
                ingredients.text = "Ingredients: Assorted Fruits, Honey, Lemon Juice"
                steps.text = "Steps:\n1. Chop fruits.\n2. Mix with honey and lemon."
                videoLink.setOnClickListener {
                    val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.allrecipes.com/recipe/214947/perfect-summer-fruit-salad/"))
                    startActivity(intent)
                }
            }

            // Dinner Recipes
            "Steak" -> {
                recipeImage.setImageResource(R.drawable.img_16)
                recipeTitle.text = dishName
                preparationTime.text = "Preparation Time: 20 minutes"
                ingredients.text = "Ingredients: Beef Steak, Salt, Pepper, Garlic Butter"
                steps.text = "Steps:\n1. Season steak.\n2. Sear on a hot pan.\n3. Rest and serve."
                videoLink.setOnClickListener {
                    val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.recipetineats.com/how-to-cook-steak/"))
                    startActivity(intent)
                }
            }
            "Grilled Salmon" -> {
                recipeImage.setImageResource(R.drawable.img_17)
                recipeTitle.text = dishName
                preparationTime.text = "Preparation Time: 25 minutes"
                ingredients.text = "Ingredients: Salmon, Olive Oil, Lemon, Dill"
                steps.text = "Steps:\n1. Marinate salmon.\n2. Grill until cooked."
                videoLink.setOnClickListener {
                    val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.allrecipes.com/recipe/12720/grilled-salmon-i/"))
                    startActivity(intent)
                }
            }
            "Vegetable Stir-Fry" -> {
                recipeImage.setImageResource(R.drawable.img_18)
                recipeTitle.text = dishName
                preparationTime.text = "Preparation Time: 15 minutes"
                ingredients.text = "Ingredients: Mixed Vegetables, Soy Sauce, Garlic"
                steps.text = "Steps:\n1. Heat oil.\n2. Stir-fry vegetables.\n3. Add sauce and serve."
                videoLink.setOnClickListener {
                    val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.thepioneerwoman.com/food-cooking/recipes/a79759/veggie-stir-fry/"))
                    startActivity(intent)
                }
            }
            "Lamb Curry" -> {
                recipeImage.setImageResource(R.drawable.img_19)
                recipeTitle.text = dishName
                preparationTime.text = "Preparation Time: 40 minutes"
                ingredients.text = "Ingredients: Chicken, Onion, Tomato, Spices, Coconut Milk"
                steps.text = "Steps:\n1. Cook chicken with spices.\n2. Add coconut milk.\n3. Simmer and serve."
                videoLink.setOnClickListener {
                    val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bbcgoodfood.com/recipes/home-style-lamb-curry"))
                    startActivity(intent)
                }
            }
            else -> {
                Toast.makeText(this, "Recipe not found!", Toast.LENGTH_SHORT).show()
                finish()
            }
        }

        backButton.setOnClickListener {
            finish()
        }
    }
}
