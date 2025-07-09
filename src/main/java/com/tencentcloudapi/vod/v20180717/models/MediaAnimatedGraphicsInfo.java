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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaAnimatedGraphicsInfo extends AbstractModel {

    /**
    * Result information of animated image generating task
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AnimatedGraphicsSet")
    @Expose
    private MediaAnimatedGraphicsItem [] AnimatedGraphicsSet;

    /**
     * Get Result information of animated image generating task
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AnimatedGraphicsSet Result information of animated image generating task
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public MediaAnimatedGraphicsItem [] getAnimatedGraphicsSet() {
        return this.AnimatedGraphicsSet;
    }

    /**
     * Set Result information of animated image generating task
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AnimatedGraphicsSet Result information of animated image generating task
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAnimatedGraphicsSet(MediaAnimatedGraphicsItem [] AnimatedGraphicsSet) {
        this.AnimatedGraphicsSet = AnimatedGraphicsSet;
    }

    public MediaAnimatedGraphicsInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaAnimatedGraphicsInfo(MediaAnimatedGraphicsInfo source) {
        if (source.AnimatedGraphicsSet != null) {
            this.AnimatedGraphicsSet = new MediaAnimatedGraphicsItem[source.AnimatedGraphicsSet.length];
            for (int i = 0; i < source.AnimatedGraphicsSet.length; i++) {
                this.AnimatedGraphicsSet[i] = new MediaAnimatedGraphicsItem(source.AnimatedGraphicsSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "AnimatedGraphicsSet.", this.AnimatedGraphicsSet);

    }
}

