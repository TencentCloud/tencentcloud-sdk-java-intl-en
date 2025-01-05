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
package com.tencentcloudapi.privatedns.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EndpointService extends AbstractModel {

    /**
    * Specifies the forwarding target IP network access type.
CLB: Specifies that the forwarding IP is the private CLB VIP.
CCN: Specifies forwarding IP through CCN routing.
    */
    @SerializedName("AccessType")
    @Expose
    private String AccessType;

    /**
    * Specifies the forwarding target IP address.
    */
    @SerializedName("Pip")
    @Expose
    private String Pip;

    /**
    * Specifies the forwarding IP port number.
    */
    @SerializedName("Pport")
    @Expose
    private Long Pport;

    /**
    * Specifies the unique VPC ID.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Specifies the forwarding target IP proxy IP.
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * Specifies the forwarding target IP proxy port.
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * Specifies the forwarding target IP protocol.
    */
    @SerializedName("Proto")
    @Expose
    private String Proto;

    /**
    * Specifies the unique subnet ID.
Required if the access type is CCN.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * ccn id
Required if the access type is CCN.
    */
    @SerializedName("AccessGatewayId")
    @Expose
    private String AccessGatewayId;

    /**
    * The SNAT CIDR block of the outbound endpoint.
    */
    @SerializedName("SnatVipCidr")
    @Expose
    private String SnatVipCidr;

    /**
    * The SNAT IP list of the outbound endpoint.
    */
    @SerializedName("SnatVipSet")
    @Expose
    private String SnatVipSet;

    /**
    * The region of the outbound endpoint service.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
     * Get Specifies the forwarding target IP network access type.
CLB: Specifies that the forwarding IP is the private CLB VIP.
CCN: Specifies forwarding IP through CCN routing. 
     * @return AccessType Specifies the forwarding target IP network access type.
CLB: Specifies that the forwarding IP is the private CLB VIP.
CCN: Specifies forwarding IP through CCN routing.
     */
    public String getAccessType() {
        return this.AccessType;
    }

    /**
     * Set Specifies the forwarding target IP network access type.
CLB: Specifies that the forwarding IP is the private CLB VIP.
CCN: Specifies forwarding IP through CCN routing.
     * @param AccessType Specifies the forwarding target IP network access type.
CLB: Specifies that the forwarding IP is the private CLB VIP.
CCN: Specifies forwarding IP through CCN routing.
     */
    public void setAccessType(String AccessType) {
        this.AccessType = AccessType;
    }

    /**
     * Get Specifies the forwarding target IP address. 
     * @return Pip Specifies the forwarding target IP address.
     */
    public String getPip() {
        return this.Pip;
    }

    /**
     * Set Specifies the forwarding target IP address.
     * @param Pip Specifies the forwarding target IP address.
     */
    public void setPip(String Pip) {
        this.Pip = Pip;
    }

    /**
     * Get Specifies the forwarding IP port number. 
     * @return Pport Specifies the forwarding IP port number.
     */
    public Long getPport() {
        return this.Pport;
    }

    /**
     * Set Specifies the forwarding IP port number.
     * @param Pport Specifies the forwarding IP port number.
     */
    public void setPport(Long Pport) {
        this.Pport = Pport;
    }

    /**
     * Get Specifies the unique VPC ID. 
     * @return VpcId Specifies the unique VPC ID.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set Specifies the unique VPC ID.
     * @param VpcId Specifies the unique VPC ID.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Specifies the forwarding target IP proxy IP. 
     * @return Vip Specifies the forwarding target IP proxy IP.
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set Specifies the forwarding target IP proxy IP.
     * @param Vip Specifies the forwarding target IP proxy IP.
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get Specifies the forwarding target IP proxy port. 
     * @return Vport Specifies the forwarding target IP proxy port.
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set Specifies the forwarding target IP proxy port.
     * @param Vport Specifies the forwarding target IP proxy port.
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get Specifies the forwarding target IP protocol. 
     * @return Proto Specifies the forwarding target IP protocol.
     */
    public String getProto() {
        return this.Proto;
    }

    /**
     * Set Specifies the forwarding target IP protocol.
     * @param Proto Specifies the forwarding target IP protocol.
     */
    public void setProto(String Proto) {
        this.Proto = Proto;
    }

    /**
     * Get Specifies the unique subnet ID.
Required if the access type is CCN. 
     * @return SubnetId Specifies the unique subnet ID.
Required if the access type is CCN.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Specifies the unique subnet ID.
Required if the access type is CCN.
     * @param SubnetId Specifies the unique subnet ID.
Required if the access type is CCN.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get ccn id
Required if the access type is CCN. 
     * @return AccessGatewayId ccn id
Required if the access type is CCN.
     */
    public String getAccessGatewayId() {
        return this.AccessGatewayId;
    }

    /**
     * Set ccn id
Required if the access type is CCN.
     * @param AccessGatewayId ccn id
Required if the access type is CCN.
     */
    public void setAccessGatewayId(String AccessGatewayId) {
        this.AccessGatewayId = AccessGatewayId;
    }

    /**
     * Get The SNAT CIDR block of the outbound endpoint. 
     * @return SnatVipCidr The SNAT CIDR block of the outbound endpoint.
     */
    public String getSnatVipCidr() {
        return this.SnatVipCidr;
    }

    /**
     * Set The SNAT CIDR block of the outbound endpoint.
     * @param SnatVipCidr The SNAT CIDR block of the outbound endpoint.
     */
    public void setSnatVipCidr(String SnatVipCidr) {
        this.SnatVipCidr = SnatVipCidr;
    }

    /**
     * Get The SNAT IP list of the outbound endpoint. 
     * @return SnatVipSet The SNAT IP list of the outbound endpoint.
     */
    public String getSnatVipSet() {
        return this.SnatVipSet;
    }

    /**
     * Set The SNAT IP list of the outbound endpoint.
     * @param SnatVipSet The SNAT IP list of the outbound endpoint.
     */
    public void setSnatVipSet(String SnatVipSet) {
        this.SnatVipSet = SnatVipSet;
    }

    /**
     * Get The region of the outbound endpoint service. 
     * @return Region The region of the outbound endpoint service.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set The region of the outbound endpoint service.
     * @param Region The region of the outbound endpoint service.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    public EndpointService() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EndpointService(EndpointService source) {
        if (source.AccessType != null) {
            this.AccessType = new String(source.AccessType);
        }
        if (source.Pip != null) {
            this.Pip = new String(source.Pip);
        }
        if (source.Pport != null) {
            this.Pport = new Long(source.Pport);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
        if (source.Proto != null) {
            this.Proto = new String(source.Proto);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.AccessGatewayId != null) {
            this.AccessGatewayId = new String(source.AccessGatewayId);
        }
        if (source.SnatVipCidr != null) {
            this.SnatVipCidr = new String(source.SnatVipCidr);
        }
        if (source.SnatVipSet != null) {
            this.SnatVipSet = new String(source.SnatVipSet);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccessType", this.AccessType);
        this.setParamSimple(map, prefix + "Pip", this.Pip);
        this.setParamSimple(map, prefix + "Pport", this.Pport);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "Proto", this.Proto);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "AccessGatewayId", this.AccessGatewayId);
        this.setParamSimple(map, prefix + "SnatVipCidr", this.SnatVipCidr);
        this.setParamSimple(map, prefix + "SnatVipSet", this.SnatVipSet);
        this.setParamSimple(map, prefix + "Region", this.Region);

    }
}

