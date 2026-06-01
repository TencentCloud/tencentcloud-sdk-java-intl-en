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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBackupDecryptionKeyRequest extends AbstractModel {

    /**
    * Instance ID, in the format such as cdb-fybaegd8. This matches the instance ID displayed on the TencentDB console.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Backup ID of the instance, which can be obtained through the [DescribeBackups](https://www.tencentcloud.com/document/api/236/15842?from_cn_redirect=1) API.
    */
    @SerializedName("BackupId")
    @Expose
    private Long BackupId;

    /**
    * Backup type. data - data backup, binlog - log backup. The default value is data.
    */
    @SerializedName("BackupType")
    @Expose
    private String BackupType;

    /**
     * Get Instance ID, in the format such as cdb-fybaegd8. This matches the instance ID displayed on the TencentDB console. 
     * @return InstanceId Instance ID, in the format such as cdb-fybaegd8. This matches the instance ID displayed on the TencentDB console.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID, in the format such as cdb-fybaegd8. This matches the instance ID displayed on the TencentDB console.
     * @param InstanceId Instance ID, in the format such as cdb-fybaegd8. This matches the instance ID displayed on the TencentDB console.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Backup ID of the instance, which can be obtained through the [DescribeBackups](https://www.tencentcloud.com/document/api/236/15842?from_cn_redirect=1) API. 
     * @return BackupId Backup ID of the instance, which can be obtained through the [DescribeBackups](https://www.tencentcloud.com/document/api/236/15842?from_cn_redirect=1) API.
     */
    public Long getBackupId() {
        return this.BackupId;
    }

    /**
     * Set Backup ID of the instance, which can be obtained through the [DescribeBackups](https://www.tencentcloud.com/document/api/236/15842?from_cn_redirect=1) API.
     * @param BackupId Backup ID of the instance, which can be obtained through the [DescribeBackups](https://www.tencentcloud.com/document/api/236/15842?from_cn_redirect=1) API.
     */
    public void setBackupId(Long BackupId) {
        this.BackupId = BackupId;
    }

    /**
     * Get Backup type. data - data backup, binlog - log backup. The default value is data. 
     * @return BackupType Backup type. data - data backup, binlog - log backup. The default value is data.
     */
    public String getBackupType() {
        return this.BackupType;
    }

    /**
     * Set Backup type. data - data backup, binlog - log backup. The default value is data.
     * @param BackupType Backup type. data - data backup, binlog - log backup. The default value is data.
     */
    public void setBackupType(String BackupType) {
        this.BackupType = BackupType;
    }

    public DescribeBackupDecryptionKeyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBackupDecryptionKeyRequest(DescribeBackupDecryptionKeyRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.BackupId != null) {
            this.BackupId = new Long(source.BackupId);
        }
        if (source.BackupType != null) {
            this.BackupType = new String(source.BackupType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "BackupId", this.BackupId);
        this.setParamSimple(map, prefix + "BackupType", this.BackupType);

    }
}

