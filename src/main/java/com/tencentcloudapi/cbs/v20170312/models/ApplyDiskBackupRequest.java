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

public class ApplyDiskBackupRequest extends AbstractModel {

    /**
    * ID of the cloud disk backup point, which can be queried through the `DescribeDiskBackups` API.
    */
    @SerializedName("DiskBackupId")
    @Expose
    private String DiskBackupId;

    /**
    * ID of the original cloud disk of the backup point, which can be queried through the `DescribeDisks` API.
    */
    @SerializedName("DiskId")
    @Expose
    private String DiskId;

    /**
     * Get ID of the cloud disk backup point, which can be queried through the `DescribeDiskBackups` API. 
     * @return DiskBackupId ID of the cloud disk backup point, which can be queried through the `DescribeDiskBackups` API.
     */
    public String getDiskBackupId() {
        return this.DiskBackupId;
    }

    /**
     * Set ID of the cloud disk backup point, which can be queried through the `DescribeDiskBackups` API.
     * @param DiskBackupId ID of the cloud disk backup point, which can be queried through the `DescribeDiskBackups` API.
     */
    public void setDiskBackupId(String DiskBackupId) {
        this.DiskBackupId = DiskBackupId;
    }

    /**
     * Get ID of the original cloud disk of the backup point, which can be queried through the `DescribeDisks` API. 
     * @return DiskId ID of the original cloud disk of the backup point, which can be queried through the `DescribeDisks` API.
     */
    public String getDiskId() {
        return this.DiskId;
    }

    /**
     * Set ID of the original cloud disk of the backup point, which can be queried through the `DescribeDisks` API.
     * @param DiskId ID of the original cloud disk of the backup point, which can be queried through the `DescribeDisks` API.
     */
    public void setDiskId(String DiskId) {
        this.DiskId = DiskId;
    }

    public ApplyDiskBackupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplyDiskBackupRequest(ApplyDiskBackupRequest source) {
        if (source.DiskBackupId != null) {
            this.DiskBackupId = new String(source.DiskBackupId);
        }
        if (source.DiskId != null) {
            this.DiskId = new String(source.DiskId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiskBackupId", this.DiskBackupId);
        this.setParamSimple(map, prefix + "DiskId", this.DiskId);

    }
}

