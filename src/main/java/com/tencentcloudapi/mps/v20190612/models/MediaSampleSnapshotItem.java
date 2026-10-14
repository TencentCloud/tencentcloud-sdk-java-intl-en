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
    * <p>Sampled screenshot specification ID. Please refer to <a href="https://www.tencentcloud.com/document/product/266/33480?from_cn_redirect=1#.E9.87.87.E6.A0.B7.E6.88.AA.E5.9B.BE.E6.A8.A1.E6.9D.BF">sampling screenshot parameter template</a>.</p>
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * <p>Sampling method, valid value:</p><li>Percent: Sampling based on percentage interval.</li><li>Time: Sampling based on time interval.</li>
    */
    @SerializedName("SampleType")
    @Expose
    private String SampleType;

    /**
    * <p>Sampling interval</p><li>When SampleType is Percent, this value indicates the percentage of images.</li><li>When SampleType is Time, this value indicates the time interval for each image, in seconds. The first image is always the first video frame.</li>
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * <p>Storage location of a file after screenshot.</p>
    */
    @SerializedName("Storage")
    @Expose
    private TaskOutputStorage Storage;

    /**
    * <p>List of generated screenshot paths.</p>
    */
    @SerializedName("ImagePathSet")
    @Expose
    private String [] ImagePathSet;

    /**
    * <p>List of template IDs of watermarked screenshots.</p>
    */
    @SerializedName("WaterMarkDefinition")
    @Expose
    private Long [] WaterMarkDefinition;

    /**
     * Get <p>Sampled screenshot specification ID. Please refer to <a href="https://www.tencentcloud.com/document/product/266/33480?from_cn_redirect=1#.E9.87.87.E6.A0.B7.E6.88.AA.E5.9B.BE.E6.A8.A1.E6.9D.BF">sampling screenshot parameter template</a>.</p> 
     * @return Definition <p>Sampled screenshot specification ID. Please refer to <a href="https://www.tencentcloud.com/document/product/266/33480?from_cn_redirect=1#.E9.87.87.E6.A0.B7.E6.88.AA.E5.9B.BE.E6.A8.A1.E6.9D.BF">sampling screenshot parameter template</a>.</p>
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set <p>Sampled screenshot specification ID. Please refer to <a href="https://www.tencentcloud.com/document/product/266/33480?from_cn_redirect=1#.E9.87.87.E6.A0.B7.E6.88.AA.E5.9B.BE.E6.A8.A1.E6.9D.BF">sampling screenshot parameter template</a>.</p>
     * @param Definition <p>Sampled screenshot specification ID. Please refer to <a href="https://www.tencentcloud.com/document/product/266/33480?from_cn_redirect=1#.E9.87.87.E6.A0.B7.E6.88.AA.E5.9B.BE.E6.A8.A1.E6.9D.BF">sampling screenshot parameter template</a>.</p>
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get <p>Sampling method, valid value:</p><li>Percent: Sampling based on percentage interval.</li><li>Time: Sampling based on time interval.</li> 
     * @return SampleType <p>Sampling method, valid value:</p><li>Percent: Sampling based on percentage interval.</li><li>Time: Sampling based on time interval.</li>
     */
    public String getSampleType() {
        return this.SampleType;
    }

    /**
     * Set <p>Sampling method, valid value:</p><li>Percent: Sampling based on percentage interval.</li><li>Time: Sampling based on time interval.</li>
     * @param SampleType <p>Sampling method, valid value:</p><li>Percent: Sampling based on percentage interval.</li><li>Time: Sampling based on time interval.</li>
     */
    public void setSampleType(String SampleType) {
        this.SampleType = SampleType;
    }

    /**
     * Get <p>Sampling interval</p><li>When SampleType is Percent, this value indicates the percentage of images.</li><li>When SampleType is Time, this value indicates the time interval for each image, in seconds. The first image is always the first video frame.</li> 
     * @return Interval <p>Sampling interval</p><li>When SampleType is Percent, this value indicates the percentage of images.</li><li>When SampleType is Time, this value indicates the time interval for each image, in seconds. The first image is always the first video frame.</li>
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set <p>Sampling interval</p><li>When SampleType is Percent, this value indicates the percentage of images.</li><li>When SampleType is Time, this value indicates the time interval for each image, in seconds. The first image is always the first video frame.</li>
     * @param Interval <p>Sampling interval</p><li>When SampleType is Percent, this value indicates the percentage of images.</li><li>When SampleType is Time, this value indicates the time interval for each image, in seconds. The first image is always the first video frame.</li>
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * Get <p>Storage location of a file after screenshot.</p> 
     * @return Storage <p>Storage location of a file after screenshot.</p>
     */
    public TaskOutputStorage getStorage() {
        return this.Storage;
    }

    /**
     * Set <p>Storage location of a file after screenshot.</p>
     * @param Storage <p>Storage location of a file after screenshot.</p>
     */
    public void setStorage(TaskOutputStorage Storage) {
        this.Storage = Storage;
    }

    /**
     * Get <p>List of generated screenshot paths.</p> 
     * @return ImagePathSet <p>List of generated screenshot paths.</p>
     */
    public String [] getImagePathSet() {
        return this.ImagePathSet;
    }

    /**
     * Set <p>List of generated screenshot paths.</p>
     * @param ImagePathSet <p>List of generated screenshot paths.</p>
     */
    public void setImagePathSet(String [] ImagePathSet) {
        this.ImagePathSet = ImagePathSet;
    }

    /**
     * Get <p>List of template IDs of watermarked screenshots.</p> 
     * @return WaterMarkDefinition <p>List of template IDs of watermarked screenshots.</p>
     */
    public Long [] getWaterMarkDefinition() {
        return this.WaterMarkDefinition;
    }

    /**
     * Set <p>List of template IDs of watermarked screenshots.</p>
     * @param WaterMarkDefinition <p>List of template IDs of watermarked screenshots.</p>
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

