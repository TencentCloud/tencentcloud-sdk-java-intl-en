/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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

public class AiRecognitionTaskTransTextSegmentItem extends AbstractModel {

    /**
    * The confidence score for a segment. Value range: 0-100.
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * The start time offset (seconds) of a segment.
    */
    @SerializedName("StartTimeOffset")
    @Expose
    private Float StartTimeOffset;

    /**
    * The end time offset (seconds) of a segment.
    */
    @SerializedName("EndTimeOffset")
    @Expose
    private Float EndTimeOffset;

    /**
    * The text transcript.
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * The translation.
    */
    @SerializedName("Trans")
    @Expose
    private String Trans;

    /**
    * Word timestamp information.
    */
    @SerializedName("Wordlist")
    @Expose
    private WordResult [] Wordlist;

    /**
     * Get The confidence score for a segment. Value range: 0-100. 
     * @return Confidence The confidence score for a segment. Value range: 0-100.
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set The confidence score for a segment. Value range: 0-100.
     * @param Confidence The confidence score for a segment. Value range: 0-100.
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get The start time offset (seconds) of a segment. 
     * @return StartTimeOffset The start time offset (seconds) of a segment.
     */
    public Float getStartTimeOffset() {
        return this.StartTimeOffset;
    }

    /**
     * Set The start time offset (seconds) of a segment.
     * @param StartTimeOffset The start time offset (seconds) of a segment.
     */
    public void setStartTimeOffset(Float StartTimeOffset) {
        this.StartTimeOffset = StartTimeOffset;
    }

    /**
     * Get The end time offset (seconds) of a segment. 
     * @return EndTimeOffset The end time offset (seconds) of a segment.
     */
    public Float getEndTimeOffset() {
        return this.EndTimeOffset;
    }

    /**
     * Set The end time offset (seconds) of a segment.
     * @param EndTimeOffset The end time offset (seconds) of a segment.
     */
    public void setEndTimeOffset(Float EndTimeOffset) {
        this.EndTimeOffset = EndTimeOffset;
    }

    /**
     * Get The text transcript. 
     * @return Text The text transcript.
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set The text transcript.
     * @param Text The text transcript.
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get The translation. 
     * @return Trans The translation.
     */
    public String getTrans() {
        return this.Trans;
    }

    /**
     * Set The translation.
     * @param Trans The translation.
     */
    public void setTrans(String Trans) {
        this.Trans = Trans;
    }

    /**
     * Get Word timestamp information. 
     * @return Wordlist Word timestamp information.
     */
    public WordResult [] getWordlist() {
        return this.Wordlist;
    }

    /**
     * Set Word timestamp information.
     * @param Wordlist Word timestamp information.
     */
    public void setWordlist(WordResult [] Wordlist) {
        this.Wordlist = Wordlist;
    }

    public AiRecognitionTaskTransTextSegmentItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiRecognitionTaskTransTextSegmentItem(AiRecognitionTaskTransTextSegmentItem source) {
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

    }
}

