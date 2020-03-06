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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AiContentReviewResult extends AbstractModel{

    /**
    * Task type. Valid values:
<li>Porn: Porn information detection in image</li>
<li>Terrorism: Terrorism information detection in image</li>
<li>Political: Politically sensitive information detection in image</li>
<li>Porn.Asr: ASR-based porn information detection in text</li>
<li>Porn.Ocr: OCR-based porn information detection in text</li>
<li>Porn.Voice: Porn information detection in speech</li>
<li>Political.Asr: ASR-based politically sensitive information detection in text</li>
<li>Political.Ocr: OCR-based politically sensitive information detection in text</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 
    */
    @SerializedName("SampleRate")
    @Expose
    private Float SampleRate;

    /**
    * 
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
    * Query result of an intelligent terrorism information detection in image task in video content audit, which is valid when task type is `Terrorism`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TerrorismTask")
    @Expose
    private AiReviewTaskTerrorismResult TerrorismTask;

    /**
    * Query result of an intelligent politically sensitive information detection in image task in video content audit, which is valid when task type is `Political`.
Note: This field may return null, indicating that no valid values can be obtained.
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
    * Query result of an ASR-based politically sensitive information detection in text task in video content audit, which is valid when task type is `Political.Asr`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PoliticalAsrTask")
    @Expose
    private AiReviewTaskPoliticalAsrResult PoliticalAsrTask;

    /**
    * Query result of an OCR-based politically sensitive information detection in text task in video content audit, which is valid when task type is `Political.Ocr`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PoliticalOcrTask")
    @Expose
    private AiReviewTaskPoliticalOcrResult PoliticalOcrTask;

    /**
     * Get Task type. Valid values:
<li>Porn: Porn information detection in image</li>
<li>Terrorism: Terrorism information detection in image</li>
<li>Political: Politically sensitive information detection in image</li>
<li>Porn.Asr: ASR-based porn information detection in text</li>
<li>Porn.Ocr: OCR-based porn information detection in text</li>
<li>Porn.Voice: Porn information detection in speech</li>
<li>Political.Asr: ASR-based politically sensitive information detection in text</li>
<li>Political.Ocr: OCR-based politically sensitive information detection in text</li> 
     * @return Type Task type. Valid values:
<li>Porn: Porn information detection in image</li>
<li>Terrorism: Terrorism information detection in image</li>
<li>Political: Politically sensitive information detection in image</li>
<li>Porn.Asr: ASR-based porn information detection in text</li>
<li>Porn.Ocr: OCR-based porn information detection in text</li>
<li>Porn.Voice: Porn information detection in speech</li>
<li>Political.Asr: ASR-based politically sensitive information detection in text</li>
<li>Political.Ocr: OCR-based politically sensitive information detection in text</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Task type. Valid values:
<li>Porn: Porn information detection in image</li>
<li>Terrorism: Terrorism information detection in image</li>
<li>Political: Politically sensitive information detection in image</li>
<li>Porn.Asr: ASR-based porn information detection in text</li>
<li>Porn.Ocr: OCR-based porn information detection in text</li>
<li>Porn.Voice: Porn information detection in speech</li>
<li>Political.Asr: ASR-based politically sensitive information detection in text</li>
<li>Political.Ocr: OCR-based politically sensitive information detection in text</li>
     * @param Type Task type. Valid values:
<li>Porn: Porn information detection in image</li>
<li>Terrorism: Terrorism information detection in image</li>
<li>Political: Politically sensitive information detection in image</li>
<li>Porn.Asr: ASR-based porn information detection in text</li>
<li>Porn.Ocr: OCR-based porn information detection in text</li>
<li>Porn.Voice: Porn information detection in speech</li>
<li>Political.Asr: ASR-based politically sensitive information detection in text</li>
<li>Political.Ocr: OCR-based politically sensitive information detection in text</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get  
     * @return SampleRate 
     */
    public Float getSampleRate() {
        return this.SampleRate;
    }

    /**
     * Set 
     * @param SampleRate 
     */
    public void setSampleRate(Float SampleRate) {
        this.SampleRate = SampleRate;
    }

    /**
     * Get  
     * @return Duration 
     */
    public Float getDuration() {
        return this.Duration;
    }

    /**
     * Set 
     * @param Duration 
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
     * Get Query result of an intelligent terrorism information detection in image task in video content audit, which is valid when task type is `Terrorism`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TerrorismTask Query result of an intelligent terrorism information detection in image task in video content audit, which is valid when task type is `Terrorism`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AiReviewTaskTerrorismResult getTerrorismTask() {
        return this.TerrorismTask;
    }

    /**
     * Set Query result of an intelligent terrorism information detection in image task in video content audit, which is valid when task type is `Terrorism`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TerrorismTask Query result of an intelligent terrorism information detection in image task in video content audit, which is valid when task type is `Terrorism`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTerrorismTask(AiReviewTaskTerrorismResult TerrorismTask) {
        this.TerrorismTask = TerrorismTask;
    }

    /**
     * Get Query result of an intelligent politically sensitive information detection in image task in video content audit, which is valid when task type is `Political`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PoliticalTask Query result of an intelligent politically sensitive information detection in image task in video content audit, which is valid when task type is `Political`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AiReviewTaskPoliticalResult getPoliticalTask() {
        return this.PoliticalTask;
    }

    /**
     * Set Query result of an intelligent politically sensitive information detection in image task in video content audit, which is valid when task type is `Political`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PoliticalTask Query result of an intelligent politically sensitive information detection in image task in video content audit, which is valid when task type is `Political`.
Note: This field may return null, indicating that no valid values can be obtained.
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
     * Get Query result of an ASR-based politically sensitive information detection in text task in video content audit, which is valid when task type is `Political.Asr`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PoliticalAsrTask Query result of an ASR-based politically sensitive information detection in text task in video content audit, which is valid when task type is `Political.Asr`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AiReviewTaskPoliticalAsrResult getPoliticalAsrTask() {
        return this.PoliticalAsrTask;
    }

    /**
     * Set Query result of an ASR-based politically sensitive information detection in text task in video content audit, which is valid when task type is `Political.Asr`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PoliticalAsrTask Query result of an ASR-based politically sensitive information detection in text task in video content audit, which is valid when task type is `Political.Asr`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPoliticalAsrTask(AiReviewTaskPoliticalAsrResult PoliticalAsrTask) {
        this.PoliticalAsrTask = PoliticalAsrTask;
    }

    /**
     * Get Query result of an OCR-based politically sensitive information detection in text task in video content audit, which is valid when task type is `Political.Ocr`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PoliticalOcrTask Query result of an OCR-based politically sensitive information detection in text task in video content audit, which is valid when task type is `Political.Ocr`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AiReviewTaskPoliticalOcrResult getPoliticalOcrTask() {
        return this.PoliticalOcrTask;
    }

    /**
     * Set Query result of an OCR-based politically sensitive information detection in text task in video content audit, which is valid when task type is `Political.Ocr`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PoliticalOcrTask Query result of an OCR-based politically sensitive information detection in text task in video content audit, which is valid when task type is `Political.Ocr`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPoliticalOcrTask(AiReviewTaskPoliticalOcrResult PoliticalOcrTask) {
        this.PoliticalOcrTask = PoliticalOcrTask;
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

    }
}

