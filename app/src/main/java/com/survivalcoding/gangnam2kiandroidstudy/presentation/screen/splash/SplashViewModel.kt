package com.survivalcoding.gangnam2kiandroidstudy.presentation.screen.splash

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.survivalcoding.gangnam2kiandroidstudy.core.util.NetworkObserver
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class SplashViewModel(
    private val networkObserver: NetworkObserver
) : ViewModel() {

    private var _value = MutableStateFlow(SplashState())
    val value = _value.asStateFlow()

    init {
        observeNetwork()
    }


    val isNetworkConnected = networkObserver.networkStatus.stateIn(
        viewModelScope,
        SharingStarted.WhileSubscribed(5000),
        false
    )

    private fun observeNetwork() {
        viewModelScope.launch {
            networkObserver.networkStatus.collect { isConnected ->
                // 네트워크 연결 상태에 따라 SplashState의 버튼 활성화 여부를 업데이트
                _value.update { currentState ->
                    currentState.copy(isNextButtonEnable = isConnected)
                }
            }
        }
    }
}