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
    * <p>EMR product version name, for example, EMR-V2.3.0 (EMR 2.3.0). Currently, product version names can be queried. For details, see <a href="https://www.tencentcloud.com/document/product/589/66338?from_cn_redirect=1">Product Version Name</a>.</p>
    */
    @SerializedName("ProductVersion")
    @Expose
    private String ProductVersion;

    /**
    * <p>Whether to enable high availability for the node. Valid values:</p><li>true: yes</li><li>false: no</li>
    */
    @SerializedName("EnableSupportHAFlag")
    @Expose
    private Boolean EnableSupportHAFlag;

    /**
    * <p>Instance name.</p><li>The value can contain 6 to 36 characters.</li><li>Only Chinese characters, letters, digits, hyphens (-), and underscores (_) are allowed.</li>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>Instance billing mode. Valid values:</p><li>PREPAID: prepaid, that is, yearly/monthly subscription</li><li>POSTPAID_BY_HOUR: pay-as-you-go on an hourly basis</li>
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * <p>Instance login settings. This parameter is used to set the login method for the purchased node, either the password or key.</p><li>When a key is set, the password is only used to log in to the native WebUI shortcut entry for the component.</li><li>When no key is set, the password is used to log in to the purchased node as well as the native WebUI shortcut entry for the component.</li>
    */
    @SerializedName("LoginSettings")
    @Expose
    private LoginSettings LoginSettings;

    /**
    * <p>Cluster application scenario and supported deployment component configuration.</p>
    */
    @SerializedName("SceneSoftwareConfig")
    @Expose
    private SceneSoftwareConfig SceneSoftwareConfig;

    /**
    * <p>Parameter settings related to yearly/monthly subscription. This parameter can be used to specify the purchase duration of a yearly/monthly subscription instance, whether to enable auto-renewal, and other attributes. This parameter is required if the billing mode of the specified instance is prepaid.</p>
    */
    @SerializedName("InstanceChargePrepaid")
    @Expose
    private InstanceChargePrepaid InstanceChargePrepaid;

    /**
    * <p>ID of the security group to which the instance belongs, for example, sg-xxxxxxxx. This parameter can be obtained by calling the SecurityGroupId field in the response result of <a href="https://www.tencentcloud.com/document/api/215/15808?from_cn_redirect=1">DescribeSecurityGroups</a>.</p>
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * <p><a href="https://www.tencentcloud.com/document/product/589/35656?from_cn_redirect=1">Bootstrap operation</a> script settings.</p>
    */
    @SerializedName("ScriptBootstrapActionConfig")
    @Expose
    private ScriptBootstrapActionConfig [] ScriptBootstrapActionConfig;

    /**
    * <p>Unique random identifier with a time-to-live of 5 minutes, which needs to be specified by the caller to prevent the client from repeatedly creating resources, for example, a9a90aa6-<strong><strong>-</strong></strong>-****-fae360632808.</p>
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * <p>Whether to enable public network access for the cluster Master node. Valid values:</p><li>NEED_MASTER_WAN: yes</li><li>NOT_NEED_MASTER_WAN: no</li>By default, public network access is enabled for the cluster Master node.
    */
    @SerializedName("NeedMasterWan")
    @Expose
    private String NeedMasterWan;

    /**
    * <p>Whether to enable remote login in the public network. (When SecurityGroupId is not empty, this parameter is invalid.) If this parameter is left empty, it is disabled by default. Valid values:</p><li>true: enable</li><li>false: disable</li>
    */
    @SerializedName("EnableRemoteLoginFlag")
    @Expose
    private Boolean EnableRemoteLoginFlag;

    /**
    * <p>Whether to enable Kerberos authentication. It is disabled by default. Valid values:</p><li>true: enabled</li><li>false: disabled</li>
    */
    @SerializedName("EnableKerberosFlag")
    @Expose
    private Boolean EnableKerberosFlag;

    /**
    * <p><a href="https://www.tencentcloud.com/document/product/589/35655?from_cn_redirect=1?from_cn_redirect=1">Custom software configuration.</a></p>
    */
    @SerializedName("CustomConf")
    @Expose
    private String CustomConf;

    /**
    * <p>List of tag descriptions. When this parameter is specified, tags are bound to the corresponding instance.</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>List of dispersed placement group IDs. Currently, only one ID can be specified.<br>This parameter can be obtained by calling the DisasterRecoverGroupId field in the response result of <a href="https://www.tencentcloud.com/document/product/213/17810?from_cn_redirect=1">DescribeDisasterRecoverGroups</a>.</p>
    */
    @SerializedName("DisasterRecoverGroupIds")
    @Expose
    private String [] DisasterRecoverGroupIds;

    /**
    * <p>Whether to enable cluster-level CBS encryption. It is not encrypted by default. Valid values:</p><li>true: encrypted</li><li>false: not encrypted</li>
    */
    @SerializedName("EnableCbsEncryptFlag")
    @Expose
    private Boolean EnableCbsEncryptFlag;

    /**
    * <p>MetaDB information. When MetaType is set to EMR_NEW_META, MetaDataJdbcUrl, MetaDataUser, MetaDataPass, and UnifyMetaInstanceId can be left empty.<br>When MetaType is set to EMR_EXIT_META, set UnifyMetaInstanceId.<br>When MetaType is set to USER_CUSTOM_META, set MetaDataJdbcUrl, MetaDataUser, and MetaDataPass.</p>
    */
    @SerializedName("MetaDBInfo")
    @Expose
    private CustomMetaDBInfo MetaDBInfo;

    /**
    * <p>Shared component information.</p>
    */
    @SerializedName("DependService")
    @Expose
    private DependService [] DependService;

    /**
    * <p>Specifications of node resources. Set one for each AZ. The first is the primary AZ, the second is the secondary AZ, and the third is the arbitration AZ. If cross-AZ is disabled, the length only needs to be 1.</p>
    */
    @SerializedName("ZoneResourceConfiguration")
    @Expose
    private ZoneResourceConfiguration [] ZoneResourceConfiguration;

    /**
    * <p>COS bucket path, which is used when a StarRocks compute-storage separation cluster is created.</p>
    */
    @SerializedName("CosBucket")
    @Expose
    private String CosBucket;

    /**
    * <p>Node flag information, which is currently only provided for the Terraform platform.</p>
    */
    @SerializedName("NodeMarks")
    @Expose
    private NodeMark [] NodeMarks;

    /**
    * <p>clb id</p>
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * <p>Database version. Valid values: mysql8/tdsql8/mysql5.</p>
    */
    @SerializedName("DefaultMetaVersion")
    @Expose
    private String DefaultMetaVersion;

    /**
    * <p>Whether database audit is enabled.</p>
    */
    @SerializedName("NeedCdbAudit")
    @Expose
    private Long NeedCdbAudit;

    /**
    * <p>Source IP address, which is specified in the security group.</p>
    */
    @SerializedName("SgIP")
    @Expose
    private String SgIP;

    /**
    * <p>Partition of a partition placement group.</p>
    */
    @SerializedName("PartitionNumber")
    @Expose
    private Long PartitionNumber;

    /**
    * <p>Service UI address.</p><p>Enumeration values:</p><ul><li>0: Service UI address. Only one service UI address is returned.</li><li>1: Service UI address. If the service has multiple UI addresses, all results are returned, such as Impalad, StateStore, and Catalogd of Impala.</li></ul><p>Default value: 0.</p>
    */
    @SerializedName("WebUiVersion")
    @Expose
    private Long WebUiVersion;

    /**
    * <p>Whether the system disk is encrypted.</p>
    */
    @SerializedName("EnableCbsSysEncryptFlag")
    @Expose
    private Boolean EnableCbsSysEncryptFlag;

    /**
    * <p>Custom MetaDB data.</p>
    */
    @SerializedName("MetaDBGroupInfo")
    @Expose
    private CustomMetaDBInfo [] MetaDBGroupInfo;

    /**
     * Get <p>EMR product version name, for example, EMR-V2.3.0 (EMR 2.3.0). Currently, product version names can be queried. For details, see <a href="https://www.tencentcloud.com/document/product/589/66338?from_cn_redirect=1">Product Version Name</a>.</p> 
     * @return ProductVersion <p>EMR product version name, for example, EMR-V2.3.0 (EMR 2.3.0). Currently, product version names can be queried. For details, see <a href="https://www.tencentcloud.com/document/product/589/66338?from_cn_redirect=1">Product Version Name</a>.</p>
     */
    public String getProductVersion() {
        return this.ProductVersion;
    }

    /**
     * Set <p>EMR product version name, for example, EMR-V2.3.0 (EMR 2.3.0). Currently, product version names can be queried. For details, see <a href="https://www.tencentcloud.com/document/product/589/66338?from_cn_redirect=1">Product Version Name</a>.</p>
     * @param ProductVersion <p>EMR product version name, for example, EMR-V2.3.0 (EMR 2.3.0). Currently, product version names can be queried. For details, see <a href="https://www.tencentcloud.com/document/product/589/66338?from_cn_redirect=1">Product Version Name</a>.</p>
     */
    public void setProductVersion(String ProductVersion) {
        this.ProductVersion = ProductVersion;
    }

    /**
     * Get <p>Whether to enable high availability for the node. Valid values:</p><li>true: yes</li><li>false: no</li> 
     * @return EnableSupportHAFlag <p>Whether to enable high availability for the node. Valid values:</p><li>true: yes</li><li>false: no</li>
     */
    public Boolean getEnableSupportHAFlag() {
        return this.EnableSupportHAFlag;
    }

    /**
     * Set <p>Whether to enable high availability for the node. Valid values:</p><li>true: yes</li><li>false: no</li>
     * @param EnableSupportHAFlag <p>Whether to enable high availability for the node. Valid values:</p><li>true: yes</li><li>false: no</li>
     */
    public void setEnableSupportHAFlag(Boolean EnableSupportHAFlag) {
        this.EnableSupportHAFlag = EnableSupportHAFlag;
    }

    /**
     * Get <p>Instance name.</p><li>The value can contain 6 to 36 characters.</li><li>Only Chinese characters, letters, digits, hyphens (-), and underscores (_) are allowed.</li> 
     * @return InstanceName <p>Instance name.</p><li>The value can contain 6 to 36 characters.</li><li>Only Chinese characters, letters, digits, hyphens (-), and underscores (_) are allowed.</li>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>Instance name.</p><li>The value can contain 6 to 36 characters.</li><li>Only Chinese characters, letters, digits, hyphens (-), and underscores (_) are allowed.</li>
     * @param InstanceName <p>Instance name.</p><li>The value can contain 6 to 36 characters.</li><li>Only Chinese characters, letters, digits, hyphens (-), and underscores (_) are allowed.</li>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>Instance billing mode. Valid values:</p><li>PREPAID: prepaid, that is, yearly/monthly subscription</li><li>POSTPAID_BY_HOUR: pay-as-you-go on an hourly basis</li> 
     * @return InstanceChargeType <p>Instance billing mode. Valid values:</p><li>PREPAID: prepaid, that is, yearly/monthly subscription</li><li>POSTPAID_BY_HOUR: pay-as-you-go on an hourly basis</li>
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set <p>Instance billing mode. Valid values:</p><li>PREPAID: prepaid, that is, yearly/monthly subscription</li><li>POSTPAID_BY_HOUR: pay-as-you-go on an hourly basis</li>
     * @param InstanceChargeType <p>Instance billing mode. Valid values:</p><li>PREPAID: prepaid, that is, yearly/monthly subscription</li><li>POSTPAID_BY_HOUR: pay-as-you-go on an hourly basis</li>
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get <p>Instance login settings. This parameter is used to set the login method for the purchased node, either the password or key.</p><li>When a key is set, the password is only used to log in to the native WebUI shortcut entry for the component.</li><li>When no key is set, the password is used to log in to the purchased node as well as the native WebUI shortcut entry for the component.</li> 
     * @return LoginSettings <p>Instance login settings. This parameter is used to set the login method for the purchased node, either the password or key.</p><li>When a key is set, the password is only used to log in to the native WebUI shortcut entry for the component.</li><li>When no key is set, the password is used to log in to the purchased node as well as the native WebUI shortcut entry for the component.</li>
     */
    public LoginSettings getLoginSettings() {
        return this.LoginSettings;
    }

    /**
     * Set <p>Instance login settings. This parameter is used to set the login method for the purchased node, either the password or key.</p><li>When a key is set, the password is only used to log in to the native WebUI shortcut entry for the component.</li><li>When no key is set, the password is used to log in to the purchased node as well as the native WebUI shortcut entry for the component.</li>
     * @param LoginSettings <p>Instance login settings. This parameter is used to set the login method for the purchased node, either the password or key.</p><li>When a key is set, the password is only used to log in to the native WebUI shortcut entry for the component.</li><li>When no key is set, the password is used to log in to the purchased node as well as the native WebUI shortcut entry for the component.</li>
     */
    public void setLoginSettings(LoginSettings LoginSettings) {
        this.LoginSettings = LoginSettings;
    }

    /**
     * Get <p>Cluster application scenario and supported deployment component configuration.</p> 
     * @return SceneSoftwareConfig <p>Cluster application scenario and supported deployment component configuration.</p>
     */
    public SceneSoftwareConfig getSceneSoftwareConfig() {
        return this.SceneSoftwareConfig;
    }

    /**
     * Set <p>Cluster application scenario and supported deployment component configuration.</p>
     * @param SceneSoftwareConfig <p>Cluster application scenario and supported deployment component configuration.</p>
     */
    public void setSceneSoftwareConfig(SceneSoftwareConfig SceneSoftwareConfig) {
        this.SceneSoftwareConfig = SceneSoftwareConfig;
    }

    /**
     * Get <p>Parameter settings related to yearly/monthly subscription. This parameter can be used to specify the purchase duration of a yearly/monthly subscription instance, whether to enable auto-renewal, and other attributes. This parameter is required if the billing mode of the specified instance is prepaid.</p> 
     * @return InstanceChargePrepaid <p>Parameter settings related to yearly/monthly subscription. This parameter can be used to specify the purchase duration of a yearly/monthly subscription instance, whether to enable auto-renewal, and other attributes. This parameter is required if the billing mode of the specified instance is prepaid.</p>
     */
    public InstanceChargePrepaid getInstanceChargePrepaid() {
        return this.InstanceChargePrepaid;
    }

    /**
     * Set <p>Parameter settings related to yearly/monthly subscription. This parameter can be used to specify the purchase duration of a yearly/monthly subscription instance, whether to enable auto-renewal, and other attributes. This parameter is required if the billing mode of the specified instance is prepaid.</p>
     * @param InstanceChargePrepaid <p>Parameter settings related to yearly/monthly subscription. This parameter can be used to specify the purchase duration of a yearly/monthly subscription instance, whether to enable auto-renewal, and other attributes. This parameter is required if the billing mode of the specified instance is prepaid.</p>
     */
    public void setInstanceChargePrepaid(InstanceChargePrepaid InstanceChargePrepaid) {
        this.InstanceChargePrepaid = InstanceChargePrepaid;
    }

    /**
     * Get <p>ID of the security group to which the instance belongs, for example, sg-xxxxxxxx. This parameter can be obtained by calling the SecurityGroupId field in the response result of <a href="https://www.tencentcloud.com/document/api/215/15808?from_cn_redirect=1">DescribeSecurityGroups</a>.</p> 
     * @return SecurityGroupIds <p>ID of the security group to which the instance belongs, for example, sg-xxxxxxxx. This parameter can be obtained by calling the SecurityGroupId field in the response result of <a href="https://www.tencentcloud.com/document/api/215/15808?from_cn_redirect=1">DescribeSecurityGroups</a>.</p>
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set <p>ID of the security group to which the instance belongs, for example, sg-xxxxxxxx. This parameter can be obtained by calling the SecurityGroupId field in the response result of <a href="https://www.tencentcloud.com/document/api/215/15808?from_cn_redirect=1">DescribeSecurityGroups</a>.</p>
     * @param SecurityGroupIds <p>ID of the security group to which the instance belongs, for example, sg-xxxxxxxx. This parameter can be obtained by calling the SecurityGroupId field in the response result of <a href="https://www.tencentcloud.com/document/api/215/15808?from_cn_redirect=1">DescribeSecurityGroups</a>.</p>
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get <p><a href="https://www.tencentcloud.com/document/product/589/35656?from_cn_redirect=1">Bootstrap operation</a> script settings.</p> 
     * @return ScriptBootstrapActionConfig <p><a href="https://www.tencentcloud.com/document/product/589/35656?from_cn_redirect=1">Bootstrap operation</a> script settings.</p>
     */
    public ScriptBootstrapActionConfig [] getScriptBootstrapActionConfig() {
        return this.ScriptBootstrapActionConfig;
    }

    /**
     * Set <p><a href="https://www.tencentcloud.com/document/product/589/35656?from_cn_redirect=1">Bootstrap operation</a> script settings.</p>
     * @param ScriptBootstrapActionConfig <p><a href="https://www.tencentcloud.com/document/product/589/35656?from_cn_redirect=1">Bootstrap operation</a> script settings.</p>
     */
    public void setScriptBootstrapActionConfig(ScriptBootstrapActionConfig [] ScriptBootstrapActionConfig) {
        this.ScriptBootstrapActionConfig = ScriptBootstrapActionConfig;
    }

    /**
     * Get <p>Unique random identifier with a time-to-live of 5 minutes, which needs to be specified by the caller to prevent the client from repeatedly creating resources, for example, a9a90aa6-<strong><strong>-</strong></strong>-****-fae360632808.</p> 
     * @return ClientToken <p>Unique random identifier with a time-to-live of 5 minutes, which needs to be specified by the caller to prevent the client from repeatedly creating resources, for example, a9a90aa6-<strong><strong>-</strong></strong>-****-fae360632808.</p>
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set <p>Unique random identifier with a time-to-live of 5 minutes, which needs to be specified by the caller to prevent the client from repeatedly creating resources, for example, a9a90aa6-<strong><strong>-</strong></strong>-****-fae360632808.</p>
     * @param ClientToken <p>Unique random identifier with a time-to-live of 5 minutes, which needs to be specified by the caller to prevent the client from repeatedly creating resources, for example, a9a90aa6-<strong><strong>-</strong></strong>-****-fae360632808.</p>
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get <p>Whether to enable public network access for the cluster Master node. Valid values:</p><li>NEED_MASTER_WAN: yes</li><li>NOT_NEED_MASTER_WAN: no</li>By default, public network access is enabled for the cluster Master node. 
     * @return NeedMasterWan <p>Whether to enable public network access for the cluster Master node. Valid values:</p><li>NEED_MASTER_WAN: yes</li><li>NOT_NEED_MASTER_WAN: no</li>By default, public network access is enabled for the cluster Master node.
     */
    public String getNeedMasterWan() {
        return this.NeedMasterWan;
    }

    /**
     * Set <p>Whether to enable public network access for the cluster Master node. Valid values:</p><li>NEED_MASTER_WAN: yes</li><li>NOT_NEED_MASTER_WAN: no</li>By default, public network access is enabled for the cluster Master node.
     * @param NeedMasterWan <p>Whether to enable public network access for the cluster Master node. Valid values:</p><li>NEED_MASTER_WAN: yes</li><li>NOT_NEED_MASTER_WAN: no</li>By default, public network access is enabled for the cluster Master node.
     */
    public void setNeedMasterWan(String NeedMasterWan) {
        this.NeedMasterWan = NeedMasterWan;
    }

    /**
     * Get <p>Whether to enable remote login in the public network. (When SecurityGroupId is not empty, this parameter is invalid.) If this parameter is left empty, it is disabled by default. Valid values:</p><li>true: enable</li><li>false: disable</li> 
     * @return EnableRemoteLoginFlag <p>Whether to enable remote login in the public network. (When SecurityGroupId is not empty, this parameter is invalid.) If this parameter is left empty, it is disabled by default. Valid values:</p><li>true: enable</li><li>false: disable</li>
     */
    public Boolean getEnableRemoteLoginFlag() {
        return this.EnableRemoteLoginFlag;
    }

    /**
     * Set <p>Whether to enable remote login in the public network. (When SecurityGroupId is not empty, this parameter is invalid.) If this parameter is left empty, it is disabled by default. Valid values:</p><li>true: enable</li><li>false: disable</li>
     * @param EnableRemoteLoginFlag <p>Whether to enable remote login in the public network. (When SecurityGroupId is not empty, this parameter is invalid.) If this parameter is left empty, it is disabled by default. Valid values:</p><li>true: enable</li><li>false: disable</li>
     */
    public void setEnableRemoteLoginFlag(Boolean EnableRemoteLoginFlag) {
        this.EnableRemoteLoginFlag = EnableRemoteLoginFlag;
    }

    /**
     * Get <p>Whether to enable Kerberos authentication. It is disabled by default. Valid values:</p><li>true: enabled</li><li>false: disabled</li> 
     * @return EnableKerberosFlag <p>Whether to enable Kerberos authentication. It is disabled by default. Valid values:</p><li>true: enabled</li><li>false: disabled</li>
     */
    public Boolean getEnableKerberosFlag() {
        return this.EnableKerberosFlag;
    }

    /**
     * Set <p>Whether to enable Kerberos authentication. It is disabled by default. Valid values:</p><li>true: enabled</li><li>false: disabled</li>
     * @param EnableKerberosFlag <p>Whether to enable Kerberos authentication. It is disabled by default. Valid values:</p><li>true: enabled</li><li>false: disabled</li>
     */
    public void setEnableKerberosFlag(Boolean EnableKerberosFlag) {
        this.EnableKerberosFlag = EnableKerberosFlag;
    }

    /**
     * Get <p><a href="https://www.tencentcloud.com/document/product/589/35655?from_cn_redirect=1?from_cn_redirect=1">Custom software configuration.</a></p> 
     * @return CustomConf <p><a href="https://www.tencentcloud.com/document/product/589/35655?from_cn_redirect=1?from_cn_redirect=1">Custom software configuration.</a></p>
     */
    public String getCustomConf() {
        return this.CustomConf;
    }

    /**
     * Set <p><a href="https://www.tencentcloud.com/document/product/589/35655?from_cn_redirect=1?from_cn_redirect=1">Custom software configuration.</a></p>
     * @param CustomConf <p><a href="https://www.tencentcloud.com/document/product/589/35655?from_cn_redirect=1?from_cn_redirect=1">Custom software configuration.</a></p>
     */
    public void setCustomConf(String CustomConf) {
        this.CustomConf = CustomConf;
    }

    /**
     * Get <p>List of tag descriptions. When this parameter is specified, tags are bound to the corresponding instance.</p> 
     * @return Tags <p>List of tag descriptions. When this parameter is specified, tags are bound to the corresponding instance.</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>List of tag descriptions. When this parameter is specified, tags are bound to the corresponding instance.</p>
     * @param Tags <p>List of tag descriptions. When this parameter is specified, tags are bound to the corresponding instance.</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>List of dispersed placement group IDs. Currently, only one ID can be specified.<br>This parameter can be obtained by calling the DisasterRecoverGroupId field in the response result of <a href="https://www.tencentcloud.com/document/product/213/17810?from_cn_redirect=1">DescribeDisasterRecoverGroups</a>.</p> 
     * @return DisasterRecoverGroupIds <p>List of dispersed placement group IDs. Currently, only one ID can be specified.<br>This parameter can be obtained by calling the DisasterRecoverGroupId field in the response result of <a href="https://www.tencentcloud.com/document/product/213/17810?from_cn_redirect=1">DescribeDisasterRecoverGroups</a>.</p>
     */
    public String [] getDisasterRecoverGroupIds() {
        return this.DisasterRecoverGroupIds;
    }

    /**
     * Set <p>List of dispersed placement group IDs. Currently, only one ID can be specified.<br>This parameter can be obtained by calling the DisasterRecoverGroupId field in the response result of <a href="https://www.tencentcloud.com/document/product/213/17810?from_cn_redirect=1">DescribeDisasterRecoverGroups</a>.</p>
     * @param DisasterRecoverGroupIds <p>List of dispersed placement group IDs. Currently, only one ID can be specified.<br>This parameter can be obtained by calling the DisasterRecoverGroupId field in the response result of <a href="https://www.tencentcloud.com/document/product/213/17810?from_cn_redirect=1">DescribeDisasterRecoverGroups</a>.</p>
     */
    public void setDisasterRecoverGroupIds(String [] DisasterRecoverGroupIds) {
        this.DisasterRecoverGroupIds = DisasterRecoverGroupIds;
    }

    /**
     * Get <p>Whether to enable cluster-level CBS encryption. It is not encrypted by default. Valid values:</p><li>true: encrypted</li><li>false: not encrypted</li> 
     * @return EnableCbsEncryptFlag <p>Whether to enable cluster-level CBS encryption. It is not encrypted by default. Valid values:</p><li>true: encrypted</li><li>false: not encrypted</li>
     */
    public Boolean getEnableCbsEncryptFlag() {
        return this.EnableCbsEncryptFlag;
    }

    /**
     * Set <p>Whether to enable cluster-level CBS encryption. It is not encrypted by default. Valid values:</p><li>true: encrypted</li><li>false: not encrypted</li>
     * @param EnableCbsEncryptFlag <p>Whether to enable cluster-level CBS encryption. It is not encrypted by default. Valid values:</p><li>true: encrypted</li><li>false: not encrypted</li>
     */
    public void setEnableCbsEncryptFlag(Boolean EnableCbsEncryptFlag) {
        this.EnableCbsEncryptFlag = EnableCbsEncryptFlag;
    }

    /**
     * Get <p>MetaDB information. When MetaType is set to EMR_NEW_META, MetaDataJdbcUrl, MetaDataUser, MetaDataPass, and UnifyMetaInstanceId can be left empty.<br>When MetaType is set to EMR_EXIT_META, set UnifyMetaInstanceId.<br>When MetaType is set to USER_CUSTOM_META, set MetaDataJdbcUrl, MetaDataUser, and MetaDataPass.</p> 
     * @return MetaDBInfo <p>MetaDB information. When MetaType is set to EMR_NEW_META, MetaDataJdbcUrl, MetaDataUser, MetaDataPass, and UnifyMetaInstanceId can be left empty.<br>When MetaType is set to EMR_EXIT_META, set UnifyMetaInstanceId.<br>When MetaType is set to USER_CUSTOM_META, set MetaDataJdbcUrl, MetaDataUser, and MetaDataPass.</p>
     */
    public CustomMetaDBInfo getMetaDBInfo() {
        return this.MetaDBInfo;
    }

    /**
     * Set <p>MetaDB information. When MetaType is set to EMR_NEW_META, MetaDataJdbcUrl, MetaDataUser, MetaDataPass, and UnifyMetaInstanceId can be left empty.<br>When MetaType is set to EMR_EXIT_META, set UnifyMetaInstanceId.<br>When MetaType is set to USER_CUSTOM_META, set MetaDataJdbcUrl, MetaDataUser, and MetaDataPass.</p>
     * @param MetaDBInfo <p>MetaDB information. When MetaType is set to EMR_NEW_META, MetaDataJdbcUrl, MetaDataUser, MetaDataPass, and UnifyMetaInstanceId can be left empty.<br>When MetaType is set to EMR_EXIT_META, set UnifyMetaInstanceId.<br>When MetaType is set to USER_CUSTOM_META, set MetaDataJdbcUrl, MetaDataUser, and MetaDataPass.</p>
     */
    public void setMetaDBInfo(CustomMetaDBInfo MetaDBInfo) {
        this.MetaDBInfo = MetaDBInfo;
    }

    /**
     * Get <p>Shared component information.</p> 
     * @return DependService <p>Shared component information.</p>
     */
    public DependService [] getDependService() {
        return this.DependService;
    }

    /**
     * Set <p>Shared component information.</p>
     * @param DependService <p>Shared component information.</p>
     */
    public void setDependService(DependService [] DependService) {
        this.DependService = DependService;
    }

    /**
     * Get <p>Specifications of node resources. Set one for each AZ. The first is the primary AZ, the second is the secondary AZ, and the third is the arbitration AZ. If cross-AZ is disabled, the length only needs to be 1.</p> 
     * @return ZoneResourceConfiguration <p>Specifications of node resources. Set one for each AZ. The first is the primary AZ, the second is the secondary AZ, and the third is the arbitration AZ. If cross-AZ is disabled, the length only needs to be 1.</p>
     */
    public ZoneResourceConfiguration [] getZoneResourceConfiguration() {
        return this.ZoneResourceConfiguration;
    }

    /**
     * Set <p>Specifications of node resources. Set one for each AZ. The first is the primary AZ, the second is the secondary AZ, and the third is the arbitration AZ. If cross-AZ is disabled, the length only needs to be 1.</p>
     * @param ZoneResourceConfiguration <p>Specifications of node resources. Set one for each AZ. The first is the primary AZ, the second is the secondary AZ, and the third is the arbitration AZ. If cross-AZ is disabled, the length only needs to be 1.</p>
     */
    public void setZoneResourceConfiguration(ZoneResourceConfiguration [] ZoneResourceConfiguration) {
        this.ZoneResourceConfiguration = ZoneResourceConfiguration;
    }

    /**
     * Get <p>COS bucket path, which is used when a StarRocks compute-storage separation cluster is created.</p> 
     * @return CosBucket <p>COS bucket path, which is used when a StarRocks compute-storage separation cluster is created.</p>
     */
    public String getCosBucket() {
        return this.CosBucket;
    }

    /**
     * Set <p>COS bucket path, which is used when a StarRocks compute-storage separation cluster is created.</p>
     * @param CosBucket <p>COS bucket path, which is used when a StarRocks compute-storage separation cluster is created.</p>
     */
    public void setCosBucket(String CosBucket) {
        this.CosBucket = CosBucket;
    }

    /**
     * Get <p>Node flag information, which is currently only provided for the Terraform platform.</p> 
     * @return NodeMarks <p>Node flag information, which is currently only provided for the Terraform platform.</p>
     */
    public NodeMark [] getNodeMarks() {
        return this.NodeMarks;
    }

    /**
     * Set <p>Node flag information, which is currently only provided for the Terraform platform.</p>
     * @param NodeMarks <p>Node flag information, which is currently only provided for the Terraform platform.</p>
     */
    public void setNodeMarks(NodeMark [] NodeMarks) {
        this.NodeMarks = NodeMarks;
    }

    /**
     * Get <p>clb id</p> 
     * @return LoadBalancerId <p>clb id</p>
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set <p>clb id</p>
     * @param LoadBalancerId <p>clb id</p>
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get <p>Database version. Valid values: mysql8/tdsql8/mysql5.</p> 
     * @return DefaultMetaVersion <p>Database version. Valid values: mysql8/tdsql8/mysql5.</p>
     */
    public String getDefaultMetaVersion() {
        return this.DefaultMetaVersion;
    }

    /**
     * Set <p>Database version. Valid values: mysql8/tdsql8/mysql5.</p>
     * @param DefaultMetaVersion <p>Database version. Valid values: mysql8/tdsql8/mysql5.</p>
     */
    public void setDefaultMetaVersion(String DefaultMetaVersion) {
        this.DefaultMetaVersion = DefaultMetaVersion;
    }

    /**
     * Get <p>Whether database audit is enabled.</p> 
     * @return NeedCdbAudit <p>Whether database audit is enabled.</p>
     */
    public Long getNeedCdbAudit() {
        return this.NeedCdbAudit;
    }

    /**
     * Set <p>Whether database audit is enabled.</p>
     * @param NeedCdbAudit <p>Whether database audit is enabled.</p>
     */
    public void setNeedCdbAudit(Long NeedCdbAudit) {
        this.NeedCdbAudit = NeedCdbAudit;
    }

    /**
     * Get <p>Source IP address, which is specified in the security group.</p> 
     * @return SgIP <p>Source IP address, which is specified in the security group.</p>
     */
    public String getSgIP() {
        return this.SgIP;
    }

    /**
     * Set <p>Source IP address, which is specified in the security group.</p>
     * @param SgIP <p>Source IP address, which is specified in the security group.</p>
     */
    public void setSgIP(String SgIP) {
        this.SgIP = SgIP;
    }

    /**
     * Get <p>Partition of a partition placement group.</p> 
     * @return PartitionNumber <p>Partition of a partition placement group.</p>
     */
    public Long getPartitionNumber() {
        return this.PartitionNumber;
    }

    /**
     * Set <p>Partition of a partition placement group.</p>
     * @param PartitionNumber <p>Partition of a partition placement group.</p>
     */
    public void setPartitionNumber(Long PartitionNumber) {
        this.PartitionNumber = PartitionNumber;
    }

    /**
     * Get <p>Service UI address.</p><p>Enumeration values:</p><ul><li>0: Service UI address. Only one service UI address is returned.</li><li>1: Service UI address. If the service has multiple UI addresses, all results are returned, such as Impalad, StateStore, and Catalogd of Impala.</li></ul><p>Default value: 0.</p> 
     * @return WebUiVersion <p>Service UI address.</p><p>Enumeration values:</p><ul><li>0: Service UI address. Only one service UI address is returned.</li><li>1: Service UI address. If the service has multiple UI addresses, all results are returned, such as Impalad, StateStore, and Catalogd of Impala.</li></ul><p>Default value: 0.</p>
     */
    public Long getWebUiVersion() {
        return this.WebUiVersion;
    }

    /**
     * Set <p>Service UI address.</p><p>Enumeration values:</p><ul><li>0: Service UI address. Only one service UI address is returned.</li><li>1: Service UI address. If the service has multiple UI addresses, all results are returned, such as Impalad, StateStore, and Catalogd of Impala.</li></ul><p>Default value: 0.</p>
     * @param WebUiVersion <p>Service UI address.</p><p>Enumeration values:</p><ul><li>0: Service UI address. Only one service UI address is returned.</li><li>1: Service UI address. If the service has multiple UI addresses, all results are returned, such as Impalad, StateStore, and Catalogd of Impala.</li></ul><p>Default value: 0.</p>
     */
    public void setWebUiVersion(Long WebUiVersion) {
        this.WebUiVersion = WebUiVersion;
    }

    /**
     * Get <p>Whether the system disk is encrypted.</p> 
     * @return EnableCbsSysEncryptFlag <p>Whether the system disk is encrypted.</p>
     */
    public Boolean getEnableCbsSysEncryptFlag() {
        return this.EnableCbsSysEncryptFlag;
    }

    /**
     * Set <p>Whether the system disk is encrypted.</p>
     * @param EnableCbsSysEncryptFlag <p>Whether the system disk is encrypted.</p>
     */
    public void setEnableCbsSysEncryptFlag(Boolean EnableCbsSysEncryptFlag) {
        this.EnableCbsSysEncryptFlag = EnableCbsSysEncryptFlag;
    }

    /**
     * Get <p>Custom MetaDB data.</p> 
     * @return MetaDBGroupInfo <p>Custom MetaDB data.</p>
     */
    public CustomMetaDBInfo [] getMetaDBGroupInfo() {
        return this.MetaDBGroupInfo;
    }

    /**
     * Set <p>Custom MetaDB data.</p>
     * @param MetaDBGroupInfo <p>Custom MetaDB data.</p>
     */
    public void setMetaDBGroupInfo(CustomMetaDBInfo [] MetaDBGroupInfo) {
        this.MetaDBGroupInfo = MetaDBGroupInfo;
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
        if (source.DefaultMetaVersion != null) {
            this.DefaultMetaVersion = new String(source.DefaultMetaVersion);
        }
        if (source.NeedCdbAudit != null) {
            this.NeedCdbAudit = new Long(source.NeedCdbAudit);
        }
        if (source.SgIP != null) {
            this.SgIP = new String(source.SgIP);
        }
        if (source.PartitionNumber != null) {
            this.PartitionNumber = new Long(source.PartitionNumber);
        }
        if (source.WebUiVersion != null) {
            this.WebUiVersion = new Long(source.WebUiVersion);
        }
        if (source.EnableCbsSysEncryptFlag != null) {
            this.EnableCbsSysEncryptFlag = new Boolean(source.EnableCbsSysEncryptFlag);
        }
        if (source.MetaDBGroupInfo != null) {
            this.MetaDBGroupInfo = new CustomMetaDBInfo[source.MetaDBGroupInfo.length];
            for (int i = 0; i < source.MetaDBGroupInfo.length; i++) {
                this.MetaDBGroupInfo[i] = new CustomMetaDBInfo(source.MetaDBGroupInfo[i]);
            }
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
        this.setParamSimple(map, prefix + "DefaultMetaVersion", this.DefaultMetaVersion);
        this.setParamSimple(map, prefix + "NeedCdbAudit", this.NeedCdbAudit);
        this.setParamSimple(map, prefix + "SgIP", this.SgIP);
        this.setParamSimple(map, prefix + "PartitionNumber", this.PartitionNumber);
        this.setParamSimple(map, prefix + "WebUiVersion", this.WebUiVersion);
        this.setParamSimple(map, prefix + "EnableCbsSysEncryptFlag", this.EnableCbsSysEncryptFlag);
        this.setParamArrayObj(map, prefix + "MetaDBGroupInfo.", this.MetaDBGroupInfo);

    }
}

