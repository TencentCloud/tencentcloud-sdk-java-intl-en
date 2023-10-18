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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateVpcRequest extends AbstractModel {

    /**
    * VPC name, which can contain up to 60 bytes.
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * VPC CIDR block, which must fall within the following private network IP ranges: 10.*.0.0/16, 172.[16-31].0.0/16, and 192.168.0.0/16.
    */
    @SerializedName("CidrBlock")
    @Expose
    private String CidrBlock;

    /**
    * ECM region
    */
    @SerializedName("EcmRegion")
    @Expose
    private String EcmRegion;

    /**
    * Whether multicast is enabled. true: enabled; false: disabled. This parameter is not supported currently
    */
    @SerializedName("EnableMulticast")
    @Expose
    private String EnableMulticast;

    /**
    * DNS address (not supported currently). Up to 4 addresses can be supported.
    */
    @SerializedName("DnsServers")
    @Expose
    private String [] DnsServers;

    /**
    * Domain name. This parameter is not supported currently
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * List of bound tags, such as [{"Key": "city", "Value": "shanghai"}].
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * Description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get VPC name, which can contain up to 60 bytes. 
     * @return VpcName VPC name, which can contain up to 60 bytes.
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set VPC name, which can contain up to 60 bytes.
     * @param VpcName VPC name, which can contain up to 60 bytes.
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get VPC CIDR block, which must fall within the following private network IP ranges: 10.*.0.0/16, 172.[16-31].0.0/16, and 192.168.0.0/16. 
     * @return CidrBlock VPC CIDR block, which must fall within the following private network IP ranges: 10.*.0.0/16, 172.[16-31].0.0/16, and 192.168.0.0/16.
     */
    public String getCidrBlock() {
        return this.CidrBlock;
    }

    /**
     * Set VPC CIDR block, which must fall within the following private network IP ranges: 10.*.0.0/16, 172.[16-31].0.0/16, and 192.168.0.0/16.
     * @param CidrBlock VPC CIDR block, which must fall within the following private network IP ranges: 10.*.0.0/16, 172.[16-31].0.0/16, and 192.168.0.0/16.
     */
    public void setCidrBlock(String CidrBlock) {
        this.CidrBlock = CidrBlock;
    }

    /**
     * Get ECM region 
     * @return EcmRegion ECM region
     */
    public String getEcmRegion() {
        return this.EcmRegion;
    }

    /**
     * Set ECM region
     * @param EcmRegion ECM region
     */
    public void setEcmRegion(String EcmRegion) {
        this.EcmRegion = EcmRegion;
    }

    /**
     * Get Whether multicast is enabled. true: enabled; false: disabled. This parameter is not supported currently 
     * @return EnableMulticast Whether multicast is enabled. true: enabled; false: disabled. This parameter is not supported currently
     */
    public String getEnableMulticast() {
        return this.EnableMulticast;
    }

    /**
     * Set Whether multicast is enabled. true: enabled; false: disabled. This parameter is not supported currently
     * @param EnableMulticast Whether multicast is enabled. true: enabled; false: disabled. This parameter is not supported currently
     */
    public void setEnableMulticast(String EnableMulticast) {
        this.EnableMulticast = EnableMulticast;
    }

    /**
     * Get DNS address (not supported currently). Up to 4 addresses can be supported. 
     * @return DnsServers DNS address (not supported currently). Up to 4 addresses can be supported.
     */
    public String [] getDnsServers() {
        return this.DnsServers;
    }

    /**
     * Set DNS address (not supported currently). Up to 4 addresses can be supported.
     * @param DnsServers DNS address (not supported currently). Up to 4 addresses can be supported.
     */
    public void setDnsServers(String [] DnsServers) {
        this.DnsServers = DnsServers;
    }

    /**
     * Get Domain name. This parameter is not supported currently 
     * @return DomainName Domain name. This parameter is not supported currently
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set Domain name. This parameter is not supported currently
     * @param DomainName Domain name. This parameter is not supported currently
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get List of bound tags, such as [{"Key": "city", "Value": "shanghai"}]. 
     * @return Tags List of bound tags, such as [{"Key": "city", "Value": "shanghai"}].
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set List of bound tags, such as [{"Key": "city", "Value": "shanghai"}].
     * @param Tags List of bound tags, such as [{"Key": "city", "Value": "shanghai"}].
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Description 
     * @return Description Description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description
     * @param Description Description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public CreateVpcRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateVpcRequest(CreateVpcRequest source) {
        if (source.VpcName != null) {
            this.VpcName = new String(source.VpcName);
        }
        if (source.CidrBlock != null) {
            this.CidrBlock = new String(source.CidrBlock);
        }
        if (source.EcmRegion != null) {
            this.EcmRegion = new String(source.EcmRegion);
        }
        if (source.EnableMulticast != null) {
            this.EnableMulticast = new String(source.EnableMulticast);
        }
        if (source.DnsServers != null) {
            this.DnsServers = new String[source.DnsServers.length];
            for (int i = 0; i < source.DnsServers.length; i++) {
                this.DnsServers[i] = new String(source.DnsServers[i]);
            }
        }
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamSimple(map, prefix + "CidrBlock", this.CidrBlock);
        this.setParamSimple(map, prefix + "EcmRegion", this.EcmRegion);
        this.setParamSimple(map, prefix + "EnableMulticast", this.EnableMulticast);
        this.setParamArraySimple(map, prefix + "DnsServers.", this.DnsServers);
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

