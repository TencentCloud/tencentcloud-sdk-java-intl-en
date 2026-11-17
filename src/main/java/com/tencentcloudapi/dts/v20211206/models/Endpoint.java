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
    * <p>Region English name, for example: ap-guangzhou</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>Node type. proxy means the node type is host, set means the node type is node. proxy type must be the first item in the array. Source/target configuration for tdsqlmysql type is required.</p>
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * <p>Database kernel type, used in tdsql to differentiate between different kernels: percona, mariadb, mysql. Note that tdsql-C mysql and tdsql PostgreSQL do not need to fill in this field.</p>
    */
    @SerializedName("DbKernel")
    @Expose
    private String DbKernel;

    /**
    * <p>Database instance ID, in the format of: cdb-powiqx8q</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>IP address of the instance. This item is required when the access type is not cdb.</p>
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * <p>Instance port. This item is required when the access type is not cdb.</p>
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * <p>User name, required for accessing instances that need username and password authentication.</p>
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * <p>Password is required for accessing instances that need username and password authentication.</p>
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * <p>Database name, required when the database is cdwpg</p>
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * <p>Private network ID. This item is required for private network, Direct Connect, and VPN access methods, in the format of vpc-92jblxto.</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>Subnet ID under the private network. This item is required for private network, Direct Connect, and VPN access methods, in the format of subnet-3paxmkdz.</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>CVM instance short ID, in the format of: ins-olgl39y8, is identical to the instance ID displayed on the cloud server console page. If it is a CVM self-created instance, this field is required.</p>
    */
    @SerializedName("CvmInstanceId")
    @Expose
    private String CvmInstanceId;

    /**
    * <p>Direct Connect gateway ID. This item is required for dedicated access type, in the format of: dcg-0rxtqqxb</p>
    */
    @SerializedName("UniqDcgId")
    @Expose
    private String UniqDcgId;

    /**
    * <p>VPN Gateway ID. This item is required for VPN access type, in the format of vpngw-9ghexg7q.</p>
    */
    @SerializedName("UniqVpnGwId")
    @Expose
    private String UniqVpnGwId;

    /**
    * <p>Cloud Connect Network ID. This item is required for the CCN access type, for example: ccn-afp6kltc</p>
    */
    @SerializedName("CcnId")
    @Expose
    private String CcnId;

    /**
    * <p>Cloud vendor type. For RDS instances, fill in aliyun. In other cases, fill in others. Default is others.</p>
    */
    @SerializedName("Supplier")
    @Expose
    private String Supplier;

    /**
    * <p>Database version. Valid only for RDS instances, ignored for other instances, in the format of 5.6 or 5.7, defaults to 5.6.</p>
    */
    @SerializedName("EngineVersion")
    @Expose
    private String EngineVersion;

    /**
    * <p>Account of the instance. This item is required if it is a cross-account instance.</p>
    */
    @SerializedName("Account")
    @Expose
    private String Account;

    /**
    * <p>Associated account is empty, self (means resources within this account), or other (means cross-account resources).</p>
    */
    @SerializedName("AccountMode")
    @Expose
    private String AccountMode;

    /**
    * <p>Role for cross-account sync, only allow [a-zA-Z0-9-_]+. This item is required if it is a cross-account instance.</p>
    */
    @SerializedName("AccountRole")
    @Expose
    private String AccountRole;

    /**
    * <p>External role id</p>
    */
    @SerializedName("RoleExternalId")
    @Expose
    private String RoleExternalId;

    /**
    * <p>Temporary key Id can be obtained by applying for role assumption temporary access credentials https://www.tencentcloud.com/document/product/1312/48197.?from_cn_redirect=1 Among them, the definition of the role resource RoleArn can be found in the DTS cross-account sync document (https://www.tencentcloud.com/document/product/571/68729?from_cn_redirect=1) Section 4 about role-based definition.</p>
    */
    @SerializedName("TmpSecretId")
    @Expose
    private String TmpSecretId;

    /**
    * <p>Temporary key Id can be obtained by applying for role assumption temporary access credentials at https://www.tencentcloud.com/document/product/1312/48197.?from_cn_redirect=1 Among them, the definition of the role resource RoleArn can be found in the DTS cross-account sync document (https://www.tencentcloud.com/document/product/571/68729?from_cn_redirect=1) Section 4 about role definition.</p>
    */
    @SerializedName("TmpSecretKey")
    @Expose
    private String TmpSecretKey;

    /**
    * <p>Temporary key Id can be obtained by applying for role assumption temporary access credentials https://www.tencentcloud.com/document/product/1312/48197.?from_cn_redirect=1 Among them, the definition of the role resource RoleArn can be found in the DTS cross-account sync document (https://www.tencentcloud.com/document/product/571/68729?from_cn_redirect=1) Section 4 about role-based definition.</p>
    */
    @SerializedName("TmpToken")
    @Expose
    private String TmpToken;

    /**
    * <p>Whether to use encrypted transmission. UnEncrypted means no encrypted transmission, Encrypted means encrypted transmission. Default: UnEncrypted</p>
    */
    @SerializedName("EncryptConn")
    @Expose
    private String EncryptConn;

    /**
    * <p>Network environment of the database. Required when AccessType is Cloud Connect Network (ccn). UserIDC refers to User IDC, and TencentVPC refers to Tencent Cloud VPC.</p>
    */
    @SerializedName("DatabaseNetEnv")
    @Expose
    private String DatabaseNetEnv;

    /**
    * <p>When the database is an instance of cross-account cloud networking, it refers to the main account to which the CCN belongs.</p>
    */
    @SerializedName("CcnOwnerUin")
    @Expose
    private String CcnOwnerUin;

    /**
    * <p>When the database is cynos and it is a sub-database instance within the cynos cluster, this parameter is the ID of the sub-instance.</p>
    */
    @SerializedName("ChildInstanceId")
    @Expose
    private String ChildInstanceId;

    /**
    * <p>When the database is cynos and it is a sub-database instance within the cynos cluster, this parameter is the type of the sub-instance, for example: pass ro for a read-only instance, pass rw for a read-write instance.</p>
    */
    @SerializedName("ChildInstanceType")
    @Expose
    private String ChildInstanceType;

    /**
    * <p>Shard id of tdsql. Required if the node type is set.</p>
    */
    @SerializedName("SetId")
    @Expose
    private String SetId;

    /**
     * Get <p>Region English name, for example: ap-guangzhou</p> 
     * @return Region <p>Region English name, for example: ap-guangzhou</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>Region English name, for example: ap-guangzhou</p>
     * @param Region <p>Region English name, for example: ap-guangzhou</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>Node type. proxy means the node type is host, set means the node type is node. proxy type must be the first item in the array. Source/target configuration for tdsqlmysql type is required.</p> 
     * @return Role <p>Node type. proxy means the node type is host, set means the node type is node. proxy type must be the first item in the array. Source/target configuration for tdsqlmysql type is required.</p>
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set <p>Node type. proxy means the node type is host, set means the node type is node. proxy type must be the first item in the array. Source/target configuration for tdsqlmysql type is required.</p>
     * @param Role <p>Node type. proxy means the node type is host, set means the node type is node. proxy type must be the first item in the array. Source/target configuration for tdsqlmysql type is required.</p>
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Get <p>Database kernel type, used in tdsql to differentiate between different kernels: percona, mariadb, mysql. Note that tdsql-C mysql and tdsql PostgreSQL do not need to fill in this field.</p> 
     * @return DbKernel <p>Database kernel type, used in tdsql to differentiate between different kernels: percona, mariadb, mysql. Note that tdsql-C mysql and tdsql PostgreSQL do not need to fill in this field.</p>
     */
    public String getDbKernel() {
        return this.DbKernel;
    }

    /**
     * Set <p>Database kernel type, used in tdsql to differentiate between different kernels: percona, mariadb, mysql. Note that tdsql-C mysql and tdsql PostgreSQL do not need to fill in this field.</p>
     * @param DbKernel <p>Database kernel type, used in tdsql to differentiate between different kernels: percona, mariadb, mysql. Note that tdsql-C mysql and tdsql PostgreSQL do not need to fill in this field.</p>
     */
    public void setDbKernel(String DbKernel) {
        this.DbKernel = DbKernel;
    }

    /**
     * Get <p>Database instance ID, in the format of: cdb-powiqx8q</p> 
     * @return InstanceId <p>Database instance ID, in the format of: cdb-powiqx8q</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Database instance ID, in the format of: cdb-powiqx8q</p>
     * @param InstanceId <p>Database instance ID, in the format of: cdb-powiqx8q</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>IP address of the instance. This item is required when the access type is not cdb.</p> 
     * @return Ip <p>IP address of the instance. This item is required when the access type is not cdb.</p>
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set <p>IP address of the instance. This item is required when the access type is not cdb.</p>
     * @param Ip <p>IP address of the instance. This item is required when the access type is not cdb.</p>
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get <p>Instance port. This item is required when the access type is not cdb.</p> 
     * @return Port <p>Instance port. This item is required when the access type is not cdb.</p>
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set <p>Instance port. This item is required when the access type is not cdb.</p>
     * @param Port <p>Instance port. This item is required when the access type is not cdb.</p>
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get <p>User name, required for accessing instances that need username and password authentication.</p> 
     * @return User <p>User name, required for accessing instances that need username and password authentication.</p>
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set <p>User name, required for accessing instances that need username and password authentication.</p>
     * @param User <p>User name, required for accessing instances that need username and password authentication.</p>
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get <p>Password is required for accessing instances that need username and password authentication.</p> 
     * @return Password <p>Password is required for accessing instances that need username and password authentication.</p>
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set <p>Password is required for accessing instances that need username and password authentication.</p>
     * @param Password <p>Password is required for accessing instances that need username and password authentication.</p>
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get <p>Database name, required when the database is cdwpg</p> 
     * @return DbName <p>Database name, required when the database is cdwpg</p>
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set <p>Database name, required when the database is cdwpg</p>
     * @param DbName <p>Database name, required when the database is cdwpg</p>
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get <p>Private network ID. This item is required for private network, Direct Connect, and VPN access methods, in the format of vpc-92jblxto.</p> 
     * @return VpcId <p>Private network ID. This item is required for private network, Direct Connect, and VPN access methods, in the format of vpc-92jblxto.</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>Private network ID. This item is required for private network, Direct Connect, and VPN access methods, in the format of vpc-92jblxto.</p>
     * @param VpcId <p>Private network ID. This item is required for private network, Direct Connect, and VPN access methods, in the format of vpc-92jblxto.</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>Subnet ID under the private network. This item is required for private network, Direct Connect, and VPN access methods, in the format of subnet-3paxmkdz.</p> 
     * @return SubnetId <p>Subnet ID under the private network. This item is required for private network, Direct Connect, and VPN access methods, in the format of subnet-3paxmkdz.</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>Subnet ID under the private network. This item is required for private network, Direct Connect, and VPN access methods, in the format of subnet-3paxmkdz.</p>
     * @param SubnetId <p>Subnet ID under the private network. This item is required for private network, Direct Connect, and VPN access methods, in the format of subnet-3paxmkdz.</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>CVM instance short ID, in the format of: ins-olgl39y8, is identical to the instance ID displayed on the cloud server console page. If it is a CVM self-created instance, this field is required.</p> 
     * @return CvmInstanceId <p>CVM instance short ID, in the format of: ins-olgl39y8, is identical to the instance ID displayed on the cloud server console page. If it is a CVM self-created instance, this field is required.</p>
     */
    public String getCvmInstanceId() {
        return this.CvmInstanceId;
    }

    /**
     * Set <p>CVM instance short ID, in the format of: ins-olgl39y8, is identical to the instance ID displayed on the cloud server console page. If it is a CVM self-created instance, this field is required.</p>
     * @param CvmInstanceId <p>CVM instance short ID, in the format of: ins-olgl39y8, is identical to the instance ID displayed on the cloud server console page. If it is a CVM self-created instance, this field is required.</p>
     */
    public void setCvmInstanceId(String CvmInstanceId) {
        this.CvmInstanceId = CvmInstanceId;
    }

    /**
     * Get <p>Direct Connect gateway ID. This item is required for dedicated access type, in the format of: dcg-0rxtqqxb</p> 
     * @return UniqDcgId <p>Direct Connect gateway ID. This item is required for dedicated access type, in the format of: dcg-0rxtqqxb</p>
     */
    public String getUniqDcgId() {
        return this.UniqDcgId;
    }

    /**
     * Set <p>Direct Connect gateway ID. This item is required for dedicated access type, in the format of: dcg-0rxtqqxb</p>
     * @param UniqDcgId <p>Direct Connect gateway ID. This item is required for dedicated access type, in the format of: dcg-0rxtqqxb</p>
     */
    public void setUniqDcgId(String UniqDcgId) {
        this.UniqDcgId = UniqDcgId;
    }

    /**
     * Get <p>VPN Gateway ID. This item is required for VPN access type, in the format of vpngw-9ghexg7q.</p> 
     * @return UniqVpnGwId <p>VPN Gateway ID. This item is required for VPN access type, in the format of vpngw-9ghexg7q.</p>
     */
    public String getUniqVpnGwId() {
        return this.UniqVpnGwId;
    }

    /**
     * Set <p>VPN Gateway ID. This item is required for VPN access type, in the format of vpngw-9ghexg7q.</p>
     * @param UniqVpnGwId <p>VPN Gateway ID. This item is required for VPN access type, in the format of vpngw-9ghexg7q.</p>
     */
    public void setUniqVpnGwId(String UniqVpnGwId) {
        this.UniqVpnGwId = UniqVpnGwId;
    }

    /**
     * Get <p>Cloud Connect Network ID. This item is required for the CCN access type, for example: ccn-afp6kltc</p> 
     * @return CcnId <p>Cloud Connect Network ID. This item is required for the CCN access type, for example: ccn-afp6kltc</p>
     */
    public String getCcnId() {
        return this.CcnId;
    }

    /**
     * Set <p>Cloud Connect Network ID. This item is required for the CCN access type, for example: ccn-afp6kltc</p>
     * @param CcnId <p>Cloud Connect Network ID. This item is required for the CCN access type, for example: ccn-afp6kltc</p>
     */
    public void setCcnId(String CcnId) {
        this.CcnId = CcnId;
    }

    /**
     * Get <p>Cloud vendor type. For RDS instances, fill in aliyun. In other cases, fill in others. Default is others.</p> 
     * @return Supplier <p>Cloud vendor type. For RDS instances, fill in aliyun. In other cases, fill in others. Default is others.</p>
     */
    public String getSupplier() {
        return this.Supplier;
    }

    /**
     * Set <p>Cloud vendor type. For RDS instances, fill in aliyun. In other cases, fill in others. Default is others.</p>
     * @param Supplier <p>Cloud vendor type. For RDS instances, fill in aliyun. In other cases, fill in others. Default is others.</p>
     */
    public void setSupplier(String Supplier) {
        this.Supplier = Supplier;
    }

    /**
     * Get <p>Database version. Valid only for RDS instances, ignored for other instances, in the format of 5.6 or 5.7, defaults to 5.6.</p> 
     * @return EngineVersion <p>Database version. Valid only for RDS instances, ignored for other instances, in the format of 5.6 or 5.7, defaults to 5.6.</p>
     */
    public String getEngineVersion() {
        return this.EngineVersion;
    }

    /**
     * Set <p>Database version. Valid only for RDS instances, ignored for other instances, in the format of 5.6 or 5.7, defaults to 5.6.</p>
     * @param EngineVersion <p>Database version. Valid only for RDS instances, ignored for other instances, in the format of 5.6 or 5.7, defaults to 5.6.</p>
     */
    public void setEngineVersion(String EngineVersion) {
        this.EngineVersion = EngineVersion;
    }

    /**
     * Get <p>Account of the instance. This item is required if it is a cross-account instance.</p> 
     * @return Account <p>Account of the instance. This item is required if it is a cross-account instance.</p>
     */
    public String getAccount() {
        return this.Account;
    }

    /**
     * Set <p>Account of the instance. This item is required if it is a cross-account instance.</p>
     * @param Account <p>Account of the instance. This item is required if it is a cross-account instance.</p>
     */
    public void setAccount(String Account) {
        this.Account = Account;
    }

    /**
     * Get <p>Associated account is empty, self (means resources within this account), or other (means cross-account resources).</p> 
     * @return AccountMode <p>Associated account is empty, self (means resources within this account), or other (means cross-account resources).</p>
     */
    public String getAccountMode() {
        return this.AccountMode;
    }

    /**
     * Set <p>Associated account is empty, self (means resources within this account), or other (means cross-account resources).</p>
     * @param AccountMode <p>Associated account is empty, self (means resources within this account), or other (means cross-account resources).</p>
     */
    public void setAccountMode(String AccountMode) {
        this.AccountMode = AccountMode;
    }

    /**
     * Get <p>Role for cross-account sync, only allow [a-zA-Z0-9-_]+. This item is required if it is a cross-account instance.</p> 
     * @return AccountRole <p>Role for cross-account sync, only allow [a-zA-Z0-9-_]+. This item is required if it is a cross-account instance.</p>
     */
    public String getAccountRole() {
        return this.AccountRole;
    }

    /**
     * Set <p>Role for cross-account sync, only allow [a-zA-Z0-9-_]+. This item is required if it is a cross-account instance.</p>
     * @param AccountRole <p>Role for cross-account sync, only allow [a-zA-Z0-9-_]+. This item is required if it is a cross-account instance.</p>
     */
    public void setAccountRole(String AccountRole) {
        this.AccountRole = AccountRole;
    }

    /**
     * Get <p>External role id</p> 
     * @return RoleExternalId <p>External role id</p>
     */
    public String getRoleExternalId() {
        return this.RoleExternalId;
    }

    /**
     * Set <p>External role id</p>
     * @param RoleExternalId <p>External role id</p>
     */
    public void setRoleExternalId(String RoleExternalId) {
        this.RoleExternalId = RoleExternalId;
    }

    /**
     * Get <p>Temporary key Id can be obtained by applying for role assumption temporary access credentials https://www.tencentcloud.com/document/product/1312/48197.?from_cn_redirect=1 Among them, the definition of the role resource RoleArn can be found in the DTS cross-account sync document (https://www.tencentcloud.com/document/product/571/68729?from_cn_redirect=1) Section 4 about role-based definition.</p> 
     * @return TmpSecretId <p>Temporary key Id can be obtained by applying for role assumption temporary access credentials https://www.tencentcloud.com/document/product/1312/48197.?from_cn_redirect=1 Among them, the definition of the role resource RoleArn can be found in the DTS cross-account sync document (https://www.tencentcloud.com/document/product/571/68729?from_cn_redirect=1) Section 4 about role-based definition.</p>
     */
    public String getTmpSecretId() {
        return this.TmpSecretId;
    }

    /**
     * Set <p>Temporary key Id can be obtained by applying for role assumption temporary access credentials https://www.tencentcloud.com/document/product/1312/48197.?from_cn_redirect=1 Among them, the definition of the role resource RoleArn can be found in the DTS cross-account sync document (https://www.tencentcloud.com/document/product/571/68729?from_cn_redirect=1) Section 4 about role-based definition.</p>
     * @param TmpSecretId <p>Temporary key Id can be obtained by applying for role assumption temporary access credentials https://www.tencentcloud.com/document/product/1312/48197.?from_cn_redirect=1 Among them, the definition of the role resource RoleArn can be found in the DTS cross-account sync document (https://www.tencentcloud.com/document/product/571/68729?from_cn_redirect=1) Section 4 about role-based definition.</p>
     */
    public void setTmpSecretId(String TmpSecretId) {
        this.TmpSecretId = TmpSecretId;
    }

    /**
     * Get <p>Temporary key Id can be obtained by applying for role assumption temporary access credentials at https://www.tencentcloud.com/document/product/1312/48197.?from_cn_redirect=1 Among them, the definition of the role resource RoleArn can be found in the DTS cross-account sync document (https://www.tencentcloud.com/document/product/571/68729?from_cn_redirect=1) Section 4 about role definition.</p> 
     * @return TmpSecretKey <p>Temporary key Id can be obtained by applying for role assumption temporary access credentials at https://www.tencentcloud.com/document/product/1312/48197.?from_cn_redirect=1 Among them, the definition of the role resource RoleArn can be found in the DTS cross-account sync document (https://www.tencentcloud.com/document/product/571/68729?from_cn_redirect=1) Section 4 about role definition.</p>
     */
    public String getTmpSecretKey() {
        return this.TmpSecretKey;
    }

    /**
     * Set <p>Temporary key Id can be obtained by applying for role assumption temporary access credentials at https://www.tencentcloud.com/document/product/1312/48197.?from_cn_redirect=1 Among them, the definition of the role resource RoleArn can be found in the DTS cross-account sync document (https://www.tencentcloud.com/document/product/571/68729?from_cn_redirect=1) Section 4 about role definition.</p>
     * @param TmpSecretKey <p>Temporary key Id can be obtained by applying for role assumption temporary access credentials at https://www.tencentcloud.com/document/product/1312/48197.?from_cn_redirect=1 Among them, the definition of the role resource RoleArn can be found in the DTS cross-account sync document (https://www.tencentcloud.com/document/product/571/68729?from_cn_redirect=1) Section 4 about role definition.</p>
     */
    public void setTmpSecretKey(String TmpSecretKey) {
        this.TmpSecretKey = TmpSecretKey;
    }

    /**
     * Get <p>Temporary key Id can be obtained by applying for role assumption temporary access credentials https://www.tencentcloud.com/document/product/1312/48197.?from_cn_redirect=1 Among them, the definition of the role resource RoleArn can be found in the DTS cross-account sync document (https://www.tencentcloud.com/document/product/571/68729?from_cn_redirect=1) Section 4 about role-based definition.</p> 
     * @return TmpToken <p>Temporary key Id can be obtained by applying for role assumption temporary access credentials https://www.tencentcloud.com/document/product/1312/48197.?from_cn_redirect=1 Among them, the definition of the role resource RoleArn can be found in the DTS cross-account sync document (https://www.tencentcloud.com/document/product/571/68729?from_cn_redirect=1) Section 4 about role-based definition.</p>
     */
    public String getTmpToken() {
        return this.TmpToken;
    }

    /**
     * Set <p>Temporary key Id can be obtained by applying for role assumption temporary access credentials https://www.tencentcloud.com/document/product/1312/48197.?from_cn_redirect=1 Among them, the definition of the role resource RoleArn can be found in the DTS cross-account sync document (https://www.tencentcloud.com/document/product/571/68729?from_cn_redirect=1) Section 4 about role-based definition.</p>
     * @param TmpToken <p>Temporary key Id can be obtained by applying for role assumption temporary access credentials https://www.tencentcloud.com/document/product/1312/48197.?from_cn_redirect=1 Among them, the definition of the role resource RoleArn can be found in the DTS cross-account sync document (https://www.tencentcloud.com/document/product/571/68729?from_cn_redirect=1) Section 4 about role-based definition.</p>
     */
    public void setTmpToken(String TmpToken) {
        this.TmpToken = TmpToken;
    }

    /**
     * Get <p>Whether to use encrypted transmission. UnEncrypted means no encrypted transmission, Encrypted means encrypted transmission. Default: UnEncrypted</p> 
     * @return EncryptConn <p>Whether to use encrypted transmission. UnEncrypted means no encrypted transmission, Encrypted means encrypted transmission. Default: UnEncrypted</p>
     */
    public String getEncryptConn() {
        return this.EncryptConn;
    }

    /**
     * Set <p>Whether to use encrypted transmission. UnEncrypted means no encrypted transmission, Encrypted means encrypted transmission. Default: UnEncrypted</p>
     * @param EncryptConn <p>Whether to use encrypted transmission. UnEncrypted means no encrypted transmission, Encrypted means encrypted transmission. Default: UnEncrypted</p>
     */
    public void setEncryptConn(String EncryptConn) {
        this.EncryptConn = EncryptConn;
    }

    /**
     * Get <p>Network environment of the database. Required when AccessType is Cloud Connect Network (ccn). UserIDC refers to User IDC, and TencentVPC refers to Tencent Cloud VPC.</p> 
     * @return DatabaseNetEnv <p>Network environment of the database. Required when AccessType is Cloud Connect Network (ccn). UserIDC refers to User IDC, and TencentVPC refers to Tencent Cloud VPC.</p>
     */
    public String getDatabaseNetEnv() {
        return this.DatabaseNetEnv;
    }

    /**
     * Set <p>Network environment of the database. Required when AccessType is Cloud Connect Network (ccn). UserIDC refers to User IDC, and TencentVPC refers to Tencent Cloud VPC.</p>
     * @param DatabaseNetEnv <p>Network environment of the database. Required when AccessType is Cloud Connect Network (ccn). UserIDC refers to User IDC, and TencentVPC refers to Tencent Cloud VPC.</p>
     */
    public void setDatabaseNetEnv(String DatabaseNetEnv) {
        this.DatabaseNetEnv = DatabaseNetEnv;
    }

    /**
     * Get <p>When the database is an instance of cross-account cloud networking, it refers to the main account to which the CCN belongs.</p> 
     * @return CcnOwnerUin <p>When the database is an instance of cross-account cloud networking, it refers to the main account to which the CCN belongs.</p>
     */
    public String getCcnOwnerUin() {
        return this.CcnOwnerUin;
    }

    /**
     * Set <p>When the database is an instance of cross-account cloud networking, it refers to the main account to which the CCN belongs.</p>
     * @param CcnOwnerUin <p>When the database is an instance of cross-account cloud networking, it refers to the main account to which the CCN belongs.</p>
     */
    public void setCcnOwnerUin(String CcnOwnerUin) {
        this.CcnOwnerUin = CcnOwnerUin;
    }

    /**
     * Get <p>When the database is cynos and it is a sub-database instance within the cynos cluster, this parameter is the ID of the sub-instance.</p> 
     * @return ChildInstanceId <p>When the database is cynos and it is a sub-database instance within the cynos cluster, this parameter is the ID of the sub-instance.</p>
     */
    public String getChildInstanceId() {
        return this.ChildInstanceId;
    }

    /**
     * Set <p>When the database is cynos and it is a sub-database instance within the cynos cluster, this parameter is the ID of the sub-instance.</p>
     * @param ChildInstanceId <p>When the database is cynos and it is a sub-database instance within the cynos cluster, this parameter is the ID of the sub-instance.</p>
     */
    public void setChildInstanceId(String ChildInstanceId) {
        this.ChildInstanceId = ChildInstanceId;
    }

    /**
     * Get <p>When the database is cynos and it is a sub-database instance within the cynos cluster, this parameter is the type of the sub-instance, for example: pass ro for a read-only instance, pass rw for a read-write instance.</p> 
     * @return ChildInstanceType <p>When the database is cynos and it is a sub-database instance within the cynos cluster, this parameter is the type of the sub-instance, for example: pass ro for a read-only instance, pass rw for a read-write instance.</p>
     */
    public String getChildInstanceType() {
        return this.ChildInstanceType;
    }

    /**
     * Set <p>When the database is cynos and it is a sub-database instance within the cynos cluster, this parameter is the type of the sub-instance, for example: pass ro for a read-only instance, pass rw for a read-write instance.</p>
     * @param ChildInstanceType <p>When the database is cynos and it is a sub-database instance within the cynos cluster, this parameter is the type of the sub-instance, for example: pass ro for a read-only instance, pass rw for a read-write instance.</p>
     */
    public void setChildInstanceType(String ChildInstanceType) {
        this.ChildInstanceType = ChildInstanceType;
    }

    /**
     * Get <p>Shard id of tdsql. Required if the node type is set.</p> 
     * @return SetId <p>Shard id of tdsql. Required if the node type is set.</p>
     */
    public String getSetId() {
        return this.SetId;
    }

    /**
     * Set <p>Shard id of tdsql. Required if the node type is set.</p>
     * @param SetId <p>Shard id of tdsql. Required if the node type is set.</p>
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

