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

public class DescribeInstanceBackupsResponse extends AbstractModel{

    /**
    * Total number of backups
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Array of instance backups
    */
    @SerializedName("BackupSet")
    @Expose
    private RedisBackupSet [] BackupSet;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total number of backups 
     * @return TotalCount Total number of backups
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of backups
     * @param TotalCount Total number of backups
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Array of instance backups 
     * @return BackupSet Array of instance backups
     */
    public RedisBackupSet [] getBackupSet() {
        return this.BackupSet;
    }

    /**
     * Set Array of instance backups
     * @param BackupSet Array of instance backups
     */
    public void setBackupSet(RedisBackupSet [] BackupSet) {
        this.BackupSet = BackupSet;
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

    public DescribeInstanceBackupsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceBackupsResponse(DescribeInstanceBackupsResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.BackupSet != null) {
            this.BackupSet = new RedisBackupSet[source.BackupSet.length];
            for (int i = 0; i < source.BackupSet.length; i++) {
                this.BackupSet[i] = new RedisBackupSet(source.BackupSet[i]);
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "BackupSet.", this.BackupSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

