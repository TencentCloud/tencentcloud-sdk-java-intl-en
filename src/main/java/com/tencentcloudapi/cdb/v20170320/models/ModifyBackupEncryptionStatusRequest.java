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

public class ModifyBackupEncryptionStatusRequest extends AbstractModel {

    /**
    * Instance ID in the format of cdb-XXXX, which is the same as that displayed in the TencentDB console.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Default encryption status for the new auto-generated physical backup files. Valid values: `on`, `off`.
    */
    @SerializedName("EncryptionStatus")
    @Expose
    private String EncryptionStatus;

    /**
     * Get Instance ID in the format of cdb-XXXX, which is the same as that displayed in the TencentDB console. 
     * @return InstanceId Instance ID in the format of cdb-XXXX, which is the same as that displayed in the TencentDB console.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID in the format of cdb-XXXX, which is the same as that displayed in the TencentDB console.
     * @param InstanceId Instance ID in the format of cdb-XXXX, which is the same as that displayed in the TencentDB console.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Default encryption status for the new auto-generated physical backup files. Valid values: `on`, `off`. 
     * @return EncryptionStatus Default encryption status for the new auto-generated physical backup files. Valid values: `on`, `off`.
     */
    public String getEncryptionStatus() {
        return this.EncryptionStatus;
    }

    /**
     * Set Default encryption status for the new auto-generated physical backup files. Valid values: `on`, `off`.
     * @param EncryptionStatus Default encryption status for the new auto-generated physical backup files. Valid values: `on`, `off`.
     */
    public void setEncryptionStatus(String EncryptionStatus) {
        this.EncryptionStatus = EncryptionStatus;
    }

    public ModifyBackupEncryptionStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyBackupEncryptionStatusRequest(ModifyBackupEncryptionStatusRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.EncryptionStatus != null) {
            this.EncryptionStatus = new String(source.EncryptionStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "EncryptionStatus", this.EncryptionStatus);

    }
}

