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

public class DescribeIntegrationVersionNodesInfoRequest extends AbstractModel {

    /**
    * Task ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * The selected version's storage path for the task:
The value of Base64.encode($region | $bucket | $ftp.file.name) under TaskInfo.TaskExt.Properties returned by DescribeDsTaskVersionList or DescribeDsTaskVersionInfo
    */
    @SerializedName("TaskVersionPath")
    @Expose
    private String TaskVersionPath;

    /**
    * The selected version ID for the task:
The value of VersionId returned by DescribeDsTaskVersionList or DescribeDsTaskVersionInfo
    */
    @SerializedName("TaskVersion")
    @Expose
    private String TaskVersion;

    /**
     * Get Task ID 
     * @return TaskId Task ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID
     * @param TaskId Task ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
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
     * Get The selected version's storage path for the task:
The value of Base64.encode($region | $bucket | $ftp.file.name) under TaskInfo.TaskExt.Properties returned by DescribeDsTaskVersionList or DescribeDsTaskVersionInfo 
     * @return TaskVersionPath The selected version's storage path for the task:
The value of Base64.encode($region | $bucket | $ftp.file.name) under TaskInfo.TaskExt.Properties returned by DescribeDsTaskVersionList or DescribeDsTaskVersionInfo
     */
    public String getTaskVersionPath() {
        return this.TaskVersionPath;
    }

    /**
     * Set The selected version's storage path for the task:
The value of Base64.encode($region | $bucket | $ftp.file.name) under TaskInfo.TaskExt.Properties returned by DescribeDsTaskVersionList or DescribeDsTaskVersionInfo
     * @param TaskVersionPath The selected version's storage path for the task:
The value of Base64.encode($region | $bucket | $ftp.file.name) under TaskInfo.TaskExt.Properties returned by DescribeDsTaskVersionList or DescribeDsTaskVersionInfo
     */
    public void setTaskVersionPath(String TaskVersionPath) {
        this.TaskVersionPath = TaskVersionPath;
    }

    /**
     * Get The selected version ID for the task:
The value of VersionId returned by DescribeDsTaskVersionList or DescribeDsTaskVersionInfo 
     * @return TaskVersion The selected version ID for the task:
The value of VersionId returned by DescribeDsTaskVersionList or DescribeDsTaskVersionInfo
     */
    public String getTaskVersion() {
        return this.TaskVersion;
    }

    /**
     * Set The selected version ID for the task:
The value of VersionId returned by DescribeDsTaskVersionList or DescribeDsTaskVersionInfo
     * @param TaskVersion The selected version ID for the task:
The value of VersionId returned by DescribeDsTaskVersionList or DescribeDsTaskVersionInfo
     */
    public void setTaskVersion(String TaskVersion) {
        this.TaskVersion = TaskVersion;
    }

    public DescribeIntegrationVersionNodesInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIntegrationVersionNodesInfoRequest(DescribeIntegrationVersionNodesInfoRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.TaskVersionPath != null) {
            this.TaskVersionPath = new String(source.TaskVersionPath);
        }
        if (source.TaskVersion != null) {
            this.TaskVersion = new String(source.TaskVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "TaskVersionPath", this.TaskVersionPath);
        this.setParamSimple(map, prefix + "TaskVersion", this.TaskVersion);

    }
}

