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
    * Sampled screenshot specification ID. See sampling screenshot parameter template (https://www.tencentcloud.com/document/product/266/33480?from_cn_redirect=1#.E9.87.87.E6.A0.B7.E6.88.AA.E5.9B.BE.E6.A8.A1.E6.9D.BF).
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * Sampling method. Valid value:
<li>Percent: interval sampling based on percentage.</li>
<li>Time: sampling based on time interval.</li>
    */
    @SerializedName("SampleType")
    @Expose
    private String SampleType;

    /**
    * Sampling interval
<li>When SampleType is Percent, this value indicates how many percentage one image.</li>
<li>When SampleType is Time, this value means the time interval between images, in seconds. The first image is always the first video frame.</li>
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * List of generated screenshot URLs.
    */
    @SerializedName("ImageUrlSet")
    @Expose
    private String [] ImageUrlSet;

    /**
    * List of template IDs if the screenshot is watermarked.
    */
    @SerializedName("WaterMarkDefinition")
    @Expose
    private Long [] WaterMarkDefinition;

    /**
     * Get Sampled screenshot specification ID. See sampling screenshot parameter template (https://www.tencentcloud.com/document/product/266/33480?from_cn_redirect=1#.E9.87.87.E6.A0.B7.E6.88.AA.E5.9B.BE.E6.A8.A1.E6.9D.BF). 
     * @return Definition Sampled screenshot specification ID. See sampling screenshot parameter template (https://www.tencentcloud.com/document/product/266/33480?from_cn_redirect=1#.E9.87.87.E6.A0.B7.E6.88.AA.E5.9B.BE.E6.A8.A1.E6.9D.BF).
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Sampled screenshot specification ID. See sampling screenshot parameter template (https://www.tencentcloud.com/document/product/266/33480?from_cn_redirect=1#.E9.87.87.E6.A0.B7.E6.88.AA.E5.9B.BE.E6.A8.A1.E6.9D.BF).
     * @param Definition Sampled screenshot specification ID. See sampling screenshot parameter template (https://www.tencentcloud.com/document/product/266/33480?from_cn_redirect=1#.E9.87.87.E6.A0.B7.E6.88.AA.E5.9B.BE.E6.A8.A1.E6.9D.BF).
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get Sampling method. Valid value:
<li>Percent: interval sampling based on percentage.</li>
<li>Time: sampling based on time interval.</li> 
     * @return SampleType Sampling method. Valid value:
<li>Percent: interval sampling based on percentage.</li>
<li>Time: sampling based on time interval.</li>
     */
    public String getSampleType() {
        return this.SampleType;
    }

    /**
     * Set Sampling method. Valid value:
<li>Percent: interval sampling based on percentage.</li>
<li>Time: sampling based on time interval.</li>
     * @param SampleType Sampling method. Valid value:
<li>Percent: interval sampling based on percentage.</li>
<li>Time: sampling based on time interval.</li>
     */
    public void setSampleType(String SampleType) {
        this.SampleType = SampleType;
    }

    /**
     * Get Sampling interval
<li>When SampleType is Percent, this value indicates how many percentage one image.</li>
<li>When SampleType is Time, this value means the time interval between images, in seconds. The first image is always the first video frame.</li> 
     * @return Interval Sampling interval
<li>When SampleType is Percent, this value indicates how many percentage one image.</li>
<li>When SampleType is Time, this value means the time interval between images, in seconds. The first image is always the first video frame.</li>
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set Sampling interval
<li>When SampleType is Percent, this value indicates how many percentage one image.</li>
<li>When SampleType is Time, this value means the time interval between images, in seconds. The first image is always the first video frame.</li>
     * @param Interval Sampling interval
<li>When SampleType is Percent, this value indicates how many percentage one image.</li>
<li>When SampleType is Time, this value means the time interval between images, in seconds. The first image is always the first video frame.</li>
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * Get List of generated screenshot URLs. 
     * @return ImageUrlSet List of generated screenshot URLs.
     */
    public String [] getImageUrlSet() {
        return this.ImageUrlSet;
    }

    /**
     * Set List of generated screenshot URLs.
     * @param ImageUrlSet List of generated screenshot URLs.
     */
    public void setImageUrlSet(String [] ImageUrlSet) {
        this.ImageUrlSet = ImageUrlSet;
    }

    /**
     * Get List of template IDs if the screenshot is watermarked. 
     * @return WaterMarkDefinition List of template IDs if the screenshot is watermarked.
     */
    public Long [] getWaterMarkDefinition() {
        return this.WaterMarkDefinition;
    }

    /**
     * Set List of template IDs if the screenshot is watermarked.
     * @param WaterMarkDefinition List of template IDs if the screenshot is watermarked.
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

