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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateBackupDBInstanceRequest extends AbstractModel {

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Valid values: 0 (logical backup), 1 (physical backup)
    */
    @SerializedName("BackupMethod")
    @Expose
    private Long BackupMethod;

    /**
    * Backup remarks
    */
    @SerializedName("BackupRemark")
    @Expose
    private String BackupRemark;

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Valid values: 0 (logical backup), 1 (physical backup) 
     * @return BackupMethod Valid values: 0 (logical backup), 1 (physical backup)
     */
    public Long getBackupMethod() {
        return this.BackupMethod;
    }

    /**
     * Set Valid values: 0 (logical backup), 1 (physical backup)
     * @param BackupMethod Valid values: 0 (logical backup), 1 (physical backup)
     */
    public void setBackupMethod(Long BackupMethod) {
        this.BackupMethod = BackupMethod;
    }

    /**
     * Get Backup remarks 
     * @return BackupRemark Backup remarks
     */
    public String getBackupRemark() {
        return this.BackupRemark;
    }

    /**
     * Set Backup remarks
     * @param BackupRemark Backup remarks
     */
    public void setBackupRemark(String BackupRemark) {
        this.BackupRemark = BackupRemark;
    }

    public CreateBackupDBInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBackupDBInstanceRequest(CreateBackupDBInstanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.BackupMethod != null) {
            this.BackupMethod = new Long(source.BackupMethod);
        }
        if (source.BackupRemark != null) {
            this.BackupRemark = new String(source.BackupRemark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "BackupMethod", this.BackupMethod);
        this.setParamSimple(map, prefix + "BackupRemark", this.BackupRemark);

    }
}

