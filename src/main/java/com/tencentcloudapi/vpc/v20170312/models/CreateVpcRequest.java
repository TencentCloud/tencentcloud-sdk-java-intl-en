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

public class CreateVpcRequest extends AbstractModel{

    /**
    * The VPC name. The maximum length is 60 bytes.
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * VPC CIDR, which must fall within the following private network IP ranges: 10.0.0.0/16, 172.16.0.0/16, and 192.168.0.0/16.
    */
    @SerializedName("CidrBlock")
    @Expose
    private String CidrBlock;

    /**
    * Whether multicast is enabled. `true`: Enabled. `false`: Not enabled.
    */
    @SerializedName("EnableMulticast")
    @Expose
    private String EnableMulticast;

    /**
    * The DNS address. A maximum of 4 addresses is supported.
    */
    @SerializedName("DnsServers")
    @Expose
    private String [] DnsServers;

    /**
    * Domain name
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
     * Get The VPC name. The maximum length is 60 bytes. 
     * @return VpcName The VPC name. The maximum length is 60 bytes.
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set The VPC name. The maximum length is 60 bytes.
     * @param VpcName The VPC name. The maximum length is 60 bytes.
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get VPC CIDR, which must fall within the following private network IP ranges: 10.0.0.0/16, 172.16.0.0/16, and 192.168.0.0/16. 
     * @return CidrBlock VPC CIDR, which must fall within the following private network IP ranges: 10.0.0.0/16, 172.16.0.0/16, and 192.168.0.0/16.
     */
    public String getCidrBlock() {
        return this.CidrBlock;
    }

    /**
     * Set VPC CIDR, which must fall within the following private network IP ranges: 10.0.0.0/16, 172.16.0.0/16, and 192.168.0.0/16.
     * @param CidrBlock VPC CIDR, which must fall within the following private network IP ranges: 10.0.0.0/16, 172.16.0.0/16, and 192.168.0.0/16.
     */
    public void setCidrBlock(String CidrBlock) {
        this.CidrBlock = CidrBlock;
    }

    /**
     * Get Whether multicast is enabled. `true`: Enabled. `false`: Not enabled. 
     * @return EnableMulticast Whether multicast is enabled. `true`: Enabled. `false`: Not enabled.
     */
    public String getEnableMulticast() {
        return this.EnableMulticast;
    }

    /**
     * Set Whether multicast is enabled. `true`: Enabled. `false`: Not enabled.
     * @param EnableMulticast Whether multicast is enabled. `true`: Enabled. `false`: Not enabled.
     */
    public void setEnableMulticast(String EnableMulticast) {
        this.EnableMulticast = EnableMulticast;
    }

    /**
     * Get The DNS address. A maximum of 4 addresses is supported. 
     * @return DnsServers The DNS address. A maximum of 4 addresses is supported.
     */
    public String [] getDnsServers() {
        return this.DnsServers;
    }

    /**
     * Set The DNS address. A maximum of 4 addresses is supported.
     * @param DnsServers The DNS address. A maximum of 4 addresses is supported.
     */
    public void setDnsServers(String [] DnsServers) {
        this.DnsServers = DnsServers;
    }

    /**
     * Get Domain name 
     * @return DomainName Domain name
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set Domain name
     * @param DomainName Domain name
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamSimple(map, prefix + "CidrBlock", this.CidrBlock);
        this.setParamSimple(map, prefix + "EnableMulticast", this.EnableMulticast);
        this.setParamArraySimple(map, prefix + "DnsServers.", this.DnsServers);
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);

    }
}

