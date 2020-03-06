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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Placement extends AbstractModel{

    /**
    * ID of the project to which the instance belongs. You can call the `DescribeProject` API and see the `projectId` field in the response to get the value of this parameter. If it is left empty, the default project will be used.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * AZ where the instance resides, such as ap-guangzhou-1. You can call the `DescribeZones` API and see the `Zone` field to get the value of this parameter.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
     * Get ID of the project to which the instance belongs. You can call the `DescribeProject` API and see the `projectId` field in the response to get the value of this parameter. If it is left empty, the default project will be used. 
     * @return ProjectId ID of the project to which the instance belongs. You can call the `DescribeProject` API and see the `projectId` field in the response to get the value of this parameter. If it is left empty, the default project will be used.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set ID of the project to which the instance belongs. You can call the `DescribeProject` API and see the `projectId` field in the response to get the value of this parameter. If it is left empty, the default project will be used.
     * @param ProjectId ID of the project to which the instance belongs. You can call the `DescribeProject` API and see the `projectId` field in the response to get the value of this parameter. If it is left empty, the default project will be used.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get AZ where the instance resides, such as ap-guangzhou-1. You can call the `DescribeZones` API and see the `Zone` field to get the value of this parameter. 
     * @return Zone AZ where the instance resides, such as ap-guangzhou-1. You can call the `DescribeZones` API and see the `Zone` field to get the value of this parameter.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set AZ where the instance resides, such as ap-guangzhou-1. You can call the `DescribeZones` API and see the `Zone` field to get the value of this parameter.
     * @param Zone AZ where the instance resides, such as ap-guangzhou-1. You can call the `DescribeZones` API and see the `Zone` field to get the value of this parameter.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Zone", this.Zone);

    }
}

