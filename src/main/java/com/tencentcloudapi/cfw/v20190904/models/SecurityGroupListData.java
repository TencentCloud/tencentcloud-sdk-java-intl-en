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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecurityGroupListData extends AbstractModel {

    /**
    * Priority
    */
    @SerializedName("OrderIndex")
    @Expose
    private Long OrderIndex;

    /**
    * Access source
    */
    @SerializedName("SourceId")
    @Expose
    private String SourceId;

    /**
    * Access source type. Default: 0. 1: VPC; 2: SUBNET; 3: CVM; 4: CLB; 5: ENI; 6: CDB; 7: Parameter template. 100: Resource group
    */
    @SerializedName("SourceType")
    @Expose
    private Long SourceType;

    /**
    * Access destination
    */
    @SerializedName("TargetId")
    @Expose
    private String TargetId;

    /**
    * Access destination type. Default: 0. 1: VPC; 2: SUBNET; 3: CVM; 4: CLB; 5: ENI; 6: CDB; 7: Parameter template; 100: resource group
    */
    @SerializedName("TargetType")
    @Expose
    private Long TargetType;

    /**
    * Protocol
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Destination port
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * Policy. 1: block; 2: allow
    */
    @SerializedName("Strategy")
    @Expose
    private Long Strategy;

    /**
    * Description
    */
    @SerializedName("Detail")
    @Expose
    private String Detail;

    /**
    * One-way/two-way. 0: one-way; 1: two-way
    */
    @SerializedName("BothWay")
    @Expose
    private Long BothWay;

    /**
    * Rule ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Toggle status. 0: off; 1: on
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Indicates whether the rule is normal. 0: normal; 1: abnormal
    */
    @SerializedName("IsNew")
    @Expose
    private Long IsNew;

    /**
    * VPC ID
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Subnet ID
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Instance name
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Public IP. Multiple IPs are separated by commas.
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * Private IP. Multiple IPs are separated by commas.
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("PrivateIp")
    @Expose
    private String PrivateIp;

    /**
    * Masked address. Multiple addresses are separated by commas.
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("Cidr")
    @Expose
    private String Cidr;

    /**
    * Port protocol template ID
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("ServiceTemplateId")
    @Expose
    private String ServiceTemplateId;

    /**
    * Two-way rules
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("BothWayInfo")
    @Expose
    private SecurityGroupBothWayInfo [] BothWayInfo;

    /**
    * Direction. 0: outbound; 1: inbound. 1 by default
    */
    @SerializedName("Direction")
    @Expose
    private Long Direction;

    /**
    * Indicates whether to use the port protocol template. 0: no; 1: yes
    */
    @SerializedName("ProtocolPortType")
    @Expose
    private Long ProtocolPortType;

    /**
     * Get Priority 
     * @return OrderIndex Priority
     */
    public Long getOrderIndex() {
        return this.OrderIndex;
    }

    /**
     * Set Priority
     * @param OrderIndex Priority
     */
    public void setOrderIndex(Long OrderIndex) {
        this.OrderIndex = OrderIndex;
    }

    /**
     * Get Access source 
     * @return SourceId Access source
     */
    public String getSourceId() {
        return this.SourceId;
    }

    /**
     * Set Access source
     * @param SourceId Access source
     */
    public void setSourceId(String SourceId) {
        this.SourceId = SourceId;
    }

    /**
     * Get Access source type. Default: 0. 1: VPC; 2: SUBNET; 3: CVM; 4: CLB; 5: ENI; 6: CDB; 7: Parameter template. 100: Resource group 
     * @return SourceType Access source type. Default: 0. 1: VPC; 2: SUBNET; 3: CVM; 4: CLB; 5: ENI; 6: CDB; 7: Parameter template. 100: Resource group
     */
    public Long getSourceType() {
        return this.SourceType;
    }

    /**
     * Set Access source type. Default: 0. 1: VPC; 2: SUBNET; 3: CVM; 4: CLB; 5: ENI; 6: CDB; 7: Parameter template. 100: Resource group
     * @param SourceType Access source type. Default: 0. 1: VPC; 2: SUBNET; 3: CVM; 4: CLB; 5: ENI; 6: CDB; 7: Parameter template. 100: Resource group
     */
    public void setSourceType(Long SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get Access destination 
     * @return TargetId Access destination
     */
    public String getTargetId() {
        return this.TargetId;
    }

    /**
     * Set Access destination
     * @param TargetId Access destination
     */
    public void setTargetId(String TargetId) {
        this.TargetId = TargetId;
    }

    /**
     * Get Access destination type. Default: 0. 1: VPC; 2: SUBNET; 3: CVM; 4: CLB; 5: ENI; 6: CDB; 7: Parameter template; 100: resource group 
     * @return TargetType Access destination type. Default: 0. 1: VPC; 2: SUBNET; 3: CVM; 4: CLB; 5: ENI; 6: CDB; 7: Parameter template; 100: resource group
     */
    public Long getTargetType() {
        return this.TargetType;
    }

    /**
     * Set Access destination type. Default: 0. 1: VPC; 2: SUBNET; 3: CVM; 4: CLB; 5: ENI; 6: CDB; 7: Parameter template; 100: resource group
     * @param TargetType Access destination type. Default: 0. 1: VPC; 2: SUBNET; 3: CVM; 4: CLB; 5: ENI; 6: CDB; 7: Parameter template; 100: resource group
     */
    public void setTargetType(Long TargetType) {
        this.TargetType = TargetType;
    }

    /**
     * Get Protocol 
     * @return Protocol Protocol
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Protocol
     * @param Protocol Protocol
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Destination port 
     * @return Port Destination port
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set Destination port
     * @param Port Destination port
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get Policy. 1: block; 2: allow 
     * @return Strategy Policy. 1: block; 2: allow
     */
    public Long getStrategy() {
        return this.Strategy;
    }

    /**
     * Set Policy. 1: block; 2: allow
     * @param Strategy Policy. 1: block; 2: allow
     */
    public void setStrategy(Long Strategy) {
        this.Strategy = Strategy;
    }

    /**
     * Get Description 
     * @return Detail Description
     */
    public String getDetail() {
        return this.Detail;
    }

    /**
     * Set Description
     * @param Detail Description
     */
    public void setDetail(String Detail) {
        this.Detail = Detail;
    }

    /**
     * Get One-way/two-way. 0: one-way; 1: two-way 
     * @return BothWay One-way/two-way. 0: one-way; 1: two-way
     */
    public Long getBothWay() {
        return this.BothWay;
    }

    /**
     * Set One-way/two-way. 0: one-way; 1: two-way
     * @param BothWay One-way/two-way. 0: one-way; 1: two-way
     */
    public void setBothWay(Long BothWay) {
        this.BothWay = BothWay;
    }

    /**
     * Get Rule ID 
     * @return Id Rule ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Rule ID
     * @param Id Rule ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Toggle status. 0: off; 1: on 
     * @return Status Toggle status. 0: off; 1: on
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Toggle status. 0: off; 1: on
     * @param Status Toggle status. 0: off; 1: on
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Indicates whether the rule is normal. 0: normal; 1: abnormal 
     * @return IsNew Indicates whether the rule is normal. 0: normal; 1: abnormal
     */
    public Long getIsNew() {
        return this.IsNew;
    }

    /**
     * Set Indicates whether the rule is normal. 0: normal; 1: abnormal
     * @param IsNew Indicates whether the rule is normal. 0: normal; 1: abnormal
     */
    public void setIsNew(Long IsNew) {
        this.IsNew = IsNew;
    }

    /**
     * Get VPC ID
Note: This field may return `null`, indicating that no valid value was found. 
     * @return VpcId VPC ID
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID
Note: This field may return `null`, indicating that no valid value was found.
     * @param VpcId VPC ID
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Subnet ID
Note: This field may return `null`, indicating that no valid value was found. 
     * @return SubnetId Subnet ID
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet ID
Note: This field may return `null`, indicating that no valid value was found.
     * @param SubnetId Subnet ID
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Instance name
Note: This field may return `null`, indicating that no valid value was found. 
     * @return InstanceName Instance name
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name
Note: This field may return `null`, indicating that no valid value was found.
     * @param InstanceName Instance name
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Public IP. Multiple IPs are separated by commas.
Note: This field may return `null`, indicating that no valid value was found. 
     * @return PublicIp Public IP. Multiple IPs are separated by commas.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set Public IP. Multiple IPs are separated by commas.
Note: This field may return `null`, indicating that no valid value was found.
     * @param PublicIp Public IP. Multiple IPs are separated by commas.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get Private IP. Multiple IPs are separated by commas.
Note: This field may return `null`, indicating that no valid value was found. 
     * @return PrivateIp Private IP. Multiple IPs are separated by commas.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getPrivateIp() {
        return this.PrivateIp;
    }

    /**
     * Set Private IP. Multiple IPs are separated by commas.
Note: This field may return `null`, indicating that no valid value was found.
     * @param PrivateIp Private IP. Multiple IPs are separated by commas.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setPrivateIp(String PrivateIp) {
        this.PrivateIp = PrivateIp;
    }

    /**
     * Get Masked address. Multiple addresses are separated by commas.
Note: This field may return `null`, indicating that no valid value was found. 
     * @return Cidr Masked address. Multiple addresses are separated by commas.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getCidr() {
        return this.Cidr;
    }

    /**
     * Set Masked address. Multiple addresses are separated by commas.
Note: This field may return `null`, indicating that no valid value was found.
     * @param Cidr Masked address. Multiple addresses are separated by commas.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setCidr(String Cidr) {
        this.Cidr = Cidr;
    }

    /**
     * Get Port protocol template ID
Note: This field may return `null`, indicating that no valid value was found. 
     * @return ServiceTemplateId Port protocol template ID
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getServiceTemplateId() {
        return this.ServiceTemplateId;
    }

    /**
     * Set Port protocol template ID
Note: This field may return `null`, indicating that no valid value was found.
     * @param ServiceTemplateId Port protocol template ID
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setServiceTemplateId(String ServiceTemplateId) {
        this.ServiceTemplateId = ServiceTemplateId;
    }

    /**
     * Get Two-way rules
Note: This field may return `null`, indicating that no valid value was found. 
     * @return BothWayInfo Two-way rules
Note: This field may return `null`, indicating that no valid value was found.
     */
    public SecurityGroupBothWayInfo [] getBothWayInfo() {
        return this.BothWayInfo;
    }

    /**
     * Set Two-way rules
Note: This field may return `null`, indicating that no valid value was found.
     * @param BothWayInfo Two-way rules
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setBothWayInfo(SecurityGroupBothWayInfo [] BothWayInfo) {
        this.BothWayInfo = BothWayInfo;
    }

    /**
     * Get Direction. 0: outbound; 1: inbound. 1 by default 
     * @return Direction Direction. 0: outbound; 1: inbound. 1 by default
     */
    public Long getDirection() {
        return this.Direction;
    }

    /**
     * Set Direction. 0: outbound; 1: inbound. 1 by default
     * @param Direction Direction. 0: outbound; 1: inbound. 1 by default
     */
    public void setDirection(Long Direction) {
        this.Direction = Direction;
    }

    /**
     * Get Indicates whether to use the port protocol template. 0: no; 1: yes 
     * @return ProtocolPortType Indicates whether to use the port protocol template. 0: no; 1: yes
     */
    public Long getProtocolPortType() {
        return this.ProtocolPortType;
    }

    /**
     * Set Indicates whether to use the port protocol template. 0: no; 1: yes
     * @param ProtocolPortType Indicates whether to use the port protocol template. 0: no; 1: yes
     */
    public void setProtocolPortType(Long ProtocolPortType) {
        this.ProtocolPortType = ProtocolPortType;
    }

    public SecurityGroupListData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecurityGroupListData(SecurityGroupListData source) {
        if (source.OrderIndex != null) {
            this.OrderIndex = new Long(source.OrderIndex);
        }
        if (source.SourceId != null) {
            this.SourceId = new String(source.SourceId);
        }
        if (source.SourceType != null) {
            this.SourceType = new Long(source.SourceType);
        }
        if (source.TargetId != null) {
            this.TargetId = new String(source.TargetId);
        }
        if (source.TargetType != null) {
            this.TargetType = new Long(source.TargetType);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Port != null) {
            this.Port = new String(source.Port);
        }
        if (source.Strategy != null) {
            this.Strategy = new Long(source.Strategy);
        }
        if (source.Detail != null) {
            this.Detail = new String(source.Detail);
        }
        if (source.BothWay != null) {
            this.BothWay = new Long(source.BothWay);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.IsNew != null) {
            this.IsNew = new Long(source.IsNew);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.PublicIp != null) {
            this.PublicIp = new String(source.PublicIp);
        }
        if (source.PrivateIp != null) {
            this.PrivateIp = new String(source.PrivateIp);
        }
        if (source.Cidr != null) {
            this.Cidr = new String(source.Cidr);
        }
        if (source.ServiceTemplateId != null) {
            this.ServiceTemplateId = new String(source.ServiceTemplateId);
        }
        if (source.BothWayInfo != null) {
            this.BothWayInfo = new SecurityGroupBothWayInfo[source.BothWayInfo.length];
            for (int i = 0; i < source.BothWayInfo.length; i++) {
                this.BothWayInfo[i] = new SecurityGroupBothWayInfo(source.BothWayInfo[i]);
            }
        }
        if (source.Direction != null) {
            this.Direction = new Long(source.Direction);
        }
        if (source.ProtocolPortType != null) {
            this.ProtocolPortType = new Long(source.ProtocolPortType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrderIndex", this.OrderIndex);
        this.setParamSimple(map, prefix + "SourceId", this.SourceId);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "TargetId", this.TargetId);
        this.setParamSimple(map, prefix + "TargetType", this.TargetType);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Strategy", this.Strategy);
        this.setParamSimple(map, prefix + "Detail", this.Detail);
        this.setParamSimple(map, prefix + "BothWay", this.BothWay);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "IsNew", this.IsNew);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamSimple(map, prefix + "PrivateIp", this.PrivateIp);
        this.setParamSimple(map, prefix + "Cidr", this.Cidr);
        this.setParamSimple(map, prefix + "ServiceTemplateId", this.ServiceTemplateId);
        this.setParamArrayObj(map, prefix + "BothWayInfo.", this.BothWayInfo);
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamSimple(map, prefix + "ProtocolPortType", this.ProtocolPortType);

    }
}

