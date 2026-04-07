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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteInstancesDisasterRecoverGroupsRequest extends AbstractModel {

    /**
    * One or more instance IDs to be operated. You can obtain the instance ID through the `InstanceId` in the return value from the API [`DescribeInstances`](https://www.tencentcloud.com/zh/document/api/213/33258). The maximum number of instances per request is 100.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * ID list of placement groups, obtainable via the [DescribeDisasterRecoverGroups](https://www.tencentcloud.com/zh/document/api/213/33261) API. 
    */
    @SerializedName("DisasterRecoverGroupIds")
    @Expose
    private String [] DisasterRecoverGroupIds;

    /**
     * Get One or more instance IDs to be operated. You can obtain the instance ID through the `InstanceId` in the return value from the API [`DescribeInstances`](https://www.tencentcloud.com/zh/document/api/213/33258). The maximum number of instances per request is 100. 
     * @return InstanceIds One or more instance IDs to be operated. You can obtain the instance ID through the `InstanceId` in the return value from the API [`DescribeInstances`](https://www.tencentcloud.com/zh/document/api/213/33258). The maximum number of instances per request is 100.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set One or more instance IDs to be operated. You can obtain the instance ID through the `InstanceId` in the return value from the API [`DescribeInstances`](https://www.tencentcloud.com/zh/document/api/213/33258). The maximum number of instances per request is 100.
     * @param InstanceIds One or more instance IDs to be operated. You can obtain the instance ID through the `InstanceId` in the return value from the API [`DescribeInstances`](https://www.tencentcloud.com/zh/document/api/213/33258). The maximum number of instances per request is 100.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get ID list of placement groups, obtainable via the [DescribeDisasterRecoverGroups](https://www.tencentcloud.com/zh/document/api/213/33261) API.  
     * @return DisasterRecoverGroupIds ID list of placement groups, obtainable via the [DescribeDisasterRecoverGroups](https://www.tencentcloud.com/zh/document/api/213/33261) API. 
     */
    public String [] getDisasterRecoverGroupIds() {
        return this.DisasterRecoverGroupIds;
    }

    /**
     * Set ID list of placement groups, obtainable via the [DescribeDisasterRecoverGroups](https://www.tencentcloud.com/zh/document/api/213/33261) API. 
     * @param DisasterRecoverGroupIds ID list of placement groups, obtainable via the [DescribeDisasterRecoverGroups](https://www.tencentcloud.com/zh/document/api/213/33261) API. 
     */
    public void setDisasterRecoverGroupIds(String [] DisasterRecoverGroupIds) {
        this.DisasterRecoverGroupIds = DisasterRecoverGroupIds;
    }

    public DeleteInstancesDisasterRecoverGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteInstancesDisasterRecoverGroupsRequest(DeleteInstancesDisasterRecoverGroupsRequest source) {
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.DisasterRecoverGroupIds != null) {
            this.DisasterRecoverGroupIds = new String[source.DisasterRecoverGroupIds.length];
            for (int i = 0; i < source.DisasterRecoverGroupIds.length; i++) {
                this.DisasterRecoverGroupIds[i] = new String(source.DisasterRecoverGroupIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamArraySimple(map, prefix + "DisasterRecoverGroupIds.", this.DisasterRecoverGroupIds);

    }
}

