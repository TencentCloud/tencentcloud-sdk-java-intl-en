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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateLiveRecordTemplateRequest extends AbstractModel{

    /**
    * Template name. Only letters, digits, underscores, and hyphens can be contained.
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
    * Mp4 recording parameter, which is set when Mp4 recording is enabled.
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
    * LVB type. Default value: 0.
0: LVB.
1: LCB.
    */
    @SerializedName("IsDelayLive")
    @Expose
    private Long IsDelayLive;

    /**
    * HLS-specific recording parameter.
    */
    @SerializedName("HlsSpecialParam")
    @Expose
    private HlsSpecialParam HlsSpecialParam;

    /**
    * Mp3 recording parameter, which is set when Mp3 recording is enabled.
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
     * Get Template name. Only letters, digits, underscores, and hyphens can be contained. 
     * @return TemplateName Template name. Only letters, digits, underscores, and hyphens can be contained.
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set Template name. Only letters, digits, underscores, and hyphens can be contained.
     * @param TemplateName Template name. Only letters, digits, underscores, and hyphens can be contained.
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
     * Get Mp4 recording parameter, which is set when Mp4 recording is enabled. 
     * @return Mp4Param Mp4 recording parameter, which is set when Mp4 recording is enabled.
     */
    public RecordParam getMp4Param() {
        return this.Mp4Param;
    }

    /**
     * Set Mp4 recording parameter, which is set when Mp4 recording is enabled.
     * @param Mp4Param Mp4 recording parameter, which is set when Mp4 recording is enabled.
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
     * Get LVB type. Default value: 0.
0: LVB.
1: LCB. 
     * @return IsDelayLive LVB type. Default value: 0.
0: LVB.
1: LCB.
     */
    public Long getIsDelayLive() {
        return this.IsDelayLive;
    }

    /**
     * Set LVB type. Default value: 0.
0: LVB.
1: LCB.
     * @param IsDelayLive LVB type. Default value: 0.
0: LVB.
1: LCB.
     */
    public void setIsDelayLive(Long IsDelayLive) {
        this.IsDelayLive = IsDelayLive;
    }

    /**
     * Get HLS-specific recording parameter. 
     * @return HlsSpecialParam HLS-specific recording parameter.
     */
    public HlsSpecialParam getHlsSpecialParam() {
        return this.HlsSpecialParam;
    }

    /**
     * Set HLS-specific recording parameter.
     * @param HlsSpecialParam HLS-specific recording parameter.
     */
    public void setHlsSpecialParam(HlsSpecialParam HlsSpecialParam) {
        this.HlsSpecialParam = HlsSpecialParam;
    }

    /**
     * Get Mp3 recording parameter, which is set when Mp3 recording is enabled. 
     * @return Mp3Param Mp3 recording parameter, which is set when Mp3 recording is enabled.
     */
    public RecordParam getMp3Param() {
        return this.Mp3Param;
    }

    /**
     * Set Mp3 recording parameter, which is set when Mp3 recording is enabled.
     * @param Mp3Param Mp3 recording parameter, which is set when Mp3 recording is enabled.
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

    public CreateLiveRecordTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLiveRecordTemplateRequest(CreateLiveRecordTemplateRequest source) {
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
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

    }
}

