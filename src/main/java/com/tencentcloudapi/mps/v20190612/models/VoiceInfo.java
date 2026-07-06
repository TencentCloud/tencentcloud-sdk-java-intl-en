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

public class VoiceInfo extends AbstractModel {

    /**
    * <p>Voice ID.</p>
    */
    @SerializedName("VoiceId")
    @Expose
    private String VoiceId;

    /**
    * <p>Voice name.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Voice description.</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Voice type. </p><p>Enumeration value: </p><ul><li>system: System audio.</li></ul>
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * <p>Gender. </p><p>Enumeration values: </p><ul><li>male: Male, </li><li>female: Female.</li></ul>
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
    * <p>List of supported languages. </p><p>For example: en.</p>
    */
    @SerializedName("Languages")
    @Expose
    private String [] Languages;

    /**
    * <p>Audition audio URL.</p>
    */
    @SerializedName("AudioUrl")
    @Expose
    private String AudioUrl;

    /**
    * <p>List of tags. </p><p>For example: gentle.</p>
    */
    @SerializedName("Labels")
    @Expose
    private String [] Labels;

    /**
    * <p>Recommended scenarios. </p><p>For example: education.</p>
    */
    @SerializedName("Scenes")
    @Expose
    private String [] Scenes;

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
     * Get <p>Voice name.</p> 
     * @return Name <p>Voice name.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Voice name.</p>
     * @param Name <p>Voice name.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
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
     * Get <p>Voice type. </p><p>Enumeration value: </p><ul><li>system: System audio.</li></ul> 
     * @return Category <p>Voice type. </p><p>Enumeration value: </p><ul><li>system: System audio.</li></ul>
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set <p>Voice type. </p><p>Enumeration value: </p><ul><li>system: System audio.</li></ul>
     * @param Category <p>Voice type. </p><p>Enumeration value: </p><ul><li>system: System audio.</li></ul>
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get <p>Gender. </p><p>Enumeration values: </p><ul><li>male: Male, </li><li>female: Female.</li></ul> 
     * @return Gender <p>Gender. </p><p>Enumeration values: </p><ul><li>male: Male, </li><li>female: Female.</li></ul>
     */
    public String getGender() {
        return this.Gender;
    }

    /**
     * Set <p>Gender. </p><p>Enumeration values: </p><ul><li>male: Male, </li><li>female: Female.</li></ul>
     * @param Gender <p>Gender. </p><p>Enumeration values: </p><ul><li>male: Male, </li><li>female: Female.</li></ul>
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
     * Get <p>List of supported languages. </p><p>For example: en.</p> 
     * @return Languages <p>List of supported languages. </p><p>For example: en.</p>
     */
    public String [] getLanguages() {
        return this.Languages;
    }

    /**
     * Set <p>List of supported languages. </p><p>For example: en.</p>
     * @param Languages <p>List of supported languages. </p><p>For example: en.</p>
     */
    public void setLanguages(String [] Languages) {
        this.Languages = Languages;
    }

    /**
     * Get <p>Audition audio URL.</p> 
     * @return AudioUrl <p>Audition audio URL.</p>
     */
    public String getAudioUrl() {
        return this.AudioUrl;
    }

    /**
     * Set <p>Audition audio URL.</p>
     * @param AudioUrl <p>Audition audio URL.</p>
     */
    public void setAudioUrl(String AudioUrl) {
        this.AudioUrl = AudioUrl;
    }

    /**
     * Get <p>List of tags. </p><p>For example: gentle.</p> 
     * @return Labels <p>List of tags. </p><p>For example: gentle.</p>
     */
    public String [] getLabels() {
        return this.Labels;
    }

    /**
     * Set <p>List of tags. </p><p>For example: gentle.</p>
     * @param Labels <p>List of tags. </p><p>For example: gentle.</p>
     */
    public void setLabels(String [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get <p>Recommended scenarios. </p><p>For example: education.</p> 
     * @return Scenes <p>Recommended scenarios. </p><p>For example: education.</p>
     */
    public String [] getScenes() {
        return this.Scenes;
    }

    /**
     * Set <p>Recommended scenarios. </p><p>For example: education.</p>
     * @param Scenes <p>Recommended scenarios. </p><p>For example: education.</p>
     */
    public void setScenes(String [] Scenes) {
        this.Scenes = Scenes;
    }

    public VoiceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VoiceInfo(VoiceInfo source) {
        if (source.VoiceId != null) {
            this.VoiceId = new String(source.VoiceId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
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
        if (source.AudioUrl != null) {
            this.AudioUrl = new String(source.AudioUrl);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VoiceId", this.VoiceId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "Gender", this.Gender);
        this.setParamSimple(map, prefix + "Age", this.Age);
        this.setParamArraySimple(map, prefix + "Languages.", this.Languages);
        this.setParamSimple(map, prefix + "AudioUrl", this.AudioUrl);
        this.setParamArraySimple(map, prefix + "Labels.", this.Labels);
        this.setParamArraySimple(map, prefix + "Scenes.", this.Scenes);

    }
}

