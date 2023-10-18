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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteBackupRecordsRequest extends AbstractModel {

    /**
    * Cluster ID of the backup records to be deleted
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Details of the backup records to be deleted
    */
    @SerializedName("BackupRecords")
    @Expose
    private BackupRecords [] BackupRecords;

    /**
     * Get Cluster ID of the backup records to be deleted 
     * @return ClusterId Cluster ID of the backup records to be deleted
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID of the backup records to be deleted
     * @param ClusterId Cluster ID of the backup records to be deleted
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Details of the backup records to be deleted 
     * @return BackupRecords Details of the backup records to be deleted
     */
    public BackupRecords [] getBackupRecords() {
        return this.BackupRecords;
    }

    /**
     * Set Details of the backup records to be deleted
     * @param BackupRecords Details of the backup records to be deleted
     */
    public void setBackupRecords(BackupRecords [] BackupRecords) {
        this.BackupRecords = BackupRecords;
    }

    public DeleteBackupRecordsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteBackupRecordsRequest(DeleteBackupRecordsRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.BackupRecords != null) {
            this.BackupRecords = new BackupRecords[source.BackupRecords.length];
            for (int i = 0; i < source.BackupRecords.length; i++) {
                this.BackupRecords[i] = new BackupRecords(source.BackupRecords[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArrayObj(map, prefix + "BackupRecords.", this.BackupRecords);

    }
}

