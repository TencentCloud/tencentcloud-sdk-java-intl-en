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
package com.tencentcloudapi.omics.v20221128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetRunMetadataFileRequest extends AbstractModel {

    /**
    * Run UUID
    */
    @SerializedName("RunUuid")
    @Expose
    private String RunUuid;

    /**
    * Project ID
(If you leave it blank, the default item in the specified region will be used.)
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * File names to be get

The following files are supported by default:
- nextflow.log

When report is specified as true in NFOption during submission, the following files are additionally supported:
- execution_report.html
- execution_timeline.html
- execution_trace.txt
- pipeline_dag.html
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * File names to be get in batch

The following files are supported by default:
- nextflow.log

When report is specified as true in NFOption during submission, the following files are additionally supported:
- execution_report.html
- execution_timeline.html
- execution_trace.txt
- pipeline_dag.html
    */
    @SerializedName("Keys")
    @Expose
    private String [] Keys;

    /**
     * Get Run UUID 
     * @return RunUuid Run UUID
     */
    public String getRunUuid() {
        return this.RunUuid;
    }

    /**
     * Set Run UUID
     * @param RunUuid Run UUID
     */
    public void setRunUuid(String RunUuid) {
        this.RunUuid = RunUuid;
    }

    /**
     * Get Project ID
(If you leave it blank, the default item in the specified region will be used.) 
     * @return ProjectId Project ID
(If you leave it blank, the default item in the specified region will be used.)
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID
(If you leave it blank, the default item in the specified region will be used.)
     * @param ProjectId Project ID
(If you leave it blank, the default item in the specified region will be used.)
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get File names to be get

The following files are supported by default:
- nextflow.log

When report is specified as true in NFOption during submission, the following files are additionally supported:
- execution_report.html
- execution_timeline.html
- execution_trace.txt
- pipeline_dag.html 
     * @return Key File names to be get

The following files are supported by default:
- nextflow.log

When report is specified as true in NFOption during submission, the following files are additionally supported:
- execution_report.html
- execution_timeline.html
- execution_trace.txt
- pipeline_dag.html
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set File names to be get

The following files are supported by default:
- nextflow.log

When report is specified as true in NFOption during submission, the following files are additionally supported:
- execution_report.html
- execution_timeline.html
- execution_trace.txt
- pipeline_dag.html
     * @param Key File names to be get

The following files are supported by default:
- nextflow.log

When report is specified as true in NFOption during submission, the following files are additionally supported:
- execution_report.html
- execution_timeline.html
- execution_trace.txt
- pipeline_dag.html
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get File names to be get in batch

The following files are supported by default:
- nextflow.log

When report is specified as true in NFOption during submission, the following files are additionally supported:
- execution_report.html
- execution_timeline.html
- execution_trace.txt
- pipeline_dag.html 
     * @return Keys File names to be get in batch

The following files are supported by default:
- nextflow.log

When report is specified as true in NFOption during submission, the following files are additionally supported:
- execution_report.html
- execution_timeline.html
- execution_trace.txt
- pipeline_dag.html
     */
    public String [] getKeys() {
        return this.Keys;
    }

    /**
     * Set File names to be get in batch

The following files are supported by default:
- nextflow.log

When report is specified as true in NFOption during submission, the following files are additionally supported:
- execution_report.html
- execution_timeline.html
- execution_trace.txt
- pipeline_dag.html
     * @param Keys File names to be get in batch

The following files are supported by default:
- nextflow.log

When report is specified as true in NFOption during submission, the following files are additionally supported:
- execution_report.html
- execution_timeline.html
- execution_trace.txt
- pipeline_dag.html
     */
    public void setKeys(String [] Keys) {
        this.Keys = Keys;
    }

    public GetRunMetadataFileRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetRunMetadataFileRequest(GetRunMetadataFileRequest source) {
        if (source.RunUuid != null) {
            this.RunUuid = new String(source.RunUuid);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Keys != null) {
            this.Keys = new String[source.Keys.length];
            for (int i = 0; i < source.Keys.length; i++) {
                this.Keys[i] = new String(source.Keys[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RunUuid", this.RunUuid);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamArraySimple(map, prefix + "Keys.", this.Keys);

    }
}

