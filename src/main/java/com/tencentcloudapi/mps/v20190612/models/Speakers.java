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

public class Speakers extends AbstractModel {

    /**
    * <p>Unique character ID.</p>
    */
    @SerializedName("SpeakerId")
    @Expose
    private String SpeakerId;

    /**
    * <p>Bound voice ID.</p>
    */
    @SerializedName("VoiceId")
    @Expose
    private String VoiceId;

    /**
    * <p>Gender: male/female. Default: male.</p>
    */
    @SerializedName("Gender")
    @Expose
    private String Gender;

    /**
    * <p>Age segment: child/teenager/youth/middle_aged/senior. Default: youth.</p>
    */
    @SerializedName("AgeGroup")
    @Expose
    private String AgeGroup;

    /**
    * <p>Character description.</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Glossary of character names.</p>
    */
    @SerializedName("NameTerms")
    @Expose
    private TermBase [] NameTerms;

    /**
     * Get <p>Unique character ID.</p> 
     * @return SpeakerId <p>Unique character ID.</p>
     */
    public String getSpeakerId() {
        return this.SpeakerId;
    }

    /**
     * Set <p>Unique character ID.</p>
     * @param SpeakerId <p>Unique character ID.</p>
     */
    public void setSpeakerId(String SpeakerId) {
        this.SpeakerId = SpeakerId;
    }

    /**
     * Get <p>Bound voice ID.</p> 
     * @return VoiceId <p>Bound voice ID.</p>
     */
    public String getVoiceId() {
        return this.VoiceId;
    }

    /**
     * Set <p>Bound voice ID.</p>
     * @param VoiceId <p>Bound voice ID.</p>
     */
    public void setVoiceId(String VoiceId) {
        this.VoiceId = VoiceId;
    }

    /**
     * Get <p>Gender: male/female. Default: male.</p> 
     * @return Gender <p>Gender: male/female. Default: male.</p>
     */
    public String getGender() {
        return this.Gender;
    }

    /**
     * Set <p>Gender: male/female. Default: male.</p>
     * @param Gender <p>Gender: male/female. Default: male.</p>
     */
    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    /**
     * Get <p>Age segment: child/teenager/youth/middle_aged/senior. Default: youth.</p> 
     * @return AgeGroup <p>Age segment: child/teenager/youth/middle_aged/senior. Default: youth.</p>
     */
    public String getAgeGroup() {
        return this.AgeGroup;
    }

    /**
     * Set <p>Age segment: child/teenager/youth/middle_aged/senior. Default: youth.</p>
     * @param AgeGroup <p>Age segment: child/teenager/youth/middle_aged/senior. Default: youth.</p>
     */
    public void setAgeGroup(String AgeGroup) {
        this.AgeGroup = AgeGroup;
    }

    /**
     * Get <p>Character description.</p> 
     * @return Description <p>Character description.</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Character description.</p>
     * @param Description <p>Character description.</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Glossary of character names.</p> 
     * @return NameTerms <p>Glossary of character names.</p>
     */
    public TermBase [] getNameTerms() {
        return this.NameTerms;
    }

    /**
     * Set <p>Glossary of character names.</p>
     * @param NameTerms <p>Glossary of character names.</p>
     */
    public void setNameTerms(TermBase [] NameTerms) {
        this.NameTerms = NameTerms;
    }

    public Speakers() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Speakers(Speakers source) {
        if (source.SpeakerId != null) {
            this.SpeakerId = new String(source.SpeakerId);
        }
        if (source.VoiceId != null) {
            this.VoiceId = new String(source.VoiceId);
        }
        if (source.Gender != null) {
            this.Gender = new String(source.Gender);
        }
        if (source.AgeGroup != null) {
            this.AgeGroup = new String(source.AgeGroup);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.NameTerms != null) {
            this.NameTerms = new TermBase[source.NameTerms.length];
            for (int i = 0; i < source.NameTerms.length; i++) {
                this.NameTerms[i] = new TermBase(source.NameTerms[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SpeakerId", this.SpeakerId);
        this.setParamSimple(map, prefix + "VoiceId", this.VoiceId);
        this.setParamSimple(map, prefix + "Gender", this.Gender);
        this.setParamSimple(map, prefix + "AgeGroup", this.AgeGroup);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "NameTerms.", this.NameTerms);

    }
}

