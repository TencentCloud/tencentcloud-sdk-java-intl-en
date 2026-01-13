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

public class DeleteLoadBalancerListenersRequest extends AbstractModel {

    /**
    * ID of the CLB instance. You can call the [DescribeLoadBalancers](https://www.tencentcloud.com/document/product/214/30685?from_cn_redirect=1) API to query the ID.
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * Specifies the listener ID array to be deleted, with a maximum of 20 elements. if left blank, all listeners of the clb will be deleted. can be obtained through the [DescribeListeners](https://www.tencentcloud.com/document/product/214/30686?from_cn_redirect=1) api.
    */
    @SerializedName("ListenerIds")
    @Expose
    private String [] ListenerIds;

    /**
     * Get ID of the CLB instance. You can call the [DescribeLoadBalancers](https://www.tencentcloud.com/document/product/214/30685?from_cn_redirect=1) API to query the ID. 
     * @return LoadBalancerId ID of the CLB instance. You can call the [DescribeLoadBalancers](https://www.tencentcloud.com/document/product/214/30685?from_cn_redirect=1) API to query the ID.
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set ID of the CLB instance. You can call the [DescribeLoadBalancers](https://www.tencentcloud.com/document/product/214/30685?from_cn_redirect=1) API to query the ID.
     * @param LoadBalancerId ID of the CLB instance. You can call the [DescribeLoadBalancers](https://www.tencentcloud.com/document/product/214/30685?from_cn_redirect=1) API to query the ID.
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get Specifies the listener ID array to be deleted, with a maximum of 20 elements. if left blank, all listeners of the clb will be deleted. can be obtained through the [DescribeListeners](https://www.tencentcloud.com/document/product/214/30686?from_cn_redirect=1) api. 
     * @return ListenerIds Specifies the listener ID array to be deleted, with a maximum of 20 elements. if left blank, all listeners of the clb will be deleted. can be obtained through the [DescribeListeners](https://www.tencentcloud.com/document/product/214/30686?from_cn_redirect=1) api.
     */
    public String [] getListenerIds() {
        return this.ListenerIds;
    }

    /**
     * Set Specifies the listener ID array to be deleted, with a maximum of 20 elements. if left blank, all listeners of the clb will be deleted. can be obtained through the [DescribeListeners](https://www.tencentcloud.com/document/product/214/30686?from_cn_redirect=1) api.
     * @param ListenerIds Specifies the listener ID array to be deleted, with a maximum of 20 elements. if left blank, all listeners of the clb will be deleted. can be obtained through the [DescribeListeners](https://www.tencentcloud.com/document/product/214/30686?from_cn_redirect=1) api.
     */
    public void setListenerIds(String [] ListenerIds) {
        this.ListenerIds = ListenerIds;
    }

    public DeleteLoadBalancerListenersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteLoadBalancerListenersRequest(DeleteLoadBalancerListenersRequest source) {
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.ListenerIds != null) {
            this.ListenerIds = new String[source.ListenerIds.length];
            for (int i = 0; i < source.ListenerIds.length; i++) {
                this.ListenerIds[i] = new String(source.ListenerIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamArraySimple(map, prefix + "ListenerIds.", this.ListenerIds);

    }
}

