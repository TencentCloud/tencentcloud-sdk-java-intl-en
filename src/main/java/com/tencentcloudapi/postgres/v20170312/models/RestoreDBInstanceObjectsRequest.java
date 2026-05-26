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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RestoreDBInstanceObjectsRequest extends AbstractModel {

    /**
    * Instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/api/409/16773?from_cn_redirect=1).
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * List of objects to be restored. if the object to be restored is named user, the restored name is user_bak_${LinuxTime}. ${LinuxTime} cannot be specified and is set by the system based on the linux time at task initiation.
    */
    @SerializedName("RestoreObjects")
    @Expose
    private String [] RestoreObjects;

    /**
    * Backup set used for recovery. either `BackupSetId` or `RestoreTargetTime` must be provided, and only one can be passed. obtain through the api [DescribeBaseBackups](https://www.tencentcloud.com/document/product/409/54343).
    */
    @SerializedName("BackupSetId")
    @Expose
    private String BackupSetId;

    /**
    * Recovery target time, Beijing Time (UTC+8). Either `BackupSetId` or `RestoreTargetTime` must be provided, and only one can be passed.
    */
    @SerializedName("RestoreTargetTime")
    @Expose
    private String RestoreTargetTime;

    /**
     * Get Instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/api/409/16773?from_cn_redirect=1). 
     * @return DBInstanceId Instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/api/409/16773?from_cn_redirect=1).
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set Instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/api/409/16773?from_cn_redirect=1).
     * @param DBInstanceId Instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/api/409/16773?from_cn_redirect=1).
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get List of objects to be restored. if the object to be restored is named user, the restored name is user_bak_${LinuxTime}. ${LinuxTime} cannot be specified and is set by the system based on the linux time at task initiation. 
     * @return RestoreObjects List of objects to be restored. if the object to be restored is named user, the restored name is user_bak_${LinuxTime}. ${LinuxTime} cannot be specified and is set by the system based on the linux time at task initiation.
     */
    public String [] getRestoreObjects() {
        return this.RestoreObjects;
    }

    /**
     * Set List of objects to be restored. if the object to be restored is named user, the restored name is user_bak_${LinuxTime}. ${LinuxTime} cannot be specified and is set by the system based on the linux time at task initiation.
     * @param RestoreObjects List of objects to be restored. if the object to be restored is named user, the restored name is user_bak_${LinuxTime}. ${LinuxTime} cannot be specified and is set by the system based on the linux time at task initiation.
     */
    public void setRestoreObjects(String [] RestoreObjects) {
        this.RestoreObjects = RestoreObjects;
    }

    /**
     * Get Backup set used for recovery. either `BackupSetId` or `RestoreTargetTime` must be provided, and only one can be passed. obtain through the api [DescribeBaseBackups](https://www.tencentcloud.com/document/product/409/54343). 
     * @return BackupSetId Backup set used for recovery. either `BackupSetId` or `RestoreTargetTime` must be provided, and only one can be passed. obtain through the api [DescribeBaseBackups](https://www.tencentcloud.com/document/product/409/54343).
     */
    public String getBackupSetId() {
        return this.BackupSetId;
    }

    /**
     * Set Backup set used for recovery. either `BackupSetId` or `RestoreTargetTime` must be provided, and only one can be passed. obtain through the api [DescribeBaseBackups](https://www.tencentcloud.com/document/product/409/54343).
     * @param BackupSetId Backup set used for recovery. either `BackupSetId` or `RestoreTargetTime` must be provided, and only one can be passed. obtain through the api [DescribeBaseBackups](https://www.tencentcloud.com/document/product/409/54343).
     */
    public void setBackupSetId(String BackupSetId) {
        this.BackupSetId = BackupSetId;
    }

    /**
     * Get Recovery target time, Beijing Time (UTC+8). Either `BackupSetId` or `RestoreTargetTime` must be provided, and only one can be passed. 
     * @return RestoreTargetTime Recovery target time, Beijing Time (UTC+8). Either `BackupSetId` or `RestoreTargetTime` must be provided, and only one can be passed.
     */
    public String getRestoreTargetTime() {
        return this.RestoreTargetTime;
    }

    /**
     * Set Recovery target time, Beijing Time (UTC+8). Either `BackupSetId` or `RestoreTargetTime` must be provided, and only one can be passed.
     * @param RestoreTargetTime Recovery target time, Beijing Time (UTC+8). Either `BackupSetId` or `RestoreTargetTime` must be provided, and only one can be passed.
     */
    public void setRestoreTargetTime(String RestoreTargetTime) {
        this.RestoreTargetTime = RestoreTargetTime;
    }

    public RestoreDBInstanceObjectsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RestoreDBInstanceObjectsRequest(RestoreDBInstanceObjectsRequest source) {
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.RestoreObjects != null) {
            this.RestoreObjects = new String[source.RestoreObjects.length];
            for (int i = 0; i < source.RestoreObjects.length; i++) {
                this.RestoreObjects[i] = new String(source.RestoreObjects[i]);
            }
        }
        if (source.BackupSetId != null) {
            this.BackupSetId = new String(source.BackupSetId);
        }
        if (source.RestoreTargetTime != null) {
            this.RestoreTargetTime = new String(source.RestoreTargetTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamArraySimple(map, prefix + "RestoreObjects.", this.RestoreObjects);
        this.setParamSimple(map, prefix + "BackupSetId", this.BackupSetId);
        this.setParamSimple(map, prefix + "RestoreTargetTime", this.RestoreTargetTime);

    }
}

