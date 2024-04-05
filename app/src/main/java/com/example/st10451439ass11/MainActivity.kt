

package com.example.st10451439ass11

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView



class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        val ageEditText = findViewById<EditText>(R.id.ageEditText)
        val resultsTextView = findViewById<TextView>(R.id.resultsTextView)

        button1.setOnClickListener {
            val userAge = ageEditText.text.toString().toIntOrNull()



            if (userAge == null) {
                resultsTextView.text =
                    "Please enter a valid age-it must be a whole number without any decimals or text."
            } else {
                if (userAge < 20 || userAge > 100) {
                    resultsTextView.text = "Please enter a age between 20 and 100."
                    ageEditText.text.clear()

                } else {

                    val result = when (userAge) {
                        73 -> "Charles Darwin analysis of plants animals he gathered led him to question how species form and change over time. This work convinced him of the insight that he is most famous for – natural selection. Charles Darwin died at the age of 73."

                        50 -> "Michael Jackson was the King of Pop. His contribution to music, dance, and fashion, along with his publicized personal life, made him a global figure in popular culture. Michael Jackson died at the age of 50."

                        95 -> "Nelson Mandela was the first black South African president and led the transition from apartheid to multiracial democracy. Nelson Mandela died at the age of 95."

                        82 -> "Edson Arantes do Nascimento (Pele) was a soccer player with electrifying play and penchant for scoring spectacular goals. Pele died at the age of 82."

                        76 -> "Albert Einstein is best known for his equation E=mc^2, which states that energy and mass (matter) are the same thing, just in different forms. Albert Einstein died at the age of 76."

                        52 -> "William Shakespeare was an English playwright, poet, and actor. He is the greatest writer in the English language and the world's pre-eminent dramatist. William Shakespeare died at the age of 52."

                        87 -> "Mother Teresa a nun who devoted her life to helping those most in need. She founded the missionaries of charity in India and over 45 years, she ministered to the poor, sick, orphaned and dying. Mother Teresa died at the age of 87."

                        25 -> "Tupac Shakur was one of the most influential and successful rappers of all time in hip-hop. Tupac died at the age of 25."

                        42 -> "Kobe Bryant was a professional basketball player, who helped lead the Los Angeles Lakers of the national Basketball Association (NBA) to 5 championships. Kobe died at the ahe of 42."

                        96 -> "Queen Elizebeth II was a dedicated Head of the Commonwealth, linking more than two billion people worldwide. Queen Elizebeth died at the age of 96."

                        else -> "Nobody Famous is known to me that died at that age"
                    }
                    resultsTextView.text = result
                }
            }
        }

        button2.setOnClickListener {
            ageEditText.text.clear()
            resultsTextView.text = ""
        }

    }
}
