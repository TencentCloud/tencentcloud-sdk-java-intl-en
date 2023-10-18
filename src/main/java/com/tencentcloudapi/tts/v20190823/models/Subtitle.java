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
package com.tencentcloudapi.tts.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Subtitle extends AbstractModel {

    /**
    * The word in the text that is sent.
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * The start timestamp of the word in the synthesized audio data, in milliseconds.
    */
    @SerializedName("BeginTime")
    @Expose
    private Long BeginTime;

    /**
    * The end timestamp of the word in the synthesized audio data, in milliseconds.
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * The start index of the character in the whole sentence, starting from 0.
    */
    @SerializedName("BeginIndex")
    @Expose
    private Long BeginIndex;

    /**
    * The end index of the character in the whole sentence, starting from 0.
    */
    @SerializedName("EndIndex")
    @Expose
    private Long EndIndex;

    /**
    * The phonemes of the word.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Phoneme")
    @Expose
    private String Phoneme;

    /**
     * Get The word in the text that is sent. 
     * @return Text The word in the text that is sent.
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set The word in the text that is sent.
     * @param Text The word in the text that is sent.
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get The start timestamp of the word in the synthesized audio data, in milliseconds. 
     * @return BeginTime The start timestamp of the word in the synthesized audio data, in milliseconds.
     */
    public Long getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set The start timestamp of the word in the synthesized audio data, in milliseconds.
     * @param BeginTime The start timestamp of the word in the synthesized audio data, in milliseconds.
     */
    public void setBeginTime(Long BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get The end timestamp of the word in the synthesized audio data, in milliseconds. 
     * @return EndTime The end timestamp of the word in the synthesized audio data, in milliseconds.
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set The end timestamp of the word in the synthesized audio data, in milliseconds.
     * @param EndTime The end timestamp of the word in the synthesized audio data, in milliseconds.
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get The start index of the character in the whole sentence, starting from 0. 
     * @return BeginIndex The start index of the character in the whole sentence, starting from 0.
     */
    public Long getBeginIndex() {
        return this.BeginIndex;
    }

    /**
     * Set The start index of the character in the whole sentence, starting from 0.
     * @param BeginIndex The start index of the character in the whole sentence, starting from 0.
     */
    public void setBeginIndex(Long BeginIndex) {
        this.BeginIndex = BeginIndex;
    }

    /**
     * Get The end index of the character in the whole sentence, starting from 0. 
     * @return EndIndex The end index of the character in the whole sentence, starting from 0.
     */
    public Long getEndIndex() {
        return this.EndIndex;
    }

    /**
     * Set The end index of the character in the whole sentence, starting from 0.
     * @param EndIndex The end index of the character in the whole sentence, starting from 0.
     */
    public void setEndIndex(Long EndIndex) {
        this.EndIndex = EndIndex;
    }

    /**
     * Get The phonemes of the word.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Phoneme The phonemes of the word.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPhoneme() {
        return this.Phoneme;
    }

    /**
     * Set The phonemes of the word.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Phoneme The phonemes of the word.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPhoneme(String Phoneme) {
        this.Phoneme = Phoneme;
    }

    public Subtitle() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Subtitle(Subtitle source) {
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.BeginTime != null) {
            this.BeginTime = new Long(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.BeginIndex != null) {
            this.BeginIndex = new Long(source.BeginIndex);
        }
        if (source.EndIndex != null) {
            this.EndIndex = new Long(source.EndIndex);
        }
        if (source.Phoneme != null) {
            this.Phoneme = new String(source.Phoneme);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "BeginIndex", this.BeginIndex);
        this.setParamSimple(map, prefix + "EndIndex", this.EndIndex);
        this.setParamSimple(map, prefix + "Phoneme", this.Phoneme);

    }
}

