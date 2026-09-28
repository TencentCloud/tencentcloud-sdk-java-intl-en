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
package com.tencentcloudapi.alb.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateLoadBalancerRequest extends AbstractModel {

    /**
    * Address type of the application CLB.

- **Internet**: The load balancing has a public IP address, and the DNS domain name is resolved to the public IP, so it can be accessed via the public network.

- **Intranet**: The load balancer has only a private IP address, and the DNS domain name is resolved to the private IP, so it can only be accessed from the private network environment of the VPC where the load balancer resides.
    */
    @SerializedName("AddressType")
    @Expose
    private String AddressType;

    /**
    * Billing configuration of an application CLB instance.
    */
    @SerializedName("LoadBalancerBillingConfig")
    @Expose
    private LoadBalancerBillingConfig LoadBalancerBillingConfig;

    /**
    * Virtual Private Cloud (VPC) ID.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * AZ and private network subnet mapping list. A maximum of 10 AZs can be added. If the current region supports 2 or more AZs, a minimum of 2 AZs are required.
    */
    @SerializedName("ZoneMappings")
    @Expose
    private ZoneMappingsItem [] ZoneMappings;

    /**
    * IP address version. Value: IPv4 or IPv6.
    */
    @SerializedName("AddressIpVersion")
    @Expose
    private String AddressIpVersion;

    /**
    * Client Token, used for ensuring the idempotency of requests.

Generate a parameter value from your client to underwrite the uniqueness of the value for different requests. ClientToken supports only ASCII characters.
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * Deletion protection configuration.
    */
    @SerializedName("DeleteProtection")
    @Expose
    private DeletionProtectionConfig DeleteProtection;

    /**
    * Whether to only precheck this request. Parameter Value:

- **true**: Send a check request without creating an application CLB instance. Check items include whether required parameters are filled in, request format, and service limits. If the check fails, return the corresponding error. If the check passes, return the error code `DryRunOperation`.

- **false** (default value): Send a normal request. After the check is passed, return HTTP 2xx status code and directly perform the operation.
    */
    @SerializedName("DryRun")
    @Expose
    private Boolean DryRun;

    /**
    * EIP address type. Valid values:
- **EIP**: Ordinary Elastic IP
- **AntiDDoSEIP**: Anti-DDoS EIP
- **AnycastEIP**: Accelerated EIP
-**HighQualityEIP**: High Quality IP. High Quality IP is supported only in Singapore and Hong Kong (China).
- **ResidentialEIP**: natively assigned IP

Default if not passed: EIP.
    */
    @SerializedName("InternetAddressType")
    @Expose
    private String InternetAddressType;

    /**
    * Application CLB instance name. It contains 1-80 characters, including Chinese characters, letters, digits, dashes (-), forward slashes (/), half-width periods (.), and underscores (_).
    */
    @SerializedName("LoadBalancerName")
    @Expose
    private String LoadBalancerName;

    /**
    * Tag.
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
     * Get Address type of the application CLB.

- **Internet**: The load balancing has a public IP address, and the DNS domain name is resolved to the public IP, so it can be accessed via the public network.

- **Intranet**: The load balancer has only a private IP address, and the DNS domain name is resolved to the private IP, so it can only be accessed from the private network environment of the VPC where the load balancer resides. 
     * @return AddressType Address type of the application CLB.

- **Internet**: The load balancing has a public IP address, and the DNS domain name is resolved to the public IP, so it can be accessed via the public network.

- **Intranet**: The load balancer has only a private IP address, and the DNS domain name is resolved to the private IP, so it can only be accessed from the private network environment of the VPC where the load balancer resides.
     */
    public String getAddressType() {
        return this.AddressType;
    }

    /**
     * Set Address type of the application CLB.

- **Internet**: The load balancing has a public IP address, and the DNS domain name is resolved to the public IP, so it can be accessed via the public network.

- **Intranet**: The load balancer has only a private IP address, and the DNS domain name is resolved to the private IP, so it can only be accessed from the private network environment of the VPC where the load balancer resides.
     * @param AddressType Address type of the application CLB.

- **Internet**: The load balancing has a public IP address, and the DNS domain name is resolved to the public IP, so it can be accessed via the public network.

- **Intranet**: The load balancer has only a private IP address, and the DNS domain name is resolved to the private IP, so it can only be accessed from the private network environment of the VPC where the load balancer resides.
     */
    public void setAddressType(String AddressType) {
        this.AddressType = AddressType;
    }

    /**
     * Get Billing configuration of an application CLB instance. 
     * @return LoadBalancerBillingConfig Billing configuration of an application CLB instance.
     */
    public LoadBalancerBillingConfig getLoadBalancerBillingConfig() {
        return this.LoadBalancerBillingConfig;
    }

    /**
     * Set Billing configuration of an application CLB instance.
     * @param LoadBalancerBillingConfig Billing configuration of an application CLB instance.
     */
    public void setLoadBalancerBillingConfig(LoadBalancerBillingConfig LoadBalancerBillingConfig) {
        this.LoadBalancerBillingConfig = LoadBalancerBillingConfig;
    }

    /**
     * Get Virtual Private Cloud (VPC) ID. 
     * @return VpcId Virtual Private Cloud (VPC) ID.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set Virtual Private Cloud (VPC) ID.
     * @param VpcId Virtual Private Cloud (VPC) ID.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get AZ and private network subnet mapping list. A maximum of 10 AZs can be added. If the current region supports 2 or more AZs, a minimum of 2 AZs are required. 
     * @return ZoneMappings AZ and private network subnet mapping list. A maximum of 10 AZs can be added. If the current region supports 2 or more AZs, a minimum of 2 AZs are required.
     */
    public ZoneMappingsItem [] getZoneMappings() {
        return this.ZoneMappings;
    }

    /**
     * Set AZ and private network subnet mapping list. A maximum of 10 AZs can be added. If the current region supports 2 or more AZs, a minimum of 2 AZs are required.
     * @param ZoneMappings AZ and private network subnet mapping list. A maximum of 10 AZs can be added. If the current region supports 2 or more AZs, a minimum of 2 AZs are required.
     */
    public void setZoneMappings(ZoneMappingsItem [] ZoneMappings) {
        this.ZoneMappings = ZoneMappings;
    }

    /**
     * Get IP address version. Value: IPv4 or IPv6. 
     * @return AddressIpVersion IP address version. Value: IPv4 or IPv6.
     */
    public String getAddressIpVersion() {
        return this.AddressIpVersion;
    }

    /**
     * Set IP address version. Value: IPv4 or IPv6.
     * @param AddressIpVersion IP address version. Value: IPv4 or IPv6.
     */
    public void setAddressIpVersion(String AddressIpVersion) {
        this.AddressIpVersion = AddressIpVersion;
    }

    /**
     * Get Client Token, used for ensuring the idempotency of requests.

Generate a parameter value from your client to underwrite the uniqueness of the value for different requests. ClientToken supports only ASCII characters. 
     * @return ClientToken Client Token, used for ensuring the idempotency of requests.

Generate a parameter value from your client to underwrite the uniqueness of the value for different requests. ClientToken supports only ASCII characters.
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set Client Token, used for ensuring the idempotency of requests.

Generate a parameter value from your client to underwrite the uniqueness of the value for different requests. ClientToken supports only ASCII characters.
     * @param ClientToken Client Token, used for ensuring the idempotency of requests.

Generate a parameter value from your client to underwrite the uniqueness of the value for different requests. ClientToken supports only ASCII characters.
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get Deletion protection configuration. 
     * @return DeleteProtection Deletion protection configuration.
     */
    public DeletionProtectionConfig getDeleteProtection() {
        return this.DeleteProtection;
    }

    /**
     * Set Deletion protection configuration.
     * @param DeleteProtection Deletion protection configuration.
     */
    public void setDeleteProtection(DeletionProtectionConfig DeleteProtection) {
        this.DeleteProtection = DeleteProtection;
    }

    /**
     * Get Whether to only precheck this request. Parameter Value:

- **true**: Send a check request without creating an application CLB instance. Check items include whether required parameters are filled in, request format, and service limits. If the check fails, return the corresponding error. If the check passes, return the error code `DryRunOperation`.

- **false** (default value): Send a normal request. After the check is passed, return HTTP 2xx status code and directly perform the operation. 
     * @return DryRun Whether to only precheck this request. Parameter Value:

- **true**: Send a check request without creating an application CLB instance. Check items include whether required parameters are filled in, request format, and service limits. If the check fails, return the corresponding error. If the check passes, return the error code `DryRunOperation`.

- **false** (default value): Send a normal request. After the check is passed, return HTTP 2xx status code and directly perform the operation.
     */
    public Boolean getDryRun() {
        return this.DryRun;
    }

    /**
     * Set Whether to only precheck this request. Parameter Value:

- **true**: Send a check request without creating an application CLB instance. Check items include whether required parameters are filled in, request format, and service limits. If the check fails, return the corresponding error. If the check passes, return the error code `DryRunOperation`.

- **false** (default value): Send a normal request. After the check is passed, return HTTP 2xx status code and directly perform the operation.
     * @param DryRun Whether to only precheck this request. Parameter Value:

- **true**: Send a check request without creating an application CLB instance. Check items include whether required parameters are filled in, request format, and service limits. If the check fails, return the corresponding error. If the check passes, return the error code `DryRunOperation`.

- **false** (default value): Send a normal request. After the check is passed, return HTTP 2xx status code and directly perform the operation.
     */
    public void setDryRun(Boolean DryRun) {
        this.DryRun = DryRun;
    }

    /**
     * Get EIP address type. Valid values:
- **EIP**: Ordinary Elastic IP
- **AntiDDoSEIP**: Anti-DDoS EIP
- **AnycastEIP**: Accelerated EIP
-**HighQualityEIP**: High Quality IP. High Quality IP is supported only in Singapore and Hong Kong (China).
- **ResidentialEIP**: natively assigned IP

Default if not passed: EIP. 
     * @return InternetAddressType EIP address type. Valid values:
- **EIP**: Ordinary Elastic IP
- **AntiDDoSEIP**: Anti-DDoS EIP
- **AnycastEIP**: Accelerated EIP
-**HighQualityEIP**: High Quality IP. High Quality IP is supported only in Singapore and Hong Kong (China).
- **ResidentialEIP**: natively assigned IP

Default if not passed: EIP.
     */
    public String getInternetAddressType() {
        return this.InternetAddressType;
    }

    /**
     * Set EIP address type. Valid values:
- **EIP**: Ordinary Elastic IP
- **AntiDDoSEIP**: Anti-DDoS EIP
- **AnycastEIP**: Accelerated EIP
-**HighQualityEIP**: High Quality IP. High Quality IP is supported only in Singapore and Hong Kong (China).
- **ResidentialEIP**: natively assigned IP

Default if not passed: EIP.
     * @param InternetAddressType EIP address type. Valid values:
- **EIP**: Ordinary Elastic IP
- **AntiDDoSEIP**: Anti-DDoS EIP
- **AnycastEIP**: Accelerated EIP
-**HighQualityEIP**: High Quality IP. High Quality IP is supported only in Singapore and Hong Kong (China).
- **ResidentialEIP**: natively assigned IP

Default if not passed: EIP.
     */
    public void setInternetAddressType(String InternetAddressType) {
        this.InternetAddressType = InternetAddressType;
    }

    /**
     * Get Application CLB instance name. It contains 1-80 characters, including Chinese characters, letters, digits, dashes (-), forward slashes (/), half-width periods (.), and underscores (_). 
     * @return LoadBalancerName Application CLB instance name. It contains 1-80 characters, including Chinese characters, letters, digits, dashes (-), forward slashes (/), half-width periods (.), and underscores (_).
     */
    public String getLoadBalancerName() {
        return this.LoadBalancerName;
    }

    /**
     * Set Application CLB instance name. It contains 1-80 characters, including Chinese characters, letters, digits, dashes (-), forward slashes (/), half-width periods (.), and underscores (_).
     * @param LoadBalancerName Application CLB instance name. It contains 1-80 characters, including Chinese characters, letters, digits, dashes (-), forward slashes (/), half-width periods (.), and underscores (_).
     */
    public void setLoadBalancerName(String LoadBalancerName) {
        this.LoadBalancerName = LoadBalancerName;
    }

    /**
     * Get Tag. 
     * @return Tags Tag.
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag.
     * @param Tags Tag.
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    public CreateLoadBalancerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLoadBalancerRequest(CreateLoadBalancerRequest source) {
        if (source.AddressType != null) {
            this.AddressType = new String(source.AddressType);
        }
        if (source.LoadBalancerBillingConfig != null) {
            this.LoadBalancerBillingConfig = new LoadBalancerBillingConfig(source.LoadBalancerBillingConfig);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.ZoneMappings != null) {
            this.ZoneMappings = new ZoneMappingsItem[source.ZoneMappings.length];
            for (int i = 0; i < source.ZoneMappings.length; i++) {
                this.ZoneMappings[i] = new ZoneMappingsItem(source.ZoneMappings[i]);
            }
        }
        if (source.AddressIpVersion != null) {
            this.AddressIpVersion = new String(source.AddressIpVersion);
        }
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
        }
        if (source.DeleteProtection != null) {
            this.DeleteProtection = new DeletionProtectionConfig(source.DeleteProtection);
        }
        if (source.DryRun != null) {
            this.DryRun = new Boolean(source.DryRun);
        }
        if (source.InternetAddressType != null) {
            this.InternetAddressType = new String(source.InternetAddressType);
        }
        if (source.LoadBalancerName != null) {
            this.LoadBalancerName = new String(source.LoadBalancerName);
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AddressType", this.AddressType);
        this.setParamObj(map, prefix + "LoadBalancerBillingConfig.", this.LoadBalancerBillingConfig);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamArrayObj(map, prefix + "ZoneMappings.", this.ZoneMappings);
        this.setParamSimple(map, prefix + "AddressIpVersion", this.AddressIpVersion);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamObj(map, prefix + "DeleteProtection.", this.DeleteProtection);
        this.setParamSimple(map, prefix + "DryRun", this.DryRun);
        this.setParamSimple(map, prefix + "InternetAddressType", this.InternetAddressType);
        this.setParamSimple(map, prefix + "LoadBalancerName", this.LoadBalancerName);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

