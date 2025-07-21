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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DetachLoadBalancersRequest extends AbstractModel {

    /**
    * Scaling group ID. obtain the scaling group ID by logging in to the console (https://console.cloud.tencent.com/autoscaling/group) or calling the api DescribeAutoScalingGroups (https://intl.cloud.tencent.com/document/api/377/20438?from_cn_redirect=1), and retrieve AutoScalingGroupId from the returned information.
    */
    @SerializedName("AutoScalingGroupId")
    @Expose
    private String AutoScalingGroupId;

    /**
    * Specifies a list of classic load balancer ids with a maximum length of 20. either LoadBalancerIds or ForwardLoadBalancerIdentifications can be specified at the same time. can be obtained through the [DescribeLoadBalancers](https://intl.cloud.tencent.com/document/product/214/30685?from_cn_redirect=1) api.
    */
    @SerializedName("LoadBalancerIds")
    @Expose
    private String [] LoadBalancerIds;

    /**
    * Specifies the list of cloud load balancer identification information with a maximum length of 100. either LoadBalancerIds or ForwardLoadBalancerIdentifications can be specified at the same time. can be obtained through the [DescribeLoadBalancers](https://intl.cloud.tencent.com/document/product/214/30685?from_cn_redirect=1) api.
    */
    @SerializedName("ForwardLoadBalancerIdentifications")
    @Expose
    private ForwardLoadBalancerIdentification [] ForwardLoadBalancerIdentifications;

    /**
     * Get Scaling group ID. obtain the scaling group ID by logging in to the console (https://console.cloud.tencent.com/autoscaling/group) or calling the api DescribeAutoScalingGroups (https://intl.cloud.tencent.com/document/api/377/20438?from_cn_redirect=1), and retrieve AutoScalingGroupId from the returned information. 
     * @return AutoScalingGroupId Scaling group ID. obtain the scaling group ID by logging in to the console (https://console.cloud.tencent.com/autoscaling/group) or calling the api DescribeAutoScalingGroups (https://intl.cloud.tencent.com/document/api/377/20438?from_cn_redirect=1), and retrieve AutoScalingGroupId from the returned information.
     */
    public String getAutoScalingGroupId() {
        return this.AutoScalingGroupId;
    }

    /**
     * Set Scaling group ID. obtain the scaling group ID by logging in to the console (https://console.cloud.tencent.com/autoscaling/group) or calling the api DescribeAutoScalingGroups (https://intl.cloud.tencent.com/document/api/377/20438?from_cn_redirect=1), and retrieve AutoScalingGroupId from the returned information.
     * @param AutoScalingGroupId Scaling group ID. obtain the scaling group ID by logging in to the console (https://console.cloud.tencent.com/autoscaling/group) or calling the api DescribeAutoScalingGroups (https://intl.cloud.tencent.com/document/api/377/20438?from_cn_redirect=1), and retrieve AutoScalingGroupId from the returned information.
     */
    public void setAutoScalingGroupId(String AutoScalingGroupId) {
        this.AutoScalingGroupId = AutoScalingGroupId;
    }

    /**
     * Get Specifies a list of classic load balancer ids with a maximum length of 20. either LoadBalancerIds or ForwardLoadBalancerIdentifications can be specified at the same time. can be obtained through the [DescribeLoadBalancers](https://intl.cloud.tencent.com/document/product/214/30685?from_cn_redirect=1) api. 
     * @return LoadBalancerIds Specifies a list of classic load balancer ids with a maximum length of 20. either LoadBalancerIds or ForwardLoadBalancerIdentifications can be specified at the same time. can be obtained through the [DescribeLoadBalancers](https://intl.cloud.tencent.com/document/product/214/30685?from_cn_redirect=1) api.
     */
    public String [] getLoadBalancerIds() {
        return this.LoadBalancerIds;
    }

    /**
     * Set Specifies a list of classic load balancer ids with a maximum length of 20. either LoadBalancerIds or ForwardLoadBalancerIdentifications can be specified at the same time. can be obtained through the [DescribeLoadBalancers](https://intl.cloud.tencent.com/document/product/214/30685?from_cn_redirect=1) api.
     * @param LoadBalancerIds Specifies a list of classic load balancer ids with a maximum length of 20. either LoadBalancerIds or ForwardLoadBalancerIdentifications can be specified at the same time. can be obtained through the [DescribeLoadBalancers](https://intl.cloud.tencent.com/document/product/214/30685?from_cn_redirect=1) api.
     */
    public void setLoadBalancerIds(String [] LoadBalancerIds) {
        this.LoadBalancerIds = LoadBalancerIds;
    }

    /**
     * Get Specifies the list of cloud load balancer identification information with a maximum length of 100. either LoadBalancerIds or ForwardLoadBalancerIdentifications can be specified at the same time. can be obtained through the [DescribeLoadBalancers](https://intl.cloud.tencent.com/document/product/214/30685?from_cn_redirect=1) api. 
     * @return ForwardLoadBalancerIdentifications Specifies the list of cloud load balancer identification information with a maximum length of 100. either LoadBalancerIds or ForwardLoadBalancerIdentifications can be specified at the same time. can be obtained through the [DescribeLoadBalancers](https://intl.cloud.tencent.com/document/product/214/30685?from_cn_redirect=1) api.
     */
    public ForwardLoadBalancerIdentification [] getForwardLoadBalancerIdentifications() {
        return this.ForwardLoadBalancerIdentifications;
    }

    /**
     * Set Specifies the list of cloud load balancer identification information with a maximum length of 100. either LoadBalancerIds or ForwardLoadBalancerIdentifications can be specified at the same time. can be obtained through the [DescribeLoadBalancers](https://intl.cloud.tencent.com/document/product/214/30685?from_cn_redirect=1) api.
     * @param ForwardLoadBalancerIdentifications Specifies the list of cloud load balancer identification information with a maximum length of 100. either LoadBalancerIds or ForwardLoadBalancerIdentifications can be specified at the same time. can be obtained through the [DescribeLoadBalancers](https://intl.cloud.tencent.com/document/product/214/30685?from_cn_redirect=1) api.
     */
    public void setForwardLoadBalancerIdentifications(ForwardLoadBalancerIdentification [] ForwardLoadBalancerIdentifications) {
        this.ForwardLoadBalancerIdentifications = ForwardLoadBalancerIdentifications;
    }

    public DetachLoadBalancersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DetachLoadBalancersRequest(DetachLoadBalancersRequest source) {
        if (source.AutoScalingGroupId != null) {
            this.AutoScalingGroupId = new String(source.AutoScalingGroupId);
        }
        if (source.LoadBalancerIds != null) {
            this.LoadBalancerIds = new String[source.LoadBalancerIds.length];
            for (int i = 0; i < source.LoadBalancerIds.length; i++) {
                this.LoadBalancerIds[i] = new String(source.LoadBalancerIds[i]);
            }
        }
        if (source.ForwardLoadBalancerIdentifications != null) {
            this.ForwardLoadBalancerIdentifications = new ForwardLoadBalancerIdentification[source.ForwardLoadBalancerIdentifications.length];
            for (int i = 0; i < source.ForwardLoadBalancerIdentifications.length; i++) {
                this.ForwardLoadBalancerIdentifications[i] = new ForwardLoadBalancerIdentification(source.ForwardLoadBalancerIdentifications[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoScalingGroupId", this.AutoScalingGroupId);
        this.setParamArraySimple(map, prefix + "LoadBalancerIds.", this.LoadBalancerIds);
        this.setParamArrayObj(map, prefix + "ForwardLoadBalancerIdentifications.", this.ForwardLoadBalancerIdentifications);

    }
}

