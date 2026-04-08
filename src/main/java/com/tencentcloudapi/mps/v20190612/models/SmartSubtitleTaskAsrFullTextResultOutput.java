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
    * <p>List of segments for full speech recognition.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SegmentSet")
    @Expose
    private SmartSubtitleTaskAsrFullTextSegmentItem [] SegmentSet;

    /**
    * <p>Subtitle file path</p>
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * <p>Subtitle file URL.</p>
    */
    @SerializedName("SubtitlePath")
    @Expose
    private String SubtitlePath;

    /**
    * <p>Subtitle recognition result info.</p>
    */
    @SerializedName("SubtitleInfo")
    @Expose
    private SubtitleResult SubtitleInfo;

    /**
    * <p>Storage location of the subtitle file.</p>
    */
    @SerializedName("OutputStorage")
    @Expose
    private TaskOutputStorage OutputStorage;

    /**
     * Get <p>List of segments for full speech recognition.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SegmentSet <p>List of segments for full speech recognition.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public SmartSubtitleTaskAsrFullTextSegmentItem [] getSegmentSet() {
        return this.SegmentSet;
    }

    /**
     * Set <p>List of segments for full speech recognition.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SegmentSet <p>List of segments for full speech recognition.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSegmentSet(SmartSubtitleTaskAsrFullTextSegmentItem [] SegmentSet) {
        this.SegmentSet = SegmentSet;
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
     * Get <p>Subtitle recognition result info.</p> 
     * @return SubtitleInfo <p>Subtitle recognition result info.</p>
     */
    public SubtitleResult getSubtitleInfo() {
        return this.SubtitleInfo;
    }

    /**
     * Set <p>Subtitle recognition result info.</p>
     * @param SubtitleInfo <p>Subtitle recognition result info.</p>
     */
    public void setSubtitleInfo(SubtitleResult SubtitleInfo) {
        this.SubtitleInfo = SubtitleInfo;
    }

    /**
     * Get <p>Storage location of the subtitle file.</p> 
     * @return OutputStorage <p>Storage location of the subtitle file.</p>
     */
    public TaskOutputStorage getOutputStorage() {
        return this.OutputStorage;
    }

    /**
     * Set <p>Storage location of the subtitle file.</p>
     * @param OutputStorage <p>Storage location of the subtitle file.</p>
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
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.SubtitlePath != null) {
            this.SubtitlePath = new String(source.SubtitlePath);
        }
        if (source.SubtitleInfo != null) {
            this.SubtitleInfo = new SubtitleResult(source.SubtitleInfo);
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
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "SubtitlePath", this.SubtitlePath);
        this.setParamObj(map, prefix + "SubtitleInfo.", this.SubtitleInfo);
        this.setParamObj(map, prefix + "OutputStorage.", this.OutputStorage);

    }
}

