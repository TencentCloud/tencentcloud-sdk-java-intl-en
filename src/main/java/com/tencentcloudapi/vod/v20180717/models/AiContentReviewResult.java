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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AiContentReviewResult extends AbstractModel {

    /**
    * Task type. Valid values:
<li>`Porn`: porn information recognition in images</li>
<li>`Terrorism`: terrorism information recognition in images</li>
<li>`Political`: politically sensitive information recognition in images</li>
<li>`Porn.Asr`: ASR-based porn information recognition in speech</li>
<li>`Porn.Ocr`: OCR-based porn information recognition in text</li>
<li>`Political.Asr`: ASR-based politically sensitive information recognition in speech</li>
<li>`Political.Ocr`: OCR-based politically sensitive information recognition in text</li>
<li>`Terrorism.Ocr`: OCR-based terrorism information recognition in text</li>
<li>`Prohibited.Asr`: ASR-based prohibited information recognition in speech</li>
<li>`Prohibited.Ocr`: OCR-based prohibited information recognition in text</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Result for intelligent recognition of pornographic content in images. This parameter is valid when `Type` is `Porn`.
Note: This field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("PornTask")
    @Expose
    private AiReviewTaskPornResult PornTask;

    /**
    * Result for intelligent recognition of terrorism content in images. This parameter is valid when `Type` is `Terrorism`.
Note: This field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("TerrorismTask")
    @Expose
    private AiReviewTaskTerrorismResult TerrorismTask;

    /**
    * Result for intelligent recognition of politically sensitive content in images. This parameter is valid when `Type` is `Political`.
Note: This field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("PoliticalTask")
    @Expose
    private AiReviewTaskPoliticalResult PoliticalTask;

    /**
    * Result for ASR-based recognition of pornographic content. This parameter is valid when `Type` is `Porn.Asr`.
Note: This field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("PornAsrTask")
    @Expose
    private AiReviewTaskPornAsrResult PornAsrTask;

    /**
    * Result for OCR-based recognition of pornographic content. This parameter is valid when `Type` is `Porn.Ocr`.
Note: This field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("PornOcrTask")
    @Expose
    private AiReviewTaskPornOcrResult PornOcrTask;

    /**
    * Result for ASR-based recognition of politically sensitive content. This parameter is valid when `Type` is `Political.Asr`.
Note: This field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("PoliticalAsrTask")
    @Expose
    private AiReviewTaskPoliticalAsrResult PoliticalAsrTask;

    /**
    * Result for OCR-based recognition of politically sensitive content. This parameter is valid when `Type` is `Political.Ocr`.
Note: This field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("PoliticalOcrTask")
    @Expose
    private AiReviewTaskPoliticalOcrResult PoliticalOcrTask;

    /**
    * Result for OCR-based recognition of terrorism content. This parameter is valid when `Type` is `Terrorism.Ocr`.
Note: This field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("TerrorismOcrTask")
    @Expose
    private AiReviewTaskTerrorismOcrResult TerrorismOcrTask;

    /**
    * Result for OCR-based recognition of banned content. This parameter is valid when `Type` is `Prohibited.Ocr`.
Note: This field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("ProhibitedOcrTask")
    @Expose
    private AiReviewTaskProhibitedOcrResult ProhibitedOcrTask;

    /**
    * Result for ASR-based recognition of banned content. This parameter is valid when `Type` is `Prohibited.Asr`.
Note: This field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("ProhibitedAsrTask")
    @Expose
    private AiReviewTaskProhibitedAsrResult ProhibitedAsrTask;

    /**
     * Get Task type. Valid values:
<li>`Porn`: porn information recognition in images</li>
<li>`Terrorism`: terrorism information recognition in images</li>
<li>`Political`: politically sensitive information recognition in images</li>
<li>`Porn.Asr`: ASR-based porn information recognition in speech</li>
<li>`Porn.Ocr`: OCR-based porn information recognition in text</li>
<li>`Political.Asr`: ASR-based politically sensitive information recognition in speech</li>
<li>`Political.Ocr`: OCR-based politically sensitive information recognition in text</li>
<li>`Terrorism.Ocr`: OCR-based terrorism information recognition in text</li>
<li>`Prohibited.Asr`: ASR-based prohibited information recognition in speech</li>
<li>`Prohibited.Ocr`: OCR-based prohibited information recognition in text</li> 
     * @return Type Task type. Valid values:
<li>`Porn`: porn information recognition in images</li>
<li>`Terrorism`: terrorism information recognition in images</li>
<li>`Political`: politically sensitive information recognition in images</li>
<li>`Porn.Asr`: ASR-based porn information recognition in speech</li>
<li>`Porn.Ocr`: OCR-based porn information recognition in text</li>
<li>`Political.Asr`: ASR-based politically sensitive information recognition in speech</li>
<li>`Political.Ocr`: OCR-based politically sensitive information recognition in text</li>
<li>`Terrorism.Ocr`: OCR-based terrorism information recognition in text</li>
<li>`Prohibited.Asr`: ASR-based prohibited information recognition in speech</li>
<li>`Prohibited.Ocr`: OCR-based prohibited information recognition in text</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Task type. Valid values:
<li>`Porn`: porn information recognition in images</li>
<li>`Terrorism`: terrorism information recognition in images</li>
<li>`Political`: politically sensitive information recognition in images</li>
<li>`Porn.Asr`: ASR-based porn information recognition in speech</li>
<li>`Porn.Ocr`: OCR-based porn information recognition in text</li>
<li>`Political.Asr`: ASR-based politically sensitive information recognition in speech</li>
<li>`Political.Ocr`: OCR-based politically sensitive information recognition in text</li>
<li>`Terrorism.Ocr`: OCR-based terrorism information recognition in text</li>
<li>`Prohibited.Asr`: ASR-based prohibited information recognition in speech</li>
<li>`Prohibited.Ocr`: OCR-based prohibited information recognition in text</li>
     * @param Type Task type. Valid values:
<li>`Porn`: porn information recognition in images</li>
<li>`Terrorism`: terrorism information recognition in images</li>
<li>`Political`: politically sensitive information recognition in images</li>
<li>`Porn.Asr`: ASR-based porn information recognition in speech</li>
<li>`Porn.Ocr`: OCR-based porn information recognition in text</li>
<li>`Political.Asr`: ASR-based politically sensitive information recognition in speech</li>
<li>`Political.Ocr`: OCR-based politically sensitive information recognition in text</li>
<li>`Terrorism.Ocr`: OCR-based terrorism information recognition in text</li>
<li>`Prohibited.Asr`: ASR-based prohibited information recognition in speech</li>
<li>`Prohibited.Ocr`: OCR-based prohibited information recognition in text</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Result for intelligent recognition of pornographic content in images. This parameter is valid when `Type` is `Porn`.
Note: This field may return `null`, indicating that no valid value can be found. 
     * @return PornTask Result for intelligent recognition of pornographic content in images. This parameter is valid when `Type` is `Porn`.
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public AiReviewTaskPornResult getPornTask() {
        return this.PornTask;
    }

    /**
     * Set Result for intelligent recognition of pornographic content in images. This parameter is valid when `Type` is `Porn`.
Note: This field may return `null`, indicating that no valid value can be found.
     * @param PornTask Result for intelligent recognition of pornographic content in images. This parameter is valid when `Type` is `Porn`.
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public void setPornTask(AiReviewTaskPornResult PornTask) {
        this.PornTask = PornTask;
    }

    /**
     * Get Result for intelligent recognition of terrorism content in images. This parameter is valid when `Type` is `Terrorism`.
Note: This field may return `null`, indicating that no valid value can be found. 
     * @return TerrorismTask Result for intelligent recognition of terrorism content in images. This parameter is valid when `Type` is `Terrorism`.
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public AiReviewTaskTerrorismResult getTerrorismTask() {
        return this.TerrorismTask;
    }

    /**
     * Set Result for intelligent recognition of terrorism content in images. This parameter is valid when `Type` is `Terrorism`.
Note: This field may return `null`, indicating that no valid value can be found.
     * @param TerrorismTask Result for intelligent recognition of terrorism content in images. This parameter is valid when `Type` is `Terrorism`.
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public void setTerrorismTask(AiReviewTaskTerrorismResult TerrorismTask) {
        this.TerrorismTask = TerrorismTask;
    }

    /**
     * Get Result for intelligent recognition of politically sensitive content in images. This parameter is valid when `Type` is `Political`.
Note: This field may return `null`, indicating that no valid value can be found. 
     * @return PoliticalTask Result for intelligent recognition of politically sensitive content in images. This parameter is valid when `Type` is `Political`.
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public AiReviewTaskPoliticalResult getPoliticalTask() {
        return this.PoliticalTask;
    }

    /**
     * Set Result for intelligent recognition of politically sensitive content in images. This parameter is valid when `Type` is `Political`.
Note: This field may return `null`, indicating that no valid value can be found.
     * @param PoliticalTask Result for intelligent recognition of politically sensitive content in images. This parameter is valid when `Type` is `Political`.
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public void setPoliticalTask(AiReviewTaskPoliticalResult PoliticalTask) {
        this.PoliticalTask = PoliticalTask;
    }

    /**
     * Get Result for ASR-based recognition of pornographic content. This parameter is valid when `Type` is `Porn.Asr`.
Note: This field may return `null`, indicating that no valid value can be found. 
     * @return PornAsrTask Result for ASR-based recognition of pornographic content. This parameter is valid when `Type` is `Porn.Asr`.
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public AiReviewTaskPornAsrResult getPornAsrTask() {
        return this.PornAsrTask;
    }

    /**
     * Set Result for ASR-based recognition of pornographic content. This parameter is valid when `Type` is `Porn.Asr`.
Note: This field may return `null`, indicating that no valid value can be found.
     * @param PornAsrTask Result for ASR-based recognition of pornographic content. This parameter is valid when `Type` is `Porn.Asr`.
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public void setPornAsrTask(AiReviewTaskPornAsrResult PornAsrTask) {
        this.PornAsrTask = PornAsrTask;
    }

    /**
     * Get Result for OCR-based recognition of pornographic content. This parameter is valid when `Type` is `Porn.Ocr`.
Note: This field may return `null`, indicating that no valid value can be found. 
     * @return PornOcrTask Result for OCR-based recognition of pornographic content. This parameter is valid when `Type` is `Porn.Ocr`.
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public AiReviewTaskPornOcrResult getPornOcrTask() {
        return this.PornOcrTask;
    }

    /**
     * Set Result for OCR-based recognition of pornographic content. This parameter is valid when `Type` is `Porn.Ocr`.
Note: This field may return `null`, indicating that no valid value can be found.
     * @param PornOcrTask Result for OCR-based recognition of pornographic content. This parameter is valid when `Type` is `Porn.Ocr`.
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public void setPornOcrTask(AiReviewTaskPornOcrResult PornOcrTask) {
        this.PornOcrTask = PornOcrTask;
    }

    /**
     * Get Result for ASR-based recognition of politically sensitive content. This parameter is valid when `Type` is `Political.Asr`.
Note: This field may return `null`, indicating that no valid value can be found. 
     * @return PoliticalAsrTask Result for ASR-based recognition of politically sensitive content. This parameter is valid when `Type` is `Political.Asr`.
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public AiReviewTaskPoliticalAsrResult getPoliticalAsrTask() {
        return this.PoliticalAsrTask;
    }

    /**
     * Set Result for ASR-based recognition of politically sensitive content. This parameter is valid when `Type` is `Political.Asr`.
Note: This field may return `null`, indicating that no valid value can be found.
     * @param PoliticalAsrTask Result for ASR-based recognition of politically sensitive content. This parameter is valid when `Type` is `Political.Asr`.
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public void setPoliticalAsrTask(AiReviewTaskPoliticalAsrResult PoliticalAsrTask) {
        this.PoliticalAsrTask = PoliticalAsrTask;
    }

    /**
     * Get Result for OCR-based recognition of politically sensitive content. This parameter is valid when `Type` is `Political.Ocr`.
Note: This field may return `null`, indicating that no valid value can be found. 
     * @return PoliticalOcrTask Result for OCR-based recognition of politically sensitive content. This parameter is valid when `Type` is `Political.Ocr`.
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public AiReviewTaskPoliticalOcrResult getPoliticalOcrTask() {
        return this.PoliticalOcrTask;
    }

    /**
     * Set Result for OCR-based recognition of politically sensitive content. This parameter is valid when `Type` is `Political.Ocr`.
Note: This field may return `null`, indicating that no valid value can be found.
     * @param PoliticalOcrTask Result for OCR-based recognition of politically sensitive content. This parameter is valid when `Type` is `Political.Ocr`.
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public void setPoliticalOcrTask(AiReviewTaskPoliticalOcrResult PoliticalOcrTask) {
        this.PoliticalOcrTask = PoliticalOcrTask;
    }

    /**
     * Get Result for OCR-based recognition of terrorism content. This parameter is valid when `Type` is `Terrorism.Ocr`.
Note: This field may return `null`, indicating that no valid value can be found. 
     * @return TerrorismOcrTask Result for OCR-based recognition of terrorism content. This parameter is valid when `Type` is `Terrorism.Ocr`.
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public AiReviewTaskTerrorismOcrResult getTerrorismOcrTask() {
        return this.TerrorismOcrTask;
    }

    /**
     * Set Result for OCR-based recognition of terrorism content. This parameter is valid when `Type` is `Terrorism.Ocr`.
Note: This field may return `null`, indicating that no valid value can be found.
     * @param TerrorismOcrTask Result for OCR-based recognition of terrorism content. This parameter is valid when `Type` is `Terrorism.Ocr`.
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public void setTerrorismOcrTask(AiReviewTaskTerrorismOcrResult TerrorismOcrTask) {
        this.TerrorismOcrTask = TerrorismOcrTask;
    }

    /**
     * Get Result for OCR-based recognition of banned content. This parameter is valid when `Type` is `Prohibited.Ocr`.
Note: This field may return `null`, indicating that no valid value can be found. 
     * @return ProhibitedOcrTask Result for OCR-based recognition of banned content. This parameter is valid when `Type` is `Prohibited.Ocr`.
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public AiReviewTaskProhibitedOcrResult getProhibitedOcrTask() {
        return this.ProhibitedOcrTask;
    }

    /**
     * Set Result for OCR-based recognition of banned content. This parameter is valid when `Type` is `Prohibited.Ocr`.
Note: This field may return `null`, indicating that no valid value can be found.
     * @param ProhibitedOcrTask Result for OCR-based recognition of banned content. This parameter is valid when `Type` is `Prohibited.Ocr`.
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public void setProhibitedOcrTask(AiReviewTaskProhibitedOcrResult ProhibitedOcrTask) {
        this.ProhibitedOcrTask = ProhibitedOcrTask;
    }

    /**
     * Get Result for ASR-based recognition of banned content. This parameter is valid when `Type` is `Prohibited.Asr`.
Note: This field may return `null`, indicating that no valid value can be found. 
     * @return ProhibitedAsrTask Result for ASR-based recognition of banned content. This parameter is valid when `Type` is `Prohibited.Asr`.
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public AiReviewTaskProhibitedAsrResult getProhibitedAsrTask() {
        return this.ProhibitedAsrTask;
    }

    /**
     * Set Result for ASR-based recognition of banned content. This parameter is valid when `Type` is `Prohibited.Asr`.
Note: This field may return `null`, indicating that no valid value can be found.
     * @param ProhibitedAsrTask Result for ASR-based recognition of banned content. This parameter is valid when `Type` is `Prohibited.Asr`.
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public void setProhibitedAsrTask(AiReviewTaskProhibitedAsrResult ProhibitedAsrTask) {
        this.ProhibitedAsrTask = ProhibitedAsrTask;
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
        if (source.ProhibitedOcrTask != null) {
            this.ProhibitedOcrTask = new AiReviewTaskProhibitedOcrResult(source.ProhibitedOcrTask);
        }
        if (source.ProhibitedAsrTask != null) {
            this.ProhibitedAsrTask = new AiReviewTaskProhibitedAsrResult(source.ProhibitedAsrTask);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "PornTask.", this.PornTask);
        this.setParamObj(map, prefix + "TerrorismTask.", this.TerrorismTask);
        this.setParamObj(map, prefix + "PoliticalTask.", this.PoliticalTask);
        this.setParamObj(map, prefix + "PornAsrTask.", this.PornAsrTask);
        this.setParamObj(map, prefix + "PornOcrTask.", this.PornOcrTask);
        this.setParamObj(map, prefix + "PoliticalAsrTask.", this.PoliticalAsrTask);
        this.setParamObj(map, prefix + "PoliticalOcrTask.", this.PoliticalOcrTask);
        this.setParamObj(map, prefix + "TerrorismOcrTask.", this.TerrorismOcrTask);
        this.setParamObj(map, prefix + "ProhibitedOcrTask.", this.ProhibitedOcrTask);
        this.setParamObj(map, prefix + "ProhibitedAsrTask.", this.ProhibitedAsrTask);

    }
}

