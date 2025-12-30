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
    * Subtitle recognition result.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RecognizeSubtitleResult")
    @Expose
    private SubtitleResult [] RecognizeSubtitleResult;

    /**
    * Subtitle translation result.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TransSubtitleResult")
    @Expose
    private SubtitleResult [] TransSubtitleResult;

    /**
    * Storage location of the subtitle file.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OutputStorage")
    @Expose
    private TaskOutputStorage OutputStorage;

    /**
     * Get Subtitle recognition result.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RecognizeSubtitleResult Subtitle recognition result.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public SubtitleResult [] getRecognizeSubtitleResult() {
        return this.RecognizeSubtitleResult;
    }

    /**
     * Set Subtitle recognition result.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RecognizeSubtitleResult Subtitle recognition result.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRecognizeSubtitleResult(SubtitleResult [] RecognizeSubtitleResult) {
        this.RecognizeSubtitleResult = RecognizeSubtitleResult;
    }

    /**
     * Get Subtitle translation result.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TransSubtitleResult Subtitle translation result.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public SubtitleResult [] getTransSubtitleResult() {
        return this.TransSubtitleResult;
    }

    /**
     * Set Subtitle translation result.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TransSubtitleResult Subtitle translation result.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTransSubtitleResult(SubtitleResult [] TransSubtitleResult) {
        this.TransSubtitleResult = TransSubtitleResult;
    }

    /**
     * Get Storage location of the subtitle file.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OutputStorage Storage location of the subtitle file.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TaskOutputStorage getOutputStorage() {
        return this.OutputStorage;
    }

    /**
     * Set Storage location of the subtitle file.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OutputStorage Storage location of the subtitle file.
Note: This field may return null, indicating that no valid values can be obtained.
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
        this.setParamArrayObj(map, prefix + "RecognizeSubtitleResult.", this.RecognizeSubtitleResult);
        this.setParamArrayObj(map, prefix + "TransSubtitleResult.", this.TransSubtitleResult);
        this.setParamObj(map, prefix + "OutputStorage.", this.OutputStorage);

    }
}

