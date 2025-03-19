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
package com.tencentcloudapi.gwlb.v20240906.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GatewayLoadBalancer extends AbstractModel {

    /**
    * GWLB instance ID.
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * Name of the GWLB instance.
    */
    @SerializedName("LoadBalancerName")
    @Expose
    private String LoadBalancerName;

    /**
    * VPC to which the GWLB belongs.Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Subnet to which the GWLB belongs.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Virtual IP of GWLB for providing service.
    */
    @SerializedName("Vips")
    @Expose
    private String [] Vips;

    /**
    * GWLB instance status.0: creating, 1: normal operation, 3: deleting.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Unique ID of associated target group.Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("TargetGroupId")
    @Expose
    private String TargetGroupId;

    /**
    * Whether to enable the deletion protection feature.Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("DeleteProtect")
    @Expose
    private Boolean DeleteProtect;

    /**
    * Tag information on the CLB instance.Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
    * Creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Billing type of the GWLB instance. POSTPAID_BY_HOUR: pay-as-you-goNote: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ChargeType")
    @Expose
    private String ChargeType;

    /**
    * 0: Not isolated; 1: Isolated.

Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Isolation")
    @Expose
    private Long Isolation;

    /**
    * CLB instance isolation time

Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("IsolatedTime")
    @Expose
    private String IsolatedTime;

    /**
     * Get GWLB instance ID. 
     * @return LoadBalancerId GWLB instance ID.
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set GWLB instance ID.
     * @param LoadBalancerId GWLB instance ID.
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get Name of the GWLB instance. 
     * @return LoadBalancerName Name of the GWLB instance.
     */
    public String getLoadBalancerName() {
        return this.LoadBalancerName;
    }

    /**
     * Set Name of the GWLB instance.
     * @param LoadBalancerName Name of the GWLB instance.
     */
    public void setLoadBalancerName(String LoadBalancerName) {
        this.LoadBalancerName = LoadBalancerName;
    }

    /**
     * Get VPC to which the GWLB belongs.Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return VpcId VPC to which the GWLB belongs.Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC to which the GWLB belongs.Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param VpcId VPC to which the GWLB belongs.Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Subnet to which the GWLB belongs. 
     * @return SubnetId Subnet to which the GWLB belongs.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet to which the GWLB belongs.
     * @param SubnetId Subnet to which the GWLB belongs.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Virtual IP of GWLB for providing service. 
     * @return Vips Virtual IP of GWLB for providing service.
     */
    public String [] getVips() {
        return this.Vips;
    }

    /**
     * Set Virtual IP of GWLB for providing service.
     * @param Vips Virtual IP of GWLB for providing service.
     */
    public void setVips(String [] Vips) {
        this.Vips = Vips;
    }

    /**
     * Get GWLB instance status.0: creating, 1: normal operation, 3: deleting. 
     * @return Status GWLB instance status.0: creating, 1: normal operation, 3: deleting.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set GWLB instance status.0: creating, 1: normal operation, 3: deleting.
     * @param Status GWLB instance status.0: creating, 1: normal operation, 3: deleting.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Unique ID of associated target group.Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return TargetGroupId Unique ID of associated target group.Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getTargetGroupId() {
        return this.TargetGroupId;
    }

    /**
     * Set Unique ID of associated target group.Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param TargetGroupId Unique ID of associated target group.Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setTargetGroupId(String TargetGroupId) {
        this.TargetGroupId = TargetGroupId;
    }

    /**
     * Get Whether to enable the deletion protection feature.Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return DeleteProtect Whether to enable the deletion protection feature.Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Boolean getDeleteProtect() {
        return this.DeleteProtect;
    }

    /**
     * Set Whether to enable the deletion protection feature.Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param DeleteProtect Whether to enable the deletion protection feature.Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setDeleteProtect(Boolean DeleteProtect) {
        this.DeleteProtect = DeleteProtect;
    }

    /**
     * Get Tag information on the CLB instance.Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Tags Tag information on the CLB instance.Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag information on the CLB instance.Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Tags Tag information on the CLB instance.Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Creation time. 
     * @return CreateTime Creation time.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time.
     * @param CreateTime Creation time.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Billing type of the GWLB instance. POSTPAID_BY_HOUR: pay-as-you-goNote: this field may return `null`, indicating that no valid values can be obtained. 
     * @return ChargeType Billing type of the GWLB instance. POSTPAID_BY_HOUR: pay-as-you-goNote: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set Billing type of the GWLB instance. POSTPAID_BY_HOUR: pay-as-you-goNote: this field may return `null`, indicating that no valid values can be obtained.
     * @param ChargeType Billing type of the GWLB instance. POSTPAID_BY_HOUR: pay-as-you-goNote: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setChargeType(String ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get 0: Not isolated; 1: Isolated.

Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Isolation 0: Not isolated; 1: Isolated.

Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getIsolation() {
        return this.Isolation;
    }

    /**
     * Set 0: Not isolated; 1: Isolated.

Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Isolation 0: Not isolated; 1: Isolated.

Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setIsolation(Long Isolation) {
        this.Isolation = Isolation;
    }

    /**
     * Get CLB instance isolation time

Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return IsolatedTime CLB instance isolation time

Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getIsolatedTime() {
        return this.IsolatedTime;
    }

    /**
     * Set CLB instance isolation time

Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param IsolatedTime CLB instance isolation time

Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setIsolatedTime(String IsolatedTime) {
        this.IsolatedTime = IsolatedTime;
    }

    public GatewayLoadBalancer() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GatewayLoadBalancer(GatewayLoadBalancer source) {
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.LoadBalancerName != null) {
            this.LoadBalancerName = new String(source.LoadBalancerName);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Vips != null) {
            this.Vips = new String[source.Vips.length];
            for (int i = 0; i < source.Vips.length; i++) {
                this.Vips[i] = new String(source.Vips[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.TargetGroupId != null) {
            this.TargetGroupId = new String(source.TargetGroupId);
        }
        if (source.DeleteProtect != null) {
            this.DeleteProtect = new Boolean(source.DeleteProtect);
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ChargeType != null) {
            this.ChargeType = new String(source.ChargeType);
        }
        if (source.Isolation != null) {
            this.Isolation = new Long(source.Isolation);
        }
        if (source.IsolatedTime != null) {
            this.IsolatedTime = new String(source.IsolatedTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "LoadBalancerName", this.LoadBalancerName);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamArraySimple(map, prefix + "Vips.", this.Vips);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TargetGroupId", this.TargetGroupId);
        this.setParamSimple(map, prefix + "DeleteProtect", this.DeleteProtect);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamSimple(map, prefix + "Isolation", this.Isolation);
        this.setParamSimple(map, prefix + "IsolatedTime", this.IsolatedTime);

    }
}

