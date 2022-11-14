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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecurityGroupBothWayInfo extends AbstractModel{

    /**
    * Priority
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("OrderIndex")
    @Expose
    private Long OrderIndex;

    /**
    * Access source
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("SourceId")
    @Expose
    private String SourceId;

    /**
    * Access source type. Default: 0. 0: IP; 1: VPC; 2: SUBNET; 3: CVM; 4: CLB; 5: ENI; 6: CDB; 7: Parameter template. 100: asset group
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("SourceType")
    @Expose
    private Long SourceType;

    /**
    * Access destination
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("TargetId")
    @Expose
    private String TargetId;

    /**
    * Access destination type. Default: 0. 0: IP; 1: VPC; 2: SUBNET; 3: CVM; 4: CLB; 5: ENI; 6: CDB; 7: Parameter template. 100: asset group
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("TargetType")
    @Expose
    private Long TargetType;

    /**
    * Protocol
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Destination port
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * Policy. 1: block; 2: allow
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("Strategy")
    @Expose
    private Long Strategy;

    /**
    * Direction. 0: outbound; 1: inbound. 1 by default
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("Direction")
    @Expose
    private Long Direction;

    /**
    * Region
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Description
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("Detail")
    @Expose
    private String Detail;

    /**
    * Toggle status. 0: off; 1: on
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Indicates whether the rule is normal. 0: normal; 1: abnormal
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("IsNew")
    @Expose
    private Long IsNew;

    /**
    * One-way/two-way. 0: one-way; 1: two-way
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("BothWay")
    @Expose
    private Long BothWay;

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
    * Indicates whether to use the port protocol template. 0: no; 1: yes
    */
    @SerializedName("ProtocolPortType")
    @Expose
    private Long ProtocolPortType;

    /**
     * Get Priority
Note: This field may return `null`, indicating that no valid value was found. 
     * @return OrderIndex Priority
Note: This field may return `null`, indicating that no valid value was found.
     */
    public Long getOrderIndex() {
        return this.OrderIndex;
    }

    /**
     * Set Priority
Note: This field may return `null`, indicating that no valid value was found.
     * @param OrderIndex Priority
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setOrderIndex(Long OrderIndex) {
        this.OrderIndex = OrderIndex;
    }

    /**
     * Get Access source
Note: This field may return `null`, indicating that no valid value was found. 
     * @return SourceId Access source
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getSourceId() {
        return this.SourceId;
    }

    /**
     * Set Access source
Note: This field may return `null`, indicating that no valid value was found.
     * @param SourceId Access source
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setSourceId(String SourceId) {
        this.SourceId = SourceId;
    }

    /**
     * Get Access source type. Default: 0. 0: IP; 1: VPC; 2: SUBNET; 3: CVM; 4: CLB; 5: ENI; 6: CDB; 7: Parameter template. 100: asset group
Note: This field may return `null`, indicating that no valid value was found. 
     * @return SourceType Access source type. Default: 0. 0: IP; 1: VPC; 2: SUBNET; 3: CVM; 4: CLB; 5: ENI; 6: CDB; 7: Parameter template. 100: asset group
Note: This field may return `null`, indicating that no valid value was found.
     */
    public Long getSourceType() {
        return this.SourceType;
    }

    /**
     * Set Access source type. Default: 0. 0: IP; 1: VPC; 2: SUBNET; 3: CVM; 4: CLB; 5: ENI; 6: CDB; 7: Parameter template. 100: asset group
Note: This field may return `null`, indicating that no valid value was found.
     * @param SourceType Access source type. Default: 0. 0: IP; 1: VPC; 2: SUBNET; 3: CVM; 4: CLB; 5: ENI; 6: CDB; 7: Parameter template. 100: asset group
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setSourceType(Long SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get Access destination
Note: This field may return `null`, indicating that no valid value was found. 
     * @return TargetId Access destination
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getTargetId() {
        return this.TargetId;
    }

    /**
     * Set Access destination
Note: This field may return `null`, indicating that no valid value was found.
     * @param TargetId Access destination
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setTargetId(String TargetId) {
        this.TargetId = TargetId;
    }

    /**
     * Get Access destination type. Default: 0. 0: IP; 1: VPC; 2: SUBNET; 3: CVM; 4: CLB; 5: ENI; 6: CDB; 7: Parameter template. 100: asset group
Note: This field may return `null`, indicating that no valid value was found. 
     * @return TargetType Access destination type. Default: 0. 0: IP; 1: VPC; 2: SUBNET; 3: CVM; 4: CLB; 5: ENI; 6: CDB; 7: Parameter template. 100: asset group
Note: This field may return `null`, indicating that no valid value was found.
     */
    public Long getTargetType() {
        return this.TargetType;
    }

    /**
     * Set Access destination type. Default: 0. 0: IP; 1: VPC; 2: SUBNET; 3: CVM; 4: CLB; 5: ENI; 6: CDB; 7: Parameter template. 100: asset group
Note: This field may return `null`, indicating that no valid value was found.
     * @param TargetType Access destination type. Default: 0. 0: IP; 1: VPC; 2: SUBNET; 3: CVM; 4: CLB; 5: ENI; 6: CDB; 7: Parameter template. 100: asset group
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setTargetType(Long TargetType) {
        this.TargetType = TargetType;
    }

    /**
     * Get Protocol
Note: This field may return `null`, indicating that no valid value was found. 
     * @return Protocol Protocol
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Protocol
Note: This field may return `null`, indicating that no valid value was found.
     * @param Protocol Protocol
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Destination port
Note: This field may return `null`, indicating that no valid value was found. 
     * @return Port Destination port
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set Destination port
Note: This field may return `null`, indicating that no valid value was found.
     * @param Port Destination port
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get Policy. 1: block; 2: allow
Note: This field may return `null`, indicating that no valid value was found. 
     * @return Strategy Policy. 1: block; 2: allow
Note: This field may return `null`, indicating that no valid value was found.
     */
    public Long getStrategy() {
        return this.Strategy;
    }

    /**
     * Set Policy. 1: block; 2: allow
Note: This field may return `null`, indicating that no valid value was found.
     * @param Strategy Policy. 1: block; 2: allow
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setStrategy(Long Strategy) {
        this.Strategy = Strategy;
    }

    /**
     * Get Direction. 0: outbound; 1: inbound. 1 by default
Note: This field may return `null`, indicating that no valid value was found. 
     * @return Direction Direction. 0: outbound; 1: inbound. 1 by default
Note: This field may return `null`, indicating that no valid value was found.
     */
    public Long getDirection() {
        return this.Direction;
    }

    /**
     * Set Direction. 0: outbound; 1: inbound. 1 by default
Note: This field may return `null`, indicating that no valid value was found.
     * @param Direction Direction. 0: outbound; 1: inbound. 1 by default
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setDirection(Long Direction) {
        this.Direction = Direction;
    }

    /**
     * Get Region 
     * @return Region Region
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region
     * @param Region Region
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Description
Note: This field may return `null`, indicating that no valid value was found. 
     * @return Detail Description
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getDetail() {
        return this.Detail;
    }

    /**
     * Set Description
Note: This field may return `null`, indicating that no valid value was found.
     * @param Detail Description
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setDetail(String Detail) {
        this.Detail = Detail;
    }

    /**
     * Get Toggle status. 0: off; 1: on
Note: This field may return `null`, indicating that no valid value was found. 
     * @return Status Toggle status. 0: off; 1: on
Note: This field may return `null`, indicating that no valid value was found.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Toggle status. 0: off; 1: on
Note: This field may return `null`, indicating that no valid value was found.
     * @param Status Toggle status. 0: off; 1: on
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Indicates whether the rule is normal. 0: normal; 1: abnormal
Note: This field may return `null`, indicating that no valid value was found. 
     * @return IsNew Indicates whether the rule is normal. 0: normal; 1: abnormal
Note: This field may return `null`, indicating that no valid value was found.
     */
    public Long getIsNew() {
        return this.IsNew;
    }

    /**
     * Set Indicates whether the rule is normal. 0: normal; 1: abnormal
Note: This field may return `null`, indicating that no valid value was found.
     * @param IsNew Indicates whether the rule is normal. 0: normal; 1: abnormal
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setIsNew(Long IsNew) {
        this.IsNew = IsNew;
    }

    /**
     * Get One-way/two-way. 0: one-way; 1: two-way
Note: This field may return `null`, indicating that no valid value was found. 
     * @return BothWay One-way/two-way. 0: one-way; 1: two-way
Note: This field may return `null`, indicating that no valid value was found.
     */
    public Long getBothWay() {
        return this.BothWay;
    }

    /**
     * Set One-way/two-way. 0: one-way; 1: two-way
Note: This field may return `null`, indicating that no valid value was found.
     * @param BothWay One-way/two-way. 0: one-way; 1: two-way
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setBothWay(Long BothWay) {
        this.BothWay = BothWay;
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

    public SecurityGroupBothWayInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecurityGroupBothWayInfo(SecurityGroupBothWayInfo source) {
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
        if (source.Direction != null) {
            this.Direction = new Long(source.Direction);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Detail != null) {
            this.Detail = new String(source.Detail);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.IsNew != null) {
            this.IsNew = new Long(source.IsNew);
        }
        if (source.BothWay != null) {
            this.BothWay = new Long(source.BothWay);
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
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Detail", this.Detail);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "IsNew", this.IsNew);
        this.setParamSimple(map, prefix + "BothWay", this.BothWay);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamSimple(map, prefix + "PrivateIp", this.PrivateIp);
        this.setParamSimple(map, prefix + "Cidr", this.Cidr);
        this.setParamSimple(map, prefix + "ServiceTemplateId", this.ServiceTemplateId);
        this.setParamSimple(map, prefix + "ProtocolPortType", this.ProtocolPortType);

    }
}

