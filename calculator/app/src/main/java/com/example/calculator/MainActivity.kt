package com.example.calculator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bt1.setOnClickListener{
            binding.inputt.append("1")
        }
        binding.bt2.setOnClickListener{
            binding.inputt.append("2")
        }
        binding.bt3.setOnClickListener{
            binding.inputt.append("3")
        }
        binding.bt4.setOnClickListener{
            binding.inputt.append("4")
        }
        binding.bt5.setOnClickListener{
            binding.inputt.append("5")
        }
        binding.bt6.setOnClickListener{
            binding.inputt.append("6")
        }
        binding.bt7.setOnClickListener{
            binding.inputt.append("7")
        }
        binding.bt8.setOnClickListener{
            binding.inputt.append("8")
        }
        binding.bt9.setOnClickListener{
            binding.inputt.append("9")
        }
        binding.bt0.setOnClickListener{
            binding.inputt.append("0")
        }
        binding.btDiv.setOnClickListener{
            binding.inputt.append("/")
        }
        binding.btMul.setOnClickListener{
            binding.inputt.append("X")
        }
        binding.btSub.setOnClickListener{
            binding.inputt.append("-")
        }
        binding.btAdd.setOnClickListener{
            binding.inputt.append("+")
        }
        binding.btClear.setOnClickListener{
            binding.inputt.setText("")
        }
        binding.btEql.setOnClickListener{
            val input: String = binding.inputt.getText().toString()
            val one: Int = Integer.parseInt(input.slice(listOf(0)))
//            binding.inputt.setText(one.toString())
            val two: String = input.slice(listOf(1))
            val three: Int = Integer.parseInt(input.slice(listOf(2)))
            if (two=="+"){
                binding.inputt.setText((one+three).toString())
            }
            if (two=="-"){
                binding.inputt.setText((one-three).toString())
            }
            if (two=="X"){
                binding.inputt.setText((one*three).toString())
            }
            if (two=="/"){
                binding.inputt.setText((one/three).toString())
            }
        }

    }
}