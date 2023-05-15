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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBackupStorageLocationsResponse extends AbstractModel{

    /**
    * Detailed information of the backup repository 
Note: This parameter may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BackupStorageLocationSet")
    @Expose
    private BackupStorageLocation [] BackupStorageLocationSet;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Detailed information of the backup repository 
Note: This parameter may return null, indicating that no valid values can be obtained. 
     * @return BackupStorageLocationSet Detailed information of the backup repository 
Note: This parameter may return null, indicating that no valid values can be obtained.
     */
    public BackupStorageLocation [] getBackupStorageLocationSet() {
        return this.BackupStorageLocationSet;
    }

    /**
     * Set Detailed information of the backup repository 
Note: This parameter may return null, indicating that no valid values can be obtained.
     * @param BackupStorageLocationSet Detailed information of the backup repository 
Note: This parameter may return null, indicating that no valid values can be obtained.
     */
    public void setBackupStorageLocationSet(BackupStorageLocation [] BackupStorageLocationSet) {
        this.BackupStorageLocationSet = BackupStorageLocationSet;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeBackupStorageLocationsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBackupStorageLocationsResponse(DescribeBackupStorageLocationsResponse source) {
        if (source.BackupStorageLocationSet != null) {
            this.BackupStorageLocationSet = new BackupStorageLocation[source.BackupStorageLocationSet.length];
            for (int i = 0; i < source.BackupStorageLocationSet.length; i++) {
                this.BackupStorageLocationSet[i] = new BackupStorageLocation(source.BackupStorageLocationSet[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "BackupStorageLocationSet.", this.BackupStorageLocationSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

