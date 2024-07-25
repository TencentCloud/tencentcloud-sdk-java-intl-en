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
package com.tencentcloudapi.omics.v20221128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceIds extends AbstractModel {

    /**
    * VPC ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VPCId")
    @Expose
    private String VPCId;

    /**
    * Subnet ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Security group ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SecurityGroupId")
    @Expose
    private String SecurityGroupId;

    /**
    * TDSQL-C for MySQL database ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TDSQLCId")
    @Expose
    private String TDSQLCId;

    /**
    *  CFS ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CFSId")
    @Expose
    private String CFSId;

    /**
    * CFS type. Valid values:
- SD: standard
- HP: high-performance
- TB: standard Turbo
- TP: high-performance Turbo
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CFSStorageType")
    @Expose
    private String CFSStorageType;

    /**
    *  Cloud Virtual Machine ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CVMId")
    @Expose
    private String CVMId;

    /**
    * Elastic container cluster ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EKSId")
    @Expose
    private String EKSId;

    /**
     * Get VPC ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VPCId VPC ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVPCId() {
        return this.VPCId;
    }

    /**
     * Set VPC ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VPCId VPC ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVPCId(String VPCId) {
        this.VPCId = VPCId;
    }

    /**
     * Get Subnet ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SubnetId Subnet ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SubnetId Subnet ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Security group ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SecurityGroupId Security group ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSecurityGroupId() {
        return this.SecurityGroupId;
    }

    /**
     * Set Security group ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SecurityGroupId Security group ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSecurityGroupId(String SecurityGroupId) {
        this.SecurityGroupId = SecurityGroupId;
    }

    /**
     * Get TDSQL-C for MySQL database ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TDSQLCId TDSQL-C for MySQL database ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTDSQLCId() {
        return this.TDSQLCId;
    }

    /**
     * Set TDSQL-C for MySQL database ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TDSQLCId TDSQL-C for MySQL database ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTDSQLCId(String TDSQLCId) {
        this.TDSQLCId = TDSQLCId;
    }

    /**
     * Get  CFS ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CFSId  CFS ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCFSId() {
        return this.CFSId;
    }

    /**
     * Set  CFS ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CFSId  CFS ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCFSId(String CFSId) {
        this.CFSId = CFSId;
    }

    /**
     * Get CFS type. Valid values:
- SD: standard
- HP: high-performance
- TB: standard Turbo
- TP: high-performance Turbo
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CFSStorageType CFS type. Valid values:
- SD: standard
- HP: high-performance
- TB: standard Turbo
- TP: high-performance Turbo
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCFSStorageType() {
        return this.CFSStorageType;
    }

    /**
     * Set CFS type. Valid values:
- SD: standard
- HP: high-performance
- TB: standard Turbo
- TP: high-performance Turbo
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CFSStorageType CFS type. Valid values:
- SD: standard
- HP: high-performance
- TB: standard Turbo
- TP: high-performance Turbo
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCFSStorageType(String CFSStorageType) {
        this.CFSStorageType = CFSStorageType;
    }

    /**
     * Get  Cloud Virtual Machine ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CVMId  Cloud Virtual Machine ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCVMId() {
        return this.CVMId;
    }

    /**
     * Set  Cloud Virtual Machine ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CVMId  Cloud Virtual Machine ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCVMId(String CVMId) {
        this.CVMId = CVMId;
    }

    /**
     * Get Elastic container cluster ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EKSId Elastic container cluster ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEKSId() {
        return this.EKSId;
    }

    /**
     * Set Elastic container cluster ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EKSId Elastic container cluster ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEKSId(String EKSId) {
        this.EKSId = EKSId;
    }

    public ResourceIds() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceIds(ResourceIds source) {
        if (source.VPCId != null) {
            this.VPCId = new String(source.VPCId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.SecurityGroupId != null) {
            this.SecurityGroupId = new String(source.SecurityGroupId);
        }
        if (source.TDSQLCId != null) {
            this.TDSQLCId = new String(source.TDSQLCId);
        }
        if (source.CFSId != null) {
            this.CFSId = new String(source.CFSId);
        }
        if (source.CFSStorageType != null) {
            this.CFSStorageType = new String(source.CFSStorageType);
        }
        if (source.CVMId != null) {
            this.CVMId = new String(source.CVMId);
        }
        if (source.EKSId != null) {
            this.EKSId = new String(source.EKSId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VPCId", this.VPCId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "SecurityGroupId", this.SecurityGroupId);
        this.setParamSimple(map, prefix + "TDSQLCId", this.TDSQLCId);
        this.setParamSimple(map, prefix + "CFSId", this.CFSId);
        this.setParamSimple(map, prefix + "CFSStorageType", this.CFSStorageType);
        this.setParamSimple(map, prefix + "CVMId", this.CVMId);
        this.setParamSimple(map, prefix + "EKSId", this.EKSId);

    }
}

