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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TextToVoiceRequest extends AbstractModel{

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
    * 
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
    * Standard voices <li>10510000-zhixiaoyao (Chinese)</li><li>1001-zhiyu (Chinese)</li><li>1002-zhiling (Chinese)</li><li>1003-zhimei (Chinese)</li><li>1004-zhiyun (Chinese)</li><li>1005-zhili (Chinese)</li><li>1007-zhina (Chinese)</li><li>1008-zhiqi (Chinese)</li><li>1009-zhiyun (Chinese)</li><li>1010-zhihua (Chinese)</li><li>1017-zhirong (Chinese)</li><li>1018-zhijing (Chinese)</li><li>1050-WeJack (English)</li><li>1051-WeRose (English)</li>Premium voices<br>Premium voices have higher fidelity and more natural-sounding quality than standard voices. For price details, see [Purchase Guide](https://intl.cloud.tencent.com/document/product/1073/34112?from_cn_redirect=1).<br><li>100510000-zhixiaoyao (Chinese)</li><li>101001-zhiyu (Chinese)</li><li>101002-zhiling (Chinese)</li><li>101003-zhimei (Chinese)</li><li>101004-zhiyun (Chinese)</li><li>101005-zhili (Chinese)</li><li>101006-zhiyan (Chinese)</li><li>101007-zhina (Chinese)</li><li>101008-zhiqi (Chinese)</li><li>101009-zhiyun (Chinese)</li><li>101010-zhihua (Chinese)</li><li>101011-zhiyan (Chinese)</li><li>101012-zhidan (Chinese)</li><li>101013-zhihui (Chinese)</li><li>101014-zhining (Chinese)</li><li>101015-zhimeng (Chinese)</li><li>101016-zhitian (Chinese)</li><li>101017-zhirong (Chinese)</li><li>101018-zhijing (Chinese)</li><li>101019-zhitong (Cantonese)</li><li>101020-zhigang (Chinese)</li><li>101021-zhirui (Chinese)</li><li>101022-zhihong (Chinese)</li><li>101023-zhixuan (Chinese)</li><li>101024-zhihao (Chinese)</li><li>101025-zhiwei (Chinese)</li><li>101026-zhixi (Chinese)</li><li>101027-zhimei (Chinese)</li><li>101028-zhijie (Chinese)</li><li>101029-zhikai (Chinese)</li><li>101030-zhike (Chinese)</li><li>101031-zhikui (Chinese)</li><li>101032-zhifang (Chinese)</li><li>101033-zhibei (Chinese)</li><li>101034-zhilian (Chinese)</li><li>101035-zhiyi (Chinese)</li><li>101040-zhichuan (Sichuan dialect)</li><li>101050-WeJack (English)</li><li>101051-WeRose (English)</li><li>101052-zhiwei (Chinese)</li>
<li>101053-zhifang (Chinese)</li>
<li>101054-zhiyou (Chinese)</li>
<li>101055-zhiyou (Chinese)</li>
<li>101056-zhilin (Dongbei dialect)</li>
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
    * Segmentation rate. Valid range: [0,1,2]; default value: `0`. The higher the value, the lower the rate, and the easier the segmentation. It is recommended not to change this parameter to ensure better synthesis quality.
    */
    @SerializedName("SegmentRate")
    @Expose
    private Long SegmentRate;

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
     * Get  
     * @return Speed 
     */
    public Float getSpeed() {
        return this.Speed;
    }

    /**
     * Set 
     * @param Speed 
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
     * Get Standard voices <li>10510000-zhixiaoyao (Chinese)</li><li>1001-zhiyu (Chinese)</li><li>1002-zhiling (Chinese)</li><li>1003-zhimei (Chinese)</li><li>1004-zhiyun (Chinese)</li><li>1005-zhili (Chinese)</li><li>1007-zhina (Chinese)</li><li>1008-zhiqi (Chinese)</li><li>1009-zhiyun (Chinese)</li><li>1010-zhihua (Chinese)</li><li>1017-zhirong (Chinese)</li><li>1018-zhijing (Chinese)</li><li>1050-WeJack (English)</li><li>1051-WeRose (English)</li>Premium voices<br>Premium voices have higher fidelity and more natural-sounding quality than standard voices. For price details, see [Purchase Guide](https://intl.cloud.tencent.com/document/product/1073/34112?from_cn_redirect=1).<br><li>100510000-zhixiaoyao (Chinese)</li><li>101001-zhiyu (Chinese)</li><li>101002-zhiling (Chinese)</li><li>101003-zhimei (Chinese)</li><li>101004-zhiyun (Chinese)</li><li>101005-zhili (Chinese)</li><li>101006-zhiyan (Chinese)</li><li>101007-zhina (Chinese)</li><li>101008-zhiqi (Chinese)</li><li>101009-zhiyun (Chinese)</li><li>101010-zhihua (Chinese)</li><li>101011-zhiyan (Chinese)</li><li>101012-zhidan (Chinese)</li><li>101013-zhihui (Chinese)</li><li>101014-zhining (Chinese)</li><li>101015-zhimeng (Chinese)</li><li>101016-zhitian (Chinese)</li><li>101017-zhirong (Chinese)</li><li>101018-zhijing (Chinese)</li><li>101019-zhitong (Cantonese)</li><li>101020-zhigang (Chinese)</li><li>101021-zhirui (Chinese)</li><li>101022-zhihong (Chinese)</li><li>101023-zhixuan (Chinese)</li><li>101024-zhihao (Chinese)</li><li>101025-zhiwei (Chinese)</li><li>101026-zhixi (Chinese)</li><li>101027-zhimei (Chinese)</li><li>101028-zhijie (Chinese)</li><li>101029-zhikai (Chinese)</li><li>101030-zhike (Chinese)</li><li>101031-zhikui (Chinese)</li><li>101032-zhifang (Chinese)</li><li>101033-zhibei (Chinese)</li><li>101034-zhilian (Chinese)</li><li>101035-zhiyi (Chinese)</li><li>101040-zhichuan (Sichuan dialect)</li><li>101050-WeJack (English)</li><li>101051-WeRose (English)</li><li>101052-zhiwei (Chinese)</li>
<li>101053-zhifang (Chinese)</li>
<li>101054-zhiyou (Chinese)</li>
<li>101055-zhiyou (Chinese)</li>
<li>101056-zhilin (Dongbei dialect)</li> 
     * @return VoiceType Standard voices <li>10510000-zhixiaoyao (Chinese)</li><li>1001-zhiyu (Chinese)</li><li>1002-zhiling (Chinese)</li><li>1003-zhimei (Chinese)</li><li>1004-zhiyun (Chinese)</li><li>1005-zhili (Chinese)</li><li>1007-zhina (Chinese)</li><li>1008-zhiqi (Chinese)</li><li>1009-zhiyun (Chinese)</li><li>1010-zhihua (Chinese)</li><li>1017-zhirong (Chinese)</li><li>1018-zhijing (Chinese)</li><li>1050-WeJack (English)</li><li>1051-WeRose (English)</li>Premium voices<br>Premium voices have higher fidelity and more natural-sounding quality than standard voices. For price details, see [Purchase Guide](https://intl.cloud.tencent.com/document/product/1073/34112?from_cn_redirect=1).<br><li>100510000-zhixiaoyao (Chinese)</li><li>101001-zhiyu (Chinese)</li><li>101002-zhiling (Chinese)</li><li>101003-zhimei (Chinese)</li><li>101004-zhiyun (Chinese)</li><li>101005-zhili (Chinese)</li><li>101006-zhiyan (Chinese)</li><li>101007-zhina (Chinese)</li><li>101008-zhiqi (Chinese)</li><li>101009-zhiyun (Chinese)</li><li>101010-zhihua (Chinese)</li><li>101011-zhiyan (Chinese)</li><li>101012-zhidan (Chinese)</li><li>101013-zhihui (Chinese)</li><li>101014-zhining (Chinese)</li><li>101015-zhimeng (Chinese)</li><li>101016-zhitian (Chinese)</li><li>101017-zhirong (Chinese)</li><li>101018-zhijing (Chinese)</li><li>101019-zhitong (Cantonese)</li><li>101020-zhigang (Chinese)</li><li>101021-zhirui (Chinese)</li><li>101022-zhihong (Chinese)</li><li>101023-zhixuan (Chinese)</li><li>101024-zhihao (Chinese)</li><li>101025-zhiwei (Chinese)</li><li>101026-zhixi (Chinese)</li><li>101027-zhimei (Chinese)</li><li>101028-zhijie (Chinese)</li><li>101029-zhikai (Chinese)</li><li>101030-zhike (Chinese)</li><li>101031-zhikui (Chinese)</li><li>101032-zhifang (Chinese)</li><li>101033-zhibei (Chinese)</li><li>101034-zhilian (Chinese)</li><li>101035-zhiyi (Chinese)</li><li>101040-zhichuan (Sichuan dialect)</li><li>101050-WeJack (English)</li><li>101051-WeRose (English)</li><li>101052-zhiwei (Chinese)</li>
<li>101053-zhifang (Chinese)</li>
<li>101054-zhiyou (Chinese)</li>
<li>101055-zhiyou (Chinese)</li>
<li>101056-zhilin (Dongbei dialect)</li>
     */
    public Long getVoiceType() {
        return this.VoiceType;
    }

    /**
     * Set Standard voices <li>10510000-zhixiaoyao (Chinese)</li><li>1001-zhiyu (Chinese)</li><li>1002-zhiling (Chinese)</li><li>1003-zhimei (Chinese)</li><li>1004-zhiyun (Chinese)</li><li>1005-zhili (Chinese)</li><li>1007-zhina (Chinese)</li><li>1008-zhiqi (Chinese)</li><li>1009-zhiyun (Chinese)</li><li>1010-zhihua (Chinese)</li><li>1017-zhirong (Chinese)</li><li>1018-zhijing (Chinese)</li><li>1050-WeJack (English)</li><li>1051-WeRose (English)</li>Premium voices<br>Premium voices have higher fidelity and more natural-sounding quality than standard voices. For price details, see [Purchase Guide](https://intl.cloud.tencent.com/document/product/1073/34112?from_cn_redirect=1).<br><li>100510000-zhixiaoyao (Chinese)</li><li>101001-zhiyu (Chinese)</li><li>101002-zhiling (Chinese)</li><li>101003-zhimei (Chinese)</li><li>101004-zhiyun (Chinese)</li><li>101005-zhili (Chinese)</li><li>101006-zhiyan (Chinese)</li><li>101007-zhina (Chinese)</li><li>101008-zhiqi (Chinese)</li><li>101009-zhiyun (Chinese)</li><li>101010-zhihua (Chinese)</li><li>101011-zhiyan (Chinese)</li><li>101012-zhidan (Chinese)</li><li>101013-zhihui (Chinese)</li><li>101014-zhining (Chinese)</li><li>101015-zhimeng (Chinese)</li><li>101016-zhitian (Chinese)</li><li>101017-zhirong (Chinese)</li><li>101018-zhijing (Chinese)</li><li>101019-zhitong (Cantonese)</li><li>101020-zhigang (Chinese)</li><li>101021-zhirui (Chinese)</li><li>101022-zhihong (Chinese)</li><li>101023-zhixuan (Chinese)</li><li>101024-zhihao (Chinese)</li><li>101025-zhiwei (Chinese)</li><li>101026-zhixi (Chinese)</li><li>101027-zhimei (Chinese)</li><li>101028-zhijie (Chinese)</li><li>101029-zhikai (Chinese)</li><li>101030-zhike (Chinese)</li><li>101031-zhikui (Chinese)</li><li>101032-zhifang (Chinese)</li><li>101033-zhibei (Chinese)</li><li>101034-zhilian (Chinese)</li><li>101035-zhiyi (Chinese)</li><li>101040-zhichuan (Sichuan dialect)</li><li>101050-WeJack (English)</li><li>101051-WeRose (English)</li><li>101052-zhiwei (Chinese)</li>
<li>101053-zhifang (Chinese)</li>
<li>101054-zhiyou (Chinese)</li>
<li>101055-zhiyou (Chinese)</li>
<li>101056-zhilin (Dongbei dialect)</li>
     * @param VoiceType Standard voices <li>10510000-zhixiaoyao (Chinese)</li><li>1001-zhiyu (Chinese)</li><li>1002-zhiling (Chinese)</li><li>1003-zhimei (Chinese)</li><li>1004-zhiyun (Chinese)</li><li>1005-zhili (Chinese)</li><li>1007-zhina (Chinese)</li><li>1008-zhiqi (Chinese)</li><li>1009-zhiyun (Chinese)</li><li>1010-zhihua (Chinese)</li><li>1017-zhirong (Chinese)</li><li>1018-zhijing (Chinese)</li><li>1050-WeJack (English)</li><li>1051-WeRose (English)</li>Premium voices<br>Premium voices have higher fidelity and more natural-sounding quality than standard voices. For price details, see [Purchase Guide](https://intl.cloud.tencent.com/document/product/1073/34112?from_cn_redirect=1).<br><li>100510000-zhixiaoyao (Chinese)</li><li>101001-zhiyu (Chinese)</li><li>101002-zhiling (Chinese)</li><li>101003-zhimei (Chinese)</li><li>101004-zhiyun (Chinese)</li><li>101005-zhili (Chinese)</li><li>101006-zhiyan (Chinese)</li><li>101007-zhina (Chinese)</li><li>101008-zhiqi (Chinese)</li><li>101009-zhiyun (Chinese)</li><li>101010-zhihua (Chinese)</li><li>101011-zhiyan (Chinese)</li><li>101012-zhidan (Chinese)</li><li>101013-zhihui (Chinese)</li><li>101014-zhining (Chinese)</li><li>101015-zhimeng (Chinese)</li><li>101016-zhitian (Chinese)</li><li>101017-zhirong (Chinese)</li><li>101018-zhijing (Chinese)</li><li>101019-zhitong (Cantonese)</li><li>101020-zhigang (Chinese)</li><li>101021-zhirui (Chinese)</li><li>101022-zhihong (Chinese)</li><li>101023-zhixuan (Chinese)</li><li>101024-zhihao (Chinese)</li><li>101025-zhiwei (Chinese)</li><li>101026-zhixi (Chinese)</li><li>101027-zhimei (Chinese)</li><li>101028-zhijie (Chinese)</li><li>101029-zhikai (Chinese)</li><li>101030-zhike (Chinese)</li><li>101031-zhikui (Chinese)</li><li>101032-zhifang (Chinese)</li><li>101033-zhibei (Chinese)</li><li>101034-zhilian (Chinese)</li><li>101035-zhiyi (Chinese)</li><li>101040-zhichuan (Sichuan dialect)</li><li>101050-WeJack (English)</li><li>101051-WeRose (English)</li><li>101052-zhiwei (Chinese)</li>
<li>101053-zhifang (Chinese)</li>
<li>101054-zhiyou (Chinese)</li>
<li>101055-zhiyou (Chinese)</li>
<li>101056-zhilin (Dongbei dialect)</li>
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
     * Get Segmentation rate. Valid range: [0,1,2]; default value: `0`. The higher the value, the lower the rate, and the easier the segmentation. It is recommended not to change this parameter to ensure better synthesis quality. 
     * @return SegmentRate Segmentation rate. Valid range: [0,1,2]; default value: `0`. The higher the value, the lower the rate, and the easier the segmentation. It is recommended not to change this parameter to ensure better synthesis quality.
     */
    public Long getSegmentRate() {
        return this.SegmentRate;
    }

    /**
     * Set Segmentation rate. Valid range: [0,1,2]; default value: `0`. The higher the value, the lower the rate, and the easier the segmentation. It is recommended not to change this parameter to ensure better synthesis quality.
     * @param SegmentRate Segmentation rate. Valid range: [0,1,2]; default value: `0`. The higher the value, the lower the rate, and the easier the segmentation. It is recommended not to change this parameter to ensure better synthesis quality.
     */
    public void setSegmentRate(Long SegmentRate) {
        this.SegmentRate = SegmentRate;
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

    }
}

