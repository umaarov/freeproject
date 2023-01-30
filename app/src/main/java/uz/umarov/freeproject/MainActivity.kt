package uz.umarov.freeproject

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import uz.umarov.freeproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    var num = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener{

            num += 1

            binding.number.text = num.toString()
        }
    }


}

