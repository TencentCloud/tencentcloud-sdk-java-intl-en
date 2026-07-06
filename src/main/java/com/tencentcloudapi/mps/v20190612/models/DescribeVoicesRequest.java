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

public class DescribeVoicesRequest extends AbstractModel {

    /**
    * <p>Voice ID.</p>
    */
    @SerializedName("VoiceId")
    @Expose
    private String VoiceId;

    /**
    * <p>Voice type.</p><p>Enumeration values:</p><ul><li>system: system audio.</li><li>clone: cloned audio.</li><li>design: designed audio.</li><li>all: All voices (default).</li></ul>
    */
    @SerializedName("VoiceType")
    @Expose
    private String VoiceType;

    /**
    * <p>Voice name.</p>
    */
    @SerializedName("VoiceName")
    @Expose
    private String VoiceName;

    /**
    * <p>Voice description.</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Gender.</p><p>Enumeration values:</p><ul><li>male: male</li><li>female: female</li><li>unknown: unknown</li></ul>
    */
    @SerializedName("Gender")
    @Expose
    private String Gender;

    /**
    * <p>Age.</p><p>Enumeration values:</p><ul><li>child: child</li><li>teenager: teenager</li><li>youth: youth</li><li>middle_aged: middle-aged</li><li>senior: senior</li><li>unknown: unknown</li></ul>
    */
    @SerializedName("Age")
    @Expose
    private String Age;

    /**
    * <p>Language.</p>
    */
    @SerializedName("Languages")
    @Expose
    private String [] Languages;

    /**
    * <p>Tag.</p>
    */
    @SerializedName("Labels")
    @Expose
    private String [] Labels;

    /**
    * <p>Scenario.</p>
    */
    @SerializedName("Scenes")
    @Expose
    private String [] Scenes;

    /**
    * <p>Extended parameters in the format of a JSON string. </p><p>Other filter criteria:
voiceName (String): Voice name, fuzzy matching. labels (Array of String): Tags. Matches voices that contain these tags.</p>
    */
    @SerializedName("ExtParam")
    @Expose
    private String ExtParam;

    /**
     * Get <p>Voice ID.</p> 
     * @return VoiceId <p>Voice ID.</p>
     */
    public String getVoiceId() {
        return this.VoiceId;
    }

    /**
     * Set <p>Voice ID.</p>
     * @param VoiceId <p>Voice ID.</p>
     */
    public void setVoiceId(String VoiceId) {
        this.VoiceId = VoiceId;
    }

    /**
     * Get <p>Voice type.</p><p>Enumeration values:</p><ul><li>system: system audio.</li><li>clone: cloned audio.</li><li>design: designed audio.</li><li>all: All voices (default).</li></ul> 
     * @return VoiceType <p>Voice type.</p><p>Enumeration values:</p><ul><li>system: system audio.</li><li>clone: cloned audio.</li><li>design: designed audio.</li><li>all: All voices (default).</li></ul>
     */
    public String getVoiceType() {
        return this.VoiceType;
    }

    /**
     * Set <p>Voice type.</p><p>Enumeration values:</p><ul><li>system: system audio.</li><li>clone: cloned audio.</li><li>design: designed audio.</li><li>all: All voices (default).</li></ul>
     * @param VoiceType <p>Voice type.</p><p>Enumeration values:</p><ul><li>system: system audio.</li><li>clone: cloned audio.</li><li>design: designed audio.</li><li>all: All voices (default).</li></ul>
     */
    public void setVoiceType(String VoiceType) {
        this.VoiceType = VoiceType;
    }

    /**
     * Get <p>Voice name.</p> 
     * @return VoiceName <p>Voice name.</p>
     */
    public String getVoiceName() {
        return this.VoiceName;
    }

    /**
     * Set <p>Voice name.</p>
     * @param VoiceName <p>Voice name.</p>
     */
    public void setVoiceName(String VoiceName) {
        this.VoiceName = VoiceName;
    }

    /**
     * Get <p>Voice description.</p> 
     * @return Description <p>Voice description.</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Voice description.</p>
     * @param Description <p>Voice description.</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Gender.</p><p>Enumeration values:</p><ul><li>male: male</li><li>female: female</li><li>unknown: unknown</li></ul> 
     * @return Gender <p>Gender.</p><p>Enumeration values:</p><ul><li>male: male</li><li>female: female</li><li>unknown: unknown</li></ul>
     */
    public String getGender() {
        return this.Gender;
    }

    /**
     * Set <p>Gender.</p><p>Enumeration values:</p><ul><li>male: male</li><li>female: female</li><li>unknown: unknown</li></ul>
     * @param Gender <p>Gender.</p><p>Enumeration values:</p><ul><li>male: male</li><li>female: female</li><li>unknown: unknown</li></ul>
     */
    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    /**
     * Get <p>Age.</p><p>Enumeration values:</p><ul><li>child: child</li><li>teenager: teenager</li><li>youth: youth</li><li>middle_aged: middle-aged</li><li>senior: senior</li><li>unknown: unknown</li></ul> 
     * @return Age <p>Age.</p><p>Enumeration values:</p><ul><li>child: child</li><li>teenager: teenager</li><li>youth: youth</li><li>middle_aged: middle-aged</li><li>senior: senior</li><li>unknown: unknown</li></ul>
     */
    public String getAge() {
        return this.Age;
    }

    /**
     * Set <p>Age.</p><p>Enumeration values:</p><ul><li>child: child</li><li>teenager: teenager</li><li>youth: youth</li><li>middle_aged: middle-aged</li><li>senior: senior</li><li>unknown: unknown</li></ul>
     * @param Age <p>Age.</p><p>Enumeration values:</p><ul><li>child: child</li><li>teenager: teenager</li><li>youth: youth</li><li>middle_aged: middle-aged</li><li>senior: senior</li><li>unknown: unknown</li></ul>
     */
    public void setAge(String Age) {
        this.Age = Age;
    }

    /**
     * Get <p>Language.</p> 
     * @return Languages <p>Language.</p>
     */
    public String [] getLanguages() {
        return this.Languages;
    }

    /**
     * Set <p>Language.</p>
     * @param Languages <p>Language.</p>
     */
    public void setLanguages(String [] Languages) {
        this.Languages = Languages;
    }

    /**
     * Get <p>Tag.</p> 
     * @return Labels <p>Tag.</p>
     */
    public String [] getLabels() {
        return this.Labels;
    }

    /**
     * Set <p>Tag.</p>
     * @param Labels <p>Tag.</p>
     */
    public void setLabels(String [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get <p>Scenario.</p> 
     * @return Scenes <p>Scenario.</p>
     */
    public String [] getScenes() {
        return this.Scenes;
    }

    /**
     * Set <p>Scenario.</p>
     * @param Scenes <p>Scenario.</p>
     */
    public void setScenes(String [] Scenes) {
        this.Scenes = Scenes;
    }

    /**
     * Get <p>Extended parameters in the format of a JSON string. </p><p>Other filter criteria:
voiceName (String): Voice name, fuzzy matching. labels (Array of String): Tags. Matches voices that contain these tags.</p> 
     * @return ExtParam <p>Extended parameters in the format of a JSON string. </p><p>Other filter criteria:
voiceName (String): Voice name, fuzzy matching. labels (Array of String): Tags. Matches voices that contain these tags.</p>
     */
    public String getExtParam() {
        return this.ExtParam;
    }

    /**
     * Set <p>Extended parameters in the format of a JSON string. </p><p>Other filter criteria:
voiceName (String): Voice name, fuzzy matching. labels (Array of String): Tags. Matches voices that contain these tags.</p>
     * @param ExtParam <p>Extended parameters in the format of a JSON string. </p><p>Other filter criteria:
voiceName (String): Voice name, fuzzy matching. labels (Array of String): Tags. Matches voices that contain these tags.</p>
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

