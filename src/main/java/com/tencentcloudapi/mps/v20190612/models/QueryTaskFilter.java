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

public class QueryTaskFilter extends AbstractModel {

    /**
    * <p>Task ID.</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>Task type</p><p>Enumeration values:</p><ul><li>RedrawVideo: Video redraw</li><li>AIDrama: AI drama</li><li>DocGenVideo: Document to video</li><li>FissionVideo: Video fission</li></ul>
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * <p>Task status.</p>
    */
    @SerializedName("TaskStatus")
    @Expose
    private String TaskStatus;

    /**
    * <p>Resolution</p>
    */
    @SerializedName("Resolution")
    @Expose
    private String Resolution;

    /**
    * <p>Aspect ratio.</p>
    */
    @SerializedName("Ratio")
    @Expose
    private String Ratio;

    /**
    * <p>Task execution mode</p><p>Enumeration values:</p><ul><li>auto: Direct generation</li><li>phased: Generate after confirmation</li></ul>
    */
    @SerializedName("ExecuteMode")
    @Expose
    private String ExecuteMode;

    /**
    * <p>Fission task video type filter: ugc, talk, display, unboxing, reaction</p><p>Enumeration values:</p><ul><li>ugc: UGC recommendation</li><li>talk: Product talk-over</li><li>display: Product display</li><li>unboxing: Unboxing sharing</li><li>reaction: Reaction display</li></ul>
    */
    @SerializedName("VideoType")
    @Expose
    private String VideoType;

    /**
    * <p>Model type</p><p>Enumeration values:</p><ul><li>standard: standard version</li><li>flagship: advanced edition</li></ul>
    */
    @SerializedName("ModelTier")
    @Expose
    private String ModelTier;

    /**
     * Get <p>Task ID.</p> 
     * @return TaskId <p>Task ID.</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>Task ID.</p>
     * @param TaskId <p>Task ID.</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>Task type</p><p>Enumeration values:</p><ul><li>RedrawVideo: Video redraw</li><li>AIDrama: AI drama</li><li>DocGenVideo: Document to video</li><li>FissionVideo: Video fission</li></ul> 
     * @return TaskType <p>Task type</p><p>Enumeration values:</p><ul><li>RedrawVideo: Video redraw</li><li>AIDrama: AI drama</li><li>DocGenVideo: Document to video</li><li>FissionVideo: Video fission</li></ul>
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set <p>Task type</p><p>Enumeration values:</p><ul><li>RedrawVideo: Video redraw</li><li>AIDrama: AI drama</li><li>DocGenVideo: Document to video</li><li>FissionVideo: Video fission</li></ul>
     * @param TaskType <p>Task type</p><p>Enumeration values:</p><ul><li>RedrawVideo: Video redraw</li><li>AIDrama: AI drama</li><li>DocGenVideo: Document to video</li><li>FissionVideo: Video fission</li></ul>
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get <p>Task status.</p> 
     * @return TaskStatus <p>Task status.</p>
     */
    public String getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set <p>Task status.</p>
     * @param TaskStatus <p>Task status.</p>
     */
    public void setTaskStatus(String TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get <p>Resolution</p> 
     * @return Resolution <p>Resolution</p>
     */
    public String getResolution() {
        return this.Resolution;
    }

    /**
     * Set <p>Resolution</p>
     * @param Resolution <p>Resolution</p>
     */
    public void setResolution(String Resolution) {
        this.Resolution = Resolution;
    }

    /**
     * Get <p>Aspect ratio.</p> 
     * @return Ratio <p>Aspect ratio.</p>
     */
    public String getRatio() {
        return this.Ratio;
    }

    /**
     * Set <p>Aspect ratio.</p>
     * @param Ratio <p>Aspect ratio.</p>
     */
    public void setRatio(String Ratio) {
        this.Ratio = Ratio;
    }

    /**
     * Get <p>Task execution mode</p><p>Enumeration values:</p><ul><li>auto: Direct generation</li><li>phased: Generate after confirmation</li></ul> 
     * @return ExecuteMode <p>Task execution mode</p><p>Enumeration values:</p><ul><li>auto: Direct generation</li><li>phased: Generate after confirmation</li></ul>
     */
    public String getExecuteMode() {
        return this.ExecuteMode;
    }

    /**
     * Set <p>Task execution mode</p><p>Enumeration values:</p><ul><li>auto: Direct generation</li><li>phased: Generate after confirmation</li></ul>
     * @param ExecuteMode <p>Task execution mode</p><p>Enumeration values:</p><ul><li>auto: Direct generation</li><li>phased: Generate after confirmation</li></ul>
     */
    public void setExecuteMode(String ExecuteMode) {
        this.ExecuteMode = ExecuteMode;
    }

    /**
     * Get <p>Fission task video type filter: ugc, talk, display, unboxing, reaction</p><p>Enumeration values:</p><ul><li>ugc: UGC recommendation</li><li>talk: Product talk-over</li><li>display: Product display</li><li>unboxing: Unboxing sharing</li><li>reaction: Reaction display</li></ul> 
     * @return VideoType <p>Fission task video type filter: ugc, talk, display, unboxing, reaction</p><p>Enumeration values:</p><ul><li>ugc: UGC recommendation</li><li>talk: Product talk-over</li><li>display: Product display</li><li>unboxing: Unboxing sharing</li><li>reaction: Reaction display</li></ul>
     */
    public String getVideoType() {
        return this.VideoType;
    }

    /**
     * Set <p>Fission task video type filter: ugc, talk, display, unboxing, reaction</p><p>Enumeration values:</p><ul><li>ugc: UGC recommendation</li><li>talk: Product talk-over</li><li>display: Product display</li><li>unboxing: Unboxing sharing</li><li>reaction: Reaction display</li></ul>
     * @param VideoType <p>Fission task video type filter: ugc, talk, display, unboxing, reaction</p><p>Enumeration values:</p><ul><li>ugc: UGC recommendation</li><li>talk: Product talk-over</li><li>display: Product display</li><li>unboxing: Unboxing sharing</li><li>reaction: Reaction display</li></ul>
     */
    public void setVideoType(String VideoType) {
        this.VideoType = VideoType;
    }

    /**
     * Get <p>Model type</p><p>Enumeration values:</p><ul><li>standard: standard version</li><li>flagship: advanced edition</li></ul> 
     * @return ModelTier <p>Model type</p><p>Enumeration values:</p><ul><li>standard: standard version</li><li>flagship: advanced edition</li></ul>
     */
    public String getModelTier() {
        return this.ModelTier;
    }

    /**
     * Set <p>Model type</p><p>Enumeration values:</p><ul><li>standard: standard version</li><li>flagship: advanced edition</li></ul>
     * @param ModelTier <p>Model type</p><p>Enumeration values:</p><ul><li>standard: standard version</li><li>flagship: advanced edition</li></ul>
     */
    public void setModelTier(String ModelTier) {
        this.ModelTier = ModelTier;
    }

    public QueryTaskFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryTaskFilter(QueryTaskFilter source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.TaskStatus != null) {
            this.TaskStatus = new String(source.TaskStatus);
        }
        if (source.Resolution != null) {
            this.Resolution = new String(source.Resolution);
        }
        if (source.Ratio != null) {
            this.Ratio = new String(source.Ratio);
        }
        if (source.ExecuteMode != null) {
            this.ExecuteMode = new String(source.ExecuteMode);
        }
        if (source.VideoType != null) {
            this.VideoType = new String(source.VideoType);
        }
        if (source.ModelTier != null) {
            this.ModelTier = new String(source.ModelTier);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);
        this.setParamSimple(map, prefix + "Resolution", this.Resolution);
        this.setParamSimple(map, prefix + "Ratio", this.Ratio);
        this.setParamSimple(map, prefix + "ExecuteMode", this.ExecuteMode);
        this.setParamSimple(map, prefix + "VideoType", this.VideoType);
        this.setParamSimple(map, prefix + "ModelTier", this.ModelTier);

    }
}

