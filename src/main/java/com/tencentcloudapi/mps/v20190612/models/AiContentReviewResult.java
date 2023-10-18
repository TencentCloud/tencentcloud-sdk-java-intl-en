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

public class AiContentReviewResult extends AbstractModel {

    /**
    * Task type. Valid values:
<li>Porn (in images)</li>
<li>Terrorism (in images)</li>
<li>Political (in images)</li>
<li>Porn.Asr</li>
<li>Porn.Ocr</li>
<li>Political.Asr</li>
<li>Political.Ocr</li>
<li>Terrorism.Ocr</li>
<li>Prohibited.Asr</li>
<li>Prohibited.Ocr</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Sample rate, which indicates the number of video frames captured per second for audit
    */
    @SerializedName("SampleRate")
    @Expose
    private Float SampleRate;

    /**
    * Audited video duration in seconds.
    */
    @SerializedName("Duration")
    @Expose
    private Float Duration;

    /**
    * Query result of an intelligent porn information detection in image task in video content audit, which is valid when task type is `Porn`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PornTask")
    @Expose
    private AiReviewTaskPornResult PornTask;

    /**
    * The result of detecting terrorism content in images, which is valid when the task type is `Terrorism`.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("TerrorismTask")
    @Expose
    private AiReviewTaskTerrorismResult TerrorismTask;

    /**
    * The result of detecting politically sensitive information in images, which is valid when the task type is `Political`.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("PoliticalTask")
    @Expose
    private AiReviewTaskPoliticalResult PoliticalTask;

    /**
    * Query result of an ASR-based porn information detection in text task in video content audit, which is valid when task type is `Porn.Asr`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PornAsrTask")
    @Expose
    private AiReviewTaskPornAsrResult PornAsrTask;

    /**
    * Query result of an OCR-based porn information detection in text task in video content audit, which is valid when task type is `Porn.Ocr`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PornOcrTask")
    @Expose
    private AiReviewTaskPornOcrResult PornOcrTask;

    /**
    * The result of detecting politically sensitive information based on ASR, which is valid when the task type is `Political.Asr`.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("PoliticalAsrTask")
    @Expose
    private AiReviewTaskPoliticalAsrResult PoliticalAsrTask;

    /**
    * The result of detecting politically sensitive information based on OCR, which is valid when the task type is `Political.Ocr`.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("PoliticalOcrTask")
    @Expose
    private AiReviewTaskPoliticalOcrResult PoliticalOcrTask;

    /**
    * The result of detecting terrorism content based on OCR, which is valid when task type is `Terrorism.Ocr`.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("TerrorismOcrTask")
    @Expose
    private AiReviewTaskTerrorismOcrResult TerrorismOcrTask;

    /**
    * Query result of ASR-based prohibited information detection in speech task in video content audit, which is valid if task type is `Prohibited.Asr`.
    */
    @SerializedName("ProhibitedAsrTask")
    @Expose
    private AiReviewTaskProhibitedAsrResult ProhibitedAsrTask;

    /**
    * Query result of OCR-based prohibited information detection in text task in video content audit, which is valid if task type is `Prohibited.Ocr`.
    */
    @SerializedName("ProhibitedOcrTask")
    @Expose
    private AiReviewTaskProhibitedOcrResult ProhibitedOcrTask;

    /**
     * Get Task type. Valid values:
<li>Porn (in images)</li>
<li>Terrorism (in images)</li>
<li>Political (in images)</li>
<li>Porn.Asr</li>
<li>Porn.Ocr</li>
<li>Political.Asr</li>
<li>Political.Ocr</li>
<li>Terrorism.Ocr</li>
<li>Prohibited.Asr</li>
<li>Prohibited.Ocr</li> 
     * @return Type Task type. Valid values:
<li>Porn (in images)</li>
<li>Terrorism (in images)</li>
<li>Political (in images)</li>
<li>Porn.Asr</li>
<li>Porn.Ocr</li>
<li>Political.Asr</li>
<li>Political.Ocr</li>
<li>Terrorism.Ocr</li>
<li>Prohibited.Asr</li>
<li>Prohibited.Ocr</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Task type. Valid values:
<li>Porn (in images)</li>
<li>Terrorism (in images)</li>
<li>Political (in images)</li>
<li>Porn.Asr</li>
<li>Porn.Ocr</li>
<li>Political.Asr</li>
<li>Political.Ocr</li>
<li>Terrorism.Ocr</li>
<li>Prohibited.Asr</li>
<li>Prohibited.Ocr</li>
     * @param Type Task type. Valid values:
<li>Porn (in images)</li>
<li>Terrorism (in images)</li>
<li>Political (in images)</li>
<li>Porn.Asr</li>
<li>Porn.Ocr</li>
<li>Political.Asr</li>
<li>Political.Ocr</li>
<li>Terrorism.Ocr</li>
<li>Prohibited.Asr</li>
<li>Prohibited.Ocr</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Sample rate, which indicates the number of video frames captured per second for audit 
     * @return SampleRate Sample rate, which indicates the number of video frames captured per second for audit
     */
    public Float getSampleRate() {
        return this.SampleRate;
    }

    /**
     * Set Sample rate, which indicates the number of video frames captured per second for audit
     * @param SampleRate Sample rate, which indicates the number of video frames captured per second for audit
     */
    public void setSampleRate(Float SampleRate) {
        this.SampleRate = SampleRate;
    }

    /**
     * Get Audited video duration in seconds. 
     * @return Duration Audited video duration in seconds.
     */
    public Float getDuration() {
        return this.Duration;
    }

    /**
     * Set Audited video duration in seconds.
     * @param Duration Audited video duration in seconds.
     */
    public void setDuration(Float Duration) {
        this.Duration = Duration;
    }

    /**
     * Get Query result of an intelligent porn information detection in image task in video content audit, which is valid when task type is `Porn`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PornTask Query result of an intelligent porn information detection in image task in video content audit, which is valid when task type is `Porn`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AiReviewTaskPornResult getPornTask() {
        return this.PornTask;
    }

    /**
     * Set Query result of an intelligent porn information detection in image task in video content audit, which is valid when task type is `Porn`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PornTask Query result of an intelligent porn information detection in image task in video content audit, which is valid when task type is `Porn`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPornTask(AiReviewTaskPornResult PornTask) {
        this.PornTask = PornTask;
    }

    /**
     * Get The result of detecting terrorism content in images, which is valid when the task type is `Terrorism`.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return TerrorismTask The result of detecting terrorism content in images, which is valid when the task type is `Terrorism`.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public AiReviewTaskTerrorismResult getTerrorismTask() {
        return this.TerrorismTask;
    }

    /**
     * Set The result of detecting terrorism content in images, which is valid when the task type is `Terrorism`.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param TerrorismTask The result of detecting terrorism content in images, which is valid when the task type is `Terrorism`.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setTerrorismTask(AiReviewTaskTerrorismResult TerrorismTask) {
        this.TerrorismTask = TerrorismTask;
    }

    /**
     * Get The result of detecting politically sensitive information in images, which is valid when the task type is `Political`.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return PoliticalTask The result of detecting politically sensitive information in images, which is valid when the task type is `Political`.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public AiReviewTaskPoliticalResult getPoliticalTask() {
        return this.PoliticalTask;
    }

    /**
     * Set The result of detecting politically sensitive information in images, which is valid when the task type is `Political`.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param PoliticalTask The result of detecting politically sensitive information in images, which is valid when the task type is `Political`.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setPoliticalTask(AiReviewTaskPoliticalResult PoliticalTask) {
        this.PoliticalTask = PoliticalTask;
    }

    /**
     * Get Query result of an ASR-based porn information detection in text task in video content audit, which is valid when task type is `Porn.Asr`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PornAsrTask Query result of an ASR-based porn information detection in text task in video content audit, which is valid when task type is `Porn.Asr`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AiReviewTaskPornAsrResult getPornAsrTask() {
        return this.PornAsrTask;
    }

    /**
     * Set Query result of an ASR-based porn information detection in text task in video content audit, which is valid when task type is `Porn.Asr`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PornAsrTask Query result of an ASR-based porn information detection in text task in video content audit, which is valid when task type is `Porn.Asr`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPornAsrTask(AiReviewTaskPornAsrResult PornAsrTask) {
        this.PornAsrTask = PornAsrTask;
    }

    /**
     * Get Query result of an OCR-based porn information detection in text task in video content audit, which is valid when task type is `Porn.Ocr`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PornOcrTask Query result of an OCR-based porn information detection in text task in video content audit, which is valid when task type is `Porn.Ocr`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AiReviewTaskPornOcrResult getPornOcrTask() {
        return this.PornOcrTask;
    }

    /**
     * Set Query result of an OCR-based porn information detection in text task in video content audit, which is valid when task type is `Porn.Ocr`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PornOcrTask Query result of an OCR-based porn information detection in text task in video content audit, which is valid when task type is `Porn.Ocr`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPornOcrTask(AiReviewTaskPornOcrResult PornOcrTask) {
        this.PornOcrTask = PornOcrTask;
    }

    /**
     * Get The result of detecting politically sensitive information based on ASR, which is valid when the task type is `Political.Asr`.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return PoliticalAsrTask The result of detecting politically sensitive information based on ASR, which is valid when the task type is `Political.Asr`.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public AiReviewTaskPoliticalAsrResult getPoliticalAsrTask() {
        return this.PoliticalAsrTask;
    }

    /**
     * Set The result of detecting politically sensitive information based on ASR, which is valid when the task type is `Political.Asr`.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param PoliticalAsrTask The result of detecting politically sensitive information based on ASR, which is valid when the task type is `Political.Asr`.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setPoliticalAsrTask(AiReviewTaskPoliticalAsrResult PoliticalAsrTask) {
        this.PoliticalAsrTask = PoliticalAsrTask;
    }

    /**
     * Get The result of detecting politically sensitive information based on OCR, which is valid when the task type is `Political.Ocr`.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return PoliticalOcrTask The result of detecting politically sensitive information based on OCR, which is valid when the task type is `Political.Ocr`.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public AiReviewTaskPoliticalOcrResult getPoliticalOcrTask() {
        return this.PoliticalOcrTask;
    }

    /**
     * Set The result of detecting politically sensitive information based on OCR, which is valid when the task type is `Political.Ocr`.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param PoliticalOcrTask The result of detecting politically sensitive information based on OCR, which is valid when the task type is `Political.Ocr`.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setPoliticalOcrTask(AiReviewTaskPoliticalOcrResult PoliticalOcrTask) {
        this.PoliticalOcrTask = PoliticalOcrTask;
    }

    /**
     * Get The result of detecting terrorism content based on OCR, which is valid when task type is `Terrorism.Ocr`.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return TerrorismOcrTask The result of detecting terrorism content based on OCR, which is valid when task type is `Terrorism.Ocr`.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public AiReviewTaskTerrorismOcrResult getTerrorismOcrTask() {
        return this.TerrorismOcrTask;
    }

    /**
     * Set The result of detecting terrorism content based on OCR, which is valid when task type is `Terrorism.Ocr`.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param TerrorismOcrTask The result of detecting terrorism content based on OCR, which is valid when task type is `Terrorism.Ocr`.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setTerrorismOcrTask(AiReviewTaskTerrorismOcrResult TerrorismOcrTask) {
        this.TerrorismOcrTask = TerrorismOcrTask;
    }

    /**
     * Get Query result of ASR-based prohibited information detection in speech task in video content audit, which is valid if task type is `Prohibited.Asr`. 
     * @return ProhibitedAsrTask Query result of ASR-based prohibited information detection in speech task in video content audit, which is valid if task type is `Prohibited.Asr`.
     */
    public AiReviewTaskProhibitedAsrResult getProhibitedAsrTask() {
        return this.ProhibitedAsrTask;
    }

    /**
     * Set Query result of ASR-based prohibited information detection in speech task in video content audit, which is valid if task type is `Prohibited.Asr`.
     * @param ProhibitedAsrTask Query result of ASR-based prohibited information detection in speech task in video content audit, which is valid if task type is `Prohibited.Asr`.
     */
    public void setProhibitedAsrTask(AiReviewTaskProhibitedAsrResult ProhibitedAsrTask) {
        this.ProhibitedAsrTask = ProhibitedAsrTask;
    }

    /**
     * Get Query result of OCR-based prohibited information detection in text task in video content audit, which is valid if task type is `Prohibited.Ocr`. 
     * @return ProhibitedOcrTask Query result of OCR-based prohibited information detection in text task in video content audit, which is valid if task type is `Prohibited.Ocr`.
     */
    public AiReviewTaskProhibitedOcrResult getProhibitedOcrTask() {
        return this.ProhibitedOcrTask;
    }

    /**
     * Set Query result of OCR-based prohibited information detection in text task in video content audit, which is valid if task type is `Prohibited.Ocr`.
     * @param ProhibitedOcrTask Query result of OCR-based prohibited information detection in text task in video content audit, which is valid if task type is `Prohibited.Ocr`.
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

