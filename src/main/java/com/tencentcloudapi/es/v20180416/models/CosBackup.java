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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CosBackup extends AbstractModel {

    /**
    * Whether to enable auto-backup to COS
    */
    @SerializedName("IsAutoBackup")
    @Expose
    private Boolean IsAutoBackup;

    /**
    * Auto-backup time (accurate down to the hour), such as "22:00"
    */
    @SerializedName("BackupTime")
    @Expose
    private String BackupTime;

    /**
     * Get Whether to enable auto-backup to COS 
     * @return IsAutoBackup Whether to enable auto-backup to COS
     */
    public Boolean getIsAutoBackup() {
        return this.IsAutoBackup;
    }

    /**
     * Set Whether to enable auto-backup to COS
     * @param IsAutoBackup Whether to enable auto-backup to COS
     */
    public void setIsAutoBackup(Boolean IsAutoBackup) {
        this.IsAutoBackup = IsAutoBackup;
    }

    /**
     * Get Auto-backup time (accurate down to the hour), such as "22:00" 
     * @return BackupTime Auto-backup time (accurate down to the hour), such as "22:00"
     */
    public String getBackupTime() {
        return this.BackupTime;
    }

    /**
     * Set Auto-backup time (accurate down to the hour), such as "22:00"
     * @param BackupTime Auto-backup time (accurate down to the hour), such as "22:00"
     */
    public void setBackupTime(String BackupTime) {
        this.BackupTime = BackupTime;
    }

    public CosBackup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosBackup(CosBackup source) {
        if (source.IsAutoBackup != null) {
            this.IsAutoBackup = new Boolean(source.IsAutoBackup);
        }
        if (source.BackupTime != null) {
            this.BackupTime = new String(source.BackupTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsAutoBackup", this.IsAutoBackup);
        this.setParamSimple(map, prefix + "BackupTime", this.BackupTime);

    }
}

