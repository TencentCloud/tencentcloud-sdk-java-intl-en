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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescModifyType extends AbstractModel {

    /**
    * Specifies the renewal type.
    */
    @SerializedName("ModifyType")
    @Expose
    private Long ModifyType;

    /**
    * Specifies whether to migrate.
    */
    @SerializedName("MigrateFlag")
    @Expose
    private Boolean MigrateFlag;

    /**
    * Estimated duration of migration in stable mode (seconds).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MigrateCostTime")
    @Expose
    private Long MigrateCostTime;

    /**
    * Upgrade mode (1: stable mode, 2: high-speed mode).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpgradeStrategy")
    @Expose
    private Long UpgradeStrategy;

    /**
    * Indicates the estimated time for migration in high-speed mode, in seconds.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MigrateCostTimeHighSpeed")
    @Expose
    private Long MigrateCostTimeHighSpeed;

    /**
     * Get Specifies the renewal type. 
     * @return ModifyType Specifies the renewal type.
     */
    public Long getModifyType() {
        return this.ModifyType;
    }

    /**
     * Set Specifies the renewal type.
     * @param ModifyType Specifies the renewal type.
     */
    public void setModifyType(Long ModifyType) {
        this.ModifyType = ModifyType;
    }

    /**
     * Get Specifies whether to migrate. 
     * @return MigrateFlag Specifies whether to migrate.
     */
    public Boolean getMigrateFlag() {
        return this.MigrateFlag;
    }

    /**
     * Set Specifies whether to migrate.
     * @param MigrateFlag Specifies whether to migrate.
     */
    public void setMigrateFlag(Boolean MigrateFlag) {
        this.MigrateFlag = MigrateFlag;
    }

    /**
     * Get Estimated duration of migration in stable mode (seconds).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MigrateCostTime Estimated duration of migration in stable mode (seconds).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMigrateCostTime() {
        return this.MigrateCostTime;
    }

    /**
     * Set Estimated duration of migration in stable mode (seconds).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MigrateCostTime Estimated duration of migration in stable mode (seconds).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMigrateCostTime(Long MigrateCostTime) {
        this.MigrateCostTime = MigrateCostTime;
    }

    /**
     * Get Upgrade mode (1: stable mode, 2: high-speed mode).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UpgradeStrategy Upgrade mode (1: stable mode, 2: high-speed mode).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getUpgradeStrategy() {
        return this.UpgradeStrategy;
    }

    /**
     * Set Upgrade mode (1: stable mode, 2: high-speed mode).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UpgradeStrategy Upgrade mode (1: stable mode, 2: high-speed mode).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUpgradeStrategy(Long UpgradeStrategy) {
        this.UpgradeStrategy = UpgradeStrategy;
    }

    /**
     * Get Indicates the estimated time for migration in high-speed mode, in seconds.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MigrateCostTimeHighSpeed Indicates the estimated time for migration in high-speed mode, in seconds.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMigrateCostTimeHighSpeed() {
        return this.MigrateCostTimeHighSpeed;
    }

    /**
     * Set Indicates the estimated time for migration in high-speed mode, in seconds.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MigrateCostTimeHighSpeed Indicates the estimated time for migration in high-speed mode, in seconds.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMigrateCostTimeHighSpeed(Long MigrateCostTimeHighSpeed) {
        this.MigrateCostTimeHighSpeed = MigrateCostTimeHighSpeed;
    }

    public DescModifyType() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescModifyType(DescModifyType source) {
        if (source.ModifyType != null) {
            this.ModifyType = new Long(source.ModifyType);
        }
        if (source.MigrateFlag != null) {
            this.MigrateFlag = new Boolean(source.MigrateFlag);
        }
        if (source.MigrateCostTime != null) {
            this.MigrateCostTime = new Long(source.MigrateCostTime);
        }
        if (source.UpgradeStrategy != null) {
            this.UpgradeStrategy = new Long(source.UpgradeStrategy);
        }
        if (source.MigrateCostTimeHighSpeed != null) {
            this.MigrateCostTimeHighSpeed = new Long(source.MigrateCostTimeHighSpeed);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModifyType", this.ModifyType);
        this.setParamSimple(map, prefix + "MigrateFlag", this.MigrateFlag);
        this.setParamSimple(map, prefix + "MigrateCostTime", this.MigrateCostTime);
        this.setParamSimple(map, prefix + "UpgradeStrategy", this.UpgradeStrategy);
        this.setParamSimple(map, prefix + "MigrateCostTimeHighSpeed", this.MigrateCostTimeHighSpeed);

    }
}

