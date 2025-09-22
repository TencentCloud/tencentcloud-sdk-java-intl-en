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

public class SmartSubtitleTaskAsrFullTextResultOutput extends AbstractModel {

    /**
    * List of segments for full speech recognition.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("SegmentSet")
    @Expose
    private SmartSubtitleTaskAsrFullTextSegmentItem [] SegmentSet;

    /**
    * Subtitle file path.
    */
    @SerializedName("SubtitlePath")
    @Expose
    private String SubtitlePath;

    /**
    * Subtitle file storage location.
    */
    @SerializedName("OutputStorage")
    @Expose
    private TaskOutputStorage OutputStorage;

    /**
     * Get List of segments for full speech recognition.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return SegmentSet List of segments for full speech recognition.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public SmartSubtitleTaskAsrFullTextSegmentItem [] getSegmentSet() {
        return this.SegmentSet;
    }

    /**
     * Set List of segments for full speech recognition.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param SegmentSet List of segments for full speech recognition.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSegmentSet(SmartSubtitleTaskAsrFullTextSegmentItem [] SegmentSet) {
        this.SegmentSet = SegmentSet;
    }

    /**
     * Get Subtitle file path. 
     * @return SubtitlePath Subtitle file path.
     */
    public String getSubtitlePath() {
        return this.SubtitlePath;
    }

    /**
     * Set Subtitle file path.
     * @param SubtitlePath Subtitle file path.
     */
    public void setSubtitlePath(String SubtitlePath) {
        this.SubtitlePath = SubtitlePath;
    }

    /**
     * Get Subtitle file storage location. 
     * @return OutputStorage Subtitle file storage location.
     */
    public TaskOutputStorage getOutputStorage() {
        return this.OutputStorage;
    }

    /**
     * Set Subtitle file storage location.
     * @param OutputStorage Subtitle file storage location.
     */
    public void setOutputStorage(TaskOutputStorage OutputStorage) {
        this.OutputStorage = OutputStorage;
    }

    public SmartSubtitleTaskAsrFullTextResultOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SmartSubtitleTaskAsrFullTextResultOutput(SmartSubtitleTaskAsrFullTextResultOutput source) {
        if (source.SegmentSet != null) {
            this.SegmentSet = new SmartSubtitleTaskAsrFullTextSegmentItem[source.SegmentSet.length];
            for (int i = 0; i < source.SegmentSet.length; i++) {
                this.SegmentSet[i] = new SmartSubtitleTaskAsrFullTextSegmentItem(source.SegmentSet[i]);
            }
        }
        if (source.SubtitlePath != null) {
            this.SubtitlePath = new String(source.SubtitlePath);
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
        this.setParamSimple(map, prefix + "SubtitlePath", this.SubtitlePath);
        this.setParamObj(map, prefix + "OutputStorage.", this.OutputStorage);

    }
}

