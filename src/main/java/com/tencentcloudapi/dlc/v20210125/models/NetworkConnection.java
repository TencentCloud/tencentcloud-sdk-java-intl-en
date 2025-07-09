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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NetworkConnection extends AbstractModel {

    /**
    * Network configuration ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Unique identifier of network configuration
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AssociateId")
    @Expose
    private String AssociateId;

    /**
    * Computing engine ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HouseId")
    @Expose
    private String HouseId;

    /**
    * Data source ID (discarded)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DatasourceConnectionId")
    @Expose
    private String DatasourceConnectionId;

    /**
    * Network configuration status (0 - initializing; 1 - normal)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
    * Creation time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * Modification time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * Create user Appid.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Appid")
    @Expose
    private Long Appid;

    /**
    * Computing engine name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HouseName")
    @Expose
    private String HouseName;

    /**
    * Network configuration name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DatasourceConnectionName")
    @Expose
    private String DatasourceConnectionName;

    /**
    * Network configuration type
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NetworkConnectionType")
    @Expose
    private Long NetworkConnectionType;

    /**
    * Create user UIN.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * Create user SubAccountUin.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubAccountUin")
    @Expose
    private String SubAccountUin;

    /**
    * Network configuration description
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NetworkConnectionDesc")
    @Expose
    private String NetworkConnectionDesc;

    /**
    * Data source vpcid
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DatasourceConnectionVpcId")
    @Expose
    private String DatasourceConnectionVpcId;

    /**
    * Data source SubnetId
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DatasourceConnectionSubnetId")
    @Expose
    private String DatasourceConnectionSubnetId;

    /**
    * Data source SubnetId
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DatasourceConnectionCidrBlock")
    @Expose
    private String DatasourceConnectionCidrBlock;

    /**
    * Data source SubnetCidrBlock
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DatasourceConnectionSubnetCidrBlock")
    @Expose
    private String DatasourceConnectionSubnetCidrBlock;

    /**
     * Get Network configuration ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Id Network configuration ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Network configuration ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Id Network configuration ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Unique identifier of network configuration
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AssociateId Unique identifier of network configuration
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAssociateId() {
        return this.AssociateId;
    }

    /**
     * Set Unique identifier of network configuration
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AssociateId Unique identifier of network configuration
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAssociateId(String AssociateId) {
        this.AssociateId = AssociateId;
    }

    /**
     * Get Computing engine ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HouseId Computing engine ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getHouseId() {
        return this.HouseId;
    }

    /**
     * Set Computing engine ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HouseId Computing engine ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHouseId(String HouseId) {
        this.HouseId = HouseId;
    }

    /**
     * Get Data source ID (discarded)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DatasourceConnectionId Data source ID (discarded)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDatasourceConnectionId() {
        return this.DatasourceConnectionId;
    }

    /**
     * Set Data source ID (discarded)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DatasourceConnectionId Data source ID (discarded)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDatasourceConnectionId(String DatasourceConnectionId) {
        this.DatasourceConnectionId = DatasourceConnectionId;
    }

    /**
     * Get Network configuration status (0 - initializing; 1 - normal)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return State Network configuration status (0 - initializing; 1 - normal)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set Network configuration status (0 - initializing; 1 - normal)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param State Network configuration status (0 - initializing; 1 - normal)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setState(Long State) {
        this.State = State;
    }

    /**
     * Get Creation time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime Creation time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateTime Creation time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Modification time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UpdateTime Modification time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Modification time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UpdateTime Modification time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Create user Appid.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Appid Create user Appid.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAppid() {
        return this.Appid;
    }

    /**
     * Set Create user Appid.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Appid Create user Appid.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAppid(Long Appid) {
        this.Appid = Appid;
    }

    /**
     * Get Computing engine name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HouseName Computing engine name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getHouseName() {
        return this.HouseName;
    }

    /**
     * Set Computing engine name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HouseName Computing engine name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHouseName(String HouseName) {
        this.HouseName = HouseName;
    }

    /**
     * Get Network configuration name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DatasourceConnectionName Network configuration name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDatasourceConnectionName() {
        return this.DatasourceConnectionName;
    }

    /**
     * Set Network configuration name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DatasourceConnectionName Network configuration name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDatasourceConnectionName(String DatasourceConnectionName) {
        this.DatasourceConnectionName = DatasourceConnectionName;
    }

    /**
     * Get Network configuration type
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NetworkConnectionType Network configuration type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getNetworkConnectionType() {
        return this.NetworkConnectionType;
    }

    /**
     * Set Network configuration type
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NetworkConnectionType Network configuration type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNetworkConnectionType(Long NetworkConnectionType) {
        this.NetworkConnectionType = NetworkConnectionType;
    }

    /**
     * Get Create user UIN.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Uin Create user UIN.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set Create user UIN.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Uin Create user UIN.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get Create user SubAccountUin.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SubAccountUin Create user SubAccountUin.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSubAccountUin() {
        return this.SubAccountUin;
    }

    /**
     * Set Create user SubAccountUin.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SubAccountUin Create user SubAccountUin.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSubAccountUin(String SubAccountUin) {
        this.SubAccountUin = SubAccountUin;
    }

    /**
     * Get Network configuration description
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NetworkConnectionDesc Network configuration description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getNetworkConnectionDesc() {
        return this.NetworkConnectionDesc;
    }

    /**
     * Set Network configuration description
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NetworkConnectionDesc Network configuration description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNetworkConnectionDesc(String NetworkConnectionDesc) {
        this.NetworkConnectionDesc = NetworkConnectionDesc;
    }

    /**
     * Get Data source vpcid
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DatasourceConnectionVpcId Data source vpcid
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDatasourceConnectionVpcId() {
        return this.DatasourceConnectionVpcId;
    }

    /**
     * Set Data source vpcid
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DatasourceConnectionVpcId Data source vpcid
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDatasourceConnectionVpcId(String DatasourceConnectionVpcId) {
        this.DatasourceConnectionVpcId = DatasourceConnectionVpcId;
    }

    /**
     * Get Data source SubnetId
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DatasourceConnectionSubnetId Data source SubnetId
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDatasourceConnectionSubnetId() {
        return this.DatasourceConnectionSubnetId;
    }

    /**
     * Set Data source SubnetId
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DatasourceConnectionSubnetId Data source SubnetId
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDatasourceConnectionSubnetId(String DatasourceConnectionSubnetId) {
        this.DatasourceConnectionSubnetId = DatasourceConnectionSubnetId;
    }

    /**
     * Get Data source SubnetId
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DatasourceConnectionCidrBlock Data source SubnetId
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDatasourceConnectionCidrBlock() {
        return this.DatasourceConnectionCidrBlock;
    }

    /**
     * Set Data source SubnetId
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DatasourceConnectionCidrBlock Data source SubnetId
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDatasourceConnectionCidrBlock(String DatasourceConnectionCidrBlock) {
        this.DatasourceConnectionCidrBlock = DatasourceConnectionCidrBlock;
    }

    /**
     * Get Data source SubnetCidrBlock
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DatasourceConnectionSubnetCidrBlock Data source SubnetCidrBlock
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDatasourceConnectionSubnetCidrBlock() {
        return this.DatasourceConnectionSubnetCidrBlock;
    }

    /**
     * Set Data source SubnetCidrBlock
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DatasourceConnectionSubnetCidrBlock Data source SubnetCidrBlock
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDatasourceConnectionSubnetCidrBlock(String DatasourceConnectionSubnetCidrBlock) {
        this.DatasourceConnectionSubnetCidrBlock = DatasourceConnectionSubnetCidrBlock;
    }

    public NetworkConnection() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NetworkConnection(NetworkConnection source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.AssociateId != null) {
            this.AssociateId = new String(source.AssociateId);
        }
        if (source.HouseId != null) {
            this.HouseId = new String(source.HouseId);
        }
        if (source.DatasourceConnectionId != null) {
            this.DatasourceConnectionId = new String(source.DatasourceConnectionId);
        }
        if (source.State != null) {
            this.State = new Long(source.State);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.Appid != null) {
            this.Appid = new Long(source.Appid);
        }
        if (source.HouseName != null) {
            this.HouseName = new String(source.HouseName);
        }
        if (source.DatasourceConnectionName != null) {
            this.DatasourceConnectionName = new String(source.DatasourceConnectionName);
        }
        if (source.NetworkConnectionType != null) {
            this.NetworkConnectionType = new Long(source.NetworkConnectionType);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.SubAccountUin != null) {
            this.SubAccountUin = new String(source.SubAccountUin);
        }
        if (source.NetworkConnectionDesc != null) {
            this.NetworkConnectionDesc = new String(source.NetworkConnectionDesc);
        }
        if (source.DatasourceConnectionVpcId != null) {
            this.DatasourceConnectionVpcId = new String(source.DatasourceConnectionVpcId);
        }
        if (source.DatasourceConnectionSubnetId != null) {
            this.DatasourceConnectionSubnetId = new String(source.DatasourceConnectionSubnetId);
        }
        if (source.DatasourceConnectionCidrBlock != null) {
            this.DatasourceConnectionCidrBlock = new String(source.DatasourceConnectionCidrBlock);
        }
        if (source.DatasourceConnectionSubnetCidrBlock != null) {
            this.DatasourceConnectionSubnetCidrBlock = new String(source.DatasourceConnectionSubnetCidrBlock);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "AssociateId", this.AssociateId);
        this.setParamSimple(map, prefix + "HouseId", this.HouseId);
        this.setParamSimple(map, prefix + "DatasourceConnectionId", this.DatasourceConnectionId);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Appid", this.Appid);
        this.setParamSimple(map, prefix + "HouseName", this.HouseName);
        this.setParamSimple(map, prefix + "DatasourceConnectionName", this.DatasourceConnectionName);
        this.setParamSimple(map, prefix + "NetworkConnectionType", this.NetworkConnectionType);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "SubAccountUin", this.SubAccountUin);
        this.setParamSimple(map, prefix + "NetworkConnectionDesc", this.NetworkConnectionDesc);
        this.setParamSimple(map, prefix + "DatasourceConnectionVpcId", this.DatasourceConnectionVpcId);
        this.setParamSimple(map, prefix + "DatasourceConnectionSubnetId", this.DatasourceConnectionSubnetId);
        this.setParamSimple(map, prefix + "DatasourceConnectionCidrBlock", this.DatasourceConnectionCidrBlock);
        this.setParamSimple(map, prefix + "DatasourceConnectionSubnetCidrBlock", this.DatasourceConnectionSubnetCidrBlock);

    }
}

