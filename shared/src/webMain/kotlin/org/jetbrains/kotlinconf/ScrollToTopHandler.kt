package org.jetbrains.kotlinconf

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.runtime.Composable

@Composable
actual fun ScrollToTopHandler(scrollState: ScrollState) {}

@Composable
actual fun ScrollToTopHandler(listState: LazyListState) {}