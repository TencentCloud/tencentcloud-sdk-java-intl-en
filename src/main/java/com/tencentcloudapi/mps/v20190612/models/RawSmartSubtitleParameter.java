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

public class RawSmartSubtitleParameter extends AbstractModel {

    /**
    * 
    */
    @SerializedName("SubtitleType")
    @Expose
    private Long SubtitleType;

    /**
    * 
    */
    @SerializedName("VideoSrcLanguage")
    @Expose
    private String VideoSrcLanguage;

    /**
    * 
    */
    @SerializedName("SubtitleFormat")
    @Expose
    private String SubtitleFormat;

    /**
    * 
    */
    @SerializedName("TranslateSwitch")
    @Expose
    private String TranslateSwitch;

    /**
    * 
    */
    @SerializedName("TranslateDstLanguage")
    @Expose
    private String TranslateDstLanguage;

    /**
    * 
    */
    @SerializedName("AsrHotWordsConfigure")
    @Expose
    private AsrHotWordsConfigure AsrHotWordsConfigure;

    /**
    * 
    */
    @SerializedName("ExtInfo")
    @Expose
    private String ExtInfo;

    /**
    * 
    */
    @SerializedName("ProcessType")
    @Expose
    private Long ProcessType;

    /**
    * 
    */
    @SerializedName("SelectingSubtitleAreasConfig")
    @Expose
    private SelectingSubtitleAreasConfig SelectingSubtitleAreasConfig;

    /**
    * 
    */
    @SerializedName("SubtitleEmbedId")
    @Expose
    private Long SubtitleEmbedId;

    /**
    * 
    */
    @SerializedName("SpeakerMode")
    @Expose
    private Long SpeakerMode;

    /**
    * 
    */
    @SerializedName("SpeakerLabel")
    @Expose
    private Long SpeakerLabel;

    /**
     * Get  
     * @return SubtitleType 
     */
    public Long getSubtitleType() {
        return this.SubtitleType;
    }

    /**
     * Set 
     * @param SubtitleType 
     */
    public void setSubtitleType(Long SubtitleType) {
        this.SubtitleType = SubtitleType;
    }

    /**
     * Get  
     * @return VideoSrcLanguage 
     */
    public String getVideoSrcLanguage() {
        return this.VideoSrcLanguage;
    }

    /**
     * Set 
     * @param VideoSrcLanguage 
     */
    public void setVideoSrcLanguage(String VideoSrcLanguage) {
        this.VideoSrcLanguage = VideoSrcLanguage;
    }

    /**
     * Get  
     * @return SubtitleFormat 
     */
    public String getSubtitleFormat() {
        return this.SubtitleFormat;
    }

    /**
     * Set 
     * @param SubtitleFormat 
     */
    public void setSubtitleFormat(String SubtitleFormat) {
        this.SubtitleFormat = SubtitleFormat;
    }

    /**
     * Get  
     * @return TranslateSwitch 
     */
    public String getTranslateSwitch() {
        return this.TranslateSwitch;
    }

    /**
     * Set 
     * @param TranslateSwitch 
     */
    public void setTranslateSwitch(String TranslateSwitch) {
        this.TranslateSwitch = TranslateSwitch;
    }

    /**
     * Get  
     * @return TranslateDstLanguage 
     */
    public String getTranslateDstLanguage() {
        return this.TranslateDstLanguage;
    }

    /**
     * Set 
     * @param TranslateDstLanguage 
     */
    public void setTranslateDstLanguage(String TranslateDstLanguage) {
        this.TranslateDstLanguage = TranslateDstLanguage;
    }

    /**
     * Get  
     * @return AsrHotWordsConfigure 
     */
    public AsrHotWordsConfigure getAsrHotWordsConfigure() {
        return this.AsrHotWordsConfigure;
    }

    /**
     * Set 
     * @param AsrHotWordsConfigure 
     */
    public void setAsrHotWordsConfigure(AsrHotWordsConfigure AsrHotWordsConfigure) {
        this.AsrHotWordsConfigure = AsrHotWordsConfigure;
    }

    /**
     * Get  
     * @return ExtInfo 
     */
    public String getExtInfo() {
        return this.ExtInfo;
    }

    /**
     * Set 
     * @param ExtInfo 
     */
    public void setExtInfo(String ExtInfo) {
        this.ExtInfo = ExtInfo;
    }

    /**
     * Get  
     * @return ProcessType 
     */
    public Long getProcessType() {
        return this.ProcessType;
    }

    /**
     * Set 
     * @param ProcessType 
     */
    public void setProcessType(Long ProcessType) {
        this.ProcessType = ProcessType;
    }

    /**
     * Get  
     * @return SelectingSubtitleAreasConfig 
     */
    public SelectingSubtitleAreasConfig getSelectingSubtitleAreasConfig() {
        return this.SelectingSubtitleAreasConfig;
    }

    /**
     * Set 
     * @param SelectingSubtitleAreasConfig 
     */
    public void setSelectingSubtitleAreasConfig(SelectingSubtitleAreasConfig SelectingSubtitleAreasConfig) {
        this.SelectingSubtitleAreasConfig = SelectingSubtitleAreasConfig;
    }

    /**
     * Get  
     * @return SubtitleEmbedId 
     */
    public Long getSubtitleEmbedId() {
        return this.SubtitleEmbedId;
    }

    /**
     * Set 
     * @param SubtitleEmbedId 
     */
    public void setSubtitleEmbedId(Long SubtitleEmbedId) {
        this.SubtitleEmbedId = SubtitleEmbedId;
    }

    /**
     * Get  
     * @return SpeakerMode 
     */
    public Long getSpeakerMode() {
        return this.SpeakerMode;
    }

    /**
     * Set 
     * @param SpeakerMode 
     */
    public void setSpeakerMode(Long SpeakerMode) {
        this.SpeakerMode = SpeakerMode;
    }

    /**
     * Get  
     * @return SpeakerLabel 
     */
    public Long getSpeakerLabel() {
        return this.SpeakerLabel;
    }

    /**
     * Set 
     * @param SpeakerLabel 
     */
    public void setSpeakerLabel(Long SpeakerLabel) {
        this.SpeakerLabel = SpeakerLabel;
    }

    public RawSmartSubtitleParameter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RawSmartSubtitleParameter(RawSmartSubtitleParameter source) {
        if (source.SubtitleType != null) {
            this.SubtitleType = new Long(source.SubtitleType);
        }
        if (source.VideoSrcLanguage != null) {
            this.VideoSrcLanguage = new String(source.VideoSrcLanguage);
        }
        if (source.SubtitleFormat != null) {
            this.SubtitleFormat = new String(source.SubtitleFormat);
        }
        if (source.TranslateSwitch != null) {
            this.TranslateSwitch = new String(source.TranslateSwitch);
        }
        if (source.TranslateDstLanguage != null) {
            this.TranslateDstLanguage = new String(source.TranslateDstLanguage);
        }
        if (source.AsrHotWordsConfigure != null) {
            this.AsrHotWordsConfigure = new AsrHotWordsConfigure(source.AsrHotWordsConfigure);
        }
        if (source.ExtInfo != null) {
            this.ExtInfo = new String(source.ExtInfo);
        }
        if (source.ProcessType != null) {
            this.ProcessType = new Long(source.ProcessType);
        }
        if (source.SelectingSubtitleAreasConfig != null) {
            this.SelectingSubtitleAreasConfig = new SelectingSubtitleAreasConfig(source.SelectingSubtitleAreasConfig);
        }
        if (source.SubtitleEmbedId != null) {
            this.SubtitleEmbedId = new Long(source.SubtitleEmbedId);
        }
        if (source.SpeakerMode != null) {
            this.SpeakerMode = new Long(source.SpeakerMode);
        }
        if (source.SpeakerLabel != null) {
            this.SpeakerLabel = new Long(source.SpeakerLabel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubtitleType", this.SubtitleType);
        this.setParamSimple(map, prefix + "VideoSrcLanguage", this.VideoSrcLanguage);
        this.setParamSimple(map, prefix + "SubtitleFormat", this.SubtitleFormat);
        this.setParamSimple(map, prefix + "TranslateSwitch", this.TranslateSwitch);
        this.setParamSimple(map, prefix + "TranslateDstLanguage", this.TranslateDstLanguage);
        this.setParamObj(map, prefix + "AsrHotWordsConfigure.", this.AsrHotWordsConfigure);
        this.setParamSimple(map, prefix + "ExtInfo", this.ExtInfo);
        this.setParamSimple(map, prefix + "ProcessType", this.ProcessType);
        this.setParamObj(map, prefix + "SelectingSubtitleAreasConfig.", this.SelectingSubtitleAreasConfig);
        this.setParamSimple(map, prefix + "SubtitleEmbedId", this.SubtitleEmbedId);
        this.setParamSimple(map, prefix + "SpeakerMode", this.SpeakerMode);
        this.setParamSimple(map, prefix + "SpeakerLabel", this.SpeakerLabel);

    }
}

