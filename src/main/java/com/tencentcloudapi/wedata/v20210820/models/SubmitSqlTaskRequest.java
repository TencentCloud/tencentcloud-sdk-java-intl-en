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

public class SubmitSqlTaskRequest extends AbstractModel {

    /**
    * Database Type
    */
    @SerializedName("DatabaseType")
    @Expose
    private String DatabaseType;

    /**
    * Data Source ID
    */
    @SerializedName("DatasourceId")
    @Expose
    private Long DatasourceId;

    /**
    * Resource Group ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * Script File ID
    */
    @SerializedName("ScriptId")
    @Expose
    private String ScriptId;

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Database name
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * Execution Engine Instance ID
    */
    @SerializedName("EngineId")
    @Expose
    private String EngineId;

    /**
    * Script Content
    */
    @SerializedName("ScriptContent")
    @Expose
    private String ScriptContent;

    /**
    * Resource Queue
    */
    @SerializedName("ResourceQueue")
    @Expose
    private String ResourceQueue;

    /**
    * Database Type
    */
    @SerializedName("DatasourceType")
    @Expose
    private String DatasourceType;

    /**
    * Compute Resource Name
    */
    @SerializedName("ComputeResource")
    @Expose
    private String ComputeResource;

    /**
    * Advanced Running Parameters
    */
    @SerializedName("RunParams")
    @Expose
    private String RunParams;

    /**
    * Advanced Settings
    */
    @SerializedName("ConfParams")
    @Expose
    private String ConfParams;

    /**
    * Whether the script content is Base64 encrypted
    */
    @SerializedName("ScriptEncryption")
    @Expose
    private Boolean ScriptEncryption;

    /**
     * Get Database Type 
     * @return DatabaseType Database Type
     */
    public String getDatabaseType() {
        return this.DatabaseType;
    }

    /**
     * Set Database Type
     * @param DatabaseType Database Type
     */
    public void setDatabaseType(String DatabaseType) {
        this.DatabaseType = DatabaseType;
    }

    /**
     * Get Data Source ID 
     * @return DatasourceId Data Source ID
     */
    public Long getDatasourceId() {
        return this.DatasourceId;
    }

    /**
     * Set Data Source ID
     * @param DatasourceId Data Source ID
     */
    public void setDatasourceId(Long DatasourceId) {
        this.DatasourceId = DatasourceId;
    }

    /**
     * Get Resource Group ID 
     * @return GroupId Resource Group ID
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Resource Group ID
     * @param GroupId Resource Group ID
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Script File ID 
     * @return ScriptId Script File ID
     */
    public String getScriptId() {
        return this.ScriptId;
    }

    /**
     * Set Script File ID
     * @param ScriptId Script File ID
     */
    public void setScriptId(String ScriptId) {
        this.ScriptId = ScriptId;
    }

    /**
     * Get Project ID 
     * @return ProjectId Project ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID
     * @param ProjectId Project ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Database name 
     * @return DatabaseName Database name
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set Database name
     * @param DatabaseName Database name
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get Execution Engine Instance ID 
     * @return EngineId Execution Engine Instance ID
     */
    public String getEngineId() {
        return this.EngineId;
    }

    /**
     * Set Execution Engine Instance ID
     * @param EngineId Execution Engine Instance ID
     */
    public void setEngineId(String EngineId) {
        this.EngineId = EngineId;
    }

    /**
     * Get Script Content 
     * @return ScriptContent Script Content
     */
    public String getScriptContent() {
        return this.ScriptContent;
    }

    /**
     * Set Script Content
     * @param ScriptContent Script Content
     */
    public void setScriptContent(String ScriptContent) {
        this.ScriptContent = ScriptContent;
    }

    /**
     * Get Resource Queue 
     * @return ResourceQueue Resource Queue
     */
    public String getResourceQueue() {
        return this.ResourceQueue;
    }

    /**
     * Set Resource Queue
     * @param ResourceQueue Resource Queue
     */
    public void setResourceQueue(String ResourceQueue) {
        this.ResourceQueue = ResourceQueue;
    }

    /**
     * Get Database Type 
     * @return DatasourceType Database Type
     */
    public String getDatasourceType() {
        return this.DatasourceType;
    }

    /**
     * Set Database Type
     * @param DatasourceType Database Type
     */
    public void setDatasourceType(String DatasourceType) {
        this.DatasourceType = DatasourceType;
    }

    /**
     * Get Compute Resource Name 
     * @return ComputeResource Compute Resource Name
     */
    public String getComputeResource() {
        return this.ComputeResource;
    }

    /**
     * Set Compute Resource Name
     * @param ComputeResource Compute Resource Name
     */
    public void setComputeResource(String ComputeResource) {
        this.ComputeResource = ComputeResource;
    }

    /**
     * Get Advanced Running Parameters 
     * @return RunParams Advanced Running Parameters
     */
    public String getRunParams() {
        return this.RunParams;
    }

    /**
     * Set Advanced Running Parameters
     * @param RunParams Advanced Running Parameters
     */
    public void setRunParams(String RunParams) {
        this.RunParams = RunParams;
    }

    /**
     * Get Advanced Settings 
     * @return ConfParams Advanced Settings
     */
    public String getConfParams() {
        return this.ConfParams;
    }

    /**
     * Set Advanced Settings
     * @param ConfParams Advanced Settings
     */
    public void setConfParams(String ConfParams) {
        this.ConfParams = ConfParams;
    }

    /**
     * Get Whether the script content is Base64 encrypted 
     * @return ScriptEncryption Whether the script content is Base64 encrypted
     */
    public Boolean getScriptEncryption() {
        return this.ScriptEncryption;
    }

    /**
     * Set Whether the script content is Base64 encrypted
     * @param ScriptEncryption Whether the script content is Base64 encrypted
     */
    public void setScriptEncryption(Boolean ScriptEncryption) {
        this.ScriptEncryption = ScriptEncryption;
    }

    public SubmitSqlTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubmitSqlTaskRequest(SubmitSqlTaskRequest source) {
        if (source.DatabaseType != null) {
            this.DatabaseType = new String(source.DatabaseType);
        }
        if (source.DatasourceId != null) {
            this.DatasourceId = new Long(source.DatasourceId);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.ScriptId != null) {
            this.ScriptId = new String(source.ScriptId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.EngineId != null) {
            this.EngineId = new String(source.EngineId);
        }
        if (source.ScriptContent != null) {
            this.ScriptContent = new String(source.ScriptContent);
        }
        if (source.ResourceQueue != null) {
            this.ResourceQueue = new String(source.ResourceQueue);
        }
        if (source.DatasourceType != null) {
            this.DatasourceType = new String(source.DatasourceType);
        }
        if (source.ComputeResource != null) {
            this.ComputeResource = new String(source.ComputeResource);
        }
        if (source.RunParams != null) {
            this.RunParams = new String(source.RunParams);
        }
        if (source.ConfParams != null) {
            this.ConfParams = new String(source.ConfParams);
        }
        if (source.ScriptEncryption != null) {
            this.ScriptEncryption = new Boolean(source.ScriptEncryption);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DatabaseType", this.DatabaseType);
        this.setParamSimple(map, prefix + "DatasourceId", this.DatasourceId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "ScriptId", this.ScriptId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "EngineId", this.EngineId);
        this.setParamSimple(map, prefix + "ScriptContent", this.ScriptContent);
        this.setParamSimple(map, prefix + "ResourceQueue", this.ResourceQueue);
        this.setParamSimple(map, prefix + "DatasourceType", this.DatasourceType);
        this.setParamSimple(map, prefix + "ComputeResource", this.ComputeResource);
        this.setParamSimple(map, prefix + "RunParams", this.RunParams);
        this.setParamSimple(map, prefix + "ConfParams", this.ConfParams);
        this.setParamSimple(map, prefix + "ScriptEncryption", this.ScriptEncryption);

    }
}

