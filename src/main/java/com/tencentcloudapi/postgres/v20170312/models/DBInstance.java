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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DBInstance extends AbstractModel {

    /**
    * <p>Region of the instance, for example: ap-guangzhou, corresponds to the region field in RegionSet.</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>Availability zone to which the instance belongs, for example: ap-guangzhou-3, corresponds to the Zone field in ZoneSet.</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>VPC ID, such as vpc-e6w23k31. A valid VPC ID can be obtained by logging in to the console to query or by calling the API <a href="https://www.tencentcloud.com/document/api/215/15778?from_cn_redirect=1">DescribeVpcs</a> and acquiring the unVpcId field in API return.</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>VPC subnet ID, such as subnet-51lcif9y. An effective VPC subnet ID can be obtained by logging in to the console to query. You can also call API <a href="https://www.tencentcloud.com/document/api/215/15784?from_cn_redirect=1">DescribeSubnets</a> and get it from the unSubnetId field in API return.</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>Instance ID.</p>
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * <p>Instance name.</p>
    */
    @SerializedName("DBInstanceName")
    @Expose
    private String DBInstanceName;

    /**
    * <p>Instance status, including: `applying` (applying), `init` (to be initialized), `initing` (initializing), `running` (running), `limited run` (restricted operation), `isolating` (isolating), `isolated` (isolated), `disisolating` (de-isolating), `recycling` (recycling), `recycled` (recycled), `job running` (task executing), `offline` (offline), `migrating` (migrating), `expanding` (scaling out), `waitSwitch` (waiting to switch), `switching` (switching), `readonly` (readonly), `restarting` (restarting), `network changing` (network modification in progress), `upgrading` (kernel version upgrading), `audit-switching` (audit status changing), `primary-switching` (primary-secondary switching), `offlining` (offline), `deployment changing` (modify AZ), `cloning` (recovering data), `parameter modifying` (parameter modification in progress), `log-switching` (log status change), `restoring` (recovering), and `expanding` (scaling out)</p>
    */
    @SerializedName("DBInstanceStatus")
    @Expose
    private String DBInstanceStatus;

    /**
    * <p>Memory size allocated to the instance, measurement unit: GB</p>
    */
    @SerializedName("DBInstanceMemory")
    @Expose
    private Long DBInstanceMemory;

    /**
    * <p>Storage space size allocated to the instance, measurement unit: GB</p>
    */
    @SerializedName("DBInstanceStorage")
    @Expose
    private Long DBInstanceStorage;

    /**
    * <p>Number of CPUs allocated to the instance, unit: piece</p>
    */
    @SerializedName("DBInstanceCpu")
    @Expose
    private Long DBInstanceCpu;

    /**
    * <p>Purchasable specification ID.</p>
    */
    @SerializedName("DBInstanceClass")
    @Expose
    private String DBInstanceClass;

    /**
    * <p>PostgreSQL major version number. Version information can be obtained from <a href="https://www.tencentcloud.com/document/api/409/89018?from_cn_redirect=1">DescribeDBVersions</a>. Currently supports major versions 10, 11, 12, 13, 14, and 15.</p>
    */
    @SerializedName("DBMajorVersion")
    @Expose
    private String DBMajorVersion;

    /**
    * <p>PostgreSQL community major version + minor version number, such as 12.4. Version information can be obtained from <a href="https://www.tencentcloud.com/document/api/409/89018?from_cn_redirect=1">DescribeDBVersions</a>.</p>
    */
    @SerializedName("DBVersion")
    @Expose
    private String DBVersion;

    /**
    * <p>PostgreSQL Kernel Version, for example v12.7_r1.8. Version information can be obtained from <a href="https://www.tencentcloud.com/document/api/409/89018?from_cn_redirect=1">DescribeDBVersions</a>.</p>
    */
    @SerializedName("DBKernelVersion")
    @Expose
    private String DBKernelVersion;

    /**
    * <p>Instance types:</p><li>primary: Primary instance</li><li>readonly: Read-only instance</li><li>guard: Disaster recovery instance</li><li>temp: Temporary instance</li>
    */
    @SerializedName("DBInstanceType")
    @Expose
    private String DBInstanceType;

    /**
    * <p>Instance version currently only supports standard (dual-server high-availability edition, one master and one slave).</p>
    */
    @SerializedName("DBInstanceVersion")
    @Expose
    private String DBInstanceVersion;

    /**
    * <p>Instance character set, which currently supports only:</p><li>UTF8</li><li>LATIN1</li>
    */
    @SerializedName("DBCharset")
    @Expose
    private String DBCharset;

    /**
    * <p>Instance creation time.</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>The time when the instance executed the last update.</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>Instance expiration time.</p>
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * <p>Instance isolation time.</p>
    */
    @SerializedName("IsolatedTime")
    @Expose
    private String IsolatedTime;

    /**
    * <p>Billing mode:</p><li>prepaid: Yearly/monthly subscription, prepayment</li><li>postpaid: Pay-as-you-go, postpaid</li>
    */
    @SerializedName("PayType")
    @Expose
    private String PayType;

    /**
    * <p>Auto-renewal or not:</p><li>0: Manual renewal</li><li>1: Auto renewal</li>Default value: 0
    */
    @SerializedName("AutoRenew")
    @Expose
    private Long AutoRenew;

    /**
    * <p>Instance network connection information.</p>
    */
    @SerializedName("DBInstanceNetInfo")
    @Expose
    private DBInstanceNetInfo [] DBInstanceNetInfo;

    /**
    * <p>Machine type.</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>User's app id.</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>Uid of the instance.</p>
    */
    @SerializedName("Uid")
    @Expose
    private Long Uid;

    /**
    * <p>Project ID.</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * <p>Tag information associated with the instance.</p>
    */
    @SerializedName("TagList")
    @Expose
    private Tag [] TagList;

    /**
    * <p>Primary instance information. Returned only when the instance is a read-only instance.</p>
    */
    @SerializedName("MasterDBInstanceId")
    @Expose
    private String MasterDBInstanceId;

    /**
    * <p>Number of read-only instances.</p>
    */
    @SerializedName("ReadOnlyInstanceNum")
    @Expose
    private Long ReadOnlyInstanceNum;

    /**
    * <p>State of the read-only instance in the read-only group.</p>
    */
    @SerializedName("StatusInReadonlyGroup")
    @Expose
    private String StatusInReadonlyGroup;

    /**
    * <p>Offline time.</p>
    */
    @SerializedName("OfflineTime")
    @Expose
    private String OfflineTime;

    /**
    * <p>Instance node information.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DBNodeSet")
    @Expose
    private DBNode [] DBNodeSet;

    /**
    * <p>Whether the instance supports TDE data encryption:</p><li>0: Not supported</li><li>1: Supported</li>Default value: 0. For TDE data encryption, see [Overview of Data Transparent Encryption](https://www.tencentcloud.com/document/product/409/71748?from_cn_redirect=1).
    */
    @SerializedName("IsSupportTDE")
    @Expose
    private Long IsSupportTDE;

    /**
    * <p>Database engine, support:</p><li>`postgresql`: TencentDB for PostgreSQL</li><li>`mssql_compatible`: MSSQL compatible - TencentDB for PostgreSQL</li>Default value: postgresql
    */
    @SerializedName("DBEngine")
    @Expose
    private String DBEngine;

    /**
    * <p>Configuration information for the database engine. The configuration format is as follows:<br>{&quot;$key1&quot;:&quot;$value1&quot;, &quot;$key2&quot;:&quot;$value2&quot;}<br>Supported engines:<br>mssql_compatible engine:</p><li>migrationMode: Database schema, optional parameter. Valid values: single-db (single-database mode), multi-db (multi-database mode). Default is single-db.</li><li>defaultLocale: Sorting area rule, optional parameter, cannot be modified after initialization. Default is en_US. Valid values include: "af_ZA", "sq_AL", "ar_DZ", "ar_BH", "ar_EG", "ar_IQ", "ar_JO", "ar_KW", "ar_LB", "ar_LY", "ar_MA", "ar_OM", "ar_QA", "ar_SA", "ar_SY", "ar_TN", "ar_AE", "ar_YE", "hy_AM", "az_Cyrl_AZ", "az_Latn_AZ", "eu_ES", "be_BY", "bg_BG", "ca_ES", "zh_HK", "zh_MO", "zh_CN", "zh_SG", "zh_TW", "hr_HR", "cs_CZ", "da_DK", "nl_BE", "nl_NL", "en_AU", "en_BZ", "en_CA", "en_IE", "en_JM", "en_NZ", "en_PH", "en_ZA", "en_TT", "en_GB", "en_US", "en_ZW", "et_EE", "fo_FO", "fa_IR", "fi_FI", "fr_BE", "fr_CA", "fr_FR", "fr_LU", "fr_MC", "fr_CH", "mk_MK", "ka_GE", "de_AT", "de_DE", "de_LI", "de_LU", "de_CH", "el_GR", "gu_IN", "he_IL", "hi_IN", "hu_HU", "is_IS", "id_ID", "it_IT", "it_CH", "ja_JP", "kn_IN", "kok_IN", "ko_KR", "ky_KG", "lv_LV", "lt_LT", "ms_BN", "ms_MY", "mr_IN", "mn_MN", "nb_NO", "nn_NO", "pl_PL", "pt_BR", "pt_PT", "pa_IN", "ro_RO", "ru_RU", "sa_IN", "sr_Cyrl_RS", "sr_Latn_RS", "sk_SK", "sl_SI", "es_AR", "es_BO", "es_CL", "es_CO", "es_CR", "es_DO", "es_EC", "es_SV", "es_GT", "es_HN", "es_MX", "es_NI", "es_PA", "es_PY","es_PE", "es_PR", "es_ES", "es_TRADITIONAL", "es_UY", "es_VE", "sw_KE", "sv_FI", "sv_SE", "tt_RU", "te_IN", "th_TH", "tr_TR", "uk_UA", "ur_IN", "ur_PK", "uz_Cyrl_UZ", "uz_Latn_UZ", "vi_VN".</li><li>serverCollationName: Collation name, optional parameter, cannot be modified after initialization. Default is sql_latin1_general_cp1_ci_as. Valid values include: "bbf_unicode_general_ci_as", "bbf_unicode_cp1_ci_as", "bbf_unicode_CP1250_ci_as", "bbf_unicode_CP1251_ci_as", "bbf_unicode_cp1253_ci_as", "bbf_unicode_cp1254_ci_as", "bbf_unicode_cp1255_ci_as", "bbf_unicode_cp1256_ci_as", "bbf_unicode_cp1257_ci_as", "bbf_unicode_cp1258_ci_as", "bbf_unicode_cp874_ci_as", "sql_latin1_general_cp1250_ci_as", "sql_latin1_general_cp1251_ci_as", "sql_latin1_general_cp1_ci_as", "sql_latin1_general_cp1253_ci_as", "sql_latin1_general_cp1254_ci_as", "sql_latin1_general_cp1255_ci_as","sql_latin1_general_cp1256_ci_as", "sql_latin1_general_cp1257_ci_as", "sql_latin1_general_cp1258_ci_as", "chinese_prc_ci_as", "cyrillic_general_ci_as", "finnish_swedish_ci_as", "french_ci_as", "japanese_ci_as", "korean_wansung_ci_as", "latin1_general_ci_as", "modern_spanish_ci_as", "polish_ci_as", "thai_ci_as", "traditional_spanish_ci_as", "turkish_ci_as", "ukrainian_ci_as", "vietnamese_ci_as".</li>
    */
    @SerializedName("DBEngineConfig")
    @Expose
    private String DBEngineConfig;

    /**
    * <p>Instance network information list (deprecated)</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NetworkAccessList")
    @Expose
    private NetworkAccess [] NetworkAccessList;

    /**
    * <p>Whether the instance supports Ipv6:</p><li>0: No</li><li>1: Yes</li>Default value: 0
    */
    @SerializedName("SupportIpv6")
    @Expose
    private Long SupportIpv6;

    /**
    * <p>Number of cpu cores that have been elastically scaled out for the instance</p>
    */
    @SerializedName("ExpandedCpu")
    @Expose
    private Long ExpandedCpu;

    /**
    * <p>Whether to enable deletion protection for the instance, values as follows:</p><ul><li>true: enable deletion protection</li><li>false: disable deletion protection</li></ul>
    */
    @SerializedName("DeletionProtection")
    @Expose
    private Boolean DeletionProtection;

    /**
    * <p>Instance storage type. Available values: PHYSICAL_LOCAL_SSD: LOCAL SSD hard disk of PHYSICAL machine; CLOUD_PREMIUM: high-performance CLOUD block storage; CLOUD_SSD: SSD CLOUD disk; CLOUD_HSSD: enhanced SSD CLOUD disk.</p>
    */
    @SerializedName("DBInstanceStorageType")
    @Expose
    private String DBInstanceStorageType;

    /**
     * Get <p>Region of the instance, for example: ap-guangzhou, corresponds to the region field in RegionSet.</p> 
     * @return Region <p>Region of the instance, for example: ap-guangzhou, corresponds to the region field in RegionSet.</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>Region of the instance, for example: ap-guangzhou, corresponds to the region field in RegionSet.</p>
     * @param Region <p>Region of the instance, for example: ap-guangzhou, corresponds to the region field in RegionSet.</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>Availability zone to which the instance belongs, for example: ap-guangzhou-3, corresponds to the Zone field in ZoneSet.</p> 
     * @return Zone <p>Availability zone to which the instance belongs, for example: ap-guangzhou-3, corresponds to the Zone field in ZoneSet.</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>Availability zone to which the instance belongs, for example: ap-guangzhou-3, corresponds to the Zone field in ZoneSet.</p>
     * @param Zone <p>Availability zone to which the instance belongs, for example: ap-guangzhou-3, corresponds to the Zone field in ZoneSet.</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>VPC ID, such as vpc-e6w23k31. A valid VPC ID can be obtained by logging in to the console to query or by calling the API <a href="https://www.tencentcloud.com/document/api/215/15778?from_cn_redirect=1">DescribeVpcs</a> and acquiring the unVpcId field in API return.</p> 
     * @return VpcId <p>VPC ID, such as vpc-e6w23k31. A valid VPC ID can be obtained by logging in to the console to query or by calling the API <a href="https://www.tencentcloud.com/document/api/215/15778?from_cn_redirect=1">DescribeVpcs</a> and acquiring the unVpcId field in API return.</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>VPC ID, such as vpc-e6w23k31. A valid VPC ID can be obtained by logging in to the console to query or by calling the API <a href="https://www.tencentcloud.com/document/api/215/15778?from_cn_redirect=1">DescribeVpcs</a> and acquiring the unVpcId field in API return.</p>
     * @param VpcId <p>VPC ID, such as vpc-e6w23k31. A valid VPC ID can be obtained by logging in to the console to query or by calling the API <a href="https://www.tencentcloud.com/document/api/215/15778?from_cn_redirect=1">DescribeVpcs</a> and acquiring the unVpcId field in API return.</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>VPC subnet ID, such as subnet-51lcif9y. An effective VPC subnet ID can be obtained by logging in to the console to query. You can also call API <a href="https://www.tencentcloud.com/document/api/215/15784?from_cn_redirect=1">DescribeSubnets</a> and get it from the unSubnetId field in API return.</p> 
     * @return SubnetId <p>VPC subnet ID, such as subnet-51lcif9y. An effective VPC subnet ID can be obtained by logging in to the console to query. You can also call API <a href="https://www.tencentcloud.com/document/api/215/15784?from_cn_redirect=1">DescribeSubnets</a> and get it from the unSubnetId field in API return.</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>VPC subnet ID, such as subnet-51lcif9y. An effective VPC subnet ID can be obtained by logging in to the console to query. You can also call API <a href="https://www.tencentcloud.com/document/api/215/15784?from_cn_redirect=1">DescribeSubnets</a> and get it from the unSubnetId field in API return.</p>
     * @param SubnetId <p>VPC subnet ID, such as subnet-51lcif9y. An effective VPC subnet ID can be obtained by logging in to the console to query. You can also call API <a href="https://www.tencentcloud.com/document/api/215/15784?from_cn_redirect=1">DescribeSubnets</a> and get it from the unSubnetId field in API return.</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>Instance ID.</p> 
     * @return DBInstanceId <p>Instance ID.</p>
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set <p>Instance ID.</p>
     * @param DBInstanceId <p>Instance ID.</p>
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get <p>Instance name.</p> 
     * @return DBInstanceName <p>Instance name.</p>
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    /**
     * Set <p>Instance name.</p>
     * @param DBInstanceName <p>Instance name.</p>
     */
    public void setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
    }

    /**
     * Get <p>Instance status, including: `applying` (applying), `init` (to be initialized), `initing` (initializing), `running` (running), `limited run` (restricted operation), `isolating` (isolating), `isolated` (isolated), `disisolating` (de-isolating), `recycling` (recycling), `recycled` (recycled), `job running` (task executing), `offline` (offline), `migrating` (migrating), `expanding` (scaling out), `waitSwitch` (waiting to switch), `switching` (switching), `readonly` (readonly), `restarting` (restarting), `network changing` (network modification in progress), `upgrading` (kernel version upgrading), `audit-switching` (audit status changing), `primary-switching` (primary-secondary switching), `offlining` (offline), `deployment changing` (modify AZ), `cloning` (recovering data), `parameter modifying` (parameter modification in progress), `log-switching` (log status change), `restoring` (recovering), and `expanding` (scaling out)</p> 
     * @return DBInstanceStatus <p>Instance status, including: `applying` (applying), `init` (to be initialized), `initing` (initializing), `running` (running), `limited run` (restricted operation), `isolating` (isolating), `isolated` (isolated), `disisolating` (de-isolating), `recycling` (recycling), `recycled` (recycled), `job running` (task executing), `offline` (offline), `migrating` (migrating), `expanding` (scaling out), `waitSwitch` (waiting to switch), `switching` (switching), `readonly` (readonly), `restarting` (restarting), `network changing` (network modification in progress), `upgrading` (kernel version upgrading), `audit-switching` (audit status changing), `primary-switching` (primary-secondary switching), `offlining` (offline), `deployment changing` (modify AZ), `cloning` (recovering data), `parameter modifying` (parameter modification in progress), `log-switching` (log status change), `restoring` (recovering), and `expanding` (scaling out)</p>
     */
    public String getDBInstanceStatus() {
        return this.DBInstanceStatus;
    }

    /**
     * Set <p>Instance status, including: `applying` (applying), `init` (to be initialized), `initing` (initializing), `running` (running), `limited run` (restricted operation), `isolating` (isolating), `isolated` (isolated), `disisolating` (de-isolating), `recycling` (recycling), `recycled` (recycled), `job running` (task executing), `offline` (offline), `migrating` (migrating), `expanding` (scaling out), `waitSwitch` (waiting to switch), `switching` (switching), `readonly` (readonly), `restarting` (restarting), `network changing` (network modification in progress), `upgrading` (kernel version upgrading), `audit-switching` (audit status changing), `primary-switching` (primary-secondary switching), `offlining` (offline), `deployment changing` (modify AZ), `cloning` (recovering data), `parameter modifying` (parameter modification in progress), `log-switching` (log status change), `restoring` (recovering), and `expanding` (scaling out)</p>
     * @param DBInstanceStatus <p>Instance status, including: `applying` (applying), `init` (to be initialized), `initing` (initializing), `running` (running), `limited run` (restricted operation), `isolating` (isolating), `isolated` (isolated), `disisolating` (de-isolating), `recycling` (recycling), `recycled` (recycled), `job running` (task executing), `offline` (offline), `migrating` (migrating), `expanding` (scaling out), `waitSwitch` (waiting to switch), `switching` (switching), `readonly` (readonly), `restarting` (restarting), `network changing` (network modification in progress), `upgrading` (kernel version upgrading), `audit-switching` (audit status changing), `primary-switching` (primary-secondary switching), `offlining` (offline), `deployment changing` (modify AZ), `cloning` (recovering data), `parameter modifying` (parameter modification in progress), `log-switching` (log status change), `restoring` (recovering), and `expanding` (scaling out)</p>
     */
    public void setDBInstanceStatus(String DBInstanceStatus) {
        this.DBInstanceStatus = DBInstanceStatus;
    }

    /**
     * Get <p>Memory size allocated to the instance, measurement unit: GB</p> 
     * @return DBInstanceMemory <p>Memory size allocated to the instance, measurement unit: GB</p>
     */
    public Long getDBInstanceMemory() {
        return this.DBInstanceMemory;
    }

    /**
     * Set <p>Memory size allocated to the instance, measurement unit: GB</p>
     * @param DBInstanceMemory <p>Memory size allocated to the instance, measurement unit: GB</p>
     */
    public void setDBInstanceMemory(Long DBInstanceMemory) {
        this.DBInstanceMemory = DBInstanceMemory;
    }

    /**
     * Get <p>Storage space size allocated to the instance, measurement unit: GB</p> 
     * @return DBInstanceStorage <p>Storage space size allocated to the instance, measurement unit: GB</p>
     */
    public Long getDBInstanceStorage() {
        return this.DBInstanceStorage;
    }

    /**
     * Set <p>Storage space size allocated to the instance, measurement unit: GB</p>
     * @param DBInstanceStorage <p>Storage space size allocated to the instance, measurement unit: GB</p>
     */
    public void setDBInstanceStorage(Long DBInstanceStorage) {
        this.DBInstanceStorage = DBInstanceStorage;
    }

    /**
     * Get <p>Number of CPUs allocated to the instance, unit: piece</p> 
     * @return DBInstanceCpu <p>Number of CPUs allocated to the instance, unit: piece</p>
     */
    public Long getDBInstanceCpu() {
        return this.DBInstanceCpu;
    }

    /**
     * Set <p>Number of CPUs allocated to the instance, unit: piece</p>
     * @param DBInstanceCpu <p>Number of CPUs allocated to the instance, unit: piece</p>
     */
    public void setDBInstanceCpu(Long DBInstanceCpu) {
        this.DBInstanceCpu = DBInstanceCpu;
    }

    /**
     * Get <p>Purchasable specification ID.</p> 
     * @return DBInstanceClass <p>Purchasable specification ID.</p>
     */
    public String getDBInstanceClass() {
        return this.DBInstanceClass;
    }

    /**
     * Set <p>Purchasable specification ID.</p>
     * @param DBInstanceClass <p>Purchasable specification ID.</p>
     */
    public void setDBInstanceClass(String DBInstanceClass) {
        this.DBInstanceClass = DBInstanceClass;
    }

    /**
     * Get <p>PostgreSQL major version number. Version information can be obtained from <a href="https://www.tencentcloud.com/document/api/409/89018?from_cn_redirect=1">DescribeDBVersions</a>. Currently supports major versions 10, 11, 12, 13, 14, and 15.</p> 
     * @return DBMajorVersion <p>PostgreSQL major version number. Version information can be obtained from <a href="https://www.tencentcloud.com/document/api/409/89018?from_cn_redirect=1">DescribeDBVersions</a>. Currently supports major versions 10, 11, 12, 13, 14, and 15.</p>
     */
    public String getDBMajorVersion() {
        return this.DBMajorVersion;
    }

    /**
     * Set <p>PostgreSQL major version number. Version information can be obtained from <a href="https://www.tencentcloud.com/document/api/409/89018?from_cn_redirect=1">DescribeDBVersions</a>. Currently supports major versions 10, 11, 12, 13, 14, and 15.</p>
     * @param DBMajorVersion <p>PostgreSQL major version number. Version information can be obtained from <a href="https://www.tencentcloud.com/document/api/409/89018?from_cn_redirect=1">DescribeDBVersions</a>. Currently supports major versions 10, 11, 12, 13, 14, and 15.</p>
     */
    public void setDBMajorVersion(String DBMajorVersion) {
        this.DBMajorVersion = DBMajorVersion;
    }

    /**
     * Get <p>PostgreSQL community major version + minor version number, such as 12.4. Version information can be obtained from <a href="https://www.tencentcloud.com/document/api/409/89018?from_cn_redirect=1">DescribeDBVersions</a>.</p> 
     * @return DBVersion <p>PostgreSQL community major version + minor version number, such as 12.4. Version information can be obtained from <a href="https://www.tencentcloud.com/document/api/409/89018?from_cn_redirect=1">DescribeDBVersions</a>.</p>
     */
    public String getDBVersion() {
        return this.DBVersion;
    }

    /**
     * Set <p>PostgreSQL community major version + minor version number, such as 12.4. Version information can be obtained from <a href="https://www.tencentcloud.com/document/api/409/89018?from_cn_redirect=1">DescribeDBVersions</a>.</p>
     * @param DBVersion <p>PostgreSQL community major version + minor version number, such as 12.4. Version information can be obtained from <a href="https://www.tencentcloud.com/document/api/409/89018?from_cn_redirect=1">DescribeDBVersions</a>.</p>
     */
    public void setDBVersion(String DBVersion) {
        this.DBVersion = DBVersion;
    }

    /**
     * Get <p>PostgreSQL Kernel Version, for example v12.7_r1.8. Version information can be obtained from <a href="https://www.tencentcloud.com/document/api/409/89018?from_cn_redirect=1">DescribeDBVersions</a>.</p> 
     * @return DBKernelVersion <p>PostgreSQL Kernel Version, for example v12.7_r1.8. Version information can be obtained from <a href="https://www.tencentcloud.com/document/api/409/89018?from_cn_redirect=1">DescribeDBVersions</a>.</p>
     */
    public String getDBKernelVersion() {
        return this.DBKernelVersion;
    }

    /**
     * Set <p>PostgreSQL Kernel Version, for example v12.7_r1.8. Version information can be obtained from <a href="https://www.tencentcloud.com/document/api/409/89018?from_cn_redirect=1">DescribeDBVersions</a>.</p>
     * @param DBKernelVersion <p>PostgreSQL Kernel Version, for example v12.7_r1.8. Version information can be obtained from <a href="https://www.tencentcloud.com/document/api/409/89018?from_cn_redirect=1">DescribeDBVersions</a>.</p>
     */
    public void setDBKernelVersion(String DBKernelVersion) {
        this.DBKernelVersion = DBKernelVersion;
    }

    /**
     * Get <p>Instance types:</p><li>primary: Primary instance</li><li>readonly: Read-only instance</li><li>guard: Disaster recovery instance</li><li>temp: Temporary instance</li> 
     * @return DBInstanceType <p>Instance types:</p><li>primary: Primary instance</li><li>readonly: Read-only instance</li><li>guard: Disaster recovery instance</li><li>temp: Temporary instance</li>
     */
    public String getDBInstanceType() {
        return this.DBInstanceType;
    }

    /**
     * Set <p>Instance types:</p><li>primary: Primary instance</li><li>readonly: Read-only instance</li><li>guard: Disaster recovery instance</li><li>temp: Temporary instance</li>
     * @param DBInstanceType <p>Instance types:</p><li>primary: Primary instance</li><li>readonly: Read-only instance</li><li>guard: Disaster recovery instance</li><li>temp: Temporary instance</li>
     */
    public void setDBInstanceType(String DBInstanceType) {
        this.DBInstanceType = DBInstanceType;
    }

    /**
     * Get <p>Instance version currently only supports standard (dual-server high-availability edition, one master and one slave).</p> 
     * @return DBInstanceVersion <p>Instance version currently only supports standard (dual-server high-availability edition, one master and one slave).</p>
     */
    public String getDBInstanceVersion() {
        return this.DBInstanceVersion;
    }

    /**
     * Set <p>Instance version currently only supports standard (dual-server high-availability edition, one master and one slave).</p>
     * @param DBInstanceVersion <p>Instance version currently only supports standard (dual-server high-availability edition, one master and one slave).</p>
     */
    public void setDBInstanceVersion(String DBInstanceVersion) {
        this.DBInstanceVersion = DBInstanceVersion;
    }

    /**
     * Get <p>Instance character set, which currently supports only:</p><li>UTF8</li><li>LATIN1</li> 
     * @return DBCharset <p>Instance character set, which currently supports only:</p><li>UTF8</li><li>LATIN1</li>
     */
    public String getDBCharset() {
        return this.DBCharset;
    }

    /**
     * Set <p>Instance character set, which currently supports only:</p><li>UTF8</li><li>LATIN1</li>
     * @param DBCharset <p>Instance character set, which currently supports only:</p><li>UTF8</li><li>LATIN1</li>
     */
    public void setDBCharset(String DBCharset) {
        this.DBCharset = DBCharset;
    }

    /**
     * Get <p>Instance creation time.</p> 
     * @return CreateTime <p>Instance creation time.</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Instance creation time.</p>
     * @param CreateTime <p>Instance creation time.</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>The time when the instance executed the last update.</p> 
     * @return UpdateTime <p>The time when the instance executed the last update.</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>The time when the instance executed the last update.</p>
     * @param UpdateTime <p>The time when the instance executed the last update.</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>Instance expiration time.</p> 
     * @return ExpireTime <p>Instance expiration time.</p>
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set <p>Instance expiration time.</p>
     * @param ExpireTime <p>Instance expiration time.</p>
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get <p>Instance isolation time.</p> 
     * @return IsolatedTime <p>Instance isolation time.</p>
     */
    public String getIsolatedTime() {
        return this.IsolatedTime;
    }

    /**
     * Set <p>Instance isolation time.</p>
     * @param IsolatedTime <p>Instance isolation time.</p>
     */
    public void setIsolatedTime(String IsolatedTime) {
        this.IsolatedTime = IsolatedTime;
    }

    /**
     * Get <p>Billing mode:</p><li>prepaid: Yearly/monthly subscription, prepayment</li><li>postpaid: Pay-as-you-go, postpaid</li> 
     * @return PayType <p>Billing mode:</p><li>prepaid: Yearly/monthly subscription, prepayment</li><li>postpaid: Pay-as-you-go, postpaid</li>
     */
    public String getPayType() {
        return this.PayType;
    }

    /**
     * Set <p>Billing mode:</p><li>prepaid: Yearly/monthly subscription, prepayment</li><li>postpaid: Pay-as-you-go, postpaid</li>
     * @param PayType <p>Billing mode:</p><li>prepaid: Yearly/monthly subscription, prepayment</li><li>postpaid: Pay-as-you-go, postpaid</li>
     */
    public void setPayType(String PayType) {
        this.PayType = PayType;
    }

    /**
     * Get <p>Auto-renewal or not:</p><li>0: Manual renewal</li><li>1: Auto renewal</li>Default value: 0 
     * @return AutoRenew <p>Auto-renewal or not:</p><li>0: Manual renewal</li><li>1: Auto renewal</li>Default value: 0
     */
    public Long getAutoRenew() {
        return this.AutoRenew;
    }

    /**
     * Set <p>Auto-renewal or not:</p><li>0: Manual renewal</li><li>1: Auto renewal</li>Default value: 0
     * @param AutoRenew <p>Auto-renewal or not:</p><li>0: Manual renewal</li><li>1: Auto renewal</li>Default value: 0
     */
    public void setAutoRenew(Long AutoRenew) {
        this.AutoRenew = AutoRenew;
    }

    /**
     * Get <p>Instance network connection information.</p> 
     * @return DBInstanceNetInfo <p>Instance network connection information.</p>
     */
    public DBInstanceNetInfo [] getDBInstanceNetInfo() {
        return this.DBInstanceNetInfo;
    }

    /**
     * Set <p>Instance network connection information.</p>
     * @param DBInstanceNetInfo <p>Instance network connection information.</p>
     */
    public void setDBInstanceNetInfo(DBInstanceNetInfo [] DBInstanceNetInfo) {
        this.DBInstanceNetInfo = DBInstanceNetInfo;
    }

    /**
     * Get <p>Machine type.</p> 
     * @return Type <p>Machine type.</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>Machine type.</p>
     * @param Type <p>Machine type.</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>User's app id.</p> 
     * @return AppId <p>User's app id.</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>User's app id.</p>
     * @param AppId <p>User's app id.</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>Uid of the instance.</p> 
     * @return Uid <p>Uid of the instance.</p>
     */
    public Long getUid() {
        return this.Uid;
    }

    /**
     * Set <p>Uid of the instance.</p>
     * @param Uid <p>Uid of the instance.</p>
     */
    public void setUid(Long Uid) {
        this.Uid = Uid;
    }

    /**
     * Get <p>Project ID.</p> 
     * @return ProjectId <p>Project ID.</p>
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>Project ID.</p>
     * @param ProjectId <p>Project ID.</p>
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>Tag information associated with the instance.</p> 
     * @return TagList <p>Tag information associated with the instance.</p>
     */
    public Tag [] getTagList() {
        return this.TagList;
    }

    /**
     * Set <p>Tag information associated with the instance.</p>
     * @param TagList <p>Tag information associated with the instance.</p>
     */
    public void setTagList(Tag [] TagList) {
        this.TagList = TagList;
    }

    /**
     * Get <p>Primary instance information. Returned only when the instance is a read-only instance.</p> 
     * @return MasterDBInstanceId <p>Primary instance information. Returned only when the instance is a read-only instance.</p>
     */
    public String getMasterDBInstanceId() {
        return this.MasterDBInstanceId;
    }

    /**
     * Set <p>Primary instance information. Returned only when the instance is a read-only instance.</p>
     * @param MasterDBInstanceId <p>Primary instance information. Returned only when the instance is a read-only instance.</p>
     */
    public void setMasterDBInstanceId(String MasterDBInstanceId) {
        this.MasterDBInstanceId = MasterDBInstanceId;
    }

    /**
     * Get <p>Number of read-only instances.</p> 
     * @return ReadOnlyInstanceNum <p>Number of read-only instances.</p>
     */
    public Long getReadOnlyInstanceNum() {
        return this.ReadOnlyInstanceNum;
    }

    /**
     * Set <p>Number of read-only instances.</p>
     * @param ReadOnlyInstanceNum <p>Number of read-only instances.</p>
     */
    public void setReadOnlyInstanceNum(Long ReadOnlyInstanceNum) {
        this.ReadOnlyInstanceNum = ReadOnlyInstanceNum;
    }

    /**
     * Get <p>State of the read-only instance in the read-only group.</p> 
     * @return StatusInReadonlyGroup <p>State of the read-only instance in the read-only group.</p>
     */
    public String getStatusInReadonlyGroup() {
        return this.StatusInReadonlyGroup;
    }

    /**
     * Set <p>State of the read-only instance in the read-only group.</p>
     * @param StatusInReadonlyGroup <p>State of the read-only instance in the read-only group.</p>
     */
    public void setStatusInReadonlyGroup(String StatusInReadonlyGroup) {
        this.StatusInReadonlyGroup = StatusInReadonlyGroup;
    }

    /**
     * Get <p>Offline time.</p> 
     * @return OfflineTime <p>Offline time.</p>
     */
    public String getOfflineTime() {
        return this.OfflineTime;
    }

    /**
     * Set <p>Offline time.</p>
     * @param OfflineTime <p>Offline time.</p>
     */
    public void setOfflineTime(String OfflineTime) {
        this.OfflineTime = OfflineTime;
    }

    /**
     * Get <p>Instance node information.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DBNodeSet <p>Instance node information.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public DBNode [] getDBNodeSet() {
        return this.DBNodeSet;
    }

    /**
     * Set <p>Instance node information.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DBNodeSet <p>Instance node information.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDBNodeSet(DBNode [] DBNodeSet) {
        this.DBNodeSet = DBNodeSet;
    }

    /**
     * Get <p>Whether the instance supports TDE data encryption:</p><li>0: Not supported</li><li>1: Supported</li>Default value: 0. For TDE data encryption, see [Overview of Data Transparent Encryption](https://www.tencentcloud.com/document/product/409/71748?from_cn_redirect=1). 
     * @return IsSupportTDE <p>Whether the instance supports TDE data encryption:</p><li>0: Not supported</li><li>1: Supported</li>Default value: 0. For TDE data encryption, see [Overview of Data Transparent Encryption](https://www.tencentcloud.com/document/product/409/71748?from_cn_redirect=1).
     */
    public Long getIsSupportTDE() {
        return this.IsSupportTDE;
    }

    /**
     * Set <p>Whether the instance supports TDE data encryption:</p><li>0: Not supported</li><li>1: Supported</li>Default value: 0. For TDE data encryption, see [Overview of Data Transparent Encryption](https://www.tencentcloud.com/document/product/409/71748?from_cn_redirect=1).
     * @param IsSupportTDE <p>Whether the instance supports TDE data encryption:</p><li>0: Not supported</li><li>1: Supported</li>Default value: 0. For TDE data encryption, see [Overview of Data Transparent Encryption](https://www.tencentcloud.com/document/product/409/71748?from_cn_redirect=1).
     */
    public void setIsSupportTDE(Long IsSupportTDE) {
        this.IsSupportTDE = IsSupportTDE;
    }

    /**
     * Get <p>Database engine, support:</p><li>`postgresql`: TencentDB for PostgreSQL</li><li>`mssql_compatible`: MSSQL compatible - TencentDB for PostgreSQL</li>Default value: postgresql 
     * @return DBEngine <p>Database engine, support:</p><li>`postgresql`: TencentDB for PostgreSQL</li><li>`mssql_compatible`: MSSQL compatible - TencentDB for PostgreSQL</li>Default value: postgresql
     */
    public String getDBEngine() {
        return this.DBEngine;
    }

    /**
     * Set <p>Database engine, support:</p><li>`postgresql`: TencentDB for PostgreSQL</li><li>`mssql_compatible`: MSSQL compatible - TencentDB for PostgreSQL</li>Default value: postgresql
     * @param DBEngine <p>Database engine, support:</p><li>`postgresql`: TencentDB for PostgreSQL</li><li>`mssql_compatible`: MSSQL compatible - TencentDB for PostgreSQL</li>Default value: postgresql
     */
    public void setDBEngine(String DBEngine) {
        this.DBEngine = DBEngine;
    }

    /**
     * Get <p>Configuration information for the database engine. The configuration format is as follows:<br>{&quot;$key1&quot;:&quot;$value1&quot;, &quot;$key2&quot;:&quot;$value2&quot;}<br>Supported engines:<br>mssql_compatible engine:</p><li>migrationMode: Database schema, optional parameter. Valid values: single-db (single-database mode), multi-db (multi-database mode). Default is single-db.</li><li>defaultLocale: Sorting area rule, optional parameter, cannot be modified after initialization. Default is en_US. Valid values include: "af_ZA", "sq_AL", "ar_DZ", "ar_BH", "ar_EG", "ar_IQ", "ar_JO", "ar_KW", "ar_LB", "ar_LY", "ar_MA", "ar_OM", "ar_QA", "ar_SA", "ar_SY", "ar_TN", "ar_AE", "ar_YE", "hy_AM", "az_Cyrl_AZ", "az_Latn_AZ", "eu_ES", "be_BY", "bg_BG", "ca_ES", "zh_HK", "zh_MO", "zh_CN", "zh_SG", "zh_TW", "hr_HR", "cs_CZ", "da_DK", "nl_BE", "nl_NL", "en_AU", "en_BZ", "en_CA", "en_IE", "en_JM", "en_NZ", "en_PH", "en_ZA", "en_TT", "en_GB", "en_US", "en_ZW", "et_EE", "fo_FO", "fa_IR", "fi_FI", "fr_BE", "fr_CA", "fr_FR", "fr_LU", "fr_MC", "fr_CH", "mk_MK", "ka_GE", "de_AT", "de_DE", "de_LI", "de_LU", "de_CH", "el_GR", "gu_IN", "he_IL", "hi_IN", "hu_HU", "is_IS", "id_ID", "it_IT", "it_CH", "ja_JP", "kn_IN", "kok_IN", "ko_KR", "ky_KG", "lv_LV", "lt_LT", "ms_BN", "ms_MY", "mr_IN", "mn_MN", "nb_NO", "nn_NO", "pl_PL", "pt_BR", "pt_PT", "pa_IN", "ro_RO", "ru_RU", "sa_IN", "sr_Cyrl_RS", "sr_Latn_RS", "sk_SK", "sl_SI", "es_AR", "es_BO", "es_CL", "es_CO", "es_CR", "es_DO", "es_EC", "es_SV", "es_GT", "es_HN", "es_MX", "es_NI", "es_PA", "es_PY","es_PE", "es_PR", "es_ES", "es_TRADITIONAL", "es_UY", "es_VE", "sw_KE", "sv_FI", "sv_SE", "tt_RU", "te_IN", "th_TH", "tr_TR", "uk_UA", "ur_IN", "ur_PK", "uz_Cyrl_UZ", "uz_Latn_UZ", "vi_VN".</li><li>serverCollationName: Collation name, optional parameter, cannot be modified after initialization. Default is sql_latin1_general_cp1_ci_as. Valid values include: "bbf_unicode_general_ci_as", "bbf_unicode_cp1_ci_as", "bbf_unicode_CP1250_ci_as", "bbf_unicode_CP1251_ci_as", "bbf_unicode_cp1253_ci_as", "bbf_unicode_cp1254_ci_as", "bbf_unicode_cp1255_ci_as", "bbf_unicode_cp1256_ci_as", "bbf_unicode_cp1257_ci_as", "bbf_unicode_cp1258_ci_as", "bbf_unicode_cp874_ci_as", "sql_latin1_general_cp1250_ci_as", "sql_latin1_general_cp1251_ci_as", "sql_latin1_general_cp1_ci_as", "sql_latin1_general_cp1253_ci_as", "sql_latin1_general_cp1254_ci_as", "sql_latin1_general_cp1255_ci_as","sql_latin1_general_cp1256_ci_as", "sql_latin1_general_cp1257_ci_as", "sql_latin1_general_cp1258_ci_as", "chinese_prc_ci_as", "cyrillic_general_ci_as", "finnish_swedish_ci_as", "french_ci_as", "japanese_ci_as", "korean_wansung_ci_as", "latin1_general_ci_as", "modern_spanish_ci_as", "polish_ci_as", "thai_ci_as", "traditional_spanish_ci_as", "turkish_ci_as", "ukrainian_ci_as", "vietnamese_ci_as".</li> 
     * @return DBEngineConfig <p>Configuration information for the database engine. The configuration format is as follows:<br>{&quot;$key1&quot;:&quot;$value1&quot;, &quot;$key2&quot;:&quot;$value2&quot;}<br>Supported engines:<br>mssql_compatible engine:</p><li>migrationMode: Database schema, optional parameter. Valid values: single-db (single-database mode), multi-db (multi-database mode). Default is single-db.</li><li>defaultLocale: Sorting area rule, optional parameter, cannot be modified after initialization. Default is en_US. Valid values include: "af_ZA", "sq_AL", "ar_DZ", "ar_BH", "ar_EG", "ar_IQ", "ar_JO", "ar_KW", "ar_LB", "ar_LY", "ar_MA", "ar_OM", "ar_QA", "ar_SA", "ar_SY", "ar_TN", "ar_AE", "ar_YE", "hy_AM", "az_Cyrl_AZ", "az_Latn_AZ", "eu_ES", "be_BY", "bg_BG", "ca_ES", "zh_HK", "zh_MO", "zh_CN", "zh_SG", "zh_TW", "hr_HR", "cs_CZ", "da_DK", "nl_BE", "nl_NL", "en_AU", "en_BZ", "en_CA", "en_IE", "en_JM", "en_NZ", "en_PH", "en_ZA", "en_TT", "en_GB", "en_US", "en_ZW", "et_EE", "fo_FO", "fa_IR", "fi_FI", "fr_BE", "fr_CA", "fr_FR", "fr_LU", "fr_MC", "fr_CH", "mk_MK", "ka_GE", "de_AT", "de_DE", "de_LI", "de_LU", "de_CH", "el_GR", "gu_IN", "he_IL", "hi_IN", "hu_HU", "is_IS", "id_ID", "it_IT", "it_CH", "ja_JP", "kn_IN", "kok_IN", "ko_KR", "ky_KG", "lv_LV", "lt_LT", "ms_BN", "ms_MY", "mr_IN", "mn_MN", "nb_NO", "nn_NO", "pl_PL", "pt_BR", "pt_PT", "pa_IN", "ro_RO", "ru_RU", "sa_IN", "sr_Cyrl_RS", "sr_Latn_RS", "sk_SK", "sl_SI", "es_AR", "es_BO", "es_CL", "es_CO", "es_CR", "es_DO", "es_EC", "es_SV", "es_GT", "es_HN", "es_MX", "es_NI", "es_PA", "es_PY","es_PE", "es_PR", "es_ES", "es_TRADITIONAL", "es_UY", "es_VE", "sw_KE", "sv_FI", "sv_SE", "tt_RU", "te_IN", "th_TH", "tr_TR", "uk_UA", "ur_IN", "ur_PK", "uz_Cyrl_UZ", "uz_Latn_UZ", "vi_VN".</li><li>serverCollationName: Collation name, optional parameter, cannot be modified after initialization. Default is sql_latin1_general_cp1_ci_as. Valid values include: "bbf_unicode_general_ci_as", "bbf_unicode_cp1_ci_as", "bbf_unicode_CP1250_ci_as", "bbf_unicode_CP1251_ci_as", "bbf_unicode_cp1253_ci_as", "bbf_unicode_cp1254_ci_as", "bbf_unicode_cp1255_ci_as", "bbf_unicode_cp1256_ci_as", "bbf_unicode_cp1257_ci_as", "bbf_unicode_cp1258_ci_as", "bbf_unicode_cp874_ci_as", "sql_latin1_general_cp1250_ci_as", "sql_latin1_general_cp1251_ci_as", "sql_latin1_general_cp1_ci_as", "sql_latin1_general_cp1253_ci_as", "sql_latin1_general_cp1254_ci_as", "sql_latin1_general_cp1255_ci_as","sql_latin1_general_cp1256_ci_as", "sql_latin1_general_cp1257_ci_as", "sql_latin1_general_cp1258_ci_as", "chinese_prc_ci_as", "cyrillic_general_ci_as", "finnish_swedish_ci_as", "french_ci_as", "japanese_ci_as", "korean_wansung_ci_as", "latin1_general_ci_as", "modern_spanish_ci_as", "polish_ci_as", "thai_ci_as", "traditional_spanish_ci_as", "turkish_ci_as", "ukrainian_ci_as", "vietnamese_ci_as".</li>
     */
    public String getDBEngineConfig() {
        return this.DBEngineConfig;
    }

    /**
     * Set <p>Configuration information for the database engine. The configuration format is as follows:<br>{&quot;$key1&quot;:&quot;$value1&quot;, &quot;$key2&quot;:&quot;$value2&quot;}<br>Supported engines:<br>mssql_compatible engine:</p><li>migrationMode: Database schema, optional parameter. Valid values: single-db (single-database mode), multi-db (multi-database mode). Default is single-db.</li><li>defaultLocale: Sorting area rule, optional parameter, cannot be modified after initialization. Default is en_US. Valid values include: "af_ZA", "sq_AL", "ar_DZ", "ar_BH", "ar_EG", "ar_IQ", "ar_JO", "ar_KW", "ar_LB", "ar_LY", "ar_MA", "ar_OM", "ar_QA", "ar_SA", "ar_SY", "ar_TN", "ar_AE", "ar_YE", "hy_AM", "az_Cyrl_AZ", "az_Latn_AZ", "eu_ES", "be_BY", "bg_BG", "ca_ES", "zh_HK", "zh_MO", "zh_CN", "zh_SG", "zh_TW", "hr_HR", "cs_CZ", "da_DK", "nl_BE", "nl_NL", "en_AU", "en_BZ", "en_CA", "en_IE", "en_JM", "en_NZ", "en_PH", "en_ZA", "en_TT", "en_GB", "en_US", "en_ZW", "et_EE", "fo_FO", "fa_IR", "fi_FI", "fr_BE", "fr_CA", "fr_FR", "fr_LU", "fr_MC", "fr_CH", "mk_MK", "ka_GE", "de_AT", "de_DE", "de_LI", "de_LU", "de_CH", "el_GR", "gu_IN", "he_IL", "hi_IN", "hu_HU", "is_IS", "id_ID", "it_IT", "it_CH", "ja_JP", "kn_IN", "kok_IN", "ko_KR", "ky_KG", "lv_LV", "lt_LT", "ms_BN", "ms_MY", "mr_IN", "mn_MN", "nb_NO", "nn_NO", "pl_PL", "pt_BR", "pt_PT", "pa_IN", "ro_RO", "ru_RU", "sa_IN", "sr_Cyrl_RS", "sr_Latn_RS", "sk_SK", "sl_SI", "es_AR", "es_BO", "es_CL", "es_CO", "es_CR", "es_DO", "es_EC", "es_SV", "es_GT", "es_HN", "es_MX", "es_NI", "es_PA", "es_PY","es_PE", "es_PR", "es_ES", "es_TRADITIONAL", "es_UY", "es_VE", "sw_KE", "sv_FI", "sv_SE", "tt_RU", "te_IN", "th_TH", "tr_TR", "uk_UA", "ur_IN", "ur_PK", "uz_Cyrl_UZ", "uz_Latn_UZ", "vi_VN".</li><li>serverCollationName: Collation name, optional parameter, cannot be modified after initialization. Default is sql_latin1_general_cp1_ci_as. Valid values include: "bbf_unicode_general_ci_as", "bbf_unicode_cp1_ci_as", "bbf_unicode_CP1250_ci_as", "bbf_unicode_CP1251_ci_as", "bbf_unicode_cp1253_ci_as", "bbf_unicode_cp1254_ci_as", "bbf_unicode_cp1255_ci_as", "bbf_unicode_cp1256_ci_as", "bbf_unicode_cp1257_ci_as", "bbf_unicode_cp1258_ci_as", "bbf_unicode_cp874_ci_as", "sql_latin1_general_cp1250_ci_as", "sql_latin1_general_cp1251_ci_as", "sql_latin1_general_cp1_ci_as", "sql_latin1_general_cp1253_ci_as", "sql_latin1_general_cp1254_ci_as", "sql_latin1_general_cp1255_ci_as","sql_latin1_general_cp1256_ci_as", "sql_latin1_general_cp1257_ci_as", "sql_latin1_general_cp1258_ci_as", "chinese_prc_ci_as", "cyrillic_general_ci_as", "finnish_swedish_ci_as", "french_ci_as", "japanese_ci_as", "korean_wansung_ci_as", "latin1_general_ci_as", "modern_spanish_ci_as", "polish_ci_as", "thai_ci_as", "traditional_spanish_ci_as", "turkish_ci_as", "ukrainian_ci_as", "vietnamese_ci_as".</li>
     * @param DBEngineConfig <p>Configuration information for the database engine. The configuration format is as follows:<br>{&quot;$key1&quot;:&quot;$value1&quot;, &quot;$key2&quot;:&quot;$value2&quot;}<br>Supported engines:<br>mssql_compatible engine:</p><li>migrationMode: Database schema, optional parameter. Valid values: single-db (single-database mode), multi-db (multi-database mode). Default is single-db.</li><li>defaultLocale: Sorting area rule, optional parameter, cannot be modified after initialization. Default is en_US. Valid values include: "af_ZA", "sq_AL", "ar_DZ", "ar_BH", "ar_EG", "ar_IQ", "ar_JO", "ar_KW", "ar_LB", "ar_LY", "ar_MA", "ar_OM", "ar_QA", "ar_SA", "ar_SY", "ar_TN", "ar_AE", "ar_YE", "hy_AM", "az_Cyrl_AZ", "az_Latn_AZ", "eu_ES", "be_BY", "bg_BG", "ca_ES", "zh_HK", "zh_MO", "zh_CN", "zh_SG", "zh_TW", "hr_HR", "cs_CZ", "da_DK", "nl_BE", "nl_NL", "en_AU", "en_BZ", "en_CA", "en_IE", "en_JM", "en_NZ", "en_PH", "en_ZA", "en_TT", "en_GB", "en_US", "en_ZW", "et_EE", "fo_FO", "fa_IR", "fi_FI", "fr_BE", "fr_CA", "fr_FR", "fr_LU", "fr_MC", "fr_CH", "mk_MK", "ka_GE", "de_AT", "de_DE", "de_LI", "de_LU", "de_CH", "el_GR", "gu_IN", "he_IL", "hi_IN", "hu_HU", "is_IS", "id_ID", "it_IT", "it_CH", "ja_JP", "kn_IN", "kok_IN", "ko_KR", "ky_KG", "lv_LV", "lt_LT", "ms_BN", "ms_MY", "mr_IN", "mn_MN", "nb_NO", "nn_NO", "pl_PL", "pt_BR", "pt_PT", "pa_IN", "ro_RO", "ru_RU", "sa_IN", "sr_Cyrl_RS", "sr_Latn_RS", "sk_SK", "sl_SI", "es_AR", "es_BO", "es_CL", "es_CO", "es_CR", "es_DO", "es_EC", "es_SV", "es_GT", "es_HN", "es_MX", "es_NI", "es_PA", "es_PY","es_PE", "es_PR", "es_ES", "es_TRADITIONAL", "es_UY", "es_VE", "sw_KE", "sv_FI", "sv_SE", "tt_RU", "te_IN", "th_TH", "tr_TR", "uk_UA", "ur_IN", "ur_PK", "uz_Cyrl_UZ", "uz_Latn_UZ", "vi_VN".</li><li>serverCollationName: Collation name, optional parameter, cannot be modified after initialization. Default is sql_latin1_general_cp1_ci_as. Valid values include: "bbf_unicode_general_ci_as", "bbf_unicode_cp1_ci_as", "bbf_unicode_CP1250_ci_as", "bbf_unicode_CP1251_ci_as", "bbf_unicode_cp1253_ci_as", "bbf_unicode_cp1254_ci_as", "bbf_unicode_cp1255_ci_as", "bbf_unicode_cp1256_ci_as", "bbf_unicode_cp1257_ci_as", "bbf_unicode_cp1258_ci_as", "bbf_unicode_cp874_ci_as", "sql_latin1_general_cp1250_ci_as", "sql_latin1_general_cp1251_ci_as", "sql_latin1_general_cp1_ci_as", "sql_latin1_general_cp1253_ci_as", "sql_latin1_general_cp1254_ci_as", "sql_latin1_general_cp1255_ci_as","sql_latin1_general_cp1256_ci_as", "sql_latin1_general_cp1257_ci_as", "sql_latin1_general_cp1258_ci_as", "chinese_prc_ci_as", "cyrillic_general_ci_as", "finnish_swedish_ci_as", "french_ci_as", "japanese_ci_as", "korean_wansung_ci_as", "latin1_general_ci_as", "modern_spanish_ci_as", "polish_ci_as", "thai_ci_as", "traditional_spanish_ci_as", "turkish_ci_as", "ukrainian_ci_as", "vietnamese_ci_as".</li>
     */
    public void setDBEngineConfig(String DBEngineConfig) {
        this.DBEngineConfig = DBEngineConfig;
    }

    /**
     * Get <p>Instance network information list (deprecated)</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NetworkAccessList <p>Instance network information list (deprecated)</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public NetworkAccess [] getNetworkAccessList() {
        return this.NetworkAccessList;
    }

    /**
     * Set <p>Instance network information list (deprecated)</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NetworkAccessList <p>Instance network information list (deprecated)</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNetworkAccessList(NetworkAccess [] NetworkAccessList) {
        this.NetworkAccessList = NetworkAccessList;
    }

    /**
     * Get <p>Whether the instance supports Ipv6:</p><li>0: No</li><li>1: Yes</li>Default value: 0 
     * @return SupportIpv6 <p>Whether the instance supports Ipv6:</p><li>0: No</li><li>1: Yes</li>Default value: 0
     */
    public Long getSupportIpv6() {
        return this.SupportIpv6;
    }

    /**
     * Set <p>Whether the instance supports Ipv6:</p><li>0: No</li><li>1: Yes</li>Default value: 0
     * @param SupportIpv6 <p>Whether the instance supports Ipv6:</p><li>0: No</li><li>1: Yes</li>Default value: 0
     */
    public void setSupportIpv6(Long SupportIpv6) {
        this.SupportIpv6 = SupportIpv6;
    }

    /**
     * Get <p>Number of cpu cores that have been elastically scaled out for the instance</p> 
     * @return ExpandedCpu <p>Number of cpu cores that have been elastically scaled out for the instance</p>
     */
    public Long getExpandedCpu() {
        return this.ExpandedCpu;
    }

    /**
     * Set <p>Number of cpu cores that have been elastically scaled out for the instance</p>
     * @param ExpandedCpu <p>Number of cpu cores that have been elastically scaled out for the instance</p>
     */
    public void setExpandedCpu(Long ExpandedCpu) {
        this.ExpandedCpu = ExpandedCpu;
    }

    /**
     * Get <p>Whether to enable deletion protection for the instance, values as follows:</p><ul><li>true: enable deletion protection</li><li>false: disable deletion protection</li></ul> 
     * @return DeletionProtection <p>Whether to enable deletion protection for the instance, values as follows:</p><ul><li>true: enable deletion protection</li><li>false: disable deletion protection</li></ul>
     */
    public Boolean getDeletionProtection() {
        return this.DeletionProtection;
    }

    /**
     * Set <p>Whether to enable deletion protection for the instance, values as follows:</p><ul><li>true: enable deletion protection</li><li>false: disable deletion protection</li></ul>
     * @param DeletionProtection <p>Whether to enable deletion protection for the instance, values as follows:</p><ul><li>true: enable deletion protection</li><li>false: disable deletion protection</li></ul>
     */
    public void setDeletionProtection(Boolean DeletionProtection) {
        this.DeletionProtection = DeletionProtection;
    }

    /**
     * Get <p>Instance storage type. Available values: PHYSICAL_LOCAL_SSD: LOCAL SSD hard disk of PHYSICAL machine; CLOUD_PREMIUM: high-performance CLOUD block storage; CLOUD_SSD: SSD CLOUD disk; CLOUD_HSSD: enhanced SSD CLOUD disk.</p> 
     * @return DBInstanceStorageType <p>Instance storage type. Available values: PHYSICAL_LOCAL_SSD: LOCAL SSD hard disk of PHYSICAL machine; CLOUD_PREMIUM: high-performance CLOUD block storage; CLOUD_SSD: SSD CLOUD disk; CLOUD_HSSD: enhanced SSD CLOUD disk.</p>
     */
    public String getDBInstanceStorageType() {
        return this.DBInstanceStorageType;
    }

    /**
     * Set <p>Instance storage type. Available values: PHYSICAL_LOCAL_SSD: LOCAL SSD hard disk of PHYSICAL machine; CLOUD_PREMIUM: high-performance CLOUD block storage; CLOUD_SSD: SSD CLOUD disk; CLOUD_HSSD: enhanced SSD CLOUD disk.</p>
     * @param DBInstanceStorageType <p>Instance storage type. Available values: PHYSICAL_LOCAL_SSD: LOCAL SSD hard disk of PHYSICAL machine; CLOUD_PREMIUM: high-performance CLOUD block storage; CLOUD_SSD: SSD CLOUD disk; CLOUD_HSSD: enhanced SSD CLOUD disk.</p>
     */
    public void setDBInstanceStorageType(String DBInstanceStorageType) {
        this.DBInstanceStorageType = DBInstanceStorageType;
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
        if (source.ExpandedCpu != null) {
            this.ExpandedCpu = new Long(source.ExpandedCpu);
        }
        if (source.DeletionProtection != null) {
            this.DeletionProtection = new Boolean(source.DeletionProtection);
        }
        if (source.DBInstanceStorageType != null) {
            this.DBInstanceStorageType = new String(source.DBInstanceStorageType);
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
        this.setParamSimple(map, prefix + "ExpandedCpu", this.ExpandedCpu);
        this.setParamSimple(map, prefix + "DeletionProtection", this.DeletionProtection);
        this.setParamSimple(map, prefix + "DBInstanceStorageType", this.DBInstanceStorageType);

    }
}

