/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ComposeEmptyItem extends AbstractModel {

    /**
    * The element duration.
<li>The value of this parameter ends with `s`, which means seconds. For example, `3.5s` indicates 3.5 seconds. </li>
    */
    @SerializedName("Duration")
    @Expose
    private String Duration;

    /**
     * Get The element duration.
<li>The value of this parameter ends with `s`, which means seconds. For example, `3.5s` indicates 3.5 seconds. </li> 
     * @return Duration The element duration.
<li>The value of this parameter ends with `s`, which means seconds. For example, `3.5s` indicates 3.5 seconds. </li>
     */
    public String getDuration() {
        return this.Duration;
    }

    /**
     * Set The element duration.
<li>The value of this parameter ends with `s`, which means seconds. For example, `3.5s` indicates 3.5 seconds. </li>
     * @param Duration The element duration.
<li>The value of this parameter ends with `s`, which means seconds. For example, `3.5s` indicates 3.5 seconds. </li>
     */
    public void setDuration(String Duration) {
        this.Duration = Duration;
    }

    public ComposeEmptyItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComposeEmptyItem(ComposeEmptyItem source) {
        if (source.Duration != null) {
            this.Duration = new String(source.Duration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Duration", this.Duration);

    }
}

