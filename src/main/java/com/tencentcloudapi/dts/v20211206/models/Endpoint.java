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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Endpoint extends AbstractModel {

    /**
    * Region name, such as `ap-guangzhou`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Node type of TDSQL for MySQL. Enumerated values: `proxy`, `set`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * Database kernel type, which is used to distinguish between different kernels in TDSQL. Valid values: `percona`, `mariadb`, `mysql`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DbKernel")
    @Expose
    private String DbKernel;

    /**
    * Database instance ID in the format of `cdb-powiqx8q`
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Instance IP address, which is required if the access type is not `cdb`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * Instance port, which is required if the access type is not `cdb`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Username, which is required for an instance authenticated by username and password.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * Password, which is required for an instance authenticated by username and password.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * Database name, which is required if the database type is `cdwpg`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * VPC ID in the format of `vpc-92jblxto`, which is required if the access type is `vpc`, `dcg`, or `vpncloud`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * ID of the subnet in the VPC in the format of `subnet-3paxmkdz`, which is required if the access type is `vpc`, `dcg`, or `vpncloud`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Short CVM instance ID in the format of `ins-olgl39y8`, which is required if the access type is `cvm`. It is the same as the instance ID displayed in the CVM console.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CvmInstanceId")
    @Expose
    private String CvmInstanceId;

    /**
    * Direct Connect gateway ID in the format of `dcg-0rxtqqxb`, which is required if the access type is `dcg`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UniqDcgId")
    @Expose
    private String UniqDcgId;

    /**
    * VPN gateway ID in the format of `vpngw-9ghexg7q`, which is required if the access type is `vpncloud`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UniqVpnGwId")
    @Expose
    private String UniqVpnGwId;

    /**
    * CCN instance ID in the format of `ccn-afp6kltc`, which is required if the access type is `ccn`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CcnId")
    @Expose
    private String CcnId;

    /**
    * Cloud vendor type. For Alibaba Cloud ApsaraDB for RDS instances, enter `aliyun`; otherwise, enter `others`. Default value: `others`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Supplier")
    @Expose
    private String Supplier;

    /**
    * Database version in the format of `5.6` or `5.7`, which takes effect only if the instance is an RDS instance. Default value: `5.6`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EngineVersion")
    @Expose
    private String EngineVersion;

    /**
    * Instance account, which is required if the operation is performed across accounts.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Account")
    @Expose
    private String Account;

    /**
    * The account to which the resource belongs. Valid values: empty or `self` (the current account); `other` (another account).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AccountMode")
    @Expose
    private String AccountMode;

    /**
    * The role used for cross-account sync, which can contain [a-zA-Z0-9\-\_]+ and is required if the operation is performed across accounts.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AccountRole")
    @Expose
    private String AccountRole;

    /**
    * External role ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RoleExternalId")
    @Expose
    private String RoleExternalId;

    /**
    * Temporary SecretId, you can obtain the temporary key by [GetFederationToken](https://intl.cloud.tencent.com/document/product/1312/48195?from_cn_redirect=1). This field is required if it is a cross-account instance.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TmpSecretId")
    @Expose
    private String TmpSecretId;

    /**
    * Temporary SecretKey, you can obtain the temporary key by [GetFederationToken](https://intl.cloud.tencent.com/document/product/1312/48195?from_cn_redirect=1). This field is required if it is a cross-account instance.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TmpSecretKey")
    @Expose
    private String TmpSecretKey;

    /**
    * Temporary token, you can obtain the temporary key by [GetFederationToken](https://intl.cloud.tencent.com/document/product/1312/48195?from_cn_redirect=1). This field is required if it is a cross-account instance. Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TmpToken")
    @Expose
    private String TmpToken;

    /**
    * Whether to enable encrypted transfer (`UnEncrypted`: No; `Encrypted`: Yes). Default value: `UnEncrypted`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EncryptConn")
    @Expose
    private String EncryptConn;

    /**
    * Network environment of the database. This parameter is required when `AccessType` is `ccn`. Valid values: `UserIDC` (user IDC), `TencentVPC` (Tencent Cloud VPC).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DatabaseNetEnv")
    @Expose
    private String DatabaseNetEnv;

    /**
    * The root account of CCN in the scenario where the database is connected to CCN under another Tencent Cloud account
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("CcnOwnerUin")
    @Expose
    private String CcnOwnerUin;

    /**
    * 
    */
    @SerializedName("ChildInstanceId")
    @Expose
    private String ChildInstanceId;

    /**
    * 
    */
    @SerializedName("ChildInstanceType")
    @Expose
    private String ChildInstanceType;

    /**
    * 
    */
    @SerializedName("SetId")
    @Expose
    private String SetId;

    /**
     * Get Region name, such as `ap-guangzhou`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Region Region name, such as `ap-guangzhou`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region name, such as `ap-guangzhou`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Region Region name, such as `ap-guangzhou`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Node type of TDSQL for MySQL. Enumerated values: `proxy`, `set`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Role Node type of TDSQL for MySQL. Enumerated values: `proxy`, `set`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set Node type of TDSQL for MySQL. Enumerated values: `proxy`, `set`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Role Node type of TDSQL for MySQL. Enumerated values: `proxy`, `set`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Get Database kernel type, which is used to distinguish between different kernels in TDSQL. Valid values: `percona`, `mariadb`, `mysql`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DbKernel Database kernel type, which is used to distinguish between different kernels in TDSQL. Valid values: `percona`, `mariadb`, `mysql`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDbKernel() {
        return this.DbKernel;
    }

    /**
     * Set Database kernel type, which is used to distinguish between different kernels in TDSQL. Valid values: `percona`, `mariadb`, `mysql`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DbKernel Database kernel type, which is used to distinguish between different kernels in TDSQL. Valid values: `percona`, `mariadb`, `mysql`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDbKernel(String DbKernel) {
        this.DbKernel = DbKernel;
    }

    /**
     * Get Database instance ID in the format of `cdb-powiqx8q`
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceId Database instance ID in the format of `cdb-powiqx8q`
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Database instance ID in the format of `cdb-powiqx8q`
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceId Database instance ID in the format of `cdb-powiqx8q`
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Instance IP address, which is required if the access type is not `cdb`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Ip Instance IP address, which is required if the access type is not `cdb`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set Instance IP address, which is required if the access type is not `cdb`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Ip Instance IP address, which is required if the access type is not `cdb`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get Instance port, which is required if the access type is not `cdb`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Port Instance port, which is required if the access type is not `cdb`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Instance port, which is required if the access type is not `cdb`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Port Instance port, which is required if the access type is not `cdb`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Username, which is required for an instance authenticated by username and password.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return User Username, which is required for an instance authenticated by username and password.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set Username, which is required for an instance authenticated by username and password.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param User Username, which is required for an instance authenticated by username and password.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get Password, which is required for an instance authenticated by username and password.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Password Password, which is required for an instance authenticated by username and password.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set Password, which is required for an instance authenticated by username and password.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Password Password, which is required for an instance authenticated by username and password.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get Database name, which is required if the database type is `cdwpg`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DbName Database name, which is required if the database type is `cdwpg`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set Database name, which is required if the database type is `cdwpg`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DbName Database name, which is required if the database type is `cdwpg`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get VPC ID in the format of `vpc-92jblxto`, which is required if the access type is `vpc`, `dcg`, or `vpncloud`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VpcId VPC ID in the format of `vpc-92jblxto`, which is required if the access type is `vpc`, `dcg`, or `vpncloud`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID in the format of `vpc-92jblxto`, which is required if the access type is `vpc`, `dcg`, or `vpncloud`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VpcId VPC ID in the format of `vpc-92jblxto`, which is required if the access type is `vpc`, `dcg`, or `vpncloud`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get ID of the subnet in the VPC in the format of `subnet-3paxmkdz`, which is required if the access type is `vpc`, `dcg`, or `vpncloud`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SubnetId ID of the subnet in the VPC in the format of `subnet-3paxmkdz`, which is required if the access type is `vpc`, `dcg`, or `vpncloud`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set ID of the subnet in the VPC in the format of `subnet-3paxmkdz`, which is required if the access type is `vpc`, `dcg`, or `vpncloud`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SubnetId ID of the subnet in the VPC in the format of `subnet-3paxmkdz`, which is required if the access type is `vpc`, `dcg`, or `vpncloud`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Short CVM instance ID in the format of `ins-olgl39y8`, which is required if the access type is `cvm`. It is the same as the instance ID displayed in the CVM console.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CvmInstanceId Short CVM instance ID in the format of `ins-olgl39y8`, which is required if the access type is `cvm`. It is the same as the instance ID displayed in the CVM console.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCvmInstanceId() {
        return this.CvmInstanceId;
    }

    /**
     * Set Short CVM instance ID in the format of `ins-olgl39y8`, which is required if the access type is `cvm`. It is the same as the instance ID displayed in the CVM console.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CvmInstanceId Short CVM instance ID in the format of `ins-olgl39y8`, which is required if the access type is `cvm`. It is the same as the instance ID displayed in the CVM console.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCvmInstanceId(String CvmInstanceId) {
        this.CvmInstanceId = CvmInstanceId;
    }

    /**
     * Get Direct Connect gateway ID in the format of `dcg-0rxtqqxb`, which is required if the access type is `dcg`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UniqDcgId Direct Connect gateway ID in the format of `dcg-0rxtqqxb`, which is required if the access type is `dcg`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUniqDcgId() {
        return this.UniqDcgId;
    }

    /**
     * Set Direct Connect gateway ID in the format of `dcg-0rxtqqxb`, which is required if the access type is `dcg`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UniqDcgId Direct Connect gateway ID in the format of `dcg-0rxtqqxb`, which is required if the access type is `dcg`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUniqDcgId(String UniqDcgId) {
        this.UniqDcgId = UniqDcgId;
    }

    /**
     * Get VPN gateway ID in the format of `vpngw-9ghexg7q`, which is required if the access type is `vpncloud`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UniqVpnGwId VPN gateway ID in the format of `vpngw-9ghexg7q`, which is required if the access type is `vpncloud`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUniqVpnGwId() {
        return this.UniqVpnGwId;
    }

    /**
     * Set VPN gateway ID in the format of `vpngw-9ghexg7q`, which is required if the access type is `vpncloud`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UniqVpnGwId VPN gateway ID in the format of `vpngw-9ghexg7q`, which is required if the access type is `vpncloud`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUniqVpnGwId(String UniqVpnGwId) {
        this.UniqVpnGwId = UniqVpnGwId;
    }

    /**
     * Get CCN instance ID in the format of `ccn-afp6kltc`, which is required if the access type is `ccn`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CcnId CCN instance ID in the format of `ccn-afp6kltc`, which is required if the access type is `ccn`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCcnId() {
        return this.CcnId;
    }

    /**
     * Set CCN instance ID in the format of `ccn-afp6kltc`, which is required if the access type is `ccn`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CcnId CCN instance ID in the format of `ccn-afp6kltc`, which is required if the access type is `ccn`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCcnId(String CcnId) {
        this.CcnId = CcnId;
    }

    /**
     * Get Cloud vendor type. For Alibaba Cloud ApsaraDB for RDS instances, enter `aliyun`; otherwise, enter `others`. Default value: `others`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Supplier Cloud vendor type. For Alibaba Cloud ApsaraDB for RDS instances, enter `aliyun`; otherwise, enter `others`. Default value: `others`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSupplier() {
        return this.Supplier;
    }

    /**
     * Set Cloud vendor type. For Alibaba Cloud ApsaraDB for RDS instances, enter `aliyun`; otherwise, enter `others`. Default value: `others`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Supplier Cloud vendor type. For Alibaba Cloud ApsaraDB for RDS instances, enter `aliyun`; otherwise, enter `others`. Default value: `others`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSupplier(String Supplier) {
        this.Supplier = Supplier;
    }

    /**
     * Get Database version in the format of `5.6` or `5.7`, which takes effect only if the instance is an RDS instance. Default value: `5.6`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EngineVersion Database version in the format of `5.6` or `5.7`, which takes effect only if the instance is an RDS instance. Default value: `5.6`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEngineVersion() {
        return this.EngineVersion;
    }

    /**
     * Set Database version in the format of `5.6` or `5.7`, which takes effect only if the instance is an RDS instance. Default value: `5.6`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EngineVersion Database version in the format of `5.6` or `5.7`, which takes effect only if the instance is an RDS instance. Default value: `5.6`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEngineVersion(String EngineVersion) {
        this.EngineVersion = EngineVersion;
    }

    /**
     * Get Instance account, which is required if the operation is performed across accounts.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Account Instance account, which is required if the operation is performed across accounts.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAccount() {
        return this.Account;
    }

    /**
     * Set Instance account, which is required if the operation is performed across accounts.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Account Instance account, which is required if the operation is performed across accounts.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAccount(String Account) {
        this.Account = Account;
    }

    /**
     * Get The account to which the resource belongs. Valid values: empty or `self` (the current account); `other` (another account).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AccountMode The account to which the resource belongs. Valid values: empty or `self` (the current account); `other` (another account).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAccountMode() {
        return this.AccountMode;
    }

    /**
     * Set The account to which the resource belongs. Valid values: empty or `self` (the current account); `other` (another account).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AccountMode The account to which the resource belongs. Valid values: empty or `self` (the current account); `other` (another account).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAccountMode(String AccountMode) {
        this.AccountMode = AccountMode;
    }

    /**
     * Get The role used for cross-account sync, which can contain [a-zA-Z0-9\-\_]+ and is required if the operation is performed across accounts.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AccountRole The role used for cross-account sync, which can contain [a-zA-Z0-9\-\_]+ and is required if the operation is performed across accounts.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAccountRole() {
        return this.AccountRole;
    }

    /**
     * Set The role used for cross-account sync, which can contain [a-zA-Z0-9\-\_]+ and is required if the operation is performed across accounts.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AccountRole The role used for cross-account sync, which can contain [a-zA-Z0-9\-\_]+ and is required if the operation is performed across accounts.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAccountRole(String AccountRole) {
        this.AccountRole = AccountRole;
    }

    /**
     * Get External role ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RoleExternalId External role ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRoleExternalId() {
        return this.RoleExternalId;
    }

    /**
     * Set External role ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RoleExternalId External role ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRoleExternalId(String RoleExternalId) {
        this.RoleExternalId = RoleExternalId;
    }

    /**
     * Get Temporary SecretId, you can obtain the temporary key by [GetFederationToken](https://intl.cloud.tencent.com/document/product/1312/48195?from_cn_redirect=1). This field is required if it is a cross-account instance.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TmpSecretId Temporary SecretId, you can obtain the temporary key by [GetFederationToken](https://intl.cloud.tencent.com/document/product/1312/48195?from_cn_redirect=1). This field is required if it is a cross-account instance.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTmpSecretId() {
        return this.TmpSecretId;
    }

    /**
     * Set Temporary SecretId, you can obtain the temporary key by [GetFederationToken](https://intl.cloud.tencent.com/document/product/1312/48195?from_cn_redirect=1). This field is required if it is a cross-account instance.Note: This field may return null, indicating that no valid values can be obtained.
     * @param TmpSecretId Temporary SecretId, you can obtain the temporary key by [GetFederationToken](https://intl.cloud.tencent.com/document/product/1312/48195?from_cn_redirect=1). This field is required if it is a cross-account instance.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTmpSecretId(String TmpSecretId) {
        this.TmpSecretId = TmpSecretId;
    }

    /**
     * Get Temporary SecretKey, you can obtain the temporary key by [GetFederationToken](https://intl.cloud.tencent.com/document/product/1312/48195?from_cn_redirect=1). This field is required if it is a cross-account instance.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TmpSecretKey Temporary SecretKey, you can obtain the temporary key by [GetFederationToken](https://intl.cloud.tencent.com/document/product/1312/48195?from_cn_redirect=1). This field is required if it is a cross-account instance.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTmpSecretKey() {
        return this.TmpSecretKey;
    }

    /**
     * Set Temporary SecretKey, you can obtain the temporary key by [GetFederationToken](https://intl.cloud.tencent.com/document/product/1312/48195?from_cn_redirect=1). This field is required if it is a cross-account instance.Note: This field may return null, indicating that no valid values can be obtained.
     * @param TmpSecretKey Temporary SecretKey, you can obtain the temporary key by [GetFederationToken](https://intl.cloud.tencent.com/document/product/1312/48195?from_cn_redirect=1). This field is required if it is a cross-account instance.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTmpSecretKey(String TmpSecretKey) {
        this.TmpSecretKey = TmpSecretKey;
    }

    /**
     * Get Temporary token, you can obtain the temporary key by [GetFederationToken](https://intl.cloud.tencent.com/document/product/1312/48195?from_cn_redirect=1). This field is required if it is a cross-account instance. Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TmpToken Temporary token, you can obtain the temporary key by [GetFederationToken](https://intl.cloud.tencent.com/document/product/1312/48195?from_cn_redirect=1). This field is required if it is a cross-account instance. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTmpToken() {
        return this.TmpToken;
    }

    /**
     * Set Temporary token, you can obtain the temporary key by [GetFederationToken](https://intl.cloud.tencent.com/document/product/1312/48195?from_cn_redirect=1). This field is required if it is a cross-account instance. Note: This field may return null, indicating that no valid values can be obtained.
     * @param TmpToken Temporary token, you can obtain the temporary key by [GetFederationToken](https://intl.cloud.tencent.com/document/product/1312/48195?from_cn_redirect=1). This field is required if it is a cross-account instance. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTmpToken(String TmpToken) {
        this.TmpToken = TmpToken;
    }

    /**
     * Get Whether to enable encrypted transfer (`UnEncrypted`: No; `Encrypted`: Yes). Default value: `UnEncrypted`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EncryptConn Whether to enable encrypted transfer (`UnEncrypted`: No; `Encrypted`: Yes). Default value: `UnEncrypted`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEncryptConn() {
        return this.EncryptConn;
    }

    /**
     * Set Whether to enable encrypted transfer (`UnEncrypted`: No; `Encrypted`: Yes). Default value: `UnEncrypted`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EncryptConn Whether to enable encrypted transfer (`UnEncrypted`: No; `Encrypted`: Yes). Default value: `UnEncrypted`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEncryptConn(String EncryptConn) {
        this.EncryptConn = EncryptConn;
    }

    /**
     * Get Network environment of the database. This parameter is required when `AccessType` is `ccn`. Valid values: `UserIDC` (user IDC), `TencentVPC` (Tencent Cloud VPC).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DatabaseNetEnv Network environment of the database. This parameter is required when `AccessType` is `ccn`. Valid values: `UserIDC` (user IDC), `TencentVPC` (Tencent Cloud VPC).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDatabaseNetEnv() {
        return this.DatabaseNetEnv;
    }

    /**
     * Set Network environment of the database. This parameter is required when `AccessType` is `ccn`. Valid values: `UserIDC` (user IDC), `TencentVPC` (Tencent Cloud VPC).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DatabaseNetEnv Network environment of the database. This parameter is required when `AccessType` is `ccn`. Valid values: `UserIDC` (user IDC), `TencentVPC` (Tencent Cloud VPC).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDatabaseNetEnv(String DatabaseNetEnv) {
        this.DatabaseNetEnv = DatabaseNetEnv;
    }

    /**
     * Get The root account of CCN in the scenario where the database is connected to CCN under another Tencent Cloud account
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return CcnOwnerUin The root account of CCN in the scenario where the database is connected to CCN under another Tencent Cloud account
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getCcnOwnerUin() {
        return this.CcnOwnerUin;
    }

    /**
     * Set The root account of CCN in the scenario where the database is connected to CCN under another Tencent Cloud account
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param CcnOwnerUin The root account of CCN in the scenario where the database is connected to CCN under another Tencent Cloud account
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setCcnOwnerUin(String CcnOwnerUin) {
        this.CcnOwnerUin = CcnOwnerUin;
    }

    /**
     * Get  
     * @return ChildInstanceId 
     */
    public String getChildInstanceId() {
        return this.ChildInstanceId;
    }

    /**
     * Set 
     * @param ChildInstanceId 
     */
    public void setChildInstanceId(String ChildInstanceId) {
        this.ChildInstanceId = ChildInstanceId;
    }

    /**
     * Get  
     * @return ChildInstanceType 
     */
    public String getChildInstanceType() {
        return this.ChildInstanceType;
    }

    /**
     * Set 
     * @param ChildInstanceType 
     */
    public void setChildInstanceType(String ChildInstanceType) {
        this.ChildInstanceType = ChildInstanceType;
    }

    /**
     * Get  
     * @return SetId 
     */
    public String getSetId() {
        return this.SetId;
    }

    /**
     * Set 
     * @param SetId 
     */
    public void setSetId(String SetId) {
        this.SetId = SetId;
    }

    public Endpoint() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Endpoint(Endpoint source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Role != null) {
            this.Role = new String(source.Role);
        }
        if (source.DbKernel != null) {
            this.DbKernel = new String(source.DbKernel);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.DbName != null) {
            this.DbName = new String(source.DbName);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.CvmInstanceId != null) {
            this.CvmInstanceId = new String(source.CvmInstanceId);
        }
        if (source.UniqDcgId != null) {
            this.UniqDcgId = new String(source.UniqDcgId);
        }
        if (source.UniqVpnGwId != null) {
            this.UniqVpnGwId = new String(source.UniqVpnGwId);
        }
        if (source.CcnId != null) {
            this.CcnId = new String(source.CcnId);
        }
        if (source.Supplier != null) {
            this.Supplier = new String(source.Supplier);
        }
        if (source.EngineVersion != null) {
            this.EngineVersion = new String(source.EngineVersion);
        }
        if (source.Account != null) {
            this.Account = new String(source.Account);
        }
        if (source.AccountMode != null) {
            this.AccountMode = new String(source.AccountMode);
        }
        if (source.AccountRole != null) {
            this.AccountRole = new String(source.AccountRole);
        }
        if (source.RoleExternalId != null) {
            this.RoleExternalId = new String(source.RoleExternalId);
        }
        if (source.TmpSecretId != null) {
            this.TmpSecretId = new String(source.TmpSecretId);
        }
        if (source.TmpSecretKey != null) {
            this.TmpSecretKey = new String(source.TmpSecretKey);
        }
        if (source.TmpToken != null) {
            this.TmpToken = new String(source.TmpToken);
        }
        if (source.EncryptConn != null) {
            this.EncryptConn = new String(source.EncryptConn);
        }
        if (source.DatabaseNetEnv != null) {
            this.DatabaseNetEnv = new String(source.DatabaseNetEnv);
        }
        if (source.CcnOwnerUin != null) {
            this.CcnOwnerUin = new String(source.CcnOwnerUin);
        }
        if (source.ChildInstanceId != null) {
            this.ChildInstanceId = new String(source.ChildInstanceId);
        }
        if (source.ChildInstanceType != null) {
            this.ChildInstanceType = new String(source.ChildInstanceType);
        }
        if (source.SetId != null) {
            this.SetId = new String(source.SetId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "DbKernel", this.DbKernel);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "CvmInstanceId", this.CvmInstanceId);
        this.setParamSimple(map, prefix + "UniqDcgId", this.UniqDcgId);
        this.setParamSimple(map, prefix + "UniqVpnGwId", this.UniqVpnGwId);
        this.setParamSimple(map, prefix + "CcnId", this.CcnId);
        this.setParamSimple(map, prefix + "Supplier", this.Supplier);
        this.setParamSimple(map, prefix + "EngineVersion", this.EngineVersion);
        this.setParamSimple(map, prefix + "Account", this.Account);
        this.setParamSimple(map, prefix + "AccountMode", this.AccountMode);
        this.setParamSimple(map, prefix + "AccountRole", this.AccountRole);
        this.setParamSimple(map, prefix + "RoleExternalId", this.RoleExternalId);
        this.setParamSimple(map, prefix + "TmpSecretId", this.TmpSecretId);
        this.setParamSimple(map, prefix + "TmpSecretKey", this.TmpSecretKey);
        this.setParamSimple(map, prefix + "TmpToken", this.TmpToken);
        this.setParamSimple(map, prefix + "EncryptConn", this.EncryptConn);
        this.setParamSimple(map, prefix + "DatabaseNetEnv", this.DatabaseNetEnv);
        this.setParamSimple(map, prefix + "CcnOwnerUin", this.CcnOwnerUin);
        this.setParamSimple(map, prefix + "ChildInstanceId", this.ChildInstanceId);
        this.setParamSimple(map, prefix + "ChildInstanceType", this.ChildInstanceType);
        this.setParamSimple(map, prefix + "SetId", this.SetId);

    }
}

