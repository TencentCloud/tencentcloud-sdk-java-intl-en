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
    * Instance ID(s). To obtain the instance IDs, you can call [DescribeInstances](https://cloud.tencent.com/document/api/213/15728) and look for `InstanceId` in the response. The instance ID format is `ins-xxxxxxxx`. For more information on the format of this parameter, see the `id.N` section of [API Introduction](https://cloud.tencent.com/document/api/213/15688)). The maximum number of instance IDs in each request is 100.
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
     * Get Instance ID(s). To obtain the instance IDs, you can call [DescribeInstances](https://cloud.tencent.com/document/api/213/15728) and look for `InstanceId` in the response. The instance ID format is `ins-xxxxxxxx`. For more information on the format of this parameter, see the `id.N` section of [API Introduction](https://cloud.tencent.com/document/api/213/15688)). The maximum number of instance IDs in each request is 100. 
     * @return InstanceIds Instance ID(s). To obtain the instance IDs, you can call [DescribeInstances](https://cloud.tencent.com/document/api/213/15728) and look for `InstanceId` in the response. The instance ID format is `ins-xxxxxxxx`. For more information on the format of this parameter, see the `id.N` section of [API Introduction](https://cloud.tencent.com/document/api/213/15688)). The maximum number of instance IDs in each request is 100.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set Instance ID(s). To obtain the instance IDs, you can call [DescribeInstances](https://cloud.tencent.com/document/api/213/15728) and look for `InstanceId` in the response. The instance ID format is `ins-xxxxxxxx`. For more information on the format of this parameter, see the `id.N` section of [API Introduction](https://cloud.tencent.com/document/api/213/15688)). The maximum number of instance IDs in each request is 100.
     * @param InstanceIds Instance ID(s). To obtain the instance IDs, you can call [DescribeInstances](https://cloud.tencent.com/document/api/213/15728) and look for `InstanceId` in the response. The instance ID format is `ins-xxxxxxxx`. For more information on the format of this parameter, see the `id.N` section of [API Introduction](https://cloud.tencent.com/document/api/213/15688)). The maximum number of instance IDs in each request is 100.
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

