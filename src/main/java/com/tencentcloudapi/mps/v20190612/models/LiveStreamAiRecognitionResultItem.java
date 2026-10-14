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

public class LiveStreamAiRecognitionResultItem extends AbstractModel {

    /**
    * Result type. Valid values:
<li>FaceRecognition: face recognition.</li>
<li>AsrWordsRecognition: speech keyword recognition.</li>
<li>OcrWordsRecognition: text keyword recognition.</li>
<li>AsrFullTextRecognition: full speech recognition.</li>
<li>OcrFullTextRecognition: full text recognition.</li>
<li>TransTextRecognition: speech translation</li>
<li>ObjectRecognition: object detection.</li>
<li>TagRecognition: highlights marking.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Face recognition result, which is valid when Type is
Valid for FaceRecognition.
    */
    @SerializedName("FaceRecognitionResultSet")
    @Expose
    private LiveStreamFaceRecognitionResult [] FaceRecognitionResultSet;

    /**
    * Speech keyword recognition result. When Type is
Valid when AsrWordsRecognition is used.
    */
    @SerializedName("AsrWordsRecognitionResultSet")
    @Expose
    private LiveStreamAsrWordsRecognitionResult [] AsrWordsRecognitionResultSet;

    /**
    * Text keyword recognition result. When Type is
Valid for OcrWordsRecognition.
    */
    @SerializedName("OcrWordsRecognitionResultSet")
    @Expose
    private LiveStreamOcrWordsRecognitionResult [] OcrWordsRecognitionResultSet;

    /**
    * Full speech recognition result. When Type is
Valid when AsrFullTextRecognition is used.
    */
    @SerializedName("AsrFullTextRecognitionResultSet")
    @Expose
    private LiveStreamAsrFullTextRecognitionResult [] AsrFullTextRecognitionResultSet;

    /**
    * Full text recognition result. This parameter is returned only when `Type` is set to
Valid for OcrFullTextRecognition.
    */
    @SerializedName("OcrFullTextRecognitionResultSet")
    @Expose
    private LiveStreamOcrFullTextRecognitionResult [] OcrFullTextRecognitionResultSet;

    /**
    * Translation result. Valid when Type is TransTextRecognition.
    */
    @SerializedName("TransTextRecognitionResultSet")
    @Expose
    private LiveStreamTransTextRecognitionResult [] TransTextRecognitionResultSet;

    /**
    * Object recognition result, which is valid when Type is ObjectRecognition.
    */
    @SerializedName("ObjectRecognitionResultSet")
    @Expose
    private LiveStreamObjectRecognitionResult [] ObjectRecognitionResultSet;

    /**
    * Marking point result. Valid when Type is TagRecognition.
    */
    @SerializedName("TagRecognitionResultSet")
    @Expose
    private LiveStreamTagRecognitionResult [] TagRecognitionResultSet;

    /**
     * Get Result type. Valid values:
<li>FaceRecognition: face recognition.</li>
<li>AsrWordsRecognition: speech keyword recognition.</li>
<li>OcrWordsRecognition: text keyword recognition.</li>
<li>AsrFullTextRecognition: full speech recognition.</li>
<li>OcrFullTextRecognition: full text recognition.</li>
<li>TransTextRecognition: speech translation</li>
<li>ObjectRecognition: object detection.</li>
<li>TagRecognition: highlights marking.</li> 
     * @return Type Result type. Valid values:
<li>FaceRecognition: face recognition.</li>
<li>AsrWordsRecognition: speech keyword recognition.</li>
<li>OcrWordsRecognition: text keyword recognition.</li>
<li>AsrFullTextRecognition: full speech recognition.</li>
<li>OcrFullTextRecognition: full text recognition.</li>
<li>TransTextRecognition: speech translation</li>
<li>ObjectRecognition: object detection.</li>
<li>TagRecognition: highlights marking.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Result type. Valid values:
<li>FaceRecognition: face recognition.</li>
<li>AsrWordsRecognition: speech keyword recognition.</li>
<li>OcrWordsRecognition: text keyword recognition.</li>
<li>AsrFullTextRecognition: full speech recognition.</li>
<li>OcrFullTextRecognition: full text recognition.</li>
<li>TransTextRecognition: speech translation</li>
<li>ObjectRecognition: object detection.</li>
<li>TagRecognition: highlights marking.</li>
     * @param Type Result type. Valid values:
<li>FaceRecognition: face recognition.</li>
<li>AsrWordsRecognition: speech keyword recognition.</li>
<li>OcrWordsRecognition: text keyword recognition.</li>
<li>AsrFullTextRecognition: full speech recognition.</li>
<li>OcrFullTextRecognition: full text recognition.</li>
<li>TransTextRecognition: speech translation</li>
<li>ObjectRecognition: object detection.</li>
<li>TagRecognition: highlights marking.</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Face recognition result, which is valid when Type is
Valid for FaceRecognition. 
     * @return FaceRecognitionResultSet Face recognition result, which is valid when Type is
Valid for FaceRecognition.
     */
    public LiveStreamFaceRecognitionResult [] getFaceRecognitionResultSet() {
        return this.FaceRecognitionResultSet;
    }

    /**
     * Set Face recognition result, which is valid when Type is
Valid for FaceRecognition.
     * @param FaceRecognitionResultSet Face recognition result, which is valid when Type is
Valid for FaceRecognition.
     */
    public void setFaceRecognitionResultSet(LiveStreamFaceRecognitionResult [] FaceRecognitionResultSet) {
        this.FaceRecognitionResultSet = FaceRecognitionResultSet;
    }

    /**
     * Get Speech keyword recognition result. When Type is
Valid when AsrWordsRecognition is used. 
     * @return AsrWordsRecognitionResultSet Speech keyword recognition result. When Type is
Valid when AsrWordsRecognition is used.
     */
    public LiveStreamAsrWordsRecognitionResult [] getAsrWordsRecognitionResultSet() {
        return this.AsrWordsRecognitionResultSet;
    }

    /**
     * Set Speech keyword recognition result. When Type is
Valid when AsrWordsRecognition is used.
     * @param AsrWordsRecognitionResultSet Speech keyword recognition result. When Type is
Valid when AsrWordsRecognition is used.
     */
    public void setAsrWordsRecognitionResultSet(LiveStreamAsrWordsRecognitionResult [] AsrWordsRecognitionResultSet) {
        this.AsrWordsRecognitionResultSet = AsrWordsRecognitionResultSet;
    }

    /**
     * Get Text keyword recognition result. When Type is
Valid for OcrWordsRecognition. 
     * @return OcrWordsRecognitionResultSet Text keyword recognition result. When Type is
Valid for OcrWordsRecognition.
     */
    public LiveStreamOcrWordsRecognitionResult [] getOcrWordsRecognitionResultSet() {
        return this.OcrWordsRecognitionResultSet;
    }

    /**
     * Set Text keyword recognition result. When Type is
Valid for OcrWordsRecognition.
     * @param OcrWordsRecognitionResultSet Text keyword recognition result. When Type is
Valid for OcrWordsRecognition.
     */
    public void setOcrWordsRecognitionResultSet(LiveStreamOcrWordsRecognitionResult [] OcrWordsRecognitionResultSet) {
        this.OcrWordsRecognitionResultSet = OcrWordsRecognitionResultSet;
    }

    /**
     * Get Full speech recognition result. When Type is
Valid when AsrFullTextRecognition is used. 
     * @return AsrFullTextRecognitionResultSet Full speech recognition result. When Type is
Valid when AsrFullTextRecognition is used.
     */
    public LiveStreamAsrFullTextRecognitionResult [] getAsrFullTextRecognitionResultSet() {
        return this.AsrFullTextRecognitionResultSet;
    }

    /**
     * Set Full speech recognition result. When Type is
Valid when AsrFullTextRecognition is used.
     * @param AsrFullTextRecognitionResultSet Full speech recognition result. When Type is
Valid when AsrFullTextRecognition is used.
     */
    public void setAsrFullTextRecognitionResultSet(LiveStreamAsrFullTextRecognitionResult [] AsrFullTextRecognitionResultSet) {
        this.AsrFullTextRecognitionResultSet = AsrFullTextRecognitionResultSet;
    }

    /**
     * Get Full text recognition result. This parameter is returned only when `Type` is set to
Valid for OcrFullTextRecognition. 
     * @return OcrFullTextRecognitionResultSet Full text recognition result. This parameter is returned only when `Type` is set to
Valid for OcrFullTextRecognition.
     */
    public LiveStreamOcrFullTextRecognitionResult [] getOcrFullTextRecognitionResultSet() {
        return this.OcrFullTextRecognitionResultSet;
    }

    /**
     * Set Full text recognition result. This parameter is returned only when `Type` is set to
Valid for OcrFullTextRecognition.
     * @param OcrFullTextRecognitionResultSet Full text recognition result. This parameter is returned only when `Type` is set to
Valid for OcrFullTextRecognition.
     */
    public void setOcrFullTextRecognitionResultSet(LiveStreamOcrFullTextRecognitionResult [] OcrFullTextRecognitionResultSet) {
        this.OcrFullTextRecognitionResultSet = OcrFullTextRecognitionResultSet;
    }

    /**
     * Get Translation result. Valid when Type is TransTextRecognition. 
     * @return TransTextRecognitionResultSet Translation result. Valid when Type is TransTextRecognition.
     */
    public LiveStreamTransTextRecognitionResult [] getTransTextRecognitionResultSet() {
        return this.TransTextRecognitionResultSet;
    }

    /**
     * Set Translation result. Valid when Type is TransTextRecognition.
     * @param TransTextRecognitionResultSet Translation result. Valid when Type is TransTextRecognition.
     */
    public void setTransTextRecognitionResultSet(LiveStreamTransTextRecognitionResult [] TransTextRecognitionResultSet) {
        this.TransTextRecognitionResultSet = TransTextRecognitionResultSet;
    }

    /**
     * Get Object recognition result, which is valid when Type is ObjectRecognition. 
     * @return ObjectRecognitionResultSet Object recognition result, which is valid when Type is ObjectRecognition.
     */
    public LiveStreamObjectRecognitionResult [] getObjectRecognitionResultSet() {
        return this.ObjectRecognitionResultSet;
    }

    /**
     * Set Object recognition result, which is valid when Type is ObjectRecognition.
     * @param ObjectRecognitionResultSet Object recognition result, which is valid when Type is ObjectRecognition.
     */
    public void setObjectRecognitionResultSet(LiveStreamObjectRecognitionResult [] ObjectRecognitionResultSet) {
        this.ObjectRecognitionResultSet = ObjectRecognitionResultSet;
    }

    /**
     * Get Marking point result. Valid when Type is TagRecognition. 
     * @return TagRecognitionResultSet Marking point result. Valid when Type is TagRecognition.
     */
    public LiveStreamTagRecognitionResult [] getTagRecognitionResultSet() {
        return this.TagRecognitionResultSet;
    }

    /**
     * Set Marking point result. Valid when Type is TagRecognition.
     * @param TagRecognitionResultSet Marking point result. Valid when Type is TagRecognition.
     */
    public void setTagRecognitionResultSet(LiveStreamTagRecognitionResult [] TagRecognitionResultSet) {
        this.TagRecognitionResultSet = TagRecognitionResultSet;
    }

    public LiveStreamAiRecognitionResultItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LiveStreamAiRecognitionResultItem(LiveStreamAiRecognitionResultItem source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.FaceRecognitionResultSet != null) {
            this.FaceRecognitionResultSet = new LiveStreamFaceRecognitionResult[source.FaceRecognitionResultSet.length];
            for (int i = 0; i < source.FaceRecognitionResultSet.length; i++) {
                this.FaceRecognitionResultSet[i] = new LiveStreamFaceRecognitionResult(source.FaceRecognitionResultSet[i]);
            }
        }
        if (source.AsrWordsRecognitionResultSet != null) {
            this.AsrWordsRecognitionResultSet = new LiveStreamAsrWordsRecognitionResult[source.AsrWordsRecognitionResultSet.length];
            for (int i = 0; i < source.AsrWordsRecognitionResultSet.length; i++) {
                this.AsrWordsRecognitionResultSet[i] = new LiveStreamAsrWordsRecognitionResult(source.AsrWordsRecognitionResultSet[i]);
            }
        }
        if (source.OcrWordsRecognitionResultSet != null) {
            this.OcrWordsRecognitionResultSet = new LiveStreamOcrWordsRecognitionResult[source.OcrWordsRecognitionResultSet.length];
            for (int i = 0; i < source.OcrWordsRecognitionResultSet.length; i++) {
                this.OcrWordsRecognitionResultSet[i] = new LiveStreamOcrWordsRecognitionResult(source.OcrWordsRecognitionResultSet[i]);
            }
        }
        if (source.AsrFullTextRecognitionResultSet != null) {
            this.AsrFullTextRecognitionResultSet = new LiveStreamAsrFullTextRecognitionResult[source.AsrFullTextRecognitionResultSet.length];
            for (int i = 0; i < source.AsrFullTextRecognitionResultSet.length; i++) {
                this.AsrFullTextRecognitionResultSet[i] = new LiveStreamAsrFullTextRecognitionResult(source.AsrFullTextRecognitionResultSet[i]);
            }
        }
        if (source.OcrFullTextRecognitionResultSet != null) {
            this.OcrFullTextRecognitionResultSet = new LiveStreamOcrFullTextRecognitionResult[source.OcrFullTextRecognitionResultSet.length];
            for (int i = 0; i < source.OcrFullTextRecognitionResultSet.length; i++) {
                this.OcrFullTextRecognitionResultSet[i] = new LiveStreamOcrFullTextRecognitionResult(source.OcrFullTextRecognitionResultSet[i]);
            }
        }
        if (source.TransTextRecognitionResultSet != null) {
            this.TransTextRecognitionResultSet = new LiveStreamTransTextRecognitionResult[source.TransTextRecognitionResultSet.length];
            for (int i = 0; i < source.TransTextRecognitionResultSet.length; i++) {
                this.TransTextRecognitionResultSet[i] = new LiveStreamTransTextRecognitionResult(source.TransTextRecognitionResultSet[i]);
            }
        }
        if (source.ObjectRecognitionResultSet != null) {
            this.ObjectRecognitionResultSet = new LiveStreamObjectRecognitionResult[source.ObjectRecognitionResultSet.length];
            for (int i = 0; i < source.ObjectRecognitionResultSet.length; i++) {
                this.ObjectRecognitionResultSet[i] = new LiveStreamObjectRecognitionResult(source.ObjectRecognitionResultSet[i]);
            }
        }
        if (source.TagRecognitionResultSet != null) {
            this.TagRecognitionResultSet = new LiveStreamTagRecognitionResult[source.TagRecognitionResultSet.length];
            for (int i = 0; i < source.TagRecognitionResultSet.length; i++) {
                this.TagRecognitionResultSet[i] = new LiveStreamTagRecognitionResult(source.TagRecognitionResultSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "FaceRecognitionResultSet.", this.FaceRecognitionResultSet);
        this.setParamArrayObj(map, prefix + "AsrWordsRecognitionResultSet.", this.AsrWordsRecognitionResultSet);
        this.setParamArrayObj(map, prefix + "OcrWordsRecognitionResultSet.", this.OcrWordsRecognitionResultSet);
        this.setParamArrayObj(map, prefix + "AsrFullTextRecognitionResultSet.", this.AsrFullTextRecognitionResultSet);
        this.setParamArrayObj(map, prefix + "OcrFullTextRecognitionResultSet.", this.OcrFullTextRecognitionResultSet);
        this.setParamArrayObj(map, prefix + "TransTextRecognitionResultSet.", this.TransTextRecognitionResultSet);
        this.setParamArrayObj(map, prefix + "ObjectRecognitionResultSet.", this.ObjectRecognitionResultSet);
        this.setParamArrayObj(map, prefix + "TagRecognitionResultSet.", this.TagRecognitionResultSet);

    }
}

