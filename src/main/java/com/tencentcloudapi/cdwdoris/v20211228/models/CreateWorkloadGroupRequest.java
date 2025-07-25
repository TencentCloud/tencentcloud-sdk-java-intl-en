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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateWorkloadGroupRequest extends AbstractModel {

    /**
    * Cluster ID	
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Resource group configuration
    */
    @SerializedName("WorkloadGroup")
    @Expose
    private WorkloadGroupConfig WorkloadGroup;

    /**
     * Get Cluster ID	 
     * @return InstanceId Cluster ID	
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Cluster ID	
     * @param InstanceId Cluster ID	
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Resource group configuration 
     * @return WorkloadGroup Resource group configuration
     */
    public WorkloadGroupConfig getWorkloadGroup() {
        return this.WorkloadGroup;
    }

    /**
     * Set Resource group configuration
     * @param WorkloadGroup Resource group configuration
     */
    public void setWorkloadGroup(WorkloadGroupConfig WorkloadGroup) {
        this.WorkloadGroup = WorkloadGroup;
    }

    public CreateWorkloadGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateWorkloadGroupRequest(CreateWorkloadGroupRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.WorkloadGroup != null) {
            this.WorkloadGroup = new WorkloadGroupConfig(source.WorkloadGroup);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamObj(map, prefix + "WorkloadGroup.", this.WorkloadGroup);

    }
}

