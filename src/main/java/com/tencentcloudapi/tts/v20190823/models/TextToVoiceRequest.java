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
package com.tencentcloudapi.tts.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TextToVoiceRequest extends AbstractModel {

    /**
    * The source text for synthesizing speech, which is encoded in UTF-8.
It can contain up to 150 Chinese characters (a full-width punctuation as a Chinese character) or 500 letters ( a half-width punctuation as a letter).
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * The `SessionId` of a request, which will be returned as-is. We recommend that you pass characters like uuid to prevent repetition.
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * Volume range: [0, 10], corresponding to 11 volume levels. 0 is the default value, indicating the normal volume. There is no mute option.
    */
    @SerializedName("Volume")
    @Expose
    private Float Volume;

    /**
    * Speed range: [-2, 6], corresponding to different speeds<li>-2 for 0.6 times</li><li>-1 for 0.8 times</li><li>0 for 1.0 time (default)</li><li>1 for 1.2 times</li><li>2 for 1.5 times</li><li>6 for 2.5 times</li>To set finer-grained speed levels, keep one decimal place, such as 0.5, 1.1, and 1.8.<br>
    */
    @SerializedName("Speed")
    @Expose
    private Float Speed;

    /**
    * Project ID, which defaults to 0 and can be customized.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Model type, with `1` for the default model.
    */
    @SerializedName("ModelType")
    @Expose
    private Long ModelType;

    /**
    * Standard voices <li>10510000-zhixiaoyao (Chinese)</li><li>1001-zhiyu (Chinese)</li><li>1002-zhiling (Chinese)</li><li>1003-zhimei (Chinese)</li><li>1004-zhiyun (Chinese)</li><li>1005-zhili (Chinese)</li><li>1007-zhina (Chinese)</li><li>1008-zhiqi (Chinese)</li><li>1009-zhiyun (Chinese)</li><li>1010-zhihua (Chinese)</li><li>1017-zhirong (Chinese)</li><li>1018-zhijing (Chinese)</li><li>1050-WeJack (English)</li><li>1051-WeRose (English)</li>Premium voices<br>Premium voices have higher fidelity and more natural-sounding quality than standard voices. For price details, see [Purchase Guide](https://www.tencentcloud.com/document/product/1154/47874).<br><li>100510000-zhixiaoyao (Chinese)</li><li>101001-zhiyu (Chinese)</li><li>101002-zhiling (Chinese)</li><li>101003-zhimei (Chinese)</li><li>101004-zhiyun (Chinese)</li><li>101005-zhili (Chinese)</li><li>101006-zhiyan (Chinese)</li><li>101007-zhina (Chinese)</li><li>101008-zhiqi (Chinese)</li><li>101009-zhiyun (Chinese)</li><li>101010-zhihua (Chinese)</li><li>101011-zhiyan (Chinese)</li><li>101012-zhidan (Chinese)</li><li>101013-zhihui (Chinese)</li><li>101014-zhining (Chinese)</li><li>101015-zhimeng (Chinese)</li><li>101016-zhitian (Chinese)</li><li>101017-zhirong (Chinese)</li><li>101018-zhijing (Chinese)</li><li>101019-zhitong (Cantonese)</li><li>101020-zhigang (Chinese)</li><li>101021-zhirui (Chinese)</li><li>101022-zhihong (Chinese)</li><li>101023-zhixuan (Chinese)</li><li>101024-zhihao (Chinese)</li><li>101025-zhiwei (Chinese)</li><li>101026-zhixi (Chinese)</li><li>101027-zhimei (Chinese)</li><li>101028-zhijie (Chinese)</li><li>101029-zhikai (Chinese)</li><li>101030-zhike (Chinese)</li><li>101031-zhikui (Chinese)</li><li>101032-zhifang (Chinese)</li><li>101033-zhibei (Chinese)</li><li>101034-zhilian (Chinese)</li><li>101035-zhiyi (Chinese)</li><li>101040-zhichuan (Sichuan dialect)</li><li>101050-WeJack (English)</li><li>101051-WeRose (English)</li><li>101052-zhiwei (Chinese)</li>
<li>101053-zhifang (Chinese)</li>
<li>101054-zhiyou (Chinese)</li>
<li>101055-zhiyou (Chinese)</li>
<li>101056-zhilin (Northeastern Mandarin)</li>
    */
    @SerializedName("VoiceType")
    @Expose
    private Long VoiceType;

    /**
    * Primary language type: <li>1 - Chinese (default)</li><li>2 - English</li>
    */
    @SerializedName("PrimaryLanguage")
    @Expose
    private Long PrimaryLanguage;

    /**
    * Audio sample rate: <li>16000: 16k (default)</li><li>8000: 8k</li>
    */
    @SerializedName("SampleRate")
    @Expose
    private Long SampleRate;

    /**
    * Format of returned audio. Valid values: WAV (default), MP3, and PCM.
    */
    @SerializedName("Codec")
    @Expose
    private String Codec;

    /**
    * Whether to enable the timestamp feature. Default value: `false`.
    */
    @SerializedName("EnableSubtitle")
    @Expose
    private Boolean EnableSubtitle;

    /**
    * The threshold of speech segmentation sensibility, which can be `0` (default), `1`, or `2`. A larger value indicates fewer segments, and the model tends to only segment sentences based on punctuation marks. We recommend you not change this parameter to avoid adverse effect on speech synthesis.
    */
    @SerializedName("SegmentRate")
    @Expose
    private Long SegmentRate;

    /**
    * 
    */
    @SerializedName("EmotionCategory")
    @Expose
    private String EmotionCategory;

    /**
    * 
    */
    @SerializedName("EmotionIntensity")
    @Expose
    private Long EmotionIntensity;

    /**
    * 
    */
    @SerializedName("FastVoiceType")
    @Expose
    private String FastVoiceType;

    /**
     * Get The source text for synthesizing speech, which is encoded in UTF-8.
It can contain up to 150 Chinese characters (a full-width punctuation as a Chinese character) or 500 letters ( a half-width punctuation as a letter). 
     * @return Text The source text for synthesizing speech, which is encoded in UTF-8.
It can contain up to 150 Chinese characters (a full-width punctuation as a Chinese character) or 500 letters ( a half-width punctuation as a letter).
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set The source text for synthesizing speech, which is encoded in UTF-8.
It can contain up to 150 Chinese characters (a full-width punctuation as a Chinese character) or 500 letters ( a half-width punctuation as a letter).
     * @param Text The source text for synthesizing speech, which is encoded in UTF-8.
It can contain up to 150 Chinese characters (a full-width punctuation as a Chinese character) or 500 letters ( a half-width punctuation as a letter).
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get The `SessionId` of a request, which will be returned as-is. We recommend that you pass characters like uuid to prevent repetition. 
     * @return SessionId The `SessionId` of a request, which will be returned as-is. We recommend that you pass characters like uuid to prevent repetition.
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set The `SessionId` of a request, which will be returned as-is. We recommend that you pass characters like uuid to prevent repetition.
     * @param SessionId The `SessionId` of a request, which will be returned as-is. We recommend that you pass characters like uuid to prevent repetition.
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get Volume range: [0, 10], corresponding to 11 volume levels. 0 is the default value, indicating the normal volume. There is no mute option. 
     * @return Volume Volume range: [0, 10], corresponding to 11 volume levels. 0 is the default value, indicating the normal volume. There is no mute option.
     */
    public Float getVolume() {
        return this.Volume;
    }

    /**
     * Set Volume range: [0, 10], corresponding to 11 volume levels. 0 is the default value, indicating the normal volume. There is no mute option.
     * @param Volume Volume range: [0, 10], corresponding to 11 volume levels. 0 is the default value, indicating the normal volume. There is no mute option.
     */
    public void setVolume(Float Volume) {
        this.Volume = Volume;
    }

    /**
     * Get Speed range: [-2, 6], corresponding to different speeds<li>-2 for 0.6 times</li><li>-1 for 0.8 times</li><li>0 for 1.0 time (default)</li><li>1 for 1.2 times</li><li>2 for 1.5 times</li><li>6 for 2.5 times</li>To set finer-grained speed levels, keep one decimal place, such as 0.5, 1.1, and 1.8.<br> 
     * @return Speed Speed range: [-2, 6], corresponding to different speeds<li>-2 for 0.6 times</li><li>-1 for 0.8 times</li><li>0 for 1.0 time (default)</li><li>1 for 1.2 times</li><li>2 for 1.5 times</li><li>6 for 2.5 times</li>To set finer-grained speed levels, keep one decimal place, such as 0.5, 1.1, and 1.8.<br>
     */
    public Float getSpeed() {
        return this.Speed;
    }

    /**
     * Set Speed range: [-2, 6], corresponding to different speeds<li>-2 for 0.6 times</li><li>-1 for 0.8 times</li><li>0 for 1.0 time (default)</li><li>1 for 1.2 times</li><li>2 for 1.5 times</li><li>6 for 2.5 times</li>To set finer-grained speed levels, keep one decimal place, such as 0.5, 1.1, and 1.8.<br>
     * @param Speed Speed range: [-2, 6], corresponding to different speeds<li>-2 for 0.6 times</li><li>-1 for 0.8 times</li><li>0 for 1.0 time (default)</li><li>1 for 1.2 times</li><li>2 for 1.5 times</li><li>6 for 2.5 times</li>To set finer-grained speed levels, keep one decimal place, such as 0.5, 1.1, and 1.8.<br>
     */
    public void setSpeed(Float Speed) {
        this.Speed = Speed;
    }

    /**
     * Get Project ID, which defaults to 0 and can be customized. 
     * @return ProjectId Project ID, which defaults to 0 and can be customized.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID, which defaults to 0 and can be customized.
     * @param ProjectId Project ID, which defaults to 0 and can be customized.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Model type, with `1` for the default model. 
     * @return ModelType Model type, with `1` for the default model.
     */
    public Long getModelType() {
        return this.ModelType;
    }

    /**
     * Set Model type, with `1` for the default model.
     * @param ModelType Model type, with `1` for the default model.
     */
    public void setModelType(Long ModelType) {
        this.ModelType = ModelType;
    }

    /**
     * Get Standard voices <li>10510000-zhixiaoyao (Chinese)</li><li>1001-zhiyu (Chinese)</li><li>1002-zhiling (Chinese)</li><li>1003-zhimei (Chinese)</li><li>1004-zhiyun (Chinese)</li><li>1005-zhili (Chinese)</li><li>1007-zhina (Chinese)</li><li>1008-zhiqi (Chinese)</li><li>1009-zhiyun (Chinese)</li><li>1010-zhihua (Chinese)</li><li>1017-zhirong (Chinese)</li><li>1018-zhijing (Chinese)</li><li>1050-WeJack (English)</li><li>1051-WeRose (English)</li>Premium voices<br>Premium voices have higher fidelity and more natural-sounding quality than standard voices. For price details, see [Purchase Guide](https://www.tencentcloud.com/document/product/1154/47874).<br><li>100510000-zhixiaoyao (Chinese)</li><li>101001-zhiyu (Chinese)</li><li>101002-zhiling (Chinese)</li><li>101003-zhimei (Chinese)</li><li>101004-zhiyun (Chinese)</li><li>101005-zhili (Chinese)</li><li>101006-zhiyan (Chinese)</li><li>101007-zhina (Chinese)</li><li>101008-zhiqi (Chinese)</li><li>101009-zhiyun (Chinese)</li><li>101010-zhihua (Chinese)</li><li>101011-zhiyan (Chinese)</li><li>101012-zhidan (Chinese)</li><li>101013-zhihui (Chinese)</li><li>101014-zhining (Chinese)</li><li>101015-zhimeng (Chinese)</li><li>101016-zhitian (Chinese)</li><li>101017-zhirong (Chinese)</li><li>101018-zhijing (Chinese)</li><li>101019-zhitong (Cantonese)</li><li>101020-zhigang (Chinese)</li><li>101021-zhirui (Chinese)</li><li>101022-zhihong (Chinese)</li><li>101023-zhixuan (Chinese)</li><li>101024-zhihao (Chinese)</li><li>101025-zhiwei (Chinese)</li><li>101026-zhixi (Chinese)</li><li>101027-zhimei (Chinese)</li><li>101028-zhijie (Chinese)</li><li>101029-zhikai (Chinese)</li><li>101030-zhike (Chinese)</li><li>101031-zhikui (Chinese)</li><li>101032-zhifang (Chinese)</li><li>101033-zhibei (Chinese)</li><li>101034-zhilian (Chinese)</li><li>101035-zhiyi (Chinese)</li><li>101040-zhichuan (Sichuan dialect)</li><li>101050-WeJack (English)</li><li>101051-WeRose (English)</li><li>101052-zhiwei (Chinese)</li>
<li>101053-zhifang (Chinese)</li>
<li>101054-zhiyou (Chinese)</li>
<li>101055-zhiyou (Chinese)</li>
<li>101056-zhilin (Northeastern Mandarin)</li> 
     * @return VoiceType Standard voices <li>10510000-zhixiaoyao (Chinese)</li><li>1001-zhiyu (Chinese)</li><li>1002-zhiling (Chinese)</li><li>1003-zhimei (Chinese)</li><li>1004-zhiyun (Chinese)</li><li>1005-zhili (Chinese)</li><li>1007-zhina (Chinese)</li><li>1008-zhiqi (Chinese)</li><li>1009-zhiyun (Chinese)</li><li>1010-zhihua (Chinese)</li><li>1017-zhirong (Chinese)</li><li>1018-zhijing (Chinese)</li><li>1050-WeJack (English)</li><li>1051-WeRose (English)</li>Premium voices<br>Premium voices have higher fidelity and more natural-sounding quality than standard voices. For price details, see [Purchase Guide](https://www.tencentcloud.com/document/product/1154/47874).<br><li>100510000-zhixiaoyao (Chinese)</li><li>101001-zhiyu (Chinese)</li><li>101002-zhiling (Chinese)</li><li>101003-zhimei (Chinese)</li><li>101004-zhiyun (Chinese)</li><li>101005-zhili (Chinese)</li><li>101006-zhiyan (Chinese)</li><li>101007-zhina (Chinese)</li><li>101008-zhiqi (Chinese)</li><li>101009-zhiyun (Chinese)</li><li>101010-zhihua (Chinese)</li><li>101011-zhiyan (Chinese)</li><li>101012-zhidan (Chinese)</li><li>101013-zhihui (Chinese)</li><li>101014-zhining (Chinese)</li><li>101015-zhimeng (Chinese)</li><li>101016-zhitian (Chinese)</li><li>101017-zhirong (Chinese)</li><li>101018-zhijing (Chinese)</li><li>101019-zhitong (Cantonese)</li><li>101020-zhigang (Chinese)</li><li>101021-zhirui (Chinese)</li><li>101022-zhihong (Chinese)</li><li>101023-zhixuan (Chinese)</li><li>101024-zhihao (Chinese)</li><li>101025-zhiwei (Chinese)</li><li>101026-zhixi (Chinese)</li><li>101027-zhimei (Chinese)</li><li>101028-zhijie (Chinese)</li><li>101029-zhikai (Chinese)</li><li>101030-zhike (Chinese)</li><li>101031-zhikui (Chinese)</li><li>101032-zhifang (Chinese)</li><li>101033-zhibei (Chinese)</li><li>101034-zhilian (Chinese)</li><li>101035-zhiyi (Chinese)</li><li>101040-zhichuan (Sichuan dialect)</li><li>101050-WeJack (English)</li><li>101051-WeRose (English)</li><li>101052-zhiwei (Chinese)</li>
<li>101053-zhifang (Chinese)</li>
<li>101054-zhiyou (Chinese)</li>
<li>101055-zhiyou (Chinese)</li>
<li>101056-zhilin (Northeastern Mandarin)</li>
     */
    public Long getVoiceType() {
        return this.VoiceType;
    }

    /**
     * Set Standard voices <li>10510000-zhixiaoyao (Chinese)</li><li>1001-zhiyu (Chinese)</li><li>1002-zhiling (Chinese)</li><li>1003-zhimei (Chinese)</li><li>1004-zhiyun (Chinese)</li><li>1005-zhili (Chinese)</li><li>1007-zhina (Chinese)</li><li>1008-zhiqi (Chinese)</li><li>1009-zhiyun (Chinese)</li><li>1010-zhihua (Chinese)</li><li>1017-zhirong (Chinese)</li><li>1018-zhijing (Chinese)</li><li>1050-WeJack (English)</li><li>1051-WeRose (English)</li>Premium voices<br>Premium voices have higher fidelity and more natural-sounding quality than standard voices. For price details, see [Purchase Guide](https://www.tencentcloud.com/document/product/1154/47874).<br><li>100510000-zhixiaoyao (Chinese)</li><li>101001-zhiyu (Chinese)</li><li>101002-zhiling (Chinese)</li><li>101003-zhimei (Chinese)</li><li>101004-zhiyun (Chinese)</li><li>101005-zhili (Chinese)</li><li>101006-zhiyan (Chinese)</li><li>101007-zhina (Chinese)</li><li>101008-zhiqi (Chinese)</li><li>101009-zhiyun (Chinese)</li><li>101010-zhihua (Chinese)</li><li>101011-zhiyan (Chinese)</li><li>101012-zhidan (Chinese)</li><li>101013-zhihui (Chinese)</li><li>101014-zhining (Chinese)</li><li>101015-zhimeng (Chinese)</li><li>101016-zhitian (Chinese)</li><li>101017-zhirong (Chinese)</li><li>101018-zhijing (Chinese)</li><li>101019-zhitong (Cantonese)</li><li>101020-zhigang (Chinese)</li><li>101021-zhirui (Chinese)</li><li>101022-zhihong (Chinese)</li><li>101023-zhixuan (Chinese)</li><li>101024-zhihao (Chinese)</li><li>101025-zhiwei (Chinese)</li><li>101026-zhixi (Chinese)</li><li>101027-zhimei (Chinese)</li><li>101028-zhijie (Chinese)</li><li>101029-zhikai (Chinese)</li><li>101030-zhike (Chinese)</li><li>101031-zhikui (Chinese)</li><li>101032-zhifang (Chinese)</li><li>101033-zhibei (Chinese)</li><li>101034-zhilian (Chinese)</li><li>101035-zhiyi (Chinese)</li><li>101040-zhichuan (Sichuan dialect)</li><li>101050-WeJack (English)</li><li>101051-WeRose (English)</li><li>101052-zhiwei (Chinese)</li>
<li>101053-zhifang (Chinese)</li>
<li>101054-zhiyou (Chinese)</li>
<li>101055-zhiyou (Chinese)</li>
<li>101056-zhilin (Northeastern Mandarin)</li>
     * @param VoiceType Standard voices <li>10510000-zhixiaoyao (Chinese)</li><li>1001-zhiyu (Chinese)</li><li>1002-zhiling (Chinese)</li><li>1003-zhimei (Chinese)</li><li>1004-zhiyun (Chinese)</li><li>1005-zhili (Chinese)</li><li>1007-zhina (Chinese)</li><li>1008-zhiqi (Chinese)</li><li>1009-zhiyun (Chinese)</li><li>1010-zhihua (Chinese)</li><li>1017-zhirong (Chinese)</li><li>1018-zhijing (Chinese)</li><li>1050-WeJack (English)</li><li>1051-WeRose (English)</li>Premium voices<br>Premium voices have higher fidelity and more natural-sounding quality than standard voices. For price details, see [Purchase Guide](https://www.tencentcloud.com/document/product/1154/47874).<br><li>100510000-zhixiaoyao (Chinese)</li><li>101001-zhiyu (Chinese)</li><li>101002-zhiling (Chinese)</li><li>101003-zhimei (Chinese)</li><li>101004-zhiyun (Chinese)</li><li>101005-zhili (Chinese)</li><li>101006-zhiyan (Chinese)</li><li>101007-zhina (Chinese)</li><li>101008-zhiqi (Chinese)</li><li>101009-zhiyun (Chinese)</li><li>101010-zhihua (Chinese)</li><li>101011-zhiyan (Chinese)</li><li>101012-zhidan (Chinese)</li><li>101013-zhihui (Chinese)</li><li>101014-zhining (Chinese)</li><li>101015-zhimeng (Chinese)</li><li>101016-zhitian (Chinese)</li><li>101017-zhirong (Chinese)</li><li>101018-zhijing (Chinese)</li><li>101019-zhitong (Cantonese)</li><li>101020-zhigang (Chinese)</li><li>101021-zhirui (Chinese)</li><li>101022-zhihong (Chinese)</li><li>101023-zhixuan (Chinese)</li><li>101024-zhihao (Chinese)</li><li>101025-zhiwei (Chinese)</li><li>101026-zhixi (Chinese)</li><li>101027-zhimei (Chinese)</li><li>101028-zhijie (Chinese)</li><li>101029-zhikai (Chinese)</li><li>101030-zhike (Chinese)</li><li>101031-zhikui (Chinese)</li><li>101032-zhifang (Chinese)</li><li>101033-zhibei (Chinese)</li><li>101034-zhilian (Chinese)</li><li>101035-zhiyi (Chinese)</li><li>101040-zhichuan (Sichuan dialect)</li><li>101050-WeJack (English)</li><li>101051-WeRose (English)</li><li>101052-zhiwei (Chinese)</li>
<li>101053-zhifang (Chinese)</li>
<li>101054-zhiyou (Chinese)</li>
<li>101055-zhiyou (Chinese)</li>
<li>101056-zhilin (Northeastern Mandarin)</li>
     */
    public void setVoiceType(Long VoiceType) {
        this.VoiceType = VoiceType;
    }

    /**
     * Get Primary language type: <li>1 - Chinese (default)</li><li>2 - English</li> 
     * @return PrimaryLanguage Primary language type: <li>1 - Chinese (default)</li><li>2 - English</li>
     */
    public Long getPrimaryLanguage() {
        return this.PrimaryLanguage;
    }

    /**
     * Set Primary language type: <li>1 - Chinese (default)</li><li>2 - English</li>
     * @param PrimaryLanguage Primary language type: <li>1 - Chinese (default)</li><li>2 - English</li>
     */
    public void setPrimaryLanguage(Long PrimaryLanguage) {
        this.PrimaryLanguage = PrimaryLanguage;
    }

    /**
     * Get Audio sample rate: <li>16000: 16k (default)</li><li>8000: 8k</li> 
     * @return SampleRate Audio sample rate: <li>16000: 16k (default)</li><li>8000: 8k</li>
     */
    public Long getSampleRate() {
        return this.SampleRate;
    }

    /**
     * Set Audio sample rate: <li>16000: 16k (default)</li><li>8000: 8k</li>
     * @param SampleRate Audio sample rate: <li>16000: 16k (default)</li><li>8000: 8k</li>
     */
    public void setSampleRate(Long SampleRate) {
        this.SampleRate = SampleRate;
    }

    /**
     * Get Format of returned audio. Valid values: WAV (default), MP3, and PCM. 
     * @return Codec Format of returned audio. Valid values: WAV (default), MP3, and PCM.
     */
    public String getCodec() {
        return this.Codec;
    }

    /**
     * Set Format of returned audio. Valid values: WAV (default), MP3, and PCM.
     * @param Codec Format of returned audio. Valid values: WAV (default), MP3, and PCM.
     */
    public void setCodec(String Codec) {
        this.Codec = Codec;
    }

    /**
     * Get Whether to enable the timestamp feature. Default value: `false`. 
     * @return EnableSubtitle Whether to enable the timestamp feature. Default value: `false`.
     */
    public Boolean getEnableSubtitle() {
        return this.EnableSubtitle;
    }

    /**
     * Set Whether to enable the timestamp feature. Default value: `false`.
     * @param EnableSubtitle Whether to enable the timestamp feature. Default value: `false`.
     */
    public void setEnableSubtitle(Boolean EnableSubtitle) {
        this.EnableSubtitle = EnableSubtitle;
    }

    /**
     * Get The threshold of speech segmentation sensibility, which can be `0` (default), `1`, or `2`. A larger value indicates fewer segments, and the model tends to only segment sentences based on punctuation marks. We recommend you not change this parameter to avoid adverse effect on speech synthesis. 
     * @return SegmentRate The threshold of speech segmentation sensibility, which can be `0` (default), `1`, or `2`. A larger value indicates fewer segments, and the model tends to only segment sentences based on punctuation marks. We recommend you not change this parameter to avoid adverse effect on speech synthesis.
     */
    public Long getSegmentRate() {
        return this.SegmentRate;
    }

    /**
     * Set The threshold of speech segmentation sensibility, which can be `0` (default), `1`, or `2`. A larger value indicates fewer segments, and the model tends to only segment sentences based on punctuation marks. We recommend you not change this parameter to avoid adverse effect on speech synthesis.
     * @param SegmentRate The threshold of speech segmentation sensibility, which can be `0` (default), `1`, or `2`. A larger value indicates fewer segments, and the model tends to only segment sentences based on punctuation marks. We recommend you not change this parameter to avoid adverse effect on speech synthesis.
     */
    public void setSegmentRate(Long SegmentRate) {
        this.SegmentRate = SegmentRate;
    }

    /**
     * Get  
     * @return EmotionCategory 
     */
    public String getEmotionCategory() {
        return this.EmotionCategory;
    }

    /**
     * Set 
     * @param EmotionCategory 
     */
    public void setEmotionCategory(String EmotionCategory) {
        this.EmotionCategory = EmotionCategory;
    }

    /**
     * Get  
     * @return EmotionIntensity 
     */
    public Long getEmotionIntensity() {
        return this.EmotionIntensity;
    }

    /**
     * Set 
     * @param EmotionIntensity 
     */
    public void setEmotionIntensity(Long EmotionIntensity) {
        this.EmotionIntensity = EmotionIntensity;
    }

    /**
     * Get  
     * @return FastVoiceType 
     */
    public String getFastVoiceType() {
        return this.FastVoiceType;
    }

    /**
     * Set 
     * @param FastVoiceType 
     */
    public void setFastVoiceType(String FastVoiceType) {
        this.FastVoiceType = FastVoiceType;
    }

    public TextToVoiceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TextToVoiceRequest(TextToVoiceRequest source) {
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.Volume != null) {
            this.Volume = new Float(source.Volume);
        }
        if (source.Speed != null) {
            this.Speed = new Float(source.Speed);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.ModelType != null) {
            this.ModelType = new Long(source.ModelType);
        }
        if (source.VoiceType != null) {
            this.VoiceType = new Long(source.VoiceType);
        }
        if (source.PrimaryLanguage != null) {
            this.PrimaryLanguage = new Long(source.PrimaryLanguage);
        }
        if (source.SampleRate != null) {
            this.SampleRate = new Long(source.SampleRate);
        }
        if (source.Codec != null) {
            this.Codec = new String(source.Codec);
        }
        if (source.EnableSubtitle != null) {
            this.EnableSubtitle = new Boolean(source.EnableSubtitle);
        }
        if (source.SegmentRate != null) {
            this.SegmentRate = new Long(source.SegmentRate);
        }
        if (source.EmotionCategory != null) {
            this.EmotionCategory = new String(source.EmotionCategory);
        }
        if (source.EmotionIntensity != null) {
            this.EmotionIntensity = new Long(source.EmotionIntensity);
        }
        if (source.FastVoiceType != null) {
            this.FastVoiceType = new String(source.FastVoiceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "Volume", this.Volume);
        this.setParamSimple(map, prefix + "Speed", this.Speed);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ModelType", this.ModelType);
        this.setParamSimple(map, prefix + "VoiceType", this.VoiceType);
        this.setParamSimple(map, prefix + "PrimaryLanguage", this.PrimaryLanguage);
        this.setParamSimple(map, prefix + "SampleRate", this.SampleRate);
        this.setParamSimple(map, prefix + "Codec", this.Codec);
        this.setParamSimple(map, prefix + "EnableSubtitle", this.EnableSubtitle);
        this.setParamSimple(map, prefix + "SegmentRate", this.SegmentRate);
        this.setParamSimple(map, prefix + "EmotionCategory", this.EmotionCategory);
        this.setParamSimple(map, prefix + "EmotionIntensity", this.EmotionIntensity);
        this.setParamSimple(map, prefix + "FastVoiceType", this.FastVoiceType);

    }
}

