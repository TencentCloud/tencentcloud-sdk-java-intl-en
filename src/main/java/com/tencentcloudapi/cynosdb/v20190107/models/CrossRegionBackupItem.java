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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CrossRegionBackupItem extends AbstractModel {

    /**
    * Target region for backup.
    */
    @SerializedName("CrossRegion")
    @Expose
    private String CrossRegion;

    /**
    * Target region's backup task ID.
    */
    @SerializedName("BackupId")
    @Expose
    private Long BackupId;

    /**
    * Backup status in the target region.
    */
    @SerializedName("BackupStatus")
    @Expose
    private String BackupStatus;

    /**
     * Get Target region for backup. 
     * @return CrossRegion Target region for backup.
     */
    public String getCrossRegion() {
        return this.CrossRegion;
    }

    /**
     * Set Target region for backup.
     * @param CrossRegion Target region for backup.
     */
    public void setCrossRegion(String CrossRegion) {
        this.CrossRegion = CrossRegion;
    }

    /**
     * Get Target region's backup task ID. 
     * @return BackupId Target region's backup task ID.
     */
    public Long getBackupId() {
        return this.BackupId;
    }

    /**
     * Set Target region's backup task ID.
     * @param BackupId Target region's backup task ID.
     */
    public void setBackupId(Long BackupId) {
        this.BackupId = BackupId;
    }

    /**
     * Get Backup status in the target region. 
     * @return BackupStatus Backup status in the target region.
     */
    public String getBackupStatus() {
        return this.BackupStatus;
    }

    /**
     * Set Backup status in the target region.
     * @param BackupStatus Backup status in the target region.
     */
    public void setBackupStatus(String BackupStatus) {
        this.BackupStatus = BackupStatus;
    }

    public CrossRegionBackupItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CrossRegionBackupItem(CrossRegionBackupItem source) {
        if (source.CrossRegion != null) {
            this.CrossRegion = new String(source.CrossRegion);
        }
        if (source.BackupId != null) {
            this.BackupId = new Long(source.BackupId);
        }
        if (source.BackupStatus != null) {
            this.BackupStatus = new String(source.BackupStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CrossRegion", this.CrossRegion);
        this.setParamSimple(map, prefix + "BackupId", this.BackupId);
        this.setParamSimple(map, prefix + "BackupStatus", this.BackupStatus);

    }
}

