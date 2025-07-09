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

public class PornImageResult extends AbstractModel {

    /**
    * The confidence score for the moderation result. Value range: 0-100.
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * The suggestion for handling the detected pornographic content. Valid values:
<li>pass/li>
<li>review</li>
<li>block</li>
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * The label for the detected pornographic content. Valid values:
<li>porn</li>
<li>sexy</li>
<li>vulgar</li>
<li>intimacy</li>
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
     * Get The confidence score for the moderation result. Value range: 0-100. 
     * @return Confidence The confidence score for the moderation result. Value range: 0-100.
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set The confidence score for the moderation result. Value range: 0-100.
     * @param Confidence The confidence score for the moderation result. Value range: 0-100.
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get The suggestion for handling the detected pornographic content. Valid values:
<li>pass/li>
<li>review</li>
<li>block</li> 
     * @return Suggestion The suggestion for handling the detected pornographic content. Valid values:
<li>pass/li>
<li>review</li>
<li>block</li>
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set The suggestion for handling the detected pornographic content. Valid values:
<li>pass/li>
<li>review</li>
<li>block</li>
     * @param Suggestion The suggestion for handling the detected pornographic content. Valid values:
<li>pass/li>
<li>review</li>
<li>block</li>
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get The label for the detected pornographic content. Valid values:
<li>porn</li>
<li>sexy</li>
<li>vulgar</li>
<li>intimacy</li> 
     * @return Label The label for the detected pornographic content. Valid values:
<li>porn</li>
<li>sexy</li>
<li>vulgar</li>
<li>intimacy</li>
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set The label for the detected pornographic content. Valid values:
<li>porn</li>
<li>sexy</li>
<li>vulgar</li>
<li>intimacy</li>
     * @param Label The label for the detected pornographic content. Valid values:
<li>porn</li>
<li>sexy</li>
<li>vulgar</li>
<li>intimacy</li>
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    public PornImageResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PornImageResult(PornImageResult source) {
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

