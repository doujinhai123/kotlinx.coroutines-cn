/*
 * Copyright 2016-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license.
 */

package kotlinx.coroutines.test

import org.junit.Test
import kotlin.test.*

class TestCoroutineExceptionHandlerTest {
    @Test
    fun whenExceptionsCaught_avaliableViaProperty() {
        val subject = TestCoroutineExceptionHandler()
        val expected = IllegalArgumentException()
        subject.handleException(subject, expected)
        assertEquals(listOf(expected), subject.uncaughtExceptions)
    }
}