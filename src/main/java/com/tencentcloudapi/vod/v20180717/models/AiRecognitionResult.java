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
    * 
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 
    */
    @SerializedName("HeadTailTask")
    @Expose
    private AiRecognitionTaskHeadTailResult HeadTailTask;

    /**
    * 
    */
    @SerializedName("SegmentTask")
    @Expose
    private AiRecognitionTaskSegmentResult SegmentTask;

    /**
    * 
    */
    @SerializedName("FaceTask")
    @Expose
    private AiRecognitionTaskFaceResult FaceTask;

    /**
    * 
    */
    @SerializedName("AsrWordsTask")
    @Expose
    private AiRecognitionTaskAsrWordsResult AsrWordsTask;

    /**
    * 
    */
    @SerializedName("AsrFullTextTask")
    @Expose
    private AiRecognitionTaskAsrFullTextResult AsrFullTextTask;

    /**
    * 
    */
    @SerializedName("AsrTranslateTask")
    @Expose
    private AiRecognitionTaskAsrTranslateResult AsrTranslateTask;

    /**
    * 
    */
    @SerializedName("OcrWordsTask")
    @Expose
    private AiRecognitionTaskOcrWordsResult OcrWordsTask;

    /**
    * 
    */
    @SerializedName("OcrFullTextTask")
    @Expose
    private AiRecognitionTaskOcrFullTextResult OcrFullTextTask;

    /**
    * 
    */
    @SerializedName("ObjectTask")
    @Expose
    private AiRecognitionTaskObjectResult ObjectTask;

    /**
     * Get  
     * @return Type 
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 
     * @param Type 
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get  
     * @return HeadTailTask 
     */
    public AiRecognitionTaskHeadTailResult getHeadTailTask() {
        return this.HeadTailTask;
    }

    /**
     * Set 
     * @param HeadTailTask 
     */
    public void setHeadTailTask(AiRecognitionTaskHeadTailResult HeadTailTask) {
        this.HeadTailTask = HeadTailTask;
    }

    /**
     * Get  
     * @return SegmentTask 
     */
    public AiRecognitionTaskSegmentResult getSegmentTask() {
        return this.SegmentTask;
    }

    /**
     * Set 
     * @param SegmentTask 
     */
    public void setSegmentTask(AiRecognitionTaskSegmentResult SegmentTask) {
        this.SegmentTask = SegmentTask;
    }

    /**
     * Get  
     * @return FaceTask 
     */
    public AiRecognitionTaskFaceResult getFaceTask() {
        return this.FaceTask;
    }

    /**
     * Set 
     * @param FaceTask 
     */
    public void setFaceTask(AiRecognitionTaskFaceResult FaceTask) {
        this.FaceTask = FaceTask;
    }

    /**
     * Get  
     * @return AsrWordsTask 
     */
    public AiRecognitionTaskAsrWordsResult getAsrWordsTask() {
        return this.AsrWordsTask;
    }

    /**
     * Set 
     * @param AsrWordsTask 
     */
    public void setAsrWordsTask(AiRecognitionTaskAsrWordsResult AsrWordsTask) {
        this.AsrWordsTask = AsrWordsTask;
    }

    /**
     * Get  
     * @return AsrFullTextTask 
     */
    public AiRecognitionTaskAsrFullTextResult getAsrFullTextTask() {
        return this.AsrFullTextTask;
    }

    /**
     * Set 
     * @param AsrFullTextTask 
     */
    public void setAsrFullTextTask(AiRecognitionTaskAsrFullTextResult AsrFullTextTask) {
        this.AsrFullTextTask = AsrFullTextTask;
    }

    /**
     * Get  
     * @return AsrTranslateTask 
     */
    public AiRecognitionTaskAsrTranslateResult getAsrTranslateTask() {
        return this.AsrTranslateTask;
    }

    /**
     * Set 
     * @param AsrTranslateTask 
     */
    public void setAsrTranslateTask(AiRecognitionTaskAsrTranslateResult AsrTranslateTask) {
        this.AsrTranslateTask = AsrTranslateTask;
    }

    /**
     * Get  
     * @return OcrWordsTask 
     */
    public AiRecognitionTaskOcrWordsResult getOcrWordsTask() {
        return this.OcrWordsTask;
    }

    /**
     * Set 
     * @param OcrWordsTask 
     */
    public void setOcrWordsTask(AiRecognitionTaskOcrWordsResult OcrWordsTask) {
        this.OcrWordsTask = OcrWordsTask;
    }

    /**
     * Get  
     * @return OcrFullTextTask 
     */
    public AiRecognitionTaskOcrFullTextResult getOcrFullTextTask() {
        return this.OcrFullTextTask;
    }

    /**
     * Set 
     * @param OcrFullTextTask 
     */
    public void setOcrFullTextTask(AiRecognitionTaskOcrFullTextResult OcrFullTextTask) {
        this.OcrFullTextTask = OcrFullTextTask;
    }

    /**
     * Get  
     * @return ObjectTask 
     */
    public AiRecognitionTaskObjectResult getObjectTask() {
        return this.ObjectTask;
    }

    /**
     * Set 
     * @param ObjectTask 
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

