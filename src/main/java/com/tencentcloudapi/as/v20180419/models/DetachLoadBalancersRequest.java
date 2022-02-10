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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DetachLoadBalancersRequest extends AbstractModel{

    /**
    * Scaling group ID
    */
    @SerializedName("AutoScalingGroupId")
    @Expose
    private String AutoScalingGroupId;

    /**
    * List of classic CLB IDs. Up to 20 IDs are allowed. `LoadBalancerIds` and `ForwardLoadBalancerIdentifications` cannot be specified at the same time.
    */
    @SerializedName("LoadBalancerIds")
    @Expose
    private String [] LoadBalancerIds;

    /**
    * List of application CLB IDs. Up to 50 IDs are allowed. `LoadBalancerIds` and `ForwardLoadBalancerIdentifications` cannot be specified at the same time.
    */
    @SerializedName("ForwardLoadBalancerIdentifications")
    @Expose
    private ForwardLoadBalancerIdentification [] ForwardLoadBalancerIdentifications;

    /**
     * Get Scaling group ID 
     * @return AutoScalingGroupId Scaling group ID
     */
    public String getAutoScalingGroupId() {
        return this.AutoScalingGroupId;
    }

    /**
     * Set Scaling group ID
     * @param AutoScalingGroupId Scaling group ID
     */
    public void setAutoScalingGroupId(String AutoScalingGroupId) {
        this.AutoScalingGroupId = AutoScalingGroupId;
    }

    /**
     * Get List of classic CLB IDs. Up to 20 IDs are allowed. `LoadBalancerIds` and `ForwardLoadBalancerIdentifications` cannot be specified at the same time. 
     * @return LoadBalancerIds List of classic CLB IDs. Up to 20 IDs are allowed. `LoadBalancerIds` and `ForwardLoadBalancerIdentifications` cannot be specified at the same time.
     */
    public String [] getLoadBalancerIds() {
        return this.LoadBalancerIds;
    }

    /**
     * Set List of classic CLB IDs. Up to 20 IDs are allowed. `LoadBalancerIds` and `ForwardLoadBalancerIdentifications` cannot be specified at the same time.
     * @param LoadBalancerIds List of classic CLB IDs. Up to 20 IDs are allowed. `LoadBalancerIds` and `ForwardLoadBalancerIdentifications` cannot be specified at the same time.
     */
    public void setLoadBalancerIds(String [] LoadBalancerIds) {
        this.LoadBalancerIds = LoadBalancerIds;
    }

    /**
     * Get List of application CLB IDs. Up to 50 IDs are allowed. `LoadBalancerIds` and `ForwardLoadBalancerIdentifications` cannot be specified at the same time. 
     * @return ForwardLoadBalancerIdentifications List of application CLB IDs. Up to 50 IDs are allowed. `LoadBalancerIds` and `ForwardLoadBalancerIdentifications` cannot be specified at the same time.
     */
    public ForwardLoadBalancerIdentification [] getForwardLoadBalancerIdentifications() {
        return this.ForwardLoadBalancerIdentifications;
    }

    /**
     * Set List of application CLB IDs. Up to 50 IDs are allowed. `LoadBalancerIds` and `ForwardLoadBalancerIdentifications` cannot be specified at the same time.
     * @param ForwardLoadBalancerIdentifications List of application CLB IDs. Up to 50 IDs are allowed. `LoadBalancerIds` and `ForwardLoadBalancerIdentifications` cannot be specified at the same time.
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

