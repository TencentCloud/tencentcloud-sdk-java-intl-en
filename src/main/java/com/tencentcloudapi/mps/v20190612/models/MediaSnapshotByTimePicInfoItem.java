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
    * Time offset of this screenshot in the video file, in seconds.
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
    * List of template IDs for watermarking if the screenshot is watermarked.
    */
    @SerializedName("WaterMarkDefinition")
    @Expose
    private Long [] WaterMarkDefinition;

    /**
     * Get Time offset of this screenshot in the video file, in seconds. 
     * @return TimeOffset Time offset of this screenshot in the video file, in seconds.
     */
    public Float getTimeOffset() {
        return this.TimeOffset;
    }

    /**
     * Set Time offset of this screenshot in the video file, in seconds.
     * @param TimeOffset Time offset of this screenshot in the video file, in seconds.
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
     * Get List of template IDs for watermarking if the screenshot is watermarked. 
     * @return WaterMarkDefinition List of template IDs for watermarking if the screenshot is watermarked.
     */
    public Long [] getWaterMarkDefinition() {
        return this.WaterMarkDefinition;
    }

    /**
     * Set List of template IDs for watermarking if the screenshot is watermarked.
     * @param WaterMarkDefinition List of template IDs for watermarking if the screenshot is watermarked.
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

