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

public class SmartSubtitleTaskTransTextSegmentItem extends AbstractModel {

    /**
    * <p>Confidence of a recognized segment. Value range: 0-100.</p>
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * <p>Start time offset of a recognized segment, in seconds.</p>
    */
    @SerializedName("StartTimeOffset")
    @Expose
    private Float StartTimeOffset;

    /**
    * <p>End time offset of a recognized segment, in seconds.</p>
    */
    @SerializedName("EndTimeOffset")
    @Expose
    private Float EndTimeOffset;

    /**
    * <p>Recognized text.</p>
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * <p>Translated text.</p>
    */
    @SerializedName("Trans")
    @Expose
    private String Trans;

    /**
    * <p>Word timestamp information.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Wordlist")
    @Expose
    private WordResult [] Wordlist;

    /**
    * <p>Speaker ID (if speaker recognition is enabled)</p>
    */
    @SerializedName("SpeakerId")
    @Expose
    private String SpeakerId;

    /**
     * Get <p>Confidence of a recognized segment. Value range: 0-100.</p> 
     * @return Confidence <p>Confidence of a recognized segment. Value range: 0-100.</p>
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set <p>Confidence of a recognized segment. Value range: 0-100.</p>
     * @param Confidence <p>Confidence of a recognized segment. Value range: 0-100.</p>
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get <p>Start time offset of a recognized segment, in seconds.</p> 
     * @return StartTimeOffset <p>Start time offset of a recognized segment, in seconds.</p>
     */
    public Float getStartTimeOffset() {
        return this.StartTimeOffset;
    }

    /**
     * Set <p>Start time offset of a recognized segment, in seconds.</p>
     * @param StartTimeOffset <p>Start time offset of a recognized segment, in seconds.</p>
     */
    public void setStartTimeOffset(Float StartTimeOffset) {
        this.StartTimeOffset = StartTimeOffset;
    }

    /**
     * Get <p>End time offset of a recognized segment, in seconds.</p> 
     * @return EndTimeOffset <p>End time offset of a recognized segment, in seconds.</p>
     */
    public Float getEndTimeOffset() {
        return this.EndTimeOffset;
    }

    /**
     * Set <p>End time offset of a recognized segment, in seconds.</p>
     * @param EndTimeOffset <p>End time offset of a recognized segment, in seconds.</p>
     */
    public void setEndTimeOffset(Float EndTimeOffset) {
        this.EndTimeOffset = EndTimeOffset;
    }

    /**
     * Get <p>Recognized text.</p> 
     * @return Text <p>Recognized text.</p>
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set <p>Recognized text.</p>
     * @param Text <p>Recognized text.</p>
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get <p>Translated text.</p> 
     * @return Trans <p>Translated text.</p>
     */
    public String getTrans() {
        return this.Trans;
    }

    /**
     * Set <p>Translated text.</p>
     * @param Trans <p>Translated text.</p>
     */
    public void setTrans(String Trans) {
        this.Trans = Trans;
    }

    /**
     * Get <p>Word timestamp information.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Wordlist <p>Word timestamp information.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public WordResult [] getWordlist() {
        return this.Wordlist;
    }

    /**
     * Set <p>Word timestamp information.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Wordlist <p>Word timestamp information.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWordlist(WordResult [] Wordlist) {
        this.Wordlist = Wordlist;
    }

    /**
     * Get <p>Speaker ID (if speaker recognition is enabled)</p> 
     * @return SpeakerId <p>Speaker ID (if speaker recognition is enabled)</p>
     */
    public String getSpeakerId() {
        return this.SpeakerId;
    }

    /**
     * Set <p>Speaker ID (if speaker recognition is enabled)</p>
     * @param SpeakerId <p>Speaker ID (if speaker recognition is enabled)</p>
     */
    public void setSpeakerId(String SpeakerId) {
        this.SpeakerId = SpeakerId;
    }

    public SmartSubtitleTaskTransTextSegmentItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SmartSubtitleTaskTransTextSegmentItem(SmartSubtitleTaskTransTextSegmentItem source) {
        if (source.Confidence != null) {
            this.Confidence = new Float(source.Confidence);
        }
        if (source.StartTimeOffset != null) {
            this.StartTimeOffset = new Float(source.StartTimeOffset);
        }
        if (source.EndTimeOffset != null) {
            this.EndTimeOffset = new Float(source.EndTimeOffset);
        }
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.Trans != null) {
            this.Trans = new String(source.Trans);
        }
        if (source.Wordlist != null) {
            this.Wordlist = new WordResult[source.Wordlist.length];
            for (int i = 0; i < source.Wordlist.length; i++) {
                this.Wordlist[i] = new WordResult(source.Wordlist[i]);
            }
        }
        if (source.SpeakerId != null) {
            this.SpeakerId = new String(source.SpeakerId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamSimple(map, prefix + "StartTimeOffset", this.StartTimeOffset);
        this.setParamSimple(map, prefix + "EndTimeOffset", this.EndTimeOffset);
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "Trans", this.Trans);
        this.setParamArrayObj(map, prefix + "Wordlist.", this.Wordlist);
        this.setParamSimple(map, prefix + "SpeakerId", this.SpeakerId);

    }
}

