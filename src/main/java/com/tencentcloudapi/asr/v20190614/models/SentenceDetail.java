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
package com.tencentcloudapi.asr.v20190614.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SentenceDetail extends AbstractModel {

    /**
    * Final recognition result of a sentence.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FinalSentence")
    @Expose
    private String FinalSentence;

    /**
    * Intermediate recognition result of a sentence. The sentence is split into multiple phrases by spaces.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SliceSentence")
    @Expose
    private String SliceSentence;

    /**
    * Oral-to-written transcription result. This parameter has a value only if the corresponding feature is enabled.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WrittenText")
    @Expose
    private String WrittenText;

    /**
    * Start time of a sentence (ms).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StartMs")
    @Expose
    private Long StartMs;

    /**
    * End time of a sentence (ms).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EndMs")
    @Expose
    private Long EndMs;

    /**
    * Number of words in a sentence.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WordsNum")
    @Expose
    private Long WordsNum;

    /**
    * Word details of a sentence.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Words")
    @Expose
    private SentenceWords [] Words;

    /**
    * Speech speed of a sentence. Unit: Number of words per second.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SpeechSpeed")
    @Expose
    private Float SpeechSpeed;

    /**
    * Channel or speaker ID. (If speaker_diarization is specified or ChannelNum is set to 2 (stereo) in the request, speakers or channels can be distinguished.)
Different values represent different speakers in mono mode. For the speakerId values, 0 represents the left channel, and 1 represents the right channel in stereo mode if an 8k engine is used.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SpeakerId")
    @Expose
    private Long SpeakerId;

    /**
    * Emotional energy value. This value is the result of dividing the sound volume in dB by 10. Value range: [1,10]. The higher the value, the stronger the emotion.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EmotionalEnergy")
    @Expose
    private Float EmotionalEnergy;

    /**
    * Silent duration between the current sentence and the last sentence.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SilenceTime")
    @Expose
    private Long SilenceTime;

    /**
    * Emotion type. (This parameter may be left blank in two scenarios: 1. No corresponding resource package exists; 2. The emotion is not recognized because it is not strong enough, which is related to the emotional energy.)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EmotionType")
    @Expose
    private String [] EmotionType;

    /**
    * List of recognized keywords.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("KeyWordResults")
    @Expose
    private KeyWordResult [] KeyWordResults;

    /**
     * Get Final recognition result of a sentence.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FinalSentence Final recognition result of a sentence.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFinalSentence() {
        return this.FinalSentence;
    }

    /**
     * Set Final recognition result of a sentence.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FinalSentence Final recognition result of a sentence.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFinalSentence(String FinalSentence) {
        this.FinalSentence = FinalSentence;
    }

    /**
     * Get Intermediate recognition result of a sentence. The sentence is split into multiple phrases by spaces.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SliceSentence Intermediate recognition result of a sentence. The sentence is split into multiple phrases by spaces.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSliceSentence() {
        return this.SliceSentence;
    }

    /**
     * Set Intermediate recognition result of a sentence. The sentence is split into multiple phrases by spaces.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SliceSentence Intermediate recognition result of a sentence. The sentence is split into multiple phrases by spaces.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSliceSentence(String SliceSentence) {
        this.SliceSentence = SliceSentence;
    }

    /**
     * Get Oral-to-written transcription result. This parameter has a value only if the corresponding feature is enabled.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WrittenText Oral-to-written transcription result. This parameter has a value only if the corresponding feature is enabled.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getWrittenText() {
        return this.WrittenText;
    }

    /**
     * Set Oral-to-written transcription result. This parameter has a value only if the corresponding feature is enabled.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WrittenText Oral-to-written transcription result. This parameter has a value only if the corresponding feature is enabled.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWrittenText(String WrittenText) {
        this.WrittenText = WrittenText;
    }

    /**
     * Get Start time of a sentence (ms).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StartMs Start time of a sentence (ms).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStartMs() {
        return this.StartMs;
    }

    /**
     * Set Start time of a sentence (ms).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StartMs Start time of a sentence (ms).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStartMs(Long StartMs) {
        this.StartMs = StartMs;
    }

    /**
     * Get End time of a sentence (ms).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EndMs End time of a sentence (ms).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getEndMs() {
        return this.EndMs;
    }

    /**
     * Set End time of a sentence (ms).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EndMs End time of a sentence (ms).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEndMs(Long EndMs) {
        this.EndMs = EndMs;
    }

    /**
     * Get Number of words in a sentence.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WordsNum Number of words in a sentence.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getWordsNum() {
        return this.WordsNum;
    }

    /**
     * Set Number of words in a sentence.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WordsNum Number of words in a sentence.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWordsNum(Long WordsNum) {
        this.WordsNum = WordsNum;
    }

    /**
     * Get Word details of a sentence.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Words Word details of a sentence.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public SentenceWords [] getWords() {
        return this.Words;
    }

    /**
     * Set Word details of a sentence.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Words Word details of a sentence.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWords(SentenceWords [] Words) {
        this.Words = Words;
    }

    /**
     * Get Speech speed of a sentence. Unit: Number of words per second.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SpeechSpeed Speech speed of a sentence. Unit: Number of words per second.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getSpeechSpeed() {
        return this.SpeechSpeed;
    }

    /**
     * Set Speech speed of a sentence. Unit: Number of words per second.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SpeechSpeed Speech speed of a sentence. Unit: Number of words per second.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSpeechSpeed(Float SpeechSpeed) {
        this.SpeechSpeed = SpeechSpeed;
    }

    /**
     * Get Channel or speaker ID. (If speaker_diarization is specified or ChannelNum is set to 2 (stereo) in the request, speakers or channels can be distinguished.)
Different values represent different speakers in mono mode. For the speakerId values, 0 represents the left channel, and 1 represents the right channel in stereo mode if an 8k engine is used.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SpeakerId Channel or speaker ID. (If speaker_diarization is specified or ChannelNum is set to 2 (stereo) in the request, speakers or channels can be distinguished.)
Different values represent different speakers in mono mode. For the speakerId values, 0 represents the left channel, and 1 represents the right channel in stereo mode if an 8k engine is used.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getSpeakerId() {
        return this.SpeakerId;
    }

    /**
     * Set Channel or speaker ID. (If speaker_diarization is specified or ChannelNum is set to 2 (stereo) in the request, speakers or channels can be distinguished.)
Different values represent different speakers in mono mode. For the speakerId values, 0 represents the left channel, and 1 represents the right channel in stereo mode if an 8k engine is used.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SpeakerId Channel or speaker ID. (If speaker_diarization is specified or ChannelNum is set to 2 (stereo) in the request, speakers or channels can be distinguished.)
Different values represent different speakers in mono mode. For the speakerId values, 0 represents the left channel, and 1 represents the right channel in stereo mode if an 8k engine is used.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSpeakerId(Long SpeakerId) {
        this.SpeakerId = SpeakerId;
    }

    /**
     * Get Emotional energy value. This value is the result of dividing the sound volume in dB by 10. Value range: [1,10]. The higher the value, the stronger the emotion.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EmotionalEnergy Emotional energy value. This value is the result of dividing the sound volume in dB by 10. Value range: [1,10]. The higher the value, the stronger the emotion.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getEmotionalEnergy() {
        return this.EmotionalEnergy;
    }

    /**
     * Set Emotional energy value. This value is the result of dividing the sound volume in dB by 10. Value range: [1,10]. The higher the value, the stronger the emotion.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EmotionalEnergy Emotional energy value. This value is the result of dividing the sound volume in dB by 10. Value range: [1,10]. The higher the value, the stronger the emotion.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEmotionalEnergy(Float EmotionalEnergy) {
        this.EmotionalEnergy = EmotionalEnergy;
    }

    /**
     * Get Silent duration between the current sentence and the last sentence.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SilenceTime Silent duration between the current sentence and the last sentence.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getSilenceTime() {
        return this.SilenceTime;
    }

    /**
     * Set Silent duration between the current sentence and the last sentence.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SilenceTime Silent duration between the current sentence and the last sentence.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSilenceTime(Long SilenceTime) {
        this.SilenceTime = SilenceTime;
    }

    /**
     * Get Emotion type. (This parameter may be left blank in two scenarios: 1. No corresponding resource package exists; 2. The emotion is not recognized because it is not strong enough, which is related to the emotional energy.)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EmotionType Emotion type. (This parameter may be left blank in two scenarios: 1. No corresponding resource package exists; 2. The emotion is not recognized because it is not strong enough, which is related to the emotional energy.)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getEmotionType() {
        return this.EmotionType;
    }

    /**
     * Set Emotion type. (This parameter may be left blank in two scenarios: 1. No corresponding resource package exists; 2. The emotion is not recognized because it is not strong enough, which is related to the emotional energy.)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EmotionType Emotion type. (This parameter may be left blank in two scenarios: 1. No corresponding resource package exists; 2. The emotion is not recognized because it is not strong enough, which is related to the emotional energy.)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEmotionType(String [] EmotionType) {
        this.EmotionType = EmotionType;
    }

    /**
     * Get List of recognized keywords.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return KeyWordResults List of recognized keywords.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public KeyWordResult [] getKeyWordResults() {
        return this.KeyWordResults;
    }

    /**
     * Set List of recognized keywords.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param KeyWordResults List of recognized keywords.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setKeyWordResults(KeyWordResult [] KeyWordResults) {
        this.KeyWordResults = KeyWordResults;
    }

    public SentenceDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SentenceDetail(SentenceDetail source) {
        if (source.FinalSentence != null) {
            this.FinalSentence = new String(source.FinalSentence);
        }
        if (source.SliceSentence != null) {
            this.SliceSentence = new String(source.SliceSentence);
        }
        if (source.WrittenText != null) {
            this.WrittenText = new String(source.WrittenText);
        }
        if (source.StartMs != null) {
            this.StartMs = new Long(source.StartMs);
        }
        if (source.EndMs != null) {
            this.EndMs = new Long(source.EndMs);
        }
        if (source.WordsNum != null) {
            this.WordsNum = new Long(source.WordsNum);
        }
        if (source.Words != null) {
            this.Words = new SentenceWords[source.Words.length];
            for (int i = 0; i < source.Words.length; i++) {
                this.Words[i] = new SentenceWords(source.Words[i]);
            }
        }
        if (source.SpeechSpeed != null) {
            this.SpeechSpeed = new Float(source.SpeechSpeed);
        }
        if (source.SpeakerId != null) {
            this.SpeakerId = new Long(source.SpeakerId);
        }
        if (source.EmotionalEnergy != null) {
            this.EmotionalEnergy = new Float(source.EmotionalEnergy);
        }
        if (source.SilenceTime != null) {
            this.SilenceTime = new Long(source.SilenceTime);
        }
        if (source.EmotionType != null) {
            this.EmotionType = new String[source.EmotionType.length];
            for (int i = 0; i < source.EmotionType.length; i++) {
                this.EmotionType[i] = new String(source.EmotionType[i]);
            }
        }
        if (source.KeyWordResults != null) {
            this.KeyWordResults = new KeyWordResult[source.KeyWordResults.length];
            for (int i = 0; i < source.KeyWordResults.length; i++) {
                this.KeyWordResults[i] = new KeyWordResult(source.KeyWordResults[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FinalSentence", this.FinalSentence);
        this.setParamSimple(map, prefix + "SliceSentence", this.SliceSentence);
        this.setParamSimple(map, prefix + "WrittenText", this.WrittenText);
        this.setParamSimple(map, prefix + "StartMs", this.StartMs);
        this.setParamSimple(map, prefix + "EndMs", this.EndMs);
        this.setParamSimple(map, prefix + "WordsNum", this.WordsNum);
        this.setParamArrayObj(map, prefix + "Words.", this.Words);
        this.setParamSimple(map, prefix + "SpeechSpeed", this.SpeechSpeed);
        this.setParamSimple(map, prefix + "SpeakerId", this.SpeakerId);
        this.setParamSimple(map, prefix + "EmotionalEnergy", this.EmotionalEnergy);
        this.setParamSimple(map, prefix + "SilenceTime", this.SilenceTime);
        this.setParamArraySimple(map, prefix + "EmotionType.", this.EmotionType);
        this.setParamArrayObj(map, prefix + "KeyWordResults.", this.KeyWordResults);

    }
}

