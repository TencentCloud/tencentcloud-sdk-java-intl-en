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

public class AiRecognitionResult extends AbstractModel {

    /**
    * Task type. Valid values:
<li>FaceRecognition: face recognition.</li>
<li>AsrWordsRecognition: speech keyword recognition.</li>
<li>OcrWordsRecognition: text keyword recognition.</li>
<li>AsrFullTextRecognition: full speech recognition.</li>
<li>AsrTranslateRecognition: Speech translation recognition,</li>
<li>OcrFullTextRecognition: full text recognition.</li>
<li>HeadTailRecognition: Video start and end recognition,</li>
<li>ObjectRecognition: Object recognition.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Video opening and closing credits recognition result when Type is
HeadTailRecognition.
    */
    @SerializedName("HeadTailTask")
    @Expose
    private AiRecognitionTaskHeadTailResult HeadTailTask;

    /**
    * Video splitting recognition result, which is valid when Type is
Valid at SegmentRecognition.
    */
    @SerializedName("SegmentTask")
    @Expose
    private AiRecognitionTaskSegmentResult SegmentTask;

    /**
    * Face recognition result, which is valid when Type is 
FaceRecognition.
    */
    @SerializedName("FaceTask")
    @Expose
    private AiRecognitionTaskFaceResult FaceTask;

    /**
    * Speech keyword recognition result when Type is
Valid at AsrWordsRecognition.
    */
    @SerializedName("AsrWordsTask")
    @Expose
    private AiRecognitionTaskAsrWordsResult AsrWordsTask;

    /**
    * Full speech recognition result. When Type is
Set to AsrFullTextRecognition, this parameter takes effect.
    */
    @SerializedName("AsrFullTextTask")
    @Expose
    private AiRecognitionTaskAsrFullTextResult AsrFullTextTask;

    /**
    * Voice translation result. Valid when Type is AsrTranslateRecognition.
    */
    @SerializedName("AsrTranslateTask")
    @Expose
    private AiRecognitionTaskAsrTranslateResult AsrTranslateTask;

    /**
    * Text keyword recognition result when Type is
Valid at OcrWordsRecognition.
    */
    @SerializedName("OcrWordsTask")
    @Expose
    private AiRecognitionTaskOcrWordsResult OcrWordsTask;

    /**
    * Full text recognition result. When Type is
OcrFullTextRecognition.
    */
    @SerializedName("OcrFullTextTask")
    @Expose
    private AiRecognitionTaskOcrFullTextResult OcrFullTextTask;

    /**
    * Object recognition result, which is valid when Type is
Valid at ObjectRecognition.
    */
    @SerializedName("ObjectTask")
    @Expose
    private AiRecognitionTaskObjectResult ObjectTask;

    /**
     * Get Task type. Valid values:
<li>FaceRecognition: face recognition.</li>
<li>AsrWordsRecognition: speech keyword recognition.</li>
<li>OcrWordsRecognition: text keyword recognition.</li>
<li>AsrFullTextRecognition: full speech recognition.</li>
<li>AsrTranslateRecognition: Speech translation recognition,</li>
<li>OcrFullTextRecognition: full text recognition.</li>
<li>HeadTailRecognition: Video start and end recognition,</li>
<li>ObjectRecognition: Object recognition.</li> 
     * @return Type Task type. Valid values:
<li>FaceRecognition: face recognition.</li>
<li>AsrWordsRecognition: speech keyword recognition.</li>
<li>OcrWordsRecognition: text keyword recognition.</li>
<li>AsrFullTextRecognition: full speech recognition.</li>
<li>AsrTranslateRecognition: Speech translation recognition,</li>
<li>OcrFullTextRecognition: full text recognition.</li>
<li>HeadTailRecognition: Video start and end recognition,</li>
<li>ObjectRecognition: Object recognition.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Task type. Valid values:
<li>FaceRecognition: face recognition.</li>
<li>AsrWordsRecognition: speech keyword recognition.</li>
<li>OcrWordsRecognition: text keyword recognition.</li>
<li>AsrFullTextRecognition: full speech recognition.</li>
<li>AsrTranslateRecognition: Speech translation recognition,</li>
<li>OcrFullTextRecognition: full text recognition.</li>
<li>HeadTailRecognition: Video start and end recognition,</li>
<li>ObjectRecognition: Object recognition.</li>
     * @param Type Task type. Valid values:
<li>FaceRecognition: face recognition.</li>
<li>AsrWordsRecognition: speech keyword recognition.</li>
<li>OcrWordsRecognition: text keyword recognition.</li>
<li>AsrFullTextRecognition: full speech recognition.</li>
<li>AsrTranslateRecognition: Speech translation recognition,</li>
<li>OcrFullTextRecognition: full text recognition.</li>
<li>HeadTailRecognition: Video start and end recognition,</li>
<li>ObjectRecognition: Object recognition.</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Video opening and closing credits recognition result when Type is
HeadTailRecognition. 
     * @return HeadTailTask Video opening and closing credits recognition result when Type is
HeadTailRecognition.
     */
    public AiRecognitionTaskHeadTailResult getHeadTailTask() {
        return this.HeadTailTask;
    }

    /**
     * Set Video opening and closing credits recognition result when Type is
HeadTailRecognition.
     * @param HeadTailTask Video opening and closing credits recognition result when Type is
HeadTailRecognition.
     */
    public void setHeadTailTask(AiRecognitionTaskHeadTailResult HeadTailTask) {
        this.HeadTailTask = HeadTailTask;
    }

    /**
     * Get Video splitting recognition result, which is valid when Type is
Valid at SegmentRecognition. 
     * @return SegmentTask Video splitting recognition result, which is valid when Type is
Valid at SegmentRecognition.
     */
    public AiRecognitionTaskSegmentResult getSegmentTask() {
        return this.SegmentTask;
    }

    /**
     * Set Video splitting recognition result, which is valid when Type is
Valid at SegmentRecognition.
     * @param SegmentTask Video splitting recognition result, which is valid when Type is
Valid at SegmentRecognition.
     */
    public void setSegmentTask(AiRecognitionTaskSegmentResult SegmentTask) {
        this.SegmentTask = SegmentTask;
    }

    /**
     * Get Face recognition result, which is valid when Type is 
FaceRecognition. 
     * @return FaceTask Face recognition result, which is valid when Type is 
FaceRecognition.
     */
    public AiRecognitionTaskFaceResult getFaceTask() {
        return this.FaceTask;
    }

    /**
     * Set Face recognition result, which is valid when Type is 
FaceRecognition.
     * @param FaceTask Face recognition result, which is valid when Type is 
FaceRecognition.
     */
    public void setFaceTask(AiRecognitionTaskFaceResult FaceTask) {
        this.FaceTask = FaceTask;
    }

    /**
     * Get Speech keyword recognition result when Type is
Valid at AsrWordsRecognition. 
     * @return AsrWordsTask Speech keyword recognition result when Type is
Valid at AsrWordsRecognition.
     */
    public AiRecognitionTaskAsrWordsResult getAsrWordsTask() {
        return this.AsrWordsTask;
    }

    /**
     * Set Speech keyword recognition result when Type is
Valid at AsrWordsRecognition.
     * @param AsrWordsTask Speech keyword recognition result when Type is
Valid at AsrWordsRecognition.
     */
    public void setAsrWordsTask(AiRecognitionTaskAsrWordsResult AsrWordsTask) {
        this.AsrWordsTask = AsrWordsTask;
    }

    /**
     * Get Full speech recognition result. When Type is
Set to AsrFullTextRecognition, this parameter takes effect. 
     * @return AsrFullTextTask Full speech recognition result. When Type is
Set to AsrFullTextRecognition, this parameter takes effect.
     */
    public AiRecognitionTaskAsrFullTextResult getAsrFullTextTask() {
        return this.AsrFullTextTask;
    }

    /**
     * Set Full speech recognition result. When Type is
Set to AsrFullTextRecognition, this parameter takes effect.
     * @param AsrFullTextTask Full speech recognition result. When Type is
Set to AsrFullTextRecognition, this parameter takes effect.
     */
    public void setAsrFullTextTask(AiRecognitionTaskAsrFullTextResult AsrFullTextTask) {
        this.AsrFullTextTask = AsrFullTextTask;
    }

    /**
     * Get Voice translation result. Valid when Type is AsrTranslateRecognition. 
     * @return AsrTranslateTask Voice translation result. Valid when Type is AsrTranslateRecognition.
     */
    public AiRecognitionTaskAsrTranslateResult getAsrTranslateTask() {
        return this.AsrTranslateTask;
    }

    /**
     * Set Voice translation result. Valid when Type is AsrTranslateRecognition.
     * @param AsrTranslateTask Voice translation result. Valid when Type is AsrTranslateRecognition.
     */
    public void setAsrTranslateTask(AiRecognitionTaskAsrTranslateResult AsrTranslateTask) {
        this.AsrTranslateTask = AsrTranslateTask;
    }

    /**
     * Get Text keyword recognition result when Type is
Valid at OcrWordsRecognition. 
     * @return OcrWordsTask Text keyword recognition result when Type is
Valid at OcrWordsRecognition.
     */
    public AiRecognitionTaskOcrWordsResult getOcrWordsTask() {
        return this.OcrWordsTask;
    }

    /**
     * Set Text keyword recognition result when Type is
Valid at OcrWordsRecognition.
     * @param OcrWordsTask Text keyword recognition result when Type is
Valid at OcrWordsRecognition.
     */
    public void setOcrWordsTask(AiRecognitionTaskOcrWordsResult OcrWordsTask) {
        this.OcrWordsTask = OcrWordsTask;
    }

    /**
     * Get Full text recognition result. When Type is
OcrFullTextRecognition. 
     * @return OcrFullTextTask Full text recognition result. When Type is
OcrFullTextRecognition.
     */
    public AiRecognitionTaskOcrFullTextResult getOcrFullTextTask() {
        return this.OcrFullTextTask;
    }

    /**
     * Set Full text recognition result. When Type is
OcrFullTextRecognition.
     * @param OcrFullTextTask Full text recognition result. When Type is
OcrFullTextRecognition.
     */
    public void setOcrFullTextTask(AiRecognitionTaskOcrFullTextResult OcrFullTextTask) {
        this.OcrFullTextTask = OcrFullTextTask;
    }

    /**
     * Get Object recognition result, which is valid when Type is
Valid at ObjectRecognition. 
     * @return ObjectTask Object recognition result, which is valid when Type is
Valid at ObjectRecognition.
     */
    public AiRecognitionTaskObjectResult getObjectTask() {
        return this.ObjectTask;
    }

    /**
     * Set Object recognition result, which is valid when Type is
Valid at ObjectRecognition.
     * @param ObjectTask Object recognition result, which is valid when Type is
Valid at ObjectRecognition.
     */
    public void setObjectTask(AiRecognitionTaskObjectResult ObjectTask) {
        this.ObjectTask = ObjectTask;
    }

    public AiRecognitionResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiRecognitionResult(AiRecognitionResult source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.HeadTailTask != null) {
            this.HeadTailTask = new AiRecognitionTaskHeadTailResult(source.HeadTailTask);
        }
        if (source.SegmentTask != null) {
            this.SegmentTask = new AiRecognitionTaskSegmentResult(source.SegmentTask);
        }
        if (source.FaceTask != null) {
            this.FaceTask = new AiRecognitionTaskFaceResult(source.FaceTask);
        }
        if (source.AsrWordsTask != null) {
            this.AsrWordsTask = new AiRecognitionTaskAsrWordsResult(source.AsrWordsTask);
        }
        if (source.AsrFullTextTask != null) {
            this.AsrFullTextTask = new AiRecognitionTaskAsrFullTextResult(source.AsrFullTextTask);
        }
        if (source.AsrTranslateTask != null) {
            this.AsrTranslateTask = new AiRecognitionTaskAsrTranslateResult(source.AsrTranslateTask);
        }
        if (source.OcrWordsTask != null) {
            this.OcrWordsTask = new AiRecognitionTaskOcrWordsResult(source.OcrWordsTask);
        }
        if (source.OcrFullTextTask != null) {
            this.OcrFullTextTask = new AiRecognitionTaskOcrFullTextResult(source.OcrFullTextTask);
        }
        if (source.ObjectTask != null) {
            this.ObjectTask = new AiRecognitionTaskObjectResult(source.ObjectTask);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "HeadTailTask.", this.HeadTailTask);
        this.setParamObj(map, prefix + "SegmentTask.", this.SegmentTask);
        this.setParamObj(map, prefix + "FaceTask.", this.FaceTask);
        this.setParamObj(map, prefix + "AsrWordsTask.", this.AsrWordsTask);
        this.setParamObj(map, prefix + "AsrFullTextTask.", this.AsrFullTextTask);
        this.setParamObj(map, prefix + "AsrTranslateTask.", this.AsrTranslateTask);
        this.setParamObj(map, prefix + "OcrWordsTask.", this.OcrWordsTask);
        this.setParamObj(map, prefix + "OcrFullTextTask.", this.OcrFullTextTask);
        this.setParamObj(map, prefix + "ObjectTask.", this.ObjectTask);

    }
}

