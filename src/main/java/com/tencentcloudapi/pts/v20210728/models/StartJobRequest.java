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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StartJobRequest extends AbstractModel {

    /**
    * Scenario ID.
    */
    @SerializedName("ScenarioId")
    @Expose
    private String ScenarioId;

    /**
    * Job initiator.
    */
    @SerializedName("JobOwner")
    @Expose
    private String JobOwner;

    /**
    * Project ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * If is debug mode.
    */
    @SerializedName("Debug")
    @Expose
    private Boolean Debug;

    /**
    * Note.
    */
    @SerializedName("Note")
    @Expose
    private String Note;

    /**
     * Get Scenario ID. 
     * @return ScenarioId Scenario ID.
     */
    public String getScenarioId() {
        return this.ScenarioId;
    }

    /**
     * Set Scenario ID.
     * @param ScenarioId Scenario ID.
     */
    public void setScenarioId(String ScenarioId) {
        this.ScenarioId = ScenarioId;
    }

    /**
     * Get Job initiator. 
     * @return JobOwner Job initiator.
     */
    public String getJobOwner() {
        return this.JobOwner;
    }

    /**
     * Set Job initiator.
     * @param JobOwner Job initiator.
     */
    public void setJobOwner(String JobOwner) {
        this.JobOwner = JobOwner;
    }

    /**
     * Get Project ID. 
     * @return ProjectId Project ID.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID.
     * @param ProjectId Project ID.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get If is debug mode. 
     * @return Debug If is debug mode.
     */
    public Boolean getDebug() {
        return this.Debug;
    }

    /**
     * Set If is debug mode.
     * @param Debug If is debug mode.
     */
    public void setDebug(Boolean Debug) {
        this.Debug = Debug;
    }

    /**
     * Get Note. 
     * @return Note Note.
     */
    public String getNote() {
        return this.Note;
    }

    /**
     * Set Note.
     * @param Note Note.
     */
    public void setNote(String Note) {
        this.Note = Note;
    }

    public StartJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StartJobRequest(StartJobRequest source) {
        if (source.ScenarioId != null) {
            this.ScenarioId = new String(source.ScenarioId);
        }
        if (source.JobOwner != null) {
            this.JobOwner = new String(source.JobOwner);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Debug != null) {
            this.Debug = new Boolean(source.Debug);
        }
        if (source.Note != null) {
            this.Note = new String(source.Note);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ScenarioId", this.ScenarioId);
        this.setParamSimple(map, prefix + "JobOwner", this.JobOwner);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Debug", this.Debug);
        this.setParamSimple(map, prefix + "Note", this.Note);

    }
}

