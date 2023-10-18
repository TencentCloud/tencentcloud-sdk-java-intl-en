/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.vm.v20201229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaInfo extends AbstractModel {

    /**
    * This field is used to return the segment length of the input video stream in seconds. It is **5 seconds by default** and is customizable.<br>Note: this field will take effect only when the moderated file is streaming media. If it returns 0, no valid value has been obtained.
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
     * Get This field is used to return the segment length of the input video stream in seconds. It is **5 seconds by default** and is customizable.<br>Note: this field will take effect only when the moderated file is streaming media. If it returns 0, no valid value has been obtained. 
     * @return Duration This field is used to return the segment length of the input video stream in seconds. It is **5 seconds by default** and is customizable.<br>Note: this field will take effect only when the moderated file is streaming media. If it returns 0, no valid value has been obtained.
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set This field is used to return the segment length of the input video stream in seconds. It is **5 seconds by default** and is customizable.<br>Note: this field will take effect only when the moderated file is streaming media. If it returns 0, no valid value has been obtained.
     * @param Duration This field is used to return the segment length of the input video stream in seconds. It is **5 seconds by default** and is customizable.<br>Note: this field will take effect only when the moderated file is streaming media. If it returns 0, no valid value has been obtained.
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    public MediaInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaInfo(MediaInfo source) {
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Duration", this.Duration);

    }
}

