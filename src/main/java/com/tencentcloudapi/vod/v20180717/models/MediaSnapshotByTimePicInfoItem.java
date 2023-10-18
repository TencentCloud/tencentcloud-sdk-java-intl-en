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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaSnapshotByTimePicInfoItem extends AbstractModel {

    /**
    * Time offset corresponding to the screenshot in the video in <font color=red>milliseconds</font>.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TimeOffset")
    @Expose
    private Float TimeOffset;

    /**
    * Screenshot URL.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * List of watermarking template IDs if the screenshots are watermarked.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WaterMarkDefinition")
    @Expose
    private Long [] WaterMarkDefinition;

    /**
     * Get Time offset corresponding to the screenshot in the video in <font color=red>milliseconds</font>.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TimeOffset Time offset corresponding to the screenshot in the video in <font color=red>milliseconds</font>.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Float getTimeOffset() {
        return this.TimeOffset;
    }

    /**
     * Set Time offset corresponding to the screenshot in the video in <font color=red>milliseconds</font>.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TimeOffset Time offset corresponding to the screenshot in the video in <font color=red>milliseconds</font>.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTimeOffset(Float TimeOffset) {
        this.TimeOffset = TimeOffset;
    }

    /**
     * Get Screenshot URL.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Url Screenshot URL.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Screenshot URL.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Url Screenshot URL.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get List of watermarking template IDs if the screenshots are watermarked.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return WaterMarkDefinition List of watermarking template IDs if the screenshots are watermarked.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long [] getWaterMarkDefinition() {
        return this.WaterMarkDefinition;
    }

    /**
     * Set List of watermarking template IDs if the screenshots are watermarked.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param WaterMarkDefinition List of watermarking template IDs if the screenshots are watermarked.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setWaterMarkDefinition(Long [] WaterMarkDefinition) {
        this.WaterMarkDefinition = WaterMarkDefinition;
    }

    public MediaSnapshotByTimePicInfoItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaSnapshotByTimePicInfoItem(MediaSnapshotByTimePicInfoItem source) {
        if (source.TimeOffset != null) {
            this.TimeOffset = new Float(source.TimeOffset);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.WaterMarkDefinition != null) {
            this.WaterMarkDefinition = new Long[source.WaterMarkDefinition.length];
            for (int i = 0; i < source.WaterMarkDefinition.length; i++) {
                this.WaterMarkDefinition[i] = new Long(source.WaterMarkDefinition[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TimeOffset", this.TimeOffset);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamArraySimple(map, prefix + "WaterMarkDefinition.", this.WaterMarkDefinition);

    }
}

