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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateLoadBalancerRequest extends AbstractModel {

    /**
    * ECM region, such as `ap-xian-ecm`.
    */
    @SerializedName("EcmRegion")
    @Expose
    private String EcmRegion;

    /**
    * Network type of the CLB instance. Currently, you can pass in only `OPEN`, which indicates public network.
    */
    @SerializedName("LoadBalancerType")
    @Expose
    private String LoadBalancerType;

    /**
    * CMCC: China Mobile; CTCC: China Telecom; CUCC: China Unicom.
    */
    @SerializedName("VipIsp")
    @Expose
    private String VipIsp;

    /**
    * CLB instance name, which will take effect only when one instance is created. It can contain 1–50 letters, digits, hyphens, and underscores.
Note: if the name of the new CLB instance already exists, a default name will be generated automatically.
    */
    @SerializedName("LoadBalancerName")
    @Expose
    private String LoadBalancerName;

    /**
    * Network ID of the target device on the CLB backend, such as `vpc-12345678`.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Number of CLB instances to be created. Default value: 1.
    */
    @SerializedName("Number")
    @Expose
    private Long Number;

    /**
    * CLB information such as bandwidth limit.
    */
    @SerializedName("InternetAccessible")
    @Expose
    private LoadBalancerInternetAccessible InternetAccessible;

    /**
    * Tags.
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
    * Security groups.
    */
    @SerializedName("SecurityGroups")
    @Expose
    private String [] SecurityGroups;

    /**
    * IP version. Valid values: `IPV4` (default), `IPv6FullChain` (IPv6 version). This parameter is only for public network CLB instances.
    */
    @SerializedName("AddressIPVersion")
    @Expose
    private String AddressIPVersion;

    /**
    * Subnet ID. This parameter is required for IPv6 CLB instances.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
     * Get ECM region, such as `ap-xian-ecm`. 
     * @return EcmRegion ECM region, such as `ap-xian-ecm`.
     */
    public String getEcmRegion() {
        return this.EcmRegion;
    }

    /**
     * Set ECM region, such as `ap-xian-ecm`.
     * @param EcmRegion ECM region, such as `ap-xian-ecm`.
     */
    public void setEcmRegion(String EcmRegion) {
        this.EcmRegion = EcmRegion;
    }

    /**
     * Get Network type of the CLB instance. Currently, you can pass in only `OPEN`, which indicates public network. 
     * @return LoadBalancerType Network type of the CLB instance. Currently, you can pass in only `OPEN`, which indicates public network.
     */
    public String getLoadBalancerType() {
        return this.LoadBalancerType;
    }

    /**
     * Set Network type of the CLB instance. Currently, you can pass in only `OPEN`, which indicates public network.
     * @param LoadBalancerType Network type of the CLB instance. Currently, you can pass in only `OPEN`, which indicates public network.
     */
    public void setLoadBalancerType(String LoadBalancerType) {
        this.LoadBalancerType = LoadBalancerType;
    }

    /**
     * Get CMCC: China Mobile; CTCC: China Telecom; CUCC: China Unicom. 
     * @return VipIsp CMCC: China Mobile; CTCC: China Telecom; CUCC: China Unicom.
     */
    public String getVipIsp() {
        return this.VipIsp;
    }

    /**
     * Set CMCC: China Mobile; CTCC: China Telecom; CUCC: China Unicom.
     * @param VipIsp CMCC: China Mobile; CTCC: China Telecom; CUCC: China Unicom.
     */
    public void setVipIsp(String VipIsp) {
        this.VipIsp = VipIsp;
    }

    /**
     * Get CLB instance name, which will take effect only when one instance is created. It can contain 1–50 letters, digits, hyphens, and underscores.
Note: if the name of the new CLB instance already exists, a default name will be generated automatically. 
     * @return LoadBalancerName CLB instance name, which will take effect only when one instance is created. It can contain 1–50 letters, digits, hyphens, and underscores.
Note: if the name of the new CLB instance already exists, a default name will be generated automatically.
     */
    public String getLoadBalancerName() {
        return this.LoadBalancerName;
    }

    /**
     * Set CLB instance name, which will take effect only when one instance is created. It can contain 1–50 letters, digits, hyphens, and underscores.
Note: if the name of the new CLB instance already exists, a default name will be generated automatically.
     * @param LoadBalancerName CLB instance name, which will take effect only when one instance is created. It can contain 1–50 letters, digits, hyphens, and underscores.
Note: if the name of the new CLB instance already exists, a default name will be generated automatically.
     */
    public void setLoadBalancerName(String LoadBalancerName) {
        this.LoadBalancerName = LoadBalancerName;
    }

    /**
     * Get Network ID of the target device on the CLB backend, such as `vpc-12345678`. 
     * @return VpcId Network ID of the target device on the CLB backend, such as `vpc-12345678`.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set Network ID of the target device on the CLB backend, such as `vpc-12345678`.
     * @param VpcId Network ID of the target device on the CLB backend, such as `vpc-12345678`.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Number of CLB instances to be created. Default value: 1. 
     * @return Number Number of CLB instances to be created. Default value: 1.
     */
    public Long getNumber() {
        return this.Number;
    }

    /**
     * Set Number of CLB instances to be created. Default value: 1.
     * @param Number Number of CLB instances to be created. Default value: 1.
     */
    public void setNumber(Long Number) {
        this.Number = Number;
    }

    /**
     * Get CLB information such as bandwidth limit. 
     * @return InternetAccessible CLB information such as bandwidth limit.
     */
    public LoadBalancerInternetAccessible getInternetAccessible() {
        return this.InternetAccessible;
    }

    /**
     * Set CLB information such as bandwidth limit.
     * @param InternetAccessible CLB information such as bandwidth limit.
     */
    public void setInternetAccessible(LoadBalancerInternetAccessible InternetAccessible) {
        this.InternetAccessible = InternetAccessible;
    }

    /**
     * Get Tags. 
     * @return Tags Tags.
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tags.
     * @param Tags Tags.
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Security groups. 
     * @return SecurityGroups Security groups.
     */
    public String [] getSecurityGroups() {
        return this.SecurityGroups;
    }

    /**
     * Set Security groups.
     * @param SecurityGroups Security groups.
     */
    public void setSecurityGroups(String [] SecurityGroups) {
        this.SecurityGroups = SecurityGroups;
    }

    /**
     * Get IP version. Valid values: `IPV4` (default), `IPv6FullChain` (IPv6 version). This parameter is only for public network CLB instances. 
     * @return AddressIPVersion IP version. Valid values: `IPV4` (default), `IPv6FullChain` (IPv6 version). This parameter is only for public network CLB instances.
     */
    public String getAddressIPVersion() {
        return this.AddressIPVersion;
    }

    /**
     * Set IP version. Valid values: `IPV4` (default), `IPv6FullChain` (IPv6 version). This parameter is only for public network CLB instances.
     * @param AddressIPVersion IP version. Valid values: `IPV4` (default), `IPv6FullChain` (IPv6 version). This parameter is only for public network CLB instances.
     */
    public void setAddressIPVersion(String AddressIPVersion) {
        this.AddressIPVersion = AddressIPVersion;
    }

    /**
     * Get Subnet ID. This parameter is required for IPv6 CLB instances. 
     * @return SubnetId Subnet ID. This parameter is required for IPv6 CLB instances.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet ID. This parameter is required for IPv6 CLB instances.
     * @param SubnetId Subnet ID. This parameter is required for IPv6 CLB instances.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    public CreateLoadBalancerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLoadBalancerRequest(CreateLoadBalancerRequest source) {
        if (source.EcmRegion != null) {
            this.EcmRegion = new String(source.EcmRegion);
        }
        if (source.LoadBalancerType != null) {
            this.LoadBalancerType = new String(source.LoadBalancerType);
        }
        if (source.VipIsp != null) {
            this.VipIsp = new String(source.VipIsp);
        }
        if (source.LoadBalancerName != null) {
            this.LoadBalancerName = new String(source.LoadBalancerName);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.Number != null) {
            this.Number = new Long(source.Number);
        }
        if (source.InternetAccessible != null) {
            this.InternetAccessible = new LoadBalancerInternetAccessible(source.InternetAccessible);
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
        }
        if (source.SecurityGroups != null) {
            this.SecurityGroups = new String[source.SecurityGroups.length];
            for (int i = 0; i < source.SecurityGroups.length; i++) {
                this.SecurityGroups[i] = new String(source.SecurityGroups[i]);
            }
        }
        if (source.AddressIPVersion != null) {
            this.AddressIPVersion = new String(source.AddressIPVersion);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EcmRegion", this.EcmRegion);
        this.setParamSimple(map, prefix + "LoadBalancerType", this.LoadBalancerType);
        this.setParamSimple(map, prefix + "VipIsp", this.VipIsp);
        this.setParamSimple(map, prefix + "LoadBalancerName", this.LoadBalancerName);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "Number", this.Number);
        this.setParamObj(map, prefix + "InternetAccessible.", this.InternetAccessible);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamArraySimple(map, prefix + "SecurityGroups.", this.SecurityGroups);
        this.setParamSimple(map, prefix + "AddressIPVersion", this.AddressIPVersion);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);

    }
}

