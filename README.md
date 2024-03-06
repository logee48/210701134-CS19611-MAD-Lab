# android studio init setup

## add this code in build.gradle.kts file
```
viewBinding {
            enable = true
        }
```
<img src="/readme_assets/img1.png" width="900px"></img>
## add this code in build.gradle.kts file
```
package com.example.**ur_project_name**

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}
```
<img src="/readme_assets/img2.png" width="900px"></img>
