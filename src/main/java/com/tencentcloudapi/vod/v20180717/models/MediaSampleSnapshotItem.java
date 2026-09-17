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

public class MediaSampleSnapshotItem extends AbstractModel {

    /**
    * 
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 
    */
    @SerializedName("SampleType")
    @Expose
    private String SampleType;

    /**
    * 
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * 
    */
    @SerializedName("ImageUrlSet")
    @Expose
    private String [] ImageUrlSet;

    /**
    * 
    */
    @SerializedName("WaterMarkDefinition")
    @Expose
    private Long [] WaterMarkDefinition;

    /**
     * Get  
     * @return Definition 
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set 
     * @param Definition 
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get  
     * @return SampleType 
     */
    public String getSampleType() {
        return this.SampleType;
    }

    /**
     * Set 
     * @param SampleType 
     */
    public void setSampleType(String SampleType) {
        this.SampleType = SampleType;
    }

    /**
     * Get  
     * @return Interval 
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set 
     * @param Interval 
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * Get  
     * @return ImageUrlSet 
     */
    public String [] getImageUrlSet() {
        return this.ImageUrlSet;
    }

    /**
     * Set 
     * @param ImageUrlSet 
     */
    public void setImageUrlSet(String [] ImageUrlSet) {
        this.ImageUrlSet = ImageUrlSet;
    }

    /**
     * Get  
     * @return WaterMarkDefinition 
     */
    public Long [] getWaterMarkDefinition() {
        return this.WaterMarkDefinition;
    }

    /**
     * Set 
     * @param WaterMarkDefinition 
     */
    public void setWaterMarkDefinition(Long [] WaterMarkDefinition) {
        this.WaterMarkDefinition = WaterMarkDefinition;
    }

    public MediaSampleSnapshotItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaSampleSnapshotItem(MediaSampleSnapshotItem source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.SampleType != null) {
            this.SampleType = new String(source.SampleType);
        }
        if (source.Interval != null) {
            this.Interval = new Long(source.Interval);
        }
        if (source.ImageUrlSet != null) {
            this.ImageUrlSet = new String[source.ImageUrlSet.length];
            for (int i = 0; i < source.ImageUrlSet.length; i++) {
                this.ImageUrlSet[i] = new String(source.ImageUrlSet[i]);
            }
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
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "SampleType", this.SampleType);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamArraySimple(map, prefix + "ImageUrlSet.", this.ImageUrlSet);
        this.setParamArraySimple(map, prefix + "WaterMarkDefinition.", this.WaterMarkDefinition);

    }
}

