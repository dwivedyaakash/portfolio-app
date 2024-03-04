package com.example.portfolioapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//      Home activity buttons
        val buttonSkills = findViewById<Button>(R.id.btnSkills)
        buttonSkills.setOnClickListener {
            intent = Intent(this, SkillsActivity::class.java)
            startActivity(intent)
        }

        val buttonEducation = findViewById<Button>(R.id.btnEducation)
        buttonEducation.setOnClickListener {
            intent = Intent(this, EducationActivity::class.java)
            startActivity(intent)
        }

        val buttonExperience = findViewById<Button>(R.id.btnExperience)
        buttonExperience.setOnClickListener {
            intent = Intent(this, ExperienceActivity::class.java)
            startActivity(intent)
        }

        val buttonPortfolio = findViewById<Button>(R.id.btnPortfolio)
        buttonPortfolio.setOnClickListener {
            intent = Intent(this, PortfolioWebViewActivity::class.java)
            startActivity(intent)
        }
    }
}