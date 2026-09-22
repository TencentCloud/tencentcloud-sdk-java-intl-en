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
<li>Porn: whether image recognition involves offensive content</li>
<li>Terrorism: image recognition for unsafe information</li>
<li>Political: Whether image recognition involves inappropriate information</li>
<li>Porn.Asr: ASR text (text in audio) authentication for whether it involves offensive content</li>
<li>Porn.Ocr: whether Ocr text identification involves offensive content</li>
<li>Political.Asr: ASR text (text in audio) authentication whether it involves inappropriate information</li>
<li>Political.Ocr: whether Ocr text identification involves inappropriate information</li>
<li>Terrorism.Ocr: whether Ocr text identification involves unsafe information</li>
<li>Prohibited.Asr: Prohibited information recognition for ASR text (text in audio)</li>
<li>Prohibited.Ocr: OCR text prohibited information recognition</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Query result of a video audio/video moderation task (visual contains offensive content). Valid when the task type is Porn.
    */
    @SerializedName("PornTask")
    @Expose
    private AiReviewTaskPornResult PornTask;

    /**
    * Query result of a video audio/video moderation task (frames involving unsafe information). Valid when the task type is Terrorism.
    */
    @SerializedName("TerrorismTask")
    @Expose
    private AiReviewTaskTerrorismResult TerrorismTask;

    /**
    * Query result of the video audio/video moderation task (visuals involving inappropriate information). Valid when the task type is Political.
    */
    @SerializedName("PoliticalTask")
    @Expose
    private AiReviewTaskPoliticalResult PoliticalTask;

    /**
    * Query result of a video audio/video moderation task (ASR text involves offensive content). Valid when the task type is Porn.Asr.
    */
    @SerializedName("PornAsrTask")
    @Expose
    private AiReviewTaskPornAsrResult PornAsrTask;

    /**
    * Query result of a video audio/video moderation task (OCR text contains offensive content). Valid when the task type is Porn.Ocr.
    */
    @SerializedName("PornOcrTask")
    @Expose
    private AiReviewTaskPornOcrResult PornOcrTask;

    /**
    * Query result of the video audio/video moderation task (ASR text involving inappropriate information). Valid when the task type is Political.Asr.
    */
    @SerializedName("PoliticalAsrTask")
    @Expose
    private AiReviewTaskPoliticalAsrResult PoliticalAsrTask;

    /**
    * Query result of a video/audio moderation task (OCR text involving inappropriate information). Valid when the task type is Political.Ocr.
    */
    @SerializedName("PoliticalOcrTask")
    @Expose
    private AiReviewTaskPoliticalOcrResult PoliticalOcrTask;

    /**
    * Query result of a video/audio moderation task (OCR text involving unsafe information). Valid when the task type is Terrorism.Ocr.
    */
    @SerializedName("TerrorismOcrTask")
    @Expose
    private AiReviewTaskTerrorismOcrResult TerrorismOcrTask;

    /**
    * Query result of a video audio/video moderation OCR text prohibited task. Valid when the task type is Prohibited.Ocr.
    */
    @SerializedName("ProhibitedOcrTask")
    @Expose
    private AiReviewTaskProhibitedOcrResult ProhibitedOcrTask;

    /**
    * Query result of the ASR text prohibited task in video moderation. Valid when the task type is Prohibited.Asr.
    */
    @SerializedName("ProhibitedAsrTask")
    @Expose
    private AiReviewTaskProhibitedAsrResult ProhibitedAsrTask;

    /**
     * Get Task type. Valid values:
<li>Porn: whether image recognition involves offensive content</li>
<li>Terrorism: image recognition for unsafe information</li>
<li>Political: Whether image recognition involves inappropriate information</li>
<li>Porn.Asr: ASR text (text in audio) authentication for whether it involves offensive content</li>
<li>Porn.Ocr: whether Ocr text identification involves offensive content</li>
<li>Political.Asr: ASR text (text in audio) authentication whether it involves inappropriate information</li>
<li>Political.Ocr: whether Ocr text identification involves inappropriate information</li>
<li>Terrorism.Ocr: whether Ocr text identification involves unsafe information</li>
<li>Prohibited.Asr: Prohibited information recognition for ASR text (text in audio)</li>
<li>Prohibited.Ocr: OCR text prohibited information recognition</li> 
     * @return Type Task type. Valid values:
<li>Porn: whether image recognition involves offensive content</li>
<li>Terrorism: image recognition for unsafe information</li>
<li>Political: Whether image recognition involves inappropriate information</li>
<li>Porn.Asr: ASR text (text in audio) authentication for whether it involves offensive content</li>
<li>Porn.Ocr: whether Ocr text identification involves offensive content</li>
<li>Political.Asr: ASR text (text in audio) authentication whether it involves inappropriate information</li>
<li>Political.Ocr: whether Ocr text identification involves inappropriate information</li>
<li>Terrorism.Ocr: whether Ocr text identification involves unsafe information</li>
<li>Prohibited.Asr: Prohibited information recognition for ASR text (text in audio)</li>
<li>Prohibited.Ocr: OCR text prohibited information recognition</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Task type. Valid values:
<li>Porn: whether image recognition involves offensive content</li>
<li>Terrorism: image recognition for unsafe information</li>
<li>Political: Whether image recognition involves inappropriate information</li>
<li>Porn.Asr: ASR text (text in audio) authentication for whether it involves offensive content</li>
<li>Porn.Ocr: whether Ocr text identification involves offensive content</li>
<li>Political.Asr: ASR text (text in audio) authentication whether it involves inappropriate information</li>
<li>Political.Ocr: whether Ocr text identification involves inappropriate information</li>
<li>Terrorism.Ocr: whether Ocr text identification involves unsafe information</li>
<li>Prohibited.Asr: Prohibited information recognition for ASR text (text in audio)</li>
<li>Prohibited.Ocr: OCR text prohibited information recognition</li>
     * @param Type Task type. Valid values:
<li>Porn: whether image recognition involves offensive content</li>
<li>Terrorism: image recognition for unsafe information</li>
<li>Political: Whether image recognition involves inappropriate information</li>
<li>Porn.Asr: ASR text (text in audio) authentication for whether it involves offensive content</li>
<li>Porn.Ocr: whether Ocr text identification involves offensive content</li>
<li>Political.Asr: ASR text (text in audio) authentication whether it involves inappropriate information</li>
<li>Political.Ocr: whether Ocr text identification involves inappropriate information</li>
<li>Terrorism.Ocr: whether Ocr text identification involves unsafe information</li>
<li>Prohibited.Asr: Prohibited information recognition for ASR text (text in audio)</li>
<li>Prohibited.Ocr: OCR text prohibited information recognition</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Query result of a video audio/video moderation task (visual contains offensive content). Valid when the task type is Porn. 
     * @return PornTask Query result of a video audio/video moderation task (visual contains offensive content). Valid when the task type is Porn.
     */
    public AiReviewTaskPornResult getPornTask() {
        return this.PornTask;
    }

    /**
     * Set Query result of a video audio/video moderation task (visual contains offensive content). Valid when the task type is Porn.
     * @param PornTask Query result of a video audio/video moderation task (visual contains offensive content). Valid when the task type is Porn.
     */
    public void setPornTask(AiReviewTaskPornResult PornTask) {
        this.PornTask = PornTask;
    }

    /**
     * Get Query result of a video audio/video moderation task (frames involving unsafe information). Valid when the task type is Terrorism. 
     * @return TerrorismTask Query result of a video audio/video moderation task (frames involving unsafe information). Valid when the task type is Terrorism.
     */
    public AiReviewTaskTerrorismResult getTerrorismTask() {
        return this.TerrorismTask;
    }

    /**
     * Set Query result of a video audio/video moderation task (frames involving unsafe information). Valid when the task type is Terrorism.
     * @param TerrorismTask Query result of a video audio/video moderation task (frames involving unsafe information). Valid when the task type is Terrorism.
     */
    public void setTerrorismTask(AiReviewTaskTerrorismResult TerrorismTask) {
        this.TerrorismTask = TerrorismTask;
    }

    /**
     * Get Query result of the video audio/video moderation task (visuals involving inappropriate information). Valid when the task type is Political. 
     * @return PoliticalTask Query result of the video audio/video moderation task (visuals involving inappropriate information). Valid when the task type is Political.
     */
    public AiReviewTaskPoliticalResult getPoliticalTask() {
        return this.PoliticalTask;
    }

    /**
     * Set Query result of the video audio/video moderation task (visuals involving inappropriate information). Valid when the task type is Political.
     * @param PoliticalTask Query result of the video audio/video moderation task (visuals involving inappropriate information). Valid when the task type is Political.
     */
    public void setPoliticalTask(AiReviewTaskPoliticalResult PoliticalTask) {
        this.PoliticalTask = PoliticalTask;
    }

    /**
     * Get Query result of a video audio/video moderation task (ASR text involves offensive content). Valid when the task type is Porn.Asr. 
     * @return PornAsrTask Query result of a video audio/video moderation task (ASR text involves offensive content). Valid when the task type is Porn.Asr.
     */
    public AiReviewTaskPornAsrResult getPornAsrTask() {
        return this.PornAsrTask;
    }

    /**
     * Set Query result of a video audio/video moderation task (ASR text involves offensive content). Valid when the task type is Porn.Asr.
     * @param PornAsrTask Query result of a video audio/video moderation task (ASR text involves offensive content). Valid when the task type is Porn.Asr.
     */
    public void setPornAsrTask(AiReviewTaskPornAsrResult PornAsrTask) {
        this.PornAsrTask = PornAsrTask;
    }

    /**
     * Get Query result of a video audio/video moderation task (OCR text contains offensive content). Valid when the task type is Porn.Ocr. 
     * @return PornOcrTask Query result of a video audio/video moderation task (OCR text contains offensive content). Valid when the task type is Porn.Ocr.
     */
    public AiReviewTaskPornOcrResult getPornOcrTask() {
        return this.PornOcrTask;
    }

    /**
     * Set Query result of a video audio/video moderation task (OCR text contains offensive content). Valid when the task type is Porn.Ocr.
     * @param PornOcrTask Query result of a video audio/video moderation task (OCR text contains offensive content). Valid when the task type is Porn.Ocr.
     */
    public void setPornOcrTask(AiReviewTaskPornOcrResult PornOcrTask) {
        this.PornOcrTask = PornOcrTask;
    }

    /**
     * Get Query result of the video audio/video moderation task (ASR text involving inappropriate information). Valid when the task type is Political.Asr. 
     * @return PoliticalAsrTask Query result of the video audio/video moderation task (ASR text involving inappropriate information). Valid when the task type is Political.Asr.
     */
    public AiReviewTaskPoliticalAsrResult getPoliticalAsrTask() {
        return this.PoliticalAsrTask;
    }

    /**
     * Set Query result of the video audio/video moderation task (ASR text involving inappropriate information). Valid when the task type is Political.Asr.
     * @param PoliticalAsrTask Query result of the video audio/video moderation task (ASR text involving inappropriate information). Valid when the task type is Political.Asr.
     */
    public void setPoliticalAsrTask(AiReviewTaskPoliticalAsrResult PoliticalAsrTask) {
        this.PoliticalAsrTask = PoliticalAsrTask;
    }

    /**
     * Get Query result of a video/audio moderation task (OCR text involving inappropriate information). Valid when the task type is Political.Ocr. 
     * @return PoliticalOcrTask Query result of a video/audio moderation task (OCR text involving inappropriate information). Valid when the task type is Political.Ocr.
     */
    public AiReviewTaskPoliticalOcrResult getPoliticalOcrTask() {
        return this.PoliticalOcrTask;
    }

    /**
     * Set Query result of a video/audio moderation task (OCR text involving inappropriate information). Valid when the task type is Political.Ocr.
     * @param PoliticalOcrTask Query result of a video/audio moderation task (OCR text involving inappropriate information). Valid when the task type is Political.Ocr.
     */
    public void setPoliticalOcrTask(AiReviewTaskPoliticalOcrResult PoliticalOcrTask) {
        this.PoliticalOcrTask = PoliticalOcrTask;
    }

    /**
     * Get Query result of a video/audio moderation task (OCR text involving unsafe information). Valid when the task type is Terrorism.Ocr. 
     * @return TerrorismOcrTask Query result of a video/audio moderation task (OCR text involving unsafe information). Valid when the task type is Terrorism.Ocr.
     */
    public AiReviewTaskTerrorismOcrResult getTerrorismOcrTask() {
        return this.TerrorismOcrTask;
    }

    /**
     * Set Query result of a video/audio moderation task (OCR text involving unsafe information). Valid when the task type is Terrorism.Ocr.
     * @param TerrorismOcrTask Query result of a video/audio moderation task (OCR text involving unsafe information). Valid when the task type is Terrorism.Ocr.
     */
    public void setTerrorismOcrTask(AiReviewTaskTerrorismOcrResult TerrorismOcrTask) {
        this.TerrorismOcrTask = TerrorismOcrTask;
    }

    /**
     * Get Query result of a video audio/video moderation OCR text prohibited task. Valid when the task type is Prohibited.Ocr. 
     * @return ProhibitedOcrTask Query result of a video audio/video moderation OCR text prohibited task. Valid when the task type is Prohibited.Ocr.
     */
    public AiReviewTaskProhibitedOcrResult getProhibitedOcrTask() {
        return this.ProhibitedOcrTask;
    }

    /**
     * Set Query result of a video audio/video moderation OCR text prohibited task. Valid when the task type is Prohibited.Ocr.
     * @param ProhibitedOcrTask Query result of a video audio/video moderation OCR text prohibited task. Valid when the task type is Prohibited.Ocr.
     */
    public void setProhibitedOcrTask(AiReviewTaskProhibitedOcrResult ProhibitedOcrTask) {
        this.ProhibitedOcrTask = ProhibitedOcrTask;
    }

    /**
     * Get Query result of the ASR text prohibited task in video moderation. Valid when the task type is Prohibited.Asr. 
     * @return ProhibitedAsrTask Query result of the ASR text prohibited task in video moderation. Valid when the task type is Prohibited.Asr.
     */
    public AiReviewTaskProhibitedAsrResult getProhibitedAsrTask() {
        return this.ProhibitedAsrTask;
    }

    /**
     * Set Query result of the ASR text prohibited task in video moderation. Valid when the task type is Prohibited.Asr.
     * @param ProhibitedAsrTask Query result of the ASR text prohibited task in video moderation. Valid when the task type is Prohibited.Asr.
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

