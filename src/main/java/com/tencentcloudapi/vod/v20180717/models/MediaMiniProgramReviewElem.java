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

public class MediaMiniProgramReviewElem extends AbstractModel {

    /**
    * Audio and video moderation type. 
<li>Porn: The visual involves offensive content,</li>
<li>Porn.Ocr: text involves offensive content,</li>
<li>Porn.Asr: The sound involves offensive content,</li>
<li>Terrorism: The visual involves unsafe information,</li>
<li>Political: The visual involves inappropriate information,</li>
<li>Political.Ocr: The text involves inappropriate information,</li>
<li>Political.Asr: The sound involves inappropriate information.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Audio and video review comments.
<li>pass: confirm normal,</li>
<li>block: confirmed violation,</li>
<li>review: suspected violation.</li>
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * Confidence of the audio/video moderation result. Value range: 0-100.
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
     * Get Audio and video moderation type. 
<li>Porn: The visual involves offensive content,</li>
<li>Porn.Ocr: text involves offensive content,</li>
<li>Porn.Asr: The sound involves offensive content,</li>
<li>Terrorism: The visual involves unsafe information,</li>
<li>Political: The visual involves inappropriate information,</li>
<li>Political.Ocr: The text involves inappropriate information,</li>
<li>Political.Asr: The sound involves inappropriate information.</li> 
     * @return Type Audio and video moderation type. 
<li>Porn: The visual involves offensive content,</li>
<li>Porn.Ocr: text involves offensive content,</li>
<li>Porn.Asr: The sound involves offensive content,</li>
<li>Terrorism: The visual involves unsafe information,</li>
<li>Political: The visual involves inappropriate information,</li>
<li>Political.Ocr: The text involves inappropriate information,</li>
<li>Political.Asr: The sound involves inappropriate information.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Audio and video moderation type. 
<li>Porn: The visual involves offensive content,</li>
<li>Porn.Ocr: text involves offensive content,</li>
<li>Porn.Asr: The sound involves offensive content,</li>
<li>Terrorism: The visual involves unsafe information,</li>
<li>Political: The visual involves inappropriate information,</li>
<li>Political.Ocr: The text involves inappropriate information,</li>
<li>Political.Asr: The sound involves inappropriate information.</li>
     * @param Type Audio and video moderation type. 
<li>Porn: The visual involves offensive content,</li>
<li>Porn.Ocr: text involves offensive content,</li>
<li>Porn.Asr: The sound involves offensive content,</li>
<li>Terrorism: The visual involves unsafe information,</li>
<li>Political: The visual involves inappropriate information,</li>
<li>Political.Ocr: The text involves inappropriate information,</li>
<li>Political.Asr: The sound involves inappropriate information.</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Audio and video review comments.
<li>pass: confirm normal,</li>
<li>block: confirmed violation,</li>
<li>review: suspected violation.</li> 
     * @return Suggestion Audio and video review comments.
<li>pass: confirm normal,</li>
<li>block: confirmed violation,</li>
<li>review: suspected violation.</li>
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set Audio and video review comments.
<li>pass: confirm normal,</li>
<li>block: confirmed violation,</li>
<li>review: suspected violation.</li>
     * @param Suggestion Audio and video review comments.
<li>pass: confirm normal,</li>
<li>block: confirmed violation,</li>
<li>review: suspected violation.</li>
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get Confidence of the audio/video moderation result. Value range: 0-100. 
     * @return Confidence Confidence of the audio/video moderation result. Value range: 0-100.
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set Confidence of the audio/video moderation result. Value range: 0-100.
     * @param Confidence Confidence of the audio/video moderation result. Value range: 0-100.
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    public MediaMiniProgramReviewElem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaMiniProgramReviewElem(MediaMiniProgramReviewElem source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Suggestion != null) {
            this.Suggestion = new String(source.Suggestion);
        }
        if (source.Confidence != null) {
            this.Confidence = new Float(source.Confidence);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);

    }
}

