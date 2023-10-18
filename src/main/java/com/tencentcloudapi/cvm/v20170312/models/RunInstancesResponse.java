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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RunInstancesResponse extends AbstractModel {

    /**
    * If you use this API to create instance(s), this parameter will be returned, representing one or more instance IDs. Retuning the instance ID list does not necessarily mean that the instance(s) were created successfully. To check whether the instance(s) were created successfully, you can call [DescribeInstances](https://intl.cloud.tencent.com/document/api/213/15728?from_cn_redirect=1) and check the status of the instances in `InstancesSet` in the response. If the status of an instance changes from "PENDING" to "RUNNING", it means that the instance has been created successfully.
    */
    @SerializedName("InstanceIdSet")
    @Expose
    private String [] InstanceIdSet;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get If you use this API to create instance(s), this parameter will be returned, representing one or more instance IDs. Retuning the instance ID list does not necessarily mean that the instance(s) were created successfully. To check whether the instance(s) were created successfully, you can call [DescribeInstances](https://intl.cloud.tencent.com/document/api/213/15728?from_cn_redirect=1) and check the status of the instances in `InstancesSet` in the response. If the status of an instance changes from "PENDING" to "RUNNING", it means that the instance has been created successfully. 
     * @return InstanceIdSet If you use this API to create instance(s), this parameter will be returned, representing one or more instance IDs. Retuning the instance ID list does not necessarily mean that the instance(s) were created successfully. To check whether the instance(s) were created successfully, you can call [DescribeInstances](https://intl.cloud.tencent.com/document/api/213/15728?from_cn_redirect=1) and check the status of the instances in `InstancesSet` in the response. If the status of an instance changes from "PENDING" to "RUNNING", it means that the instance has been created successfully.
     */
    public String [] getInstanceIdSet() {
        return this.InstanceIdSet;
    }

    /**
     * Set If you use this API to create instance(s), this parameter will be returned, representing one or more instance IDs. Retuning the instance ID list does not necessarily mean that the instance(s) were created successfully. To check whether the instance(s) were created successfully, you can call [DescribeInstances](https://intl.cloud.tencent.com/document/api/213/15728?from_cn_redirect=1) and check the status of the instances in `InstancesSet` in the response. If the status of an instance changes from "PENDING" to "RUNNING", it means that the instance has been created successfully.
     * @param InstanceIdSet If you use this API to create instance(s), this parameter will be returned, representing one or more instance IDs. Retuning the instance ID list does not necessarily mean that the instance(s) were created successfully. To check whether the instance(s) were created successfully, you can call [DescribeInstances](https://intl.cloud.tencent.com/document/api/213/15728?from_cn_redirect=1) and check the status of the instances in `InstancesSet` in the response. If the status of an instance changes from "PENDING" to "RUNNING", it means that the instance has been created successfully.
     */
    public void setInstanceIdSet(String [] InstanceIdSet) {
        this.InstanceIdSet = InstanceIdSet;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public RunInstancesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RunInstancesResponse(RunInstancesResponse source) {
        if (source.InstanceIdSet != null) {
            this.InstanceIdSet = new String[source.InstanceIdSet.length];
            for (int i = 0; i < source.InstanceIdSet.length; i++) {
                this.InstanceIdSet[i] = new String(source.InstanceIdSet[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIdSet.", this.InstanceIdSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

