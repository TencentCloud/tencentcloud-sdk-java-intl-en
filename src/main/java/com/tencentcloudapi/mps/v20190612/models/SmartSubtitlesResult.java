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

public class SmartSubtitlesResult extends AbstractModel {

    /**
    * Task type. Valid values:
- AsrFullTextRecognition: full speech recognition.
- TransTextRecognition: speech translation.
- PureSubtitleTrans: pure subtitle translation.
- OcrFullTextRecognition: text-based subtitle extraction.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Full speech recognition result. When Type is
 set to AsrFullTextRecognition, this parameter takes effect.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("AsrFullTextTask")
    @Expose
    private SmartSubtitleTaskAsrFullTextResult AsrFullTextTask;

    /**
    * Translation result. When Type is

 set to TransTextRecognition, this parameter takes effect.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TransTextTask")
    @Expose
    private SmartSubtitleTaskTransTextResult TransTextTask;

    /**
    * The translation result of the pure subtitle file is returned when the translation type is PureSubtitleTrans.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PureSubtitleTransTask")
    @Expose
    private PureSubtitleTransResult PureSubtitleTransTask;

    /**
    * Text-based subtitle extraction result. This field is valid when the value of Type is
OcrFullTextRecognition.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OcrFullTextTask")
    @Expose
    private SmartSubtitleTaskFullTextResult OcrFullTextTask;

    /**
     * Get Task type. Valid values:
- AsrFullTextRecognition: full speech recognition.
- TransTextRecognition: speech translation.
- PureSubtitleTrans: pure subtitle translation.
- OcrFullTextRecognition: text-based subtitle extraction. 
     * @return Type Task type. Valid values:
- AsrFullTextRecognition: full speech recognition.
- TransTextRecognition: speech translation.
- PureSubtitleTrans: pure subtitle translation.
- OcrFullTextRecognition: text-based subtitle extraction.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Task type. Valid values:
- AsrFullTextRecognition: full speech recognition.
- TransTextRecognition: speech translation.
- PureSubtitleTrans: pure subtitle translation.
- OcrFullTextRecognition: text-based subtitle extraction.
     * @param Type Task type. Valid values:
- AsrFullTextRecognition: full speech recognition.
- TransTextRecognition: speech translation.
- PureSubtitleTrans: pure subtitle translation.
- OcrFullTextRecognition: text-based subtitle extraction.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Full speech recognition result. When Type is
 set to AsrFullTextRecognition, this parameter takes effect.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return AsrFullTextTask Full speech recognition result. When Type is
 set to AsrFullTextRecognition, this parameter takes effect.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public SmartSubtitleTaskAsrFullTextResult getAsrFullTextTask() {
        return this.AsrFullTextTask;
    }

    /**
     * Set Full speech recognition result. When Type is
 set to AsrFullTextRecognition, this parameter takes effect.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param AsrFullTextTask Full speech recognition result. When Type is
 set to AsrFullTextRecognition, this parameter takes effect.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setAsrFullTextTask(SmartSubtitleTaskAsrFullTextResult AsrFullTextTask) {
        this.AsrFullTextTask = AsrFullTextTask;
    }

    /**
     * Get Translation result. When Type is

 set to TransTextRecognition, this parameter takes effect.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TransTextTask Translation result. When Type is

 set to TransTextRecognition, this parameter takes effect.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public SmartSubtitleTaskTransTextResult getTransTextTask() {
        return this.TransTextTask;
    }

    /**
     * Set Translation result. When Type is

 set to TransTextRecognition, this parameter takes effect.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TransTextTask Translation result. When Type is

 set to TransTextRecognition, this parameter takes effect.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTransTextTask(SmartSubtitleTaskTransTextResult TransTextTask) {
        this.TransTextTask = TransTextTask;
    }

    /**
     * Get The translation result of the pure subtitle file is returned when the translation type is PureSubtitleTrans.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PureSubtitleTransTask The translation result of the pure subtitle file is returned when the translation type is PureSubtitleTrans.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public PureSubtitleTransResult getPureSubtitleTransTask() {
        return this.PureSubtitleTransTask;
    }

    /**
     * Set The translation result of the pure subtitle file is returned when the translation type is PureSubtitleTrans.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PureSubtitleTransTask The translation result of the pure subtitle file is returned when the translation type is PureSubtitleTrans.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPureSubtitleTransTask(PureSubtitleTransResult PureSubtitleTransTask) {
        this.PureSubtitleTransTask = PureSubtitleTransTask;
    }

    /**
     * Get Text-based subtitle extraction result. This field is valid when the value of Type is
OcrFullTextRecognition.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OcrFullTextTask Text-based subtitle extraction result. This field is valid when the value of Type is
OcrFullTextRecognition.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public SmartSubtitleTaskFullTextResult getOcrFullTextTask() {
        return this.OcrFullTextTask;
    }

    /**
     * Set Text-based subtitle extraction result. This field is valid when the value of Type is
OcrFullTextRecognition.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OcrFullTextTask Text-based subtitle extraction result. This field is valid when the value of Type is
OcrFullTextRecognition.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOcrFullTextTask(SmartSubtitleTaskFullTextResult OcrFullTextTask) {
        this.OcrFullTextTask = OcrFullTextTask;
    }

    public SmartSubtitlesResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SmartSubtitlesResult(SmartSubtitlesResult source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.AsrFullTextTask != null) {
            this.AsrFullTextTask = new SmartSubtitleTaskAsrFullTextResult(source.AsrFullTextTask);
        }
        if (source.TransTextTask != null) {
            this.TransTextTask = new SmartSubtitleTaskTransTextResult(source.TransTextTask);
        }
        if (source.PureSubtitleTransTask != null) {
            this.PureSubtitleTransTask = new PureSubtitleTransResult(source.PureSubtitleTransTask);
        }
        if (source.OcrFullTextTask != null) {
            this.OcrFullTextTask = new SmartSubtitleTaskFullTextResult(source.OcrFullTextTask);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "AsrFullTextTask.", this.AsrFullTextTask);
        this.setParamObj(map, prefix + "TransTextTask.", this.TransTextTask);
        this.setParamObj(map, prefix + "PureSubtitleTransTask.", this.PureSubtitleTransTask);
        this.setParamObj(map, prefix + "OcrFullTextTask.", this.OcrFullTextTask);

    }
}

