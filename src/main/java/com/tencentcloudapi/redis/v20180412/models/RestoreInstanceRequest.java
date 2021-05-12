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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RestoreInstanceRequest extends AbstractModel{

    /**
    * ID of the instance to be operated on, which can be obtained through the `redisId` field in the return value of the DescribeRedis API.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Backup ID, which can be obtained through the `backupId` field in the return value of the GetRedisBackupList API
    */
    @SerializedName("BackupId")
    @Expose
    private String BackupId;

    /**
    * Instance password, which needs to be validated during instance restoration (this parameter is not required for password-free instances)
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
     * Get ID of the instance to be operated on, which can be obtained through the `redisId` field in the return value of the DescribeRedis API. 
     * @return InstanceId ID of the instance to be operated on, which can be obtained through the `redisId` field in the return value of the DescribeRedis API.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ID of the instance to be operated on, which can be obtained through the `redisId` field in the return value of the DescribeRedis API.
     * @param InstanceId ID of the instance to be operated on, which can be obtained through the `redisId` field in the return value of the DescribeRedis API.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Backup ID, which can be obtained through the `backupId` field in the return value of the GetRedisBackupList API 
     * @return BackupId Backup ID, which can be obtained through the `backupId` field in the return value of the GetRedisBackupList API
     */
    public String getBackupId() {
        return this.BackupId;
    }

    /**
     * Set Backup ID, which can be obtained through the `backupId` field in the return value of the GetRedisBackupList API
     * @param BackupId Backup ID, which can be obtained through the `backupId` field in the return value of the GetRedisBackupList API
     */
    public void setBackupId(String BackupId) {
        this.BackupId = BackupId;
    }

    /**
     * Get Instance password, which needs to be validated during instance restoration (this parameter is not required for password-free instances) 
     * @return Password Instance password, which needs to be validated during instance restoration (this parameter is not required for password-free instances)
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set Instance password, which needs to be validated during instance restoration (this parameter is not required for password-free instances)
     * @param Password Instance password, which needs to be validated during instance restoration (this parameter is not required for password-free instances)
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    public RestoreInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RestoreInstanceRequest(RestoreInstanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.BackupId != null) {
            this.BackupId = new String(source.BackupId);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "BackupId", this.BackupId);
        this.setParamSimple(map, prefix + "Password", this.Password);

    }
}

