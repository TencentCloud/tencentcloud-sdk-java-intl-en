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

public class AiRecognitionTaskSegmentSegmentItem extends AbstractModel{

    /**
    * File ID, which is valid only when a VOD file is processed and the subsegments generated through segmentation are also VOD files.
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * Split video segment URL.
    */
    @SerializedName("SegmentUrl")
    @Expose
    private String SegmentUrl;

    /**
    * Confidence of split segment. Value range: 0-100.
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * Start time offset of split segment in seconds.
    */
    @SerializedName("StartTimeOffset")
    @Expose
    private Float StartTimeOffset;

    /**
    * End time offset of split segment in seconds.
    */
    @SerializedName("EndTimeOffset")
    @Expose
    private Float EndTimeOffset;

    /**
    * Split cover image URL.
    */
    @SerializedName("CovImgUrl")
    @Expose
    private String CovImgUrl;

    /**
    * Special field, which should be ignored.
    */
    @SerializedName("SpecialInfo")
    @Expose
    private String SpecialInfo;

    /**
     * Get File ID, which is valid only when a VOD file is processed and the subsegments generated through segmentation are also VOD files. 
     * @return FileId File ID, which is valid only when a VOD file is processed and the subsegments generated through segmentation are also VOD files.
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set File ID, which is valid only when a VOD file is processed and the subsegments generated through segmentation are also VOD files.
     * @param FileId File ID, which is valid only when a VOD file is processed and the subsegments generated through segmentation are also VOD files.
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get Split video segment URL. 
     * @return SegmentUrl Split video segment URL.
     */
    public String getSegmentUrl() {
        return this.SegmentUrl;
    }

    /**
     * Set Split video segment URL.
     * @param SegmentUrl Split video segment URL.
     */
    public void setSegmentUrl(String SegmentUrl) {
        this.SegmentUrl = SegmentUrl;
    }

    /**
     * Get Confidence of split segment. Value range: 0-100. 
     * @return Confidence Confidence of split segment. Value range: 0-100.
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set Confidence of split segment. Value range: 0-100.
     * @param Confidence Confidence of split segment. Value range: 0-100.
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get Start time offset of split segment in seconds. 
     * @return StartTimeOffset Start time offset of split segment in seconds.
     */
    public Float getStartTimeOffset() {
        return this.StartTimeOffset;
    }

    /**
     * Set Start time offset of split segment in seconds.
     * @param StartTimeOffset Start time offset of split segment in seconds.
     */
    public void setStartTimeOffset(Float StartTimeOffset) {
        this.StartTimeOffset = StartTimeOffset;
    }

    /**
     * Get End time offset of split segment in seconds. 
     * @return EndTimeOffset End time offset of split segment in seconds.
     */
    public Float getEndTimeOffset() {
        return this.EndTimeOffset;
    }

    /**
     * Set End time offset of split segment in seconds.
     * @param EndTimeOffset End time offset of split segment in seconds.
     */
    public void setEndTimeOffset(Float EndTimeOffset) {
        this.EndTimeOffset = EndTimeOffset;
    }

    /**
     * Get Split cover image URL. 
     * @return CovImgUrl Split cover image URL.
     */
    public String getCovImgUrl() {
        return this.CovImgUrl;
    }

    /**
     * Set Split cover image URL.
     * @param CovImgUrl Split cover image URL.
     */
    public void setCovImgUrl(String CovImgUrl) {
        this.CovImgUrl = CovImgUrl;
    }

    /**
     * Get Special field, which should be ignored. 
     * @return SpecialInfo Special field, which should be ignored.
     */
    public String getSpecialInfo() {
        return this.SpecialInfo;
    }

    /**
     * Set Special field, which should be ignored.
     * @param SpecialInfo Special field, which should be ignored.
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

