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

public class CreateInstancesRequest extends AbstractModel {

    /**
    * Primary AZ of the instance in the format of `ap-guangzhou-3`. To support multiple AZs, add information of the primary and standby AZs in the `DBNodeSet.N` field.
The information of AZ can be obtained from the `Zone` field in the return value of the [DescribeZones](https://intl.cloud.tencent.com/document/api/409/16769?from_cn_redirect=1) API.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Purchasable code, which can be obtained from the `SpecCode` field in the return value of the [DescribeClasses](https://intl.cloud.tencent.com/document/api/409/89019?from_cn_redirect=1) API.
    */
    @SerializedName("SpecCode")
    @Expose
    private String SpecCode;

    /**
    * Instance storage capacity in GB
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * The number of instances to be purchased at a time. Value range: 1-10. To purchase more than 10 instances each time, you can make multiple calls.
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
    * Purchase duration, in months.
<li>Prepaid: Supports `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `24`, and `36`.</li>
<li>Pay-as-you-go: Only supports `1`.</li>
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * Instance character set, which currently supports only:
<li>UTF8</li>
<li>LATIN1</li>
    */
    @SerializedName("Charset")
    @Expose
    private String Charset;

    /**
    * Username of the instance root account, with the following specifications:
<li>The username must consist of 1-16 characters, which can be letters, digits, or underscores.</li>
<li>It cannot be postgres.</li>
<li>It cannot start with digits or 'pg_'.</li>
<li>All rules are case-insensitive.</li>
    */
    @SerializedName("AdminName")
    @Expose
    private String AdminName;

    /**
    * Password for the instance root account username, with a length of 8-32 characters. It is recommended to use a password of more than 12 characters and it cannot start with "/".
It must include the following four types of characters:
<li>Lowercase letters: [a ~ z]</li>
<li>Uppercase letters: [A ~ Z]</li>
<li>Digits: 0-9</li>
<li>Special symbols: ()`~!@#$%^&*-+=_|{}[]:;'<>,.?/</li>
    */
    @SerializedName("AdminPassword")
    @Expose
    private String AdminPassword;

    /**
    * The major version number of PostgreSQL (this parameter is currently required), and the version information can be obtained from [DescribeDBVersions](https://intl.cloud.tencent.com/document/api/409/89018?from_cn_redirect=1). Currently major versions `10`, `11`, `12`, `13`, `14`, and `15` are supported. For details, see [Kernel Version Overview](https://intl.cloud.tencent.com/document/product/409/67018).
When this parameter is entered, an instance running the latest kernel version of the latest minor version will be created based on this major version number.
    */
    @SerializedName("DBMajorVersion")
    @Expose
    private String DBMajorVersion;

    /**
    * PostgreSQL community major version + minor version number.
It's generally not recommended to pass in this parameter. If needed, only the latest minor version number under the current major version can be passed.
    */
    @SerializedName("DBVersion")
    @Expose
    private String DBVersion;

    /**
    * PostgreSQL kernel version number.
It's generally not recommended to pass in this parameter. If needed, only the latest kernel version number under the current major version can be passed.
    */
    @SerializedName("DBKernelVersion")
    @Expose
    private String DBKernelVersion;

    /**
    * Instance billing type, which currently supports:
<li>PREPAID: Prepaid, i.e., monthly subscription</li>
<li>POSTPAID_BY_HOUR: Pay-as-you-go, i.e., pay by consumption</li>
Default value: PREPAID
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * VPC ID, in the format of vpc-xxxxxxxx (this parameter is currently required). A valid VpcId can be obtained by logging into the console; it can also be obtained from the unVpcId field in the return value of calling of the [DescribeVpcEx](https://intl.cloud.tencent.com/document/api/215/1372?from_cn_redirect=1) API.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * VPC subnet ID, in the format of subnet-xxxxxxxx (this parameter is currently required). A valid VPC subnet ID can be obtained by logging into the console; it can also be obtained from the unSubnetId field in the return value of calling of the [DescribeSubnets](https://intl.cloud.tencent.com/document/api/215/15784?from_cn_redirect=1) API.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Deployment information of the instance node, which will display the information of each AZ when the instance node is deployed across multiple AZs.
The information of AZ can be obtained from the `Zone` field in the return value of the [DescribeZones](https://intl.cloud.tencent.com/document/api/409/16769?from_cn_redirect=1) API.
    */
    @SerializedName("DBNodeSet")
    @Expose
    private DBNode [] DBNodeSet;

    /**
    * Renewal Flag:
<li>`0`: manual renewal</li>
<li>`1`: auto-renewal</li>
Default value: 0
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * Whether to automatically use coupons:
<li>`0`: no</li>
<li>`1`: yes</li>
Default value: 0
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Long AutoVoucher;

    /**
    * Voucher ID list. Currently, you can specify only one voucher.
    */
    @SerializedName("VoucherIds")
    @Expose
    private String [] VoucherIds;

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Campaign ID
    */
    @SerializedName("ActivityId")
    @Expose
    private Long ActivityId;

    /**
    * Instance name, which can contain up to 60 letters, digits, hyphens, and symbols (_-). If this parameter is not specified, "Unnamed" will be displayed by default.

    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * The information of tags to be bound with the instance, which is left empty by default. This parameter can be obtained from the `Tags` field in the return value of the [DescribeTags](https://intl.cloud.tencent.com/document/api/651/35316?from_cn_redirect=1) API.
    */
    @SerializedName("TagList")
    @Expose
    private Tag [] TagList;

    /**
    * Security group of the instance, which can be obtained from the `sgld` field in the return value of the [DescribeSecurityGroups](https://intl.cloud.tencent.com/document/api/215/15808?from_cn_redirect=1) API. If this parameter is not specified, the default security group will be bound.

    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * Whether data transparent encryption is required:
<li>`0`: no</li>
<li>`1`: yes</li>
Default value: 0See [Overview of Data Transparent Encryption](https://intl.cloud.tencent.com/document/product/409/71748?from_cn_redirect=1).
    */
    @SerializedName("NeedSupportTDE")
    @Expose
    private Long NeedSupportTDE;

    /**
    * KeyId of custom key, which is required if you select custom key encryption. It is also the unique CMK identifier.
For more information on creating `KeyId`, see [Enabling TDE](https://www.tencentcloud.com/document/product/409/47762).
    */
    @SerializedName("KMSKeyId")
    @Expose
    private String KMSKeyId;

    /**
    * The region where the KMS service is enabled. When `KMSRegion` is left empty, the current region will be selected by default.  If the current region does not support KMS, you must select another region that does.
For more information on `KMSRegion`, see [Enabling TDE](https://intl.cloud.tencent.com/document/product/409/71749?from_cn_redirect=1).
    */
    @SerializedName("KMSRegion")
    @Expose
    private String KMSRegion;

    /**
    * Database engine, which supports:
<li>`postgresql`: TencentDB for PostgreSQL</li>
<li>`mssql_compatible`: MSSQL compatible - TencentDB for PostgreSQL</li>
Default value: `postgresql`
    */
    @SerializedName("DBEngine")
    @Expose
    private String DBEngine;

    /**
    * Configuration information for the database engine, and the configuration format is as follows:
{"$key1":"$value1", "$key2":"$value2"}
Supported engines include:
mssql_compatible engine:
<li>migrationMode: Database mode, an optional parameter, and its valid values are: single-db (single database schema) and multi-db (multiple database schema). The default value is single-db.</li>
<li>defaultLocale: Sorting area rule, an optional parameter, which cannot be modified after initialization, its default value is en_US, and its valid values include:
"af_ZA", "sq_AL", "ar_DZ", "ar_BH", "ar_EG", "ar_IQ", "ar_JO", "ar_KW", "ar_LB", "ar_LY", "ar_MA", "ar_OM", "ar_QA", "ar_SA", "ar_SY", "ar_TN", "ar_AE", "ar_YE", "hy_AM", "az_Cyrl_AZ", "az_Latn_AZ", "eu_ES", "be_BY", "bg_BG", "ca_ES", "zh_HK", "zh_MO", "zh_CN", "zh_SG", "zh_TW", "hr_HR", "cs_CZ", "da_DK", "nl_BE", "nl_NL", "en_AU", "en_BZ", "en_CA", "en_IE", "en_JM", "en_NZ", "en_PH", "en_ZA", "en_TT", "en_GB", "en_US", "en_ZW", "et_EE", "fo_FO", "fa_IR", "fi_FI", "fr_BE", "fr_CA", "fr_FR", "fr_LU", "fr_MC", "fr_CH", "mk_MK", "ka_GE", "de_AT", "de_DE", "de_LI", "de_LU", "de_CH", "el_GR", "gu_IN", "he_IL", "hi_IN", "hu_HU", "is_IS", "id_ID", "it_IT", "it_CH", "ja_JP", "kn_IN", "kok_IN", "ko_KR", "ky_KG", "lv_LV", "lt_LT", "ms_BN", "ms_MY", "mr_IN", "mn_MN", "nb_NO", "nn_NO", "pl_PL", "pt_BR", "pt_PT", "pa_IN", "ro_RO", "ru_RU", "sa_IN", "sr_Cyrl_RS", "sr_Latn_RS", "sk_SK", "sl_SI", "es_AR", "es_BO", "es_CL", "es_CO", "es_CR", "es_DO", "es_EC", "es_SV", "es_GT", "es_HN", "es_MX", "es_NI", "es_PA", "es_PY","es_PE", "es_PR", "es_ES", "es_TRADITIONAL", "es_UY", "es_VE", "sw_KE", "sv_FI", "sv_SE", "tt_RU", "te_IN", "th_TH", "tr_TR", "uk_UA", "ur_IN", "ur_PK", "uz_Cyrl_UZ", "uz_Latn_UZ", and "vi_VN".</li>
<li>serverCollationName: Sorting rule name, an optional parameter, which cannot be modified after initialization, its default value is sql_latin1_general_cp1_ci_as, and its valid values include: "bbf_unicode_general_ci_as", "bbf_unicode_cp1_ci_as", "bbf_unicode_CP1250_ci_as", "bbf_unicode_CP1251_ci_as", "bbf_unicode_cp1253_ci_as", "bbf_unicode_cp1254_ci_as", "bbf_unicode_cp1255_ci_as", "bbf_unicode_cp1256_ci_as", "bbf_unicode_cp1257_ci_as", "bbf_unicode_cp1258_ci_as", "bbf_unicode_cp874_ci_as", "sql_latin1_general_cp1250_ci_as", "sql_latin1_general_cp1251_ci_as", "sql_latin1_general_cp1_ci_as", "sql_latin1_general_cp1253_ci_as", "sql_latin1_general_cp1254_ci_as", "sql_latin1_general_cp1255_ci_as", "sql_latin1_general_cp1256_ci_as", "sql_latin1_general_cp1257_ci_as", "sql_latin1_general_cp1258_ci_as", "chinese_prc_ci_as", "cyrillic_general_ci_as", "finnish_swedish_ci_as", "french_ci_as", "japanese_ci_as", "korean_wansung_ci_as", "latin1_general_ci_as", "modern_spanish_ci_as", "polish_ci_as", "thai_ci_as", "traditional_spanish_ci_as", "turkish_ci_as", "ukrainian_ci_as", and "vietnamese_ci_as".</li>
    */
    @SerializedName("DBEngineConfig")
    @Expose
    private String DBEngineConfig;

    /**
    * Primary-standby sync mode, which supports:
<li>Semi-sync: Semi-sync</li>
<li>Async: Asynchronous</li>
Default value for the primary instance: Semi-sync
Default value for the read-only instance: Async
    */
    @SerializedName("SyncMode")
    @Expose
    private String SyncMode;

    /**
    * Whether support to IPv6 is required:
<li>`0`: no</li>
<li>`1`: yes</li>
Default value: 0
    */
    @SerializedName("NeedSupportIpv6")
    @Expose
    private Long NeedSupportIpv6;

    /**
     * Get Primary AZ of the instance in the format of `ap-guangzhou-3`. To support multiple AZs, add information of the primary and standby AZs in the `DBNodeSet.N` field.
The information of AZ can be obtained from the `Zone` field in the return value of the [DescribeZones](https://intl.cloud.tencent.com/document/api/409/16769?from_cn_redirect=1) API. 
     * @return Zone Primary AZ of the instance in the format of `ap-guangzhou-3`. To support multiple AZs, add information of the primary and standby AZs in the `DBNodeSet.N` field.
The information of AZ can be obtained from the `Zone` field in the return value of the [DescribeZones](https://intl.cloud.tencent.com/document/api/409/16769?from_cn_redirect=1) API.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Primary AZ of the instance in the format of `ap-guangzhou-3`. To support multiple AZs, add information of the primary and standby AZs in the `DBNodeSet.N` field.
The information of AZ can be obtained from the `Zone` field in the return value of the [DescribeZones](https://intl.cloud.tencent.com/document/api/409/16769?from_cn_redirect=1) API.
     * @param Zone Primary AZ of the instance in the format of `ap-guangzhou-3`. To support multiple AZs, add information of the primary and standby AZs in the `DBNodeSet.N` field.
The information of AZ can be obtained from the `Zone` field in the return value of the [DescribeZones](https://intl.cloud.tencent.com/document/api/409/16769?from_cn_redirect=1) API.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Purchasable code, which can be obtained from the `SpecCode` field in the return value of the [DescribeClasses](https://intl.cloud.tencent.com/document/api/409/89019?from_cn_redirect=1) API. 
     * @return SpecCode Purchasable code, which can be obtained from the `SpecCode` field in the return value of the [DescribeClasses](https://intl.cloud.tencent.com/document/api/409/89019?from_cn_redirect=1) API.
     */
    public String getSpecCode() {
        return this.SpecCode;
    }

    /**
     * Set Purchasable code, which can be obtained from the `SpecCode` field in the return value of the [DescribeClasses](https://intl.cloud.tencent.com/document/api/409/89019?from_cn_redirect=1) API.
     * @param SpecCode Purchasable code, which can be obtained from the `SpecCode` field in the return value of the [DescribeClasses](https://intl.cloud.tencent.com/document/api/409/89019?from_cn_redirect=1) API.
     */
    public void setSpecCode(String SpecCode) {
        this.SpecCode = SpecCode;
    }

    /**
     * Get Instance storage capacity in GB 
     * @return Storage Instance storage capacity in GB
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set Instance storage capacity in GB
     * @param Storage Instance storage capacity in GB
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get The number of instances to be purchased at a time. Value range: 1-10. To purchase more than 10 instances each time, you can make multiple calls. 
     * @return InstanceCount The number of instances to be purchased at a time. Value range: 1-10. To purchase more than 10 instances each time, you can make multiple calls.
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set The number of instances to be purchased at a time. Value range: 1-10. To purchase more than 10 instances each time, you can make multiple calls.
     * @param InstanceCount The number of instances to be purchased at a time. Value range: 1-10. To purchase more than 10 instances each time, you can make multiple calls.
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * Get Purchase duration, in months.
<li>Prepaid: Supports `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `24`, and `36`.</li>
<li>Pay-as-you-go: Only supports `1`.</li> 
     * @return Period Purchase duration, in months.
<li>Prepaid: Supports `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `24`, and `36`.</li>
<li>Pay-as-you-go: Only supports `1`.</li>
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set Purchase duration, in months.
<li>Prepaid: Supports `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `24`, and `36`.</li>
<li>Pay-as-you-go: Only supports `1`.</li>
     * @param Period Purchase duration, in months.
<li>Prepaid: Supports `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `24`, and `36`.</li>
<li>Pay-as-you-go: Only supports `1`.</li>
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get Instance character set, which currently supports only:
<li>UTF8</li>
<li>LATIN1</li> 
     * @return Charset Instance character set, which currently supports only:
<li>UTF8</li>
<li>LATIN1</li>
     */
    public String getCharset() {
        return this.Charset;
    }

    /**
     * Set Instance character set, which currently supports only:
<li>UTF8</li>
<li>LATIN1</li>
     * @param Charset Instance character set, which currently supports only:
<li>UTF8</li>
<li>LATIN1</li>
     */
    public void setCharset(String Charset) {
        this.Charset = Charset;
    }

    /**
     * Get Username of the instance root account, with the following specifications:
<li>The username must consist of 1-16 characters, which can be letters, digits, or underscores.</li>
<li>It cannot be postgres.</li>
<li>It cannot start with digits or 'pg_'.</li>
<li>All rules are case-insensitive.</li> 
     * @return AdminName Username of the instance root account, with the following specifications:
<li>The username must consist of 1-16 characters, which can be letters, digits, or underscores.</li>
<li>It cannot be postgres.</li>
<li>It cannot start with digits or 'pg_'.</li>
<li>All rules are case-insensitive.</li>
     */
    public String getAdminName() {
        return this.AdminName;
    }

    /**
     * Set Username of the instance root account, with the following specifications:
<li>The username must consist of 1-16 characters, which can be letters, digits, or underscores.</li>
<li>It cannot be postgres.</li>
<li>It cannot start with digits or 'pg_'.</li>
<li>All rules are case-insensitive.</li>
     * @param AdminName Username of the instance root account, with the following specifications:
<li>The username must consist of 1-16 characters, which can be letters, digits, or underscores.</li>
<li>It cannot be postgres.</li>
<li>It cannot start with digits or 'pg_'.</li>
<li>All rules are case-insensitive.</li>
     */
    public void setAdminName(String AdminName) {
        this.AdminName = AdminName;
    }

    /**
     * Get Password for the instance root account username, with a length of 8-32 characters. It is recommended to use a password of more than 12 characters and it cannot start with "/".
It must include the following four types of characters:
<li>Lowercase letters: [a ~ z]</li>
<li>Uppercase letters: [A ~ Z]</li>
<li>Digits: 0-9</li>
<li>Special symbols: ()`~!@#$%^&*-+=_|{}[]:;'<>,.?/</li> 
     * @return AdminPassword Password for the instance root account username, with a length of 8-32 characters. It is recommended to use a password of more than 12 characters and it cannot start with "/".
It must include the following four types of characters:
<li>Lowercase letters: [a ~ z]</li>
<li>Uppercase letters: [A ~ Z]</li>
<li>Digits: 0-9</li>
<li>Special symbols: ()`~!@#$%^&*-+=_|{}[]:;'<>,.?/</li>
     */
    public String getAdminPassword() {
        return this.AdminPassword;
    }

    /**
     * Set Password for the instance root account username, with a length of 8-32 characters. It is recommended to use a password of more than 12 characters and it cannot start with "/".
It must include the following four types of characters:
<li>Lowercase letters: [a ~ z]</li>
<li>Uppercase letters: [A ~ Z]</li>
<li>Digits: 0-9</li>
<li>Special symbols: ()`~!@#$%^&*-+=_|{}[]:;'<>,.?/</li>
     * @param AdminPassword Password for the instance root account username, with a length of 8-32 characters. It is recommended to use a password of more than 12 characters and it cannot start with "/".
It must include the following four types of characters:
<li>Lowercase letters: [a ~ z]</li>
<li>Uppercase letters: [A ~ Z]</li>
<li>Digits: 0-9</li>
<li>Special symbols: ()`~!@#$%^&*-+=_|{}[]:;'<>,.?/</li>
     */
    public void setAdminPassword(String AdminPassword) {
        this.AdminPassword = AdminPassword;
    }

    /**
     * Get The major version number of PostgreSQL (this parameter is currently required), and the version information can be obtained from [DescribeDBVersions](https://intl.cloud.tencent.com/document/api/409/89018?from_cn_redirect=1). Currently major versions `10`, `11`, `12`, `13`, `14`, and `15` are supported. For details, see [Kernel Version Overview](https://intl.cloud.tencent.com/document/product/409/67018).
When this parameter is entered, an instance running the latest kernel version of the latest minor version will be created based on this major version number. 
     * @return DBMajorVersion The major version number of PostgreSQL (this parameter is currently required), and the version information can be obtained from [DescribeDBVersions](https://intl.cloud.tencent.com/document/api/409/89018?from_cn_redirect=1). Currently major versions `10`, `11`, `12`, `13`, `14`, and `15` are supported. For details, see [Kernel Version Overview](https://intl.cloud.tencent.com/document/product/409/67018).
When this parameter is entered, an instance running the latest kernel version of the latest minor version will be created based on this major version number.
     */
    public String getDBMajorVersion() {
        return this.DBMajorVersion;
    }

    /**
     * Set The major version number of PostgreSQL (this parameter is currently required), and the version information can be obtained from [DescribeDBVersions](https://intl.cloud.tencent.com/document/api/409/89018?from_cn_redirect=1). Currently major versions `10`, `11`, `12`, `13`, `14`, and `15` are supported. For details, see [Kernel Version Overview](https://intl.cloud.tencent.com/document/product/409/67018).
When this parameter is entered, an instance running the latest kernel version of the latest minor version will be created based on this major version number.
     * @param DBMajorVersion The major version number of PostgreSQL (this parameter is currently required), and the version information can be obtained from [DescribeDBVersions](https://intl.cloud.tencent.com/document/api/409/89018?from_cn_redirect=1). Currently major versions `10`, `11`, `12`, `13`, `14`, and `15` are supported. For details, see [Kernel Version Overview](https://intl.cloud.tencent.com/document/product/409/67018).
When this parameter is entered, an instance running the latest kernel version of the latest minor version will be created based on this major version number.
     */
    public void setDBMajorVersion(String DBMajorVersion) {
        this.DBMajorVersion = DBMajorVersion;
    }

    /**
     * Get PostgreSQL community major version + minor version number.
It's generally not recommended to pass in this parameter. If needed, only the latest minor version number under the current major version can be passed. 
     * @return DBVersion PostgreSQL community major version + minor version number.
It's generally not recommended to pass in this parameter. If needed, only the latest minor version number under the current major version can be passed.
     */
    public String getDBVersion() {
        return this.DBVersion;
    }

    /**
     * Set PostgreSQL community major version + minor version number.
It's generally not recommended to pass in this parameter. If needed, only the latest minor version number under the current major version can be passed.
     * @param DBVersion PostgreSQL community major version + minor version number.
It's generally not recommended to pass in this parameter. If needed, only the latest minor version number under the current major version can be passed.
     */
    public void setDBVersion(String DBVersion) {
        this.DBVersion = DBVersion;
    }

    /**
     * Get PostgreSQL kernel version number.
It's generally not recommended to pass in this parameter. If needed, only the latest kernel version number under the current major version can be passed. 
     * @return DBKernelVersion PostgreSQL kernel version number.
It's generally not recommended to pass in this parameter. If needed, only the latest kernel version number under the current major version can be passed.
     */
    public String getDBKernelVersion() {
        return this.DBKernelVersion;
    }

    /**
     * Set PostgreSQL kernel version number.
It's generally not recommended to pass in this parameter. If needed, only the latest kernel version number under the current major version can be passed.
     * @param DBKernelVersion PostgreSQL kernel version number.
It's generally not recommended to pass in this parameter. If needed, only the latest kernel version number under the current major version can be passed.
     */
    public void setDBKernelVersion(String DBKernelVersion) {
        this.DBKernelVersion = DBKernelVersion;
    }

    /**
     * Get Instance billing type, which currently supports:
<li>PREPAID: Prepaid, i.e., monthly subscription</li>
<li>POSTPAID_BY_HOUR: Pay-as-you-go, i.e., pay by consumption</li>
Default value: PREPAID 
     * @return InstanceChargeType Instance billing type, which currently supports:
<li>PREPAID: Prepaid, i.e., monthly subscription</li>
<li>POSTPAID_BY_HOUR: Pay-as-you-go, i.e., pay by consumption</li>
Default value: PREPAID
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set Instance billing type, which currently supports:
<li>PREPAID: Prepaid, i.e., monthly subscription</li>
<li>POSTPAID_BY_HOUR: Pay-as-you-go, i.e., pay by consumption</li>
Default value: PREPAID
     * @param InstanceChargeType Instance billing type, which currently supports:
<li>PREPAID: Prepaid, i.e., monthly subscription</li>
<li>POSTPAID_BY_HOUR: Pay-as-you-go, i.e., pay by consumption</li>
Default value: PREPAID
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get VPC ID, in the format of vpc-xxxxxxxx (this parameter is currently required). A valid VpcId can be obtained by logging into the console; it can also be obtained from the unVpcId field in the return value of calling of the [DescribeVpcEx](https://intl.cloud.tencent.com/document/api/215/1372?from_cn_redirect=1) API. 
     * @return VpcId VPC ID, in the format of vpc-xxxxxxxx (this parameter is currently required). A valid VpcId can be obtained by logging into the console; it can also be obtained from the unVpcId field in the return value of calling of the [DescribeVpcEx](https://intl.cloud.tencent.com/document/api/215/1372?from_cn_redirect=1) API.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID, in the format of vpc-xxxxxxxx (this parameter is currently required). A valid VpcId can be obtained by logging into the console; it can also be obtained from the unVpcId field in the return value of calling of the [DescribeVpcEx](https://intl.cloud.tencent.com/document/api/215/1372?from_cn_redirect=1) API.
     * @param VpcId VPC ID, in the format of vpc-xxxxxxxx (this parameter is currently required). A valid VpcId can be obtained by logging into the console; it can also be obtained from the unVpcId field in the return value of calling of the [DescribeVpcEx](https://intl.cloud.tencent.com/document/api/215/1372?from_cn_redirect=1) API.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get VPC subnet ID, in the format of subnet-xxxxxxxx (this parameter is currently required). A valid VPC subnet ID can be obtained by logging into the console; it can also be obtained from the unSubnetId field in the return value of calling of the [DescribeSubnets](https://intl.cloud.tencent.com/document/api/215/15784?from_cn_redirect=1) API. 
     * @return SubnetId VPC subnet ID, in the format of subnet-xxxxxxxx (this parameter is currently required). A valid VPC subnet ID can be obtained by logging into the console; it can also be obtained from the unSubnetId field in the return value of calling of the [DescribeSubnets](https://intl.cloud.tencent.com/document/api/215/15784?from_cn_redirect=1) API.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set VPC subnet ID, in the format of subnet-xxxxxxxx (this parameter is currently required). A valid VPC subnet ID can be obtained by logging into the console; it can also be obtained from the unSubnetId field in the return value of calling of the [DescribeSubnets](https://intl.cloud.tencent.com/document/api/215/15784?from_cn_redirect=1) API.
     * @param SubnetId VPC subnet ID, in the format of subnet-xxxxxxxx (this parameter is currently required). A valid VPC subnet ID can be obtained by logging into the console; it can also be obtained from the unSubnetId field in the return value of calling of the [DescribeSubnets](https://intl.cloud.tencent.com/document/api/215/15784?from_cn_redirect=1) API.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Deployment information of the instance node, which will display the information of each AZ when the instance node is deployed across multiple AZs.
The information of AZ can be obtained from the `Zone` field in the return value of the [DescribeZones](https://intl.cloud.tencent.com/document/api/409/16769?from_cn_redirect=1) API. 
     * @return DBNodeSet Deployment information of the instance node, which will display the information of each AZ when the instance node is deployed across multiple AZs.
The information of AZ can be obtained from the `Zone` field in the return value of the [DescribeZones](https://intl.cloud.tencent.com/document/api/409/16769?from_cn_redirect=1) API.
     */
    public DBNode [] getDBNodeSet() {
        return this.DBNodeSet;
    }

    /**
     * Set Deployment information of the instance node, which will display the information of each AZ when the instance node is deployed across multiple AZs.
The information of AZ can be obtained from the `Zone` field in the return value of the [DescribeZones](https://intl.cloud.tencent.com/document/api/409/16769?from_cn_redirect=1) API.
     * @param DBNodeSet Deployment information of the instance node, which will display the information of each AZ when the instance node is deployed across multiple AZs.
The information of AZ can be obtained from the `Zone` field in the return value of the [DescribeZones](https://intl.cloud.tencent.com/document/api/409/16769?from_cn_redirect=1) API.
     */
    public void setDBNodeSet(DBNode [] DBNodeSet) {
        this.DBNodeSet = DBNodeSet;
    }

    /**
     * Get Renewal Flag:
<li>`0`: manual renewal</li>
<li>`1`: auto-renewal</li>
Default value: 0 
     * @return AutoRenewFlag Renewal Flag:
<li>`0`: manual renewal</li>
<li>`1`: auto-renewal</li>
Default value: 0
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set Renewal Flag:
<li>`0`: manual renewal</li>
<li>`1`: auto-renewal</li>
Default value: 0
     * @param AutoRenewFlag Renewal Flag:
<li>`0`: manual renewal</li>
<li>`1`: auto-renewal</li>
Default value: 0
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get Whether to automatically use coupons:
<li>`0`: no</li>
<li>`1`: yes</li>
Default value: 0 
     * @return AutoVoucher Whether to automatically use coupons:
<li>`0`: no</li>
<li>`1`: yes</li>
Default value: 0
     */
    public Long getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set Whether to automatically use coupons:
<li>`0`: no</li>
<li>`1`: yes</li>
Default value: 0
     * @param AutoVoucher Whether to automatically use coupons:
<li>`0`: no</li>
<li>`1`: yes</li>
Default value: 0
     */
    public void setAutoVoucher(Long AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    /**
     * Get Voucher ID list. Currently, you can specify only one voucher. 
     * @return VoucherIds Voucher ID list. Currently, you can specify only one voucher.
     */
    public String [] getVoucherIds() {
        return this.VoucherIds;
    }

    /**
     * Set Voucher ID list. Currently, you can specify only one voucher.
     * @param VoucherIds Voucher ID list. Currently, you can specify only one voucher.
     */
    public void setVoucherIds(String [] VoucherIds) {
        this.VoucherIds = VoucherIds;
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
     * Get Campaign ID 
     * @return ActivityId Campaign ID
     */
    public Long getActivityId() {
        return this.ActivityId;
    }

    /**
     * Set Campaign ID
     * @param ActivityId Campaign ID
     */
    public void setActivityId(Long ActivityId) {
        this.ActivityId = ActivityId;
    }

    /**
     * Get Instance name, which can contain up to 60 letters, digits, hyphens, and symbols (_-). If this parameter is not specified, "Unnamed" will be displayed by default.
 
     * @return Name Instance name, which can contain up to 60 letters, digits, hyphens, and symbols (_-). If this parameter is not specified, "Unnamed" will be displayed by default.

     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Instance name, which can contain up to 60 letters, digits, hyphens, and symbols (_-). If this parameter is not specified, "Unnamed" will be displayed by default.

     * @param Name Instance name, which can contain up to 60 letters, digits, hyphens, and symbols (_-). If this parameter is not specified, "Unnamed" will be displayed by default.

     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get The information of tags to be bound with the instance, which is left empty by default. This parameter can be obtained from the `Tags` field in the return value of the [DescribeTags](https://intl.cloud.tencent.com/document/api/651/35316?from_cn_redirect=1) API. 
     * @return TagList The information of tags to be bound with the instance, which is left empty by default. This parameter can be obtained from the `Tags` field in the return value of the [DescribeTags](https://intl.cloud.tencent.com/document/api/651/35316?from_cn_redirect=1) API.
     */
    public Tag [] getTagList() {
        return this.TagList;
    }

    /**
     * Set The information of tags to be bound with the instance, which is left empty by default. This parameter can be obtained from the `Tags` field in the return value of the [DescribeTags](https://intl.cloud.tencent.com/document/api/651/35316?from_cn_redirect=1) API.
     * @param TagList The information of tags to be bound with the instance, which is left empty by default. This parameter can be obtained from the `Tags` field in the return value of the [DescribeTags](https://intl.cloud.tencent.com/document/api/651/35316?from_cn_redirect=1) API.
     */
    public void setTagList(Tag [] TagList) {
        this.TagList = TagList;
    }

    /**
     * Get Security group of the instance, which can be obtained from the `sgld` field in the return value of the [DescribeSecurityGroups](https://intl.cloud.tencent.com/document/api/215/15808?from_cn_redirect=1) API. If this parameter is not specified, the default security group will be bound.
 
     * @return SecurityGroupIds Security group of the instance, which can be obtained from the `sgld` field in the return value of the [DescribeSecurityGroups](https://intl.cloud.tencent.com/document/api/215/15808?from_cn_redirect=1) API. If this parameter is not specified, the default security group will be bound.

     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set Security group of the instance, which can be obtained from the `sgld` field in the return value of the [DescribeSecurityGroups](https://intl.cloud.tencent.com/document/api/215/15808?from_cn_redirect=1) API. If this parameter is not specified, the default security group will be bound.

     * @param SecurityGroupIds Security group of the instance, which can be obtained from the `sgld` field in the return value of the [DescribeSecurityGroups](https://intl.cloud.tencent.com/document/api/215/15808?from_cn_redirect=1) API. If this parameter is not specified, the default security group will be bound.

     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get Whether data transparent encryption is required:
<li>`0`: no</li>
<li>`1`: yes</li>
Default value: 0See [Overview of Data Transparent Encryption](https://intl.cloud.tencent.com/document/product/409/71748?from_cn_redirect=1). 
     * @return NeedSupportTDE Whether data transparent encryption is required:
<li>`0`: no</li>
<li>`1`: yes</li>
Default value: 0See [Overview of Data Transparent Encryption](https://intl.cloud.tencent.com/document/product/409/71748?from_cn_redirect=1).
     */
    public Long getNeedSupportTDE() {
        return this.NeedSupportTDE;
    }

    /**
     * Set Whether data transparent encryption is required:
<li>`0`: no</li>
<li>`1`: yes</li>
Default value: 0See [Overview of Data Transparent Encryption](https://intl.cloud.tencent.com/document/product/409/71748?from_cn_redirect=1).
     * @param NeedSupportTDE Whether data transparent encryption is required:
<li>`0`: no</li>
<li>`1`: yes</li>
Default value: 0See [Overview of Data Transparent Encryption](https://intl.cloud.tencent.com/document/product/409/71748?from_cn_redirect=1).
     */
    public void setNeedSupportTDE(Long NeedSupportTDE) {
        this.NeedSupportTDE = NeedSupportTDE;
    }

    /**
     * Get KeyId of custom key, which is required if you select custom key encryption. It is also the unique CMK identifier.
For more information on creating `KeyId`, see [Enabling TDE](https://www.tencentcloud.com/document/product/409/47762). 
     * @return KMSKeyId KeyId of custom key, which is required if you select custom key encryption. It is also the unique CMK identifier.
For more information on creating `KeyId`, see [Enabling TDE](https://www.tencentcloud.com/document/product/409/47762).
     */
    public String getKMSKeyId() {
        return this.KMSKeyId;
    }

    /**
     * Set KeyId of custom key, which is required if you select custom key encryption. It is also the unique CMK identifier.
For more information on creating `KeyId`, see [Enabling TDE](https://www.tencentcloud.com/document/product/409/47762).
     * @param KMSKeyId KeyId of custom key, which is required if you select custom key encryption. It is also the unique CMK identifier.
For more information on creating `KeyId`, see [Enabling TDE](https://www.tencentcloud.com/document/product/409/47762).
     */
    public void setKMSKeyId(String KMSKeyId) {
        this.KMSKeyId = KMSKeyId;
    }

    /**
     * Get The region where the KMS service is enabled. When `KMSRegion` is left empty, the current region will be selected by default.  If the current region does not support KMS, you must select another region that does.
For more information on `KMSRegion`, see [Enabling TDE](https://intl.cloud.tencent.com/document/product/409/71749?from_cn_redirect=1). 
     * @return KMSRegion The region where the KMS service is enabled. When `KMSRegion` is left empty, the current region will be selected by default.  If the current region does not support KMS, you must select another region that does.
For more information on `KMSRegion`, see [Enabling TDE](https://intl.cloud.tencent.com/document/product/409/71749?from_cn_redirect=1).
     */
    public String getKMSRegion() {
        return this.KMSRegion;
    }

    /**
     * Set The region where the KMS service is enabled. When `KMSRegion` is left empty, the current region will be selected by default.  If the current region does not support KMS, you must select another region that does.
For more information on `KMSRegion`, see [Enabling TDE](https://intl.cloud.tencent.com/document/product/409/71749?from_cn_redirect=1).
     * @param KMSRegion The region where the KMS service is enabled. When `KMSRegion` is left empty, the current region will be selected by default.  If the current region does not support KMS, you must select another region that does.
For more information on `KMSRegion`, see [Enabling TDE](https://intl.cloud.tencent.com/document/product/409/71749?from_cn_redirect=1).
     */
    public void setKMSRegion(String KMSRegion) {
        this.KMSRegion = KMSRegion;
    }

    /**
     * Get Database engine, which supports:
<li>`postgresql`: TencentDB for PostgreSQL</li>
<li>`mssql_compatible`: MSSQL compatible - TencentDB for PostgreSQL</li>
Default value: `postgresql` 
     * @return DBEngine Database engine, which supports:
<li>`postgresql`: TencentDB for PostgreSQL</li>
<li>`mssql_compatible`: MSSQL compatible - TencentDB for PostgreSQL</li>
Default value: `postgresql`
     */
    public String getDBEngine() {
        return this.DBEngine;
    }

    /**
     * Set Database engine, which supports:
<li>`postgresql`: TencentDB for PostgreSQL</li>
<li>`mssql_compatible`: MSSQL compatible - TencentDB for PostgreSQL</li>
Default value: `postgresql`
     * @param DBEngine Database engine, which supports:
<li>`postgresql`: TencentDB for PostgreSQL</li>
<li>`mssql_compatible`: MSSQL compatible - TencentDB for PostgreSQL</li>
Default value: `postgresql`
     */
    public void setDBEngine(String DBEngine) {
        this.DBEngine = DBEngine;
    }

    /**
     * Get Configuration information for the database engine, and the configuration format is as follows:
{"$key1":"$value1", "$key2":"$value2"}
Supported engines include:
mssql_compatible engine:
<li>migrationMode: Database mode, an optional parameter, and its valid values are: single-db (single database schema) and multi-db (multiple database schema). The default value is single-db.</li>
<li>defaultLocale: Sorting area rule, an optional parameter, which cannot be modified after initialization, its default value is en_US, and its valid values include:
"af_ZA", "sq_AL", "ar_DZ", "ar_BH", "ar_EG", "ar_IQ", "ar_JO", "ar_KW", "ar_LB", "ar_LY", "ar_MA", "ar_OM", "ar_QA", "ar_SA", "ar_SY", "ar_TN", "ar_AE", "ar_YE", "hy_AM", "az_Cyrl_AZ", "az_Latn_AZ", "eu_ES", "be_BY", "bg_BG", "ca_ES", "zh_HK", "zh_MO", "zh_CN", "zh_SG", "zh_TW", "hr_HR", "cs_CZ", "da_DK", "nl_BE", "nl_NL", "en_AU", "en_BZ", "en_CA", "en_IE", "en_JM", "en_NZ", "en_PH", "en_ZA", "en_TT", "en_GB", "en_US", "en_ZW", "et_EE", "fo_FO", "fa_IR", "fi_FI", "fr_BE", "fr_CA", "fr_FR", "fr_LU", "fr_MC", "fr_CH", "mk_MK", "ka_GE", "de_AT", "de_DE", "de_LI", "de_LU", "de_CH", "el_GR", "gu_IN", "he_IL", "hi_IN", "hu_HU", "is_IS", "id_ID", "it_IT", "it_CH", "ja_JP", "kn_IN", "kok_IN", "ko_KR", "ky_KG", "lv_LV", "lt_LT", "ms_BN", "ms_MY", "mr_IN", "mn_MN", "nb_NO", "nn_NO", "pl_PL", "pt_BR", "pt_PT", "pa_IN", "ro_RO", "ru_RU", "sa_IN", "sr_Cyrl_RS", "sr_Latn_RS", "sk_SK", "sl_SI", "es_AR", "es_BO", "es_CL", "es_CO", "es_CR", "es_DO", "es_EC", "es_SV", "es_GT", "es_HN", "es_MX", "es_NI", "es_PA", "es_PY","es_PE", "es_PR", "es_ES", "es_TRADITIONAL", "es_UY", "es_VE", "sw_KE", "sv_FI", "sv_SE", "tt_RU", "te_IN", "th_TH", "tr_TR", "uk_UA", "ur_IN", "ur_PK", "uz_Cyrl_UZ", "uz_Latn_UZ", and "vi_VN".</li>
<li>serverCollationName: Sorting rule name, an optional parameter, which cannot be modified after initialization, its default value is sql_latin1_general_cp1_ci_as, and its valid values include: "bbf_unicode_general_ci_as", "bbf_unicode_cp1_ci_as", "bbf_unicode_CP1250_ci_as", "bbf_unicode_CP1251_ci_as", "bbf_unicode_cp1253_ci_as", "bbf_unicode_cp1254_ci_as", "bbf_unicode_cp1255_ci_as", "bbf_unicode_cp1256_ci_as", "bbf_unicode_cp1257_ci_as", "bbf_unicode_cp1258_ci_as", "bbf_unicode_cp874_ci_as", "sql_latin1_general_cp1250_ci_as", "sql_latin1_general_cp1251_ci_as", "sql_latin1_general_cp1_ci_as", "sql_latin1_general_cp1253_ci_as", "sql_latin1_general_cp1254_ci_as", "sql_latin1_general_cp1255_ci_as", "sql_latin1_general_cp1256_ci_as", "sql_latin1_general_cp1257_ci_as", "sql_latin1_general_cp1258_ci_as", "chinese_prc_ci_as", "cyrillic_general_ci_as", "finnish_swedish_ci_as", "french_ci_as", "japanese_ci_as", "korean_wansung_ci_as", "latin1_general_ci_as", "modern_spanish_ci_as", "polish_ci_as", "thai_ci_as", "traditional_spanish_ci_as", "turkish_ci_as", "ukrainian_ci_as", and "vietnamese_ci_as".</li> 
     * @return DBEngineConfig Configuration information for the database engine, and the configuration format is as follows:
{"$key1":"$value1", "$key2":"$value2"}
Supported engines include:
mssql_compatible engine:
<li>migrationMode: Database mode, an optional parameter, and its valid values are: single-db (single database schema) and multi-db (multiple database schema). The default value is single-db.</li>
<li>defaultLocale: Sorting area rule, an optional parameter, which cannot be modified after initialization, its default value is en_US, and its valid values include:
"af_ZA", "sq_AL", "ar_DZ", "ar_BH", "ar_EG", "ar_IQ", "ar_JO", "ar_KW", "ar_LB", "ar_LY", "ar_MA", "ar_OM", "ar_QA", "ar_SA", "ar_SY", "ar_TN", "ar_AE", "ar_YE", "hy_AM", "az_Cyrl_AZ", "az_Latn_AZ", "eu_ES", "be_BY", "bg_BG", "ca_ES", "zh_HK", "zh_MO", "zh_CN", "zh_SG", "zh_TW", "hr_HR", "cs_CZ", "da_DK", "nl_BE", "nl_NL", "en_AU", "en_BZ", "en_CA", "en_IE", "en_JM", "en_NZ", "en_PH", "en_ZA", "en_TT", "en_GB", "en_US", "en_ZW", "et_EE", "fo_FO", "fa_IR", "fi_FI", "fr_BE", "fr_CA", "fr_FR", "fr_LU", "fr_MC", "fr_CH", "mk_MK", "ka_GE", "de_AT", "de_DE", "de_LI", "de_LU", "de_CH", "el_GR", "gu_IN", "he_IL", "hi_IN", "hu_HU", "is_IS", "id_ID", "it_IT", "it_CH", "ja_JP", "kn_IN", "kok_IN", "ko_KR", "ky_KG", "lv_LV", "lt_LT", "ms_BN", "ms_MY", "mr_IN", "mn_MN", "nb_NO", "nn_NO", "pl_PL", "pt_BR", "pt_PT", "pa_IN", "ro_RO", "ru_RU", "sa_IN", "sr_Cyrl_RS", "sr_Latn_RS", "sk_SK", "sl_SI", "es_AR", "es_BO", "es_CL", "es_CO", "es_CR", "es_DO", "es_EC", "es_SV", "es_GT", "es_HN", "es_MX", "es_NI", "es_PA", "es_PY","es_PE", "es_PR", "es_ES", "es_TRADITIONAL", "es_UY", "es_VE", "sw_KE", "sv_FI", "sv_SE", "tt_RU", "te_IN", "th_TH", "tr_TR", "uk_UA", "ur_IN", "ur_PK", "uz_Cyrl_UZ", "uz_Latn_UZ", and "vi_VN".</li>
<li>serverCollationName: Sorting rule name, an optional parameter, which cannot be modified after initialization, its default value is sql_latin1_general_cp1_ci_as, and its valid values include: "bbf_unicode_general_ci_as", "bbf_unicode_cp1_ci_as", "bbf_unicode_CP1250_ci_as", "bbf_unicode_CP1251_ci_as", "bbf_unicode_cp1253_ci_as", "bbf_unicode_cp1254_ci_as", "bbf_unicode_cp1255_ci_as", "bbf_unicode_cp1256_ci_as", "bbf_unicode_cp1257_ci_as", "bbf_unicode_cp1258_ci_as", "bbf_unicode_cp874_ci_as", "sql_latin1_general_cp1250_ci_as", "sql_latin1_general_cp1251_ci_as", "sql_latin1_general_cp1_ci_as", "sql_latin1_general_cp1253_ci_as", "sql_latin1_general_cp1254_ci_as", "sql_latin1_general_cp1255_ci_as", "sql_latin1_general_cp1256_ci_as", "sql_latin1_general_cp1257_ci_as", "sql_latin1_general_cp1258_ci_as", "chinese_prc_ci_as", "cyrillic_general_ci_as", "finnish_swedish_ci_as", "french_ci_as", "japanese_ci_as", "korean_wansung_ci_as", "latin1_general_ci_as", "modern_spanish_ci_as", "polish_ci_as", "thai_ci_as", "traditional_spanish_ci_as", "turkish_ci_as", "ukrainian_ci_as", and "vietnamese_ci_as".</li>
     */
    public String getDBEngineConfig() {
        return this.DBEngineConfig;
    }

    /**
     * Set Configuration information for the database engine, and the configuration format is as follows:
{"$key1":"$value1", "$key2":"$value2"}
Supported engines include:
mssql_compatible engine:
<li>migrationMode: Database mode, an optional parameter, and its valid values are: single-db (single database schema) and multi-db (multiple database schema). The default value is single-db.</li>
<li>defaultLocale: Sorting area rule, an optional parameter, which cannot be modified after initialization, its default value is en_US, and its valid values include:
"af_ZA", "sq_AL", "ar_DZ", "ar_BH", "ar_EG", "ar_IQ", "ar_JO", "ar_KW", "ar_LB", "ar_LY", "ar_MA", "ar_OM", "ar_QA", "ar_SA", "ar_SY", "ar_TN", "ar_AE", "ar_YE", "hy_AM", "az_Cyrl_AZ", "az_Latn_AZ", "eu_ES", "be_BY", "bg_BG", "ca_ES", "zh_HK", "zh_MO", "zh_CN", "zh_SG", "zh_TW", "hr_HR", "cs_CZ", "da_DK", "nl_BE", "nl_NL", "en_AU", "en_BZ", "en_CA", "en_IE", "en_JM", "en_NZ", "en_PH", "en_ZA", "en_TT", "en_GB", "en_US", "en_ZW", "et_EE", "fo_FO", "fa_IR", "fi_FI", "fr_BE", "fr_CA", "fr_FR", "fr_LU", "fr_MC", "fr_CH", "mk_MK", "ka_GE", "de_AT", "de_DE", "de_LI", "de_LU", "de_CH", "el_GR", "gu_IN", "he_IL", "hi_IN", "hu_HU", "is_IS", "id_ID", "it_IT", "it_CH", "ja_JP", "kn_IN", "kok_IN", "ko_KR", "ky_KG", "lv_LV", "lt_LT", "ms_BN", "ms_MY", "mr_IN", "mn_MN", "nb_NO", "nn_NO", "pl_PL", "pt_BR", "pt_PT", "pa_IN", "ro_RO", "ru_RU", "sa_IN", "sr_Cyrl_RS", "sr_Latn_RS", "sk_SK", "sl_SI", "es_AR", "es_BO", "es_CL", "es_CO", "es_CR", "es_DO", "es_EC", "es_SV", "es_GT", "es_HN", "es_MX", "es_NI", "es_PA", "es_PY","es_PE", "es_PR", "es_ES", "es_TRADITIONAL", "es_UY", "es_VE", "sw_KE", "sv_FI", "sv_SE", "tt_RU", "te_IN", "th_TH", "tr_TR", "uk_UA", "ur_IN", "ur_PK", "uz_Cyrl_UZ", "uz_Latn_UZ", and "vi_VN".</li>
<li>serverCollationName: Sorting rule name, an optional parameter, which cannot be modified after initialization, its default value is sql_latin1_general_cp1_ci_as, and its valid values include: "bbf_unicode_general_ci_as", "bbf_unicode_cp1_ci_as", "bbf_unicode_CP1250_ci_as", "bbf_unicode_CP1251_ci_as", "bbf_unicode_cp1253_ci_as", "bbf_unicode_cp1254_ci_as", "bbf_unicode_cp1255_ci_as", "bbf_unicode_cp1256_ci_as", "bbf_unicode_cp1257_ci_as", "bbf_unicode_cp1258_ci_as", "bbf_unicode_cp874_ci_as", "sql_latin1_general_cp1250_ci_as", "sql_latin1_general_cp1251_ci_as", "sql_latin1_general_cp1_ci_as", "sql_latin1_general_cp1253_ci_as", "sql_latin1_general_cp1254_ci_as", "sql_latin1_general_cp1255_ci_as", "sql_latin1_general_cp1256_ci_as", "sql_latin1_general_cp1257_ci_as", "sql_latin1_general_cp1258_ci_as", "chinese_prc_ci_as", "cyrillic_general_ci_as", "finnish_swedish_ci_as", "french_ci_as", "japanese_ci_as", "korean_wansung_ci_as", "latin1_general_ci_as", "modern_spanish_ci_as", "polish_ci_as", "thai_ci_as", "traditional_spanish_ci_as", "turkish_ci_as", "ukrainian_ci_as", and "vietnamese_ci_as".</li>
     * @param DBEngineConfig Configuration information for the database engine, and the configuration format is as follows:
{"$key1":"$value1", "$key2":"$value2"}
Supported engines include:
mssql_compatible engine:
<li>migrationMode: Database mode, an optional parameter, and its valid values are: single-db (single database schema) and multi-db (multiple database schema). The default value is single-db.</li>
<li>defaultLocale: Sorting area rule, an optional parameter, which cannot be modified after initialization, its default value is en_US, and its valid values include:
"af_ZA", "sq_AL", "ar_DZ", "ar_BH", "ar_EG", "ar_IQ", "ar_JO", "ar_KW", "ar_LB", "ar_LY", "ar_MA", "ar_OM", "ar_QA", "ar_SA", "ar_SY", "ar_TN", "ar_AE", "ar_YE", "hy_AM", "az_Cyrl_AZ", "az_Latn_AZ", "eu_ES", "be_BY", "bg_BG", "ca_ES", "zh_HK", "zh_MO", "zh_CN", "zh_SG", "zh_TW", "hr_HR", "cs_CZ", "da_DK", "nl_BE", "nl_NL", "en_AU", "en_BZ", "en_CA", "en_IE", "en_JM", "en_NZ", "en_PH", "en_ZA", "en_TT", "en_GB", "en_US", "en_ZW", "et_EE", "fo_FO", "fa_IR", "fi_FI", "fr_BE", "fr_CA", "fr_FR", "fr_LU", "fr_MC", "fr_CH", "mk_MK", "ka_GE", "de_AT", "de_DE", "de_LI", "de_LU", "de_CH", "el_GR", "gu_IN", "he_IL", "hi_IN", "hu_HU", "is_IS", "id_ID", "it_IT", "it_CH", "ja_JP", "kn_IN", "kok_IN", "ko_KR", "ky_KG", "lv_LV", "lt_LT", "ms_BN", "ms_MY", "mr_IN", "mn_MN", "nb_NO", "nn_NO", "pl_PL", "pt_BR", "pt_PT", "pa_IN", "ro_RO", "ru_RU", "sa_IN", "sr_Cyrl_RS", "sr_Latn_RS", "sk_SK", "sl_SI", "es_AR", "es_BO", "es_CL", "es_CO", "es_CR", "es_DO", "es_EC", "es_SV", "es_GT", "es_HN", "es_MX", "es_NI", "es_PA", "es_PY","es_PE", "es_PR", "es_ES", "es_TRADITIONAL", "es_UY", "es_VE", "sw_KE", "sv_FI", "sv_SE", "tt_RU", "te_IN", "th_TH", "tr_TR", "uk_UA", "ur_IN", "ur_PK", "uz_Cyrl_UZ", "uz_Latn_UZ", and "vi_VN".</li>
<li>serverCollationName: Sorting rule name, an optional parameter, which cannot be modified after initialization, its default value is sql_latin1_general_cp1_ci_as, and its valid values include: "bbf_unicode_general_ci_as", "bbf_unicode_cp1_ci_as", "bbf_unicode_CP1250_ci_as", "bbf_unicode_CP1251_ci_as", "bbf_unicode_cp1253_ci_as", "bbf_unicode_cp1254_ci_as", "bbf_unicode_cp1255_ci_as", "bbf_unicode_cp1256_ci_as", "bbf_unicode_cp1257_ci_as", "bbf_unicode_cp1258_ci_as", "bbf_unicode_cp874_ci_as", "sql_latin1_general_cp1250_ci_as", "sql_latin1_general_cp1251_ci_as", "sql_latin1_general_cp1_ci_as", "sql_latin1_general_cp1253_ci_as", "sql_latin1_general_cp1254_ci_as", "sql_latin1_general_cp1255_ci_as", "sql_latin1_general_cp1256_ci_as", "sql_latin1_general_cp1257_ci_as", "sql_latin1_general_cp1258_ci_as", "chinese_prc_ci_as", "cyrillic_general_ci_as", "finnish_swedish_ci_as", "french_ci_as", "japanese_ci_as", "korean_wansung_ci_as", "latin1_general_ci_as", "modern_spanish_ci_as", "polish_ci_as", "thai_ci_as", "traditional_spanish_ci_as", "turkish_ci_as", "ukrainian_ci_as", and "vietnamese_ci_as".</li>
     */
    public void setDBEngineConfig(String DBEngineConfig) {
        this.DBEngineConfig = DBEngineConfig;
    }

    /**
     * Get Primary-standby sync mode, which supports:
<li>Semi-sync: Semi-sync</li>
<li>Async: Asynchronous</li>
Default value for the primary instance: Semi-sync
Default value for the read-only instance: Async 
     * @return SyncMode Primary-standby sync mode, which supports:
<li>Semi-sync: Semi-sync</li>
<li>Async: Asynchronous</li>
Default value for the primary instance: Semi-sync
Default value for the read-only instance: Async
     */
    public String getSyncMode() {
        return this.SyncMode;
    }

    /**
     * Set Primary-standby sync mode, which supports:
<li>Semi-sync: Semi-sync</li>
<li>Async: Asynchronous</li>
Default value for the primary instance: Semi-sync
Default value for the read-only instance: Async
     * @param SyncMode Primary-standby sync mode, which supports:
<li>Semi-sync: Semi-sync</li>
<li>Async: Asynchronous</li>
Default value for the primary instance: Semi-sync
Default value for the read-only instance: Async
     */
    public void setSyncMode(String SyncMode) {
        this.SyncMode = SyncMode;
    }

    /**
     * Get Whether support to IPv6 is required:
<li>`0`: no</li>
<li>`1`: yes</li>
Default value: 0 
     * @return NeedSupportIpv6 Whether support to IPv6 is required:
<li>`0`: no</li>
<li>`1`: yes</li>
Default value: 0
     */
    public Long getNeedSupportIpv6() {
        return this.NeedSupportIpv6;
    }

    /**
     * Set Whether support to IPv6 is required:
<li>`0`: no</li>
<li>`1`: yes</li>
Default value: 0
     * @param NeedSupportIpv6 Whether support to IPv6 is required:
<li>`0`: no</li>
<li>`1`: yes</li>
Default value: 0
     */
    public void setNeedSupportIpv6(Long NeedSupportIpv6) {
        this.NeedSupportIpv6 = NeedSupportIpv6;
    }

    public CreateInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateInstancesRequest(CreateInstancesRequest source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.SpecCode != null) {
            this.SpecCode = new String(source.SpecCode);
        }
        if (source.Storage != null) {
            this.Storage = new Long(source.Storage);
        }
        if (source.InstanceCount != null) {
            this.InstanceCount = new Long(source.InstanceCount);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.Charset != null) {
            this.Charset = new String(source.Charset);
        }
        if (source.AdminName != null) {
            this.AdminName = new String(source.AdminName);
        }
        if (source.AdminPassword != null) {
            this.AdminPassword = new String(source.AdminPassword);
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
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new String(source.InstanceChargeType);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.DBNodeSet != null) {
            this.DBNodeSet = new DBNode[source.DBNodeSet.length];
            for (int i = 0; i < source.DBNodeSet.length; i++) {
                this.DBNodeSet[i] = new DBNode(source.DBNodeSet[i]);
            }
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.AutoVoucher != null) {
            this.AutoVoucher = new Long(source.AutoVoucher);
        }
        if (source.VoucherIds != null) {
            this.VoucherIds = new String[source.VoucherIds.length];
            for (int i = 0; i < source.VoucherIds.length; i++) {
                this.VoucherIds[i] = new String(source.VoucherIds[i]);
            }
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.ActivityId != null) {
            this.ActivityId = new Long(source.ActivityId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.TagList != null) {
            this.TagList = new Tag[source.TagList.length];
            for (int i = 0; i < source.TagList.length; i++) {
                this.TagList[i] = new Tag(source.TagList[i]);
            }
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
        if (source.NeedSupportTDE != null) {
            this.NeedSupportTDE = new Long(source.NeedSupportTDE);
        }
        if (source.KMSKeyId != null) {
            this.KMSKeyId = new String(source.KMSKeyId);
        }
        if (source.KMSRegion != null) {
            this.KMSRegion = new String(source.KMSRegion);
        }
        if (source.DBEngine != null) {
            this.DBEngine = new String(source.DBEngine);
        }
        if (source.DBEngineConfig != null) {
            this.DBEngineConfig = new String(source.DBEngineConfig);
        }
        if (source.SyncMode != null) {
            this.SyncMode = new String(source.SyncMode);
        }
        if (source.NeedSupportIpv6 != null) {
            this.NeedSupportIpv6 = new Long(source.NeedSupportIpv6);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "SpecCode", this.SpecCode);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "Charset", this.Charset);
        this.setParamSimple(map, prefix + "AdminName", this.AdminName);
        this.setParamSimple(map, prefix + "AdminPassword", this.AdminPassword);
        this.setParamSimple(map, prefix + "DBMajorVersion", this.DBMajorVersion);
        this.setParamSimple(map, prefix + "DBVersion", this.DBVersion);
        this.setParamSimple(map, prefix + "DBKernelVersion", this.DBKernelVersion);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamArrayObj(map, prefix + "DBNodeSet.", this.DBNodeSet);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "AutoVoucher", this.AutoVoucher);
        this.setParamArraySimple(map, prefix + "VoucherIds.", this.VoucherIds);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ActivityId", this.ActivityId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "TagList.", this.TagList);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamSimple(map, prefix + "NeedSupportTDE", this.NeedSupportTDE);
        this.setParamSimple(map, prefix + "KMSKeyId", this.KMSKeyId);
        this.setParamSimple(map, prefix + "KMSRegion", this.KMSRegion);
        this.setParamSimple(map, prefix + "DBEngine", this.DBEngine);
        this.setParamSimple(map, prefix + "DBEngineConfig", this.DBEngineConfig);
        this.setParamSimple(map, prefix + "SyncMode", this.SyncMode);
        this.setParamSimple(map, prefix + "NeedSupportIpv6", this.NeedSupportIpv6);

    }
}

