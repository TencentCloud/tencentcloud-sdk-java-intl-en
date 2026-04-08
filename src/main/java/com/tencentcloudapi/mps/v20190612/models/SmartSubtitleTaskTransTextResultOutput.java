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

public class SmartSubtitleTaskTransTextResultOutput extends AbstractModel {

    /**
    * <p>List of segments for translation.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SegmentSet")
    @Expose
    private SmartSubtitleTaskTransTextSegmentItem [] SegmentSet;

    /**
    * <p>Subtitle file URL.</p>
    */
    @SerializedName("SubtitlePath")
    @Expose
    private String SubtitlePath;

    /**
    * <p>Smart subtitling result storage information.</p>
    */
    @SerializedName("OutputStorage")
    @Expose
    private TaskOutputStorage OutputStorage;

    /**
    * <p>Subtitle file path</p>
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * <p>Returned translation result during multilingual translation.</p>
    */
    @SerializedName("SubtitleResults")
    @Expose
    private SubtitleTransResultItem [] SubtitleResults;

    /**
     * Get <p>List of segments for translation.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SegmentSet <p>List of segments for translation.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public SmartSubtitleTaskTransTextSegmentItem [] getSegmentSet() {
        return this.SegmentSet;
    }

    /**
     * Set <p>List of segments for translation.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SegmentSet <p>List of segments for translation.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSegmentSet(SmartSubtitleTaskTransTextSegmentItem [] SegmentSet) {
        this.SegmentSet = SegmentSet;
    }

    /**
     * Get <p>Subtitle file URL.</p> 
     * @return SubtitlePath <p>Subtitle file URL.</p>
     */
    public String getSubtitlePath() {
        return this.SubtitlePath;
    }

    /**
     * Set <p>Subtitle file URL.</p>
     * @param SubtitlePath <p>Subtitle file URL.</p>
     */
    public void setSubtitlePath(String SubtitlePath) {
        this.SubtitlePath = SubtitlePath;
    }

    /**
     * Get <p>Smart subtitling result storage information.</p> 
     * @return OutputStorage <p>Smart subtitling result storage information.</p>
     */
    public TaskOutputStorage getOutputStorage() {
        return this.OutputStorage;
    }

    /**
     * Set <p>Smart subtitling result storage information.</p>
     * @param OutputStorage <p>Smart subtitling result storage information.</p>
     */
    public void setOutputStorage(TaskOutputStorage OutputStorage) {
        this.OutputStorage = OutputStorage;
    }

    /**
     * Get <p>Subtitle file path</p> 
     * @return Path <p>Subtitle file path</p>
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set <p>Subtitle file path</p>
     * @param Path <p>Subtitle file path</p>
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get <p>Returned translation result during multilingual translation.</p> 
     * @return SubtitleResults <p>Returned translation result during multilingual translation.</p>
     */
    public SubtitleTransResultItem [] getSubtitleResults() {
        return this.SubtitleResults;
    }

    /**
     * Set <p>Returned translation result during multilingual translation.</p>
     * @param SubtitleResults <p>Returned translation result during multilingual translation.</p>
     */
    public void setSubtitleResults(SubtitleTransResultItem [] SubtitleResults) {
        this.SubtitleResults = SubtitleResults;
    }

    public SmartSubtitleTaskTransTextResultOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SmartSubtitleTaskTransTextResultOutput(SmartSubtitleTaskTransTextResultOutput source) {
        if (source.SegmentSet != null) {
            this.SegmentSet = new SmartSubtitleTaskTransTextSegmentItem[source.SegmentSet.length];
            for (int i = 0; i < source.SegmentSet.length; i++) {
                this.SegmentSet[i] = new SmartSubtitleTaskTransTextSegmentItem(source.SegmentSet[i]);
            }
        }
        if (source.SubtitlePath != null) {
            this.SubtitlePath = new String(source.SubtitlePath);
        }
        if (source.OutputStorage != null) {
            this.OutputStorage = new TaskOutputStorage(source.OutputStorage);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.SubtitleResults != null) {
            this.SubtitleResults = new SubtitleTransResultItem[source.SubtitleResults.length];
            for (int i = 0; i < source.SubtitleResults.length; i++) {
                this.SubtitleResults[i] = new SubtitleTransResultItem(source.SubtitleResults[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "SegmentSet.", this.SegmentSet);
        this.setParamSimple(map, prefix + "SubtitlePath", this.SubtitlePath);
        this.setParamObj(map, prefix + "OutputStorage.", this.OutputStorage);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamArrayObj(map, prefix + "SubtitleResults.", this.SubtitleResults);

    }
}

