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

public class TerrorismImageResult extends AbstractModel {

    /**
    * Authentication involves scoring unsafe information, with a score from 0 to 100.
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * Authentication result suggestions involving unsafe information. Value range:
<li>pass;</li>
<li>review;</li>
<li>block.</li>
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * Tag of the authentication result involving unsafe information. Value range:
<li>guns: weapons and firearms;</li>
<li>crowd: crowd gathering;</li>
<li>police: police force;</li>
<li>bloody: graphic violence;</li>
<li>banners: violent and terrorist flags;</li>
<li>explosion: explosions and fires;</li>
<li>scenario: Violent and terrorist visuals.</li>
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
     * Get Authentication involves scoring unsafe information, with a score from 0 to 100. 
     * @return Confidence Authentication involves scoring unsafe information, with a score from 0 to 100.
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set Authentication involves scoring unsafe information, with a score from 0 to 100.
     * @param Confidence Authentication involves scoring unsafe information, with a score from 0 to 100.
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get Authentication result suggestions involving unsafe information. Value range:
<li>pass;</li>
<li>review;</li>
<li>block.</li> 
     * @return Suggestion Authentication result suggestions involving unsafe information. Value range:
<li>pass;</li>
<li>review;</li>
<li>block.</li>
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set Authentication result suggestions involving unsafe information. Value range:
<li>pass;</li>
<li>review;</li>
<li>block.</li>
     * @param Suggestion Authentication result suggestions involving unsafe information. Value range:
<li>pass;</li>
<li>review;</li>
<li>block.</li>
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get Tag of the authentication result involving unsafe information. Value range:
<li>guns: weapons and firearms;</li>
<li>crowd: crowd gathering;</li>
<li>police: police force;</li>
<li>bloody: graphic violence;</li>
<li>banners: violent and terrorist flags;</li>
<li>explosion: explosions and fires;</li>
<li>scenario: Violent and terrorist visuals.</li> 
     * @return Label Tag of the authentication result involving unsafe information. Value range:
<li>guns: weapons and firearms;</li>
<li>crowd: crowd gathering;</li>
<li>police: police force;</li>
<li>bloody: graphic violence;</li>
<li>banners: violent and terrorist flags;</li>
<li>explosion: explosions and fires;</li>
<li>scenario: Violent and terrorist visuals.</li>
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set Tag of the authentication result involving unsafe information. Value range:
<li>guns: weapons and firearms;</li>
<li>crowd: crowd gathering;</li>
<li>police: police force;</li>
<li>bloody: graphic violence;</li>
<li>banners: violent and terrorist flags;</li>
<li>explosion: explosions and fires;</li>
<li>scenario: Violent and terrorist visuals.</li>
     * @param Label Tag of the authentication result involving unsafe information. Value range:
<li>guns: weapons and firearms;</li>
<li>crowd: crowd gathering;</li>
<li>police: police force;</li>
<li>bloody: graphic violence;</li>
<li>banners: violent and terrorist flags;</li>
<li>explosion: explosions and fires;</li>
<li>scenario: Violent and terrorist visuals.</li>
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    public TerrorismImageResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TerrorismImageResult(TerrorismImageResult source) {
        if (source.Confidence != null) {
            this.Confidence = new Float(source.Confidence);
        }
        if (source.Suggestion != null) {
            this.Suggestion = new String(source.Suggestion);
        }
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamSimple(map, prefix + "Label", this.Label);

    }
}

