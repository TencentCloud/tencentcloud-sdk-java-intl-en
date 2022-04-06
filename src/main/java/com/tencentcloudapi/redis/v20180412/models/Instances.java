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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Instances extends AbstractModel{

    /**
    * User App ID
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Instance name
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Region ID. 1: Guangzhou; 4: Shanghai; 5: Hong Kong (China); 6: Toronto; 7: Shanghai Finance; 8: Beijing; 9: Singapore; 11: Shenzhen Finance; 15: West US (Silicon Valley)
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * Region ID
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * Number of replicas
    */
    @SerializedName("RedisReplicasNum")
    @Expose
    private Long RedisReplicasNum;

    /**
    * Number of shards
    */
    @SerializedName("RedisShardNum")
    @Expose
    private Long RedisShardNum;

    /**
    * Shard size
    */
    @SerializedName("RedisShardSize")
    @Expose
    private Long RedisShardSize;

    /**
    * Instance disk size
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * Engine: Redis community edition, Tencent Cloud CKV
    */
    @SerializedName("Engine")
    @Expose
    private String Engine;

    /**
    * Instance role. Valid values: `rw` (read-write), `r`( read-only)
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * Instance VIP
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * Internal parameter, which can be ignored.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Vip6")
    @Expose
    private String Vip6;

    /**
    * VPC ID, such as 75101
    */
    @SerializedName("VpcID")
    @Expose
    private Long VpcID;

    /**
    * Instance Port
    */
    @SerializedName("VPort")
    @Expose
    private Long VPort;

    /**
    * Instance status. 0: to be initialized; 1: in process; 2: running; -2: isolated; -3: to be deleted
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Repository ID
    */
    @SerializedName("GrocerySysId")
    @Expose
    private Long GrocerySysId;

    /**
    * Instance type. Valid values: `1` (Redis 2.8 memory edition in cluster architecture), `2` (Redis 2.8 memory edition in standard architecture), `3` (CKV 3.2 memory edition in standard architecture), `4` (CKV 3.2 memory edition in cluster architecture), `5` (Redis 2.8 memory edition in standalone architecture), `6` (Redis 4.0 memory edition in standard architecture), `7` (Redis 4.0 memory edition in cluster architecture), `8` (Redis 5.0 memory edition in standard architecture), `9` (Redis 5.0 memory edition in cluster architecture)
    */
    @SerializedName("ProductType")
    @Expose
    private Long ProductType;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Update time
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get User App ID 
     * @return AppId User App ID
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set User App ID
     * @param AppId User App ID
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Instance name 
     * @return InstanceName Instance name
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name
     * @param InstanceName Instance name
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Region ID. 1: Guangzhou; 4: Shanghai; 5: Hong Kong (China); 6: Toronto; 7: Shanghai Finance; 8: Beijing; 9: Singapore; 11: Shenzhen Finance; 15: West US (Silicon Valley) 
     * @return RegionId Region ID. 1: Guangzhou; 4: Shanghai; 5: Hong Kong (China); 6: Toronto; 7: Shanghai Finance; 8: Beijing; 9: Singapore; 11: Shenzhen Finance; 15: West US (Silicon Valley)
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set Region ID. 1: Guangzhou; 4: Shanghai; 5: Hong Kong (China); 6: Toronto; 7: Shanghai Finance; 8: Beijing; 9: Singapore; 11: Shenzhen Finance; 15: West US (Silicon Valley)
     * @param RegionId Region ID. 1: Guangzhou; 4: Shanghai; 5: Hong Kong (China); 6: Toronto; 7: Shanghai Finance; 8: Beijing; 9: Singapore; 11: Shenzhen Finance; 15: West US (Silicon Valley)
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get Region ID 
     * @return ZoneId Region ID
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Region ID
     * @param ZoneId Region ID
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Number of replicas 
     * @return RedisReplicasNum Number of replicas
     */
    public Long getRedisReplicasNum() {
        return this.RedisReplicasNum;
    }

    /**
     * Set Number of replicas
     * @param RedisReplicasNum Number of replicas
     */
    public void setRedisReplicasNum(Long RedisReplicasNum) {
        this.RedisReplicasNum = RedisReplicasNum;
    }

    /**
     * Get Number of shards 
     * @return RedisShardNum Number of shards
     */
    public Long getRedisShardNum() {
        return this.RedisShardNum;
    }

    /**
     * Set Number of shards
     * @param RedisShardNum Number of shards
     */
    public void setRedisShardNum(Long RedisShardNum) {
        this.RedisShardNum = RedisShardNum;
    }

    /**
     * Get Shard size 
     * @return RedisShardSize Shard size
     */
    public Long getRedisShardSize() {
        return this.RedisShardSize;
    }

    /**
     * Set Shard size
     * @param RedisShardSize Shard size
     */
    public void setRedisShardSize(Long RedisShardSize) {
        this.RedisShardSize = RedisShardSize;
    }

    /**
     * Get Instance disk size
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return DiskSize Instance disk size
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set Instance disk size
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param DiskSize Instance disk size
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get Engine: Redis community edition, Tencent Cloud CKV 
     * @return Engine Engine: Redis community edition, Tencent Cloud CKV
     */
    public String getEngine() {
        return this.Engine;
    }

    /**
     * Set Engine: Redis community edition, Tencent Cloud CKV
     * @param Engine Engine: Redis community edition, Tencent Cloud CKV
     */
    public void setEngine(String Engine) {
        this.Engine = Engine;
    }

    /**
     * Get Instance role. Valid values: `rw` (read-write), `r`( read-only) 
     * @return Role Instance role. Valid values: `rw` (read-write), `r`( read-only)
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set Instance role. Valid values: `rw` (read-write), `r`( read-only)
     * @param Role Instance role. Valid values: `rw` (read-write), `r`( read-only)
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Get Instance VIP 
     * @return Vip Instance VIP
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set Instance VIP
     * @param Vip Instance VIP
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get Internal parameter, which can be ignored.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return Vip6 Internal parameter, which can be ignored.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getVip6() {
        return this.Vip6;
    }

    /**
     * Set Internal parameter, which can be ignored.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param Vip6 Internal parameter, which can be ignored.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setVip6(String Vip6) {
        this.Vip6 = Vip6;
    }

    /**
     * Get VPC ID, such as 75101 
     * @return VpcID VPC ID, such as 75101
     */
    public Long getVpcID() {
        return this.VpcID;
    }

    /**
     * Set VPC ID, such as 75101
     * @param VpcID VPC ID, such as 75101
     */
    public void setVpcID(Long VpcID) {
        this.VpcID = VpcID;
    }

    /**
     * Get Instance Port 
     * @return VPort Instance Port
     */
    public Long getVPort() {
        return this.VPort;
    }

    /**
     * Set Instance Port
     * @param VPort Instance Port
     */
    public void setVPort(Long VPort) {
        this.VPort = VPort;
    }

    /**
     * Get Instance status. 0: to be initialized; 1: in process; 2: running; -2: isolated; -3: to be deleted 
     * @return Status Instance status. 0: to be initialized; 1: in process; 2: running; -2: isolated; -3: to be deleted
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Instance status. 0: to be initialized; 1: in process; 2: running; -2: isolated; -3: to be deleted
     * @param Status Instance status. 0: to be initialized; 1: in process; 2: running; -2: isolated; -3: to be deleted
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Repository ID 
     * @return GrocerySysId Repository ID
     */
    public Long getGrocerySysId() {
        return this.GrocerySysId;
    }

    /**
     * Set Repository ID
     * @param GrocerySysId Repository ID
     */
    public void setGrocerySysId(Long GrocerySysId) {
        this.GrocerySysId = GrocerySysId;
    }

    /**
     * Get Instance type. Valid values: `1` (Redis 2.8 memory edition in cluster architecture), `2` (Redis 2.8 memory edition in standard architecture), `3` (CKV 3.2 memory edition in standard architecture), `4` (CKV 3.2 memory edition in cluster architecture), `5` (Redis 2.8 memory edition in standalone architecture), `6` (Redis 4.0 memory edition in standard architecture), `7` (Redis 4.0 memory edition in cluster architecture), `8` (Redis 5.0 memory edition in standard architecture), `9` (Redis 5.0 memory edition in cluster architecture) 
     * @return ProductType Instance type. Valid values: `1` (Redis 2.8 memory edition in cluster architecture), `2` (Redis 2.8 memory edition in standard architecture), `3` (CKV 3.2 memory edition in standard architecture), `4` (CKV 3.2 memory edition in cluster architecture), `5` (Redis 2.8 memory edition in standalone architecture), `6` (Redis 4.0 memory edition in standard architecture), `7` (Redis 4.0 memory edition in cluster architecture), `8` (Redis 5.0 memory edition in standard architecture), `9` (Redis 5.0 memory edition in cluster architecture)
     */
    public Long getProductType() {
        return this.ProductType;
    }

    /**
     * Set Instance type. Valid values: `1` (Redis 2.8 memory edition in cluster architecture), `2` (Redis 2.8 memory edition in standard architecture), `3` (CKV 3.2 memory edition in standard architecture), `4` (CKV 3.2 memory edition in cluster architecture), `5` (Redis 2.8 memory edition in standalone architecture), `6` (Redis 4.0 memory edition in standard architecture), `7` (Redis 4.0 memory edition in cluster architecture), `8` (Redis 5.0 memory edition in standard architecture), `9` (Redis 5.0 memory edition in cluster architecture)
     * @param ProductType Instance type. Valid values: `1` (Redis 2.8 memory edition in cluster architecture), `2` (Redis 2.8 memory edition in standard architecture), `3` (CKV 3.2 memory edition in standard architecture), `4` (CKV 3.2 memory edition in cluster architecture), `5` (Redis 2.8 memory edition in standalone architecture), `6` (Redis 4.0 memory edition in standard architecture), `7` (Redis 4.0 memory edition in cluster architecture), `8` (Redis 5.0 memory edition in standard architecture), `9` (Redis 5.0 memory edition in cluster architecture)
     */
    public void setProductType(Long ProductType) {
        this.ProductType = ProductType;
    }

    /**
     * Get Creation time 
     * @return CreateTime Creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
     * @param CreateTime Creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Update time 
     * @return UpdateTime Update time
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time
     * @param UpdateTime Update time
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public Instances() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Instances(Instances source) {
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.RedisReplicasNum != null) {
            this.RedisReplicasNum = new Long(source.RedisReplicasNum);
        }
        if (source.RedisShardNum != null) {
            this.RedisShardNum = new Long(source.RedisShardNum);
        }
        if (source.RedisShardSize != null) {
            this.RedisShardSize = new Long(source.RedisShardSize);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.Engine != null) {
            this.Engine = new String(source.Engine);
        }
        if (source.Role != null) {
            this.Role = new String(source.Role);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vip6 != null) {
            this.Vip6 = new String(source.Vip6);
        }
        if (source.VpcID != null) {
            this.VpcID = new Long(source.VpcID);
        }
        if (source.VPort != null) {
            this.VPort = new Long(source.VPort);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.GrocerySysId != null) {
            this.GrocerySysId = new Long(source.GrocerySysId);
        }
        if (source.ProductType != null) {
            this.ProductType = new Long(source.ProductType);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "RedisReplicasNum", this.RedisReplicasNum);
        this.setParamSimple(map, prefix + "RedisShardNum", this.RedisShardNum);
        this.setParamSimple(map, prefix + "RedisShardSize", this.RedisShardSize);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "Engine", this.Engine);
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vip6", this.Vip6);
        this.setParamSimple(map, prefix + "VpcID", this.VpcID);
        this.setParamSimple(map, prefix + "VPort", this.VPort);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "GrocerySysId", this.GrocerySysId);
        this.setParamSimple(map, prefix + "ProductType", this.ProductType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

