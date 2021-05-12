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
package com.tencentcloudapi.dts.v20180330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SrcInfo extends AbstractModel{

    /**
    * Alibaba Cloud AccessKey, which is applicable if the source database is an Alibaba Cloud ApsaraDB for RDS 5.6 instance
    */
    @SerializedName("AccessKey")
    @Expose
    private String AccessKey;

    /**
    * Instance IP address
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * Instance port
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Instance username
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * Instance password
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * Alibaba Cloud ApsaraDB for RDS instance ID, which is applicable if the source database is an Alibaba Cloud ApsaraDB for RDS 5.6/5.7 instance
    */
    @SerializedName("RdsInstanceId")
    @Expose
    private String RdsInstanceId;

    /**
    * Short CVM instance ID in the format of `ins-olgl39y8`. It is the same as the instance ID displayed on the CVM Console page. For CVM-based self-created instances, this field needs to be passed in
    */
    @SerializedName("CvmInstanceId")
    @Expose
    private String CvmInstanceId;

    /**
    * Direct Connect gateway ID in the format of dcg-0rxtqqxb
    */
    @SerializedName("UniqDcgId")
    @Expose
    private String UniqDcgId;

    /**
    * VPC ID in the format of vpc-92jblxto
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * VPC Subnet ID in the format of subnet-3paxmkdz
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * VPN gateway ID in the format of vpngw-9ghexg7q
    */
    @SerializedName("UniqVpnGwId")
    @Expose
    private String UniqVpnGwId;

    /**
    * Database instance ID in the format of cdb-powiqx8q
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Region name, such as ap-guangzhou
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * For Alibaba Cloud ApsaraDB for RDS instances, enter "aliyun"; otherwise, enter "others"
    */
    @SerializedName("Supplier")
    @Expose
    private String Supplier;

    /**
    * CCN instance ID, such as ccn-afp6kltc
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CcnId")
    @Expose
    private String CcnId;

    /**
    * Database version. This parameter is valid only when the instance is an RDS instance. Value: 5.6 or 5.7. Default value: 5.6
    */
    @SerializedName("EngineVersion")
    @Expose
    private String EngineVersion;

    /**
     * Get Alibaba Cloud AccessKey, which is applicable if the source database is an Alibaba Cloud ApsaraDB for RDS 5.6 instance 
     * @return AccessKey Alibaba Cloud AccessKey, which is applicable if the source database is an Alibaba Cloud ApsaraDB for RDS 5.6 instance
     */
    public String getAccessKey() {
        return this.AccessKey;
    }

    /**
     * Set Alibaba Cloud AccessKey, which is applicable if the source database is an Alibaba Cloud ApsaraDB for RDS 5.6 instance
     * @param AccessKey Alibaba Cloud AccessKey, which is applicable if the source database is an Alibaba Cloud ApsaraDB for RDS 5.6 instance
     */
    public void setAccessKey(String AccessKey) {
        this.AccessKey = AccessKey;
    }

    /**
     * Get Instance IP address 
     * @return Ip Instance IP address
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set Instance IP address
     * @param Ip Instance IP address
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get Instance port 
     * @return Port Instance port
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Instance port
     * @param Port Instance port
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Instance username 
     * @return User Instance username
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set Instance username
     * @param User Instance username
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get Instance password 
     * @return Password Instance password
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set Instance password
     * @param Password Instance password
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get Alibaba Cloud ApsaraDB for RDS instance ID, which is applicable if the source database is an Alibaba Cloud ApsaraDB for RDS 5.6/5.7 instance 
     * @return RdsInstanceId Alibaba Cloud ApsaraDB for RDS instance ID, which is applicable if the source database is an Alibaba Cloud ApsaraDB for RDS 5.6/5.7 instance
     */
    public String getRdsInstanceId() {
        return this.RdsInstanceId;
    }

    /**
     * Set Alibaba Cloud ApsaraDB for RDS instance ID, which is applicable if the source database is an Alibaba Cloud ApsaraDB for RDS 5.6/5.7 instance
     * @param RdsInstanceId Alibaba Cloud ApsaraDB for RDS instance ID, which is applicable if the source database is an Alibaba Cloud ApsaraDB for RDS 5.6/5.7 instance
     */
    public void setRdsInstanceId(String RdsInstanceId) {
        this.RdsInstanceId = RdsInstanceId;
    }

    /**
     * Get Short CVM instance ID in the format of `ins-olgl39y8`. It is the same as the instance ID displayed on the CVM Console page. For CVM-based self-created instances, this field needs to be passed in 
     * @return CvmInstanceId Short CVM instance ID in the format of `ins-olgl39y8`. It is the same as the instance ID displayed on the CVM Console page. For CVM-based self-created instances, this field needs to be passed in
     */
    public String getCvmInstanceId() {
        return this.CvmInstanceId;
    }

    /**
     * Set Short CVM instance ID in the format of `ins-olgl39y8`. It is the same as the instance ID displayed on the CVM Console page. For CVM-based self-created instances, this field needs to be passed in
     * @param CvmInstanceId Short CVM instance ID in the format of `ins-olgl39y8`. It is the same as the instance ID displayed on the CVM Console page. For CVM-based self-created instances, this field needs to be passed in
     */
    public void setCvmInstanceId(String CvmInstanceId) {
        this.CvmInstanceId = CvmInstanceId;
    }

    /**
     * Get Direct Connect gateway ID in the format of dcg-0rxtqqxb 
     * @return UniqDcgId Direct Connect gateway ID in the format of dcg-0rxtqqxb
     */
    public String getUniqDcgId() {
        return this.UniqDcgId;
    }

    /**
     * Set Direct Connect gateway ID in the format of dcg-0rxtqqxb
     * @param UniqDcgId Direct Connect gateway ID in the format of dcg-0rxtqqxb
     */
    public void setUniqDcgId(String UniqDcgId) {
        this.UniqDcgId = UniqDcgId;
    }

    /**
     * Get VPC ID in the format of vpc-92jblxto 
     * @return VpcId VPC ID in the format of vpc-92jblxto
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID in the format of vpc-92jblxto
     * @param VpcId VPC ID in the format of vpc-92jblxto
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get VPC Subnet ID in the format of subnet-3paxmkdz 
     * @return SubnetId VPC Subnet ID in the format of subnet-3paxmkdz
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set VPC Subnet ID in the format of subnet-3paxmkdz
     * @param SubnetId VPC Subnet ID in the format of subnet-3paxmkdz
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get VPN gateway ID in the format of vpngw-9ghexg7q 
     * @return UniqVpnGwId VPN gateway ID in the format of vpngw-9ghexg7q
     */
    public String getUniqVpnGwId() {
        return this.UniqVpnGwId;
    }

    /**
     * Set VPN gateway ID in the format of vpngw-9ghexg7q
     * @param UniqVpnGwId VPN gateway ID in the format of vpngw-9ghexg7q
     */
    public void setUniqVpnGwId(String UniqVpnGwId) {
        this.UniqVpnGwId = UniqVpnGwId;
    }

    /**
     * Get Database instance ID in the format of cdb-powiqx8q 
     * @return InstanceId Database instance ID in the format of cdb-powiqx8q
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Database instance ID in the format of cdb-powiqx8q
     * @param InstanceId Database instance ID in the format of cdb-powiqx8q
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Region name, such as ap-guangzhou 
     * @return Region Region name, such as ap-guangzhou
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region name, such as ap-guangzhou
     * @param Region Region name, such as ap-guangzhou
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get For Alibaba Cloud ApsaraDB for RDS instances, enter "aliyun"; otherwise, enter "others" 
     * @return Supplier For Alibaba Cloud ApsaraDB for RDS instances, enter "aliyun"; otherwise, enter "others"
     */
    public String getSupplier() {
        return this.Supplier;
    }

    /**
     * Set For Alibaba Cloud ApsaraDB for RDS instances, enter "aliyun"; otherwise, enter "others"
     * @param Supplier For Alibaba Cloud ApsaraDB for RDS instances, enter "aliyun"; otherwise, enter "others"
     */
    public void setSupplier(String Supplier) {
        this.Supplier = Supplier;
    }

    /**
     * Get CCN instance ID, such as ccn-afp6kltc
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CcnId CCN instance ID, such as ccn-afp6kltc
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCcnId() {
        return this.CcnId;
    }

    /**
     * Set CCN instance ID, such as ccn-afp6kltc
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CcnId CCN instance ID, such as ccn-afp6kltc
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCcnId(String CcnId) {
        this.CcnId = CcnId;
    }

    /**
     * Get Database version. This parameter is valid only when the instance is an RDS instance. Value: 5.6 or 5.7. Default value: 5.6 
     * @return EngineVersion Database version. This parameter is valid only when the instance is an RDS instance. Value: 5.6 or 5.7. Default value: 5.6
     */
    public String getEngineVersion() {
        return this.EngineVersion;
    }

    /**
     * Set Database version. This parameter is valid only when the instance is an RDS instance. Value: 5.6 or 5.7. Default value: 5.6
     * @param EngineVersion Database version. This parameter is valid only when the instance is an RDS instance. Value: 5.6 or 5.7. Default value: 5.6
     */
    public void setEngineVersion(String EngineVersion) {
        this.EngineVersion = EngineVersion;
    }

    public SrcInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SrcInfo(SrcInfo source) {
        if (source.AccessKey != null) {
            this.AccessKey = new String(source.AccessKey);
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
        if (source.RdsInstanceId != null) {
            this.RdsInstanceId = new String(source.RdsInstanceId);
        }
        if (source.CvmInstanceId != null) {
            this.CvmInstanceId = new String(source.CvmInstanceId);
        }
        if (source.UniqDcgId != null) {
            this.UniqDcgId = new String(source.UniqDcgId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.UniqVpnGwId != null) {
            this.UniqVpnGwId = new String(source.UniqVpnGwId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Supplier != null) {
            this.Supplier = new String(source.Supplier);
        }
        if (source.CcnId != null) {
            this.CcnId = new String(source.CcnId);
        }
        if (source.EngineVersion != null) {
            this.EngineVersion = new String(source.EngineVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccessKey", this.AccessKey);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "RdsInstanceId", this.RdsInstanceId);
        this.setParamSimple(map, prefix + "CvmInstanceId", this.CvmInstanceId);
        this.setParamSimple(map, prefix + "UniqDcgId", this.UniqDcgId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "UniqVpnGwId", this.UniqVpnGwId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Supplier", this.Supplier);
        this.setParamSimple(map, prefix + "CcnId", this.CcnId);
        this.setParamSimple(map, prefix + "EngineVersion", this.EngineVersion);

    }
}

