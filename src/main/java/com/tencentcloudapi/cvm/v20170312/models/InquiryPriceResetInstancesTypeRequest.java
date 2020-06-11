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

public class InquiryPriceResetInstancesTypeRequest extends AbstractModel{

    /**
    * Instance ID(s). You can obtain the instance IDs from the value of `InstanceId` returned by the [`DescribeInstances`](https://cloud.tencent.com/document/api/213/15728) API. The maximum number of instances in each request is 1.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * Instance model. Resources vary with the instance model. Specific values can be found in the tables of [Instance Types] (https://cloud.tencent.com/document/product/213/11518) or in the latest specifications via the [DescribeInstanceTypeConfigs] (https://cloud.tencent.com/document/product/213/15749) API.
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
     * Get Instance ID(s). You can obtain the instance IDs from the value of `InstanceId` returned by the [`DescribeInstances`](https://cloud.tencent.com/document/api/213/15728) API. The maximum number of instances in each request is 1. 
     * @return InstanceIds Instance ID(s). You can obtain the instance IDs from the value of `InstanceId` returned by the [`DescribeInstances`](https://cloud.tencent.com/document/api/213/15728) API. The maximum number of instances in each request is 1.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set Instance ID(s). You can obtain the instance IDs from the value of `InstanceId` returned by the [`DescribeInstances`](https://cloud.tencent.com/document/api/213/15728) API. The maximum number of instances in each request is 1.
     * @param InstanceIds Instance ID(s). You can obtain the instance IDs from the value of `InstanceId` returned by the [`DescribeInstances`](https://cloud.tencent.com/document/api/213/15728) API. The maximum number of instances in each request is 1.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get Instance model. Resources vary with the instance model. Specific values can be found in the tables of [Instance Types] (https://cloud.tencent.com/document/product/213/11518) or in the latest specifications via the [DescribeInstanceTypeConfigs] (https://cloud.tencent.com/document/product/213/15749) API. 
     * @return InstanceType Instance model. Resources vary with the instance model. Specific values can be found in the tables of [Instance Types] (https://cloud.tencent.com/document/product/213/11518) or in the latest specifications via the [DescribeInstanceTypeConfigs] (https://cloud.tencent.com/document/product/213/15749) API.
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Instance model. Resources vary with the instance model. Specific values can be found in the tables of [Instance Types] (https://cloud.tencent.com/document/product/213/11518) or in the latest specifications via the [DescribeInstanceTypeConfigs] (https://cloud.tencent.com/document/product/213/15749) API.
     * @param InstanceType Instance model. Resources vary with the instance model. Specific values can be found in the tables of [Instance Types] (https://cloud.tencent.com/document/product/213/11518) or in the latest specifications via the [DescribeInstanceTypeConfigs] (https://cloud.tencent.com/document/product/213/15749) API.
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);

    }
}

