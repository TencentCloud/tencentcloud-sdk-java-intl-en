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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyCrossBackupStrategyRequest extends AbstractModel {

    /**
    * Cross-region backup switch (data backup & log backup). enable - enabled; disable - disabled.
    */
    @SerializedName("CrossBackupEnabled")
    @Expose
    private String CrossBackupEnabled;

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Instance ID list.
    */
    @SerializedName("InstanceIdSet")
    @Expose
    private String [] InstanceIdSet;

    /**
    * Retention days for cross-region backups. Value range: 7-1830. The default value is 7.
    */
    @SerializedName("CrossBackupSaveDays")
    @Expose
    private Long CrossBackupSaveDays;

    /**
    * Target region ID for cross-region backups, with a maximum of two and a minimum of one.
    */
    @SerializedName("CrossBackupRegion")
    @Expose
    private String [] CrossBackupRegion;

    /**
    * Whether to clean up cross-region backups (data backups & log backups) immediately. This parameter is only valid when the value of BackupEnabled is disabled. 1 - yes; 0 - no. The default value is 0.
    */
    @SerializedName("CleanUpCrossBackup")
    @Expose
    private Long CleanUpCrossBackup;

    /**
     * Get Cross-region backup switch (data backup & log backup). enable - enabled; disable - disabled. 
     * @return CrossBackupEnabled Cross-region backup switch (data backup & log backup). enable - enabled; disable - disabled.
     */
    public String getCrossBackupEnabled() {
        return this.CrossBackupEnabled;
    }

    /**
     * Set Cross-region backup switch (data backup & log backup). enable - enabled; disable - disabled.
     * @param CrossBackupEnabled Cross-region backup switch (data backup & log backup). enable - enabled; disable - disabled.
     */
    public void setCrossBackupEnabled(String CrossBackupEnabled) {
        this.CrossBackupEnabled = CrossBackupEnabled;
    }

    /**
     * Get Instance ID. 
     * @return InstanceId Instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
     * @param InstanceId Instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Instance ID list. 
     * @return InstanceIdSet Instance ID list.
     */
    public String [] getInstanceIdSet() {
        return this.InstanceIdSet;
    }

    /**
     * Set Instance ID list.
     * @param InstanceIdSet Instance ID list.
     */
    public void setInstanceIdSet(String [] InstanceIdSet) {
        this.InstanceIdSet = InstanceIdSet;
    }

    /**
     * Get Retention days for cross-region backups. Value range: 7-1830. The default value is 7. 
     * @return CrossBackupSaveDays Retention days for cross-region backups. Value range: 7-1830. The default value is 7.
     */
    public Long getCrossBackupSaveDays() {
        return this.CrossBackupSaveDays;
    }

    /**
     * Set Retention days for cross-region backups. Value range: 7-1830. The default value is 7.
     * @param CrossBackupSaveDays Retention days for cross-region backups. Value range: 7-1830. The default value is 7.
     */
    public void setCrossBackupSaveDays(Long CrossBackupSaveDays) {
        this.CrossBackupSaveDays = CrossBackupSaveDays;
    }

    /**
     * Get Target region ID for cross-region backups, with a maximum of two and a minimum of one. 
     * @return CrossBackupRegion Target region ID for cross-region backups, with a maximum of two and a minimum of one.
     */
    public String [] getCrossBackupRegion() {
        return this.CrossBackupRegion;
    }

    /**
     * Set Target region ID for cross-region backups, with a maximum of two and a minimum of one.
     * @param CrossBackupRegion Target region ID for cross-region backups, with a maximum of two and a minimum of one.
     */
    public void setCrossBackupRegion(String [] CrossBackupRegion) {
        this.CrossBackupRegion = CrossBackupRegion;
    }

    /**
     * Get Whether to clean up cross-region backups (data backups & log backups) immediately. This parameter is only valid when the value of BackupEnabled is disabled. 1 - yes; 0 - no. The default value is 0. 
     * @return CleanUpCrossBackup Whether to clean up cross-region backups (data backups & log backups) immediately. This parameter is only valid when the value of BackupEnabled is disabled. 1 - yes; 0 - no. The default value is 0.
     */
    public Long getCleanUpCrossBackup() {
        return this.CleanUpCrossBackup;
    }

    /**
     * Set Whether to clean up cross-region backups (data backups & log backups) immediately. This parameter is only valid when the value of BackupEnabled is disabled. 1 - yes; 0 - no. The default value is 0.
     * @param CleanUpCrossBackup Whether to clean up cross-region backups (data backups & log backups) immediately. This parameter is only valid when the value of BackupEnabled is disabled. 1 - yes; 0 - no. The default value is 0.
     */
    public void setCleanUpCrossBackup(Long CleanUpCrossBackup) {
        this.CleanUpCrossBackup = CleanUpCrossBackup;
    }

    public ModifyCrossBackupStrategyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCrossBackupStrategyRequest(ModifyCrossBackupStrategyRequest source) {
        if (source.CrossBackupEnabled != null) {
            this.CrossBackupEnabled = new String(source.CrossBackupEnabled);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceIdSet != null) {
            this.InstanceIdSet = new String[source.InstanceIdSet.length];
            for (int i = 0; i < source.InstanceIdSet.length; i++) {
                this.InstanceIdSet[i] = new String(source.InstanceIdSet[i]);
            }
        }
        if (source.CrossBackupSaveDays != null) {
            this.CrossBackupSaveDays = new Long(source.CrossBackupSaveDays);
        }
        if (source.CrossBackupRegion != null) {
            this.CrossBackupRegion = new String[source.CrossBackupRegion.length];
            for (int i = 0; i < source.CrossBackupRegion.length; i++) {
                this.CrossBackupRegion[i] = new String(source.CrossBackupRegion[i]);
            }
        }
        if (source.CleanUpCrossBackup != null) {
            this.CleanUpCrossBackup = new Long(source.CleanUpCrossBackup);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CrossBackupEnabled", this.CrossBackupEnabled);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "InstanceIdSet.", this.InstanceIdSet);
        this.setParamSimple(map, prefix + "CrossBackupSaveDays", this.CrossBackupSaveDays);
        this.setParamArraySimple(map, prefix + "CrossBackupRegion.", this.CrossBackupRegion);
        this.setParamSimple(map, prefix + "CleanUpCrossBackup", this.CleanUpCrossBackup);

    }
}

