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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EndPoint extends AbstractModel{

    /**
    * Endpoint ID
    */
    @SerializedName("EndPointId")
    @Expose
    private String EndPointId;

    /**
    * VPC ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Subnet ID
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * APP ID
    */
    @SerializedName("EndPointOwner")
    @Expose
    private String EndPointOwner;

    /**
    * Endpoint name
    */
    @SerializedName("EndPointName")
    @Expose
    private String EndPointName;

    /**
    * Endpoint service VPC ID
    */
    @SerializedName("ServiceVpcId")
    @Expose
    private String ServiceVpcId;

    /**
    * Endpoint service VIP
    */
    @SerializedName("ServiceVip")
    @Expose
    private String ServiceVip;

    /**
    * Endpoint service ID
    */
    @SerializedName("EndPointServiceId")
    @Expose
    private String EndPointServiceId;

    /**
    * Endpoint VIP
    */
    @SerializedName("EndPointVip")
    @Expose
    private String EndPointVip;

    /**
    * Endpoint status. Valid values: `ACTIVE` (available), `PENDING` (to be accepted), `ACCEPTING` (being accepted), `REJECTED` (rejected), and `FAILED` (failed).
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * ID list of security group instances bound with endpoints
    */
    @SerializedName("GroupSet")
    @Expose
    private String [] GroupSet;

    /**
    * Endpoint service name
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
     * Get Endpoint ID 
     * @return EndPointId Endpoint ID
     */
    public String getEndPointId() {
        return this.EndPointId;
    }

    /**
     * Set Endpoint ID
     * @param EndPointId Endpoint ID
     */
    public void setEndPointId(String EndPointId) {
        this.EndPointId = EndPointId;
    }

    /**
     * Get VPC ID 
     * @return VpcId VPC ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID
     * @param VpcId VPC ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Subnet ID 
     * @return SubnetId Subnet ID
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet ID
     * @param SubnetId Subnet ID
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get APP ID 
     * @return EndPointOwner APP ID
     */
    public String getEndPointOwner() {
        return this.EndPointOwner;
    }

    /**
     * Set APP ID
     * @param EndPointOwner APP ID
     */
    public void setEndPointOwner(String EndPointOwner) {
        this.EndPointOwner = EndPointOwner;
    }

    /**
     * Get Endpoint name 
     * @return EndPointName Endpoint name
     */
    public String getEndPointName() {
        return this.EndPointName;
    }

    /**
     * Set Endpoint name
     * @param EndPointName Endpoint name
     */
    public void setEndPointName(String EndPointName) {
        this.EndPointName = EndPointName;
    }

    /**
     * Get Endpoint service VPC ID 
     * @return ServiceVpcId Endpoint service VPC ID
     */
    public String getServiceVpcId() {
        return this.ServiceVpcId;
    }

    /**
     * Set Endpoint service VPC ID
     * @param ServiceVpcId Endpoint service VPC ID
     */
    public void setServiceVpcId(String ServiceVpcId) {
        this.ServiceVpcId = ServiceVpcId;
    }

    /**
     * Get Endpoint service VIP 
     * @return ServiceVip Endpoint service VIP
     */
    public String getServiceVip() {
        return this.ServiceVip;
    }

    /**
     * Set Endpoint service VIP
     * @param ServiceVip Endpoint service VIP
     */
    public void setServiceVip(String ServiceVip) {
        this.ServiceVip = ServiceVip;
    }

    /**
     * Get Endpoint service ID 
     * @return EndPointServiceId Endpoint service ID
     */
    public String getEndPointServiceId() {
        return this.EndPointServiceId;
    }

    /**
     * Set Endpoint service ID
     * @param EndPointServiceId Endpoint service ID
     */
    public void setEndPointServiceId(String EndPointServiceId) {
        this.EndPointServiceId = EndPointServiceId;
    }

    /**
     * Get Endpoint VIP 
     * @return EndPointVip Endpoint VIP
     */
    public String getEndPointVip() {
        return this.EndPointVip;
    }

    /**
     * Set Endpoint VIP
     * @param EndPointVip Endpoint VIP
     */
    public void setEndPointVip(String EndPointVip) {
        this.EndPointVip = EndPointVip;
    }

    /**
     * Get Endpoint status. Valid values: `ACTIVE` (available), `PENDING` (to be accepted), `ACCEPTING` (being accepted), `REJECTED` (rejected), and `FAILED` (failed). 
     * @return State Endpoint status. Valid values: `ACTIVE` (available), `PENDING` (to be accepted), `ACCEPTING` (being accepted), `REJECTED` (rejected), and `FAILED` (failed).
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set Endpoint status. Valid values: `ACTIVE` (available), `PENDING` (to be accepted), `ACCEPTING` (being accepted), `REJECTED` (rejected), and `FAILED` (failed).
     * @param State Endpoint status. Valid values: `ACTIVE` (available), `PENDING` (to be accepted), `ACCEPTING` (being accepted), `REJECTED` (rejected), and `FAILED` (failed).
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get Creation time 
     * @return CreateTime Creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
     * @param CreateTime Creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get ID list of security group instances bound with endpoints 
     * @return GroupSet ID list of security group instances bound with endpoints
     */
    public String [] getGroupSet() {
        return this.GroupSet;
    }

    /**
     * Set ID list of security group instances bound with endpoints
     * @param GroupSet ID list of security group instances bound with endpoints
     */
    public void setGroupSet(String [] GroupSet) {
        this.GroupSet = GroupSet;
    }

    /**
     * Get Endpoint service name
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return ServiceName Endpoint service name
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set Endpoint service name
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param ServiceName Endpoint service name
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    public EndPoint() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EndPoint(EndPoint source) {
        if (source.EndPointId != null) {
            this.EndPointId = new String(source.EndPointId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.EndPointOwner != null) {
            this.EndPointOwner = new String(source.EndPointOwner);
        }
        if (source.EndPointName != null) {
            this.EndPointName = new String(source.EndPointName);
        }
        if (source.ServiceVpcId != null) {
            this.ServiceVpcId = new String(source.ServiceVpcId);
        }
        if (source.ServiceVip != null) {
            this.ServiceVip = new String(source.ServiceVip);
        }
        if (source.EndPointServiceId != null) {
            this.EndPointServiceId = new String(source.EndPointServiceId);
        }
        if (source.EndPointVip != null) {
            this.EndPointVip = new String(source.EndPointVip);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.GroupSet != null) {
            this.GroupSet = new String[source.GroupSet.length];
            for (int i = 0; i < source.GroupSet.length; i++) {
                this.GroupSet[i] = new String(source.GroupSet[i]);
            }
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EndPointId", this.EndPointId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "EndPointOwner", this.EndPointOwner);
        this.setParamSimple(map, prefix + "EndPointName", this.EndPointName);
        this.setParamSimple(map, prefix + "ServiceVpcId", this.ServiceVpcId);
        this.setParamSimple(map, prefix + "ServiceVip", this.ServiceVip);
        this.setParamSimple(map, prefix + "EndPointServiceId", this.EndPointServiceId);
        this.setParamSimple(map, prefix + "EndPointVip", this.EndPointVip);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamArraySimple(map, prefix + "GroupSet.", this.GroupSet);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);

    }
}

