/*
 * Copyright 2020 Paul Rybitskyi, paul.rybitskyi.work@gmail.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.paulrybitskyi.docscanner.utils

import android.content.Context


interface StringProvider {

    fun getString(id: Int, vararg args: Any): String

    fun getQuantityString(id: Int, quantity: Int, vararg formatArgs: Any): String

}


internal class StringProviderImpl(
    private val applicationContext: Context
) : StringProvider {


    override fun getString(id: Int, vararg args: Any): String {
        return applicationContext.getString(id, *args)
    }


    override fun getQuantityString(id: Int, quantity: Int, vararg formatArgs: Any): String {
        return applicationContext.resources.getQuantityString(id, quantity, *formatArgs)
    }


}