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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpgradeHourDCDBInstanceRequest extends AbstractModel{

    /**
    * Instance ID to be upgraded in the format of dcdbt-ow728lmc, which can be obtained through the `DescribeDCDBInstances` API.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Upgrade type. Valid values: 
<li> `ADD`: Add a new shard </li> 
 <li> `EXPAND`: Upgrade the existing shads</li> 
 <li> `SPLIT`: Split data of the existing shads to the new ones</li>
    */
    @SerializedName("UpgradeType")
    @Expose
    private String UpgradeType;

    /**
    * Add shards when `UpgradeType` is `ADD`.
    */
    @SerializedName("AddShardConfig")
    @Expose
    private AddShardConfig AddShardConfig;

    /**
    * Expand shard when `UpgradeType` is `EXPAND`.
    */
    @SerializedName("ExpandShardConfig")
    @Expose
    private ExpandShardConfig ExpandShardConfig;

    /**
    * Split shard when `UpgradeType` is `SPLIT`.
    */
    @SerializedName("SplitShardConfig")
    @Expose
    private SplitShardConfig SplitShardConfig;

    /**
    * Switch start time in the format of "2019-12-12 07:00:00", which is no less than one hour and within 3 days from the current time.
    */
    @SerializedName("SwitchStartTime")
    @Expose
    private String SwitchStartTime;

    /**
    * Switch end time in the format of "2019-12-12 07:15:00", which must be later than the start time.
    */
    @SerializedName("SwitchEndTime")
    @Expose
    private String SwitchEndTime;

    /**
    * Whether to retry automatically. Valid values: `0` (no), `1` (yes).
    */
    @SerializedName("SwitchAutoRetry")
    @Expose
    private Long SwitchAutoRetry;

    /**
    * The list of new AZs specified in deployment modification. The first one is the source AZ, and the rest are replica AZs.
    */
    @SerializedName("Zones")
    @Expose
    private String [] Zones;

    /**
     * Get Instance ID to be upgraded in the format of dcdbt-ow728lmc, which can be obtained through the `DescribeDCDBInstances` API. 
     * @return InstanceId Instance ID to be upgraded in the format of dcdbt-ow728lmc, which can be obtained through the `DescribeDCDBInstances` API.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID to be upgraded in the format of dcdbt-ow728lmc, which can be obtained through the `DescribeDCDBInstances` API.
     * @param InstanceId Instance ID to be upgraded in the format of dcdbt-ow728lmc, which can be obtained through the `DescribeDCDBInstances` API.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Upgrade type. Valid values: 
<li> `ADD`: Add a new shard </li> 
 <li> `EXPAND`: Upgrade the existing shads</li> 
 <li> `SPLIT`: Split data of the existing shads to the new ones</li> 
     * @return UpgradeType Upgrade type. Valid values: 
<li> `ADD`: Add a new shard </li> 
 <li> `EXPAND`: Upgrade the existing shads</li> 
 <li> `SPLIT`: Split data of the existing shads to the new ones</li>
     */
    public String getUpgradeType() {
        return this.UpgradeType;
    }

    /**
     * Set Upgrade type. Valid values: 
<li> `ADD`: Add a new shard </li> 
 <li> `EXPAND`: Upgrade the existing shads</li> 
 <li> `SPLIT`: Split data of the existing shads to the new ones</li>
     * @param UpgradeType Upgrade type. Valid values: 
<li> `ADD`: Add a new shard </li> 
 <li> `EXPAND`: Upgrade the existing shads</li> 
 <li> `SPLIT`: Split data of the existing shads to the new ones</li>
     */
    public void setUpgradeType(String UpgradeType) {
        this.UpgradeType = UpgradeType;
    }

    /**
     * Get Add shards when `UpgradeType` is `ADD`. 
     * @return AddShardConfig Add shards when `UpgradeType` is `ADD`.
     */
    public AddShardConfig getAddShardConfig() {
        return this.AddShardConfig;
    }

    /**
     * Set Add shards when `UpgradeType` is `ADD`.
     * @param AddShardConfig Add shards when `UpgradeType` is `ADD`.
     */
    public void setAddShardConfig(AddShardConfig AddShardConfig) {
        this.AddShardConfig = AddShardConfig;
    }

    /**
     * Get Expand shard when `UpgradeType` is `EXPAND`. 
     * @return ExpandShardConfig Expand shard when `UpgradeType` is `EXPAND`.
     */
    public ExpandShardConfig getExpandShardConfig() {
        return this.ExpandShardConfig;
    }

    /**
     * Set Expand shard when `UpgradeType` is `EXPAND`.
     * @param ExpandShardConfig Expand shard when `UpgradeType` is `EXPAND`.
     */
    public void setExpandShardConfig(ExpandShardConfig ExpandShardConfig) {
        this.ExpandShardConfig = ExpandShardConfig;
    }

    /**
     * Get Split shard when `UpgradeType` is `SPLIT`. 
     * @return SplitShardConfig Split shard when `UpgradeType` is `SPLIT`.
     */
    public SplitShardConfig getSplitShardConfig() {
        return this.SplitShardConfig;
    }

    /**
     * Set Split shard when `UpgradeType` is `SPLIT`.
     * @param SplitShardConfig Split shard when `UpgradeType` is `SPLIT`.
     */
    public void setSplitShardConfig(SplitShardConfig SplitShardConfig) {
        this.SplitShardConfig = SplitShardConfig;
    }

    /**
     * Get Switch start time in the format of "2019-12-12 07:00:00", which is no less than one hour and within 3 days from the current time. 
     * @return SwitchStartTime Switch start time in the format of "2019-12-12 07:00:00", which is no less than one hour and within 3 days from the current time.
     */
    public String getSwitchStartTime() {
        return this.SwitchStartTime;
    }

    /**
     * Set Switch start time in the format of "2019-12-12 07:00:00", which is no less than one hour and within 3 days from the current time.
     * @param SwitchStartTime Switch start time in the format of "2019-12-12 07:00:00", which is no less than one hour and within 3 days from the current time.
     */
    public void setSwitchStartTime(String SwitchStartTime) {
        this.SwitchStartTime = SwitchStartTime;
    }

    /**
     * Get Switch end time in the format of "2019-12-12 07:15:00", which must be later than the start time. 
     * @return SwitchEndTime Switch end time in the format of "2019-12-12 07:15:00", which must be later than the start time.
     */
    public String getSwitchEndTime() {
        return this.SwitchEndTime;
    }

    /**
     * Set Switch end time in the format of "2019-12-12 07:15:00", which must be later than the start time.
     * @param SwitchEndTime Switch end time in the format of "2019-12-12 07:15:00", which must be later than the start time.
     */
    public void setSwitchEndTime(String SwitchEndTime) {
        this.SwitchEndTime = SwitchEndTime;
    }

    /**
     * Get Whether to retry automatically. Valid values: `0` (no), `1` (yes). 
     * @return SwitchAutoRetry Whether to retry automatically. Valid values: `0` (no), `1` (yes).
     */
    public Long getSwitchAutoRetry() {
        return this.SwitchAutoRetry;
    }

    /**
     * Set Whether to retry automatically. Valid values: `0` (no), `1` (yes).
     * @param SwitchAutoRetry Whether to retry automatically. Valid values: `0` (no), `1` (yes).
     */
    public void setSwitchAutoRetry(Long SwitchAutoRetry) {
        this.SwitchAutoRetry = SwitchAutoRetry;
    }

    /**
     * Get The list of new AZs specified in deployment modification. The first one is the source AZ, and the rest are replica AZs. 
     * @return Zones The list of new AZs specified in deployment modification. The first one is the source AZ, and the rest are replica AZs.
     */
    public String [] getZones() {
        return this.Zones;
    }

    /**
     * Set The list of new AZs specified in deployment modification. The first one is the source AZ, and the rest are replica AZs.
     * @param Zones The list of new AZs specified in deployment modification. The first one is the source AZ, and the rest are replica AZs.
     */
    public void setZones(String [] Zones) {
        this.Zones = Zones;
    }

    public UpgradeHourDCDBInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpgradeHourDCDBInstanceRequest(UpgradeHourDCDBInstanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.UpgradeType != null) {
            this.UpgradeType = new String(source.UpgradeType);
        }
        if (source.AddShardConfig != null) {
            this.AddShardConfig = new AddShardConfig(source.AddShardConfig);
        }
        if (source.ExpandShardConfig != null) {
            this.ExpandShardConfig = new ExpandShardConfig(source.ExpandShardConfig);
        }
        if (source.SplitShardConfig != null) {
            this.SplitShardConfig = new SplitShardConfig(source.SplitShardConfig);
        }
        if (source.SwitchStartTime != null) {
            this.SwitchStartTime = new String(source.SwitchStartTime);
        }
        if (source.SwitchEndTime != null) {
            this.SwitchEndTime = new String(source.SwitchEndTime);
        }
        if (source.SwitchAutoRetry != null) {
            this.SwitchAutoRetry = new Long(source.SwitchAutoRetry);
        }
        if (source.Zones != null) {
            this.Zones = new String[source.Zones.length];
            for (int i = 0; i < source.Zones.length; i++) {
                this.Zones[i] = new String(source.Zones[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "UpgradeType", this.UpgradeType);
        this.setParamObj(map, prefix + "AddShardConfig.", this.AddShardConfig);
        this.setParamObj(map, prefix + "ExpandShardConfig.", this.ExpandShardConfig);
        this.setParamObj(map, prefix + "SplitShardConfig.", this.SplitShardConfig);
        this.setParamSimple(map, prefix + "SwitchStartTime", this.SwitchStartTime);
        this.setParamSimple(map, prefix + "SwitchEndTime", this.SwitchEndTime);
        this.setParamSimple(map, prefix + "SwitchAutoRetry", this.SwitchAutoRetry);
        this.setParamArraySimple(map, prefix + "Zones.", this.Zones);

    }
}

