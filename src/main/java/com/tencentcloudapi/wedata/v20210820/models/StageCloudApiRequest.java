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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StageCloudApiRequest extends AbstractModel {

    /**
    * No
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * No
    */
    @SerializedName("StageId")
    @Expose
    private String StageId;

    /**
    * No
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * No
    */
    @SerializedName("StageName")
    @Expose
    private String StageName;

    /**
    * No
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * No
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * No
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * No
    */
    @SerializedName("Queue")
    @Expose
    private String Queue;

    /**
    * No
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * No
    */
    @SerializedName("Parameters")
    @Expose
    private Property [] Parameters;

    /**
    * No
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * No
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * No
    */
    @SerializedName("JobType")
    @Expose
    private String JobType;

    /**
    * No
    */
    @SerializedName("WorkFlowId")
    @Expose
    private String WorkFlowId;

    /**
     * Get No 
     * @return ClusterId No
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set No
     * @param ClusterId No
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get No 
     * @return StageId No
     */
    public String getStageId() {
        return this.StageId;
    }

    /**
     * Set No
     * @param StageId No
     */
    public void setStageId(String StageId) {
        this.StageId = StageId;
    }

    /**
     * Get No 
     * @return JobId No
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set No
     * @param JobId No
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get No 
     * @return StageName No
     */
    public String getStageName() {
        return this.StageName;
    }

    /**
     * Set No
     * @param StageName No
     */
    public void setStageName(String StageName) {
        this.StageName = StageName;
    }

    /**
     * Get No 
     * @return Type No
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set No
     * @param Type No
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get No 
     * @return Mode No
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set No
     * @param Mode No
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get No 
     * @return Version No
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set No
     * @param Version No
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get No 
     * @return Queue No
     */
    public String getQueue() {
        return this.Queue;
    }

    /**
     * Set No
     * @param Queue No
     */
    public void setQueue(String Queue) {
        this.Queue = Queue;
    }

    /**
     * Get No 
     * @return Content No
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set No
     * @param Content No
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get No 
     * @return Parameters No
     */
    public Property [] getParameters() {
        return this.Parameters;
    }

    /**
     * Set No
     * @param Parameters No
     */
    public void setParameters(Property [] Parameters) {
        this.Parameters = Parameters;
    }

    /**
     * Get No 
     * @return Description No
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set No
     * @param Description No
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get No 
     * @return ProjectId No
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set No
     * @param ProjectId No
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get No 
     * @return JobType No
     */
    public String getJobType() {
        return this.JobType;
    }

    /**
     * Set No
     * @param JobType No
     */
    public void setJobType(String JobType) {
        this.JobType = JobType;
    }

    /**
     * Get No 
     * @return WorkFlowId No
     */
    public String getWorkFlowId() {
        return this.WorkFlowId;
    }

    /**
     * Set No
     * @param WorkFlowId No
     */
    public void setWorkFlowId(String WorkFlowId) {
        this.WorkFlowId = WorkFlowId;
    }

    public StageCloudApiRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StageCloudApiRequest(StageCloudApiRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.StageId != null) {
            this.StageId = new String(source.StageId);
        }
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.StageName != null) {
            this.StageName = new String(source.StageName);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.Queue != null) {
            this.Queue = new String(source.Queue);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Parameters != null) {
            this.Parameters = new Property[source.Parameters.length];
            for (int i = 0; i < source.Parameters.length; i++) {
                this.Parameters[i] = new Property(source.Parameters[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.JobType != null) {
            this.JobType = new String(source.JobType);
        }
        if (source.WorkFlowId != null) {
            this.WorkFlowId = new String(source.WorkFlowId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "StageId", this.StageId);
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "StageName", this.StageName);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "Queue", this.Queue);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamArrayObj(map, prefix + "Parameters.", this.Parameters);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "JobType", this.JobType);
        this.setParamSimple(map, prefix + "WorkFlowId", this.WorkFlowId);

    }
}

