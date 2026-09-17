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

public class AigcVideoOutputConfig extends AbstractModel {

    /**
    * 
    */
    @SerializedName("StorageMode")
    @Expose
    private String StorageMode;

    /**
    * 
    */
    @SerializedName("MediaName")
    @Expose
    private String MediaName;

    /**
    * 
    */
    @SerializedName("ClassId")
    @Expose
    private Long ClassId;

    /**
    * 
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 
    */
    @SerializedName("Duration")
    @Expose
    private Float Duration;

    /**
    * 
    */
    @SerializedName("Resolution")
    @Expose
    private String Resolution;

    /**
    * 
    */
    @SerializedName("AspectRatio")
    @Expose
    private String AspectRatio;

    /**
    * 
    */
    @SerializedName("AudioGeneration")
    @Expose
    private String AudioGeneration;

    /**
    * 
    */
    @SerializedName("PersonGeneration")
    @Expose
    private String PersonGeneration;

    /**
    * 
    */
    @SerializedName("InputComplianceCheck")
    @Expose
    private String InputComplianceCheck;

    /**
    * 
    */
    @SerializedName("OutputComplianceCheck")
    @Expose
    private String OutputComplianceCheck;

    /**
    * 
    */
    @SerializedName("EnhanceSwitch")
    @Expose
    private String EnhanceSwitch;

    /**
    * 
    */
    @SerializedName("OffPeak")
    @Expose
    private String OffPeak;

    /**
    * 
    */
    @SerializedName("FrameInterpolate")
    @Expose
    private String FrameInterpolate;

    /**
    * 
    */
    @SerializedName("LogoAdd")
    @Expose
    private String LogoAdd;

    /**
    * 
    */
    @SerializedName("EnableBGM")
    @Expose
    private String EnableBGM;

    /**
     * Get  
     * @return StorageMode 
     */
    public String getStorageMode() {
        return this.StorageMode;
    }

    /**
     * Set 
     * @param StorageMode 
     */
    public void setStorageMode(String StorageMode) {
        this.StorageMode = StorageMode;
    }

    /**
     * Get  
     * @return MediaName 
     */
    public String getMediaName() {
        return this.MediaName;
    }

    /**
     * Set 
     * @param MediaName 
     */
    public void setMediaName(String MediaName) {
        this.MediaName = MediaName;
    }

    /**
     * Get  
     * @return ClassId 
     */
    public Long getClassId() {
        return this.ClassId;
    }

    /**
     * Set 
     * @param ClassId 
     */
    public void setClassId(Long ClassId) {
        this.ClassId = ClassId;
    }

    /**
     * Get  
     * @return ExpireTime 
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 
     * @param ExpireTime 
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get  
     * @return Duration 
     */
    public Float getDuration() {
        return this.Duration;
    }

    /**
     * Set 
     * @param Duration 
     */
    public void setDuration(Float Duration) {
        this.Duration = Duration;
    }

    /**
     * Get  
     * @return Resolution 
     */
    public String getResolution() {
        return this.Resolution;
    }

    /**
     * Set 
     * @param Resolution 
     */
    public void setResolution(String Resolution) {
        this.Resolution = Resolution;
    }

    /**
     * Get  
     * @return AspectRatio 
     */
    public String getAspectRatio() {
        return this.AspectRatio;
    }

    /**
     * Set 
     * @param AspectRatio 
     */
    public void setAspectRatio(String AspectRatio) {
        this.AspectRatio = AspectRatio;
    }

    /**
     * Get  
     * @return AudioGeneration 
     */
    public String getAudioGeneration() {
        return this.AudioGeneration;
    }

    /**
     * Set 
     * @param AudioGeneration 
     */
    public void setAudioGeneration(String AudioGeneration) {
        this.AudioGeneration = AudioGeneration;
    }

    /**
     * Get  
     * @return PersonGeneration 
     */
    public String getPersonGeneration() {
        return this.PersonGeneration;
    }

    /**
     * Set 
     * @param PersonGeneration 
     */
    public void setPersonGeneration(String PersonGeneration) {
        this.PersonGeneration = PersonGeneration;
    }

    /**
     * Get  
     * @return InputComplianceCheck 
     */
    public String getInputComplianceCheck() {
        return this.InputComplianceCheck;
    }

    /**
     * Set 
     * @param InputComplianceCheck 
     */
    public void setInputComplianceCheck(String InputComplianceCheck) {
        this.InputComplianceCheck = InputComplianceCheck;
    }

    /**
     * Get  
     * @return OutputComplianceCheck 
     */
    public String getOutputComplianceCheck() {
        return this.OutputComplianceCheck;
    }

    /**
     * Set 
     * @param OutputComplianceCheck 
     */
    public void setOutputComplianceCheck(String OutputComplianceCheck) {
        this.OutputComplianceCheck = OutputComplianceCheck;
    }

    /**
     * Get  
     * @return EnhanceSwitch 
     */
    public String getEnhanceSwitch() {
        return this.EnhanceSwitch;
    }

    /**
     * Set 
     * @param EnhanceSwitch 
     */
    public void setEnhanceSwitch(String EnhanceSwitch) {
        this.EnhanceSwitch = EnhanceSwitch;
    }

    /**
     * Get  
     * @return OffPeak 
     */
    public String getOffPeak() {
        return this.OffPeak;
    }

    /**
     * Set 
     * @param OffPeak 
     */
    public void setOffPeak(String OffPeak) {
        this.OffPeak = OffPeak;
    }

    /**
     * Get  
     * @return FrameInterpolate 
     */
    public String getFrameInterpolate() {
        return this.FrameInterpolate;
    }

    /**
     * Set 
     * @param FrameInterpolate 
     */
    public void setFrameInterpolate(String FrameInterpolate) {
        this.FrameInterpolate = FrameInterpolate;
    }

    /**
     * Get  
     * @return LogoAdd 
     */
    public String getLogoAdd() {
        return this.LogoAdd;
    }

    /**
     * Set 
     * @param LogoAdd 
     */
    public void setLogoAdd(String LogoAdd) {
        this.LogoAdd = LogoAdd;
    }

    /**
     * Get  
     * @return EnableBGM 
     */
    public String getEnableBGM() {
        return this.EnableBGM;
    }

    /**
     * Set 
     * @param EnableBGM 
     */
    public void setEnableBGM(String EnableBGM) {
        this.EnableBGM = EnableBGM;
    }

    public AigcVideoOutputConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AigcVideoOutputConfig(AigcVideoOutputConfig source) {
        if (source.StorageMode != null) {
            this.StorageMode = new String(source.StorageMode);
        }
        if (source.MediaName != null) {
            this.MediaName = new String(source.MediaName);
        }
        if (source.ClassId != null) {
            this.ClassId = new Long(source.ClassId);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.Duration != null) {
            this.Duration = new Float(source.Duration);
        }
        if (source.Resolution != null) {
            this.Resolution = new String(source.Resolution);
        }
        if (source.AspectRatio != null) {
            this.AspectRatio = new String(source.AspectRatio);
        }
        if (source.AudioGeneration != null) {
            this.AudioGeneration = new String(source.AudioGeneration);
        }
        if (source.PersonGeneration != null) {
            this.PersonGeneration = new String(source.PersonGeneration);
        }
        if (source.InputComplianceCheck != null) {
            this.InputComplianceCheck = new String(source.InputComplianceCheck);
        }
        if (source.OutputComplianceCheck != null) {
            this.OutputComplianceCheck = new String(source.OutputComplianceCheck);
        }
        if (source.EnhanceSwitch != null) {
            this.EnhanceSwitch = new String(source.EnhanceSwitch);
        }
        if (source.OffPeak != null) {
            this.OffPeak = new String(source.OffPeak);
        }
        if (source.FrameInterpolate != null) {
            this.FrameInterpolate = new String(source.FrameInterpolate);
        }
        if (source.LogoAdd != null) {
            this.LogoAdd = new String(source.LogoAdd);
        }
        if (source.EnableBGM != null) {
            this.EnableBGM = new String(source.EnableBGM);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StorageMode", this.StorageMode);
        this.setParamSimple(map, prefix + "MediaName", this.MediaName);
        this.setParamSimple(map, prefix + "ClassId", this.ClassId);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "Resolution", this.Resolution);
        this.setParamSimple(map, prefix + "AspectRatio", this.AspectRatio);
        this.setParamSimple(map, prefix + "AudioGeneration", this.AudioGeneration);
        this.setParamSimple(map, prefix + "PersonGeneration", this.PersonGeneration);
        this.setParamSimple(map, prefix + "InputComplianceCheck", this.InputComplianceCheck);
        this.setParamSimple(map, prefix + "OutputComplianceCheck", this.OutputComplianceCheck);
        this.setParamSimple(map, prefix + "EnhanceSwitch", this.EnhanceSwitch);
        this.setParamSimple(map, prefix + "OffPeak", this.OffPeak);
        this.setParamSimple(map, prefix + "FrameInterpolate", this.FrameInterpolate);
        this.setParamSimple(map, prefix + "LogoAdd", this.LogoAdd);
        this.setParamSimple(map, prefix + "EnableBGM", this.EnableBGM);

    }
}

