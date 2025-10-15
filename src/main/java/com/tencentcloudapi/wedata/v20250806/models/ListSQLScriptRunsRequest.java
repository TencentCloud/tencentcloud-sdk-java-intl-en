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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListSQLScriptRunsRequest extends AbstractModel {

    /**
    * Project ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Script id.
    */
    @SerializedName("ScriptId")
    @Expose
    private String ScriptId;

    /**
    * Task ID.
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * Search keywords.
    */
    @SerializedName("SearchWord")
    @Expose
    private String SearchWord;

    /**
    * Specifies the executor ID.
    */
    @SerializedName("ExecuteUserUin")
    @Expose
    private String ExecuteUserUin;

    /**
    * Start time.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

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
     * Get Script id. 
     * @return ScriptId Script id.
     */
    public String getScriptId() {
        return this.ScriptId;
    }

    /**
     * Set Script id.
     * @param ScriptId Script id.
     */
    public void setScriptId(String ScriptId) {
        this.ScriptId = ScriptId;
    }

    /**
     * Get Task ID. 
     * @return JobId Task ID.
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set Task ID.
     * @param JobId Task ID.
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get Search keywords. 
     * @return SearchWord Search keywords.
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * Set Search keywords.
     * @param SearchWord Search keywords.
     */
    public void setSearchWord(String SearchWord) {
        this.SearchWord = SearchWord;
    }

    /**
     * Get Specifies the executor ID. 
     * @return ExecuteUserUin Specifies the executor ID.
     */
    public String getExecuteUserUin() {
        return this.ExecuteUserUin;
    }

    /**
     * Set Specifies the executor ID.
     * @param ExecuteUserUin Specifies the executor ID.
     */
    public void setExecuteUserUin(String ExecuteUserUin) {
        this.ExecuteUserUin = ExecuteUserUin;
    }

    /**
     * Get Start time. 
     * @return StartTime Start time.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time.
     * @param StartTime Start time.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time. 
     * @return EndTime End time.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time.
     * @param EndTime End time.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public ListSQLScriptRunsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListSQLScriptRunsRequest(ListSQLScriptRunsRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ScriptId != null) {
            this.ScriptId = new String(source.ScriptId);
        }
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.SearchWord != null) {
            this.SearchWord = new String(source.SearchWord);
        }
        if (source.ExecuteUserUin != null) {
            this.ExecuteUserUin = new String(source.ExecuteUserUin);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ScriptId", this.ScriptId);
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "SearchWord", this.SearchWord);
        this.setParamSimple(map, prefix + "ExecuteUserUin", this.ExecuteUserUin);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

