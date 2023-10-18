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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DBInstance extends AbstractModel {

    /**
    * Instance region such as ap-guangzhou, which corresponds to the`Region` field in `RegionSet`.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Instance AZ such as ap-guangzhou-3, which corresponds to the `Zone` field of `ZoneSet`.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * VPC ID in the format of `vpc-xxxxxxx`, which can be obtained in the console or from the `unVpcId` field in the return value of the [DescribeVpcEx](https://intl.cloud.tencent.com/document/api/215/1372?from_cn_redirect=1) API.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * VPC subnet ID in the format of `subnet-xxxxxxxx`, which can be obtained in the console or from the `unSubnetId` field in the return value of the [DescribeSubnets ](https://intl.cloud.tencent.com/document/api/215/15784?from_cn_redirect=1) API.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Instance ID
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * Instance name
    */
    @SerializedName("DBInstanceName")
    @Expose
    private String DBInstanceName;

    /**
    * Instance status. Valid values: `applying`, `init` (to be initialized), `initing` (initializing), `running`, `limited run`, `isolating`, `isolated`, `recycling`, `recycled`, `job running`, `offline`, `migrating`, `expanding`, `waitSwitch` (waiting for switch), `switching`, `readonly`, `restarting`, `network changing`, `upgrading` (upgrading kernel version), `audit-switching` (changing audit status), `primary-switching` (primary-standby switching).
    */
    @SerializedName("DBInstanceStatus")
    @Expose
    private String DBInstanceStatus;

    /**
    * Assigned instance memory size in GB
    */
    @SerializedName("DBInstanceMemory")
    @Expose
    private Long DBInstanceMemory;

    /**
    * Assigned instance storage capacity in GB
    */
    @SerializedName("DBInstanceStorage")
    @Expose
    private Long DBInstanceStorage;

    /**
    * Number of assigned CPUs
    */
    @SerializedName("DBInstanceCpu")
    @Expose
    private Long DBInstanceCpu;

    /**
    * Purchasable specification ID
    */
    @SerializedName("DBInstanceClass")
    @Expose
    private String DBInstanceClass;

    /**
    * The major PostgreSQL version number, which can be queried by the [DescribeDBVersions](https://intl.cloud.tencent.com/document/api/409/89018?from_cn_redirect=1) API. Valid values: `10`, `11`, `12`, `13`, `14`, `15`.
Note: u200dThis field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DBMajorVersion")
    @Expose
    private String DBMajorVersion;

    /**
    * Number of the major PostgreSQL community version and minor version, such as 12.4, which can be queried by the [DescribeDBVersions](https://intl.cloud.tencent.com/document/api/409/89018?from_cn_redirect=1) API.
    */
    @SerializedName("DBVersion")
    @Expose
    private String DBVersion;

    /**
    * PostgreSQL kernel version number (like v12.7_r1.8), which can be queried by the [DescribeDBVersions](https://intl.cloud.tencent.com/document/api/409/89018?from_cn_redirect=1) API.
Note: u200dThis field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DBKernelVersion")
    @Expose
    private String DBKernelVersion;

    /**
    * Instance type. Valid values:
<li>`primary`: Primary instance
<li>`readonly`: Read-only instance
<li>`guard`: Disaster recovery instance
<li>`temp`: Temp instance
    */
    @SerializedName("DBInstanceType")
    @Expose
    private String DBInstanceType;

    /**
    * Instance version. Valid value: `standard` (dual-server high-availability; one-primary-one-standby).
    */
    @SerializedName("DBInstanceVersion")
    @Expose
    private String DBInstanceVersion;

    /**
    * Instance character set. Valid values:
<li>`UTF8`
<li>`LATIN1`
    */
    @SerializedName("DBCharset")
    @Expose
    private String DBCharset;

    /**
    * Instance creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Last updated time of the instance attribute
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Instance expiration time
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * Instance isolation time
    */
    @SerializedName("IsolatedTime")
    @Expose
    private String IsolatedTime;

    /**
    * Billing mode. Valid values:
<li>`PREPAID`: Monthly subscription
<li>`postpaid`: Pay-as-you-go
    */
    @SerializedName("PayType")
    @Expose
    private String PayType;

    /**
    * Whether auto-renewal is enabled. Valid values:
<li>`0`: Manual renewal.
<li>`1`: Automatic renewal.
Default value: `0`.
    */
    @SerializedName("AutoRenew")
    @Expose
    private Long AutoRenew;

    /**
    * Instance network connection information
    */
    @SerializedName("DBInstanceNetInfo")
    @Expose
    private DBInstanceNetInfo [] DBInstanceNetInfo;

    /**
    * Machine type
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * User `AppId`
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * Instance `Uid`
    */
    @SerializedName("Uid")
    @Expose
    private Long Uid;

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * The information of tags associated with instances
Note: u200dThis field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TagList")
    @Expose
    private Tag [] TagList;

    /**
    * Primary instance information, which is returned only when the instance is read-only.
Note: u200dThis field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MasterDBInstanceId")
    @Expose
    private String MasterDBInstanceId;

    /**
    * Number of read-only instances
Note: u200dThis field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ReadOnlyInstanceNum")
    @Expose
    private Long ReadOnlyInstanceNum;

    /**
    * The status of a read-only instance in a read-only group
Note: u200dThis field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StatusInReadonlyGroup")
    @Expose
    private String StatusInReadonlyGroup;

    /**
    * Offline time
Note: u200dThis field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OfflineTime")
    @Expose
    private String OfflineTime;

    /**
    * Instance node information
Note: u200dThis field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DBNodeSet")
    @Expose
    private DBNode [] DBNodeSet;

    /**
    * Whether the instance supports TDE. Valid values: 
<li>`0`: No.
<li>`1`: Yes.
Default value: `0`.
For more information, see [TDE](https://intl.cloud.tencent.com/document/product/409/71748?from_cn_redirect=1).
Note: u200dThis field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsSupportTDE")
    @Expose
    private Long IsSupportTDE;

    /**
    * Database engines. Valid values:
<li>`postgresql`: TencentDB for PostgreSQL
<li>`mssql_compatible`: MSSQL compatible-TencentDB for PostgreSQL
Default value: `postgresql`.
Note: u200dThis field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DBEngine")
    @Expose
    private String DBEngine;

    /**
    * Configuration information of database engine in the following format:
{"$key1":"$value1", "$key2":"$value2"}
Valid values:
mssql_compatible engine:
<li>`migrationMode`: Database mode. Valid values: `single-db` (single-database mode), `multi-db` (multi-database mode). Default value: `single-db`.
<li>`defaultLocale`: Default locale, which can’t be modified after the initialization. Default value: `en_US`. Valid values:
"af_ZA", "sq_AL", "ar_DZ", "ar_BH", "ar_EG", "ar_IQ", "ar_JO", "ar_KW", "ar_LB", "ar_LY", "ar_MA", "ar_OM", "ar_QA", "ar_SA", "ar_SY", "ar_TN", "ar_AE", "ar_YE", "hy_AM", "az_Cyrl_AZ", "az_Latn_AZ", "eu_ES", "be_BY", "bg_BG", "ca_ES", "zh_HK", "zh_MO", "zh_CN", "zh_SG", "zh_TW", "hr_HR", "cs_CZ", "da_DK", "nl_BE", "nl_NL", "en_AU", "en_BZ", "en_CA", "en_IE", "en_JM", "en_NZ", "en_PH", "en_ZA", "en_TT", "en_GB", "en_US", "en_ZW", "et_EE", "fo_FO", "fa_IR", "fi_FI", "fr_BE", "fr_CA", "fr_FR", "fr_LU", "fr_MC", "fr_CH", "mk_MK", "ka_GE", "de_AT", "de_DE", "de_LI", "de_LU", "de_CH", "el_GR", "gu_IN", "he_IL", "hi_IN", "hu_HU", "is_IS", "id_ID", "it_IT", "it_CH", "ja_JP", "kn_IN", "kok_IN", "ko_KR", "ky_KG", "lv_LV", "lt_LT", "ms_BN", "ms_MY", "mr_IN", "mn_MN", "nb_NO", "nn_NO", "pl_PL", "pt_BR", "pt_PT", "pa_IN", "ro_RO", "ru_RU", "sa_IN", "sr_Cyrl_RS", "sr_Latn_RS", "sk_SK", "sl_SI", "es_AR", "es_BO", "es_CL", "es_CO", "es_CR", "es_DO", "es_EC", "es_SV", "es_GT", "es_HN", "es_MX", "es_NI", "es_PA", "es_PY","es_PE", "es_PR", "es_ES", "es_TRADITIONAL", "es_UY", "es_VE", "sw_KE", "sv_FI", "sv_SE", "tt_RU", "te_IN", "th_TH", "tr_TR", "uk_UA", "ur_IN", "ur_PK", "uz_Cyrl_UZ", "uz_Latn_UZ", "vi_VN".
<li>`serverCollationName`: Default collation name, which can’t be modified after the initialization. Default value: "sql_latin1_general_cp1_ci_as". Valid values: "bbf_unicode_cp1_ci_as", "bbf_unicode_CP1250_ci_as", "bbf_unicode_CP1251_ci_as", "bbf_unicode_cp1253_ci_as", "bbf_unicode_cp1254_ci_as", "bbf_unicode_cp1255_ci_as", "bbf_unicode_cp1256_ci_as", "bbf_unicode_cp1257_ci_as", "bbf_unicode_cp1258_ci_as", "bbf_unicode_cp874_ci_as", "sql_latin1_general_cp1250_ci_as", "sql_latin1_general_cp1251_ci_as", "sql_latin1_general_cp1_ci_as", "sql_latin1_general_cp1253_ci_as", "sql_latin1_general_cp1254_ci_as", "sql_latin1_general_cp1255_ci_as","sql_latin1_general_cp1256_ci_as", "sql_latin1_general_cp1257_ci_as", "sql_latin1_general_cp1258_ci_as", "chinese_prc_ci_as", "cyrillic_general_ci_as", "finnish_swedish_ci_as", "french_ci_as", "japanese_ci_as", "korean_wansung_ci_as", "latin1_general_ci_as", "modern_spanish_ci_as", "polish_ci_as", "thai_ci_as", "traditional_spanish_ci_as", "turkish_ci_as", "ukrainian_ci_as", "vietnamese_ci_as".
Note: u200dThis field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DBEngineConfig")
    @Expose
    private String DBEngineConfig;

    /**
    * Network access list of the instance (this field has been deprecated)
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("NetworkAccessList")
    @Expose
    private NetworkAccess [] NetworkAccessList;

    /**
    * Whether the instance supports IPv6. Valid values:
<li>`0`: No.
<li>`1`: Yes.
Default value: `0`.
    */
    @SerializedName("SupportIpv6")
    @Expose
    private Long SupportIpv6;

    /**
     * Get Instance region such as ap-guangzhou, which corresponds to the`Region` field in `RegionSet`. 
     * @return Region Instance region such as ap-guangzhou, which corresponds to the`Region` field in `RegionSet`.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Instance region such as ap-guangzhou, which corresponds to the`Region` field in `RegionSet`.
     * @param Region Instance region such as ap-guangzhou, which corresponds to the`Region` field in `RegionSet`.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Instance AZ such as ap-guangzhou-3, which corresponds to the `Zone` field of `ZoneSet`. 
     * @return Zone Instance AZ such as ap-guangzhou-3, which corresponds to the `Zone` field of `ZoneSet`.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Instance AZ such as ap-guangzhou-3, which corresponds to the `Zone` field of `ZoneSet`.
     * @param Zone Instance AZ such as ap-guangzhou-3, which corresponds to the `Zone` field of `ZoneSet`.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get VPC ID in the format of `vpc-xxxxxxx`, which can be obtained in the console or from the `unVpcId` field in the return value of the [DescribeVpcEx](https://intl.cloud.tencent.com/document/api/215/1372?from_cn_redirect=1) API. 
     * @return VpcId VPC ID in the format of `vpc-xxxxxxx`, which can be obtained in the console or from the `unVpcId` field in the return value of the [DescribeVpcEx](https://intl.cloud.tencent.com/document/api/215/1372?from_cn_redirect=1) API.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID in the format of `vpc-xxxxxxx`, which can be obtained in the console or from the `unVpcId` field in the return value of the [DescribeVpcEx](https://intl.cloud.tencent.com/document/api/215/1372?from_cn_redirect=1) API.
     * @param VpcId VPC ID in the format of `vpc-xxxxxxx`, which can be obtained in the console or from the `unVpcId` field in the return value of the [DescribeVpcEx](https://intl.cloud.tencent.com/document/api/215/1372?from_cn_redirect=1) API.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get VPC subnet ID in the format of `subnet-xxxxxxxx`, which can be obtained in the console or from the `unSubnetId` field in the return value of the [DescribeSubnets ](https://intl.cloud.tencent.com/document/api/215/15784?from_cn_redirect=1) API. 
     * @return SubnetId VPC subnet ID in the format of `subnet-xxxxxxxx`, which can be obtained in the console or from the `unSubnetId` field in the return value of the [DescribeSubnets ](https://intl.cloud.tencent.com/document/api/215/15784?from_cn_redirect=1) API.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set VPC subnet ID in the format of `subnet-xxxxxxxx`, which can be obtained in the console or from the `unSubnetId` field in the return value of the [DescribeSubnets ](https://intl.cloud.tencent.com/document/api/215/15784?from_cn_redirect=1) API.
     * @param SubnetId VPC subnet ID in the format of `subnet-xxxxxxxx`, which can be obtained in the console or from the `unSubnetId` field in the return value of the [DescribeSubnets ](https://intl.cloud.tencent.com/document/api/215/15784?from_cn_redirect=1) API.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Instance ID 
     * @return DBInstanceId Instance ID
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set Instance ID
     * @param DBInstanceId Instance ID
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get Instance name 
     * @return DBInstanceName Instance name
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    /**
     * Set Instance name
     * @param DBInstanceName Instance name
     */
    public void setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
    }

    /**
     * Get Instance status. Valid values: `applying`, `init` (to be initialized), `initing` (initializing), `running`, `limited run`, `isolating`, `isolated`, `recycling`, `recycled`, `job running`, `offline`, `migrating`, `expanding`, `waitSwitch` (waiting for switch), `switching`, `readonly`, `restarting`, `network changing`, `upgrading` (upgrading kernel version), `audit-switching` (changing audit status), `primary-switching` (primary-standby switching). 
     * @return DBInstanceStatus Instance status. Valid values: `applying`, `init` (to be initialized), `initing` (initializing), `running`, `limited run`, `isolating`, `isolated`, `recycling`, `recycled`, `job running`, `offline`, `migrating`, `expanding`, `waitSwitch` (waiting for switch), `switching`, `readonly`, `restarting`, `network changing`, `upgrading` (upgrading kernel version), `audit-switching` (changing audit status), `primary-switching` (primary-standby switching).
     */
    public String getDBInstanceStatus() {
        return this.DBInstanceStatus;
    }

    /**
     * Set Instance status. Valid values: `applying`, `init` (to be initialized), `initing` (initializing), `running`, `limited run`, `isolating`, `isolated`, `recycling`, `recycled`, `job running`, `offline`, `migrating`, `expanding`, `waitSwitch` (waiting for switch), `switching`, `readonly`, `restarting`, `network changing`, `upgrading` (upgrading kernel version), `audit-switching` (changing audit status), `primary-switching` (primary-standby switching).
     * @param DBInstanceStatus Instance status. Valid values: `applying`, `init` (to be initialized), `initing` (initializing), `running`, `limited run`, `isolating`, `isolated`, `recycling`, `recycled`, `job running`, `offline`, `migrating`, `expanding`, `waitSwitch` (waiting for switch), `switching`, `readonly`, `restarting`, `network changing`, `upgrading` (upgrading kernel version), `audit-switching` (changing audit status), `primary-switching` (primary-standby switching).
     */
    public void setDBInstanceStatus(String DBInstanceStatus) {
        this.DBInstanceStatus = DBInstanceStatus;
    }

    /**
     * Get Assigned instance memory size in GB 
     * @return DBInstanceMemory Assigned instance memory size in GB
     */
    public Long getDBInstanceMemory() {
        return this.DBInstanceMemory;
    }

    /**
     * Set Assigned instance memory size in GB
     * @param DBInstanceMemory Assigned instance memory size in GB
     */
    public void setDBInstanceMemory(Long DBInstanceMemory) {
        this.DBInstanceMemory = DBInstanceMemory;
    }

    /**
     * Get Assigned instance storage capacity in GB 
     * @return DBInstanceStorage Assigned instance storage capacity in GB
     */
    public Long getDBInstanceStorage() {
        return this.DBInstanceStorage;
    }

    /**
     * Set Assigned instance storage capacity in GB
     * @param DBInstanceStorage Assigned instance storage capacity in GB
     */
    public void setDBInstanceStorage(Long DBInstanceStorage) {
        this.DBInstanceStorage = DBInstanceStorage;
    }

    /**
     * Get Number of assigned CPUs 
     * @return DBInstanceCpu Number of assigned CPUs
     */
    public Long getDBInstanceCpu() {
        return this.DBInstanceCpu;
    }

    /**
     * Set Number of assigned CPUs
     * @param DBInstanceCpu Number of assigned CPUs
     */
    public void setDBInstanceCpu(Long DBInstanceCpu) {
        this.DBInstanceCpu = DBInstanceCpu;
    }

    /**
     * Get Purchasable specification ID 
     * @return DBInstanceClass Purchasable specification ID
     */
    public String getDBInstanceClass() {
        return this.DBInstanceClass;
    }

    /**
     * Set Purchasable specification ID
     * @param DBInstanceClass Purchasable specification ID
     */
    public void setDBInstanceClass(String DBInstanceClass) {
        this.DBInstanceClass = DBInstanceClass;
    }

    /**
     * Get The major PostgreSQL version number, which can be queried by the [DescribeDBVersions](https://intl.cloud.tencent.com/document/api/409/89018?from_cn_redirect=1) API. Valid values: `10`, `11`, `12`, `13`, `14`, `15`.
Note: u200dThis field may return null, indicating that no valid values can be obtained. 
     * @return DBMajorVersion The major PostgreSQL version number, which can be queried by the [DescribeDBVersions](https://intl.cloud.tencent.com/document/api/409/89018?from_cn_redirect=1) API. Valid values: `10`, `11`, `12`, `13`, `14`, `15`.
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public String getDBMajorVersion() {
        return this.DBMajorVersion;
    }

    /**
     * Set The major PostgreSQL version number, which can be queried by the [DescribeDBVersions](https://intl.cloud.tencent.com/document/api/409/89018?from_cn_redirect=1) API. Valid values: `10`, `11`, `12`, `13`, `14`, `15`.
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     * @param DBMajorVersion The major PostgreSQL version number, which can be queried by the [DescribeDBVersions](https://intl.cloud.tencent.com/document/api/409/89018?from_cn_redirect=1) API. Valid values: `10`, `11`, `12`, `13`, `14`, `15`.
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public void setDBMajorVersion(String DBMajorVersion) {
        this.DBMajorVersion = DBMajorVersion;
    }

    /**
     * Get Number of the major PostgreSQL community version and minor version, such as 12.4, which can be queried by the [DescribeDBVersions](https://intl.cloud.tencent.com/document/api/409/89018?from_cn_redirect=1) API. 
     * @return DBVersion Number of the major PostgreSQL community version and minor version, such as 12.4, which can be queried by the [DescribeDBVersions](https://intl.cloud.tencent.com/document/api/409/89018?from_cn_redirect=1) API.
     */
    public String getDBVersion() {
        return this.DBVersion;
    }

    /**
     * Set Number of the major PostgreSQL community version and minor version, such as 12.4, which can be queried by the [DescribeDBVersions](https://intl.cloud.tencent.com/document/api/409/89018?from_cn_redirect=1) API.
     * @param DBVersion Number of the major PostgreSQL community version and minor version, such as 12.4, which can be queried by the [DescribeDBVersions](https://intl.cloud.tencent.com/document/api/409/89018?from_cn_redirect=1) API.
     */
    public void setDBVersion(String DBVersion) {
        this.DBVersion = DBVersion;
    }

    /**
     * Get PostgreSQL kernel version number (like v12.7_r1.8), which can be queried by the [DescribeDBVersions](https://intl.cloud.tencent.com/document/api/409/89018?from_cn_redirect=1) API.
Note: u200dThis field may return null, indicating that no valid values can be obtained. 
     * @return DBKernelVersion PostgreSQL kernel version number (like v12.7_r1.8), which can be queried by the [DescribeDBVersions](https://intl.cloud.tencent.com/document/api/409/89018?from_cn_redirect=1) API.
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public String getDBKernelVersion() {
        return this.DBKernelVersion;
    }

    /**
     * Set PostgreSQL kernel version number (like v12.7_r1.8), which can be queried by the [DescribeDBVersions](https://intl.cloud.tencent.com/document/api/409/89018?from_cn_redirect=1) API.
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     * @param DBKernelVersion PostgreSQL kernel version number (like v12.7_r1.8), which can be queried by the [DescribeDBVersions](https://intl.cloud.tencent.com/document/api/409/89018?from_cn_redirect=1) API.
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public void setDBKernelVersion(String DBKernelVersion) {
        this.DBKernelVersion = DBKernelVersion;
    }

    /**
     * Get Instance type. Valid values:
<li>`primary`: Primary instance
<li>`readonly`: Read-only instance
<li>`guard`: Disaster recovery instance
<li>`temp`: Temp instance 
     * @return DBInstanceType Instance type. Valid values:
<li>`primary`: Primary instance
<li>`readonly`: Read-only instance
<li>`guard`: Disaster recovery instance
<li>`temp`: Temp instance
     */
    public String getDBInstanceType() {
        return this.DBInstanceType;
    }

    /**
     * Set Instance type. Valid values:
<li>`primary`: Primary instance
<li>`readonly`: Read-only instance
<li>`guard`: Disaster recovery instance
<li>`temp`: Temp instance
     * @param DBInstanceType Instance type. Valid values:
<li>`primary`: Primary instance
<li>`readonly`: Read-only instance
<li>`guard`: Disaster recovery instance
<li>`temp`: Temp instance
     */
    public void setDBInstanceType(String DBInstanceType) {
        this.DBInstanceType = DBInstanceType;
    }

    /**
     * Get Instance version. Valid value: `standard` (dual-server high-availability; one-primary-one-standby). 
     * @return DBInstanceVersion Instance version. Valid value: `standard` (dual-server high-availability; one-primary-one-standby).
     */
    public String getDBInstanceVersion() {
        return this.DBInstanceVersion;
    }

    /**
     * Set Instance version. Valid value: `standard` (dual-server high-availability; one-primary-one-standby).
     * @param DBInstanceVersion Instance version. Valid value: `standard` (dual-server high-availability; one-primary-one-standby).
     */
    public void setDBInstanceVersion(String DBInstanceVersion) {
        this.DBInstanceVersion = DBInstanceVersion;
    }

    /**
     * Get Instance character set. Valid values:
<li>`UTF8`
<li>`LATIN1` 
     * @return DBCharset Instance character set. Valid values:
<li>`UTF8`
<li>`LATIN1`
     */
    public String getDBCharset() {
        return this.DBCharset;
    }

    /**
     * Set Instance character set. Valid values:
<li>`UTF8`
<li>`LATIN1`
     * @param DBCharset Instance character set. Valid values:
<li>`UTF8`
<li>`LATIN1`
     */
    public void setDBCharset(String DBCharset) {
        this.DBCharset = DBCharset;
    }

    /**
     * Get Instance creation time 
     * @return CreateTime Instance creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Instance creation time
     * @param CreateTime Instance creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Last updated time of the instance attribute 
     * @return UpdateTime Last updated time of the instance attribute
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Last updated time of the instance attribute
     * @param UpdateTime Last updated time of the instance attribute
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Instance expiration time 
     * @return ExpireTime Instance expiration time
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Instance expiration time
     * @param ExpireTime Instance expiration time
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get Instance isolation time 
     * @return IsolatedTime Instance isolation time
     */
    public String getIsolatedTime() {
        return this.IsolatedTime;
    }

    /**
     * Set Instance isolation time
     * @param IsolatedTime Instance isolation time
     */
    public void setIsolatedTime(String IsolatedTime) {
        this.IsolatedTime = IsolatedTime;
    }

    /**
     * Get Billing mode. Valid values:
<li>`PREPAID`: Monthly subscription
<li>`postpaid`: Pay-as-you-go 
     * @return PayType Billing mode. Valid values:
<li>`PREPAID`: Monthly subscription
<li>`postpaid`: Pay-as-you-go
     */
    public String getPayType() {
        return this.PayType;
    }

    /**
     * Set Billing mode. Valid values:
<li>`PREPAID`: Monthly subscription
<li>`postpaid`: Pay-as-you-go
     * @param PayType Billing mode. Valid values:
<li>`PREPAID`: Monthly subscription
<li>`postpaid`: Pay-as-you-go
     */
    public void setPayType(String PayType) {
        this.PayType = PayType;
    }

    /**
     * Get Whether auto-renewal is enabled. Valid values:
<li>`0`: Manual renewal.
<li>`1`: Automatic renewal.
Default value: `0`. 
     * @return AutoRenew Whether auto-renewal is enabled. Valid values:
<li>`0`: Manual renewal.
<li>`1`: Automatic renewal.
Default value: `0`.
     */
    public Long getAutoRenew() {
        return this.AutoRenew;
    }

    /**
     * Set Whether auto-renewal is enabled. Valid values:
<li>`0`: Manual renewal.
<li>`1`: Automatic renewal.
Default value: `0`.
     * @param AutoRenew Whether auto-renewal is enabled. Valid values:
<li>`0`: Manual renewal.
<li>`1`: Automatic renewal.
Default value: `0`.
     */
    public void setAutoRenew(Long AutoRenew) {
        this.AutoRenew = AutoRenew;
    }

    /**
     * Get Instance network connection information 
     * @return DBInstanceNetInfo Instance network connection information
     */
    public DBInstanceNetInfo [] getDBInstanceNetInfo() {
        return this.DBInstanceNetInfo;
    }

    /**
     * Set Instance network connection information
     * @param DBInstanceNetInfo Instance network connection information
     */
    public void setDBInstanceNetInfo(DBInstanceNetInfo [] DBInstanceNetInfo) {
        this.DBInstanceNetInfo = DBInstanceNetInfo;
    }

    /**
     * Get Machine type 
     * @return Type Machine type
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Machine type
     * @param Type Machine type
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get User `AppId` 
     * @return AppId User `AppId`
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set User `AppId`
     * @param AppId User `AppId`
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Instance `Uid` 
     * @return Uid Instance `Uid`
     */
    public Long getUid() {
        return this.Uid;
    }

    /**
     * Set Instance `Uid`
     * @param Uid Instance `Uid`
     */
    public void setUid(Long Uid) {
        this.Uid = Uid;
    }

    /**
     * Get Project ID 
     * @return ProjectId Project ID
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID
     * @param ProjectId Project ID
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get The information of tags associated with instances
Note: u200dThis field may return null, indicating that no valid values can be obtained. 
     * @return TagList The information of tags associated with instances
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public Tag [] getTagList() {
        return this.TagList;
    }

    /**
     * Set The information of tags associated with instances
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     * @param TagList The information of tags associated with instances
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public void setTagList(Tag [] TagList) {
        this.TagList = TagList;
    }

    /**
     * Get Primary instance information, which is returned only when the instance is read-only.
Note: u200dThis field may return null, indicating that no valid values can be obtained. 
     * @return MasterDBInstanceId Primary instance information, which is returned only when the instance is read-only.
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public String getMasterDBInstanceId() {
        return this.MasterDBInstanceId;
    }

    /**
     * Set Primary instance information, which is returned only when the instance is read-only.
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     * @param MasterDBInstanceId Primary instance information, which is returned only when the instance is read-only.
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public void setMasterDBInstanceId(String MasterDBInstanceId) {
        this.MasterDBInstanceId = MasterDBInstanceId;
    }

    /**
     * Get Number of read-only instances
Note: u200dThis field may return null, indicating that no valid values can be obtained. 
     * @return ReadOnlyInstanceNum Number of read-only instances
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public Long getReadOnlyInstanceNum() {
        return this.ReadOnlyInstanceNum;
    }

    /**
     * Set Number of read-only instances
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     * @param ReadOnlyInstanceNum Number of read-only instances
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public void setReadOnlyInstanceNum(Long ReadOnlyInstanceNum) {
        this.ReadOnlyInstanceNum = ReadOnlyInstanceNum;
    }

    /**
     * Get The status of a read-only instance in a read-only group
Note: u200dThis field may return null, indicating that no valid values can be obtained. 
     * @return StatusInReadonlyGroup The status of a read-only instance in a read-only group
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public String getStatusInReadonlyGroup() {
        return this.StatusInReadonlyGroup;
    }

    /**
     * Set The status of a read-only instance in a read-only group
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     * @param StatusInReadonlyGroup The status of a read-only instance in a read-only group
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public void setStatusInReadonlyGroup(String StatusInReadonlyGroup) {
        this.StatusInReadonlyGroup = StatusInReadonlyGroup;
    }

    /**
     * Get Offline time
Note: u200dThis field may return null, indicating that no valid values can be obtained. 
     * @return OfflineTime Offline time
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public String getOfflineTime() {
        return this.OfflineTime;
    }

    /**
     * Set Offline time
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     * @param OfflineTime Offline time
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public void setOfflineTime(String OfflineTime) {
        this.OfflineTime = OfflineTime;
    }

    /**
     * Get Instance node information
Note: u200dThis field may return null, indicating that no valid values can be obtained. 
     * @return DBNodeSet Instance node information
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public DBNode [] getDBNodeSet() {
        return this.DBNodeSet;
    }

    /**
     * Set Instance node information
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     * @param DBNodeSet Instance node information
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public void setDBNodeSet(DBNode [] DBNodeSet) {
        this.DBNodeSet = DBNodeSet;
    }

    /**
     * Get Whether the instance supports TDE. Valid values: 
<li>`0`: No.
<li>`1`: Yes.
Default value: `0`.
For more information, see [TDE](https://intl.cloud.tencent.com/document/product/409/71748?from_cn_redirect=1).
Note: u200dThis field may return null, indicating that no valid values can be obtained. 
     * @return IsSupportTDE Whether the instance supports TDE. Valid values: 
<li>`0`: No.
<li>`1`: Yes.
Default value: `0`.
For more information, see [TDE](https://intl.cloud.tencent.com/document/product/409/71748?from_cn_redirect=1).
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsSupportTDE() {
        return this.IsSupportTDE;
    }

    /**
     * Set Whether the instance supports TDE. Valid values: 
<li>`0`: No.
<li>`1`: Yes.
Default value: `0`.
For more information, see [TDE](https://intl.cloud.tencent.com/document/product/409/71748?from_cn_redirect=1).
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     * @param IsSupportTDE Whether the instance supports TDE. Valid values: 
<li>`0`: No.
<li>`1`: Yes.
Default value: `0`.
For more information, see [TDE](https://intl.cloud.tencent.com/document/product/409/71748?from_cn_redirect=1).
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public void setIsSupportTDE(Long IsSupportTDE) {
        this.IsSupportTDE = IsSupportTDE;
    }

    /**
     * Get Database engines. Valid values:
<li>`postgresql`: TencentDB for PostgreSQL
<li>`mssql_compatible`: MSSQL compatible-TencentDB for PostgreSQL
Default value: `postgresql`.
Note: u200dThis field may return null, indicating that no valid values can be obtained. 
     * @return DBEngine Database engines. Valid values:
<li>`postgresql`: TencentDB for PostgreSQL
<li>`mssql_compatible`: MSSQL compatible-TencentDB for PostgreSQL
Default value: `postgresql`.
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public String getDBEngine() {
        return this.DBEngine;
    }

    /**
     * Set Database engines. Valid values:
<li>`postgresql`: TencentDB for PostgreSQL
<li>`mssql_compatible`: MSSQL compatible-TencentDB for PostgreSQL
Default value: `postgresql`.
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     * @param DBEngine Database engines. Valid values:
<li>`postgresql`: TencentDB for PostgreSQL
<li>`mssql_compatible`: MSSQL compatible-TencentDB for PostgreSQL
Default value: `postgresql`.
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public void setDBEngine(String DBEngine) {
        this.DBEngine = DBEngine;
    }

    /**
     * Get Configuration information of database engine in the following format:
{"$key1":"$value1", "$key2":"$value2"}
Valid values:
mssql_compatible engine:
<li>`migrationMode`: Database mode. Valid values: `single-db` (single-database mode), `multi-db` (multi-database mode). Default value: `single-db`.
<li>`defaultLocale`: Default locale, which can’t be modified after the initialization. Default value: `en_US`. Valid values:
"af_ZA", "sq_AL", "ar_DZ", "ar_BH", "ar_EG", "ar_IQ", "ar_JO", "ar_KW", "ar_LB", "ar_LY", "ar_MA", "ar_OM", "ar_QA", "ar_SA", "ar_SY", "ar_TN", "ar_AE", "ar_YE", "hy_AM", "az_Cyrl_AZ", "az_Latn_AZ", "eu_ES", "be_BY", "bg_BG", "ca_ES", "zh_HK", "zh_MO", "zh_CN", "zh_SG", "zh_TW", "hr_HR", "cs_CZ", "da_DK", "nl_BE", "nl_NL", "en_AU", "en_BZ", "en_CA", "en_IE", "en_JM", "en_NZ", "en_PH", "en_ZA", "en_TT", "en_GB", "en_US", "en_ZW", "et_EE", "fo_FO", "fa_IR", "fi_FI", "fr_BE", "fr_CA", "fr_FR", "fr_LU", "fr_MC", "fr_CH", "mk_MK", "ka_GE", "de_AT", "de_DE", "de_LI", "de_LU", "de_CH", "el_GR", "gu_IN", "he_IL", "hi_IN", "hu_HU", "is_IS", "id_ID", "it_IT", "it_CH", "ja_JP", "kn_IN", "kok_IN", "ko_KR", "ky_KG", "lv_LV", "lt_LT", "ms_BN", "ms_MY", "mr_IN", "mn_MN", "nb_NO", "nn_NO", "pl_PL", "pt_BR", "pt_PT", "pa_IN", "ro_RO", "ru_RU", "sa_IN", "sr_Cyrl_RS", "sr_Latn_RS", "sk_SK", "sl_SI", "es_AR", "es_BO", "es_CL", "es_CO", "es_CR", "es_DO", "es_EC", "es_SV", "es_GT", "es_HN", "es_MX", "es_NI", "es_PA", "es_PY","es_PE", "es_PR", "es_ES", "es_TRADITIONAL", "es_UY", "es_VE", "sw_KE", "sv_FI", "sv_SE", "tt_RU", "te_IN", "th_TH", "tr_TR", "uk_UA", "ur_IN", "ur_PK", "uz_Cyrl_UZ", "uz_Latn_UZ", "vi_VN".
<li>`serverCollationName`: Default collation name, which can’t be modified after the initialization. Default value: "sql_latin1_general_cp1_ci_as". Valid values: "bbf_unicode_cp1_ci_as", "bbf_unicode_CP1250_ci_as", "bbf_unicode_CP1251_ci_as", "bbf_unicode_cp1253_ci_as", "bbf_unicode_cp1254_ci_as", "bbf_unicode_cp1255_ci_as", "bbf_unicode_cp1256_ci_as", "bbf_unicode_cp1257_ci_as", "bbf_unicode_cp1258_ci_as", "bbf_unicode_cp874_ci_as", "sql_latin1_general_cp1250_ci_as", "sql_latin1_general_cp1251_ci_as", "sql_latin1_general_cp1_ci_as", "sql_latin1_general_cp1253_ci_as", "sql_latin1_general_cp1254_ci_as", "sql_latin1_general_cp1255_ci_as","sql_latin1_general_cp1256_ci_as", "sql_latin1_general_cp1257_ci_as", "sql_latin1_general_cp1258_ci_as", "chinese_prc_ci_as", "cyrillic_general_ci_as", "finnish_swedish_ci_as", "french_ci_as", "japanese_ci_as", "korean_wansung_ci_as", "latin1_general_ci_as", "modern_spanish_ci_as", "polish_ci_as", "thai_ci_as", "traditional_spanish_ci_as", "turkish_ci_as", "ukrainian_ci_as", "vietnamese_ci_as".
Note: u200dThis field may return null, indicating that no valid values can be obtained. 
     * @return DBEngineConfig Configuration information of database engine in the following format:
{"$key1":"$value1", "$key2":"$value2"}
Valid values:
mssql_compatible engine:
<li>`migrationMode`: Database mode. Valid values: `single-db` (single-database mode), `multi-db` (multi-database mode). Default value: `single-db`.
<li>`defaultLocale`: Default locale, which can’t be modified after the initialization. Default value: `en_US`. Valid values:
"af_ZA", "sq_AL", "ar_DZ", "ar_BH", "ar_EG", "ar_IQ", "ar_JO", "ar_KW", "ar_LB", "ar_LY", "ar_MA", "ar_OM", "ar_QA", "ar_SA", "ar_SY", "ar_TN", "ar_AE", "ar_YE", "hy_AM", "az_Cyrl_AZ", "az_Latn_AZ", "eu_ES", "be_BY", "bg_BG", "ca_ES", "zh_HK", "zh_MO", "zh_CN", "zh_SG", "zh_TW", "hr_HR", "cs_CZ", "da_DK", "nl_BE", "nl_NL", "en_AU", "en_BZ", "en_CA", "en_IE", "en_JM", "en_NZ", "en_PH", "en_ZA", "en_TT", "en_GB", "en_US", "en_ZW", "et_EE", "fo_FO", "fa_IR", "fi_FI", "fr_BE", "fr_CA", "fr_FR", "fr_LU", "fr_MC", "fr_CH", "mk_MK", "ka_GE", "de_AT", "de_DE", "de_LI", "de_LU", "de_CH", "el_GR", "gu_IN", "he_IL", "hi_IN", "hu_HU", "is_IS", "id_ID", "it_IT", "it_CH", "ja_JP", "kn_IN", "kok_IN", "ko_KR", "ky_KG", "lv_LV", "lt_LT", "ms_BN", "ms_MY", "mr_IN", "mn_MN", "nb_NO", "nn_NO", "pl_PL", "pt_BR", "pt_PT", "pa_IN", "ro_RO", "ru_RU", "sa_IN", "sr_Cyrl_RS", "sr_Latn_RS", "sk_SK", "sl_SI", "es_AR", "es_BO", "es_CL", "es_CO", "es_CR", "es_DO", "es_EC", "es_SV", "es_GT", "es_HN", "es_MX", "es_NI", "es_PA", "es_PY","es_PE", "es_PR", "es_ES", "es_TRADITIONAL", "es_UY", "es_VE", "sw_KE", "sv_FI", "sv_SE", "tt_RU", "te_IN", "th_TH", "tr_TR", "uk_UA", "ur_IN", "ur_PK", "uz_Cyrl_UZ", "uz_Latn_UZ", "vi_VN".
<li>`serverCollationName`: Default collation name, which can’t be modified after the initialization. Default value: "sql_latin1_general_cp1_ci_as". Valid values: "bbf_unicode_cp1_ci_as", "bbf_unicode_CP1250_ci_as", "bbf_unicode_CP1251_ci_as", "bbf_unicode_cp1253_ci_as", "bbf_unicode_cp1254_ci_as", "bbf_unicode_cp1255_ci_as", "bbf_unicode_cp1256_ci_as", "bbf_unicode_cp1257_ci_as", "bbf_unicode_cp1258_ci_as", "bbf_unicode_cp874_ci_as", "sql_latin1_general_cp1250_ci_as", "sql_latin1_general_cp1251_ci_as", "sql_latin1_general_cp1_ci_as", "sql_latin1_general_cp1253_ci_as", "sql_latin1_general_cp1254_ci_as", "sql_latin1_general_cp1255_ci_as","sql_latin1_general_cp1256_ci_as", "sql_latin1_general_cp1257_ci_as", "sql_latin1_general_cp1258_ci_as", "chinese_prc_ci_as", "cyrillic_general_ci_as", "finnish_swedish_ci_as", "french_ci_as", "japanese_ci_as", "korean_wansung_ci_as", "latin1_general_ci_as", "modern_spanish_ci_as", "polish_ci_as", "thai_ci_as", "traditional_spanish_ci_as", "turkish_ci_as", "ukrainian_ci_as", "vietnamese_ci_as".
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public String getDBEngineConfig() {
        return this.DBEngineConfig;
    }

    /**
     * Set Configuration information of database engine in the following format:
{"$key1":"$value1", "$key2":"$value2"}
Valid values:
mssql_compatible engine:
<li>`migrationMode`: Database mode. Valid values: `single-db` (single-database mode), `multi-db` (multi-database mode). Default value: `single-db`.
<li>`defaultLocale`: Default locale, which can’t be modified after the initialization. Default value: `en_US`. Valid values:
"af_ZA", "sq_AL", "ar_DZ", "ar_BH", "ar_EG", "ar_IQ", "ar_JO", "ar_KW", "ar_LB", "ar_LY", "ar_MA", "ar_OM", "ar_QA", "ar_SA", "ar_SY", "ar_TN", "ar_AE", "ar_YE", "hy_AM", "az_Cyrl_AZ", "az_Latn_AZ", "eu_ES", "be_BY", "bg_BG", "ca_ES", "zh_HK", "zh_MO", "zh_CN", "zh_SG", "zh_TW", "hr_HR", "cs_CZ", "da_DK", "nl_BE", "nl_NL", "en_AU", "en_BZ", "en_CA", "en_IE", "en_JM", "en_NZ", "en_PH", "en_ZA", "en_TT", "en_GB", "en_US", "en_ZW", "et_EE", "fo_FO", "fa_IR", "fi_FI", "fr_BE", "fr_CA", "fr_FR", "fr_LU", "fr_MC", "fr_CH", "mk_MK", "ka_GE", "de_AT", "de_DE", "de_LI", "de_LU", "de_CH", "el_GR", "gu_IN", "he_IL", "hi_IN", "hu_HU", "is_IS", "id_ID", "it_IT", "it_CH", "ja_JP", "kn_IN", "kok_IN", "ko_KR", "ky_KG", "lv_LV", "lt_LT", "ms_BN", "ms_MY", "mr_IN", "mn_MN", "nb_NO", "nn_NO", "pl_PL", "pt_BR", "pt_PT", "pa_IN", "ro_RO", "ru_RU", "sa_IN", "sr_Cyrl_RS", "sr_Latn_RS", "sk_SK", "sl_SI", "es_AR", "es_BO", "es_CL", "es_CO", "es_CR", "es_DO", "es_EC", "es_SV", "es_GT", "es_HN", "es_MX", "es_NI", "es_PA", "es_PY","es_PE", "es_PR", "es_ES", "es_TRADITIONAL", "es_UY", "es_VE", "sw_KE", "sv_FI", "sv_SE", "tt_RU", "te_IN", "th_TH", "tr_TR", "uk_UA", "ur_IN", "ur_PK", "uz_Cyrl_UZ", "uz_Latn_UZ", "vi_VN".
<li>`serverCollationName`: Default collation name, which can’t be modified after the initialization. Default value: "sql_latin1_general_cp1_ci_as". Valid values: "bbf_unicode_cp1_ci_as", "bbf_unicode_CP1250_ci_as", "bbf_unicode_CP1251_ci_as", "bbf_unicode_cp1253_ci_as", "bbf_unicode_cp1254_ci_as", "bbf_unicode_cp1255_ci_as", "bbf_unicode_cp1256_ci_as", "bbf_unicode_cp1257_ci_as", "bbf_unicode_cp1258_ci_as", "bbf_unicode_cp874_ci_as", "sql_latin1_general_cp1250_ci_as", "sql_latin1_general_cp1251_ci_as", "sql_latin1_general_cp1_ci_as", "sql_latin1_general_cp1253_ci_as", "sql_latin1_general_cp1254_ci_as", "sql_latin1_general_cp1255_ci_as","sql_latin1_general_cp1256_ci_as", "sql_latin1_general_cp1257_ci_as", "sql_latin1_general_cp1258_ci_as", "chinese_prc_ci_as", "cyrillic_general_ci_as", "finnish_swedish_ci_as", "french_ci_as", "japanese_ci_as", "korean_wansung_ci_as", "latin1_general_ci_as", "modern_spanish_ci_as", "polish_ci_as", "thai_ci_as", "traditional_spanish_ci_as", "turkish_ci_as", "ukrainian_ci_as", "vietnamese_ci_as".
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     * @param DBEngineConfig Configuration information of database engine in the following format:
{"$key1":"$value1", "$key2":"$value2"}
Valid values:
mssql_compatible engine:
<li>`migrationMode`: Database mode. Valid values: `single-db` (single-database mode), `multi-db` (multi-database mode). Default value: `single-db`.
<li>`defaultLocale`: Default locale, which can’t be modified after the initialization. Default value: `en_US`. Valid values:
"af_ZA", "sq_AL", "ar_DZ", "ar_BH", "ar_EG", "ar_IQ", "ar_JO", "ar_KW", "ar_LB", "ar_LY", "ar_MA", "ar_OM", "ar_QA", "ar_SA", "ar_SY", "ar_TN", "ar_AE", "ar_YE", "hy_AM", "az_Cyrl_AZ", "az_Latn_AZ", "eu_ES", "be_BY", "bg_BG", "ca_ES", "zh_HK", "zh_MO", "zh_CN", "zh_SG", "zh_TW", "hr_HR", "cs_CZ", "da_DK", "nl_BE", "nl_NL", "en_AU", "en_BZ", "en_CA", "en_IE", "en_JM", "en_NZ", "en_PH", "en_ZA", "en_TT", "en_GB", "en_US", "en_ZW", "et_EE", "fo_FO", "fa_IR", "fi_FI", "fr_BE", "fr_CA", "fr_FR", "fr_LU", "fr_MC", "fr_CH", "mk_MK", "ka_GE", "de_AT", "de_DE", "de_LI", "de_LU", "de_CH", "el_GR", "gu_IN", "he_IL", "hi_IN", "hu_HU", "is_IS", "id_ID", "it_IT", "it_CH", "ja_JP", "kn_IN", "kok_IN", "ko_KR", "ky_KG", "lv_LV", "lt_LT", "ms_BN", "ms_MY", "mr_IN", "mn_MN", "nb_NO", "nn_NO", "pl_PL", "pt_BR", "pt_PT", "pa_IN", "ro_RO", "ru_RU", "sa_IN", "sr_Cyrl_RS", "sr_Latn_RS", "sk_SK", "sl_SI", "es_AR", "es_BO", "es_CL", "es_CO", "es_CR", "es_DO", "es_EC", "es_SV", "es_GT", "es_HN", "es_MX", "es_NI", "es_PA", "es_PY","es_PE", "es_PR", "es_ES", "es_TRADITIONAL", "es_UY", "es_VE", "sw_KE", "sv_FI", "sv_SE", "tt_RU", "te_IN", "th_TH", "tr_TR", "uk_UA", "ur_IN", "ur_PK", "uz_Cyrl_UZ", "uz_Latn_UZ", "vi_VN".
<li>`serverCollationName`: Default collation name, which can’t be modified after the initialization. Default value: "sql_latin1_general_cp1_ci_as". Valid values: "bbf_unicode_cp1_ci_as", "bbf_unicode_CP1250_ci_as", "bbf_unicode_CP1251_ci_as", "bbf_unicode_cp1253_ci_as", "bbf_unicode_cp1254_ci_as", "bbf_unicode_cp1255_ci_as", "bbf_unicode_cp1256_ci_as", "bbf_unicode_cp1257_ci_as", "bbf_unicode_cp1258_ci_as", "bbf_unicode_cp874_ci_as", "sql_latin1_general_cp1250_ci_as", "sql_latin1_general_cp1251_ci_as", "sql_latin1_general_cp1_ci_as", "sql_latin1_general_cp1253_ci_as", "sql_latin1_general_cp1254_ci_as", "sql_latin1_general_cp1255_ci_as","sql_latin1_general_cp1256_ci_as", "sql_latin1_general_cp1257_ci_as", "sql_latin1_general_cp1258_ci_as", "chinese_prc_ci_as", "cyrillic_general_ci_as", "finnish_swedish_ci_as", "french_ci_as", "japanese_ci_as", "korean_wansung_ci_as", "latin1_general_ci_as", "modern_spanish_ci_as", "polish_ci_as", "thai_ci_as", "traditional_spanish_ci_as", "turkish_ci_as", "ukrainian_ci_as", "vietnamese_ci_as".
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public void setDBEngineConfig(String DBEngineConfig) {
        this.DBEngineConfig = DBEngineConfig;
    }

    /**
     * Get Network access list of the instance (this field has been deprecated)
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return NetworkAccessList Network access list of the instance (this field has been deprecated)
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public NetworkAccess [] getNetworkAccessList() {
        return this.NetworkAccessList;
    }

    /**
     * Set Network access list of the instance (this field has been deprecated)
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param NetworkAccessList Network access list of the instance (this field has been deprecated)
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setNetworkAccessList(NetworkAccess [] NetworkAccessList) {
        this.NetworkAccessList = NetworkAccessList;
    }

    /**
     * Get Whether the instance supports IPv6. Valid values:
<li>`0`: No.
<li>`1`: Yes.
Default value: `0`. 
     * @return SupportIpv6 Whether the instance supports IPv6. Valid values:
<li>`0`: No.
<li>`1`: Yes.
Default value: `0`.
     */
    public Long getSupportIpv6() {
        return this.SupportIpv6;
    }

    /**
     * Set Whether the instance supports IPv6. Valid values:
<li>`0`: No.
<li>`1`: Yes.
Default value: `0`.
     * @param SupportIpv6 Whether the instance supports IPv6. Valid values:
<li>`0`: No.
<li>`1`: Yes.
Default value: `0`.
     */
    public void setSupportIpv6(Long SupportIpv6) {
        this.SupportIpv6 = SupportIpv6;
    }

    public DBInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DBInstance(DBInstance source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.DBInstanceName != null) {
            this.DBInstanceName = new String(source.DBInstanceName);
        }
        if (source.DBInstanceStatus != null) {
            this.DBInstanceStatus = new String(source.DBInstanceStatus);
        }
        if (source.DBInstanceMemory != null) {
            this.DBInstanceMemory = new Long(source.DBInstanceMemory);
        }
        if (source.DBInstanceStorage != null) {
            this.DBInstanceStorage = new Long(source.DBInstanceStorage);
        }
        if (source.DBInstanceCpu != null) {
            this.DBInstanceCpu = new Long(source.DBInstanceCpu);
        }
        if (source.DBInstanceClass != null) {
            this.DBInstanceClass = new String(source.DBInstanceClass);
        }
        if (source.DBMajorVersion != null) {
            this.DBMajorVersion = new String(source.DBMajorVersion);
        }
        if (source.DBVersion != null) {
            this.DBVersion = new String(source.DBVersion);
        }
        if (source.DBKernelVersion != null) {
            this.DBKernelVersion = new String(source.DBKernelVersion);
        }
        if (source.DBInstanceType != null) {
            this.DBInstanceType = new String(source.DBInstanceType);
        }
        if (source.DBInstanceVersion != null) {
            this.DBInstanceVersion = new String(source.DBInstanceVersion);
        }
        if (source.DBCharset != null) {
            this.DBCharset = new String(source.DBCharset);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.IsolatedTime != null) {
            this.IsolatedTime = new String(source.IsolatedTime);
        }
        if (source.PayType != null) {
            this.PayType = new String(source.PayType);
        }
        if (source.AutoRenew != null) {
            this.AutoRenew = new Long(source.AutoRenew);
        }
        if (source.DBInstanceNetInfo != null) {
            this.DBInstanceNetInfo = new DBInstanceNetInfo[source.DBInstanceNetInfo.length];
            for (int i = 0; i < source.DBInstanceNetInfo.length; i++) {
                this.DBInstanceNetInfo[i] = new DBInstanceNetInfo(source.DBInstanceNetInfo[i]);
            }
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.Uid != null) {
            this.Uid = new Long(source.Uid);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.TagList != null) {
            this.TagList = new Tag[source.TagList.length];
            for (int i = 0; i < source.TagList.length; i++) {
                this.TagList[i] = new Tag(source.TagList[i]);
            }
        }
        if (source.MasterDBInstanceId != null) {
            this.MasterDBInstanceId = new String(source.MasterDBInstanceId);
        }
        if (source.ReadOnlyInstanceNum != null) {
            this.ReadOnlyInstanceNum = new Long(source.ReadOnlyInstanceNum);
        }
        if (source.StatusInReadonlyGroup != null) {
            this.StatusInReadonlyGroup = new String(source.StatusInReadonlyGroup);
        }
        if (source.OfflineTime != null) {
            this.OfflineTime = new String(source.OfflineTime);
        }
        if (source.DBNodeSet != null) {
            this.DBNodeSet = new DBNode[source.DBNodeSet.length];
            for (int i = 0; i < source.DBNodeSet.length; i++) {
                this.DBNodeSet[i] = new DBNode(source.DBNodeSet[i]);
            }
        }
        if (source.IsSupportTDE != null) {
            this.IsSupportTDE = new Long(source.IsSupportTDE);
        }
        if (source.DBEngine != null) {
            this.DBEngine = new String(source.DBEngine);
        }
        if (source.DBEngineConfig != null) {
            this.DBEngineConfig = new String(source.DBEngineConfig);
        }
        if (source.NetworkAccessList != null) {
            this.NetworkAccessList = new NetworkAccess[source.NetworkAccessList.length];
            for (int i = 0; i < source.NetworkAccessList.length; i++) {
                this.NetworkAccessList[i] = new NetworkAccess(source.NetworkAccessList[i]);
            }
        }
        if (source.SupportIpv6 != null) {
            this.SupportIpv6 = new Long(source.SupportIpv6);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "DBInstanceName", this.DBInstanceName);
        this.setParamSimple(map, prefix + "DBInstanceStatus", this.DBInstanceStatus);
        this.setParamSimple(map, prefix + "DBInstanceMemory", this.DBInstanceMemory);
        this.setParamSimple(map, prefix + "DBInstanceStorage", this.DBInstanceStorage);
        this.setParamSimple(map, prefix + "DBInstanceCpu", this.DBInstanceCpu);
        this.setParamSimple(map, prefix + "DBInstanceClass", this.DBInstanceClass);
        this.setParamSimple(map, prefix + "DBMajorVersion", this.DBMajorVersion);
        this.setParamSimple(map, prefix + "DBVersion", this.DBVersion);
        this.setParamSimple(map, prefix + "DBKernelVersion", this.DBKernelVersion);
        this.setParamSimple(map, prefix + "DBInstanceType", this.DBInstanceType);
        this.setParamSimple(map, prefix + "DBInstanceVersion", this.DBInstanceVersion);
        this.setParamSimple(map, prefix + "DBCharset", this.DBCharset);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "IsolatedTime", this.IsolatedTime);
        this.setParamSimple(map, prefix + "PayType", this.PayType);
        this.setParamSimple(map, prefix + "AutoRenew", this.AutoRenew);
        this.setParamArrayObj(map, prefix + "DBInstanceNetInfo.", this.DBInstanceNetInfo);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Uid", this.Uid);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArrayObj(map, prefix + "TagList.", this.TagList);
        this.setParamSimple(map, prefix + "MasterDBInstanceId", this.MasterDBInstanceId);
        this.setParamSimple(map, prefix + "ReadOnlyInstanceNum", this.ReadOnlyInstanceNum);
        this.setParamSimple(map, prefix + "StatusInReadonlyGroup", this.StatusInReadonlyGroup);
        this.setParamSimple(map, prefix + "OfflineTime", this.OfflineTime);
        this.setParamArrayObj(map, prefix + "DBNodeSet.", this.DBNodeSet);
        this.setParamSimple(map, prefix + "IsSupportTDE", this.IsSupportTDE);
        this.setParamSimple(map, prefix + "DBEngine", this.DBEngine);
        this.setParamSimple(map, prefix + "DBEngineConfig", this.DBEngineConfig);
        this.setParamArrayObj(map, prefix + "NetworkAccessList.", this.NetworkAccessList);
        this.setParamSimple(map, prefix + "SupportIpv6", this.SupportIpv6);

    }
}

