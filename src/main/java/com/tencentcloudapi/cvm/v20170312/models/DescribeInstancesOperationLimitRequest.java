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

public class DescribeInstancesOperationLimitRequest extends AbstractModel{

    /**
    * Query by instance ID(s). You can obtain the instance IDs from the value of `InstanceId` returned by the [DescribeInstances](https://cloud.tencent.com/document/api/213/15728) API. For example, instance ID: ins-xxxxxxxx. (For the specific format, refer to section `ids.N` of the API [Introduction](https://cloud.tencent.com/document/api/213/15688).) You can query up to 100 instances in each request.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * Operation on the instance(s).
<li> INSTANCE_DEGRADE: downgrade the instance configurations</li>
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
     * Get Query by instance ID(s). You can obtain the instance IDs from the value of `InstanceId` returned by the [DescribeInstances](https://cloud.tencent.com/document/api/213/15728) API. For example, instance ID: ins-xxxxxxxx. (For the specific format, refer to section `ids.N` of the API [Introduction](https://cloud.tencent.com/document/api/213/15688).) You can query up to 100 instances in each request. 
     * @return InstanceIds Query by instance ID(s). You can obtain the instance IDs from the value of `InstanceId` returned by the [DescribeInstances](https://cloud.tencent.com/document/api/213/15728) API. For example, instance ID: ins-xxxxxxxx. (For the specific format, refer to section `ids.N` of the API [Introduction](https://cloud.tencent.com/document/api/213/15688).) You can query up to 100 instances in each request.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set Query by instance ID(s). You can obtain the instance IDs from the value of `InstanceId` returned by the [DescribeInstances](https://cloud.tencent.com/document/api/213/15728) API. For example, instance ID: ins-xxxxxxxx. (For the specific format, refer to section `ids.N` of the API [Introduction](https://cloud.tencent.com/document/api/213/15688).) You can query up to 100 instances in each request.
     * @param InstanceIds Query by instance ID(s). You can obtain the instance IDs from the value of `InstanceId` returned by the [DescribeInstances](https://cloud.tencent.com/document/api/213/15728) API. For example, instance ID: ins-xxxxxxxx. (For the specific format, refer to section `ids.N` of the API [Introduction](https://cloud.tencent.com/document/api/213/15688).) You can query up to 100 instances in each request.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get Operation on the instance(s).
<li> INSTANCE_DEGRADE: downgrade the instance configurations</li> 
     * @return Operation Operation on the instance(s).
<li> INSTANCE_DEGRADE: downgrade the instance configurations</li>
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set Operation on the instance(s).
<li> INSTANCE_DEGRADE: downgrade the instance configurations</li>
     * @param Operation Operation on the instance(s).
<li> INSTANCE_DEGRADE: downgrade the instance configurations</li>
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "Operation", this.Operation);

    }
}

