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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteLoadBalancerRequest extends AbstractModel {

    /**
    * CLB instance ID array to be deleted, which can be obtained by calling the [DescribeLoadBalancers](https://www.tencentcloud.comom/document/product/214/30685?from_cn_redirect=1) API. The array can include up to 20 elements.
    */
    @SerializedName("LoadBalancerIds")
    @Expose
    private String [] LoadBalancerIds;

    /**
    * Whether to forcibly delete the CLB instance. True indicates forced deletion; False indicates non-forced deletion, and blocking verification is required.
The default value is False.
The deletion operation is blocked by default in the following cases. If you confirm forced deletion, the value of the forced verification parameter ForceDelete should be set to True.
1. The instance with 20 or more RS bound to the backend is deleted.
2. The instance with RS bound to the backend and the maximum peak inbound/outbound bandwidth exceeding 10 Mbps within 5 minutes is deleted.
3. Thirty or more instances are deleted within 5 minutes in a single region.
    */
    @SerializedName("ForceDelete")
    @Expose
    private Boolean ForceDelete;

    /**
     * Get CLB instance ID array to be deleted, which can be obtained by calling the [DescribeLoadBalancers](https://www.tencentcloud.comom/document/product/214/30685?from_cn_redirect=1) API. The array can include up to 20 elements. 
     * @return LoadBalancerIds CLB instance ID array to be deleted, which can be obtained by calling the [DescribeLoadBalancers](https://www.tencentcloud.comom/document/product/214/30685?from_cn_redirect=1) API. The array can include up to 20 elements.
     */
    public String [] getLoadBalancerIds() {
        return this.LoadBalancerIds;
    }

    /**
     * Set CLB instance ID array to be deleted, which can be obtained by calling the [DescribeLoadBalancers](https://www.tencentcloud.comom/document/product/214/30685?from_cn_redirect=1) API. The array can include up to 20 elements.
     * @param LoadBalancerIds CLB instance ID array to be deleted, which can be obtained by calling the [DescribeLoadBalancers](https://www.tencentcloud.comom/document/product/214/30685?from_cn_redirect=1) API. The array can include up to 20 elements.
     */
    public void setLoadBalancerIds(String [] LoadBalancerIds) {
        this.LoadBalancerIds = LoadBalancerIds;
    }

    /**
     * Get Whether to forcibly delete the CLB instance. True indicates forced deletion; False indicates non-forced deletion, and blocking verification is required.
The default value is False.
The deletion operation is blocked by default in the following cases. If you confirm forced deletion, the value of the forced verification parameter ForceDelete should be set to True.
1. The instance with 20 or more RS bound to the backend is deleted.
2. The instance with RS bound to the backend and the maximum peak inbound/outbound bandwidth exceeding 10 Mbps within 5 minutes is deleted.
3. Thirty or more instances are deleted within 5 minutes in a single region. 
     * @return ForceDelete Whether to forcibly delete the CLB instance. True indicates forced deletion; False indicates non-forced deletion, and blocking verification is required.
The default value is False.
The deletion operation is blocked by default in the following cases. If you confirm forced deletion, the value of the forced verification parameter ForceDelete should be set to True.
1. The instance with 20 or more RS bound to the backend is deleted.
2. The instance with RS bound to the backend and the maximum peak inbound/outbound bandwidth exceeding 10 Mbps within 5 minutes is deleted.
3. Thirty or more instances are deleted within 5 minutes in a single region.
     */
    public Boolean getForceDelete() {
        return this.ForceDelete;
    }

    /**
     * Set Whether to forcibly delete the CLB instance. True indicates forced deletion; False indicates non-forced deletion, and blocking verification is required.
The default value is False.
The deletion operation is blocked by default in the following cases. If you confirm forced deletion, the value of the forced verification parameter ForceDelete should be set to True.
1. The instance with 20 or more RS bound to the backend is deleted.
2. The instance with RS bound to the backend and the maximum peak inbound/outbound bandwidth exceeding 10 Mbps within 5 minutes is deleted.
3. Thirty or more instances are deleted within 5 minutes in a single region.
     * @param ForceDelete Whether to forcibly delete the CLB instance. True indicates forced deletion; False indicates non-forced deletion, and blocking verification is required.
The default value is False.
The deletion operation is blocked by default in the following cases. If you confirm forced deletion, the value of the forced verification parameter ForceDelete should be set to True.
1. The instance with 20 or more RS bound to the backend is deleted.
2. The instance with RS bound to the backend and the maximum peak inbound/outbound bandwidth exceeding 10 Mbps within 5 minutes is deleted.
3. Thirty or more instances are deleted within 5 minutes in a single region.
     */
    public void setForceDelete(Boolean ForceDelete) {
        this.ForceDelete = ForceDelete;
    }

    public DeleteLoadBalancerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteLoadBalancerRequest(DeleteLoadBalancerRequest source) {
        if (source.LoadBalancerIds != null) {
            this.LoadBalancerIds = new String[source.LoadBalancerIds.length];
            for (int i = 0; i < source.LoadBalancerIds.length; i++) {
                this.LoadBalancerIds[i] = new String(source.LoadBalancerIds[i]);
            }
        }
        if (source.ForceDelete != null) {
            this.ForceDelete = new Boolean(source.ForceDelete);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "LoadBalancerIds.", this.LoadBalancerIds);
        this.setParamSimple(map, prefix + "ForceDelete", this.ForceDelete);

    }
}

