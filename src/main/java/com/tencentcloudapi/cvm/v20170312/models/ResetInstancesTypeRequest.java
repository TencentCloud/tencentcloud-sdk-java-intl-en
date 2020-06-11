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

public class ResetInstancesTypeRequest extends AbstractModel{

    /**
    * Instance ID(s). You can obtain the instance IDs from the value of `InstanceId` returned by the [`DescribeInstances`](https://cloud.tencent.com/document/api/213/15728) API. The maximum number of instances for each request is 1.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * Instance model. Different resource specifications are specified for different models. For specific values, call [DescribeInstanceTypeConfigs](https://cloud.tencent.com/document/api/213/15749) to get the latest specification list or refer to [Instance Types](https://cloud.tencent.com/document/product/213/11518).
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * Forced shutdown of a running instances. We recommend you firstly try to shut down a running instance manually. Valid values: <br><li>TRUE: forced shutdown of an instance after a normal shutdown fails.<br><li>FALSE: no forced shutdown of an instance after a normal shutdown fails.<br><br>Default value: FALSE.<br><br>A forced shutdown is similar to switching off the power of a physical computer. It may cause data loss or file system corruption. Be sure to only force a CVM to shut off if the normal shutdown fails.
    */
    @SerializedName("ForceStop")
    @Expose
    private Boolean ForceStop;

    /**
     * Get Instance ID(s). You can obtain the instance IDs from the value of `InstanceId` returned by the [`DescribeInstances`](https://cloud.tencent.com/document/api/213/15728) API. The maximum number of instances for each request is 1. 
     * @return InstanceIds Instance ID(s). You can obtain the instance IDs from the value of `InstanceId` returned by the [`DescribeInstances`](https://cloud.tencent.com/document/api/213/15728) API. The maximum number of instances for each request is 1.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set Instance ID(s). You can obtain the instance IDs from the value of `InstanceId` returned by the [`DescribeInstances`](https://cloud.tencent.com/document/api/213/15728) API. The maximum number of instances for each request is 1.
     * @param InstanceIds Instance ID(s). You can obtain the instance IDs from the value of `InstanceId` returned by the [`DescribeInstances`](https://cloud.tencent.com/document/api/213/15728) API. The maximum number of instances for each request is 1.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get Instance model. Different resource specifications are specified for different models. For specific values, call [DescribeInstanceTypeConfigs](https://cloud.tencent.com/document/api/213/15749) to get the latest specification list or refer to [Instance Types](https://cloud.tencent.com/document/product/213/11518). 
     * @return InstanceType Instance model. Different resource specifications are specified for different models. For specific values, call [DescribeInstanceTypeConfigs](https://cloud.tencent.com/document/api/213/15749) to get the latest specification list or refer to [Instance Types](https://cloud.tencent.com/document/product/213/11518).
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Instance model. Different resource specifications are specified for different models. For specific values, call [DescribeInstanceTypeConfigs](https://cloud.tencent.com/document/api/213/15749) to get the latest specification list or refer to [Instance Types](https://cloud.tencent.com/document/product/213/11518).
     * @param InstanceType Instance model. Different resource specifications are specified for different models. For specific values, call [DescribeInstanceTypeConfigs](https://cloud.tencent.com/document/api/213/15749) to get the latest specification list or refer to [Instance Types](https://cloud.tencent.com/document/product/213/11518).
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Forced shutdown of a running instances. We recommend you firstly try to shut down a running instance manually. Valid values: <br><li>TRUE: forced shutdown of an instance after a normal shutdown fails.<br><li>FALSE: no forced shutdown of an instance after a normal shutdown fails.<br><br>Default value: FALSE.<br><br>A forced shutdown is similar to switching off the power of a physical computer. It may cause data loss or file system corruption. Be sure to only force a CVM to shut off if the normal shutdown fails. 
     * @return ForceStop Forced shutdown of a running instances. We recommend you firstly try to shut down a running instance manually. Valid values: <br><li>TRUE: forced shutdown of an instance after a normal shutdown fails.<br><li>FALSE: no forced shutdown of an instance after a normal shutdown fails.<br><br>Default value: FALSE.<br><br>A forced shutdown is similar to switching off the power of a physical computer. It may cause data loss or file system corruption. Be sure to only force a CVM to shut off if the normal shutdown fails.
     */
    public Boolean getForceStop() {
        return this.ForceStop;
    }

    /**
     * Set Forced shutdown of a running instances. We recommend you firstly try to shut down a running instance manually. Valid values: <br><li>TRUE: forced shutdown of an instance after a normal shutdown fails.<br><li>FALSE: no forced shutdown of an instance after a normal shutdown fails.<br><br>Default value: FALSE.<br><br>A forced shutdown is similar to switching off the power of a physical computer. It may cause data loss or file system corruption. Be sure to only force a CVM to shut off if the normal shutdown fails.
     * @param ForceStop Forced shutdown of a running instances. We recommend you firstly try to shut down a running instance manually. Valid values: <br><li>TRUE: forced shutdown of an instance after a normal shutdown fails.<br><li>FALSE: no forced shutdown of an instance after a normal shutdown fails.<br><br>Default value: FALSE.<br><br>A forced shutdown is similar to switching off the power of a physical computer. It may cause data loss or file system corruption. Be sure to only force a CVM to shut off if the normal shutdown fails.
     */
    public void setForceStop(Boolean ForceStop) {
        this.ForceStop = ForceStop;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "ForceStop", this.ForceStop);

    }
}

