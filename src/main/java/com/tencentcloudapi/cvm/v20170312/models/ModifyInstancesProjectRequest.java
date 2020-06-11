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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyInstancesProjectRequest extends AbstractModel{

    /**
    * Instance IDs. To obtain the instance IDs, you can call [`DescribeInstances`](https://cloud.tencent.com/document/api/213/15728) and look for `InstanceId` in the response. You can operate up to 100 instances in each request.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * Project ID. You can create a project by using the [AddProject](https://cloud.tencent.com/doc/api/403/4398) API and obtain its ID from the response parameter `projectId` of the [`DescribeProject`](https://cloud.tencent.com/document/product/378/4400) API. Subsequently, the project ID can be used to filter results when you query instances by calling the [DescribeInstances](https://cloud.tencent.com/document/api/213/15728) API.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
     * Get Instance IDs. To obtain the instance IDs, you can call [`DescribeInstances`](https://cloud.tencent.com/document/api/213/15728) and look for `InstanceId` in the response. You can operate up to 100 instances in each request. 
     * @return InstanceIds Instance IDs. To obtain the instance IDs, you can call [`DescribeInstances`](https://cloud.tencent.com/document/api/213/15728) and look for `InstanceId` in the response. You can operate up to 100 instances in each request.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set Instance IDs. To obtain the instance IDs, you can call [`DescribeInstances`](https://cloud.tencent.com/document/api/213/15728) and look for `InstanceId` in the response. You can operate up to 100 instances in each request.
     * @param InstanceIds Instance IDs. To obtain the instance IDs, you can call [`DescribeInstances`](https://cloud.tencent.com/document/api/213/15728) and look for `InstanceId` in the response. You can operate up to 100 instances in each request.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get Project ID. You can create a project by using the [AddProject](https://cloud.tencent.com/doc/api/403/4398) API and obtain its ID from the response parameter `projectId` of the [`DescribeProject`](https://cloud.tencent.com/document/product/378/4400) API. Subsequently, the project ID can be used to filter results when you query instances by calling the [DescribeInstances](https://cloud.tencent.com/document/api/213/15728) API. 
     * @return ProjectId Project ID. You can create a project by using the [AddProject](https://cloud.tencent.com/doc/api/403/4398) API and obtain its ID from the response parameter `projectId` of the [`DescribeProject`](https://cloud.tencent.com/document/product/378/4400) API. Subsequently, the project ID can be used to filter results when you query instances by calling the [DescribeInstances](https://cloud.tencent.com/document/api/213/15728) API.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID. You can create a project by using the [AddProject](https://cloud.tencent.com/doc/api/403/4398) API and obtain its ID from the response parameter `projectId` of the [`DescribeProject`](https://cloud.tencent.com/document/product/378/4400) API. Subsequently, the project ID can be used to filter results when you query instances by calling the [DescribeInstances](https://cloud.tencent.com/document/api/213/15728) API.
     * @param ProjectId Project ID. You can create a project by using the [AddProject](https://cloud.tencent.com/doc/api/403/4398) API and obtain its ID from the response parameter `projectId` of the [`DescribeProject`](https://cloud.tencent.com/document/product/378/4400) API. Subsequently, the project ID can be used to filter results when you query instances by calling the [DescribeInstances](https://cloud.tencent.com/document/api/213/15728) API.
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

