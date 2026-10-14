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

public class AiRecognitionResult extends AbstractModel {

    /**
    * Task type. Valid values:
<li>FaceRecognition: face recognition.</li>
<li>AsrWordsRecognition: speech keyword recognition.</li>
<li>OcrWordsRecognition: text keyword recognition.</li>
<li>AsrFullTextRecognition: full speech recognition.</li>
<li>OcrFullTextRecognition: full text recognition.</li>
<li>TransTextRecognition: speech translation</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Face recognition result, which is valid when Type is 
Valid for FaceRecognition.
    */
    @SerializedName("FaceTask")
    @Expose
    private AiRecognitionTaskFaceResult FaceTask;

    /**
    * Speech keyword recognition result, which is valid when Type is
Valid when set to AsrWordsRecognition.
    */
    @SerializedName("AsrWordsTask")
    @Expose
    private AiRecognitionTaskAsrWordsResult AsrWordsTask;

    /**
    * Full speech recognition result. When Type is
Valid when AsrFullTextRecognition is used.
    */
    @SerializedName("AsrFullTextTask")
    @Expose
    private AiRecognitionTaskAsrFullTextResult AsrFullTextTask;

    /**
    * Text keyword recognition result. When Type is
Valid when set to OcrWordsRecognition.
    */
    @SerializedName("OcrWordsTask")
    @Expose
    private AiRecognitionTaskOcrWordsResult OcrWordsTask;

    /**
    * Full text recognition result. When Type is
Valid when OcrFullTextRecognition is used.
    */
    @SerializedName("OcrFullTextTask")
    @Expose
    private AiRecognitionTaskOcrFullTextResult OcrFullTextTask;

    /**
    * Translation result. When Type is

Valid when set to TransTextRecognition.
    */
    @SerializedName("TransTextTask")
    @Expose
    private AiRecognitionTaskTransTextResult TransTextTask;

    /**
    * Object recognition result, which is valid when Type is

Valid for ObjectRecognition.
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
<li>OcrFullTextRecognition: full text recognition.</li>
<li>TransTextRecognition: speech translation</li> 
     * @return Type Task type. Valid values:
<li>FaceRecognition: face recognition.</li>
<li>AsrWordsRecognition: speech keyword recognition.</li>
<li>OcrWordsRecognition: text keyword recognition.</li>
<li>AsrFullTextRecognition: full speech recognition.</li>
<li>OcrFullTextRecognition: full text recognition.</li>
<li>TransTextRecognition: speech translation</li>
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
<li>OcrFullTextRecognition: full text recognition.</li>
<li>TransTextRecognition: speech translation</li>
     * @param Type Task type. Valid values:
<li>FaceRecognition: face recognition.</li>
<li>AsrWordsRecognition: speech keyword recognition.</li>
<li>OcrWordsRecognition: text keyword recognition.</li>
<li>AsrFullTextRecognition: full speech recognition.</li>
<li>OcrFullTextRecognition: full text recognition.</li>
<li>TransTextRecognition: speech translation</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Face recognition result, which is valid when Type is 
Valid for FaceRecognition. 
     * @return FaceTask Face recognition result, which is valid when Type is 
Valid for FaceRecognition.
     */
    public AiRecognitionTaskFaceResult getFaceTask() {
        return this.FaceTask;
    }

    /**
     * Set Face recognition result, which is valid when Type is 
Valid for FaceRecognition.
     * @param FaceTask Face recognition result, which is valid when Type is 
Valid for FaceRecognition.
     */
    public void setFaceTask(AiRecognitionTaskFaceResult FaceTask) {
        this.FaceTask = FaceTask;
    }

    /**
     * Get Speech keyword recognition result, which is valid when Type is
Valid when set to AsrWordsRecognition. 
     * @return AsrWordsTask Speech keyword recognition result, which is valid when Type is
Valid when set to AsrWordsRecognition.
     */
    public AiRecognitionTaskAsrWordsResult getAsrWordsTask() {
        return this.AsrWordsTask;
    }

    /**
     * Set Speech keyword recognition result, which is valid when Type is
Valid when set to AsrWordsRecognition.
     * @param AsrWordsTask Speech keyword recognition result, which is valid when Type is
Valid when set to AsrWordsRecognition.
     */
    public void setAsrWordsTask(AiRecognitionTaskAsrWordsResult AsrWordsTask) {
        this.AsrWordsTask = AsrWordsTask;
    }

    /**
     * Get Full speech recognition result. When Type is
Valid when AsrFullTextRecognition is used. 
     * @return AsrFullTextTask Full speech recognition result. When Type is
Valid when AsrFullTextRecognition is used.
     */
    public AiRecognitionTaskAsrFullTextResult getAsrFullTextTask() {
        return this.AsrFullTextTask;
    }

    /**
     * Set Full speech recognition result. When Type is
Valid when AsrFullTextRecognition is used.
     * @param AsrFullTextTask Full speech recognition result. When Type is
Valid when AsrFullTextRecognition is used.
     */
    public void setAsrFullTextTask(AiRecognitionTaskAsrFullTextResult AsrFullTextTask) {
        this.AsrFullTextTask = AsrFullTextTask;
    }

    /**
     * Get Text keyword recognition result. When Type is
Valid when set to OcrWordsRecognition. 
     * @return OcrWordsTask Text keyword recognition result. When Type is
Valid when set to OcrWordsRecognition.
     */
    public AiRecognitionTaskOcrWordsResult getOcrWordsTask() {
        return this.OcrWordsTask;
    }

    /**
     * Set Text keyword recognition result. When Type is
Valid when set to OcrWordsRecognition.
     * @param OcrWordsTask Text keyword recognition result. When Type is
Valid when set to OcrWordsRecognition.
     */
    public void setOcrWordsTask(AiRecognitionTaskOcrWordsResult OcrWordsTask) {
        this.OcrWordsTask = OcrWordsTask;
    }

    /**
     * Get Full text recognition result. When Type is
Valid when OcrFullTextRecognition is used. 
     * @return OcrFullTextTask Full text recognition result. When Type is
Valid when OcrFullTextRecognition is used.
     */
    public AiRecognitionTaskOcrFullTextResult getOcrFullTextTask() {
        return this.OcrFullTextTask;
    }

    /**
     * Set Full text recognition result. When Type is
Valid when OcrFullTextRecognition is used.
     * @param OcrFullTextTask Full text recognition result. When Type is
Valid when OcrFullTextRecognition is used.
     */
    public void setOcrFullTextTask(AiRecognitionTaskOcrFullTextResult OcrFullTextTask) {
        this.OcrFullTextTask = OcrFullTextTask;
    }

    /**
     * Get Translation result. When Type is

Valid when set to TransTextRecognition. 
     * @return TransTextTask Translation result. When Type is

Valid when set to TransTextRecognition.
     */
    public AiRecognitionTaskTransTextResult getTransTextTask() {
        return this.TransTextTask;
    }

    /**
     * Set Translation result. When Type is

Valid when set to TransTextRecognition.
     * @param TransTextTask Translation result. When Type is

Valid when set to TransTextRecognition.
     */
    public void setTransTextTask(AiRecognitionTaskTransTextResult TransTextTask) {
        this.TransTextTask = TransTextTask;
    }

    /**
     * Get Object recognition result, which is valid when Type is

Valid for ObjectRecognition. 
     * @return ObjectTask Object recognition result, which is valid when Type is

Valid for ObjectRecognition.
     */
    public AiRecognitionTaskObjectResult getObjectTask() {
        return this.ObjectTask;
    }

    /**
     * Set Object recognition result, which is valid when Type is

Valid for ObjectRecognition.
     * @param ObjectTask Object recognition result, which is valid when Type is

Valid for ObjectRecognition.
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
        if (source.FaceTask != null) {
            this.FaceTask = new AiRecognitionTaskFaceResult(source.FaceTask);
        }
        if (source.AsrWordsTask != null) {
            this.AsrWordsTask = new AiRecognitionTaskAsrWordsResult(source.AsrWordsTask);
        }
        if (source.AsrFullTextTask != null) {
            this.AsrFullTextTask = new AiRecognitionTaskAsrFullTextResult(source.AsrFullTextTask);
        }
        if (source.OcrWordsTask != null) {
            this.OcrWordsTask = new AiRecognitionTaskOcrWordsResult(source.OcrWordsTask);
        }
        if (source.OcrFullTextTask != null) {
            this.OcrFullTextTask = new AiRecognitionTaskOcrFullTextResult(source.OcrFullTextTask);
        }
        if (source.TransTextTask != null) {
            this.TransTextTask = new AiRecognitionTaskTransTextResult(source.TransTextTask);
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
        this.setParamObj(map, prefix + "FaceTask.", this.FaceTask);
        this.setParamObj(map, prefix + "AsrWordsTask.", this.AsrWordsTask);
        this.setParamObj(map, prefix + "AsrFullTextTask.", this.AsrFullTextTask);
        this.setParamObj(map, prefix + "OcrWordsTask.", this.OcrWordsTask);
        this.setParamObj(map, prefix + "OcrFullTextTask.", this.OcrFullTextTask);
        this.setParamObj(map, prefix + "TransTextTask.", this.TransTextTask);
        this.setParamObj(map, prefix + "ObjectTask.", this.ObjectTask);

    }
}

