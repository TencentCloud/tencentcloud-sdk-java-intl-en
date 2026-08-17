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

public class AiContentReviewResult extends AbstractModel {

    /**
    * Task type. Valid values:
<li>Porn: porn detection.</li>
<li>Terrorism: sensitive image.</li>
<li>Political: sensitive image.</li>
<li>Porn.Asr: Pornography detection in ASR text</li>
<li>Porn.Ocr: Pornography detection in OCR text</li>
<li>Political.Asr: ASR text sensitivity</li>
<li>Political.Ocr: OCR text sensitivity</li>
<li>Terrorism.Ocr: OCR text sensitivity</li>
<li>Prohibited.Asr: ASR text prohibited information recognition</li>
<li>Prohibited.Ocr: OCR text prohibited information recognition</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Sampling frequency, i.e., the number of frames captured per second for video review.
    */
    @SerializedName("SampleRate")
    @Expose
    private Float SampleRate;

    /**
    * Video duration for review, in seconds.
    */
    @SerializedName("Duration")
    @Expose
    private Float Duration;

    /**
    * 
    */
    @SerializedName("PornTask")
    @Expose
    private AiReviewTaskPornResult PornTask;

    /**
    * 
    */
    @SerializedName("TerrorismTask")
    @Expose
    private AiReviewTaskTerrorismResult TerrorismTask;

    /**
    * 
    */
    @SerializedName("PoliticalTask")
    @Expose
    private AiReviewTaskPoliticalResult PoliticalTask;

    /**
    * 
    */
    @SerializedName("PornAsrTask")
    @Expose
    private AiReviewTaskPornAsrResult PornAsrTask;

    /**
    * 
    */
    @SerializedName("PornOcrTask")
    @Expose
    private AiReviewTaskPornOcrResult PornOcrTask;

    /**
    * 
    */
    @SerializedName("PoliticalAsrTask")
    @Expose
    private AiReviewTaskPoliticalAsrResult PoliticalAsrTask;

    /**
    * 
    */
    @SerializedName("PoliticalOcrTask")
    @Expose
    private AiReviewTaskPoliticalOcrResult PoliticalOcrTask;

    /**
    * 
    */
    @SerializedName("TerrorismOcrTask")
    @Expose
    private AiReviewTaskTerrorismOcrResult TerrorismOcrTask;

    /**
    * 
    */
    @SerializedName("ProhibitedAsrTask")
    @Expose
    private AiReviewTaskProhibitedAsrResult ProhibitedAsrTask;

    /**
    * 
    */
    @SerializedName("ProhibitedOcrTask")
    @Expose
    private AiReviewTaskProhibitedOcrResult ProhibitedOcrTask;

    /**
     * Get Task type. Valid values:
<li>Porn: porn detection.</li>
<li>Terrorism: sensitive image.</li>
<li>Political: sensitive image.</li>
<li>Porn.Asr: Pornography detection in ASR text</li>
<li>Porn.Ocr: Pornography detection in OCR text</li>
<li>Political.Asr: ASR text sensitivity</li>
<li>Political.Ocr: OCR text sensitivity</li>
<li>Terrorism.Ocr: OCR text sensitivity</li>
<li>Prohibited.Asr: ASR text prohibited information recognition</li>
<li>Prohibited.Ocr: OCR text prohibited information recognition</li> 
     * @return Type Task type. Valid values:
<li>Porn: porn detection.</li>
<li>Terrorism: sensitive image.</li>
<li>Political: sensitive image.</li>
<li>Porn.Asr: Pornography detection in ASR text</li>
<li>Porn.Ocr: Pornography detection in OCR text</li>
<li>Political.Asr: ASR text sensitivity</li>
<li>Political.Ocr: OCR text sensitivity</li>
<li>Terrorism.Ocr: OCR text sensitivity</li>
<li>Prohibited.Asr: ASR text prohibited information recognition</li>
<li>Prohibited.Ocr: OCR text prohibited information recognition</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Task type. Valid values:
<li>Porn: porn detection.</li>
<li>Terrorism: sensitive image.</li>
<li>Political: sensitive image.</li>
<li>Porn.Asr: Pornography detection in ASR text</li>
<li>Porn.Ocr: Pornography detection in OCR text</li>
<li>Political.Asr: ASR text sensitivity</li>
<li>Political.Ocr: OCR text sensitivity</li>
<li>Terrorism.Ocr: OCR text sensitivity</li>
<li>Prohibited.Asr: ASR text prohibited information recognition</li>
<li>Prohibited.Ocr: OCR text prohibited information recognition</li>
     * @param Type Task type. Valid values:
<li>Porn: porn detection.</li>
<li>Terrorism: sensitive image.</li>
<li>Political: sensitive image.</li>
<li>Porn.Asr: Pornography detection in ASR text</li>
<li>Porn.Ocr: Pornography detection in OCR text</li>
<li>Political.Asr: ASR text sensitivity</li>
<li>Political.Ocr: OCR text sensitivity</li>
<li>Terrorism.Ocr: OCR text sensitivity</li>
<li>Prohibited.Asr: ASR text prohibited information recognition</li>
<li>Prohibited.Ocr: OCR text prohibited information recognition</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Sampling frequency, i.e., the number of frames captured per second for video review. 
     * @return SampleRate Sampling frequency, i.e., the number of frames captured per second for video review.
     */
    public Float getSampleRate() {
        return this.SampleRate;
    }

    /**
     * Set Sampling frequency, i.e., the number of frames captured per second for video review.
     * @param SampleRate Sampling frequency, i.e., the number of frames captured per second for video review.
     */
    public void setSampleRate(Float SampleRate) {
        this.SampleRate = SampleRate;
    }

    /**
     * Get Video duration for review, in seconds. 
     * @return Duration Video duration for review, in seconds.
     */
    public Float getDuration() {
        return this.Duration;
    }

    /**
     * Set Video duration for review, in seconds.
     * @param Duration Video duration for review, in seconds.
     */
    public void setDuration(Float Duration) {
        this.Duration = Duration;
    }

    /**
     * Get  
     * @return PornTask 
     */
    public AiReviewTaskPornResult getPornTask() {
        return this.PornTask;
    }

    /**
     * Set 
     * @param PornTask 
     */
    public void setPornTask(AiReviewTaskPornResult PornTask) {
        this.PornTask = PornTask;
    }

    /**
     * Get  
     * @return TerrorismTask 
     */
    public AiReviewTaskTerrorismResult getTerrorismTask() {
        return this.TerrorismTask;
    }

    /**
     * Set 
     * @param TerrorismTask 
     */
    public void setTerrorismTask(AiReviewTaskTerrorismResult TerrorismTask) {
        this.TerrorismTask = TerrorismTask;
    }

    /**
     * Get  
     * @return PoliticalTask 
     */
    public AiReviewTaskPoliticalResult getPoliticalTask() {
        return this.PoliticalTask;
    }

    /**
     * Set 
     * @param PoliticalTask 
     */
    public void setPoliticalTask(AiReviewTaskPoliticalResult PoliticalTask) {
        this.PoliticalTask = PoliticalTask;
    }

    /**
     * Get  
     * @return PornAsrTask 
     */
    public AiReviewTaskPornAsrResult getPornAsrTask() {
        return this.PornAsrTask;
    }

    /**
     * Set 
     * @param PornAsrTask 
     */
    public void setPornAsrTask(AiReviewTaskPornAsrResult PornAsrTask) {
        this.PornAsrTask = PornAsrTask;
    }

    /**
     * Get  
     * @return PornOcrTask 
     */
    public AiReviewTaskPornOcrResult getPornOcrTask() {
        return this.PornOcrTask;
    }

    /**
     * Set 
     * @param PornOcrTask 
     */
    public void setPornOcrTask(AiReviewTaskPornOcrResult PornOcrTask) {
        this.PornOcrTask = PornOcrTask;
    }

    /**
     * Get  
     * @return PoliticalAsrTask 
     */
    public AiReviewTaskPoliticalAsrResult getPoliticalAsrTask() {
        return this.PoliticalAsrTask;
    }

    /**
     * Set 
     * @param PoliticalAsrTask 
     */
    public void setPoliticalAsrTask(AiReviewTaskPoliticalAsrResult PoliticalAsrTask) {
        this.PoliticalAsrTask = PoliticalAsrTask;
    }

    /**
     * Get  
     * @return PoliticalOcrTask 
     */
    public AiReviewTaskPoliticalOcrResult getPoliticalOcrTask() {
        return this.PoliticalOcrTask;
    }

    /**
     * Set 
     * @param PoliticalOcrTask 
     */
    public void setPoliticalOcrTask(AiReviewTaskPoliticalOcrResult PoliticalOcrTask) {
        this.PoliticalOcrTask = PoliticalOcrTask;
    }

    /**
     * Get  
     * @return TerrorismOcrTask 
     */
    public AiReviewTaskTerrorismOcrResult getTerrorismOcrTask() {
        return this.TerrorismOcrTask;
    }

    /**
     * Set 
     * @param TerrorismOcrTask 
     */
    public void setTerrorismOcrTask(AiReviewTaskTerrorismOcrResult TerrorismOcrTask) {
        this.TerrorismOcrTask = TerrorismOcrTask;
    }

    /**
     * Get  
     * @return ProhibitedAsrTask 
     */
    public AiReviewTaskProhibitedAsrResult getProhibitedAsrTask() {
        return this.ProhibitedAsrTask;
    }

    /**
     * Set 
     * @param ProhibitedAsrTask 
     */
    public void setProhibitedAsrTask(AiReviewTaskProhibitedAsrResult ProhibitedAsrTask) {
        this.ProhibitedAsrTask = ProhibitedAsrTask;
    }

    /**
     * Get  
     * @return ProhibitedOcrTask 
     */
    public AiReviewTaskProhibitedOcrResult getProhibitedOcrTask() {
        return this.ProhibitedOcrTask;
    }

    /**
     * Set 
     * @param ProhibitedOcrTask 
     */
    public void setProhibitedOcrTask(AiReviewTaskProhibitedOcrResult ProhibitedOcrTask) {
        this.ProhibitedOcrTask = ProhibitedOcrTask;
    }

    public AiContentReviewResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiContentReviewResult(AiContentReviewResult source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.SampleRate != null) {
            this.SampleRate = new Float(source.SampleRate);
        }
        if (source.Duration != null) {
            this.Duration = new Float(source.Duration);
        }
        if (source.PornTask != null) {
            this.PornTask = new AiReviewTaskPornResult(source.PornTask);
        }
        if (source.TerrorismTask != null) {
            this.TerrorismTask = new AiReviewTaskTerrorismResult(source.TerrorismTask);
        }
        if (source.PoliticalTask != null) {
            this.PoliticalTask = new AiReviewTaskPoliticalResult(source.PoliticalTask);
        }
        if (source.PornAsrTask != null) {
            this.PornAsrTask = new AiReviewTaskPornAsrResult(source.PornAsrTask);
        }
        if (source.PornOcrTask != null) {
            this.PornOcrTask = new AiReviewTaskPornOcrResult(source.PornOcrTask);
        }
        if (source.PoliticalAsrTask != null) {
            this.PoliticalAsrTask = new AiReviewTaskPoliticalAsrResult(source.PoliticalAsrTask);
        }
        if (source.PoliticalOcrTask != null) {
            this.PoliticalOcrTask = new AiReviewTaskPoliticalOcrResult(source.PoliticalOcrTask);
        }
        if (source.TerrorismOcrTask != null) {
            this.TerrorismOcrTask = new AiReviewTaskTerrorismOcrResult(source.TerrorismOcrTask);
        }
        if (source.ProhibitedAsrTask != null) {
            this.ProhibitedAsrTask = new AiReviewTaskProhibitedAsrResult(source.ProhibitedAsrTask);
        }
        if (source.ProhibitedOcrTask != null) {
            this.ProhibitedOcrTask = new AiReviewTaskProhibitedOcrResult(source.ProhibitedOcrTask);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "SampleRate", this.SampleRate);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamObj(map, prefix + "PornTask.", this.PornTask);
        this.setParamObj(map, prefix + "TerrorismTask.", this.TerrorismTask);
        this.setParamObj(map, prefix + "PoliticalTask.", this.PoliticalTask);
        this.setParamObj(map, prefix + "PornAsrTask.", this.PornAsrTask);
        this.setParamObj(map, prefix + "PornOcrTask.", this.PornOcrTask);
        this.setParamObj(map, prefix + "PoliticalAsrTask.", this.PoliticalAsrTask);
        this.setParamObj(map, prefix + "PoliticalOcrTask.", this.PoliticalOcrTask);
        this.setParamObj(map, prefix + "TerrorismOcrTask.", this.TerrorismOcrTask);
        this.setParamObj(map, prefix + "ProhibitedAsrTask.", this.ProhibitedAsrTask);
        this.setParamObj(map, prefix + "ProhibitedOcrTask.", this.ProhibitedOcrTask);

    }
}

