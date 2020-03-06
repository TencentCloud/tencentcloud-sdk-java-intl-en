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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AiRecognitionResult extends AbstractModel{

    /**
    * Task type. Valid values:
<li>FaceRecognition: face recognition,</li>
<li>AsrWordsRecognition: speech keyword recognition,</li>
<li>OcrWordsRecognition: text keyword recognition,</li>
<li>AsrFullTextRecognition: full speech recognition,</li>
<li>OcrFullTextRecognition: full text recognition,</li>
<li>HeadTailRecognition: video opening and ending credits recognition,</li>
<li>ObjectRecognition: object recognition.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Video opening and ending credits recognition result, which is valid when `Type` is
 `HeadTailRecognition`.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HeadTailTask")
    @Expose
    private AiRecognitionTaskHeadTailResult HeadTailTask;

    /**
    * Video splitting recognition result, which is valid when `Type` is
 `SegmentRecognition`.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SegmentTask")
    @Expose
    private AiRecognitionTaskSegmentResult SegmentTask;

    /**
    * Face recognition result, which is valid when `Type` is 
 `FaceRecognition`.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FaceTask")
    @Expose
    private AiRecognitionTaskFaceResult FaceTask;

    /**
    * Speech keyword recognition result, which is valid when `Type` is
 `AsrWordsRecognition`.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AsrWordsTask")
    @Expose
    private AiRecognitionTaskAsrWordsResult AsrWordsTask;

    /**
    * Full speech recognition result, which is valid when `Type` is
 `AsrFullTextRecognition`.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AsrFullTextTask")
    @Expose
    private AiRecognitionTaskAsrFullTextResult AsrFullTextTask;

    /**
    * Text keyword recognition result, which is valid when `Type` is
 `OcrWordsRecognition`.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OcrWordsTask")
    @Expose
    private AiRecognitionTaskOcrWordsResult OcrWordsTask;

    /**
    * Full text recognition result, which is valid when `Type` is
 `OcrFullTextRecognition`.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OcrFullTextTask")
    @Expose
    private AiRecognitionTaskOcrFullTextResult OcrFullTextTask;

    /**
    * Object recognition result, which is valid when `Type` is
 `ObjectRecognition`.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ObjectTask")
    @Expose
    private AiRecognitionTaskObjectResult ObjectTask;

    /**
     * Get Task type. Valid values:
<li>FaceRecognition: face recognition,</li>
<li>AsrWordsRecognition: speech keyword recognition,</li>
<li>OcrWordsRecognition: text keyword recognition,</li>
<li>AsrFullTextRecognition: full speech recognition,</li>
<li>OcrFullTextRecognition: full text recognition,</li>
<li>HeadTailRecognition: video opening and ending credits recognition,</li>
<li>ObjectRecognition: object recognition.</li> 
     * @return Type Task type. Valid values:
<li>FaceRecognition: face recognition,</li>
<li>AsrWordsRecognition: speech keyword recognition,</li>
<li>OcrWordsRecognition: text keyword recognition,</li>
<li>AsrFullTextRecognition: full speech recognition,</li>
<li>OcrFullTextRecognition: full text recognition,</li>
<li>HeadTailRecognition: video opening and ending credits recognition,</li>
<li>ObjectRecognition: object recognition.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Task type. Valid values:
<li>FaceRecognition: face recognition,</li>
<li>AsrWordsRecognition: speech keyword recognition,</li>
<li>OcrWordsRecognition: text keyword recognition,</li>
<li>AsrFullTextRecognition: full speech recognition,</li>
<li>OcrFullTextRecognition: full text recognition,</li>
<li>HeadTailRecognition: video opening and ending credits recognition,</li>
<li>ObjectRecognition: object recognition.</li>
     * @param Type Task type. Valid values:
<li>FaceRecognition: face recognition,</li>
<li>AsrWordsRecognition: speech keyword recognition,</li>
<li>OcrWordsRecognition: text keyword recognition,</li>
<li>AsrFullTextRecognition: full speech recognition,</li>
<li>OcrFullTextRecognition: full text recognition,</li>
<li>HeadTailRecognition: video opening and ending credits recognition,</li>
<li>ObjectRecognition: object recognition.</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Video opening and ending credits recognition result, which is valid when `Type` is
 `HeadTailRecognition`.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return HeadTailTask Video opening and ending credits recognition result, which is valid when `Type` is
 `HeadTailRecognition`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public AiRecognitionTaskHeadTailResult getHeadTailTask() {
        return this.HeadTailTask;
    }

    /**
     * Set Video opening and ending credits recognition result, which is valid when `Type` is
 `HeadTailRecognition`.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param HeadTailTask Video opening and ending credits recognition result, which is valid when `Type` is
 `HeadTailRecognition`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setHeadTailTask(AiRecognitionTaskHeadTailResult HeadTailTask) {
        this.HeadTailTask = HeadTailTask;
    }

    /**
     * Get Video splitting recognition result, which is valid when `Type` is
 `SegmentRecognition`.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SegmentTask Video splitting recognition result, which is valid when `Type` is
 `SegmentRecognition`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public AiRecognitionTaskSegmentResult getSegmentTask() {
        return this.SegmentTask;
    }

    /**
     * Set Video splitting recognition result, which is valid when `Type` is
 `SegmentRecognition`.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SegmentTask Video splitting recognition result, which is valid when `Type` is
 `SegmentRecognition`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSegmentTask(AiRecognitionTaskSegmentResult SegmentTask) {
        this.SegmentTask = SegmentTask;
    }

    /**
     * Get Face recognition result, which is valid when `Type` is 
 `FaceRecognition`.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return FaceTask Face recognition result, which is valid when `Type` is 
 `FaceRecognition`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public AiRecognitionTaskFaceResult getFaceTask() {
        return this.FaceTask;
    }

    /**
     * Set Face recognition result, which is valid when `Type` is 
 `FaceRecognition`.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param FaceTask Face recognition result, which is valid when `Type` is 
 `FaceRecognition`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setFaceTask(AiRecognitionTaskFaceResult FaceTask) {
        this.FaceTask = FaceTask;
    }

    /**
     * Get Speech keyword recognition result, which is valid when `Type` is
 `AsrWordsRecognition`.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AsrWordsTask Speech keyword recognition result, which is valid when `Type` is
 `AsrWordsRecognition`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public AiRecognitionTaskAsrWordsResult getAsrWordsTask() {
        return this.AsrWordsTask;
    }

    /**
     * Set Speech keyword recognition result, which is valid when `Type` is
 `AsrWordsRecognition`.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AsrWordsTask Speech keyword recognition result, which is valid when `Type` is
 `AsrWordsRecognition`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAsrWordsTask(AiRecognitionTaskAsrWordsResult AsrWordsTask) {
        this.AsrWordsTask = AsrWordsTask;
    }

    /**
     * Get Full speech recognition result, which is valid when `Type` is
 `AsrFullTextRecognition`.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AsrFullTextTask Full speech recognition result, which is valid when `Type` is
 `AsrFullTextRecognition`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public AiRecognitionTaskAsrFullTextResult getAsrFullTextTask() {
        return this.AsrFullTextTask;
    }

    /**
     * Set Full speech recognition result, which is valid when `Type` is
 `AsrFullTextRecognition`.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AsrFullTextTask Full speech recognition result, which is valid when `Type` is
 `AsrFullTextRecognition`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAsrFullTextTask(AiRecognitionTaskAsrFullTextResult AsrFullTextTask) {
        this.AsrFullTextTask = AsrFullTextTask;
    }

    /**
     * Get Text keyword recognition result, which is valid when `Type` is
 `OcrWordsRecognition`.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return OcrWordsTask Text keyword recognition result, which is valid when `Type` is
 `OcrWordsRecognition`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public AiRecognitionTaskOcrWordsResult getOcrWordsTask() {
        return this.OcrWordsTask;
    }

    /**
     * Set Text keyword recognition result, which is valid when `Type` is
 `OcrWordsRecognition`.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param OcrWordsTask Text keyword recognition result, which is valid when `Type` is
 `OcrWordsRecognition`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setOcrWordsTask(AiRecognitionTaskOcrWordsResult OcrWordsTask) {
        this.OcrWordsTask = OcrWordsTask;
    }

    /**
     * Get Full text recognition result, which is valid when `Type` is
 `OcrFullTextRecognition`.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return OcrFullTextTask Full text recognition result, which is valid when `Type` is
 `OcrFullTextRecognition`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public AiRecognitionTaskOcrFullTextResult getOcrFullTextTask() {
        return this.OcrFullTextTask;
    }

    /**
     * Set Full text recognition result, which is valid when `Type` is
 `OcrFullTextRecognition`.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param OcrFullTextTask Full text recognition result, which is valid when `Type` is
 `OcrFullTextRecognition`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setOcrFullTextTask(AiRecognitionTaskOcrFullTextResult OcrFullTextTask) {
        this.OcrFullTextTask = OcrFullTextTask;
    }

    /**
     * Get Object recognition result, which is valid when `Type` is
 `ObjectRecognition`.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ObjectTask Object recognition result, which is valid when `Type` is
 `ObjectRecognition`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public AiRecognitionTaskObjectResult getObjectTask() {
        return this.ObjectTask;
    }

    /**
     * Set Object recognition result, which is valid when `Type` is
 `ObjectRecognition`.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ObjectTask Object recognition result, which is valid when `Type` is
 `ObjectRecognition`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setObjectTask(AiRecognitionTaskObjectResult ObjectTask) {
        this.ObjectTask = ObjectTask;
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
        this.setParamObj(map, prefix + "OcrWordsTask.", this.OcrWordsTask);
        this.setParamObj(map, prefix + "OcrFullTextTask.", this.OcrFullTextTask);
        this.setParamObj(map, prefix + "ObjectTask.", this.ObjectTask);

    }
}

