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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateInstanceRequest extends AbstractModel{

    /**
    * Product ID. Different product IDs represent different EMR product versions. Valid values:
<li>1: EMR v1.3.1</li>
<li>2: EMR v2.0.1</li>
<li>4: EMR v2.1.0</li>
<li>7: EMR v3.0.0</li>
<li>9: EMR v2.2.0</li>
<li>11: ClickHouse v1.0.0</li>
<li>13: Druid v1.0.0</li>
<li>15: EMR v2.2.1</li>
<li>16: EMR v2.3.0</li>
<li>17: ClickHouse v1.1.0</li>
<li>19: EMR v2.4.0</li>
<li>20: EMR v2.5.0</li>
<li>22: ClickHouse v1.2.0</li>
<li>24: EMR TianQiong v1.0.0</li>
<li>25: EMR v3.1.0</li>
<li>26: Doris v1.0.0</li>
<li>27: Kafka v1.0.0</li>
<li>28: EMR v3.2.0</li>
<li>29: EMR v2.5.1</li>
<li>30: EMR v2.6.0</li>
    */
    @SerializedName("ProductId")
    @Expose
    private Long ProductId;

    /**
    * Configuration information of VPC. This parameter is used to specify the VPC ID, subnet ID, etc.
    */
    @SerializedName("VPCSettings")
    @Expose
    private VPCSettings VPCSettings;

    /**
    * List of deployed components. The list of component options varies by EMR product ID (i.e., `ProductId`; for specific meanings, please see the `ProductId` input parameter). For more information, please see [Component Version](https://intl.cloud.tencent.com/document/product/589/20279?from_cn_redirect=1).
Enter an instance value: `hive` or `flink`.
    */
    @SerializedName("Software")
    @Expose
    private String [] Software;

    /**
    * Node resource specification.
    */
    @SerializedName("ResourceSpec")
    @Expose
    private NewResourceSpec ResourceSpec;

    /**
    * Whether to enable high node availability. Valid values:
<li>0: does not enable high availability of node.</li>
<li>1: enables high availability of node.</li>
    */
    @SerializedName("SupportHA")
    @Expose
    private Long SupportHA;

    /**
    * Instance name.
<li>Length limit: 6-36 characters.</li>
<li>Only letters, numbers, dashes (-), and underscores (_) are supported.</li>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Instance billing mode. Valid values:
<li>0: pay-as-you-go.</li>
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * Instance location. This parameter is used to specify the AZ, project, and other attributes of the instance.
    */
    @SerializedName("Placement")
    @Expose
    private Placement Placement;

    /**
    * Purchase duration of instance, which needs to be used together with `TimeUnit`.
<li>When `TimeUnit` is `s`, this parameter can only be filled with 3600, indicating a pay-as-you-go instance.</li>
<li>When `TimeUnit` is `m`, the number entered in this parameter indicates the purchase duration of the monthly-subscription instance; for example, 1 means one month</li>
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * Time unit of instance purchase duration. Valid values:
<li>s: seconds. When `PayMode` is 0, `TimeUnit` can only be `s`.</li>
<li>m: month. When `PayMode` is 1, `TimeUnit` can only be `m`.</li>
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * Instance login settings. This parameter allows you to set the login password or key for your purchased node.
<li>If the key is set, the password will be only used for login to the native component WebUI.</li>
<li>If the key is not set, the password will be used for login to all purchased nodes and the native component WebUI.</li>
    */
    @SerializedName("LoginSettings")
    @Expose
    private LoginSettings LoginSettings;

    /**
    * Parameter required for enabling COS access.
    */
    @SerializedName("COSSettings")
    @Expose
    private COSSettings COSSettings;

    /**
    * Security group to which an instance belongs in the format of `sg-xxxxxxxx`. This parameter can be obtained from the `SecurityGroupId` field in the return value of the [DescribeSecurityGroups](https://intl.cloud.tencent.com/document/api/215/15808) API.
    */
    @SerializedName("SgId")
    @Expose
    private String SgId;

    /**
    * [Bootstrap action](https://intl.cloud.tencent.com/document/product/589/35656?from_cn_redirect=1) script settings
    */
    @SerializedName("PreExecutedFileSettings")
    @Expose
    private PreExecuteFileSettings [] PreExecutedFileSettings;

    /**
    * Whether auto-renewal is enabled. Valid values:
<li>0: auto-renewal not enabled.</li>
<li>1: auto-renewal enabled.</li>
    */
    @SerializedName("AutoRenew")
    @Expose
    private Long AutoRenew;

    /**
    * Client token.
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * Whether to enable public IP access for master node. Valid values:
<li>NEED_MASTER_WAN: enables public IP for master node.</li>
<li>NOT_NEED_MASTER_WAN: does not enable.</li>Public IP is enabled for master node by default.
    */
    @SerializedName("NeedMasterWan")
    @Expose
    private String NeedMasterWan;

    /**
    * Whether to enable remote public network login, i.e., port 22. When `SgId` is not empty, this parameter does not take effect.
    */
    @SerializedName("RemoteLoginAtCreate")
    @Expose
    private Long RemoteLoginAtCreate;

    /**
    * Whether to enable secure cluster. 0: no; other values: yes.
    */
    @SerializedName("CheckSecurity")
    @Expose
    private Long CheckSecurity;

    /**
    * Accesses to external file system.
    */
    @SerializedName("ExtendFsField")
    @Expose
    private String ExtendFsField;

    /**
    * Tag description list. This parameter is used to bind a tag to a resource instance.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * List of spread placement group IDs. Only one can be specified currently.
This parameter can be obtained in the `SecurityGroupId` field in the return value of the [DescribeSecurityGroups](https://intl.cloud.tencent.com/document/product/213/15486?from_cn_redirect=1) API.
    */
    @SerializedName("DisasterRecoverGroupIds")
    @Expose
    private String [] DisasterRecoverGroupIds;

    /**
    * CBS disk encryption at the cluster level. 0: not encrypted, 1: encrypted
    */
    @SerializedName("CbsEncrypt")
    @Expose
    private Long CbsEncrypt;

    /**
    * Hive-shared metadatabase type. Valid values:
<li>EMR_DEFAULT_META: the cluster creates one by default.</li>
<li>EMR_EXIST_META: the cluster uses the specified EMR-MetaDB instance.</li>
<li>USER_CUSTOM_META: the cluster uses a custom MetaDB instance.</li>
    */
    @SerializedName("MetaType")
    @Expose
    private String MetaType;

    /**
    * EMR-MetaDB instance
    */
    @SerializedName("UnifyMetaInstanceId")
    @Expose
    private String UnifyMetaInstanceId;

    /**
    * Custom MetaDB instance information
    */
    @SerializedName("MetaDBInfo")
    @Expose
    private CustomMetaInfo MetaDBInfo;

    /**
    * Custom application role.
    */
    @SerializedName("ApplicationRole")
    @Expose
    private String ApplicationRole;

    /**
    * Scenario-based values:
Hadoop-Kudu
Hadoop-Zookeeper
Hadoop-Presto
Hadoop-Hbase
    */
    @SerializedName("SceneName")
    @Expose
    private String SceneName;

    /**
     * Get Product ID. Different product IDs represent different EMR product versions. Valid values:
<li>1: EMR v1.3.1</li>
<li>2: EMR v2.0.1</li>
<li>4: EMR v2.1.0</li>
<li>7: EMR v3.0.0</li>
<li>9: EMR v2.2.0</li>
<li>11: ClickHouse v1.0.0</li>
<li>13: Druid v1.0.0</li>
<li>15: EMR v2.2.1</li>
<li>16: EMR v2.3.0</li>
<li>17: ClickHouse v1.1.0</li>
<li>19: EMR v2.4.0</li>
<li>20: EMR v2.5.0</li>
<li>22: ClickHouse v1.2.0</li>
<li>24: EMR TianQiong v1.0.0</li>
<li>25: EMR v3.1.0</li>
<li>26: Doris v1.0.0</li>
<li>27: Kafka v1.0.0</li>
<li>28: EMR v3.2.0</li>
<li>29: EMR v2.5.1</li>
<li>30: EMR v2.6.0</li> 
     * @return ProductId Product ID. Different product IDs represent different EMR product versions. Valid values:
<li>1: EMR v1.3.1</li>
<li>2: EMR v2.0.1</li>
<li>4: EMR v2.1.0</li>
<li>7: EMR v3.0.0</li>
<li>9: EMR v2.2.0</li>
<li>11: ClickHouse v1.0.0</li>
<li>13: Druid v1.0.0</li>
<li>15: EMR v2.2.1</li>
<li>16: EMR v2.3.0</li>
<li>17: ClickHouse v1.1.0</li>
<li>19: EMR v2.4.0</li>
<li>20: EMR v2.5.0</li>
<li>22: ClickHouse v1.2.0</li>
<li>24: EMR TianQiong v1.0.0</li>
<li>25: EMR v3.1.0</li>
<li>26: Doris v1.0.0</li>
<li>27: Kafka v1.0.0</li>
<li>28: EMR v3.2.0</li>
<li>29: EMR v2.5.1</li>
<li>30: EMR v2.6.0</li>
     */
    public Long getProductId() {
        return this.ProductId;
    }

    /**
     * Set Product ID. Different product IDs represent different EMR product versions. Valid values:
<li>1: EMR v1.3.1</li>
<li>2: EMR v2.0.1</li>
<li>4: EMR v2.1.0</li>
<li>7: EMR v3.0.0</li>
<li>9: EMR v2.2.0</li>
<li>11: ClickHouse v1.0.0</li>
<li>13: Druid v1.0.0</li>
<li>15: EMR v2.2.1</li>
<li>16: EMR v2.3.0</li>
<li>17: ClickHouse v1.1.0</li>
<li>19: EMR v2.4.0</li>
<li>20: EMR v2.5.0</li>
<li>22: ClickHouse v1.2.0</li>
<li>24: EMR TianQiong v1.0.0</li>
<li>25: EMR v3.1.0</li>
<li>26: Doris v1.0.0</li>
<li>27: Kafka v1.0.0</li>
<li>28: EMR v3.2.0</li>
<li>29: EMR v2.5.1</li>
<li>30: EMR v2.6.0</li>
     * @param ProductId Product ID. Different product IDs represent different EMR product versions. Valid values:
<li>1: EMR v1.3.1</li>
<li>2: EMR v2.0.1</li>
<li>4: EMR v2.1.0</li>
<li>7: EMR v3.0.0</li>
<li>9: EMR v2.2.0</li>
<li>11: ClickHouse v1.0.0</li>
<li>13: Druid v1.0.0</li>
<li>15: EMR v2.2.1</li>
<li>16: EMR v2.3.0</li>
<li>17: ClickHouse v1.1.0</li>
<li>19: EMR v2.4.0</li>
<li>20: EMR v2.5.0</li>
<li>22: ClickHouse v1.2.0</li>
<li>24: EMR TianQiong v1.0.0</li>
<li>25: EMR v3.1.0</li>
<li>26: Doris v1.0.0</li>
<li>27: Kafka v1.0.0</li>
<li>28: EMR v3.2.0</li>
<li>29: EMR v2.5.1</li>
<li>30: EMR v2.6.0</li>
     */
    public void setProductId(Long ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get Configuration information of VPC. This parameter is used to specify the VPC ID, subnet ID, etc. 
     * @return VPCSettings Configuration information of VPC. This parameter is used to specify the VPC ID, subnet ID, etc.
     */
    public VPCSettings getVPCSettings() {
        return this.VPCSettings;
    }

    /**
     * Set Configuration information of VPC. This parameter is used to specify the VPC ID, subnet ID, etc.
     * @param VPCSettings Configuration information of VPC. This parameter is used to specify the VPC ID, subnet ID, etc.
     */
    public void setVPCSettings(VPCSettings VPCSettings) {
        this.VPCSettings = VPCSettings;
    }

    /**
     * Get List of deployed components. The list of component options varies by EMR product ID (i.e., `ProductId`; for specific meanings, please see the `ProductId` input parameter). For more information, please see [Component Version](https://intl.cloud.tencent.com/document/product/589/20279?from_cn_redirect=1).
Enter an instance value: `hive` or `flink`. 
     * @return Software List of deployed components. The list of component options varies by EMR product ID (i.e., `ProductId`; for specific meanings, please see the `ProductId` input parameter). For more information, please see [Component Version](https://intl.cloud.tencent.com/document/product/589/20279?from_cn_redirect=1).
Enter an instance value: `hive` or `flink`.
     */
    public String [] getSoftware() {
        return this.Software;
    }

    /**
     * Set List of deployed components. The list of component options varies by EMR product ID (i.e., `ProductId`; for specific meanings, please see the `ProductId` input parameter). For more information, please see [Component Version](https://intl.cloud.tencent.com/document/product/589/20279?from_cn_redirect=1).
Enter an instance value: `hive` or `flink`.
     * @param Software List of deployed components. The list of component options varies by EMR product ID (i.e., `ProductId`; for specific meanings, please see the `ProductId` input parameter). For more information, please see [Component Version](https://intl.cloud.tencent.com/document/product/589/20279?from_cn_redirect=1).
Enter an instance value: `hive` or `flink`.
     */
    public void setSoftware(String [] Software) {
        this.Software = Software;
    }

    /**
     * Get Node resource specification. 
     * @return ResourceSpec Node resource specification.
     */
    public NewResourceSpec getResourceSpec() {
        return this.ResourceSpec;
    }

    /**
     * Set Node resource specification.
     * @param ResourceSpec Node resource specification.
     */
    public void setResourceSpec(NewResourceSpec ResourceSpec) {
        this.ResourceSpec = ResourceSpec;
    }

    /**
     * Get Whether to enable high node availability. Valid values:
<li>0: does not enable high availability of node.</li>
<li>1: enables high availability of node.</li> 
     * @return SupportHA Whether to enable high node availability. Valid values:
<li>0: does not enable high availability of node.</li>
<li>1: enables high availability of node.</li>
     */
    public Long getSupportHA() {
        return this.SupportHA;
    }

    /**
     * Set Whether to enable high node availability. Valid values:
<li>0: does not enable high availability of node.</li>
<li>1: enables high availability of node.</li>
     * @param SupportHA Whether to enable high node availability. Valid values:
<li>0: does not enable high availability of node.</li>
<li>1: enables high availability of node.</li>
     */
    public void setSupportHA(Long SupportHA) {
        this.SupportHA = SupportHA;
    }

    /**
     * Get Instance name.
<li>Length limit: 6-36 characters.</li>
<li>Only letters, numbers, dashes (-), and underscores (_) are supported.</li> 
     * @return InstanceName Instance name.
<li>Length limit: 6-36 characters.</li>
<li>Only letters, numbers, dashes (-), and underscores (_) are supported.</li>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name.
<li>Length limit: 6-36 characters.</li>
<li>Only letters, numbers, dashes (-), and underscores (_) are supported.</li>
     * @param InstanceName Instance name.
<li>Length limit: 6-36 characters.</li>
<li>Only letters, numbers, dashes (-), and underscores (_) are supported.</li>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Instance billing mode. Valid values:
<li>0: pay-as-you-go.</li> 
     * @return PayMode Instance billing mode. Valid values:
<li>0: pay-as-you-go.</li>
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Instance billing mode. Valid values:
<li>0: pay-as-you-go.</li>
     * @param PayMode Instance billing mode. Valid values:
<li>0: pay-as-you-go.</li>
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Instance location. This parameter is used to specify the AZ, project, and other attributes of the instance. 
     * @return Placement Instance location. This parameter is used to specify the AZ, project, and other attributes of the instance.
     */
    public Placement getPlacement() {
        return this.Placement;
    }

    /**
     * Set Instance location. This parameter is used to specify the AZ, project, and other attributes of the instance.
     * @param Placement Instance location. This parameter is used to specify the AZ, project, and other attributes of the instance.
     */
    public void setPlacement(Placement Placement) {
        this.Placement = Placement;
    }

    /**
     * Get Purchase duration of instance, which needs to be used together with `TimeUnit`.
<li>When `TimeUnit` is `s`, this parameter can only be filled with 3600, indicating a pay-as-you-go instance.</li>
<li>When `TimeUnit` is `m`, the number entered in this parameter indicates the purchase duration of the monthly-subscription instance; for example, 1 means one month</li> 
     * @return TimeSpan Purchase duration of instance, which needs to be used together with `TimeUnit`.
<li>When `TimeUnit` is `s`, this parameter can only be filled with 3600, indicating a pay-as-you-go instance.</li>
<li>When `TimeUnit` is `m`, the number entered in this parameter indicates the purchase duration of the monthly-subscription instance; for example, 1 means one month</li>
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set Purchase duration of instance, which needs to be used together with `TimeUnit`.
<li>When `TimeUnit` is `s`, this parameter can only be filled with 3600, indicating a pay-as-you-go instance.</li>
<li>When `TimeUnit` is `m`, the number entered in this parameter indicates the purchase duration of the monthly-subscription instance; for example, 1 means one month</li>
     * @param TimeSpan Purchase duration of instance, which needs to be used together with `TimeUnit`.
<li>When `TimeUnit` is `s`, this parameter can only be filled with 3600, indicating a pay-as-you-go instance.</li>
<li>When `TimeUnit` is `m`, the number entered in this parameter indicates the purchase duration of the monthly-subscription instance; for example, 1 means one month</li>
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get Time unit of instance purchase duration. Valid values:
<li>s: seconds. When `PayMode` is 0, `TimeUnit` can only be `s`.</li>
<li>m: month. When `PayMode` is 1, `TimeUnit` can only be `m`.</li> 
     * @return TimeUnit Time unit of instance purchase duration. Valid values:
<li>s: seconds. When `PayMode` is 0, `TimeUnit` can only be `s`.</li>
<li>m: month. When `PayMode` is 1, `TimeUnit` can only be `m`.</li>
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set Time unit of instance purchase duration. Valid values:
<li>s: seconds. When `PayMode` is 0, `TimeUnit` can only be `s`.</li>
<li>m: month. When `PayMode` is 1, `TimeUnit` can only be `m`.</li>
     * @param TimeUnit Time unit of instance purchase duration. Valid values:
<li>s: seconds. When `PayMode` is 0, `TimeUnit` can only be `s`.</li>
<li>m: month. When `PayMode` is 1, `TimeUnit` can only be `m`.</li>
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get Instance login settings. This parameter allows you to set the login password or key for your purchased node.
<li>If the key is set, the password will be only used for login to the native component WebUI.</li>
<li>If the key is not set, the password will be used for login to all purchased nodes and the native component WebUI.</li> 
     * @return LoginSettings Instance login settings. This parameter allows you to set the login password or key for your purchased node.
<li>If the key is set, the password will be only used for login to the native component WebUI.</li>
<li>If the key is not set, the password will be used for login to all purchased nodes and the native component WebUI.</li>
     */
    public LoginSettings getLoginSettings() {
        return this.LoginSettings;
    }

    /**
     * Set Instance login settings. This parameter allows you to set the login password or key for your purchased node.
<li>If the key is set, the password will be only used for login to the native component WebUI.</li>
<li>If the key is not set, the password will be used for login to all purchased nodes and the native component WebUI.</li>
     * @param LoginSettings Instance login settings. This parameter allows you to set the login password or key for your purchased node.
<li>If the key is set, the password will be only used for login to the native component WebUI.</li>
<li>If the key is not set, the password will be used for login to all purchased nodes and the native component WebUI.</li>
     */
    public void setLoginSettings(LoginSettings LoginSettings) {
        this.LoginSettings = LoginSettings;
    }

    /**
     * Get Parameter required for enabling COS access. 
     * @return COSSettings Parameter required for enabling COS access.
     */
    public COSSettings getCOSSettings() {
        return this.COSSettings;
    }

    /**
     * Set Parameter required for enabling COS access.
     * @param COSSettings Parameter required for enabling COS access.
     */
    public void setCOSSettings(COSSettings COSSettings) {
        this.COSSettings = COSSettings;
    }

    /**
     * Get Security group to which an instance belongs in the format of `sg-xxxxxxxx`. This parameter can be obtained from the `SecurityGroupId` field in the return value of the [DescribeSecurityGroups](https://intl.cloud.tencent.com/document/api/215/15808) API. 
     * @return SgId Security group to which an instance belongs in the format of `sg-xxxxxxxx`. This parameter can be obtained from the `SecurityGroupId` field in the return value of the [DescribeSecurityGroups](https://intl.cloud.tencent.com/document/api/215/15808) API.
     */
    public String getSgId() {
        return this.SgId;
    }

    /**
     * Set Security group to which an instance belongs in the format of `sg-xxxxxxxx`. This parameter can be obtained from the `SecurityGroupId` field in the return value of the [DescribeSecurityGroups](https://intl.cloud.tencent.com/document/api/215/15808) API.
     * @param SgId Security group to which an instance belongs in the format of `sg-xxxxxxxx`. This parameter can be obtained from the `SecurityGroupId` field in the return value of the [DescribeSecurityGroups](https://intl.cloud.tencent.com/document/api/215/15808) API.
     */
    public void setSgId(String SgId) {
        this.SgId = SgId;
    }

    /**
     * Get [Bootstrap action](https://intl.cloud.tencent.com/document/product/589/35656?from_cn_redirect=1) script settings 
     * @return PreExecutedFileSettings [Bootstrap action](https://intl.cloud.tencent.com/document/product/589/35656?from_cn_redirect=1) script settings
     */
    public PreExecuteFileSettings [] getPreExecutedFileSettings() {
        return this.PreExecutedFileSettings;
    }

    /**
     * Set [Bootstrap action](https://intl.cloud.tencent.com/document/product/589/35656?from_cn_redirect=1) script settings
     * @param PreExecutedFileSettings [Bootstrap action](https://intl.cloud.tencent.com/document/product/589/35656?from_cn_redirect=1) script settings
     */
    public void setPreExecutedFileSettings(PreExecuteFileSettings [] PreExecutedFileSettings) {
        this.PreExecutedFileSettings = PreExecutedFileSettings;
    }

    /**
     * Get Whether auto-renewal is enabled. Valid values:
<li>0: auto-renewal not enabled.</li>
<li>1: auto-renewal enabled.</li> 
     * @return AutoRenew Whether auto-renewal is enabled. Valid values:
<li>0: auto-renewal not enabled.</li>
<li>1: auto-renewal enabled.</li>
     */
    public Long getAutoRenew() {
        return this.AutoRenew;
    }

    /**
     * Set Whether auto-renewal is enabled. Valid values:
<li>0: auto-renewal not enabled.</li>
<li>1: auto-renewal enabled.</li>
     * @param AutoRenew Whether auto-renewal is enabled. Valid values:
<li>0: auto-renewal not enabled.</li>
<li>1: auto-renewal enabled.</li>
     */
    public void setAutoRenew(Long AutoRenew) {
        this.AutoRenew = AutoRenew;
    }

    /**
     * Get Client token. 
     * @return ClientToken Client token.
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set Client token.
     * @param ClientToken Client token.
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get Whether to enable public IP access for master node. Valid values:
<li>NEED_MASTER_WAN: enables public IP for master node.</li>
<li>NOT_NEED_MASTER_WAN: does not enable.</li>Public IP is enabled for master node by default. 
     * @return NeedMasterWan Whether to enable public IP access for master node. Valid values:
<li>NEED_MASTER_WAN: enables public IP for master node.</li>
<li>NOT_NEED_MASTER_WAN: does not enable.</li>Public IP is enabled for master node by default.
     */
    public String getNeedMasterWan() {
        return this.NeedMasterWan;
    }

    /**
     * Set Whether to enable public IP access for master node. Valid values:
<li>NEED_MASTER_WAN: enables public IP for master node.</li>
<li>NOT_NEED_MASTER_WAN: does not enable.</li>Public IP is enabled for master node by default.
     * @param NeedMasterWan Whether to enable public IP access for master node. Valid values:
<li>NEED_MASTER_WAN: enables public IP for master node.</li>
<li>NOT_NEED_MASTER_WAN: does not enable.</li>Public IP is enabled for master node by default.
     */
    public void setNeedMasterWan(String NeedMasterWan) {
        this.NeedMasterWan = NeedMasterWan;
    }

    /**
     * Get Whether to enable remote public network login, i.e., port 22. When `SgId` is not empty, this parameter does not take effect. 
     * @return RemoteLoginAtCreate Whether to enable remote public network login, i.e., port 22. When `SgId` is not empty, this parameter does not take effect.
     */
    public Long getRemoteLoginAtCreate() {
        return this.RemoteLoginAtCreate;
    }

    /**
     * Set Whether to enable remote public network login, i.e., port 22. When `SgId` is not empty, this parameter does not take effect.
     * @param RemoteLoginAtCreate Whether to enable remote public network login, i.e., port 22. When `SgId` is not empty, this parameter does not take effect.
     */
    public void setRemoteLoginAtCreate(Long RemoteLoginAtCreate) {
        this.RemoteLoginAtCreate = RemoteLoginAtCreate;
    }

    /**
     * Get Whether to enable secure cluster. 0: no; other values: yes. 
     * @return CheckSecurity Whether to enable secure cluster. 0: no; other values: yes.
     */
    public Long getCheckSecurity() {
        return this.CheckSecurity;
    }

    /**
     * Set Whether to enable secure cluster. 0: no; other values: yes.
     * @param CheckSecurity Whether to enable secure cluster. 0: no; other values: yes.
     */
    public void setCheckSecurity(Long CheckSecurity) {
        this.CheckSecurity = CheckSecurity;
    }

    /**
     * Get Accesses to external file system. 
     * @return ExtendFsField Accesses to external file system.
     */
    public String getExtendFsField() {
        return this.ExtendFsField;
    }

    /**
     * Set Accesses to external file system.
     * @param ExtendFsField Accesses to external file system.
     */
    public void setExtendFsField(String ExtendFsField) {
        this.ExtendFsField = ExtendFsField;
    }

    /**
     * Get Tag description list. This parameter is used to bind a tag to a resource instance. 
     * @return Tags Tag description list. This parameter is used to bind a tag to a resource instance.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag description list. This parameter is used to bind a tag to a resource instance.
     * @param Tags Tag description list. This parameter is used to bind a tag to a resource instance.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get List of spread placement group IDs. Only one can be specified currently.
This parameter can be obtained in the `SecurityGroupId` field in the return value of the [DescribeSecurityGroups](https://intl.cloud.tencent.com/document/product/213/15486?from_cn_redirect=1) API. 
     * @return DisasterRecoverGroupIds List of spread placement group IDs. Only one can be specified currently.
This parameter can be obtained in the `SecurityGroupId` field in the return value of the [DescribeSecurityGroups](https://intl.cloud.tencent.com/document/product/213/15486?from_cn_redirect=1) API.
     */
    public String [] getDisasterRecoverGroupIds() {
        return this.DisasterRecoverGroupIds;
    }

    /**
     * Set List of spread placement group IDs. Only one can be specified currently.
This parameter can be obtained in the `SecurityGroupId` field in the return value of the [DescribeSecurityGroups](https://intl.cloud.tencent.com/document/product/213/15486?from_cn_redirect=1) API.
     * @param DisasterRecoverGroupIds List of spread placement group IDs. Only one can be specified currently.
This parameter can be obtained in the `SecurityGroupId` field in the return value of the [DescribeSecurityGroups](https://intl.cloud.tencent.com/document/product/213/15486?from_cn_redirect=1) API.
     */
    public void setDisasterRecoverGroupIds(String [] DisasterRecoverGroupIds) {
        this.DisasterRecoverGroupIds = DisasterRecoverGroupIds;
    }

    /**
     * Get CBS disk encryption at the cluster level. 0: not encrypted, 1: encrypted 
     * @return CbsEncrypt CBS disk encryption at the cluster level. 0: not encrypted, 1: encrypted
     */
    public Long getCbsEncrypt() {
        return this.CbsEncrypt;
    }

    /**
     * Set CBS disk encryption at the cluster level. 0: not encrypted, 1: encrypted
     * @param CbsEncrypt CBS disk encryption at the cluster level. 0: not encrypted, 1: encrypted
     */
    public void setCbsEncrypt(Long CbsEncrypt) {
        this.CbsEncrypt = CbsEncrypt;
    }

    /**
     * Get Hive-shared metadatabase type. Valid values:
<li>EMR_DEFAULT_META: the cluster creates one by default.</li>
<li>EMR_EXIST_META: the cluster uses the specified EMR-MetaDB instance.</li>
<li>USER_CUSTOM_META: the cluster uses a custom MetaDB instance.</li> 
     * @return MetaType Hive-shared metadatabase type. Valid values:
<li>EMR_DEFAULT_META: the cluster creates one by default.</li>
<li>EMR_EXIST_META: the cluster uses the specified EMR-MetaDB instance.</li>
<li>USER_CUSTOM_META: the cluster uses a custom MetaDB instance.</li>
     */
    public String getMetaType() {
        return this.MetaType;
    }

    /**
     * Set Hive-shared metadatabase type. Valid values:
<li>EMR_DEFAULT_META: the cluster creates one by default.</li>
<li>EMR_EXIST_META: the cluster uses the specified EMR-MetaDB instance.</li>
<li>USER_CUSTOM_META: the cluster uses a custom MetaDB instance.</li>
     * @param MetaType Hive-shared metadatabase type. Valid values:
<li>EMR_DEFAULT_META: the cluster creates one by default.</li>
<li>EMR_EXIST_META: the cluster uses the specified EMR-MetaDB instance.</li>
<li>USER_CUSTOM_META: the cluster uses a custom MetaDB instance.</li>
     */
    public void setMetaType(String MetaType) {
        this.MetaType = MetaType;
    }

    /**
     * Get EMR-MetaDB instance 
     * @return UnifyMetaInstanceId EMR-MetaDB instance
     */
    public String getUnifyMetaInstanceId() {
        return this.UnifyMetaInstanceId;
    }

    /**
     * Set EMR-MetaDB instance
     * @param UnifyMetaInstanceId EMR-MetaDB instance
     */
    public void setUnifyMetaInstanceId(String UnifyMetaInstanceId) {
        this.UnifyMetaInstanceId = UnifyMetaInstanceId;
    }

    /**
     * Get Custom MetaDB instance information 
     * @return MetaDBInfo Custom MetaDB instance information
     */
    public CustomMetaInfo getMetaDBInfo() {
        return this.MetaDBInfo;
    }

    /**
     * Set Custom MetaDB instance information
     * @param MetaDBInfo Custom MetaDB instance information
     */
    public void setMetaDBInfo(CustomMetaInfo MetaDBInfo) {
        this.MetaDBInfo = MetaDBInfo;
    }

    /**
     * Get Custom application role. 
     * @return ApplicationRole Custom application role.
     */
    public String getApplicationRole() {
        return this.ApplicationRole;
    }

    /**
     * Set Custom application role.
     * @param ApplicationRole Custom application role.
     */
    public void setApplicationRole(String ApplicationRole) {
        this.ApplicationRole = ApplicationRole;
    }

    /**
     * Get Scenario-based values:
Hadoop-Kudu
Hadoop-Zookeeper
Hadoop-Presto
Hadoop-Hbase 
     * @return SceneName Scenario-based values:
Hadoop-Kudu
Hadoop-Zookeeper
Hadoop-Presto
Hadoop-Hbase
     */
    public String getSceneName() {
        return this.SceneName;
    }

    /**
     * Set Scenario-based values:
Hadoop-Kudu
Hadoop-Zookeeper
Hadoop-Presto
Hadoop-Hbase
     * @param SceneName Scenario-based values:
Hadoop-Kudu
Hadoop-Zookeeper
Hadoop-Presto
Hadoop-Hbase
     */
    public void setSceneName(String SceneName) {
        this.SceneName = SceneName;
    }

    public CreateInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateInstanceRequest(CreateInstanceRequest source) {
        if (source.ProductId != null) {
            this.ProductId = new Long(source.ProductId);
        }
        if (source.VPCSettings != null) {
            this.VPCSettings = new VPCSettings(source.VPCSettings);
        }
        if (source.Software != null) {
            this.Software = new String[source.Software.length];
            for (int i = 0; i < source.Software.length; i++) {
                this.Software[i] = new String(source.Software[i]);
            }
        }
        if (source.ResourceSpec != null) {
            this.ResourceSpec = new NewResourceSpec(source.ResourceSpec);
        }
        if (source.SupportHA != null) {
            this.SupportHA = new Long(source.SupportHA);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.Placement != null) {
            this.Placement = new Placement(source.Placement);
        }
        if (source.TimeSpan != null) {
            this.TimeSpan = new Long(source.TimeSpan);
        }
        if (source.TimeUnit != null) {
            this.TimeUnit = new String(source.TimeUnit);
        }
        if (source.LoginSettings != null) {
            this.LoginSettings = new LoginSettings(source.LoginSettings);
        }
        if (source.COSSettings != null) {
            this.COSSettings = new COSSettings(source.COSSettings);
        }
        if (source.SgId != null) {
            this.SgId = new String(source.SgId);
        }
        if (source.PreExecutedFileSettings != null) {
            this.PreExecutedFileSettings = new PreExecuteFileSettings[source.PreExecutedFileSettings.length];
            for (int i = 0; i < source.PreExecutedFileSettings.length; i++) {
                this.PreExecutedFileSettings[i] = new PreExecuteFileSettings(source.PreExecutedFileSettings[i]);
            }
        }
        if (source.AutoRenew != null) {
            this.AutoRenew = new Long(source.AutoRenew);
        }
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
        }
        if (source.NeedMasterWan != null) {
            this.NeedMasterWan = new String(source.NeedMasterWan);
        }
        if (source.RemoteLoginAtCreate != null) {
            this.RemoteLoginAtCreate = new Long(source.RemoteLoginAtCreate);
        }
        if (source.CheckSecurity != null) {
            this.CheckSecurity = new Long(source.CheckSecurity);
        }
        if (source.ExtendFsField != null) {
            this.ExtendFsField = new String(source.ExtendFsField);
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
        if (source.CbsEncrypt != null) {
            this.CbsEncrypt = new Long(source.CbsEncrypt);
        }
        if (source.MetaType != null) {
            this.MetaType = new String(source.MetaType);
        }
        if (source.UnifyMetaInstanceId != null) {
            this.UnifyMetaInstanceId = new String(source.UnifyMetaInstanceId);
        }
        if (source.MetaDBInfo != null) {
            this.MetaDBInfo = new CustomMetaInfo(source.MetaDBInfo);
        }
        if (source.ApplicationRole != null) {
            this.ApplicationRole = new String(source.ApplicationRole);
        }
        if (source.SceneName != null) {
            this.SceneName = new String(source.SceneName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamObj(map, prefix + "VPCSettings.", this.VPCSettings);
        this.setParamArraySimple(map, prefix + "Software.", this.Software);
        this.setParamObj(map, prefix + "ResourceSpec.", this.ResourceSpec);
        this.setParamSimple(map, prefix + "SupportHA", this.SupportHA);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamObj(map, prefix + "Placement.", this.Placement);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamObj(map, prefix + "LoginSettings.", this.LoginSettings);
        this.setParamObj(map, prefix + "COSSettings.", this.COSSettings);
        this.setParamSimple(map, prefix + "SgId", this.SgId);
        this.setParamArrayObj(map, prefix + "PreExecutedFileSettings.", this.PreExecutedFileSettings);
        this.setParamSimple(map, prefix + "AutoRenew", this.AutoRenew);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamSimple(map, prefix + "NeedMasterWan", this.NeedMasterWan);
        this.setParamSimple(map, prefix + "RemoteLoginAtCreate", this.RemoteLoginAtCreate);
        this.setParamSimple(map, prefix + "CheckSecurity", this.CheckSecurity);
        this.setParamSimple(map, prefix + "ExtendFsField", this.ExtendFsField);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamArraySimple(map, prefix + "DisasterRecoverGroupIds.", this.DisasterRecoverGroupIds);
        this.setParamSimple(map, prefix + "CbsEncrypt", this.CbsEncrypt);
        this.setParamSimple(map, prefix + "MetaType", this.MetaType);
        this.setParamSimple(map, prefix + "UnifyMetaInstanceId", this.UnifyMetaInstanceId);
        this.setParamObj(map, prefix + "MetaDBInfo.", this.MetaDBInfo);
        this.setParamSimple(map, prefix + "ApplicationRole", this.ApplicationRole);
        this.setParamSimple(map, prefix + "SceneName", this.SceneName);

    }
}

