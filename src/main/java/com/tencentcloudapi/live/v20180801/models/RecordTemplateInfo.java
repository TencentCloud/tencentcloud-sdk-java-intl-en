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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RecordTemplateInfo extends AbstractModel {

    /**
    * Template ID.
    */
    @SerializedName("TemplateId")
    @Expose
    private Long TemplateId;

    /**
    * Template name.
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * Message description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * FLV recording parameter.
    */
    @SerializedName("FlvParam")
    @Expose
    private RecordParam FlvParam;

    /**
    * HLS recording parameter.
    */
    @SerializedName("HlsParam")
    @Expose
    private RecordParam HlsParam;

    /**
    * MP4 recording parameter.
    */
    @SerializedName("Mp4Param")
    @Expose
    private RecordParam Mp4Param;

    /**
    * AAC recording parameter.
    */
    @SerializedName("AacParam")
    @Expose
    private RecordParam AacParam;

    /**
    * 0: LVB,
1: LCB.
    */
    @SerializedName("IsDelayLive")
    @Expose
    private Long IsDelayLive;

    /**
    * A special parameter for HLS recording.
    */
    @SerializedName("HlsSpecialParam")
    @Expose
    private HlsSpecialParam HlsSpecialParam;

    /**
    * MP3 recording parameter.
    */
    @SerializedName("Mp3Param")
    @Expose
    private RecordParam Mp3Param;

    /**
    * Whether the watermark is removed.
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("RemoveWatermark")
    @Expose
    private Boolean RemoveWatermark;

    /**
    * A special parameter for FLV recording.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("FlvSpecialParam")
    @Expose
    private FlvSpecialParam FlvSpecialParam;

    /**
     * Get Template ID. 
     * @return TemplateId Template ID.
     */
    public Long getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set Template ID.
     * @param TemplateId Template ID.
     */
    public void setTemplateId(Long TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get Template name. 
     * @return TemplateName Template name.
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set Template name.
     * @param TemplateName Template name.
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * Get Message description 
     * @return Description Message description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Message description
     * @param Description Message description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get FLV recording parameter. 
     * @return FlvParam FLV recording parameter.
     */
    public RecordParam getFlvParam() {
        return this.FlvParam;
    }

    /**
     * Set FLV recording parameter.
     * @param FlvParam FLV recording parameter.
     */
    public void setFlvParam(RecordParam FlvParam) {
        this.FlvParam = FlvParam;
    }

    /**
     * Get HLS recording parameter. 
     * @return HlsParam HLS recording parameter.
     */
    public RecordParam getHlsParam() {
        return this.HlsParam;
    }

    /**
     * Set HLS recording parameter.
     * @param HlsParam HLS recording parameter.
     */
    public void setHlsParam(RecordParam HlsParam) {
        this.HlsParam = HlsParam;
    }

    /**
     * Get MP4 recording parameter. 
     * @return Mp4Param MP4 recording parameter.
     */
    public RecordParam getMp4Param() {
        return this.Mp4Param;
    }

    /**
     * Set MP4 recording parameter.
     * @param Mp4Param MP4 recording parameter.
     */
    public void setMp4Param(RecordParam Mp4Param) {
        this.Mp4Param = Mp4Param;
    }

    /**
     * Get AAC recording parameter. 
     * @return AacParam AAC recording parameter.
     */
    public RecordParam getAacParam() {
        return this.AacParam;
    }

    /**
     * Set AAC recording parameter.
     * @param AacParam AAC recording parameter.
     */
    public void setAacParam(RecordParam AacParam) {
        this.AacParam = AacParam;
    }

    /**
     * Get 0: LVB,
1: LCB. 
     * @return IsDelayLive 0: LVB,
1: LCB.
     */
    public Long getIsDelayLive() {
        return this.IsDelayLive;
    }

    /**
     * Set 0: LVB,
1: LCB.
     * @param IsDelayLive 0: LVB,
1: LCB.
     */
    public void setIsDelayLive(Long IsDelayLive) {
        this.IsDelayLive = IsDelayLive;
    }

    /**
     * Get A special parameter for HLS recording. 
     * @return HlsSpecialParam A special parameter for HLS recording.
     */
    public HlsSpecialParam getHlsSpecialParam() {
        return this.HlsSpecialParam;
    }

    /**
     * Set A special parameter for HLS recording.
     * @param HlsSpecialParam A special parameter for HLS recording.
     */
    public void setHlsSpecialParam(HlsSpecialParam HlsSpecialParam) {
        this.HlsSpecialParam = HlsSpecialParam;
    }

    /**
     * Get MP3 recording parameter. 
     * @return Mp3Param MP3 recording parameter.
     */
    public RecordParam getMp3Param() {
        return this.Mp3Param;
    }

    /**
     * Set MP3 recording parameter.
     * @param Mp3Param MP3 recording parameter.
     */
    public void setMp3Param(RecordParam Mp3Param) {
        this.Mp3Param = Mp3Param;
    }

    /**
     * Get Whether the watermark is removed.
Note: This field may return `null`, indicating that no valid value was found. 
     * @return RemoveWatermark Whether the watermark is removed.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public Boolean getRemoveWatermark() {
        return this.RemoveWatermark;
    }

    /**
     * Set Whether the watermark is removed.
Note: This field may return `null`, indicating that no valid value was found.
     * @param RemoveWatermark Whether the watermark is removed.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setRemoveWatermark(Boolean RemoveWatermark) {
        this.RemoveWatermark = RemoveWatermark;
    }

    /**
     * Get A special parameter for FLV recording.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return FlvSpecialParam A special parameter for FLV recording.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public FlvSpecialParam getFlvSpecialParam() {
        return this.FlvSpecialParam;
    }

    /**
     * Set A special parameter for FLV recording.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param FlvSpecialParam A special parameter for FLV recording.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setFlvSpecialParam(FlvSpecialParam FlvSpecialParam) {
        this.FlvSpecialParam = FlvSpecialParam;
    }

    public RecordTemplateInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecordTemplateInfo(RecordTemplateInfo source) {
        if (source.TemplateId != null) {
            this.TemplateId = new Long(source.TemplateId);
        }
        if (source.TemplateName != null) {
            this.TemplateName = new String(source.TemplateName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.FlvParam != null) {
            this.FlvParam = new RecordParam(source.FlvParam);
        }
        if (source.HlsParam != null) {
            this.HlsParam = new RecordParam(source.HlsParam);
        }
        if (source.Mp4Param != null) {
            this.Mp4Param = new RecordParam(source.Mp4Param);
        }
        if (source.AacParam != null) {
            this.AacParam = new RecordParam(source.AacParam);
        }
        if (source.IsDelayLive != null) {
            this.IsDelayLive = new Long(source.IsDelayLive);
        }
        if (source.HlsSpecialParam != null) {
            this.HlsSpecialParam = new HlsSpecialParam(source.HlsSpecialParam);
        }
        if (source.Mp3Param != null) {
            this.Mp3Param = new RecordParam(source.Mp3Param);
        }
        if (source.RemoveWatermark != null) {
            this.RemoveWatermark = new Boolean(source.RemoveWatermark);
        }
        if (source.FlvSpecialParam != null) {
            this.FlvSpecialParam = new FlvSpecialParam(source.FlvSpecialParam);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamObj(map, prefix + "FlvParam.", this.FlvParam);
        this.setParamObj(map, prefix + "HlsParam.", this.HlsParam);
        this.setParamObj(map, prefix + "Mp4Param.", this.Mp4Param);
        this.setParamObj(map, prefix + "AacParam.", this.AacParam);
        this.setParamSimple(map, prefix + "IsDelayLive", this.IsDelayLive);
        this.setParamObj(map, prefix + "HlsSpecialParam.", this.HlsSpecialParam);
        this.setParamObj(map, prefix + "Mp3Param.", this.Mp3Param);
        this.setParamSimple(map, prefix + "RemoveWatermark", this.RemoveWatermark);
        this.setParamObj(map, prefix + "FlvSpecialParam.", this.FlvSpecialParam);

    }
}

