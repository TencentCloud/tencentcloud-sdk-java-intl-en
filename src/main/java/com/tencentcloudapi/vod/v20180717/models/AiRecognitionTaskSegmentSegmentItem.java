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

public class AiRecognitionTaskSegmentSegmentItem extends AbstractModel {

    /**
    * 
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * 
    */
    @SerializedName("SegmentUrl")
    @Expose
    private String SegmentUrl;

    /**
    * 
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * 
    */
    @SerializedName("StartTimeOffset")
    @Expose
    private Float StartTimeOffset;

    /**
    * 
    */
    @SerializedName("EndTimeOffset")
    @Expose
    private Float EndTimeOffset;

    /**
    * 
    */
    @SerializedName("CovImgUrl")
    @Expose
    private String CovImgUrl;

    /**
    * 
    */
    @SerializedName("SpecialInfo")
    @Expose
    private String SpecialInfo;

    /**
     * Get  
     * @return FileId 
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set 
     * @param FileId 
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get  
     * @return SegmentUrl 
     */
    public String getSegmentUrl() {
        return this.SegmentUrl;
    }

    /**
     * Set 
     * @param SegmentUrl 
     */
    public void setSegmentUrl(String SegmentUrl) {
        this.SegmentUrl = SegmentUrl;
    }

    /**
     * Get  
     * @return Confidence 
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set 
     * @param Confidence 
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get  
     * @return StartTimeOffset 
     */
    public Float getStartTimeOffset() {
        return this.StartTimeOffset;
    }

    /**
     * Set 
     * @param StartTimeOffset 
     */
    public void setStartTimeOffset(Float StartTimeOffset) {
        this.StartTimeOffset = StartTimeOffset;
    }

    /**
     * Get  
     * @return EndTimeOffset 
     */
    public Float getEndTimeOffset() {
        return this.EndTimeOffset;
    }

    /**
     * Set 
     * @param EndTimeOffset 
     */
    public void setEndTimeOffset(Float EndTimeOffset) {
        this.EndTimeOffset = EndTimeOffset;
    }

    /**
     * Get  
     * @return CovImgUrl 
     */
    public String getCovImgUrl() {
        return this.CovImgUrl;
    }

    /**
     * Set 
     * @param CovImgUrl 
     */
    public void setCovImgUrl(String CovImgUrl) {
        this.CovImgUrl = CovImgUrl;
    }

    /**
     * Get  
     * @return SpecialInfo 
     */
    public String getSpecialInfo() {
        return this.SpecialInfo;
    }

    /**
     * Set 
     * @param SpecialInfo 
     */
    public void setSpecialInfo(String SpecialInfo) {
        this.SpecialInfo = SpecialInfo;
    }

    public AiRecognitionTaskSegmentSegmentItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiRecognitionTaskSegmentSegmentItem(AiRecognitionTaskSegmentSegmentItem source) {
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.SegmentUrl != null) {
            this.SegmentUrl = new String(source.SegmentUrl);
        }
        if (source.Confidence != null) {
            this.Confidence = new Float(source.Confidence);
        }
        if (source.StartTimeOffset != null) {
            this.StartTimeOffset = new Float(source.StartTimeOffset);
        }
        if (source.EndTimeOffset != null) {
            this.EndTimeOffset = new Float(source.EndTimeOffset);
        }
        if (source.CovImgUrl != null) {
            this.CovImgUrl = new String(source.CovImgUrl);
        }
        if (source.SpecialInfo != null) {
            this.SpecialInfo = new String(source.SpecialInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "SegmentUrl", this.SegmentUrl);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamSimple(map, prefix + "StartTimeOffset", this.StartTimeOffset);
        this.setParamSimple(map, prefix + "EndTimeOffset", this.EndTimeOffset);
        this.setParamSimple(map, prefix + "CovImgUrl", this.CovImgUrl);
        this.setParamSimple(map, prefix + "SpecialInfo", this.SpecialInfo);

    }
}

