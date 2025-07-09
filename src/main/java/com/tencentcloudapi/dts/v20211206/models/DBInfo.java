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

public class DBInfo extends AbstractModel {

    /**
    * Node role in a distributed database, such as the mongos node in MongoDB.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * Kernel version, such as the different kernel versions of MariaDB.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DbKernel")
    @Expose
    private String DbKernel;

    /**
    * Instance IP address, which is required for the following access types: public network, Direct Connect, VPN, CCN, intranet, and VPC.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * Instance port, which is required for the following access types: public network, self-build on CVM, Direct Connect, VPN, CCN, intranet, and VPC.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Instance username
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * Instance password
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * Short CVM instance ID in the format of `ins-olgl39y8`, which is required if the access type is `cvm`. It is the same as the instance ID displayed in the CVM console.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CvmInstanceId")
    @Expose
    private String CvmInstanceId;

    /**
    * VPN gateway ID in the format of `vpngw-9ghexg7q`, which is required if the access type is `vpncloud`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UniqVpnGwId")
    @Expose
    private String UniqVpnGwId;

    /**
    * Direct Connect gateway ID in the format of `dcg-0rxtqqxb`, which is required if the access type is `dcg`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UniqDcgId")
    @Expose
    private String UniqDcgId;

    /**
    * Database instance ID in the format of `cdb-powiqx8q`, which is required if the access type is `cdb`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * CCN instance ID such as `ccn-afp6kltc`
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CcnGwId")
    @Expose
    private String CcnGwId;

    /**
    * VPC ID in the format of `vpc-92jblxto`, which is required if the access type is `vpc`, `vpncloud`, `ccn`, or `dcg`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * ID of the subnet in the VPC in the format of `subnet-3paxmkdz`, which is required if the access type is `vpc`, `vpncloud`, `ccn`, or `dcg`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Database version in the format of `5.6` or `5.7`, which takes effect only if the instance is an RDS instance. Default value: `5.6`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EngineVersion")
    @Expose
    private String EngineVersion;

    /**
    * Instance account
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Account")
    @Expose
    private String Account;

    /**
    * The role used for cross-account migration, which can contain [a-zA-Z0-9\-\_]+.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AccountRole")
    @Expose
    private String AccountRole;

    /**
    * The account to which the resource belongs. Valid values: empty or `self` (the current account); `other` (another account).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AccountMode")
    @Expose
    private String AccountMode;

    /**
    * Temporary SecretId, you can obtain the temporary key by [GetFederationToken](https://intl.cloud.tencent.com/document/product/1312/48195?from_cn_redirect=1).Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TmpSecretId")
    @Expose
    private String TmpSecretId;

    /**
    * Temporary SecretKey, you can obtain the temporary key by [GetFederationToken](https://intl.cloud.tencent.com/document/product/1312/48195?from_cn_redirect=1).Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TmpSecretKey")
    @Expose
    private String TmpSecretKey;

    /**
    * Temporary token, you can obtain the temporary key by [GetFederationToken](https://intl.cloud.tencent.com/document/product/1312/48195?from_cn_redirect=1).Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TmpToken")
    @Expose
    private String TmpToken;

    /**
     * Get Node role in a distributed database, such as the mongos node in MongoDB.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Role Node role in a distributed database, such as the mongos node in MongoDB.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set Node role in a distributed database, such as the mongos node in MongoDB.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Role Node role in a distributed database, such as the mongos node in MongoDB.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Get Kernel version, such as the different kernel versions of MariaDB.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DbKernel Kernel version, such as the different kernel versions of MariaDB.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDbKernel() {
        return this.DbKernel;
    }

    /**
     * Set Kernel version, such as the different kernel versions of MariaDB.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DbKernel Kernel version, such as the different kernel versions of MariaDB.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDbKernel(String DbKernel) {
        this.DbKernel = DbKernel;
    }

    /**
     * Get Instance IP address, which is required for the following access types: public network, Direct Connect, VPN, CCN, intranet, and VPC.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Host Instance IP address, which is required for the following access types: public network, Direct Connect, VPN, CCN, intranet, and VPC.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set Instance IP address, which is required for the following access types: public network, Direct Connect, VPN, CCN, intranet, and VPC.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Host Instance IP address, which is required for the following access types: public network, Direct Connect, VPN, CCN, intranet, and VPC.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get Instance port, which is required for the following access types: public network, self-build on CVM, Direct Connect, VPN, CCN, intranet, and VPC.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Port Instance port, which is required for the following access types: public network, self-build on CVM, Direct Connect, VPN, CCN, intranet, and VPC.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Instance port, which is required for the following access types: public network, self-build on CVM, Direct Connect, VPN, CCN, intranet, and VPC.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Port Instance port, which is required for the following access types: public network, self-build on CVM, Direct Connect, VPN, CCN, intranet, and VPC.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Instance username
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return User Instance username
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set Instance username
Note: This field may return null, indicating that no valid values can be obtained.
     * @param User Instance username
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get Instance password
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Password Instance password
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set Instance password
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Password Instance password
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPassword(String Password) {
        this.Password = Password;
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
     * Get Database instance ID in the format of `cdb-powiqx8q`, which is required if the access type is `cdb`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceId Database instance ID in the format of `cdb-powiqx8q`, which is required if the access type is `cdb`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Database instance ID in the format of `cdb-powiqx8q`, which is required if the access type is `cdb`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceId Database instance ID in the format of `cdb-powiqx8q`, which is required if the access type is `cdb`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get CCN instance ID such as `ccn-afp6kltc`
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CcnGwId CCN instance ID such as `ccn-afp6kltc`
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCcnGwId() {
        return this.CcnGwId;
    }

    /**
     * Set CCN instance ID such as `ccn-afp6kltc`
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CcnGwId CCN instance ID such as `ccn-afp6kltc`
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCcnGwId(String CcnGwId) {
        this.CcnGwId = CcnGwId;
    }

    /**
     * Get VPC ID in the format of `vpc-92jblxto`, which is required if the access type is `vpc`, `vpncloud`, `ccn`, or `dcg`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VpcId VPC ID in the format of `vpc-92jblxto`, which is required if the access type is `vpc`, `vpncloud`, `ccn`, or `dcg`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID in the format of `vpc-92jblxto`, which is required if the access type is `vpc`, `vpncloud`, `ccn`, or `dcg`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VpcId VPC ID in the format of `vpc-92jblxto`, which is required if the access type is `vpc`, `vpncloud`, `ccn`, or `dcg`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get ID of the subnet in the VPC in the format of `subnet-3paxmkdz`, which is required if the access type is `vpc`, `vpncloud`, `ccn`, or `dcg`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SubnetId ID of the subnet in the VPC in the format of `subnet-3paxmkdz`, which is required if the access type is `vpc`, `vpncloud`, `ccn`, or `dcg`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set ID of the subnet in the VPC in the format of `subnet-3paxmkdz`, which is required if the access type is `vpc`, `vpncloud`, `ccn`, or `dcg`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SubnetId ID of the subnet in the VPC in the format of `subnet-3paxmkdz`, which is required if the access type is `vpc`, `vpncloud`, `ccn`, or `dcg`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
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
     * Get Instance account
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Account Instance account
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAccount() {
        return this.Account;
    }

    /**
     * Set Instance account
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Account Instance account
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAccount(String Account) {
        this.Account = Account;
    }

    /**
     * Get The role used for cross-account migration, which can contain [a-zA-Z0-9\-\_]+.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AccountRole The role used for cross-account migration, which can contain [a-zA-Z0-9\-\_]+.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAccountRole() {
        return this.AccountRole;
    }

    /**
     * Set The role used for cross-account migration, which can contain [a-zA-Z0-9\-\_]+.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AccountRole The role used for cross-account migration, which can contain [a-zA-Z0-9\-\_]+.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAccountRole(String AccountRole) {
        this.AccountRole = AccountRole;
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
     * Get Temporary SecretId, you can obtain the temporary key by [GetFederationToken](https://intl.cloud.tencent.com/document/product/1312/48195?from_cn_redirect=1).Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TmpSecretId Temporary SecretId, you can obtain the temporary key by [GetFederationToken](https://intl.cloud.tencent.com/document/product/1312/48195?from_cn_redirect=1).Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTmpSecretId() {
        return this.TmpSecretId;
    }

    /**
     * Set Temporary SecretId, you can obtain the temporary key by [GetFederationToken](https://intl.cloud.tencent.com/document/product/1312/48195?from_cn_redirect=1).Note: This field may return null, indicating that no valid values can be obtained.
     * @param TmpSecretId Temporary SecretId, you can obtain the temporary key by [GetFederationToken](https://intl.cloud.tencent.com/document/product/1312/48195?from_cn_redirect=1).Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTmpSecretId(String TmpSecretId) {
        this.TmpSecretId = TmpSecretId;
    }

    /**
     * Get Temporary SecretKey, you can obtain the temporary key by [GetFederationToken](https://intl.cloud.tencent.com/document/product/1312/48195?from_cn_redirect=1).Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TmpSecretKey Temporary SecretKey, you can obtain the temporary key by [GetFederationToken](https://intl.cloud.tencent.com/document/product/1312/48195?from_cn_redirect=1).Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTmpSecretKey() {
        return this.TmpSecretKey;
    }

    /**
     * Set Temporary SecretKey, you can obtain the temporary key by [GetFederationToken](https://intl.cloud.tencent.com/document/product/1312/48195?from_cn_redirect=1).Note: This field may return null, indicating that no valid values can be obtained.
     * @param TmpSecretKey Temporary SecretKey, you can obtain the temporary key by [GetFederationToken](https://intl.cloud.tencent.com/document/product/1312/48195?from_cn_redirect=1).Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTmpSecretKey(String TmpSecretKey) {
        this.TmpSecretKey = TmpSecretKey;
    }

    /**
     * Get Temporary token, you can obtain the temporary key by [GetFederationToken](https://intl.cloud.tencent.com/document/product/1312/48195?from_cn_redirect=1).Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TmpToken Temporary token, you can obtain the temporary key by [GetFederationToken](https://intl.cloud.tencent.com/document/product/1312/48195?from_cn_redirect=1).Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTmpToken() {
        return this.TmpToken;
    }

    /**
     * Set Temporary token, you can obtain the temporary key by [GetFederationToken](https://intl.cloud.tencent.com/document/product/1312/48195?from_cn_redirect=1).Note: This field may return null, indicating that no valid values can be obtained.
     * @param TmpToken Temporary token, you can obtain the temporary key by [GetFederationToken](https://intl.cloud.tencent.com/document/product/1312/48195?from_cn_redirect=1).Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTmpToken(String TmpToken) {
        this.TmpToken = TmpToken;
    }

    public DBInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DBInfo(DBInfo source) {
        if (source.Role != null) {
            this.Role = new String(source.Role);
        }
        if (source.DbKernel != null) {
            this.DbKernel = new String(source.DbKernel);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
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
        if (source.CvmInstanceId != null) {
            this.CvmInstanceId = new String(source.CvmInstanceId);
        }
        if (source.UniqVpnGwId != null) {
            this.UniqVpnGwId = new String(source.UniqVpnGwId);
        }
        if (source.UniqDcgId != null) {
            this.UniqDcgId = new String(source.UniqDcgId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.CcnGwId != null) {
            this.CcnGwId = new String(source.CcnGwId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.EngineVersion != null) {
            this.EngineVersion = new String(source.EngineVersion);
        }
        if (source.Account != null) {
            this.Account = new String(source.Account);
        }
        if (source.AccountRole != null) {
            this.AccountRole = new String(source.AccountRole);
        }
        if (source.AccountMode != null) {
            this.AccountMode = new String(source.AccountMode);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "DbKernel", this.DbKernel);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "CvmInstanceId", this.CvmInstanceId);
        this.setParamSimple(map, prefix + "UniqVpnGwId", this.UniqVpnGwId);
        this.setParamSimple(map, prefix + "UniqDcgId", this.UniqDcgId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "CcnGwId", this.CcnGwId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "EngineVersion", this.EngineVersion);
        this.setParamSimple(map, prefix + "Account", this.Account);
        this.setParamSimple(map, prefix + "AccountRole", this.AccountRole);
        this.setParamSimple(map, prefix + "AccountMode", this.AccountMode);
        this.setParamSimple(map, prefix + "TmpSecretId", this.TmpSecretId);
        this.setParamSimple(map, prefix + "TmpSecretKey", this.TmpSecretKey);
        this.setParamSimple(map, prefix + "TmpToken", this.TmpToken);

    }
}

