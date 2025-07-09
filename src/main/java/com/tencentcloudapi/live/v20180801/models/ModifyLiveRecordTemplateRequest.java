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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyLiveRecordTemplateRequest extends AbstractModel {

    /**
    * Template ID obtained through the `DescribeRecordTemplates` API.
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
    * FLV recording parameter, which is set when FLV recording is enabled.
    */
    @SerializedName("FlvParam")
    @Expose
    private RecordParam FlvParam;

    /**
    * HLS recording parameter, which is set when HLS recording is enabled.
    */
    @SerializedName("HlsParam")
    @Expose
    private RecordParam HlsParam;

    /**
    * MP4 recording parameter, which is set when MP4 recording is enabled.
    */
    @SerializedName("Mp4Param")
    @Expose
    private RecordParam Mp4Param;

    /**
    * AAC recording parameter, which is set when AAC recording is enabled.
    */
    @SerializedName("AacParam")
    @Expose
    private RecordParam AacParam;

    /**
    * Custom HLS recording parameter.
    */
    @SerializedName("HlsSpecialParam")
    @Expose
    private HlsSpecialParam HlsSpecialParam;

    /**
    * MP3 recording parameter, which is set when MP3 recording is enabled.
    */
    @SerializedName("Mp3Param")
    @Expose
    private RecordParam Mp3Param;

    /**
    * Whether to remove the watermark. This parameter is invalid if `IsDelayLive` is `1`.
    */
    @SerializedName("RemoveWatermark")
    @Expose
    private Boolean RemoveWatermark;

    /**
    * A special parameter for FLV recording.
    */
    @SerializedName("FlvSpecialParam")
    @Expose
    private FlvSpecialParam FlvSpecialParam;

    /**
     * Get Template ID obtained through the `DescribeRecordTemplates` API. 
     * @return TemplateId Template ID obtained through the `DescribeRecordTemplates` API.
     */
    public Long getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set Template ID obtained through the `DescribeRecordTemplates` API.
     * @param TemplateId Template ID obtained through the `DescribeRecordTemplates` API.
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
     * Get FLV recording parameter, which is set when FLV recording is enabled. 
     * @return FlvParam FLV recording parameter, which is set when FLV recording is enabled.
     */
    public RecordParam getFlvParam() {
        return this.FlvParam;
    }

    /**
     * Set FLV recording parameter, which is set when FLV recording is enabled.
     * @param FlvParam FLV recording parameter, which is set when FLV recording is enabled.
     */
    public void setFlvParam(RecordParam FlvParam) {
        this.FlvParam = FlvParam;
    }

    /**
     * Get HLS recording parameter, which is set when HLS recording is enabled. 
     * @return HlsParam HLS recording parameter, which is set when HLS recording is enabled.
     */
    public RecordParam getHlsParam() {
        return this.HlsParam;
    }

    /**
     * Set HLS recording parameter, which is set when HLS recording is enabled.
     * @param HlsParam HLS recording parameter, which is set when HLS recording is enabled.
     */
    public void setHlsParam(RecordParam HlsParam) {
        this.HlsParam = HlsParam;
    }

    /**
     * Get MP4 recording parameter, which is set when MP4 recording is enabled. 
     * @return Mp4Param MP4 recording parameter, which is set when MP4 recording is enabled.
     */
    public RecordParam getMp4Param() {
        return this.Mp4Param;
    }

    /**
     * Set MP4 recording parameter, which is set when MP4 recording is enabled.
     * @param Mp4Param MP4 recording parameter, which is set when MP4 recording is enabled.
     */
    public void setMp4Param(RecordParam Mp4Param) {
        this.Mp4Param = Mp4Param;
    }

    /**
     * Get AAC recording parameter, which is set when AAC recording is enabled. 
     * @return AacParam AAC recording parameter, which is set when AAC recording is enabled.
     */
    public RecordParam getAacParam() {
        return this.AacParam;
    }

    /**
     * Set AAC recording parameter, which is set when AAC recording is enabled.
     * @param AacParam AAC recording parameter, which is set when AAC recording is enabled.
     */
    public void setAacParam(RecordParam AacParam) {
        this.AacParam = AacParam;
    }

    /**
     * Get Custom HLS recording parameter. 
     * @return HlsSpecialParam Custom HLS recording parameter.
     */
    public HlsSpecialParam getHlsSpecialParam() {
        return this.HlsSpecialParam;
    }

    /**
     * Set Custom HLS recording parameter.
     * @param HlsSpecialParam Custom HLS recording parameter.
     */
    public void setHlsSpecialParam(HlsSpecialParam HlsSpecialParam) {
        this.HlsSpecialParam = HlsSpecialParam;
    }

    /**
     * Get MP3 recording parameter, which is set when MP3 recording is enabled. 
     * @return Mp3Param MP3 recording parameter, which is set when MP3 recording is enabled.
     */
    public RecordParam getMp3Param() {
        return this.Mp3Param;
    }

    /**
     * Set MP3 recording parameter, which is set when MP3 recording is enabled.
     * @param Mp3Param MP3 recording parameter, which is set when MP3 recording is enabled.
     */
    public void setMp3Param(RecordParam Mp3Param) {
        this.Mp3Param = Mp3Param;
    }

    /**
     * Get Whether to remove the watermark. This parameter is invalid if `IsDelayLive` is `1`. 
     * @return RemoveWatermark Whether to remove the watermark. This parameter is invalid if `IsDelayLive` is `1`.
     */
    public Boolean getRemoveWatermark() {
        return this.RemoveWatermark;
    }

    /**
     * Set Whether to remove the watermark. This parameter is invalid if `IsDelayLive` is `1`.
     * @param RemoveWatermark Whether to remove the watermark. This parameter is invalid if `IsDelayLive` is `1`.
     */
    public void setRemoveWatermark(Boolean RemoveWatermark) {
        this.RemoveWatermark = RemoveWatermark;
    }

    /**
     * Get A special parameter for FLV recording. 
     * @return FlvSpecialParam A special parameter for FLV recording.
     */
    public FlvSpecialParam getFlvSpecialParam() {
        return this.FlvSpecialParam;
    }

    /**
     * Set A special parameter for FLV recording.
     * @param FlvSpecialParam A special parameter for FLV recording.
     */
    public void setFlvSpecialParam(FlvSpecialParam FlvSpecialParam) {
        this.FlvSpecialParam = FlvSpecialParam;
    }

    public ModifyLiveRecordTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLiveRecordTemplateRequest(ModifyLiveRecordTemplateRequest source) {
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
        this.setParamObj(map, prefix + "HlsSpecialParam.", this.HlsSpecialParam);
        this.setParamObj(map, prefix + "Mp3Param.", this.Mp3Param);
        this.setParamSimple(map, prefix + "RemoveWatermark", this.RemoveWatermark);
        this.setParamObj(map, prefix + "FlvSpecialParam.", this.FlvSpecialParam);

    }
}

