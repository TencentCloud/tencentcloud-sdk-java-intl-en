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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SwitchProxyRequest extends AbstractModel {

    /**
    * Instance ID. Log in to the [Redis console](https://console.tencentcloud.com/redis/instance) and copy it in the instance list.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Proxy ID of an instance, which can be obtained through NodeId of the response parameter **Proxy** of the API [DescribeInstanceNodeInfo](https://intl.cloud.tencent.com/document/product/239/48603?from_cn_redirect=1).
    */
    @SerializedName("ProxyID")
    @Expose
    private String ProxyID;

    /**
    * Instance proxy ID list. Call the API [DescribeInstanceNodeInfo](https://www.tencentcloud.comom/document/product/239/48603?from_cn_redirect=1) to obtain IDs from **NodeId** in the **Proxy** response parameter.
    */
    @SerializedName("ProxyIDList")
    @Expose
    private String [] ProxyIDList;

    /**
     * Get Instance ID. Log in to the [Redis console](https://console.tencentcloud.com/redis/instance) and copy it in the instance list. 
     * @return InstanceId Instance ID. Log in to the [Redis console](https://console.tencentcloud.com/redis/instance) and copy it in the instance list.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID. Log in to the [Redis console](https://console.tencentcloud.com/redis/instance) and copy it in the instance list.
     * @param InstanceId Instance ID. Log in to the [Redis console](https://console.tencentcloud.com/redis/instance) and copy it in the instance list.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Proxy ID of an instance, which can be obtained through NodeId of the response parameter **Proxy** of the API [DescribeInstanceNodeInfo](https://intl.cloud.tencent.com/document/product/239/48603?from_cn_redirect=1). 
     * @return ProxyID Proxy ID of an instance, which can be obtained through NodeId of the response parameter **Proxy** of the API [DescribeInstanceNodeInfo](https://intl.cloud.tencent.com/document/product/239/48603?from_cn_redirect=1).
     */
    public String getProxyID() {
        return this.ProxyID;
    }

    /**
     * Set Proxy ID of an instance, which can be obtained through NodeId of the response parameter **Proxy** of the API [DescribeInstanceNodeInfo](https://intl.cloud.tencent.com/document/product/239/48603?from_cn_redirect=1).
     * @param ProxyID Proxy ID of an instance, which can be obtained through NodeId of the response parameter **Proxy** of the API [DescribeInstanceNodeInfo](https://intl.cloud.tencent.com/document/product/239/48603?from_cn_redirect=1).
     */
    public void setProxyID(String ProxyID) {
        this.ProxyID = ProxyID;
    }

    /**
     * Get Instance proxy ID list. Call the API [DescribeInstanceNodeInfo](https://www.tencentcloud.comom/document/product/239/48603?from_cn_redirect=1) to obtain IDs from **NodeId** in the **Proxy** response parameter. 
     * @return ProxyIDList Instance proxy ID list. Call the API [DescribeInstanceNodeInfo](https://www.tencentcloud.comom/document/product/239/48603?from_cn_redirect=1) to obtain IDs from **NodeId** in the **Proxy** response parameter.
     */
    public String [] getProxyIDList() {
        return this.ProxyIDList;
    }

    /**
     * Set Instance proxy ID list. Call the API [DescribeInstanceNodeInfo](https://www.tencentcloud.comom/document/product/239/48603?from_cn_redirect=1) to obtain IDs from **NodeId** in the **Proxy** response parameter.
     * @param ProxyIDList Instance proxy ID list. Call the API [DescribeInstanceNodeInfo](https://www.tencentcloud.comom/document/product/239/48603?from_cn_redirect=1) to obtain IDs from **NodeId** in the **Proxy** response parameter.
     */
    public void setProxyIDList(String [] ProxyIDList) {
        this.ProxyIDList = ProxyIDList;
    }

    public SwitchProxyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SwitchProxyRequest(SwitchProxyRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ProxyID != null) {
            this.ProxyID = new String(source.ProxyID);
        }
        if (source.ProxyIDList != null) {
            this.ProxyIDList = new String[source.ProxyIDList.length];
            for (int i = 0; i < source.ProxyIDList.length; i++) {
                this.ProxyIDList[i] = new String(source.ProxyIDList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ProxyID", this.ProxyID);
        this.setParamArraySimple(map, prefix + "ProxyIDList.", this.ProxyIDList);

    }
}

