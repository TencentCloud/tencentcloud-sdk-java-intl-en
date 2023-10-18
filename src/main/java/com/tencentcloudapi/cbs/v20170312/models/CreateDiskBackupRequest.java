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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDiskBackupRequest extends AbstractModel {

    /**
    * Name of the cloud disk for which to create a backup point.
    */
    @SerializedName("DiskId")
    @Expose
    private String DiskId;

    /**
    * Name of the cloud disk backup point, which can contain up to 100 characters.
    */
    @SerializedName("DiskBackupName")
    @Expose
    private String DiskBackupName;

    /**
     * Get Name of the cloud disk for which to create a backup point. 
     * @return DiskId Name of the cloud disk for which to create a backup point.
     */
    public String getDiskId() {
        return this.DiskId;
    }

    /**
     * Set Name of the cloud disk for which to create a backup point.
     * @param DiskId Name of the cloud disk for which to create a backup point.
     */
    public void setDiskId(String DiskId) {
        this.DiskId = DiskId;
    }

    /**
     * Get Name of the cloud disk backup point, which can contain up to 100 characters. 
     * @return DiskBackupName Name of the cloud disk backup point, which can contain up to 100 characters.
     */
    public String getDiskBackupName() {
        return this.DiskBackupName;
    }

    /**
     * Set Name of the cloud disk backup point, which can contain up to 100 characters.
     * @param DiskBackupName Name of the cloud disk backup point, which can contain up to 100 characters.
     */
    public void setDiskBackupName(String DiskBackupName) {
        this.DiskBackupName = DiskBackupName;
    }

    public CreateDiskBackupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDiskBackupRequest(CreateDiskBackupRequest source) {
        if (source.DiskId != null) {
            this.DiskId = new String(source.DiskId);
        }
        if (source.DiskBackupName != null) {
            this.DiskBackupName = new String(source.DiskBackupName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiskId", this.DiskId);
        this.setParamSimple(map, prefix + "DiskBackupName", this.DiskBackupName);

    }
}

