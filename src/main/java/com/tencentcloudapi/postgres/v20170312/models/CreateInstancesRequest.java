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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateInstancesRequest extends AbstractModel{

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
    * Validity period in months.
<li>Monthly subscription: `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `24`, `36`.
<li>Pay-as-you-go: `1`.
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * Instance character set. Valid values: 
<li> `UTF8`
<li> `LATIN1`
    */
    @SerializedName("Charset")
    @Expose
    private String Charset;

    /**
    * Username of the instance root account, which has the following rules:
<li>It must contain 1–16 letters , digits, or underscores
<li>It can't be `postgres`.
<li>It can't start with a digit or `pg_`.
<li>All rules are case-insensitive.
    */
    @SerializedName("AdminName")
    @Expose
    private String AdminName;

    /**
    * Password of the instance root account, which must contain 8-32 characters (above 12 characters preferably). It cannot begin with "/",
and must contain the following 4 types of characters.
<li>Lowercase letters: [a–z]
<li>Uppercase letters: [A–Z]
<li>Digits: 0-9
<li>Symbols: ()`~!@#$%^&*-+=_|{}[]:;'<>,.?/
    */
    @SerializedName("AdminPassword")
    @Expose
    private String AdminPassword;

    /**
    * The major PostgreSQL version number, which can be queried by the [DescribeDBVersions](https://intl.cloud.tencent.com/document/api/409/89018?from_cn_redirect=1) API. Valid values: `10`, `11`, `12`, `13`, `14`, `15`.
When only this parameter is specified, an instance running the latest kernel version of the latest minor version will be created based on this major version.
You must pass in at least one of the following parameters: `DBMajorVersion`, `DBVersion`, DBKernelVersion`. If you don't need a minor version, just pass in `DBMajorVersion`.

    */
    @SerializedName("DBMajorVersion")
    @Expose
    private String DBMajorVersion;

    /**
    * Number of the major PostgreSQL community version and minor version, which can be queried by the [DescribeDBVersions](https://intl.cloud.tencent.com/document/api/409/89018?from_cn_redirect=1) API.
If it is specified, an instance running the latest kernel version will be created based on the community minor version.
You must pass in at least one of the following parameters: `DBMajorVersion`, `DBVersion`, DBKernelVersion`.
    */
    @SerializedName("DBVersion")
    @Expose
    private String DBVersion;

    /**
    * PostgreSQL kernel version number, which can be queried by the [DescribeDBVersions](https://intl.cloud.tencent.com/document/api/409/89018?from_cn_redirect=1) API.
PostgreSQL kernel version number. If it is specified, an instance running the specified kernel version will be created. Passing in this parameter in other scenarios is not supported.This parameter is only used to specify a kernel version, which serves no other purposes.

    */
    @SerializedName("DBKernelVersion")
    @Expose
    private String DBKernelVersion;

    /**
    * Instance billing mode. Valid values:
<li>`PREPAID`: Monthly subscription
<li>`POSTPAID_BY_HOUR`: Pay-as-you-go
Default value: `PREPAID`.
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * VPC ID in the format of `vpc-xxxxxxx`. To obtain valid VPC IDs, you can log in to the console or call [DescribeVpcEx](https://intl.cloud.tencent.com/document/api/215/1372?from_cn_redirect=1) and look for the `unVpcId` fields in the response.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * VPC subnet ID in the format of `subnet-xxxxxxxx`, u200cwhich can be obtained in the console or from the `unSubnetId` field in the return value of the [DescribeSubnets](https://intl.cloud.tencent.com/document/api/215/15784?from_cn_redirect=1) API.
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
    * Auto-renewal flag. Valid values:
<li>`0`: Manual renewal.
<li> `1`: Automatic renewal.
Default value: `0`.
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * Whether to use vouchers automatically. Valid values:
<li>`0`: No.
<li>`1`: Yes.
Default value: `0`.
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
    * Whether to support TDE. Valid values:
<li>`0`: No.
<li>`1`: Yes.
Default value: `0`.
For more information, see [TDE]u200d(https://www.tencentcloud.com/document/product/409/47765).
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
    * Database engines. Valid values:
<li>`postgresql`: TencentDB for PostgreSQL
<li>`mssql_compatible`: MSSQL compatible-TencentDB for PostgreSQL
Default value: `postgresql`.
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
<li>`serverCollationName`: Default collation name, which can’t be modified after the initialization. Default value: "bbf_unicode_general_ci_as". Valid values: "bbf_unicode_cp1_ci_as", "bbf_unicode_CP1250_ci_as", "bbf_unicode_CP1251_ci_as", "bbf_unicode_cp1253_ci_as", "bbf_unicode_cp1254_ci_as", "bbf_unicode_cp1255_ci_as", "bbf_unicode_cp1256_ci_as", "bbf_unicode_cp1257_ci_as", "bbf_unicode_cp1258_ci_as", "bbf_unicode_cp874_ci_as", "sql_latin1_general_cp1250_ci_as", "sql_latin1_general_cp1251_ci_as", "sql_latin1_general_cp1_ci_as", "sql_latin1_general_cp1253_ci_as", "sql_latin1_general_cp1254_ci_as", "sql_latin1_general_cp1255_ci_as","sql_latin1_general_cp1256_ci_as", "sql_latin1_general_cp1257_ci_as", "sql_latin1_general_cp1258_ci_as", "chinese_prc_ci_as", "cyrillic_general_ci_as", "finnish_swedish_ci_as", "french_ci_as", "japanese_ci_as", "korean_wansung_ci_as", "latin1_general_ci_as", "modern_spanish_ci_as", "polish_ci_as", "thai_ci_as", "traditional_spanish_ci_as", "turkish_ci_as", "ukrainian_ci_as", "vietnamese_ci_as"。
    */
    @SerializedName("DBEngineConfig")
    @Expose
    private String DBEngineConfig;

    /**
    * Primary-standby sync mode. Valid values:  
<li>`Semi-sync`
<li>`Async`
Default value for the primary instance: `Semi-sync`.
Default value for the standby instance: `Async`.
    */
    @SerializedName("SyncMode")
    @Expose
    private String SyncMode;

    /**
    * Whether IPv6 is supported.
<li>`0`: No.
<li>`1`: Yes.
Default value: `0`.
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
     * Get Validity period in months.
<li>Monthly subscription: `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `24`, `36`.
<li>Pay-as-you-go: `1`. 
     * @return Period Validity period in months.
<li>Monthly subscription: `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `24`, `36`.
<li>Pay-as-you-go: `1`.
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set Validity period in months.
<li>Monthly subscription: `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `24`, `36`.
<li>Pay-as-you-go: `1`.
     * @param Period Validity period in months.
<li>Monthly subscription: `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `24`, `36`.
<li>Pay-as-you-go: `1`.
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get Instance character set. Valid values: 
<li> `UTF8`
<li> `LATIN1` 
     * @return Charset Instance character set. Valid values: 
<li> `UTF8`
<li> `LATIN1`
     */
    public String getCharset() {
        return this.Charset;
    }

    /**
     * Set Instance character set. Valid values: 
<li> `UTF8`
<li> `LATIN1`
     * @param Charset Instance character set. Valid values: 
<li> `UTF8`
<li> `LATIN1`
     */
    public void setCharset(String Charset) {
        this.Charset = Charset;
    }

    /**
     * Get Username of the instance root account, which has the following rules:
<li>It must contain 1–16 letters , digits, or underscores
<li>It can't be `postgres`.
<li>It can't start with a digit or `pg_`.
<li>All rules are case-insensitive. 
     * @return AdminName Username of the instance root account, which has the following rules:
<li>It must contain 1–16 letters , digits, or underscores
<li>It can't be `postgres`.
<li>It can't start with a digit or `pg_`.
<li>All rules are case-insensitive.
     */
    public String getAdminName() {
        return this.AdminName;
    }

    /**
     * Set Username of the instance root account, which has the following rules:
<li>It must contain 1–16 letters , digits, or underscores
<li>It can't be `postgres`.
<li>It can't start with a digit or `pg_`.
<li>All rules are case-insensitive.
     * @param AdminName Username of the instance root account, which has the following rules:
<li>It must contain 1–16 letters , digits, or underscores
<li>It can't be `postgres`.
<li>It can't start with a digit or `pg_`.
<li>All rules are case-insensitive.
     */
    public void setAdminName(String AdminName) {
        this.AdminName = AdminName;
    }

    /**
     * Get Password of the instance root account, which must contain 8-32 characters (above 12 characters preferably). It cannot begin with "/",
and must contain the following 4 types of characters.
<li>Lowercase letters: [a–z]
<li>Uppercase letters: [A–Z]
<li>Digits: 0-9
<li>Symbols: ()`~!@#$%^&*-+=_|{}[]:;'<>,.?/ 
     * @return AdminPassword Password of the instance root account, which must contain 8-32 characters (above 12 characters preferably). It cannot begin with "/",
and must contain the following 4 types of characters.
<li>Lowercase letters: [a–z]
<li>Uppercase letters: [A–Z]
<li>Digits: 0-9
<li>Symbols: ()`~!@#$%^&*-+=_|{}[]:;'<>,.?/
     */
    public String getAdminPassword() {
        return this.AdminPassword;
    }

    /**
     * Set Password of the instance root account, which must contain 8-32 characters (above 12 characters preferably). It cannot begin with "/",
and must contain the following 4 types of characters.
<li>Lowercase letters: [a–z]
<li>Uppercase letters: [A–Z]
<li>Digits: 0-9
<li>Symbols: ()`~!@#$%^&*-+=_|{}[]:;'<>,.?/
     * @param AdminPassword Password of the instance root account, which must contain 8-32 characters (above 12 characters preferably). It cannot begin with "/",
and must contain the following 4 types of characters.
<li>Lowercase letters: [a–z]
<li>Uppercase letters: [A–Z]
<li>Digits: 0-9
<li>Symbols: ()`~!@#$%^&*-+=_|{}[]:;'<>,.?/
     */
    public void setAdminPassword(String AdminPassword) {
        this.AdminPassword = AdminPassword;
    }

    /**
     * Get The major PostgreSQL version number, which can be queried by the [DescribeDBVersions](https://intl.cloud.tencent.com/document/api/409/89018?from_cn_redirect=1) API. Valid values: `10`, `11`, `12`, `13`, `14`, `15`.
When only this parameter is specified, an instance running the latest kernel version of the latest minor version will be created based on this major version.
You must pass in at least one of the following parameters: `DBMajorVersion`, `DBVersion`, DBKernelVersion`. If you don't need a minor version, just pass in `DBMajorVersion`.
 
     * @return DBMajorVersion The major PostgreSQL version number, which can be queried by the [DescribeDBVersions](https://intl.cloud.tencent.com/document/api/409/89018?from_cn_redirect=1) API. Valid values: `10`, `11`, `12`, `13`, `14`, `15`.
When only this parameter is specified, an instance running the latest kernel version of the latest minor version will be created based on this major version.
You must pass in at least one of the following parameters: `DBMajorVersion`, `DBVersion`, DBKernelVersion`. If you don't need a minor version, just pass in `DBMajorVersion`.

     */
    public String getDBMajorVersion() {
        return this.DBMajorVersion;
    }

    /**
     * Set The major PostgreSQL version number, which can be queried by the [DescribeDBVersions](https://intl.cloud.tencent.com/document/api/409/89018?from_cn_redirect=1) API. Valid values: `10`, `11`, `12`, `13`, `14`, `15`.
When only this parameter is specified, an instance running the latest kernel version of the latest minor version will be created based on this major version.
You must pass in at least one of the following parameters: `DBMajorVersion`, `DBVersion`, DBKernelVersion`. If you don't need a minor version, just pass in `DBMajorVersion`.

     * @param DBMajorVersion The major PostgreSQL version number, which can be queried by the [DescribeDBVersions](https://intl.cloud.tencent.com/document/api/409/89018?from_cn_redirect=1) API. Valid values: `10`, `11`, `12`, `13`, `14`, `15`.
When only this parameter is specified, an instance running the latest kernel version of the latest minor version will be created based on this major version.
You must pass in at least one of the following parameters: `DBMajorVersion`, `DBVersion`, DBKernelVersion`. If you don't need a minor version, just pass in `DBMajorVersion`.

     */
    public void setDBMajorVersion(String DBMajorVersion) {
        this.DBMajorVersion = DBMajorVersion;
    }

    /**
     * Get Number of the major PostgreSQL community version and minor version, which can be queried by the [DescribeDBVersions](https://intl.cloud.tencent.com/document/api/409/89018?from_cn_redirect=1) API.
If it is specified, an instance running the latest kernel version will be created based on the community minor version.
You must pass in at least one of the following parameters: `DBMajorVersion`, `DBVersion`, DBKernelVersion`. 
     * @return DBVersion Number of the major PostgreSQL community version and minor version, which can be queried by the [DescribeDBVersions](https://intl.cloud.tencent.com/document/api/409/89018?from_cn_redirect=1) API.
If it is specified, an instance running the latest kernel version will be created based on the community minor version.
You must pass in at least one of the following parameters: `DBMajorVersion`, `DBVersion`, DBKernelVersion`.
     */
    public String getDBVersion() {
        return this.DBVersion;
    }

    /**
     * Set Number of the major PostgreSQL community version and minor version, which can be queried by the [DescribeDBVersions](https://intl.cloud.tencent.com/document/api/409/89018?from_cn_redirect=1) API.
If it is specified, an instance running the latest kernel version will be created based on the community minor version.
You must pass in at least one of the following parameters: `DBMajorVersion`, `DBVersion`, DBKernelVersion`.
     * @param DBVersion Number of the major PostgreSQL community version and minor version, which can be queried by the [DescribeDBVersions](https://intl.cloud.tencent.com/document/api/409/89018?from_cn_redirect=1) API.
If it is specified, an instance running the latest kernel version will be created based on the community minor version.
You must pass in at least one of the following parameters: `DBMajorVersion`, `DBVersion`, DBKernelVersion`.
     */
    public void setDBVersion(String DBVersion) {
        this.DBVersion = DBVersion;
    }

    /**
     * Get PostgreSQL kernel version number, which can be queried by the [DescribeDBVersions](https://intl.cloud.tencent.com/document/api/409/89018?from_cn_redirect=1) API.
PostgreSQL kernel version number. If it is specified, an instance running the specified kernel version will be created. Passing in this parameter in other scenarios is not supported.This parameter is only used to specify a kernel version, which serves no other purposes.
 
     * @return DBKernelVersion PostgreSQL kernel version number, which can be queried by the [DescribeDBVersions](https://intl.cloud.tencent.com/document/api/409/89018?from_cn_redirect=1) API.
PostgreSQL kernel version number. If it is specified, an instance running the specified kernel version will be created. Passing in this parameter in other scenarios is not supported.This parameter is only used to specify a kernel version, which serves no other purposes.

     */
    public String getDBKernelVersion() {
        return this.DBKernelVersion;
    }

    /**
     * Set PostgreSQL kernel version number, which can be queried by the [DescribeDBVersions](https://intl.cloud.tencent.com/document/api/409/89018?from_cn_redirect=1) API.
PostgreSQL kernel version number. If it is specified, an instance running the specified kernel version will be created. Passing in this parameter in other scenarios is not supported.This parameter is only used to specify a kernel version, which serves no other purposes.

     * @param DBKernelVersion PostgreSQL kernel version number, which can be queried by the [DescribeDBVersions](https://intl.cloud.tencent.com/document/api/409/89018?from_cn_redirect=1) API.
PostgreSQL kernel version number. If it is specified, an instance running the specified kernel version will be created. Passing in this parameter in other scenarios is not supported.This parameter is only used to specify a kernel version, which serves no other purposes.

     */
    public void setDBKernelVersion(String DBKernelVersion) {
        this.DBKernelVersion = DBKernelVersion;
    }

    /**
     * Get Instance billing mode. Valid values:
<li>`PREPAID`: Monthly subscription
<li>`POSTPAID_BY_HOUR`: Pay-as-you-go
Default value: `PREPAID`. 
     * @return InstanceChargeType Instance billing mode. Valid values:
<li>`PREPAID`: Monthly subscription
<li>`POSTPAID_BY_HOUR`: Pay-as-you-go
Default value: `PREPAID`.
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set Instance billing mode. Valid values:
<li>`PREPAID`: Monthly subscription
<li>`POSTPAID_BY_HOUR`: Pay-as-you-go
Default value: `PREPAID`.
     * @param InstanceChargeType Instance billing mode. Valid values:
<li>`PREPAID`: Monthly subscription
<li>`POSTPAID_BY_HOUR`: Pay-as-you-go
Default value: `PREPAID`.
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get VPC ID in the format of `vpc-xxxxxxx`. To obtain valid VPC IDs, you can log in to the console or call [DescribeVpcEx](https://intl.cloud.tencent.com/document/api/215/1372?from_cn_redirect=1) and look for the `unVpcId` fields in the response. 
     * @return VpcId VPC ID in the format of `vpc-xxxxxxx`. To obtain valid VPC IDs, you can log in to the console or call [DescribeVpcEx](https://intl.cloud.tencent.com/document/api/215/1372?from_cn_redirect=1) and look for the `unVpcId` fields in the response.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID in the format of `vpc-xxxxxxx`. To obtain valid VPC IDs, you can log in to the console or call [DescribeVpcEx](https://intl.cloud.tencent.com/document/api/215/1372?from_cn_redirect=1) and look for the `unVpcId` fields in the response.
     * @param VpcId VPC ID in the format of `vpc-xxxxxxx`. To obtain valid VPC IDs, you can log in to the console or call [DescribeVpcEx](https://intl.cloud.tencent.com/document/api/215/1372?from_cn_redirect=1) and look for the `unVpcId` fields in the response.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get VPC subnet ID in the format of `subnet-xxxxxxxx`, u200cwhich can be obtained in the console or from the `unSubnetId` field in the return value of the [DescribeSubnets](https://intl.cloud.tencent.com/document/api/215/15784?from_cn_redirect=1) API. 
     * @return SubnetId VPC subnet ID in the format of `subnet-xxxxxxxx`, u200cwhich can be obtained in the console or from the `unSubnetId` field in the return value of the [DescribeSubnets](https://intl.cloud.tencent.com/document/api/215/15784?from_cn_redirect=1) API.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set VPC subnet ID in the format of `subnet-xxxxxxxx`, u200cwhich can be obtained in the console or from the `unSubnetId` field in the return value of the [DescribeSubnets](https://intl.cloud.tencent.com/document/api/215/15784?from_cn_redirect=1) API.
     * @param SubnetId VPC subnet ID in the format of `subnet-xxxxxxxx`, u200cwhich can be obtained in the console or from the `unSubnetId` field in the return value of the [DescribeSubnets](https://intl.cloud.tencent.com/document/api/215/15784?from_cn_redirect=1) API.
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
     * Get Auto-renewal flag. Valid values:
<li>`0`: Manual renewal.
<li> `1`: Automatic renewal.
Default value: `0`. 
     * @return AutoRenewFlag Auto-renewal flag. Valid values:
<li>`0`: Manual renewal.
<li> `1`: Automatic renewal.
Default value: `0`.
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set Auto-renewal flag. Valid values:
<li>`0`: Manual renewal.
<li> `1`: Automatic renewal.
Default value: `0`.
     * @param AutoRenewFlag Auto-renewal flag. Valid values:
<li>`0`: Manual renewal.
<li> `1`: Automatic renewal.
Default value: `0`.
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get Whether to use vouchers automatically. Valid values:
<li>`0`: No.
<li>`1`: Yes.
Default value: `0`. 
     * @return AutoVoucher Whether to use vouchers automatically. Valid values:
<li>`0`: No.
<li>`1`: Yes.
Default value: `0`.
     */
    public Long getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set Whether to use vouchers automatically. Valid values:
<li>`0`: No.
<li>`1`: Yes.
Default value: `0`.
     * @param AutoVoucher Whether to use vouchers automatically. Valid values:
<li>`0`: No.
<li>`1`: Yes.
Default value: `0`.
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
     * Get Whether to support TDE. Valid values:
<li>`0`: No.
<li>`1`: Yes.
Default value: `0`.
For more information, see [TDE]u200d(https://www.tencentcloud.com/document/product/409/47765). 
     * @return NeedSupportTDE Whether to support TDE. Valid values:
<li>`0`: No.
<li>`1`: Yes.
Default value: `0`.
For more information, see [TDE]u200d(https://www.tencentcloud.com/document/product/409/47765).
     */
    public Long getNeedSupportTDE() {
        return this.NeedSupportTDE;
    }

    /**
     * Set Whether to support TDE. Valid values:
<li>`0`: No.
<li>`1`: Yes.
Default value: `0`.
For more information, see [TDE]u200d(https://www.tencentcloud.com/document/product/409/47765).
     * @param NeedSupportTDE Whether to support TDE. Valid values:
<li>`0`: No.
<li>`1`: Yes.
Default value: `0`.
For more information, see [TDE]u200d(https://www.tencentcloud.com/document/product/409/47765).
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
     * Get Database engines. Valid values:
<li>`postgresql`: TencentDB for PostgreSQL
<li>`mssql_compatible`: MSSQL compatible-TencentDB for PostgreSQL
Default value: `postgresql`. 
     * @return DBEngine Database engines. Valid values:
<li>`postgresql`: TencentDB for PostgreSQL
<li>`mssql_compatible`: MSSQL compatible-TencentDB for PostgreSQL
Default value: `postgresql`.
     */
    public String getDBEngine() {
        return this.DBEngine;
    }

    /**
     * Set Database engines. Valid values:
<li>`postgresql`: TencentDB for PostgreSQL
<li>`mssql_compatible`: MSSQL compatible-TencentDB for PostgreSQL
Default value: `postgresql`.
     * @param DBEngine Database engines. Valid values:
<li>`postgresql`: TencentDB for PostgreSQL
<li>`mssql_compatible`: MSSQL compatible-TencentDB for PostgreSQL
Default value: `postgresql`.
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
<li>`serverCollationName`: Default collation name, which can’t be modified after the initialization. Default value: "bbf_unicode_general_ci_as". Valid values: "bbf_unicode_cp1_ci_as", "bbf_unicode_CP1250_ci_as", "bbf_unicode_CP1251_ci_as", "bbf_unicode_cp1253_ci_as", "bbf_unicode_cp1254_ci_as", "bbf_unicode_cp1255_ci_as", "bbf_unicode_cp1256_ci_as", "bbf_unicode_cp1257_ci_as", "bbf_unicode_cp1258_ci_as", "bbf_unicode_cp874_ci_as", "sql_latin1_general_cp1250_ci_as", "sql_latin1_general_cp1251_ci_as", "sql_latin1_general_cp1_ci_as", "sql_latin1_general_cp1253_ci_as", "sql_latin1_general_cp1254_ci_as", "sql_latin1_general_cp1255_ci_as","sql_latin1_general_cp1256_ci_as", "sql_latin1_general_cp1257_ci_as", "sql_latin1_general_cp1258_ci_as", "chinese_prc_ci_as", "cyrillic_general_ci_as", "finnish_swedish_ci_as", "french_ci_as", "japanese_ci_as", "korean_wansung_ci_as", "latin1_general_ci_as", "modern_spanish_ci_as", "polish_ci_as", "thai_ci_as", "traditional_spanish_ci_as", "turkish_ci_as", "ukrainian_ci_as", "vietnamese_ci_as"。 
     * @return DBEngineConfig Configuration information of database engine in the following format:
{"$key1":"$value1", "$key2":"$value2"}
Valid values:
mssql_compatible engine:
<li>`migrationMode`: Database mode. Valid values: `single-db` (single-database mode), `multi-db` (multi-database mode). Default value: `single-db`.
<li>`defaultLocale`: Default locale, which can’t be modified after the initialization. Default value: `en_US`. Valid values:
"af_ZA", "sq_AL", "ar_DZ", "ar_BH", "ar_EG", "ar_IQ", "ar_JO", "ar_KW", "ar_LB", "ar_LY", "ar_MA", "ar_OM", "ar_QA", "ar_SA", "ar_SY", "ar_TN", "ar_AE", "ar_YE", "hy_AM", "az_Cyrl_AZ", "az_Latn_AZ", "eu_ES", "be_BY", "bg_BG", "ca_ES", "zh_HK", "zh_MO", "zh_CN", "zh_SG", "zh_TW", "hr_HR", "cs_CZ", "da_DK", "nl_BE", "nl_NL", "en_AU", "en_BZ", "en_CA", "en_IE", "en_JM", "en_NZ", "en_PH", "en_ZA", "en_TT", "en_GB", "en_US", "en_ZW", "et_EE", "fo_FO", "fa_IR", "fi_FI", "fr_BE", "fr_CA", "fr_FR", "fr_LU", "fr_MC", "fr_CH", "mk_MK", "ka_GE", "de_AT", "de_DE", "de_LI", "de_LU", "de_CH", "el_GR", "gu_IN", "he_IL", "hi_IN", "hu_HU", "is_IS", "id_ID", "it_IT", "it_CH", "ja_JP", "kn_IN", "kok_IN", "ko_KR", "ky_KG", "lv_LV", "lt_LT", "ms_BN", "ms_MY", "mr_IN", "mn_MN", "nb_NO", "nn_NO", "pl_PL", "pt_BR", "pt_PT", "pa_IN", "ro_RO", "ru_RU", "sa_IN", "sr_Cyrl_RS", "sr_Latn_RS", "sk_SK", "sl_SI", "es_AR", "es_BO", "es_CL", "es_CO", "es_CR", "es_DO", "es_EC", "es_SV", "es_GT", "es_HN", "es_MX", "es_NI", "es_PA", "es_PY","es_PE", "es_PR", "es_ES", "es_TRADITIONAL", "es_UY", "es_VE", "sw_KE", "sv_FI", "sv_SE", "tt_RU", "te_IN", "th_TH", "tr_TR", "uk_UA", "ur_IN", "ur_PK", "uz_Cyrl_UZ", "uz_Latn_UZ", "vi_VN".
<li>`serverCollationName`: Default collation name, which can’t be modified after the initialization. Default value: "bbf_unicode_general_ci_as". Valid values: "bbf_unicode_cp1_ci_as", "bbf_unicode_CP1250_ci_as", "bbf_unicode_CP1251_ci_as", "bbf_unicode_cp1253_ci_as", "bbf_unicode_cp1254_ci_as", "bbf_unicode_cp1255_ci_as", "bbf_unicode_cp1256_ci_as", "bbf_unicode_cp1257_ci_as", "bbf_unicode_cp1258_ci_as", "bbf_unicode_cp874_ci_as", "sql_latin1_general_cp1250_ci_as", "sql_latin1_general_cp1251_ci_as", "sql_latin1_general_cp1_ci_as", "sql_latin1_general_cp1253_ci_as", "sql_latin1_general_cp1254_ci_as", "sql_latin1_general_cp1255_ci_as","sql_latin1_general_cp1256_ci_as", "sql_latin1_general_cp1257_ci_as", "sql_latin1_general_cp1258_ci_as", "chinese_prc_ci_as", "cyrillic_general_ci_as", "finnish_swedish_ci_as", "french_ci_as", "japanese_ci_as", "korean_wansung_ci_as", "latin1_general_ci_as", "modern_spanish_ci_as", "polish_ci_as", "thai_ci_as", "traditional_spanish_ci_as", "turkish_ci_as", "ukrainian_ci_as", "vietnamese_ci_as"。
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
<li>`serverCollationName`: Default collation name, which can’t be modified after the initialization. Default value: "bbf_unicode_general_ci_as". Valid values: "bbf_unicode_cp1_ci_as", "bbf_unicode_CP1250_ci_as", "bbf_unicode_CP1251_ci_as", "bbf_unicode_cp1253_ci_as", "bbf_unicode_cp1254_ci_as", "bbf_unicode_cp1255_ci_as", "bbf_unicode_cp1256_ci_as", "bbf_unicode_cp1257_ci_as", "bbf_unicode_cp1258_ci_as", "bbf_unicode_cp874_ci_as", "sql_latin1_general_cp1250_ci_as", "sql_latin1_general_cp1251_ci_as", "sql_latin1_general_cp1_ci_as", "sql_latin1_general_cp1253_ci_as", "sql_latin1_general_cp1254_ci_as", "sql_latin1_general_cp1255_ci_as","sql_latin1_general_cp1256_ci_as", "sql_latin1_general_cp1257_ci_as", "sql_latin1_general_cp1258_ci_as", "chinese_prc_ci_as", "cyrillic_general_ci_as", "finnish_swedish_ci_as", "french_ci_as", "japanese_ci_as", "korean_wansung_ci_as", "latin1_general_ci_as", "modern_spanish_ci_as", "polish_ci_as", "thai_ci_as", "traditional_spanish_ci_as", "turkish_ci_as", "ukrainian_ci_as", "vietnamese_ci_as"。
     * @param DBEngineConfig Configuration information of database engine in the following format:
{"$key1":"$value1", "$key2":"$value2"}
Valid values:
mssql_compatible engine:
<li>`migrationMode`: Database mode. Valid values: `single-db` (single-database mode), `multi-db` (multi-database mode). Default value: `single-db`.
<li>`defaultLocale`: Default locale, which can’t be modified after the initialization. Default value: `en_US`. Valid values:
"af_ZA", "sq_AL", "ar_DZ", "ar_BH", "ar_EG", "ar_IQ", "ar_JO", "ar_KW", "ar_LB", "ar_LY", "ar_MA", "ar_OM", "ar_QA", "ar_SA", "ar_SY", "ar_TN", "ar_AE", "ar_YE", "hy_AM", "az_Cyrl_AZ", "az_Latn_AZ", "eu_ES", "be_BY", "bg_BG", "ca_ES", "zh_HK", "zh_MO", "zh_CN", "zh_SG", "zh_TW", "hr_HR", "cs_CZ", "da_DK", "nl_BE", "nl_NL", "en_AU", "en_BZ", "en_CA", "en_IE", "en_JM", "en_NZ", "en_PH", "en_ZA", "en_TT", "en_GB", "en_US", "en_ZW", "et_EE", "fo_FO", "fa_IR", "fi_FI", "fr_BE", "fr_CA", "fr_FR", "fr_LU", "fr_MC", "fr_CH", "mk_MK", "ka_GE", "de_AT", "de_DE", "de_LI", "de_LU", "de_CH", "el_GR", "gu_IN", "he_IL", "hi_IN", "hu_HU", "is_IS", "id_ID", "it_IT", "it_CH", "ja_JP", "kn_IN", "kok_IN", "ko_KR", "ky_KG", "lv_LV", "lt_LT", "ms_BN", "ms_MY", "mr_IN", "mn_MN", "nb_NO", "nn_NO", "pl_PL", "pt_BR", "pt_PT", "pa_IN", "ro_RO", "ru_RU", "sa_IN", "sr_Cyrl_RS", "sr_Latn_RS", "sk_SK", "sl_SI", "es_AR", "es_BO", "es_CL", "es_CO", "es_CR", "es_DO", "es_EC", "es_SV", "es_GT", "es_HN", "es_MX", "es_NI", "es_PA", "es_PY","es_PE", "es_PR", "es_ES", "es_TRADITIONAL", "es_UY", "es_VE", "sw_KE", "sv_FI", "sv_SE", "tt_RU", "te_IN", "th_TH", "tr_TR", "uk_UA", "ur_IN", "ur_PK", "uz_Cyrl_UZ", "uz_Latn_UZ", "vi_VN".
<li>`serverCollationName`: Default collation name, which can’t be modified after the initialization. Default value: "bbf_unicode_general_ci_as". Valid values: "bbf_unicode_cp1_ci_as", "bbf_unicode_CP1250_ci_as", "bbf_unicode_CP1251_ci_as", "bbf_unicode_cp1253_ci_as", "bbf_unicode_cp1254_ci_as", "bbf_unicode_cp1255_ci_as", "bbf_unicode_cp1256_ci_as", "bbf_unicode_cp1257_ci_as", "bbf_unicode_cp1258_ci_as", "bbf_unicode_cp874_ci_as", "sql_latin1_general_cp1250_ci_as", "sql_latin1_general_cp1251_ci_as", "sql_latin1_general_cp1_ci_as", "sql_latin1_general_cp1253_ci_as", "sql_latin1_general_cp1254_ci_as", "sql_latin1_general_cp1255_ci_as","sql_latin1_general_cp1256_ci_as", "sql_latin1_general_cp1257_ci_as", "sql_latin1_general_cp1258_ci_as", "chinese_prc_ci_as", "cyrillic_general_ci_as", "finnish_swedish_ci_as", "french_ci_as", "japanese_ci_as", "korean_wansung_ci_as", "latin1_general_ci_as", "modern_spanish_ci_as", "polish_ci_as", "thai_ci_as", "traditional_spanish_ci_as", "turkish_ci_as", "ukrainian_ci_as", "vietnamese_ci_as"。
     */
    public void setDBEngineConfig(String DBEngineConfig) {
        this.DBEngineConfig = DBEngineConfig;
    }

    /**
     * Get Primary-standby sync mode. Valid values:  
<li>`Semi-sync`
<li>`Async`
Default value for the primary instance: `Semi-sync`.
Default value for the standby instance: `Async`. 
     * @return SyncMode Primary-standby sync mode. Valid values:  
<li>`Semi-sync`
<li>`Async`
Default value for the primary instance: `Semi-sync`.
Default value for the standby instance: `Async`.
     */
    public String getSyncMode() {
        return this.SyncMode;
    }

    /**
     * Set Primary-standby sync mode. Valid values:  
<li>`Semi-sync`
<li>`Async`
Default value for the primary instance: `Semi-sync`.
Default value for the standby instance: `Async`.
     * @param SyncMode Primary-standby sync mode. Valid values:  
<li>`Semi-sync`
<li>`Async`
Default value for the primary instance: `Semi-sync`.
Default value for the standby instance: `Async`.
     */
    public void setSyncMode(String SyncMode) {
        this.SyncMode = SyncMode;
    }

    /**
     * Get Whether IPv6 is supported.
<li>`0`: No.
<li>`1`: Yes.
Default value: `0`. 
     * @return NeedSupportIpv6 Whether IPv6 is supported.
<li>`0`: No.
<li>`1`: Yes.
Default value: `0`.
     */
    public Long getNeedSupportIpv6() {
        return this.NeedSupportIpv6;
    }

    /**
     * Set Whether IPv6 is supported.
<li>`0`: No.
<li>`1`: Yes.
Default value: `0`.
     * @param NeedSupportIpv6 Whether IPv6 is supported.
<li>`0`: No.
<li>`1`: Yes.
Default value: `0`.
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

