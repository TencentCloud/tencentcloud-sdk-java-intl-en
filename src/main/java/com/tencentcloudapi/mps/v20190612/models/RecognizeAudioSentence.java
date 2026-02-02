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

public class RecognizeAudioSentence extends AbstractModel {

    /**
    * Start time in the audio, in seconds.
    */
    @SerializedName("Start")
    @Expose
    private Float Start;

    /**
    * End time in the audio, in seconds.
    */
    @SerializedName("End")
    @Expose
    private Float End;

    /**
    * Audio recognition result.
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * Word timestamp result.
    */
    @SerializedName("WordsInfo")
    @Expose
    private WordResult [] WordsInfo;

    /**
     * Get Start time in the audio, in seconds. 
     * @return Start Start time in the audio, in seconds.
     */
    public Float getStart() {
        return this.Start;
    }

    /**
     * Set Start time in the audio, in seconds.
     * @param Start Start time in the audio, in seconds.
     */
    public void setStart(Float Start) {
        this.Start = Start;
    }

    /**
     * Get End time in the audio, in seconds. 
     * @return End End time in the audio, in seconds.
     */
    public Float getEnd() {
        return this.End;
    }

    /**
     * Set End time in the audio, in seconds.
     * @param End End time in the audio, in seconds.
     */
    public void setEnd(Float End) {
        this.End = End;
    }

    /**
     * Get Audio recognition result. 
     * @return Text Audio recognition result.
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set Audio recognition result.
     * @param Text Audio recognition result.
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get Word timestamp result. 
     * @return WordsInfo Word timestamp result.
     */
    public WordResult [] getWordsInfo() {
        return this.WordsInfo;
    }

    /**
     * Set Word timestamp result.
     * @param WordsInfo Word timestamp result.
     */
    public void setWordsInfo(WordResult [] WordsInfo) {
        this.WordsInfo = WordsInfo;
    }

    public RecognizeAudioSentence() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecognizeAudioSentence(RecognizeAudioSentence source) {
        if (source.Start != null) {
            this.Start = new Float(source.Start);
        }
        if (source.End != null) {
            this.End = new Float(source.End);
        }
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.WordsInfo != null) {
            this.WordsInfo = new WordResult[source.WordsInfo.length];
            for (int i = 0; i < source.WordsInfo.length; i++) {
                this.WordsInfo[i] = new WordResult(source.WordsInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Start", this.Start);
        this.setParamSimple(map, prefix + "End", this.End);
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamArrayObj(map, prefix + "WordsInfo.", this.WordsInfo);

    }
}

