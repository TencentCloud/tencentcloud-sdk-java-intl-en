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

public class RecordTemplateInfo extends AbstractModel{

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
    * Mp4 recording parameter.
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
    * Custom HLS recording parameter.
    */
    @SerializedName("HlsSpecialParam")
    @Expose
    private HlsSpecialParam HlsSpecialParam;

    /**
    * Mp3 recording parameter.
    */
    @SerializedName("Mp3Param")
    @Expose
    private RecordParam Mp3Param;

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
     * Get Mp4 recording parameter. 
     * @return Mp4Param Mp4 recording parameter.
     */
    public RecordParam getMp4Param() {
        return this.Mp4Param;
    }

    /**
     * Set Mp4 recording parameter.
     * @param Mp4Param Mp4 recording parameter.
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
     * Get Mp3 recording parameter. 
     * @return Mp3Param Mp3 recording parameter.
     */
    public RecordParam getMp3Param() {
        return this.Mp3Param;
    }

    /**
     * Set Mp3 recording parameter.
     * @param Mp3Param Mp3 recording parameter.
     */
    public void setMp3Param(RecordParam Mp3Param) {
        this.Mp3Param = Mp3Param;
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

    }
}

