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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateClusterRequest extends AbstractModel {

    /**
    * The EMR version, such as `EMR-V2.3.0` that indicates the version 2.3.0 of EMR. You can query the EMR version [here](https://intl.cloud.tencent.com/document/product/589/66338?from_cn_redirect=1).
    */
    @SerializedName("ProductVersion")
    @Expose
    private String ProductVersion;

    /**
    * Whether to enable high availability for nodes. Valid values:
<li>`true`: Enable</li>
<li>`false`: Disable</li>
    */
    @SerializedName("EnableSupportHAFlag")
    @Expose
    private Boolean EnableSupportHAFlag;

    /**
    * The instance name.
<li>Length limit: 6-36 characters.</li>
<li>Can contain only Chinese characters, letters, digits, hyphens (-), and underscores (_).</li>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * The instance billing mode. Valid values:
<li>`POSTPAID_BY_HOUR`: The postpaid mode by hour.</li>
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * The instance login setting. This parameter allows you to set a login password or key for your purchased node.
<li>If a key is set, the password will be used for login to the native component WebUI only.</li>
<li>If no key is set, the password will be used for login to all purchased nodes and the native component WebUI.</li>
    */
    @SerializedName("LoginSettings")
    @Expose
    private LoginSettings LoginSettings;

    /**
    * The configuration of cluster application scenario and supported components.
    */
    @SerializedName("SceneSoftwareConfig")
    @Expose
    private SceneSoftwareConfig SceneSoftwareConfig;

    /**
    * The details of the monthly subscription, including the instance period and auto-renewal. It is required if `InstanceChargeType` is `PREPAID`.
    */
    @SerializedName("InstanceChargePrepaid")
    @Expose
    private InstanceChargePrepaid InstanceChargePrepaid;

    /**
    * The ID of the security group to which the instance belongs, in the format of `sg-xxxxxxxx`. You can call the [DescribeSecurityGroups](https://intl.cloud.tencent.com/document/api/215/15808?from_cn_redirect=1) API and obtain this parameter from the `SecurityGroupId` field in the response.
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * The [Bootstrap action](https://intl.cloud.tencent.com/document/product/589/35656?from_cn_redirect=1) script settings.
    */
    @SerializedName("ScriptBootstrapActionConfig")
    @Expose
    private ScriptBootstrapActionConfig [] ScriptBootstrapActionConfig;

    /**
    * Unique random identifier with the time efficiency of 5 minutes, which needs to be specified by the caller to prevent the client from repeatedly creating resources, for example, a9a90aa6-****-****-****-fae360632808.
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * Whether to enable public IP access for master nodes. Valid values:
<li>`NEED_MASTER_WAN`: Enable public IP for master nodes.</li>
<li>`NOT_NEED_MASTER_WAN`: Disable.</li>The public IP is enabled for master nodes by default.
    */
    @SerializedName("NeedMasterWan")
    @Expose
    private String NeedMasterWan;

    /**
    * Whether to enable remote login over the public network. It is invalid if `SecurityGroupId` is passed in. It is disabled by default. Valid values:
<li>`true`: Enable</li>
<li>`false`: Disable</li>
    */
    @SerializedName("EnableRemoteLoginFlag")
    @Expose
    private Boolean EnableRemoteLoginFlag;

    /**
    * Whether to enable Kerberos authentication. Valid values:
<li>`true`: Enable</li>
<li>`false` (default): Disable</li>
    */
    @SerializedName("EnableKerberosFlag")
    @Expose
    private Boolean EnableKerberosFlag;

    /**
    * [Custom software configuration](https://intl.cloud.tencent.com/document/product/589/35655?from_cn_redirect=1?from_cn_redirect=1)
    */
    @SerializedName("CustomConf")
    @Expose
    private String CustomConf;

    /**
    * The tag description list. This parameter is used to bind a tag to a resource instance.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * The list of spread placement group IDs. Only one can be specified.
You can call the [DescribeDisasterRecoverGroups](https://intl.cloud.tencent.com/document/product/213/17810?from_cn_redirect=1) API and obtain this parameter from the `DisasterRecoverGroupId` field in the response.
    */
    @SerializedName("DisasterRecoverGroupIds")
    @Expose
    private String [] DisasterRecoverGroupIds;

    /**
    * Whether to enable the cluster-level CBS encryption. Valid values:
<li>`true`: Enable</li>
<li>`false` (default): Disable</li>
    */
    @SerializedName("EnableCbsEncryptFlag")
    @Expose
    private Boolean EnableCbsEncryptFlag;

    /**
    * The metadatabase information. If `MetaType` is `EMR_NEW_META`, `MetaDataJdbcUrl`, `MetaDataUser`, `MetaDataPass`, and `UnifyMetaInstanceId` are not required.
If `MetaType` is `EMR_EXIT_META`, `UnifyMetaInstanceId` is required.
If `MetaType` is `USER_CUSTOM_META`, `MetaDataJdbcUrl`, `MetaDataUser`, and `MetaDataPass` are required.
    */
    @SerializedName("MetaDBInfo")
    @Expose
    private CustomMetaDBInfo MetaDBInfo;

    /**
    * The shared component information.
    */
    @SerializedName("DependService")
    @Expose
    private DependService [] DependService;

    /**
    * The node resource specs. A spec is specified for each AZ, with the first spec for the primary AZ, the second for the backup AZ, and the third for the arbitrator AZ. If the multi-AZ mode is not enabled, only one spec is required.
    */
    @SerializedName("ZoneResourceConfiguration")
    @Expose
    private ZoneResourceConfiguration [] ZoneResourceConfiguration;

    /**
    * COS bucket path, which is used when you create StarRocks compute-storage separation clusters.
    */
    @SerializedName("CosBucket")
    @Expose
    private String CosBucket;

    /**
    * Node identifier information: currently used only in Terraform.
    */
    @SerializedName("NodeMarks")
    @Expose
    private NodeMark [] NodeMarks;

    /**
    * clb id
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
     * Get The EMR version, such as `EMR-V2.3.0` that indicates the version 2.3.0 of EMR. You can query the EMR version [here](https://intl.cloud.tencent.com/document/product/589/66338?from_cn_redirect=1). 
     * @return ProductVersion The EMR version, such as `EMR-V2.3.0` that indicates the version 2.3.0 of EMR. You can query the EMR version [here](https://intl.cloud.tencent.com/document/product/589/66338?from_cn_redirect=1).
     */
    public String getProductVersion() {
        return this.ProductVersion;
    }

    /**
     * Set The EMR version, such as `EMR-V2.3.0` that indicates the version 2.3.0 of EMR. You can query the EMR version [here](https://intl.cloud.tencent.com/document/product/589/66338?from_cn_redirect=1).
     * @param ProductVersion The EMR version, such as `EMR-V2.3.0` that indicates the version 2.3.0 of EMR. You can query the EMR version [here](https://intl.cloud.tencent.com/document/product/589/66338?from_cn_redirect=1).
     */
    public void setProductVersion(String ProductVersion) {
        this.ProductVersion = ProductVersion;
    }

    /**
     * Get Whether to enable high availability for nodes. Valid values:
<li>`true`: Enable</li>
<li>`false`: Disable</li> 
     * @return EnableSupportHAFlag Whether to enable high availability for nodes. Valid values:
<li>`true`: Enable</li>
<li>`false`: Disable</li>
     */
    public Boolean getEnableSupportHAFlag() {
        return this.EnableSupportHAFlag;
    }

    /**
     * Set Whether to enable high availability for nodes. Valid values:
<li>`true`: Enable</li>
<li>`false`: Disable</li>
     * @param EnableSupportHAFlag Whether to enable high availability for nodes. Valid values:
<li>`true`: Enable</li>
<li>`false`: Disable</li>
     */
    public void setEnableSupportHAFlag(Boolean EnableSupportHAFlag) {
        this.EnableSupportHAFlag = EnableSupportHAFlag;
    }

    /**
     * Get The instance name.
<li>Length limit: 6-36 characters.</li>
<li>Can contain only Chinese characters, letters, digits, hyphens (-), and underscores (_).</li> 
     * @return InstanceName The instance name.
<li>Length limit: 6-36 characters.</li>
<li>Can contain only Chinese characters, letters, digits, hyphens (-), and underscores (_).</li>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set The instance name.
<li>Length limit: 6-36 characters.</li>
<li>Can contain only Chinese characters, letters, digits, hyphens (-), and underscores (_).</li>
     * @param InstanceName The instance name.
<li>Length limit: 6-36 characters.</li>
<li>Can contain only Chinese characters, letters, digits, hyphens (-), and underscores (_).</li>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get The instance billing mode. Valid values:
<li>`POSTPAID_BY_HOUR`: The postpaid mode by hour.</li> 
     * @return InstanceChargeType The instance billing mode. Valid values:
<li>`POSTPAID_BY_HOUR`: The postpaid mode by hour.</li>
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set The instance billing mode. Valid values:
<li>`POSTPAID_BY_HOUR`: The postpaid mode by hour.</li>
     * @param InstanceChargeType The instance billing mode. Valid values:
<li>`POSTPAID_BY_HOUR`: The postpaid mode by hour.</li>
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get The instance login setting. This parameter allows you to set a login password or key for your purchased node.
<li>If a key is set, the password will be used for login to the native component WebUI only.</li>
<li>If no key is set, the password will be used for login to all purchased nodes and the native component WebUI.</li> 
     * @return LoginSettings The instance login setting. This parameter allows you to set a login password or key for your purchased node.
<li>If a key is set, the password will be used for login to the native component WebUI only.</li>
<li>If no key is set, the password will be used for login to all purchased nodes and the native component WebUI.</li>
     */
    public LoginSettings getLoginSettings() {
        return this.LoginSettings;
    }

    /**
     * Set The instance login setting. This parameter allows you to set a login password or key for your purchased node.
<li>If a key is set, the password will be used for login to the native component WebUI only.</li>
<li>If no key is set, the password will be used for login to all purchased nodes and the native component WebUI.</li>
     * @param LoginSettings The instance login setting. This parameter allows you to set a login password or key for your purchased node.
<li>If a key is set, the password will be used for login to the native component WebUI only.</li>
<li>If no key is set, the password will be used for login to all purchased nodes and the native component WebUI.</li>
     */
    public void setLoginSettings(LoginSettings LoginSettings) {
        this.LoginSettings = LoginSettings;
    }

    /**
     * Get The configuration of cluster application scenario and supported components. 
     * @return SceneSoftwareConfig The configuration of cluster application scenario and supported components.
     */
    public SceneSoftwareConfig getSceneSoftwareConfig() {
        return this.SceneSoftwareConfig;
    }

    /**
     * Set The configuration of cluster application scenario and supported components.
     * @param SceneSoftwareConfig The configuration of cluster application scenario and supported components.
     */
    public void setSceneSoftwareConfig(SceneSoftwareConfig SceneSoftwareConfig) {
        this.SceneSoftwareConfig = SceneSoftwareConfig;
    }

    /**
     * Get The details of the monthly subscription, including the instance period and auto-renewal. It is required if `InstanceChargeType` is `PREPAID`. 
     * @return InstanceChargePrepaid The details of the monthly subscription, including the instance period and auto-renewal. It is required if `InstanceChargeType` is `PREPAID`.
     */
    public InstanceChargePrepaid getInstanceChargePrepaid() {
        return this.InstanceChargePrepaid;
    }

    /**
     * Set The details of the monthly subscription, including the instance period and auto-renewal. It is required if `InstanceChargeType` is `PREPAID`.
     * @param InstanceChargePrepaid The details of the monthly subscription, including the instance period and auto-renewal. It is required if `InstanceChargeType` is `PREPAID`.
     */
    public void setInstanceChargePrepaid(InstanceChargePrepaid InstanceChargePrepaid) {
        this.InstanceChargePrepaid = InstanceChargePrepaid;
    }

    /**
     * Get The ID of the security group to which the instance belongs, in the format of `sg-xxxxxxxx`. You can call the [DescribeSecurityGroups](https://intl.cloud.tencent.com/document/api/215/15808?from_cn_redirect=1) API and obtain this parameter from the `SecurityGroupId` field in the response. 
     * @return SecurityGroupIds The ID of the security group to which the instance belongs, in the format of `sg-xxxxxxxx`. You can call the [DescribeSecurityGroups](https://intl.cloud.tencent.com/document/api/215/15808?from_cn_redirect=1) API and obtain this parameter from the `SecurityGroupId` field in the response.
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set The ID of the security group to which the instance belongs, in the format of `sg-xxxxxxxx`. You can call the [DescribeSecurityGroups](https://intl.cloud.tencent.com/document/api/215/15808?from_cn_redirect=1) API and obtain this parameter from the `SecurityGroupId` field in the response.
     * @param SecurityGroupIds The ID of the security group to which the instance belongs, in the format of `sg-xxxxxxxx`. You can call the [DescribeSecurityGroups](https://intl.cloud.tencent.com/document/api/215/15808?from_cn_redirect=1) API and obtain this parameter from the `SecurityGroupId` field in the response.
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get The [Bootstrap action](https://intl.cloud.tencent.com/document/product/589/35656?from_cn_redirect=1) script settings. 
     * @return ScriptBootstrapActionConfig The [Bootstrap action](https://intl.cloud.tencent.com/document/product/589/35656?from_cn_redirect=1) script settings.
     */
    public ScriptBootstrapActionConfig [] getScriptBootstrapActionConfig() {
        return this.ScriptBootstrapActionConfig;
    }

    /**
     * Set The [Bootstrap action](https://intl.cloud.tencent.com/document/product/589/35656?from_cn_redirect=1) script settings.
     * @param ScriptBootstrapActionConfig The [Bootstrap action](https://intl.cloud.tencent.com/document/product/589/35656?from_cn_redirect=1) script settings.
     */
    public void setScriptBootstrapActionConfig(ScriptBootstrapActionConfig [] ScriptBootstrapActionConfig) {
        this.ScriptBootstrapActionConfig = ScriptBootstrapActionConfig;
    }

    /**
     * Get Unique random identifier with the time efficiency of 5 minutes, which needs to be specified by the caller to prevent the client from repeatedly creating resources, for example, a9a90aa6-****-****-****-fae360632808. 
     * @return ClientToken Unique random identifier with the time efficiency of 5 minutes, which needs to be specified by the caller to prevent the client from repeatedly creating resources, for example, a9a90aa6-****-****-****-fae360632808.
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set Unique random identifier with the time efficiency of 5 minutes, which needs to be specified by the caller to prevent the client from repeatedly creating resources, for example, a9a90aa6-****-****-****-fae360632808.
     * @param ClientToken Unique random identifier with the time efficiency of 5 minutes, which needs to be specified by the caller to prevent the client from repeatedly creating resources, for example, a9a90aa6-****-****-****-fae360632808.
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get Whether to enable public IP access for master nodes. Valid values:
<li>`NEED_MASTER_WAN`: Enable public IP for master nodes.</li>
<li>`NOT_NEED_MASTER_WAN`: Disable.</li>The public IP is enabled for master nodes by default. 
     * @return NeedMasterWan Whether to enable public IP access for master nodes. Valid values:
<li>`NEED_MASTER_WAN`: Enable public IP for master nodes.</li>
<li>`NOT_NEED_MASTER_WAN`: Disable.</li>The public IP is enabled for master nodes by default.
     */
    public String getNeedMasterWan() {
        return this.NeedMasterWan;
    }

    /**
     * Set Whether to enable public IP access for master nodes. Valid values:
<li>`NEED_MASTER_WAN`: Enable public IP for master nodes.</li>
<li>`NOT_NEED_MASTER_WAN`: Disable.</li>The public IP is enabled for master nodes by default.
     * @param NeedMasterWan Whether to enable public IP access for master nodes. Valid values:
<li>`NEED_MASTER_WAN`: Enable public IP for master nodes.</li>
<li>`NOT_NEED_MASTER_WAN`: Disable.</li>The public IP is enabled for master nodes by default.
     */
    public void setNeedMasterWan(String NeedMasterWan) {
        this.NeedMasterWan = NeedMasterWan;
    }

    /**
     * Get Whether to enable remote login over the public network. It is invalid if `SecurityGroupId` is passed in. It is disabled by default. Valid values:
<li>`true`: Enable</li>
<li>`false`: Disable</li> 
     * @return EnableRemoteLoginFlag Whether to enable remote login over the public network. It is invalid if `SecurityGroupId` is passed in. It is disabled by default. Valid values:
<li>`true`: Enable</li>
<li>`false`: Disable</li>
     */
    public Boolean getEnableRemoteLoginFlag() {
        return this.EnableRemoteLoginFlag;
    }

    /**
     * Set Whether to enable remote login over the public network. It is invalid if `SecurityGroupId` is passed in. It is disabled by default. Valid values:
<li>`true`: Enable</li>
<li>`false`: Disable</li>
     * @param EnableRemoteLoginFlag Whether to enable remote login over the public network. It is invalid if `SecurityGroupId` is passed in. It is disabled by default. Valid values:
<li>`true`: Enable</li>
<li>`false`: Disable</li>
     */
    public void setEnableRemoteLoginFlag(Boolean EnableRemoteLoginFlag) {
        this.EnableRemoteLoginFlag = EnableRemoteLoginFlag;
    }

    /**
     * Get Whether to enable Kerberos authentication. Valid values:
<li>`true`: Enable</li>
<li>`false` (default): Disable</li> 
     * @return EnableKerberosFlag Whether to enable Kerberos authentication. Valid values:
<li>`true`: Enable</li>
<li>`false` (default): Disable</li>
     */
    public Boolean getEnableKerberosFlag() {
        return this.EnableKerberosFlag;
    }

    /**
     * Set Whether to enable Kerberos authentication. Valid values:
<li>`true`: Enable</li>
<li>`false` (default): Disable</li>
     * @param EnableKerberosFlag Whether to enable Kerberos authentication. Valid values:
<li>`true`: Enable</li>
<li>`false` (default): Disable</li>
     */
    public void setEnableKerberosFlag(Boolean EnableKerberosFlag) {
        this.EnableKerberosFlag = EnableKerberosFlag;
    }

    /**
     * Get [Custom software configuration](https://intl.cloud.tencent.com/document/product/589/35655?from_cn_redirect=1?from_cn_redirect=1) 
     * @return CustomConf [Custom software configuration](https://intl.cloud.tencent.com/document/product/589/35655?from_cn_redirect=1?from_cn_redirect=1)
     */
    public String getCustomConf() {
        return this.CustomConf;
    }

    /**
     * Set [Custom software configuration](https://intl.cloud.tencent.com/document/product/589/35655?from_cn_redirect=1?from_cn_redirect=1)
     * @param CustomConf [Custom software configuration](https://intl.cloud.tencent.com/document/product/589/35655?from_cn_redirect=1?from_cn_redirect=1)
     */
    public void setCustomConf(String CustomConf) {
        this.CustomConf = CustomConf;
    }

    /**
     * Get The tag description list. This parameter is used to bind a tag to a resource instance. 
     * @return Tags The tag description list. This parameter is used to bind a tag to a resource instance.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set The tag description list. This parameter is used to bind a tag to a resource instance.
     * @param Tags The tag description list. This parameter is used to bind a tag to a resource instance.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get The list of spread placement group IDs. Only one can be specified.
You can call the [DescribeDisasterRecoverGroups](https://intl.cloud.tencent.com/document/product/213/17810?from_cn_redirect=1) API and obtain this parameter from the `DisasterRecoverGroupId` field in the response. 
     * @return DisasterRecoverGroupIds The list of spread placement group IDs. Only one can be specified.
You can call the [DescribeDisasterRecoverGroups](https://intl.cloud.tencent.com/document/product/213/17810?from_cn_redirect=1) API and obtain this parameter from the `DisasterRecoverGroupId` field in the response.
     */
    public String [] getDisasterRecoverGroupIds() {
        return this.DisasterRecoverGroupIds;
    }

    /**
     * Set The list of spread placement group IDs. Only one can be specified.
You can call the [DescribeDisasterRecoverGroups](https://intl.cloud.tencent.com/document/product/213/17810?from_cn_redirect=1) API and obtain this parameter from the `DisasterRecoverGroupId` field in the response.
     * @param DisasterRecoverGroupIds The list of spread placement group IDs. Only one can be specified.
You can call the [DescribeDisasterRecoverGroups](https://intl.cloud.tencent.com/document/product/213/17810?from_cn_redirect=1) API and obtain this parameter from the `DisasterRecoverGroupId` field in the response.
     */
    public void setDisasterRecoverGroupIds(String [] DisasterRecoverGroupIds) {
        this.DisasterRecoverGroupIds = DisasterRecoverGroupIds;
    }

    /**
     * Get Whether to enable the cluster-level CBS encryption. Valid values:
<li>`true`: Enable</li>
<li>`false` (default): Disable</li> 
     * @return EnableCbsEncryptFlag Whether to enable the cluster-level CBS encryption. Valid values:
<li>`true`: Enable</li>
<li>`false` (default): Disable</li>
     */
    public Boolean getEnableCbsEncryptFlag() {
        return this.EnableCbsEncryptFlag;
    }

    /**
     * Set Whether to enable the cluster-level CBS encryption. Valid values:
<li>`true`: Enable</li>
<li>`false` (default): Disable</li>
     * @param EnableCbsEncryptFlag Whether to enable the cluster-level CBS encryption. Valid values:
<li>`true`: Enable</li>
<li>`false` (default): Disable</li>
     */
    public void setEnableCbsEncryptFlag(Boolean EnableCbsEncryptFlag) {
        this.EnableCbsEncryptFlag = EnableCbsEncryptFlag;
    }

    /**
     * Get The metadatabase information. If `MetaType` is `EMR_NEW_META`, `MetaDataJdbcUrl`, `MetaDataUser`, `MetaDataPass`, and `UnifyMetaInstanceId` are not required.
If `MetaType` is `EMR_EXIT_META`, `UnifyMetaInstanceId` is required.
If `MetaType` is `USER_CUSTOM_META`, `MetaDataJdbcUrl`, `MetaDataUser`, and `MetaDataPass` are required. 
     * @return MetaDBInfo The metadatabase information. If `MetaType` is `EMR_NEW_META`, `MetaDataJdbcUrl`, `MetaDataUser`, `MetaDataPass`, and `UnifyMetaInstanceId` are not required.
If `MetaType` is `EMR_EXIT_META`, `UnifyMetaInstanceId` is required.
If `MetaType` is `USER_CUSTOM_META`, `MetaDataJdbcUrl`, `MetaDataUser`, and `MetaDataPass` are required.
     */
    public CustomMetaDBInfo getMetaDBInfo() {
        return this.MetaDBInfo;
    }

    /**
     * Set The metadatabase information. If `MetaType` is `EMR_NEW_META`, `MetaDataJdbcUrl`, `MetaDataUser`, `MetaDataPass`, and `UnifyMetaInstanceId` are not required.
If `MetaType` is `EMR_EXIT_META`, `UnifyMetaInstanceId` is required.
If `MetaType` is `USER_CUSTOM_META`, `MetaDataJdbcUrl`, `MetaDataUser`, and `MetaDataPass` are required.
     * @param MetaDBInfo The metadatabase information. If `MetaType` is `EMR_NEW_META`, `MetaDataJdbcUrl`, `MetaDataUser`, `MetaDataPass`, and `UnifyMetaInstanceId` are not required.
If `MetaType` is `EMR_EXIT_META`, `UnifyMetaInstanceId` is required.
If `MetaType` is `USER_CUSTOM_META`, `MetaDataJdbcUrl`, `MetaDataUser`, and `MetaDataPass` are required.
     */
    public void setMetaDBInfo(CustomMetaDBInfo MetaDBInfo) {
        this.MetaDBInfo = MetaDBInfo;
    }

    /**
     * Get The shared component information. 
     * @return DependService The shared component information.
     */
    public DependService [] getDependService() {
        return this.DependService;
    }

    /**
     * Set The shared component information.
     * @param DependService The shared component information.
     */
    public void setDependService(DependService [] DependService) {
        this.DependService = DependService;
    }

    /**
     * Get The node resource specs. A spec is specified for each AZ, with the first spec for the primary AZ, the second for the backup AZ, and the third for the arbitrator AZ. If the multi-AZ mode is not enabled, only one spec is required. 
     * @return ZoneResourceConfiguration The node resource specs. A spec is specified for each AZ, with the first spec for the primary AZ, the second for the backup AZ, and the third for the arbitrator AZ. If the multi-AZ mode is not enabled, only one spec is required.
     */
    public ZoneResourceConfiguration [] getZoneResourceConfiguration() {
        return this.ZoneResourceConfiguration;
    }

    /**
     * Set The node resource specs. A spec is specified for each AZ, with the first spec for the primary AZ, the second for the backup AZ, and the third for the arbitrator AZ. If the multi-AZ mode is not enabled, only one spec is required.
     * @param ZoneResourceConfiguration The node resource specs. A spec is specified for each AZ, with the first spec for the primary AZ, the second for the backup AZ, and the third for the arbitrator AZ. If the multi-AZ mode is not enabled, only one spec is required.
     */
    public void setZoneResourceConfiguration(ZoneResourceConfiguration [] ZoneResourceConfiguration) {
        this.ZoneResourceConfiguration = ZoneResourceConfiguration;
    }

    /**
     * Get COS bucket path, which is used when you create StarRocks compute-storage separation clusters. 
     * @return CosBucket COS bucket path, which is used when you create StarRocks compute-storage separation clusters.
     */
    public String getCosBucket() {
        return this.CosBucket;
    }

    /**
     * Set COS bucket path, which is used when you create StarRocks compute-storage separation clusters.
     * @param CosBucket COS bucket path, which is used when you create StarRocks compute-storage separation clusters.
     */
    public void setCosBucket(String CosBucket) {
        this.CosBucket = CosBucket;
    }

    /**
     * Get Node identifier information: currently used only in Terraform. 
     * @return NodeMarks Node identifier information: currently used only in Terraform.
     */
    public NodeMark [] getNodeMarks() {
        return this.NodeMarks;
    }

    /**
     * Set Node identifier information: currently used only in Terraform.
     * @param NodeMarks Node identifier information: currently used only in Terraform.
     */
    public void setNodeMarks(NodeMark [] NodeMarks) {
        this.NodeMarks = NodeMarks;
    }

    /**
     * Get clb id 
     * @return LoadBalancerId clb id
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set clb id
     * @param LoadBalancerId clb id
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    public CreateClusterRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateClusterRequest(CreateClusterRequest source) {
        if (source.ProductVersion != null) {
            this.ProductVersion = new String(source.ProductVersion);
        }
        if (source.EnableSupportHAFlag != null) {
            this.EnableSupportHAFlag = new Boolean(source.EnableSupportHAFlag);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new String(source.InstanceChargeType);
        }
        if (source.LoginSettings != null) {
            this.LoginSettings = new LoginSettings(source.LoginSettings);
        }
        if (source.SceneSoftwareConfig != null) {
            this.SceneSoftwareConfig = new SceneSoftwareConfig(source.SceneSoftwareConfig);
        }
        if (source.InstanceChargePrepaid != null) {
            this.InstanceChargePrepaid = new InstanceChargePrepaid(source.InstanceChargePrepaid);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
        if (source.ScriptBootstrapActionConfig != null) {
            this.ScriptBootstrapActionConfig = new ScriptBootstrapActionConfig[source.ScriptBootstrapActionConfig.length];
            for (int i = 0; i < source.ScriptBootstrapActionConfig.length; i++) {
                this.ScriptBootstrapActionConfig[i] = new ScriptBootstrapActionConfig(source.ScriptBootstrapActionConfig[i]);
            }
        }
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
        }
        if (source.NeedMasterWan != null) {
            this.NeedMasterWan = new String(source.NeedMasterWan);
        }
        if (source.EnableRemoteLoginFlag != null) {
            this.EnableRemoteLoginFlag = new Boolean(source.EnableRemoteLoginFlag);
        }
        if (source.EnableKerberosFlag != null) {
            this.EnableKerberosFlag = new Boolean(source.EnableKerberosFlag);
        }
        if (source.CustomConf != null) {
            this.CustomConf = new String(source.CustomConf);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.DisasterRecoverGroupIds != null) {
            this.DisasterRecoverGroupIds = new String[source.DisasterRecoverGroupIds.length];
            for (int i = 0; i < source.DisasterRecoverGroupIds.length; i++) {
                this.DisasterRecoverGroupIds[i] = new String(source.DisasterRecoverGroupIds[i]);
            }
        }
        if (source.EnableCbsEncryptFlag != null) {
            this.EnableCbsEncryptFlag = new Boolean(source.EnableCbsEncryptFlag);
        }
        if (source.MetaDBInfo != null) {
            this.MetaDBInfo = new CustomMetaDBInfo(source.MetaDBInfo);
        }
        if (source.DependService != null) {
            this.DependService = new DependService[source.DependService.length];
            for (int i = 0; i < source.DependService.length; i++) {
                this.DependService[i] = new DependService(source.DependService[i]);
            }
        }
        if (source.ZoneResourceConfiguration != null) {
            this.ZoneResourceConfiguration = new ZoneResourceConfiguration[source.ZoneResourceConfiguration.length];
            for (int i = 0; i < source.ZoneResourceConfiguration.length; i++) {
                this.ZoneResourceConfiguration[i] = new ZoneResourceConfiguration(source.ZoneResourceConfiguration[i]);
            }
        }
        if (source.CosBucket != null) {
            this.CosBucket = new String(source.CosBucket);
        }
        if (source.NodeMarks != null) {
            this.NodeMarks = new NodeMark[source.NodeMarks.length];
            for (int i = 0; i < source.NodeMarks.length; i++) {
                this.NodeMarks[i] = new NodeMark(source.NodeMarks[i]);
            }
        }
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductVersion", this.ProductVersion);
        this.setParamSimple(map, prefix + "EnableSupportHAFlag", this.EnableSupportHAFlag);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamObj(map, prefix + "LoginSettings.", this.LoginSettings);
        this.setParamObj(map, prefix + "SceneSoftwareConfig.", this.SceneSoftwareConfig);
        this.setParamObj(map, prefix + "InstanceChargePrepaid.", this.InstanceChargePrepaid);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamArrayObj(map, prefix + "ScriptBootstrapActionConfig.", this.ScriptBootstrapActionConfig);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamSimple(map, prefix + "NeedMasterWan", this.NeedMasterWan);
        this.setParamSimple(map, prefix + "EnableRemoteLoginFlag", this.EnableRemoteLoginFlag);
        this.setParamSimple(map, prefix + "EnableKerberosFlag", this.EnableKerberosFlag);
        this.setParamSimple(map, prefix + "CustomConf", this.CustomConf);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamArraySimple(map, prefix + "DisasterRecoverGroupIds.", this.DisasterRecoverGroupIds);
        this.setParamSimple(map, prefix + "EnableCbsEncryptFlag", this.EnableCbsEncryptFlag);
        this.setParamObj(map, prefix + "MetaDBInfo.", this.MetaDBInfo);
        this.setParamArrayObj(map, prefix + "DependService.", this.DependService);
        this.setParamArrayObj(map, prefix + "ZoneResourceConfiguration.", this.ZoneResourceConfiguration);
        this.setParamSimple(map, prefix + "CosBucket", this.CosBucket);
        this.setParamArrayObj(map, prefix + "NodeMarks.", this.NodeMarks);
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);

    }
}

