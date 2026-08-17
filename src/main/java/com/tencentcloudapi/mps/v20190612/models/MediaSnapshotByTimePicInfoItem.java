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

public class MediaSnapshotByTimePicInfoItem extends AbstractModel {

    /**
    * The screenshot corresponds to the time offset in the video file, expressed in seconds.
    */
    @SerializedName("TimeOffset")
    @Expose
    private Float TimeOffset;

    /**
    * Path of the screenshot.
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * If a screenshot is watermarked, list of template IDs used for watermarking.
    */
    @SerializedName("WaterMarkDefinition")
    @Expose
    private Long [] WaterMarkDefinition;

    /**
     * Get The screenshot corresponds to the time offset in the video file, expressed in seconds. 
     * @return TimeOffset The screenshot corresponds to the time offset in the video file, expressed in seconds.
     */
    public Float getTimeOffset() {
        return this.TimeOffset;
    }

    /**
     * Set The screenshot corresponds to the time offset in the video file, expressed in seconds.
     * @param TimeOffset The screenshot corresponds to the time offset in the video file, expressed in seconds.
     */
    public void setTimeOffset(Float TimeOffset) {
        this.TimeOffset = TimeOffset;
    }

    /**
     * Get Path of the screenshot. 
     * @return Path Path of the screenshot.
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set Path of the screenshot.
     * @param Path Path of the screenshot.
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get If a screenshot is watermarked, list of template IDs used for watermarking. 
     * @return WaterMarkDefinition If a screenshot is watermarked, list of template IDs used for watermarking.
     */
    public Long [] getWaterMarkDefinition() {
        return this.WaterMarkDefinition;
    }

    /**
     * Set If a screenshot is watermarked, list of template IDs used for watermarking.
     * @param WaterMarkDefinition If a screenshot is watermarked, list of template IDs used for watermarking.
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
        if (source.Path != null) {
            this.Path = new String(source.Path);
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
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamArraySimple(map, prefix + "WaterMarkDefinition.", this.WaterMarkDefinition);

    }
}

