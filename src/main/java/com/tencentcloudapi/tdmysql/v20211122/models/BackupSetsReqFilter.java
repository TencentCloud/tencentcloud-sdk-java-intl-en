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
package com.tencentcloudapi.tdmysql.v20211122.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BackupSetsReqFilter extends AbstractModel {

    /**
    * <p>Backup method, multiple values separated by commas</p><p>Enumeration value:</p><ul><li>physical: Physical backup</li><li>snapshot: Snapshot backup</li></ul>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BackupMethod")
    @Expose
    private String BackupMethod;

    /**
    * <p>Backup status, multiple values separated by commas. Description of meaning: pending scheduling pending, running running, success success, failed failed</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BackupStatus")
    @Expose
    private String BackupStatus;

    /**
    * <p>Backup type, multiple values separated by commas. Description of meaning: full backup full</p><p>Enumeration value:</p><ul><li>full: Full backup</li></ul>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BackupType")
    @Expose
    private String BackupType;

    /**
    * <p>Backup trigger mode</p><p>Enumeration value:</p><ul><li>0: Auto-backup</li><li>1: Manual backup</li></ul>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ManualBackup")
    @Expose
    private String ManualBackup;

    /**
     * Get <p>Backup method, multiple values separated by commas</p><p>Enumeration value:</p><ul><li>physical: Physical backup</li><li>snapshot: Snapshot backup</li></ul>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BackupMethod <p>Backup method, multiple values separated by commas</p><p>Enumeration value:</p><ul><li>physical: Physical backup</li><li>snapshot: Snapshot backup</li></ul>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBackupMethod() {
        return this.BackupMethod;
    }

    /**
     * Set <p>Backup method, multiple values separated by commas</p><p>Enumeration value:</p><ul><li>physical: Physical backup</li><li>snapshot: Snapshot backup</li></ul>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BackupMethod <p>Backup method, multiple values separated by commas</p><p>Enumeration value:</p><ul><li>physical: Physical backup</li><li>snapshot: Snapshot backup</li></ul>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBackupMethod(String BackupMethod) {
        this.BackupMethod = BackupMethod;
    }

    /**
     * Get <p>Backup status, multiple values separated by commas. Description of meaning: pending scheduling pending, running running, success success, failed failed</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BackupStatus <p>Backup status, multiple values separated by commas. Description of meaning: pending scheduling pending, running running, success success, failed failed</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBackupStatus() {
        return this.BackupStatus;
    }

    /**
     * Set <p>Backup status, multiple values separated by commas. Description of meaning: pending scheduling pending, running running, success success, failed failed</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BackupStatus <p>Backup status, multiple values separated by commas. Description of meaning: pending scheduling pending, running running, success success, failed failed</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBackupStatus(String BackupStatus) {
        this.BackupStatus = BackupStatus;
    }

    /**
     * Get <p>Backup type, multiple values separated by commas. Description of meaning: full backup full</p><p>Enumeration value:</p><ul><li>full: Full backup</li></ul>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BackupType <p>Backup type, multiple values separated by commas. Description of meaning: full backup full</p><p>Enumeration value:</p><ul><li>full: Full backup</li></ul>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBackupType() {
        return this.BackupType;
    }

    /**
     * Set <p>Backup type, multiple values separated by commas. Description of meaning: full backup full</p><p>Enumeration value:</p><ul><li>full: Full backup</li></ul>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BackupType <p>Backup type, multiple values separated by commas. Description of meaning: full backup full</p><p>Enumeration value:</p><ul><li>full: Full backup</li></ul>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBackupType(String BackupType) {
        this.BackupType = BackupType;
    }

    /**
     * Get <p>Backup trigger mode</p><p>Enumeration value:</p><ul><li>0: Auto-backup</li><li>1: Manual backup</li></ul>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ManualBackup <p>Backup trigger mode</p><p>Enumeration value:</p><ul><li>0: Auto-backup</li><li>1: Manual backup</li></ul>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getManualBackup() {
        return this.ManualBackup;
    }

    /**
     * Set <p>Backup trigger mode</p><p>Enumeration value:</p><ul><li>0: Auto-backup</li><li>1: Manual backup</li></ul>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ManualBackup <p>Backup trigger mode</p><p>Enumeration value:</p><ul><li>0: Auto-backup</li><li>1: Manual backup</li></ul>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setManualBackup(String ManualBackup) {
        this.ManualBackup = ManualBackup;
    }

    public BackupSetsReqFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupSetsReqFilter(BackupSetsReqFilter source) {
        if (source.BackupMethod != null) {
            this.BackupMethod = new String(source.BackupMethod);
        }
        if (source.BackupStatus != null) {
            this.BackupStatus = new String(source.BackupStatus);
        }
        if (source.BackupType != null) {
            this.BackupType = new String(source.BackupType);
        }
        if (source.ManualBackup != null) {
            this.ManualBackup = new String(source.ManualBackup);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BackupMethod", this.BackupMethod);
        this.setParamSimple(map, prefix + "BackupStatus", this.BackupStatus);
        this.setParamSimple(map, prefix + "BackupType", this.BackupType);
        this.setParamSimple(map, prefix + "ManualBackup", this.ManualBackup);

    }
}

