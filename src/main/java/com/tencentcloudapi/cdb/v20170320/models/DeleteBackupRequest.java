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

public class DeleteBackupRequest extends AbstractModel {

    /**
    * Instance ID in the format of cdb-c1nl9rpv. It is the same as the instance ID displayed on the TencentDB Console page.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Backup task ID, which is the task ID returned by the [TencentDB instance backup creating API](https://intl.cloud.tencent.com/document/api/236/15844?from_cn_redirect=1).
    */
    @SerializedName("BackupId")
    @Expose
    private Long BackupId;

    /**
     * Get Instance ID in the format of cdb-c1nl9rpv. It is the same as the instance ID displayed on the TencentDB Console page. 
     * @return InstanceId Instance ID in the format of cdb-c1nl9rpv. It is the same as the instance ID displayed on the TencentDB Console page.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID in the format of cdb-c1nl9rpv. It is the same as the instance ID displayed on the TencentDB Console page.
     * @param InstanceId Instance ID in the format of cdb-c1nl9rpv. It is the same as the instance ID displayed on the TencentDB Console page.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Backup task ID, which is the task ID returned by the [TencentDB instance backup creating API](https://intl.cloud.tencent.com/document/api/236/15844?from_cn_redirect=1). 
     * @return BackupId Backup task ID, which is the task ID returned by the [TencentDB instance backup creating API](https://intl.cloud.tencent.com/document/api/236/15844?from_cn_redirect=1).
     */
    public Long getBackupId() {
        return this.BackupId;
    }

    /**
     * Set Backup task ID, which is the task ID returned by the [TencentDB instance backup creating API](https://intl.cloud.tencent.com/document/api/236/15844?from_cn_redirect=1).
     * @param BackupId Backup task ID, which is the task ID returned by the [TencentDB instance backup creating API](https://intl.cloud.tencent.com/document/api/236/15844?from_cn_redirect=1).
     */
    public void setBackupId(Long BackupId) {
        this.BackupId = BackupId;
    }

    public DeleteBackupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteBackupRequest(DeleteBackupRequest source) {
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

