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

public class DescribeVoicesRequest extends AbstractModel {

    /**
    * 
    */
    @SerializedName("SubAppId")
    @Expose
    private String SubAppId;

    /**
    * 
    */
    @SerializedName("VoiceId")
    @Expose
    private String VoiceId;

    /**
    * 
    */
    @SerializedName("VoiceType")
    @Expose
    private String VoiceType;

    /**
    * 
    */
    @SerializedName("VoiceName")
    @Expose
    private String VoiceName;

    /**
    * 
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 
    */
    @SerializedName("Gender")
    @Expose
    private String Gender;

    /**
    * 
    */
    @SerializedName("Age")
    @Expose
    private String Age;

    /**
    * 
    */
    @SerializedName("Languages")
    @Expose
    private String [] Languages;

    /**
    * 
    */
    @SerializedName("Labels")
    @Expose
    private String [] Labels;

    /**
    * 
    */
    @SerializedName("Scenes")
    @Expose
    private String [] Scenes;

    /**
    * 
    */
    @SerializedName("ExtParam")
    @Expose
    private String ExtParam;

    /**
     * Get  
     * @return SubAppId 
     */
    public String getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set 
     * @param SubAppId 
     */
    public void setSubAppId(String SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get  
     * @return VoiceId 
     */
    public String getVoiceId() {
        return this.VoiceId;
    }

    /**
     * Set 
     * @param VoiceId 
     */
    public void setVoiceId(String VoiceId) {
        this.VoiceId = VoiceId;
    }

    /**
     * Get  
     * @return VoiceType 
     */
    public String getVoiceType() {
        return this.VoiceType;
    }

    /**
     * Set 
     * @param VoiceType 
     */
    public void setVoiceType(String VoiceType) {
        this.VoiceType = VoiceType;
    }

    /**
     * Get  
     * @return VoiceName 
     */
    public String getVoiceName() {
        return this.VoiceName;
    }

    /**
     * Set 
     * @param VoiceName 
     */
    public void setVoiceName(String VoiceName) {
        this.VoiceName = VoiceName;
    }

    /**
     * Get  
     * @return Description 
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 
     * @param Description 
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get  
     * @return Gender 
     */
    public String getGender() {
        return this.Gender;
    }

    /**
     * Set 
     * @param Gender 
     */
    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    /**
     * Get  
     * @return Age 
     */
    public String getAge() {
        return this.Age;
    }

    /**
     * Set 
     * @param Age 
     */
    public void setAge(String Age) {
        this.Age = Age;
    }

    /**
     * Get  
     * @return Languages 
     */
    public String [] getLanguages() {
        return this.Languages;
    }

    /**
     * Set 
     * @param Languages 
     */
    public void setLanguages(String [] Languages) {
        this.Languages = Languages;
    }

    /**
     * Get  
     * @return Labels 
     */
    public String [] getLabels() {
        return this.Labels;
    }

    /**
     * Set 
     * @param Labels 
     */
    public void setLabels(String [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get  
     * @return Scenes 
     */
    public String [] getScenes() {
        return this.Scenes;
    }

    /**
     * Set 
     * @param Scenes 
     */
    public void setScenes(String [] Scenes) {
        this.Scenes = Scenes;
    }

    /**
     * Get  
     * @return ExtParam 
     */
    public String getExtParam() {
        return this.ExtParam;
    }

    /**
     * Set 
     * @param ExtParam 
     */
    public void setExtParam(String ExtParam) {
        this.ExtParam = ExtParam;
    }

    public DescribeVoicesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVoicesRequest(DescribeVoicesRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new String(source.SubAppId);
        }
        if (source.VoiceId != null) {
            this.VoiceId = new String(source.VoiceId);
        }
        if (source.VoiceType != null) {
            this.VoiceType = new String(source.VoiceType);
        }
        if (source.VoiceName != null) {
            this.VoiceName = new String(source.VoiceName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Gender != null) {
            this.Gender = new String(source.Gender);
        }
        if (source.Age != null) {
            this.Age = new String(source.Age);
        }
        if (source.Languages != null) {
            this.Languages = new String[source.Languages.length];
            for (int i = 0; i < source.Languages.length; i++) {
                this.Languages[i] = new String(source.Languages[i]);
            }
        }
        if (source.Labels != null) {
            this.Labels = new String[source.Labels.length];
            for (int i = 0; i < source.Labels.length; i++) {
                this.Labels[i] = new String(source.Labels[i]);
            }
        }
        if (source.Scenes != null) {
            this.Scenes = new String[source.Scenes.length];
            for (int i = 0; i < source.Scenes.length; i++) {
                this.Scenes[i] = new String(source.Scenes[i]);
            }
        }
        if (source.ExtParam != null) {
            this.ExtParam = new String(source.ExtParam);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "VoiceId", this.VoiceId);
        this.setParamSimple(map, prefix + "VoiceType", this.VoiceType);
        this.setParamSimple(map, prefix + "VoiceName", this.VoiceName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Gender", this.Gender);
        this.setParamSimple(map, prefix + "Age", this.Age);
        this.setParamArraySimple(map, prefix + "Languages.", this.Languages);
        this.setParamArraySimple(map, prefix + "Labels.", this.Labels);
        this.setParamArraySimple(map, prefix + "Scenes.", this.Scenes);
        this.setParamSimple(map, prefix + "ExtParam", this.ExtParam);

    }
}

