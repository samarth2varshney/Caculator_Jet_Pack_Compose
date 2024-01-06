package com.example.caculator_jet_pack_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.caculator_jet_pack_compose.ui.theme.Caculator_Jet_Pack_ComposeTheme
import com.example.caculator_jet_pack_compose.ui.theme.MediumGray

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Caculator_Jet_Pack_ComposeTheme {
                val viewModel = viewModel<CaculatorViewModel>()
                val state = viewModel.state
                val buttonSpacing = 8.dp
                Calculator(state = state, onAction = viewModel::onAction, buttonSpacing = buttonSpacing, modifier = Modifier.fillMaxSize().background(MediumGray).padding(16.dp))
            }
        }
    }
}
