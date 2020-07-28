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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaKeyFrameDescItem extends AbstractModel{

    /**
    * Offset time of video timestamp in seconds.
    */
    @SerializedName("TimeOffset")
    @Expose
    private Float TimeOffset;

    /**
    * Content string of timestamp containing 1-128 characters.
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
     * Get Offset time of video timestamp in seconds. 
     * @return TimeOffset Offset time of video timestamp in seconds.
     */
    public Float getTimeOffset() {
        return this.TimeOffset;
    }

    /**
     * Set Offset time of video timestamp in seconds.
     * @param TimeOffset Offset time of video timestamp in seconds.
     */
    public void setTimeOffset(Float TimeOffset) {
        this.TimeOffset = TimeOffset;
    }

    /**
     * Get Content string of timestamp containing 1-128 characters. 
     * @return Content Content string of timestamp containing 1-128 characters.
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set Content string of timestamp containing 1-128 characters.
     * @param Content Content string of timestamp containing 1-128 characters.
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TimeOffset", this.TimeOffset);
        this.setParamSimple(map, prefix + "Content", this.Content);

    }
}

