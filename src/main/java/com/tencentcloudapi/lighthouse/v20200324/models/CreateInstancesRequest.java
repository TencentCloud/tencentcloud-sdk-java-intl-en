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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateInstancesRequest extends AbstractModel {

    /**
    * Bundle ID. You can get it via the [DescribeBundles](https://intl.cloud.tencent.com/document/api/1207/47575?from_cn_redirect=1) API.
    */
    @SerializedName("BundleId")
    @Expose
    private String BundleId;

    /**
    * Image ID. You can get it via the [DescribeBlueprints](https://intl.cloud.tencent.com/document/api/1207/47689?from_cn_redirect=1) API.
    */
    @SerializedName("BlueprintId")
    @Expose
    private String BlueprintId;

    /**
    * Yearly/monthly subscription information for the instance, including the purchase period, setting of auto-renewal, etc.
    */
    @SerializedName("InstanceChargePrepaid")
    @Expose
    private InstanceChargePrepaid InstanceChargePrepaid;

    /**
    * Instance display name.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Number of the instances to purchase. For yearly/monthly subscribed instances, the value can be 1 to 30. The default value is `1`. Note that this number can not exceed the remaining quota under the current account.
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
    * List of availability zones. A random AZ is selected by default.
    */
    @SerializedName("Zones")
    @Expose
    private String [] Zones;

    /**
    * Whether the request is a dry run only.
`true`: dry run only. The request will not create instance(s). A dry run can check whether all the required parameters are specified, whether the request format is right, whether the request exceeds service limits, and whether the specified CVMs are available.
If the dry run fails, the corresponding error code will be returned.
If the dry run succeeds, the RequestId will be returned.
`false` (default value): send a normal request and create instance(s) if all the requirements are met.
    */
    @SerializedName("DryRun")
    @Expose
    private Boolean DryRun;

    /**
    * A unique string supplied by the client to ensure that the request is idempotent. Its maximum length is 64 ASCII characters. If this parameter is not specified, the idem-potency of the request cannot be guaranteed.
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * Login password of the instance. It's only available for Windows instances. If it's not specified, it means that the user choose to set the login password after the instance creation.
    */
    @SerializedName("LoginConfiguration")
    @Expose
    private LoginConfiguration LoginConfiguration;

    /**
    * Configuration of the containers to create
    */
    @SerializedName("Containers")
    @Expose
    private DockerContainerConfiguration [] Containers;

    /**
    * Whether to use the vouchers automatically. It defaults to No.
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Boolean AutoVoucher;

    /**
    * Firewall template ID. If not specified, the default firewall policy is used.
    */
    @SerializedName("FirewallTemplateId")
    @Expose
    private String FirewallTemplateId;

    /**
    * Tag key and tag value. If multiple tags are specified, they are created and bound to the specified resources at the same time. A tag key can have only one value on a given resource. If you attempt to add a tag with an existing key, its value is updated to the new value. Tags that do not exist are created automatically. The array supports a maximum of 10 elements.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * The command to be automatically executed after the instance is created.
    */
    @SerializedName("InitCommand")
    @Expose
    private Command InitCommand;

    /**
    * The primary domain. Note: Once a domain is specified, only a single instance can be purchased (`InstanceCount` must be set to 1).
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * The subdomain. Note: Once a domain is specified, only a single instance can be purchased (`InstanceCount` must be set to 1).
    */
    @SerializedName("Subdomain")
    @Expose
    private String Subdomain;

    /**
     * Get Bundle ID. You can get it via the [DescribeBundles](https://intl.cloud.tencent.com/document/api/1207/47575?from_cn_redirect=1) API. 
     * @return BundleId Bundle ID. You can get it via the [DescribeBundles](https://intl.cloud.tencent.com/document/api/1207/47575?from_cn_redirect=1) API.
     */
    public String getBundleId() {
        return this.BundleId;
    }

    /**
     * Set Bundle ID. You can get it via the [DescribeBundles](https://intl.cloud.tencent.com/document/api/1207/47575?from_cn_redirect=1) API.
     * @param BundleId Bundle ID. You can get it via the [DescribeBundles](https://intl.cloud.tencent.com/document/api/1207/47575?from_cn_redirect=1) API.
     */
    public void setBundleId(String BundleId) {
        this.BundleId = BundleId;
    }

    /**
     * Get Image ID. You can get it via the [DescribeBlueprints](https://intl.cloud.tencent.com/document/api/1207/47689?from_cn_redirect=1) API. 
     * @return BlueprintId Image ID. You can get it via the [DescribeBlueprints](https://intl.cloud.tencent.com/document/api/1207/47689?from_cn_redirect=1) API.
     */
    public String getBlueprintId() {
        return this.BlueprintId;
    }

    /**
     * Set Image ID. You can get it via the [DescribeBlueprints](https://intl.cloud.tencent.com/document/api/1207/47689?from_cn_redirect=1) API.
     * @param BlueprintId Image ID. You can get it via the [DescribeBlueprints](https://intl.cloud.tencent.com/document/api/1207/47689?from_cn_redirect=1) API.
     */
    public void setBlueprintId(String BlueprintId) {
        this.BlueprintId = BlueprintId;
    }

    /**
     * Get Yearly/monthly subscription information for the instance, including the purchase period, setting of auto-renewal, etc. 
     * @return InstanceChargePrepaid Yearly/monthly subscription information for the instance, including the purchase period, setting of auto-renewal, etc.
     */
    public InstanceChargePrepaid getInstanceChargePrepaid() {
        return this.InstanceChargePrepaid;
    }

    /**
     * Set Yearly/monthly subscription information for the instance, including the purchase period, setting of auto-renewal, etc.
     * @param InstanceChargePrepaid Yearly/monthly subscription information for the instance, including the purchase period, setting of auto-renewal, etc.
     */
    public void setInstanceChargePrepaid(InstanceChargePrepaid InstanceChargePrepaid) {
        this.InstanceChargePrepaid = InstanceChargePrepaid;
    }

    /**
     * Get Instance display name. 
     * @return InstanceName Instance display name.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance display name.
     * @param InstanceName Instance display name.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Number of the instances to purchase. For yearly/monthly subscribed instances, the value can be 1 to 30. The default value is `1`. Note that this number can not exceed the remaining quota under the current account. 
     * @return InstanceCount Number of the instances to purchase. For yearly/monthly subscribed instances, the value can be 1 to 30. The default value is `1`. Note that this number can not exceed the remaining quota under the current account.
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set Number of the instances to purchase. For yearly/monthly subscribed instances, the value can be 1 to 30. The default value is `1`. Note that this number can not exceed the remaining quota under the current account.
     * @param InstanceCount Number of the instances to purchase. For yearly/monthly subscribed instances, the value can be 1 to 30. The default value is `1`. Note that this number can not exceed the remaining quota under the current account.
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * Get List of availability zones. A random AZ is selected by default. 
     * @return Zones List of availability zones. A random AZ is selected by default.
     */
    public String [] getZones() {
        return this.Zones;
    }

    /**
     * Set List of availability zones. A random AZ is selected by default.
     * @param Zones List of availability zones. A random AZ is selected by default.
     */
    public void setZones(String [] Zones) {
        this.Zones = Zones;
    }

    /**
     * Get Whether the request is a dry run only.
`true`: dry run only. The request will not create instance(s). A dry run can check whether all the required parameters are specified, whether the request format is right, whether the request exceeds service limits, and whether the specified CVMs are available.
If the dry run fails, the corresponding error code will be returned.
If the dry run succeeds, the RequestId will be returned.
`false` (default value): send a normal request and create instance(s) if all the requirements are met. 
     * @return DryRun Whether the request is a dry run only.
`true`: dry run only. The request will not create instance(s). A dry run can check whether all the required parameters are specified, whether the request format is right, whether the request exceeds service limits, and whether the specified CVMs are available.
If the dry run fails, the corresponding error code will be returned.
If the dry run succeeds, the RequestId will be returned.
`false` (default value): send a normal request and create instance(s) if all the requirements are met.
     */
    public Boolean getDryRun() {
        return this.DryRun;
    }

    /**
     * Set Whether the request is a dry run only.
`true`: dry run only. The request will not create instance(s). A dry run can check whether all the required parameters are specified, whether the request format is right, whether the request exceeds service limits, and whether the specified CVMs are available.
If the dry run fails, the corresponding error code will be returned.
If the dry run succeeds, the RequestId will be returned.
`false` (default value): send a normal request and create instance(s) if all the requirements are met.
     * @param DryRun Whether the request is a dry run only.
`true`: dry run only. The request will not create instance(s). A dry run can check whether all the required parameters are specified, whether the request format is right, whether the request exceeds service limits, and whether the specified CVMs are available.
If the dry run fails, the corresponding error code will be returned.
If the dry run succeeds, the RequestId will be returned.
`false` (default value): send a normal request and create instance(s) if all the requirements are met.
     */
    public void setDryRun(Boolean DryRun) {
        this.DryRun = DryRun;
    }

    /**
     * Get A unique string supplied by the client to ensure that the request is idempotent. Its maximum length is 64 ASCII characters. If this parameter is not specified, the idem-potency of the request cannot be guaranteed. 
     * @return ClientToken A unique string supplied by the client to ensure that the request is idempotent. Its maximum length is 64 ASCII characters. If this parameter is not specified, the idem-potency of the request cannot be guaranteed.
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set A unique string supplied by the client to ensure that the request is idempotent. Its maximum length is 64 ASCII characters. If this parameter is not specified, the idem-potency of the request cannot be guaranteed.
     * @param ClientToken A unique string supplied by the client to ensure that the request is idempotent. Its maximum length is 64 ASCII characters. If this parameter is not specified, the idem-potency of the request cannot be guaranteed.
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get Login password of the instance. It's only available for Windows instances. If it's not specified, it means that the user choose to set the login password after the instance creation. 
     * @return LoginConfiguration Login password of the instance. It's only available for Windows instances. If it's not specified, it means that the user choose to set the login password after the instance creation.
     */
    public LoginConfiguration getLoginConfiguration() {
        return this.LoginConfiguration;
    }

    /**
     * Set Login password of the instance. It's only available for Windows instances. If it's not specified, it means that the user choose to set the login password after the instance creation.
     * @param LoginConfiguration Login password of the instance. It's only available for Windows instances. If it's not specified, it means that the user choose to set the login password after the instance creation.
     */
    public void setLoginConfiguration(LoginConfiguration LoginConfiguration) {
        this.LoginConfiguration = LoginConfiguration;
    }

    /**
     * Get Configuration of the containers to create 
     * @return Containers Configuration of the containers to create
     */
    public DockerContainerConfiguration [] getContainers() {
        return this.Containers;
    }

    /**
     * Set Configuration of the containers to create
     * @param Containers Configuration of the containers to create
     */
    public void setContainers(DockerContainerConfiguration [] Containers) {
        this.Containers = Containers;
    }

    /**
     * Get Whether to use the vouchers automatically. It defaults to No. 
     * @return AutoVoucher Whether to use the vouchers automatically. It defaults to No.
     */
    public Boolean getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set Whether to use the vouchers automatically. It defaults to No.
     * @param AutoVoucher Whether to use the vouchers automatically. It defaults to No.
     */
    public void setAutoVoucher(Boolean AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    /**
     * Get Firewall template ID. If not specified, the default firewall policy is used. 
     * @return FirewallTemplateId Firewall template ID. If not specified, the default firewall policy is used.
     */
    public String getFirewallTemplateId() {
        return this.FirewallTemplateId;
    }

    /**
     * Set Firewall template ID. If not specified, the default firewall policy is used.
     * @param FirewallTemplateId Firewall template ID. If not specified, the default firewall policy is used.
     */
    public void setFirewallTemplateId(String FirewallTemplateId) {
        this.FirewallTemplateId = FirewallTemplateId;
    }

    /**
     * Get Tag key and tag value. If multiple tags are specified, they are created and bound to the specified resources at the same time. A tag key can have only one value on a given resource. If you attempt to add a tag with an existing key, its value is updated to the new value. Tags that do not exist are created automatically. The array supports a maximum of 10 elements. 
     * @return Tags Tag key and tag value. If multiple tags are specified, they are created and bound to the specified resources at the same time. A tag key can have only one value on a given resource. If you attempt to add a tag with an existing key, its value is updated to the new value. Tags that do not exist are created automatically. The array supports a maximum of 10 elements.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag key and tag value. If multiple tags are specified, they are created and bound to the specified resources at the same time. A tag key can have only one value on a given resource. If you attempt to add a tag with an existing key, its value is updated to the new value. Tags that do not exist are created automatically. The array supports a maximum of 10 elements.
     * @param Tags Tag key and tag value. If multiple tags are specified, they are created and bound to the specified resources at the same time. A tag key can have only one value on a given resource. If you attempt to add a tag with an existing key, its value is updated to the new value. Tags that do not exist are created automatically. The array supports a maximum of 10 elements.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get The command to be automatically executed after the instance is created. 
     * @return InitCommand The command to be automatically executed after the instance is created.
     */
    public Command getInitCommand() {
        return this.InitCommand;
    }

    /**
     * Set The command to be automatically executed after the instance is created.
     * @param InitCommand The command to be automatically executed after the instance is created.
     */
    public void setInitCommand(Command InitCommand) {
        this.InitCommand = InitCommand;
    }

    /**
     * Get The primary domain. Note: Once a domain is specified, only a single instance can be purchased (`InstanceCount` must be set to 1). 
     * @return DomainName The primary domain. Note: Once a domain is specified, only a single instance can be purchased (`InstanceCount` must be set to 1).
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set The primary domain. Note: Once a domain is specified, only a single instance can be purchased (`InstanceCount` must be set to 1).
     * @param DomainName The primary domain. Note: Once a domain is specified, only a single instance can be purchased (`InstanceCount` must be set to 1).
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get The subdomain. Note: Once a domain is specified, only a single instance can be purchased (`InstanceCount` must be set to 1). 
     * @return Subdomain The subdomain. Note: Once a domain is specified, only a single instance can be purchased (`InstanceCount` must be set to 1).
     */
    public String getSubdomain() {
        return this.Subdomain;
    }

    /**
     * Set The subdomain. Note: Once a domain is specified, only a single instance can be purchased (`InstanceCount` must be set to 1).
     * @param Subdomain The subdomain. Note: Once a domain is specified, only a single instance can be purchased (`InstanceCount` must be set to 1).
     */
    public void setSubdomain(String Subdomain) {
        this.Subdomain = Subdomain;
    }

    public CreateInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateInstancesRequest(CreateInstancesRequest source) {
        if (source.BundleId != null) {
            this.BundleId = new String(source.BundleId);
        }
        if (source.BlueprintId != null) {
            this.BlueprintId = new String(source.BlueprintId);
        }
        if (source.InstanceChargePrepaid != null) {
            this.InstanceChargePrepaid = new InstanceChargePrepaid(source.InstanceChargePrepaid);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceCount != null) {
            this.InstanceCount = new Long(source.InstanceCount);
        }
        if (source.Zones != null) {
            this.Zones = new String[source.Zones.length];
            for (int i = 0; i < source.Zones.length; i++) {
                this.Zones[i] = new String(source.Zones[i]);
            }
        }
        if (source.DryRun != null) {
            this.DryRun = new Boolean(source.DryRun);
        }
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
        }
        if (source.LoginConfiguration != null) {
            this.LoginConfiguration = new LoginConfiguration(source.LoginConfiguration);
        }
        if (source.Containers != null) {
            this.Containers = new DockerContainerConfiguration[source.Containers.length];
            for (int i = 0; i < source.Containers.length; i++) {
                this.Containers[i] = new DockerContainerConfiguration(source.Containers[i]);
            }
        }
        if (source.AutoVoucher != null) {
            this.AutoVoucher = new Boolean(source.AutoVoucher);
        }
        if (source.FirewallTemplateId != null) {
            this.FirewallTemplateId = new String(source.FirewallTemplateId);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.InitCommand != null) {
            this.InitCommand = new Command(source.InitCommand);
        }
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
        if (source.Subdomain != null) {
            this.Subdomain = new String(source.Subdomain);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BundleId", this.BundleId);
        this.setParamSimple(map, prefix + "BlueprintId", this.BlueprintId);
        this.setParamObj(map, prefix + "InstanceChargePrepaid.", this.InstanceChargePrepaid);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);
        this.setParamArraySimple(map, prefix + "Zones.", this.Zones);
        this.setParamSimple(map, prefix + "DryRun", this.DryRun);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamObj(map, prefix + "LoginConfiguration.", this.LoginConfiguration);
        this.setParamArrayObj(map, prefix + "Containers.", this.Containers);
        this.setParamSimple(map, prefix + "AutoVoucher", this.AutoVoucher);
        this.setParamSimple(map, prefix + "FirewallTemplateId", this.FirewallTemplateId);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamObj(map, prefix + "InitCommand.", this.InitCommand);
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "Subdomain", this.Subdomain);

    }
}

