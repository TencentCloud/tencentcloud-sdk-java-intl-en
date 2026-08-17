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

public class MediaSampleSnapshotItem extends AbstractModel {

    /**
    * Sampled screenshot specification ID. Please refer to the sampling screenshot parameter template (https://www.tencentcloud.com/document/product/266/33480?from_cn_redirect=1#.E9.87.87.E6.A0.B7.E6.88.AA.E5.9B.BE.E6.A8.A1.E6.9D.BF).
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * Sampling method, Valid value:
<li>Percent: interval sampling based on percentage.</li>
<li>Time: sampling based on time interval.</li>
    */
    @SerializedName("SampleType")
    @Expose
    private String SampleType;

    /**
    * Sampling interval
<li>When SampleType is Percent, this value indicates how many percentage points per image.</li>
<li>When SampleType is Time, this value indicates how many time intervals per image, in seconds. The first image is the first video frame.</li>
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * Storage location of a file after screenshot.
    */
    @SerializedName("Storage")
    @Expose
    private TaskOutputStorage Storage;

    /**
    * List of generated screenshot paths.
    */
    @SerializedName("ImagePathSet")
    @Expose
    private String [] ImagePathSet;

    /**
    * If a screenshot is watermarked, the watermark template ID list.
    */
    @SerializedName("WaterMarkDefinition")
    @Expose
    private Long [] WaterMarkDefinition;

    /**
     * Get Sampled screenshot specification ID. Please refer to the sampling screenshot parameter template (https://www.tencentcloud.com/document/product/266/33480?from_cn_redirect=1#.E9.87.87.E6.A0.B7.E6.88.AA.E5.9B.BE.E6.A8.A1.E6.9D.BF). 
     * @return Definition Sampled screenshot specification ID. Please refer to the sampling screenshot parameter template (https://www.tencentcloud.com/document/product/266/33480?from_cn_redirect=1#.E9.87.87.E6.A0.B7.E6.88.AA.E5.9B.BE.E6.A8.A1.E6.9D.BF).
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Sampled screenshot specification ID. Please refer to the sampling screenshot parameter template (https://www.tencentcloud.com/document/product/266/33480?from_cn_redirect=1#.E9.87.87.E6.A0.B7.E6.88.AA.E5.9B.BE.E6.A8.A1.E6.9D.BF).
     * @param Definition Sampled screenshot specification ID. Please refer to the sampling screenshot parameter template (https://www.tencentcloud.com/document/product/266/33480?from_cn_redirect=1#.E9.87.87.E6.A0.B7.E6.88.AA.E5.9B.BE.E6.A8.A1.E6.9D.BF).
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get Sampling method, Valid value:
<li>Percent: interval sampling based on percentage.</li>
<li>Time: sampling based on time interval.</li> 
     * @return SampleType Sampling method, Valid value:
<li>Percent: interval sampling based on percentage.</li>
<li>Time: sampling based on time interval.</li>
     */
    public String getSampleType() {
        return this.SampleType;
    }

    /**
     * Set Sampling method, Valid value:
<li>Percent: interval sampling based on percentage.</li>
<li>Time: sampling based on time interval.</li>
     * @param SampleType Sampling method, Valid value:
<li>Percent: interval sampling based on percentage.</li>
<li>Time: sampling based on time interval.</li>
     */
    public void setSampleType(String SampleType) {
        this.SampleType = SampleType;
    }

    /**
     * Get Sampling interval
<li>When SampleType is Percent, this value indicates how many percentage points per image.</li>
<li>When SampleType is Time, this value indicates how many time intervals per image, in seconds. The first image is the first video frame.</li> 
     * @return Interval Sampling interval
<li>When SampleType is Percent, this value indicates how many percentage points per image.</li>
<li>When SampleType is Time, this value indicates how many time intervals per image, in seconds. The first image is the first video frame.</li>
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set Sampling interval
<li>When SampleType is Percent, this value indicates how many percentage points per image.</li>
<li>When SampleType is Time, this value indicates how many time intervals per image, in seconds. The first image is the first video frame.</li>
     * @param Interval Sampling interval
<li>When SampleType is Percent, this value indicates how many percentage points per image.</li>
<li>When SampleType is Time, this value indicates how many time intervals per image, in seconds. The first image is the first video frame.</li>
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * Get Storage location of a file after screenshot. 
     * @return Storage Storage location of a file after screenshot.
     */
    public TaskOutputStorage getStorage() {
        return this.Storage;
    }

    /**
     * Set Storage location of a file after screenshot.
     * @param Storage Storage location of a file after screenshot.
     */
    public void setStorage(TaskOutputStorage Storage) {
        this.Storage = Storage;
    }

    /**
     * Get List of generated screenshot paths. 
     * @return ImagePathSet List of generated screenshot paths.
     */
    public String [] getImagePathSet() {
        return this.ImagePathSet;
    }

    /**
     * Set List of generated screenshot paths.
     * @param ImagePathSet List of generated screenshot paths.
     */
    public void setImagePathSet(String [] ImagePathSet) {
        this.ImagePathSet = ImagePathSet;
    }

    /**
     * Get If a screenshot is watermarked, the watermark template ID list. 
     * @return WaterMarkDefinition If a screenshot is watermarked, the watermark template ID list.
     */
    public Long [] getWaterMarkDefinition() {
        return this.WaterMarkDefinition;
    }

    /**
     * Set If a screenshot is watermarked, the watermark template ID list.
     * @param WaterMarkDefinition If a screenshot is watermarked, the watermark template ID list.
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
        if (source.Storage != null) {
            this.Storage = new TaskOutputStorage(source.Storage);
        }
        if (source.ImagePathSet != null) {
            this.ImagePathSet = new String[source.ImagePathSet.length];
            for (int i = 0; i < source.ImagePathSet.length; i++) {
                this.ImagePathSet[i] = new String(source.ImagePathSet[i]);
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
        this.setParamObj(map, prefix + "Storage.", this.Storage);
        this.setParamArraySimple(map, prefix + "ImagePathSet.", this.ImagePathSet);
        this.setParamArraySimple(map, prefix + "WaterMarkDefinition.", this.WaterMarkDefinition);

    }
}

