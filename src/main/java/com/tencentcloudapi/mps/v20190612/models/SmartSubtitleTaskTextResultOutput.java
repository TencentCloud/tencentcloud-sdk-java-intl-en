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

public class SmartSubtitleTaskTextResultOutput extends AbstractModel {

    /**
    * 
    */
    @SerializedName("SegmentSet")
    @Expose
    private SmartSubtitleTaskFullTextSegmentItem [] SegmentSet;

    /**
    * 
    */
    @SerializedName("RecognizeSubtitleResult")
    @Expose
    private SubtitleResult [] RecognizeSubtitleResult;

    /**
    * 
    */
    @SerializedName("TransSubtitleResult")
    @Expose
    private SubtitleResult [] TransSubtitleResult;

    /**
    * 
    */
    @SerializedName("OutputStorage")
    @Expose
    private TaskOutputStorage OutputStorage;

    /**
     * Get  
     * @return SegmentSet 
     */
    public SmartSubtitleTaskFullTextSegmentItem [] getSegmentSet() {
        return this.SegmentSet;
    }

    /**
     * Set 
     * @param SegmentSet 
     */
    public void setSegmentSet(SmartSubtitleTaskFullTextSegmentItem [] SegmentSet) {
        this.SegmentSet = SegmentSet;
    }

    /**
     * Get  
     * @return RecognizeSubtitleResult 
     */
    public SubtitleResult [] getRecognizeSubtitleResult() {
        return this.RecognizeSubtitleResult;
    }

    /**
     * Set 
     * @param RecognizeSubtitleResult 
     */
    public void setRecognizeSubtitleResult(SubtitleResult [] RecognizeSubtitleResult) {
        this.RecognizeSubtitleResult = RecognizeSubtitleResult;
    }

    /**
     * Get  
     * @return TransSubtitleResult 
     */
    public SubtitleResult [] getTransSubtitleResult() {
        return this.TransSubtitleResult;
    }

    /**
     * Set 
     * @param TransSubtitleResult 
     */
    public void setTransSubtitleResult(SubtitleResult [] TransSubtitleResult) {
        this.TransSubtitleResult = TransSubtitleResult;
    }

    /**
     * Get  
     * @return OutputStorage 
     */
    public TaskOutputStorage getOutputStorage() {
        return this.OutputStorage;
    }

    /**
     * Set 
     * @param OutputStorage 
     */
    public void setOutputStorage(TaskOutputStorage OutputStorage) {
        this.OutputStorage = OutputStorage;
    }

    public SmartSubtitleTaskTextResultOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SmartSubtitleTaskTextResultOutput(SmartSubtitleTaskTextResultOutput source) {
        if (source.SegmentSet != null) {
            this.SegmentSet = new SmartSubtitleTaskFullTextSegmentItem[source.SegmentSet.length];
            for (int i = 0; i < source.SegmentSet.length; i++) {
                this.SegmentSet[i] = new SmartSubtitleTaskFullTextSegmentItem(source.SegmentSet[i]);
            }
        }
        if (source.RecognizeSubtitleResult != null) {
            this.RecognizeSubtitleResult = new SubtitleResult[source.RecognizeSubtitleResult.length];
            for (int i = 0; i < source.RecognizeSubtitleResult.length; i++) {
                this.RecognizeSubtitleResult[i] = new SubtitleResult(source.RecognizeSubtitleResult[i]);
            }
        }
        if (source.TransSubtitleResult != null) {
            this.TransSubtitleResult = new SubtitleResult[source.TransSubtitleResult.length];
            for (int i = 0; i < source.TransSubtitleResult.length; i++) {
                this.TransSubtitleResult[i] = new SubtitleResult(source.TransSubtitleResult[i]);
            }
        }
        if (source.OutputStorage != null) {
            this.OutputStorage = new TaskOutputStorage(source.OutputStorage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "SegmentSet.", this.SegmentSet);
        this.setParamArrayObj(map, prefix + "RecognizeSubtitleResult.", this.RecognizeSubtitleResult);
        this.setParamArrayObj(map, prefix + "TransSubtitleResult.", this.TransSubtitleResult);
        this.setParamObj(map, prefix + "OutputStorage.", this.OutputStorage);

    }
}

