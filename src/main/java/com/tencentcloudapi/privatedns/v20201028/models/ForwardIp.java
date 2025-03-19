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

public class ForwardIp extends AbstractModel {

    /**
    * Forwarding target IP network access type.
CLB: The forwarding IP is the internal CLB VIP.
CCN: Forwarding IP through CCN routing.
    */
    @SerializedName("AccessType")
    @Expose
    private String AccessType;

    /**
    * Forwarding target IP address.
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * Specifies the forwarding IP port number.
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Specifies the number of outbound endpoints.
Minimum 1, maximum 6.
    */
    @SerializedName("IpNum")
    @Expose
    private Long IpNum;

    /**
    * Unique VPC ID.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Unique subnet ID.
Required when the access type is CCN.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * ccn id
Required when the access type is CCN.
    */
    @SerializedName("AccessGatewayId")
    @Expose
    private String AccessGatewayId;

    /**
     * Get Forwarding target IP network access type.
CLB: The forwarding IP is the internal CLB VIP.
CCN: Forwarding IP through CCN routing. 
     * @return AccessType Forwarding target IP network access type.
CLB: The forwarding IP is the internal CLB VIP.
CCN: Forwarding IP through CCN routing.
     */
    public String getAccessType() {
        return this.AccessType;
    }

    /**
     * Set Forwarding target IP network access type.
CLB: The forwarding IP is the internal CLB VIP.
CCN: Forwarding IP through CCN routing.
     * @param AccessType Forwarding target IP network access type.
CLB: The forwarding IP is the internal CLB VIP.
CCN: Forwarding IP through CCN routing.
     */
    public void setAccessType(String AccessType) {
        this.AccessType = AccessType;
    }

    /**
     * Get Forwarding target IP address. 
     * @return Host Forwarding target IP address.
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set Forwarding target IP address.
     * @param Host Forwarding target IP address.
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get Specifies the forwarding IP port number. 
     * @return Port Specifies the forwarding IP port number.
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Specifies the forwarding IP port number.
     * @param Port Specifies the forwarding IP port number.
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Specifies the number of outbound endpoints.
Minimum 1, maximum 6. 
     * @return IpNum Specifies the number of outbound endpoints.
Minimum 1, maximum 6.
     */
    public Long getIpNum() {
        return this.IpNum;
    }

    /**
     * Set Specifies the number of outbound endpoints.
Minimum 1, maximum 6.
     * @param IpNum Specifies the number of outbound endpoints.
Minimum 1, maximum 6.
     */
    public void setIpNum(Long IpNum) {
        this.IpNum = IpNum;
    }

    /**
     * Get Unique VPC ID. 
     * @return VpcId Unique VPC ID.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set Unique VPC ID.
     * @param VpcId Unique VPC ID.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Unique subnet ID.
Required when the access type is CCN. 
     * @return SubnetId Unique subnet ID.
Required when the access type is CCN.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Unique subnet ID.
Required when the access type is CCN.
     * @param SubnetId Unique subnet ID.
Required when the access type is CCN.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get ccn id
Required when the access type is CCN. 
     * @return AccessGatewayId ccn id
Required when the access type is CCN.
     */
    public String getAccessGatewayId() {
        return this.AccessGatewayId;
    }

    /**
     * Set ccn id
Required when the access type is CCN.
     * @param AccessGatewayId ccn id
Required when the access type is CCN.
     */
    public void setAccessGatewayId(String AccessGatewayId) {
        this.AccessGatewayId = AccessGatewayId;
    }

    public ForwardIp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ForwardIp(ForwardIp source) {
        if (source.AccessType != null) {
            this.AccessType = new String(source.AccessType);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.IpNum != null) {
            this.IpNum = new Long(source.IpNum);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.AccessGatewayId != null) {
            this.AccessGatewayId = new String(source.AccessGatewayId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccessType", this.AccessType);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "IpNum", this.IpNum);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "AccessGatewayId", this.AccessGatewayId);

    }
}

