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
- AsrFullTextRecognition: full speech recognition
- TransTextRecognition: speech translation
- PureSubtitleTrans: pure subtitle translation.
- OcrFullTextRecognition: text-based subtitle extraction.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 
    */
    @SerializedName("AsrFullTextTask")
    @Expose
    private SmartSubtitleTaskAsrFullTextResult AsrFullTextTask;

    /**
    * 
    */
    @SerializedName("TransTextTask")
    @Expose
    private SmartSubtitleTaskTransTextResult TransTextTask;

    /**
    * 
    */
    @SerializedName("PureSubtitleTransTask")
    @Expose
    private PureSubtitleTransResult PureSubtitleTransTask;

    /**
    * 
    */
    @SerializedName("OcrFullTextTask")
    @Expose
    private SmartSubtitleTaskFullTextResult OcrFullTextTask;

    /**
     * Get Task type. Valid values:
- AsrFullTextRecognition: full speech recognition
- TransTextRecognition: speech translation
- PureSubtitleTrans: pure subtitle translation.
- OcrFullTextRecognition: text-based subtitle extraction. 
     * @return Type Task type. Valid values:
- AsrFullTextRecognition: full speech recognition
- TransTextRecognition: speech translation
- PureSubtitleTrans: pure subtitle translation.
- OcrFullTextRecognition: text-based subtitle extraction.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Task type. Valid values:
- AsrFullTextRecognition: full speech recognition
- TransTextRecognition: speech translation
- PureSubtitleTrans: pure subtitle translation.
- OcrFullTextRecognition: text-based subtitle extraction.
     * @param Type Task type. Valid values:
- AsrFullTextRecognition: full speech recognition
- TransTextRecognition: speech translation
- PureSubtitleTrans: pure subtitle translation.
- OcrFullTextRecognition: text-based subtitle extraction.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get  
     * @return AsrFullTextTask 
     */
    public SmartSubtitleTaskAsrFullTextResult getAsrFullTextTask() {
        return this.AsrFullTextTask;
    }

    /**
     * Set 
     * @param AsrFullTextTask 
     */
    public void setAsrFullTextTask(SmartSubtitleTaskAsrFullTextResult AsrFullTextTask) {
        this.AsrFullTextTask = AsrFullTextTask;
    }

    /**
     * Get  
     * @return TransTextTask 
     */
    public SmartSubtitleTaskTransTextResult getTransTextTask() {
        return this.TransTextTask;
    }

    /**
     * Set 
     * @param TransTextTask 
     */
    public void setTransTextTask(SmartSubtitleTaskTransTextResult TransTextTask) {
        this.TransTextTask = TransTextTask;
    }

    /**
     * Get  
     * @return PureSubtitleTransTask 
     */
    public PureSubtitleTransResult getPureSubtitleTransTask() {
        return this.PureSubtitleTransTask;
    }

    /**
     * Set 
     * @param PureSubtitleTransTask 
     */
    public void setPureSubtitleTransTask(PureSubtitleTransResult PureSubtitleTransTask) {
        this.PureSubtitleTransTask = PureSubtitleTransTask;
    }

    /**
     * Get  
     * @return OcrFullTextTask 
     */
    public SmartSubtitleTaskFullTextResult getOcrFullTextTask() {
        return this.OcrFullTextTask;
    }

    /**
     * Set 
     * @param OcrFullTextTask 
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

