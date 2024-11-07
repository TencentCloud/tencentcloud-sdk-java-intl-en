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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AiRecognitionTaskAsrFullTextResultOutput extends AbstractModel {

    /**
    * List of full speech recognition segments.
    */
    @SerializedName("SegmentSet")
    @Expose
    private AiRecognitionTaskAsrFullTextSegmentItem [] SegmentSet;

    /**
    * Subtitles file address.
    */
    @SerializedName("SubtitlePath")
    @Expose
    private String SubtitlePath;

    /**
    * Subtitles file storage location.
    */
    @SerializedName("OutputStorage")
    @Expose
    private TaskOutputStorage OutputStorage;

    /**
     * Get List of full speech recognition segments. 
     * @return SegmentSet List of full speech recognition segments.
     */
    public AiRecognitionTaskAsrFullTextSegmentItem [] getSegmentSet() {
        return this.SegmentSet;
    }

    /**
     * Set List of full speech recognition segments.
     * @param SegmentSet List of full speech recognition segments.
     */
    public void setSegmentSet(AiRecognitionTaskAsrFullTextSegmentItem [] SegmentSet) {
        this.SegmentSet = SegmentSet;
    }

    /**
     * Get Subtitles file address. 
     * @return SubtitlePath Subtitles file address.
     */
    public String getSubtitlePath() {
        return this.SubtitlePath;
    }

    /**
     * Set Subtitles file address.
     * @param SubtitlePath Subtitles file address.
     */
    public void setSubtitlePath(String SubtitlePath) {
        this.SubtitlePath = SubtitlePath;
    }

    /**
     * Get Subtitles file storage location. 
     * @return OutputStorage Subtitles file storage location.
     * @deprecated
     */
    @Deprecated
    public TaskOutputStorage getOutputStorage() {
        return this.OutputStorage;
    }

    /**
     * Set Subtitles file storage location.
     * @param OutputStorage Subtitles file storage location.
     * @deprecated
     */
    @Deprecated
    public void setOutputStorage(TaskOutputStorage OutputStorage) {
        this.OutputStorage = OutputStorage;
    }

    public AiRecognitionTaskAsrFullTextResultOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiRecognitionTaskAsrFullTextResultOutput(AiRecognitionTaskAsrFullTextResultOutput source) {
        if (source.SegmentSet != null) {
            this.SegmentSet = new AiRecognitionTaskAsrFullTextSegmentItem[source.SegmentSet.length];
            for (int i = 0; i < source.SegmentSet.length; i++) {
                this.SegmentSet[i] = new AiRecognitionTaskAsrFullTextSegmentItem(source.SegmentSet[i]);
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

