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

public class SmartSubtitleTaskAsrFullTextSegmentItem extends AbstractModel {

    /**
    * Confidence of a recognized segment. Value range: 0-100.
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * Start time offset of a recognized segment, in seconds.
    */
    @SerializedName("StartTimeOffset")
    @Expose
    private Float StartTimeOffset;

    /**
    * End time offset of a recognized segment, in seconds.
    */
    @SerializedName("EndTimeOffset")
    @Expose
    private Float EndTimeOffset;

    /**
    * Recognized text.
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * Word timestamp information.

Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Wordlist")
    @Expose
    private WordResult [] Wordlist;

    /**
    * Speaker ID (if speaker recognition is enabled).
    */
    @SerializedName("SpeakerId")
    @Expose
    private String SpeakerId;

    /**
     * Get Confidence of a recognized segment. Value range: 0-100. 
     * @return Confidence Confidence of a recognized segment. Value range: 0-100.
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set Confidence of a recognized segment. Value range: 0-100.
     * @param Confidence Confidence of a recognized segment. Value range: 0-100.
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get Start time offset of a recognized segment, in seconds. 
     * @return StartTimeOffset Start time offset of a recognized segment, in seconds.
     */
    public Float getStartTimeOffset() {
        return this.StartTimeOffset;
    }

    /**
     * Set Start time offset of a recognized segment, in seconds.
     * @param StartTimeOffset Start time offset of a recognized segment, in seconds.
     */
    public void setStartTimeOffset(Float StartTimeOffset) {
        this.StartTimeOffset = StartTimeOffset;
    }

    /**
     * Get End time offset of a recognized segment, in seconds. 
     * @return EndTimeOffset End time offset of a recognized segment, in seconds.
     */
    public Float getEndTimeOffset() {
        return this.EndTimeOffset;
    }

    /**
     * Set End time offset of a recognized segment, in seconds.
     * @param EndTimeOffset End time offset of a recognized segment, in seconds.
     */
    public void setEndTimeOffset(Float EndTimeOffset) {
        this.EndTimeOffset = EndTimeOffset;
    }

    /**
     * Get Recognized text. 
     * @return Text Recognized text.
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set Recognized text.
     * @param Text Recognized text.
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get Word timestamp information.

Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Wordlist Word timestamp information.

Note: This field may return null, indicating that no valid value can be obtained.
     */
    public WordResult [] getWordlist() {
        return this.Wordlist;
    }

    /**
     * Set Word timestamp information.

Note: This field may return null, indicating that no valid value can be obtained.
     * @param Wordlist Word timestamp information.

Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setWordlist(WordResult [] Wordlist) {
        this.Wordlist = Wordlist;
    }

    /**
     * Get Speaker ID (if speaker recognition is enabled). 
     * @return SpeakerId Speaker ID (if speaker recognition is enabled).
     */
    public String getSpeakerId() {
        return this.SpeakerId;
    }

    /**
     * Set Speaker ID (if speaker recognition is enabled).
     * @param SpeakerId Speaker ID (if speaker recognition is enabled).
     */
    public void setSpeakerId(String SpeakerId) {
        this.SpeakerId = SpeakerId;
    }

    public SmartSubtitleTaskAsrFullTextSegmentItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SmartSubtitleTaskAsrFullTextSegmentItem(SmartSubtitleTaskAsrFullTextSegmentItem source) {
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
        this.setParamArrayObj(map, prefix + "Wordlist.", this.Wordlist);
        this.setParamSimple(map, prefix + "SpeakerId", this.SpeakerId);

    }
}

