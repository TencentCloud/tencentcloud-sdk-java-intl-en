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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDBInstancesProjectRequest extends AbstractModel{

    /**
    * List of IDs of instances to be modified. Instance ID is in the format of dcdbt-ow728lmc.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * ID of the project to be assigned, which can be obtained through the `DescribeProjects` API.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
     * Get List of IDs of instances to be modified. Instance ID is in the format of dcdbt-ow728lmc. 
     * @return InstanceIds List of IDs of instances to be modified. Instance ID is in the format of dcdbt-ow728lmc.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set List of IDs of instances to be modified. Instance ID is in the format of dcdbt-ow728lmc.
     * @param InstanceIds List of IDs of instances to be modified. Instance ID is in the format of dcdbt-ow728lmc.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get ID of the project to be assigned, which can be obtained through the `DescribeProjects` API. 
     * @return ProjectId ID of the project to be assigned, which can be obtained through the `DescribeProjects` API.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set ID of the project to be assigned, which can be obtained through the `DescribeProjects` API.
     * @param ProjectId ID of the project to be assigned, which can be obtained through the `DescribeProjects` API.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);

    }
}

