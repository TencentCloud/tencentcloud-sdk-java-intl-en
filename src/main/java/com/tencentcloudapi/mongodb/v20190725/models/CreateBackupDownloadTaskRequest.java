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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateBackupDownloadTaskRequest extends AbstractModel{

    /**
    * Instance ID in the format of "cmgo-p8vnipr5", which is the same as the instance ID displayed in the TencentDB console
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * The name of the backup file to be downloaded, which can be obtained by the `DescribeDBBackups` API
    */
    @SerializedName("BackupName")
    @Expose
    private String BackupName;

    /**
    * The list of shards with backups to be downloaded
    */
    @SerializedName("BackupSets")
    @Expose
    private ReplicaSetInfo [] BackupSets;

    /**
     * Get Instance ID in the format of "cmgo-p8vnipr5", which is the same as the instance ID displayed in the TencentDB console 
     * @return InstanceId Instance ID in the format of "cmgo-p8vnipr5", which is the same as the instance ID displayed in the TencentDB console
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID in the format of "cmgo-p8vnipr5", which is the same as the instance ID displayed in the TencentDB console
     * @param InstanceId Instance ID in the format of "cmgo-p8vnipr5", which is the same as the instance ID displayed in the TencentDB console
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get The name of the backup file to be downloaded, which can be obtained by the `DescribeDBBackups` API 
     * @return BackupName The name of the backup file to be downloaded, which can be obtained by the `DescribeDBBackups` API
     */
    public String getBackupName() {
        return this.BackupName;
    }

    /**
     * Set The name of the backup file to be downloaded, which can be obtained by the `DescribeDBBackups` API
     * @param BackupName The name of the backup file to be downloaded, which can be obtained by the `DescribeDBBackups` API
     */
    public void setBackupName(String BackupName) {
        this.BackupName = BackupName;
    }

    /**
     * Get The list of shards with backups to be downloaded 
     * @return BackupSets The list of shards with backups to be downloaded
     */
    public ReplicaSetInfo [] getBackupSets() {
        return this.BackupSets;
    }

    /**
     * Set The list of shards with backups to be downloaded
     * @param BackupSets The list of shards with backups to be downloaded
     */
    public void setBackupSets(ReplicaSetInfo [] BackupSets) {
        this.BackupSets = BackupSets;
    }

    public CreateBackupDownloadTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBackupDownloadTaskRequest(CreateBackupDownloadTaskRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.BackupName != null) {
            this.BackupName = new String(source.BackupName);
        }
        if (source.BackupSets != null) {
            this.BackupSets = new ReplicaSetInfo[source.BackupSets.length];
            for (int i = 0; i < source.BackupSets.length; i++) {
                this.BackupSets[i] = new ReplicaSetInfo(source.BackupSets[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "BackupName", this.BackupName);
        this.setParamArrayObj(map, prefix + "BackupSets.", this.BackupSets);

    }
}

