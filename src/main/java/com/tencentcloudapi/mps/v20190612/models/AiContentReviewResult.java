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
<li>Porn: image porn detection.</li>
<li>Terrorism: sensitive image</li>
<li>Political: sensitive image</li>
<li>Porn.Asr: ASR text-based porn detection</li>
<li>Porn.Ocr: OCR text-based porn detection</li>
<li>Political.Asr: ASR text sensitive</li>
<li>Political.Ocr: OCR text sensitivity</li>
<li>Terrorism.Ocr: OCR text sensitivity</li>
<li>Prohibited.Asr: ASR text prohibited information recognition</li>
<li>Prohibited.Ocr: OCR text prohibited information recognition</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Sampling frequency, i.e., the number of frames captured per second from the video for review.
    */
    @SerializedName("SampleRate")
    @Expose
    private Float SampleRate;

    /**
    * Video duration reviewed, in seconds.
    */
    @SerializedName("Duration")
    @Expose
    private Float Duration;

    /**
    * Query result of the intelligent porn detection in image task for video content review. Valid when the task type is Porn.
    */
    @SerializedName("PornTask")
    @Expose
    private AiReviewTaskPornResult PornTask;

    /**
    * Query result of sensitive tasks for intelligent screen in video content review. Valid when the task type is `Terrorism`.
    */
    @SerializedName("TerrorismTask")
    @Expose
    private AiReviewTaskTerrorismResult TerrorismTask;

    /**
    * Query result of sensitive tasks for intelligent screen in video content review. Valid when the task type is Political.
    */
    @SerializedName("PoliticalTask")
    @Expose
    private AiReviewTaskPoliticalResult PoliticalTask;

    /**
    * Query result of the ASR text pornography detection task for video content review. Valid when TaskType is Porn.Asr.
    */
    @SerializedName("PornAsrTask")
    @Expose
    private AiReviewTaskPornAsrResult PornAsrTask;

    /**
    * Query result of the OCR text pornography detection task for video content review. Valid when the task type is Porn.Ocr.
    */
    @SerializedName("PornOcrTask")
    @Expose
    private AiReviewTaskPornOcrResult PornOcrTask;

    /**
    * Query result of the sensitive task for ASR text in video content review. Valid when the task type is Political.Asr.
    */
    @SerializedName("PoliticalAsrTask")
    @Expose
    private AiReviewTaskPoliticalAsrResult PoliticalAsrTask;

    /**
    * Query result of sensitive tasks for OCR text in video content review. Valid when the task type is Political.Ocr.
    */
    @SerializedName("PoliticalOcrTask")
    @Expose
    private AiReviewTaskPoliticalOcrResult PoliticalOcrTask;

    /**
    * Query result of the OCR text sensitive task for video content review. Valid when the task type is Terrorism.Ocr.
    */
    @SerializedName("TerrorismOcrTask")
    @Expose
    private AiReviewTaskTerrorismOcrResult TerrorismOcrTask;

    /**
    * Query result of the ASR text prohibited content detection task for video content review. Valid when TaskType is Prohibited.Asr.
    */
    @SerializedName("ProhibitedAsrTask")
    @Expose
    private AiReviewTaskProhibitedAsrResult ProhibitedAsrTask;

    /**
    * Query result of the OCR text prohibited content detection task for video content review. Valid when the task type is Prohibited.Ocr.
    */
    @SerializedName("ProhibitedOcrTask")
    @Expose
    private AiReviewTaskProhibitedOcrResult ProhibitedOcrTask;

    /**
     * Get Task type. Valid values:
<li>Porn: image porn detection.</li>
<li>Terrorism: sensitive image</li>
<li>Political: sensitive image</li>
<li>Porn.Asr: ASR text-based porn detection</li>
<li>Porn.Ocr: OCR text-based porn detection</li>
<li>Political.Asr: ASR text sensitive</li>
<li>Political.Ocr: OCR text sensitivity</li>
<li>Terrorism.Ocr: OCR text sensitivity</li>
<li>Prohibited.Asr: ASR text prohibited information recognition</li>
<li>Prohibited.Ocr: OCR text prohibited information recognition</li> 
     * @return Type Task type. Valid values:
<li>Porn: image porn detection.</li>
<li>Terrorism: sensitive image</li>
<li>Political: sensitive image</li>
<li>Porn.Asr: ASR text-based porn detection</li>
<li>Porn.Ocr: OCR text-based porn detection</li>
<li>Political.Asr: ASR text sensitive</li>
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
<li>Porn: image porn detection.</li>
<li>Terrorism: sensitive image</li>
<li>Political: sensitive image</li>
<li>Porn.Asr: ASR text-based porn detection</li>
<li>Porn.Ocr: OCR text-based porn detection</li>
<li>Political.Asr: ASR text sensitive</li>
<li>Political.Ocr: OCR text sensitivity</li>
<li>Terrorism.Ocr: OCR text sensitivity</li>
<li>Prohibited.Asr: ASR text prohibited information recognition</li>
<li>Prohibited.Ocr: OCR text prohibited information recognition</li>
     * @param Type Task type. Valid values:
<li>Porn: image porn detection.</li>
<li>Terrorism: sensitive image</li>
<li>Political: sensitive image</li>
<li>Porn.Asr: ASR text-based porn detection</li>
<li>Porn.Ocr: OCR text-based porn detection</li>
<li>Political.Asr: ASR text sensitive</li>
<li>Political.Ocr: OCR text sensitivity</li>
<li>Terrorism.Ocr: OCR text sensitivity</li>
<li>Prohibited.Asr: ASR text prohibited information recognition</li>
<li>Prohibited.Ocr: OCR text prohibited information recognition</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Sampling frequency, i.e., the number of frames captured per second from the video for review. 
     * @return SampleRate Sampling frequency, i.e., the number of frames captured per second from the video for review.
     */
    public Float getSampleRate() {
        return this.SampleRate;
    }

    /**
     * Set Sampling frequency, i.e., the number of frames captured per second from the video for review.
     * @param SampleRate Sampling frequency, i.e., the number of frames captured per second from the video for review.
     */
    public void setSampleRate(Float SampleRate) {
        this.SampleRate = SampleRate;
    }

    /**
     * Get Video duration reviewed, in seconds. 
     * @return Duration Video duration reviewed, in seconds.
     */
    public Float getDuration() {
        return this.Duration;
    }

    /**
     * Set Video duration reviewed, in seconds.
     * @param Duration Video duration reviewed, in seconds.
     */
    public void setDuration(Float Duration) {
        this.Duration = Duration;
    }

    /**
     * Get Query result of the intelligent porn detection in image task for video content review. Valid when the task type is Porn. 
     * @return PornTask Query result of the intelligent porn detection in image task for video content review. Valid when the task type is Porn.
     */
    public AiReviewTaskPornResult getPornTask() {
        return this.PornTask;
    }

    /**
     * Set Query result of the intelligent porn detection in image task for video content review. Valid when the task type is Porn.
     * @param PornTask Query result of the intelligent porn detection in image task for video content review. Valid when the task type is Porn.
     */
    public void setPornTask(AiReviewTaskPornResult PornTask) {
        this.PornTask = PornTask;
    }

    /**
     * Get Query result of sensitive tasks for intelligent screen in video content review. Valid when the task type is `Terrorism`. 
     * @return TerrorismTask Query result of sensitive tasks for intelligent screen in video content review. Valid when the task type is `Terrorism`.
     */
    public AiReviewTaskTerrorismResult getTerrorismTask() {
        return this.TerrorismTask;
    }

    /**
     * Set Query result of sensitive tasks for intelligent screen in video content review. Valid when the task type is `Terrorism`.
     * @param TerrorismTask Query result of sensitive tasks for intelligent screen in video content review. Valid when the task type is `Terrorism`.
     */
    public void setTerrorismTask(AiReviewTaskTerrorismResult TerrorismTask) {
        this.TerrorismTask = TerrorismTask;
    }

    /**
     * Get Query result of sensitive tasks for intelligent screen in video content review. Valid when the task type is Political. 
     * @return PoliticalTask Query result of sensitive tasks for intelligent screen in video content review. Valid when the task type is Political.
     */
    public AiReviewTaskPoliticalResult getPoliticalTask() {
        return this.PoliticalTask;
    }

    /**
     * Set Query result of sensitive tasks for intelligent screen in video content review. Valid when the task type is Political.
     * @param PoliticalTask Query result of sensitive tasks for intelligent screen in video content review. Valid when the task type is Political.
     */
    public void setPoliticalTask(AiReviewTaskPoliticalResult PoliticalTask) {
        this.PoliticalTask = PoliticalTask;
    }

    /**
     * Get Query result of the ASR text pornography detection task for video content review. Valid when TaskType is Porn.Asr. 
     * @return PornAsrTask Query result of the ASR text pornography detection task for video content review. Valid when TaskType is Porn.Asr.
     */
    public AiReviewTaskPornAsrResult getPornAsrTask() {
        return this.PornAsrTask;
    }

    /**
     * Set Query result of the ASR text pornography detection task for video content review. Valid when TaskType is Porn.Asr.
     * @param PornAsrTask Query result of the ASR text pornography detection task for video content review. Valid when TaskType is Porn.Asr.
     */
    public void setPornAsrTask(AiReviewTaskPornAsrResult PornAsrTask) {
        this.PornAsrTask = PornAsrTask;
    }

    /**
     * Get Query result of the OCR text pornography detection task for video content review. Valid when the task type is Porn.Ocr. 
     * @return PornOcrTask Query result of the OCR text pornography detection task for video content review. Valid when the task type is Porn.Ocr.
     */
    public AiReviewTaskPornOcrResult getPornOcrTask() {
        return this.PornOcrTask;
    }

    /**
     * Set Query result of the OCR text pornography detection task for video content review. Valid when the task type is Porn.Ocr.
     * @param PornOcrTask Query result of the OCR text pornography detection task for video content review. Valid when the task type is Porn.Ocr.
     */
    public void setPornOcrTask(AiReviewTaskPornOcrResult PornOcrTask) {
        this.PornOcrTask = PornOcrTask;
    }

    /**
     * Get Query result of the sensitive task for ASR text in video content review. Valid when the task type is Political.Asr. 
     * @return PoliticalAsrTask Query result of the sensitive task for ASR text in video content review. Valid when the task type is Political.Asr.
     */
    public AiReviewTaskPoliticalAsrResult getPoliticalAsrTask() {
        return this.PoliticalAsrTask;
    }

    /**
     * Set Query result of the sensitive task for ASR text in video content review. Valid when the task type is Political.Asr.
     * @param PoliticalAsrTask Query result of the sensitive task for ASR text in video content review. Valid when the task type is Political.Asr.
     */
    public void setPoliticalAsrTask(AiReviewTaskPoliticalAsrResult PoliticalAsrTask) {
        this.PoliticalAsrTask = PoliticalAsrTask;
    }

    /**
     * Get Query result of sensitive tasks for OCR text in video content review. Valid when the task type is Political.Ocr. 
     * @return PoliticalOcrTask Query result of sensitive tasks for OCR text in video content review. Valid when the task type is Political.Ocr.
     */
    public AiReviewTaskPoliticalOcrResult getPoliticalOcrTask() {
        return this.PoliticalOcrTask;
    }

    /**
     * Set Query result of sensitive tasks for OCR text in video content review. Valid when the task type is Political.Ocr.
     * @param PoliticalOcrTask Query result of sensitive tasks for OCR text in video content review. Valid when the task type is Political.Ocr.
     */
    public void setPoliticalOcrTask(AiReviewTaskPoliticalOcrResult PoliticalOcrTask) {
        this.PoliticalOcrTask = PoliticalOcrTask;
    }

    /**
     * Get Query result of the OCR text sensitive task for video content review. Valid when the task type is Terrorism.Ocr. 
     * @return TerrorismOcrTask Query result of the OCR text sensitive task for video content review. Valid when the task type is Terrorism.Ocr.
     */
    public AiReviewTaskTerrorismOcrResult getTerrorismOcrTask() {
        return this.TerrorismOcrTask;
    }

    /**
     * Set Query result of the OCR text sensitive task for video content review. Valid when the task type is Terrorism.Ocr.
     * @param TerrorismOcrTask Query result of the OCR text sensitive task for video content review. Valid when the task type is Terrorism.Ocr.
     */
    public void setTerrorismOcrTask(AiReviewTaskTerrorismOcrResult TerrorismOcrTask) {
        this.TerrorismOcrTask = TerrorismOcrTask;
    }

    /**
     * Get Query result of the ASR text prohibited content detection task for video content review. Valid when TaskType is Prohibited.Asr. 
     * @return ProhibitedAsrTask Query result of the ASR text prohibited content detection task for video content review. Valid when TaskType is Prohibited.Asr.
     */
    public AiReviewTaskProhibitedAsrResult getProhibitedAsrTask() {
        return this.ProhibitedAsrTask;
    }

    /**
     * Set Query result of the ASR text prohibited content detection task for video content review. Valid when TaskType is Prohibited.Asr.
     * @param ProhibitedAsrTask Query result of the ASR text prohibited content detection task for video content review. Valid when TaskType is Prohibited.Asr.
     */
    public void setProhibitedAsrTask(AiReviewTaskProhibitedAsrResult ProhibitedAsrTask) {
        this.ProhibitedAsrTask = ProhibitedAsrTask;
    }

    /**
     * Get Query result of the OCR text prohibited content detection task for video content review. Valid when the task type is Prohibited.Ocr. 
     * @return ProhibitedOcrTask Query result of the OCR text prohibited content detection task for video content review. Valid when the task type is Prohibited.Ocr.
     */
    public AiReviewTaskProhibitedOcrResult getProhibitedOcrTask() {
        return this.ProhibitedOcrTask;
    }

    /**
     * Set Query result of the OCR text prohibited content detection task for video content review. Valid when the task type is Prohibited.Ocr.
     * @param ProhibitedOcrTask Query result of the OCR text prohibited content detection task for video content review. Valid when the task type is Prohibited.Ocr.
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

