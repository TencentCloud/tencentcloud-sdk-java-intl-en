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

public class RetryRunsRequest extends AbstractModel {

    /**
    * Project ID. (If you leave it blank, the default item in the specified region will be used.)
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * The run group ID that needs to be retried
    */
    @SerializedName("RunGroupId")
    @Expose
    private String RunGroupId;

    /**
    * The run UUID that needs to be retried
    */
    @SerializedName("RunUuids")
    @Expose
    private String [] RunUuids;

    /**
    * WDL running option. If you leave it blank, the retried run group running option will be used.
    */
    @SerializedName("WDLOption")
    @Expose
    private RunOption WDLOption;

    /**
    * Nextflow running option. If you leave it blank, the retried run group running option will be used.
    */
    @SerializedName("NFOption")
    @Expose
    private NFOption NFOption;

    /**
     * Get Project ID. (If you leave it blank, the default item in the specified region will be used.) 
     * @return ProjectId Project ID. (If you leave it blank, the default item in the specified region will be used.)
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID. (If you leave it blank, the default item in the specified region will be used.)
     * @param ProjectId Project ID. (If you leave it blank, the default item in the specified region will be used.)
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get The run group ID that needs to be retried 
     * @return RunGroupId The run group ID that needs to be retried
     */
    public String getRunGroupId() {
        return this.RunGroupId;
    }

    /**
     * Set The run group ID that needs to be retried
     * @param RunGroupId The run group ID that needs to be retried
     */
    public void setRunGroupId(String RunGroupId) {
        this.RunGroupId = RunGroupId;
    }

    /**
     * Get The run UUID that needs to be retried 
     * @return RunUuids The run UUID that needs to be retried
     */
    public String [] getRunUuids() {
        return this.RunUuids;
    }

    /**
     * Set The run UUID that needs to be retried
     * @param RunUuids The run UUID that needs to be retried
     */
    public void setRunUuids(String [] RunUuids) {
        this.RunUuids = RunUuids;
    }

    /**
     * Get WDL running option. If you leave it blank, the retried run group running option will be used. 
     * @return WDLOption WDL running option. If you leave it blank, the retried run group running option will be used.
     */
    public RunOption getWDLOption() {
        return this.WDLOption;
    }

    /**
     * Set WDL running option. If you leave it blank, the retried run group running option will be used.
     * @param WDLOption WDL running option. If you leave it blank, the retried run group running option will be used.
     */
    public void setWDLOption(RunOption WDLOption) {
        this.WDLOption = WDLOption;
    }

    /**
     * Get Nextflow running option. If you leave it blank, the retried run group running option will be used. 
     * @return NFOption Nextflow running option. If you leave it blank, the retried run group running option will be used.
     */
    public NFOption getNFOption() {
        return this.NFOption;
    }

    /**
     * Set Nextflow running option. If you leave it blank, the retried run group running option will be used.
     * @param NFOption Nextflow running option. If you leave it blank, the retried run group running option will be used.
     */
    public void setNFOption(NFOption NFOption) {
        this.NFOption = NFOption;
    }

    public RetryRunsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RetryRunsRequest(RetryRunsRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.RunGroupId != null) {
            this.RunGroupId = new String(source.RunGroupId);
        }
        if (source.RunUuids != null) {
            this.RunUuids = new String[source.RunUuids.length];
            for (int i = 0; i < source.RunUuids.length; i++) {
                this.RunUuids[i] = new String(source.RunUuids[i]);
            }
        }
        if (source.WDLOption != null) {
            this.WDLOption = new RunOption(source.WDLOption);
        }
        if (source.NFOption != null) {
            this.NFOption = new NFOption(source.NFOption);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "RunGroupId", this.RunGroupId);
        this.setParamArraySimple(map, prefix + "RunUuids.", this.RunUuids);
        this.setParamObj(map, prefix + "WDLOption.", this.WDLOption);
        this.setParamObj(map, prefix + "NFOption.", this.NFOption);

    }
}

