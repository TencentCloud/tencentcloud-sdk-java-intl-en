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

public class DescribeBackupDownloadURLRequest extends AbstractModel {

    /**
    * Instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/product/409/16773?lang=en).
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * Backup type. Valid values: `LogBackup`, `BaseBackup`.
    */
    @SerializedName("BackupType")
    @Expose
    private String BackupType;

    /**
    * Unique backup ID.
    */
    @SerializedName("BackupId")
    @Expose
    private String BackupId;

    /**
    * Validity time of the connection. value range: [0,36]. default value: 12 hours.
    */
    @SerializedName("URLExpireTime")
    @Expose
    private Long URLExpireTime;

    /**
    * Backup download restriction
    */
    @SerializedName("BackupDownloadRestriction")
    @Expose
    private BackupDownloadRestriction BackupDownloadRestriction;

    /**
     * Get Instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/product/409/16773?lang=en). 
     * @return DBInstanceId Instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/product/409/16773?lang=en).
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set Instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/product/409/16773?lang=en).
     * @param DBInstanceId Instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/product/409/16773?lang=en).
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get Backup type. Valid values: `LogBackup`, `BaseBackup`. 
     * @return BackupType Backup type. Valid values: `LogBackup`, `BaseBackup`.
     */
    public String getBackupType() {
        return this.BackupType;
    }

    /**
     * Set Backup type. Valid values: `LogBackup`, `BaseBackup`.
     * @param BackupType Backup type. Valid values: `LogBackup`, `BaseBackup`.
     */
    public void setBackupType(String BackupType) {
        this.BackupType = BackupType;
    }

    /**
     * Get Unique backup ID. 
     * @return BackupId Unique backup ID.
     */
    public String getBackupId() {
        return this.BackupId;
    }

    /**
     * Set Unique backup ID.
     * @param BackupId Unique backup ID.
     */
    public void setBackupId(String BackupId) {
        this.BackupId = BackupId;
    }

    /**
     * Get Validity time of the connection. value range: [0,36]. default value: 12 hours. 
     * @return URLExpireTime Validity time of the connection. value range: [0,36]. default value: 12 hours.
     */
    public Long getURLExpireTime() {
        return this.URLExpireTime;
    }

    /**
     * Set Validity time of the connection. value range: [0,36]. default value: 12 hours.
     * @param URLExpireTime Validity time of the connection. value range: [0,36]. default value: 12 hours.
     */
    public void setURLExpireTime(Long URLExpireTime) {
        this.URLExpireTime = URLExpireTime;
    }

    /**
     * Get Backup download restriction 
     * @return BackupDownloadRestriction Backup download restriction
     */
    public BackupDownloadRestriction getBackupDownloadRestriction() {
        return this.BackupDownloadRestriction;
    }

    /**
     * Set Backup download restriction
     * @param BackupDownloadRestriction Backup download restriction
     */
    public void setBackupDownloadRestriction(BackupDownloadRestriction BackupDownloadRestriction) {
        this.BackupDownloadRestriction = BackupDownloadRestriction;
    }

    public DescribeBackupDownloadURLRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBackupDownloadURLRequest(DescribeBackupDownloadURLRequest source) {
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.BackupType != null) {
            this.BackupType = new String(source.BackupType);
        }
        if (source.BackupId != null) {
            this.BackupId = new String(source.BackupId);
        }
        if (source.URLExpireTime != null) {
            this.URLExpireTime = new Long(source.URLExpireTime);
        }
        if (source.BackupDownloadRestriction != null) {
            this.BackupDownloadRestriction = new BackupDownloadRestriction(source.BackupDownloadRestriction);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "BackupType", this.BackupType);
        this.setParamSimple(map, prefix + "BackupId", this.BackupId);
        this.setParamSimple(map, prefix + "URLExpireTime", this.URLExpireTime);
        this.setParamObj(map, prefix + "BackupDownloadRestriction.", this.BackupDownloadRestriction);

    }
}

