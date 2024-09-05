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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TargetGroupAssociation extends AbstractModel {

    /**
    * CLB instance ID
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * Target group ID
    */
    @SerializedName("TargetGroupId")
    @Expose
    private String TargetGroupId;

    /**
    * Listener ID. This parameter is required when the AssociateTargetGroups and DisassociateTargetGroups APIs are called.
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * Forwarding rule ID
    */
    @SerializedName("LocationId")
    @Expose
    private String LocationId;

    /**
    * Weight of the target group. Value range: [0, 100]. It takes effect only for binding v2 target groups. If not specified, it defaults to 10.
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
     * Get CLB instance ID 
     * @return LoadBalancerId CLB instance ID
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set CLB instance ID
     * @param LoadBalancerId CLB instance ID
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get Target group ID 
     * @return TargetGroupId Target group ID
     */
    public String getTargetGroupId() {
        return this.TargetGroupId;
    }

    /**
     * Set Target group ID
     * @param TargetGroupId Target group ID
     */
    public void setTargetGroupId(String TargetGroupId) {
        this.TargetGroupId = TargetGroupId;
    }

    /**
     * Get Listener ID. This parameter is required when the AssociateTargetGroups and DisassociateTargetGroups APIs are called. 
     * @return ListenerId Listener ID. This parameter is required when the AssociateTargetGroups and DisassociateTargetGroups APIs are called.
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set Listener ID. This parameter is required when the AssociateTargetGroups and DisassociateTargetGroups APIs are called.
     * @param ListenerId Listener ID. This parameter is required when the AssociateTargetGroups and DisassociateTargetGroups APIs are called.
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get Forwarding rule ID 
     * @return LocationId Forwarding rule ID
     */
    public String getLocationId() {
        return this.LocationId;
    }

    /**
     * Set Forwarding rule ID
     * @param LocationId Forwarding rule ID
     */
    public void setLocationId(String LocationId) {
        this.LocationId = LocationId;
    }

    /**
     * Get Weight of the target group. Value range: [0, 100]. It takes effect only for binding v2 target groups. If not specified, it defaults to 10. 
     * @return Weight Weight of the target group. Value range: [0, 100]. It takes effect only for binding v2 target groups. If not specified, it defaults to 10.
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set Weight of the target group. Value range: [0, 100]. It takes effect only for binding v2 target groups. If not specified, it defaults to 10.
     * @param Weight Weight of the target group. Value range: [0, 100]. It takes effect only for binding v2 target groups. If not specified, it defaults to 10.
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    public TargetGroupAssociation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TargetGroupAssociation(TargetGroupAssociation source) {
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.TargetGroupId != null) {
            this.TargetGroupId = new String(source.TargetGroupId);
        }
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.LocationId != null) {
            this.LocationId = new String(source.LocationId);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "TargetGroupId", this.TargetGroupId);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "LocationId", this.LocationId);
        this.setParamSimple(map, prefix + "Weight", this.Weight);

    }
}

