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
    * The task type. Valid values:
<li>FaceRecognition: Face recognition</li>
<li>AsrWordsRecognition: Speech keyword recognition</li>
<li>OcrWordsRecognition: Text keyword recognition</li>
<li>AsrFullTextRecognition: Full speech recognition</li>
<li>OcrFullTextRecognition: Full text recognition</li>
<li>TransTextRecognition: Speech translation</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Face recognition result, which is valid when `Type` is 
 `FaceRecognition`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FaceTask")
    @Expose
    private AiRecognitionTaskFaceResult FaceTask;

    /**
    * Speech keyword recognition result, which is valid when `Type` is
 `AsrWordsRecognition`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AsrWordsTask")
    @Expose
    private AiRecognitionTaskAsrWordsResult AsrWordsTask;

    /**
    * Full speech recognition result, which is valid when `Type` is
 `AsrFullTextRecognition`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AsrFullTextTask")
    @Expose
    private AiRecognitionTaskAsrFullTextResult AsrFullTextTask;

    /**
    * Text keyword recognition result, which is valid when `Type` is
 `OcrWordsRecognition`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OcrWordsTask")
    @Expose
    private AiRecognitionTaskOcrWordsResult OcrWordsTask;

    /**
    * Full text recognition result, which is valid when `Type` is
 `OcrFullTextRecognition`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OcrFullTextTask")
    @Expose
    private AiRecognitionTaskOcrFullTextResult OcrFullTextTask;

    /**
    * The translation result. This parameter is valid only if `Type` is
 `TransTextRecognition`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TransTextTask")
    @Expose
    private AiRecognitionTaskTransTextResult TransTextTask;

    /**
    * Object recognition result, which is valid when Type is

ObjectRecognition.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ObjectTask")
    @Expose
    private AiRecognitionTaskObjectResult ObjectTask;

    /**
     * Get The task type. Valid values:
<li>FaceRecognition: Face recognition</li>
<li>AsrWordsRecognition: Speech keyword recognition</li>
<li>OcrWordsRecognition: Text keyword recognition</li>
<li>AsrFullTextRecognition: Full speech recognition</li>
<li>OcrFullTextRecognition: Full text recognition</li>
<li>TransTextRecognition: Speech translation</li> 
     * @return Type The task type. Valid values:
<li>FaceRecognition: Face recognition</li>
<li>AsrWordsRecognition: Speech keyword recognition</li>
<li>OcrWordsRecognition: Text keyword recognition</li>
<li>AsrFullTextRecognition: Full speech recognition</li>
<li>OcrFullTextRecognition: Full text recognition</li>
<li>TransTextRecognition: Speech translation</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set The task type. Valid values:
<li>FaceRecognition: Face recognition</li>
<li>AsrWordsRecognition: Speech keyword recognition</li>
<li>OcrWordsRecognition: Text keyword recognition</li>
<li>AsrFullTextRecognition: Full speech recognition</li>
<li>OcrFullTextRecognition: Full text recognition</li>
<li>TransTextRecognition: Speech translation</li>
     * @param Type The task type. Valid values:
<li>FaceRecognition: Face recognition</li>
<li>AsrWordsRecognition: Speech keyword recognition</li>
<li>OcrWordsRecognition: Text keyword recognition</li>
<li>AsrFullTextRecognition: Full speech recognition</li>
<li>OcrFullTextRecognition: Full text recognition</li>
<li>TransTextRecognition: Speech translation</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Face recognition result, which is valid when `Type` is 
 `FaceRecognition`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FaceTask Face recognition result, which is valid when `Type` is 
 `FaceRecognition`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AiRecognitionTaskFaceResult getFaceTask() {
        return this.FaceTask;
    }

    /**
     * Set Face recognition result, which is valid when `Type` is 
 `FaceRecognition`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FaceTask Face recognition result, which is valid when `Type` is 
 `FaceRecognition`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFaceTask(AiRecognitionTaskFaceResult FaceTask) {
        this.FaceTask = FaceTask;
    }

    /**
     * Get Speech keyword recognition result, which is valid when `Type` is
 `AsrWordsRecognition`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AsrWordsTask Speech keyword recognition result, which is valid when `Type` is
 `AsrWordsRecognition`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AiRecognitionTaskAsrWordsResult getAsrWordsTask() {
        return this.AsrWordsTask;
    }

    /**
     * Set Speech keyword recognition result, which is valid when `Type` is
 `AsrWordsRecognition`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AsrWordsTask Speech keyword recognition result, which is valid when `Type` is
 `AsrWordsRecognition`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAsrWordsTask(AiRecognitionTaskAsrWordsResult AsrWordsTask) {
        this.AsrWordsTask = AsrWordsTask;
    }

    /**
     * Get Full speech recognition result, which is valid when `Type` is
 `AsrFullTextRecognition`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AsrFullTextTask Full speech recognition result, which is valid when `Type` is
 `AsrFullTextRecognition`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AiRecognitionTaskAsrFullTextResult getAsrFullTextTask() {
        return this.AsrFullTextTask;
    }

    /**
     * Set Full speech recognition result, which is valid when `Type` is
 `AsrFullTextRecognition`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AsrFullTextTask Full speech recognition result, which is valid when `Type` is
 `AsrFullTextRecognition`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAsrFullTextTask(AiRecognitionTaskAsrFullTextResult AsrFullTextTask) {
        this.AsrFullTextTask = AsrFullTextTask;
    }

    /**
     * Get Text keyword recognition result, which is valid when `Type` is
 `OcrWordsRecognition`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OcrWordsTask Text keyword recognition result, which is valid when `Type` is
 `OcrWordsRecognition`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AiRecognitionTaskOcrWordsResult getOcrWordsTask() {
        return this.OcrWordsTask;
    }

    /**
     * Set Text keyword recognition result, which is valid when `Type` is
 `OcrWordsRecognition`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OcrWordsTask Text keyword recognition result, which is valid when `Type` is
 `OcrWordsRecognition`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOcrWordsTask(AiRecognitionTaskOcrWordsResult OcrWordsTask) {
        this.OcrWordsTask = OcrWordsTask;
    }

    /**
     * Get Full text recognition result, which is valid when `Type` is
 `OcrFullTextRecognition`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OcrFullTextTask Full text recognition result, which is valid when `Type` is
 `OcrFullTextRecognition`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AiRecognitionTaskOcrFullTextResult getOcrFullTextTask() {
        return this.OcrFullTextTask;
    }

    /**
     * Set Full text recognition result, which is valid when `Type` is
 `OcrFullTextRecognition`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OcrFullTextTask Full text recognition result, which is valid when `Type` is
 `OcrFullTextRecognition`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOcrFullTextTask(AiRecognitionTaskOcrFullTextResult OcrFullTextTask) {
        this.OcrFullTextTask = OcrFullTextTask;
    }

    /**
     * Get The translation result. This parameter is valid only if `Type` is
 `TransTextRecognition`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TransTextTask The translation result. This parameter is valid only if `Type` is
 `TransTextRecognition`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AiRecognitionTaskTransTextResult getTransTextTask() {
        return this.TransTextTask;
    }

    /**
     * Set The translation result. This parameter is valid only if `Type` is
 `TransTextRecognition`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TransTextTask The translation result. This parameter is valid only if `Type` is
 `TransTextRecognition`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTransTextTask(AiRecognitionTaskTransTextResult TransTextTask) {
        this.TransTextTask = TransTextTask;
    }

    /**
     * Get Object recognition result, which is valid when Type is

ObjectRecognition.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ObjectTask Object recognition result, which is valid when Type is

ObjectRecognition.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AiRecognitionTaskObjectResult getObjectTask() {
        return this.ObjectTask;
    }

    /**
     * Set Object recognition result, which is valid when Type is

ObjectRecognition.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ObjectTask Object recognition result, which is valid when Type is

ObjectRecognition.
Note: This field may return null, indicating that no valid values can be obtained.
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

