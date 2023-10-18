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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyBackupNameRequest extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Backup file ID
    */
    @SerializedName("BackupId")
    @Expose
    private Long BackupId;

    /**
    * Backup name, which can contain up to 60 characters.
    */
    @SerializedName("BackupName")
    @Expose
    private String BackupName;

    /**
     * Get Cluster ID 
     * @return ClusterId Cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID
     * @param ClusterId Cluster ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Backup file ID 
     * @return BackupId Backup file ID
     */
    public Long getBackupId() {
        return this.BackupId;
    }

    /**
     * Set Backup file ID
     * @param BackupId Backup file ID
     */
    public void setBackupId(Long BackupId) {
        this.BackupId = BackupId;
    }

    /**
     * Get Backup name, which can contain up to 60 characters. 
     * @return BackupName Backup name, which can contain up to 60 characters.
     */
    public String getBackupName() {
        return this.BackupName;
    }

    /**
     * Set Backup name, which can contain up to 60 characters.
     * @param BackupName Backup name, which can contain up to 60 characters.
     */
    public void setBackupName(String BackupName) {
        this.BackupName = BackupName;
    }

    public ModifyBackupNameRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyBackupNameRequest(ModifyBackupNameRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.BackupId != null) {
            this.BackupId = new Long(source.BackupId);
        }
        if (source.BackupName != null) {
            this.BackupName = new String(source.BackupName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "BackupId", this.BackupId);
        this.setParamSimple(map, prefix + "BackupName", this.BackupName);

    }
}

