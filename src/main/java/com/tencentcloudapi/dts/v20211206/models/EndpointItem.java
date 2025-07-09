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

public class EndpointItem extends AbstractModel {

    /**
    * Region of the source database. If AccessType is ccn, please fill in the region where vpc is located because the region of the source database is unknown. For other access methods, please fill in the region where the subscription task is located, as ensuring the subscription task and the source database are in the same region is the optimal network solution.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DatabaseRegion")
    @Expose
    private String DatabaseRegion;

    /**
    * UsernameNote: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * Password. It is required when used as an input parameter and empty when used as an output parameter.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * Target instance ID. This field is required when AccessType is cdb. When configuring the InstanceId, the instance information is queried and checked. The mysql query interface has been authenticated. Please ensure that the sub-user has the cdb:DescribeDBInstances interface permission.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Cloud Virtual Machine ID. This field is required when AccessType is cvm.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CvmInstanceId")
    @Expose
    private String CvmInstanceId;

    /**
    * Direct Connect gateway ID. This field is required when AccessType is dcg.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UniqDcgId")
    @Expose
    private String UniqDcgId;

    /**
    * Cloud Connect Network ID. This field is required when AccessType is ccn.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CcnId")
    @Expose
    private String CcnId;

    /**
    * VPN gateway ID. This field is required when AccessType is vpncloud.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UniqVpnGwId")
    @Expose
    private String UniqVpnGwId;

    /**
    * VpcID. This field is required when AccessType is dcg\ccn\vpncloud\vpc.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Subnet ID. This field is required when AccessType is dcg\ccn\vpncloud\vpc.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Database address, supports domain name and IP. This field is required when AccessType is dcg\ccn\vpncloud\vpc\extranet\intranet.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * Database port. This field is required when AccessType is dcg\ccn\vpncloud\vpc\extranet\intranet\cvm.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Whether to use encrypted transmission. Valid values: UnEncrypted; Encrypted. Only mysql supports it. If it is not filled in, it will not be encrypted by default. Other products do not need to fill in this.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EncryptConn")
    @Expose
    private String EncryptConn;

    /**
    * Database network environment. This field is required when AccessType is ccn. Valid values: UserIDC; TencentVPC; Aws; AliYun; Others.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DatabaseNetEnv")
    @Expose
    private String DatabaseNetEnv;

    /**
    * The UIN of the main account to which the Cloud Connect Network gateway belongs. It is required for cross-account CCN.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CcnOwnerUin")
    @Expose
    private String CcnOwnerUin;

    /**
    * Additional information added for the business. Parameter name is called key, parameter value is called value. Mandatory parameters for tdpg: PgDatabase (subscribed database name).Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExtraAttr")
    @Expose
    private KeyValuePairOption [] ExtraAttr;

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
     * Get Region of the source database. If AccessType is ccn, please fill in the region where vpc is located because the region of the source database is unknown. For other access methods, please fill in the region where the subscription task is located, as ensuring the subscription task and the source database are in the same region is the optimal network solution.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DatabaseRegion Region of the source database. If AccessType is ccn, please fill in the region where vpc is located because the region of the source database is unknown. For other access methods, please fill in the region where the subscription task is located, as ensuring the subscription task and the source database are in the same region is the optimal network solution.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDatabaseRegion() {
        return this.DatabaseRegion;
    }

    /**
     * Set Region of the source database. If AccessType is ccn, please fill in the region where vpc is located because the region of the source database is unknown. For other access methods, please fill in the region where the subscription task is located, as ensuring the subscription task and the source database are in the same region is the optimal network solution.Note: This field may return null, indicating that no valid values can be obtained.
     * @param DatabaseRegion Region of the source database. If AccessType is ccn, please fill in the region where vpc is located because the region of the source database is unknown. For other access methods, please fill in the region where the subscription task is located, as ensuring the subscription task and the source database are in the same region is the optimal network solution.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDatabaseRegion(String DatabaseRegion) {
        this.DatabaseRegion = DatabaseRegion;
    }

    /**
     * Get UsernameNote: This field may return null, indicating that no valid values can be obtained. 
     * @return User UsernameNote: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set UsernameNote: This field may return null, indicating that no valid values can be obtained.
     * @param User UsernameNote: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get Password. It is required when used as an input parameter and empty when used as an output parameter.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Password Password. It is required when used as an input parameter and empty when used as an output parameter.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set Password. It is required when used as an input parameter and empty when used as an output parameter.Note: This field may return null, indicating that no valid values can be obtained.
     * @param Password Password. It is required when used as an input parameter and empty when used as an output parameter.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get Target instance ID. This field is required when AccessType is cdb. When configuring the InstanceId, the instance information is queried and checked. The mysql query interface has been authenticated. Please ensure that the sub-user has the cdb:DescribeDBInstances interface permission.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceId Target instance ID. This field is required when AccessType is cdb. When configuring the InstanceId, the instance information is queried and checked. The mysql query interface has been authenticated. Please ensure that the sub-user has the cdb:DescribeDBInstances interface permission.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Target instance ID. This field is required when AccessType is cdb. When configuring the InstanceId, the instance information is queried and checked. The mysql query interface has been authenticated. Please ensure that the sub-user has the cdb:DescribeDBInstances interface permission.Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceId Target instance ID. This field is required when AccessType is cdb. When configuring the InstanceId, the instance information is queried and checked. The mysql query interface has been authenticated. Please ensure that the sub-user has the cdb:DescribeDBInstances interface permission.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Cloud Virtual Machine ID. This field is required when AccessType is cvm.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CvmInstanceId Cloud Virtual Machine ID. This field is required when AccessType is cvm.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCvmInstanceId() {
        return this.CvmInstanceId;
    }

    /**
     * Set Cloud Virtual Machine ID. This field is required when AccessType is cvm.Note: This field may return null, indicating that no valid values can be obtained.
     * @param CvmInstanceId Cloud Virtual Machine ID. This field is required when AccessType is cvm.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCvmInstanceId(String CvmInstanceId) {
        this.CvmInstanceId = CvmInstanceId;
    }

    /**
     * Get Direct Connect gateway ID. This field is required when AccessType is dcg.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UniqDcgId Direct Connect gateway ID. This field is required when AccessType is dcg.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUniqDcgId() {
        return this.UniqDcgId;
    }

    /**
     * Set Direct Connect gateway ID. This field is required when AccessType is dcg.Note: This field may return null, indicating that no valid values can be obtained.
     * @param UniqDcgId Direct Connect gateway ID. This field is required when AccessType is dcg.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUniqDcgId(String UniqDcgId) {
        this.UniqDcgId = UniqDcgId;
    }

    /**
     * Get Cloud Connect Network ID. This field is required when AccessType is ccn.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CcnId Cloud Connect Network ID. This field is required when AccessType is ccn.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCcnId() {
        return this.CcnId;
    }

    /**
     * Set Cloud Connect Network ID. This field is required when AccessType is ccn.Note: This field may return null, indicating that no valid values can be obtained.
     * @param CcnId Cloud Connect Network ID. This field is required when AccessType is ccn.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCcnId(String CcnId) {
        this.CcnId = CcnId;
    }

    /**
     * Get VPN gateway ID. This field is required when AccessType is vpncloud.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UniqVpnGwId VPN gateway ID. This field is required when AccessType is vpncloud.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUniqVpnGwId() {
        return this.UniqVpnGwId;
    }

    /**
     * Set VPN gateway ID. This field is required when AccessType is vpncloud.Note: This field may return null, indicating that no valid values can be obtained.
     * @param UniqVpnGwId VPN gateway ID. This field is required when AccessType is vpncloud.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUniqVpnGwId(String UniqVpnGwId) {
        this.UniqVpnGwId = UniqVpnGwId;
    }

    /**
     * Get VpcID. This field is required when AccessType is dcg\ccn\vpncloud\vpc.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VpcId VpcID. This field is required when AccessType is dcg\ccn\vpncloud\vpc.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VpcID. This field is required when AccessType is dcg\ccn\vpncloud\vpc.Note: This field may return null, indicating that no valid values can be obtained.
     * @param VpcId VpcID. This field is required when AccessType is dcg\ccn\vpncloud\vpc.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Subnet ID. This field is required when AccessType is dcg\ccn\vpncloud\vpc.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SubnetId Subnet ID. This field is required when AccessType is dcg\ccn\vpncloud\vpc.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet ID. This field is required when AccessType is dcg\ccn\vpncloud\vpc.Note: This field may return null, indicating that no valid values can be obtained.
     * @param SubnetId Subnet ID. This field is required when AccessType is dcg\ccn\vpncloud\vpc.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Database address, supports domain name and IP. This field is required when AccessType is dcg\ccn\vpncloud\vpc\extranet\intranet.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HostName Database address, supports domain name and IP. This field is required when AccessType is dcg\ccn\vpncloud\vpc\extranet\intranet.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set Database address, supports domain name and IP. This field is required when AccessType is dcg\ccn\vpncloud\vpc\extranet\intranet.Note: This field may return null, indicating that no valid values can be obtained.
     * @param HostName Database address, supports domain name and IP. This field is required when AccessType is dcg\ccn\vpncloud\vpc\extranet\intranet.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get Database port. This field is required when AccessType is dcg\ccn\vpncloud\vpc\extranet\intranet\cvm.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Port Database port. This field is required when AccessType is dcg\ccn\vpncloud\vpc\extranet\intranet\cvm.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Database port. This field is required when AccessType is dcg\ccn\vpncloud\vpc\extranet\intranet\cvm.Note: This field may return null, indicating that no valid values can be obtained.
     * @param Port Database port. This field is required when AccessType is dcg\ccn\vpncloud\vpc\extranet\intranet\cvm.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Whether to use encrypted transmission. Valid values: UnEncrypted; Encrypted. Only mysql supports it. If it is not filled in, it will not be encrypted by default. Other products do not need to fill in this.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EncryptConn Whether to use encrypted transmission. Valid values: UnEncrypted; Encrypted. Only mysql supports it. If it is not filled in, it will not be encrypted by default. Other products do not need to fill in this.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEncryptConn() {
        return this.EncryptConn;
    }

    /**
     * Set Whether to use encrypted transmission. Valid values: UnEncrypted; Encrypted. Only mysql supports it. If it is not filled in, it will not be encrypted by default. Other products do not need to fill in this.Note: This field may return null, indicating that no valid values can be obtained.
     * @param EncryptConn Whether to use encrypted transmission. Valid values: UnEncrypted; Encrypted. Only mysql supports it. If it is not filled in, it will not be encrypted by default. Other products do not need to fill in this.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEncryptConn(String EncryptConn) {
        this.EncryptConn = EncryptConn;
    }

    /**
     * Get Database network environment. This field is required when AccessType is ccn. Valid values: UserIDC; TencentVPC; Aws; AliYun; Others.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DatabaseNetEnv Database network environment. This field is required when AccessType is ccn. Valid values: UserIDC; TencentVPC; Aws; AliYun; Others.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDatabaseNetEnv() {
        return this.DatabaseNetEnv;
    }

    /**
     * Set Database network environment. This field is required when AccessType is ccn. Valid values: UserIDC; TencentVPC; Aws; AliYun; Others.Note: This field may return null, indicating that no valid values can be obtained.
     * @param DatabaseNetEnv Database network environment. This field is required when AccessType is ccn. Valid values: UserIDC; TencentVPC; Aws; AliYun; Others.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDatabaseNetEnv(String DatabaseNetEnv) {
        this.DatabaseNetEnv = DatabaseNetEnv;
    }

    /**
     * Get The UIN of the main account to which the Cloud Connect Network gateway belongs. It is required for cross-account CCN.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CcnOwnerUin The UIN of the main account to which the Cloud Connect Network gateway belongs. It is required for cross-account CCN.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCcnOwnerUin() {
        return this.CcnOwnerUin;
    }

    /**
     * Set The UIN of the main account to which the Cloud Connect Network gateway belongs. It is required for cross-account CCN.Note: This field may return null, indicating that no valid values can be obtained.
     * @param CcnOwnerUin The UIN of the main account to which the Cloud Connect Network gateway belongs. It is required for cross-account CCN.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCcnOwnerUin(String CcnOwnerUin) {
        this.CcnOwnerUin = CcnOwnerUin;
    }

    /**
     * Get Additional information added for the business. Parameter name is called key, parameter value is called value. Mandatory parameters for tdpg: PgDatabase (subscribed database name).Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExtraAttr Additional information added for the business. Parameter name is called key, parameter value is called value. Mandatory parameters for tdpg: PgDatabase (subscribed database name).Note: This field may return null, indicating that no valid values can be obtained.
     */
    public KeyValuePairOption [] getExtraAttr() {
        return this.ExtraAttr;
    }

    /**
     * Set Additional information added for the business. Parameter name is called key, parameter value is called value. Mandatory parameters for tdpg: PgDatabase (subscribed database name).Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExtraAttr Additional information added for the business. Parameter name is called key, parameter value is called value. Mandatory parameters for tdpg: PgDatabase (subscribed database name).Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExtraAttr(KeyValuePairOption [] ExtraAttr) {
        this.ExtraAttr = ExtraAttr;
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

    public EndpointItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EndpointItem(EndpointItem source) {
        if (source.DatabaseRegion != null) {
            this.DatabaseRegion = new String(source.DatabaseRegion);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.CvmInstanceId != null) {
            this.CvmInstanceId = new String(source.CvmInstanceId);
        }
        if (source.UniqDcgId != null) {
            this.UniqDcgId = new String(source.UniqDcgId);
        }
        if (source.CcnId != null) {
            this.CcnId = new String(source.CcnId);
        }
        if (source.UniqVpnGwId != null) {
            this.UniqVpnGwId = new String(source.UniqVpnGwId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
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
        if (source.ExtraAttr != null) {
            this.ExtraAttr = new KeyValuePairOption[source.ExtraAttr.length];
            for (int i = 0; i < source.ExtraAttr.length; i++) {
                this.ExtraAttr[i] = new KeyValuePairOption(source.ExtraAttr[i]);
            }
        }
        if (source.ChildInstanceId != null) {
            this.ChildInstanceId = new String(source.ChildInstanceId);
        }
        if (source.ChildInstanceType != null) {
            this.ChildInstanceType = new String(source.ChildInstanceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DatabaseRegion", this.DatabaseRegion);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "CvmInstanceId", this.CvmInstanceId);
        this.setParamSimple(map, prefix + "UniqDcgId", this.UniqDcgId);
        this.setParamSimple(map, prefix + "CcnId", this.CcnId);
        this.setParamSimple(map, prefix + "UniqVpnGwId", this.UniqVpnGwId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "EncryptConn", this.EncryptConn);
        this.setParamSimple(map, prefix + "DatabaseNetEnv", this.DatabaseNetEnv);
        this.setParamSimple(map, prefix + "CcnOwnerUin", this.CcnOwnerUin);
        this.setParamArrayObj(map, prefix + "ExtraAttr.", this.ExtraAttr);
        this.setParamSimple(map, prefix + "ChildInstanceId", this.ChildInstanceId);
        this.setParamSimple(map, prefix + "ChildInstanceType", this.ChildInstanceType);

    }
}

