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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBackupDecryptionKeyRequest extends AbstractModel{

    /**
    * Instance ID in the format of  cdb-XXXX,  which is the same as the instance ID displayed in the TencentDB console.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Instance backup ID, which can be obtained by the `DescribeBackups` API.
    */
    @SerializedName("BackupId")
    @Expose
    private Long BackupId;

    /**
     * Get Instance ID in the format of  cdb-XXXX,  which is the same as the instance ID displayed in the TencentDB console. 
     * @return InstanceId Instance ID in the format of  cdb-XXXX,  which is the same as the instance ID displayed in the TencentDB console.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID in the format of  cdb-XXXX,  which is the same as the instance ID displayed in the TencentDB console.
     * @param InstanceId Instance ID in the format of  cdb-XXXX,  which is the same as the instance ID displayed in the TencentDB console.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Instance backup ID, which can be obtained by the `DescribeBackups` API. 
     * @return BackupId Instance backup ID, which can be obtained by the `DescribeBackups` API.
     */
    public Long getBackupId() {
        return this.BackupId;
    }

    /**
     * Set Instance backup ID, which can be obtained by the `DescribeBackups` API.
     * @param BackupId Instance backup ID, which can be obtained by the `DescribeBackups` API.
     */
    public void setBackupId(Long BackupId) {
        this.BackupId = BackupId;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "BackupId", this.BackupId);

    }
}

