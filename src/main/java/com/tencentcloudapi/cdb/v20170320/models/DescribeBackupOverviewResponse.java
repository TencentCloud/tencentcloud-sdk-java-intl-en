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

public class DescribeBackupOverviewResponse extends AbstractModel{

    /**
    * Total number of backups of a user in the current region (including data backups and log backups).
    */
    @SerializedName("BackupCount")
    @Expose
    private Long BackupCount;

    /**
    * Total capacity of backups of a user in the current region.
    */
    @SerializedName("BackupVolume")
    @Expose
    private Long BackupVolume;

    /**
    * Paid capacity of backups of a user in the current region, i.e., capacity that exceeds the free tier.
    */
    @SerializedName("BillingVolume")
    @Expose
    private Long BillingVolume;

    /**
    * Backup capacity in the free tier of a user in the current region.
    */
    @SerializedName("FreeVolume")
    @Expose
    private Long FreeVolume;

    /**
    * Total capacity of backups of a user in the current region
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("RemoteBackupVolume")
    @Expose
    private Long RemoteBackupVolume;

    /**
    * Archive backup capacity, which includes data backups and log backups.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("BackupArchiveVolume")
    @Expose
    private Long BackupArchiveVolume;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total number of backups of a user in the current region (including data backups and log backups). 
     * @return BackupCount Total number of backups of a user in the current region (including data backups and log backups).
     */
    public Long getBackupCount() {
        return this.BackupCount;
    }

    /**
     * Set Total number of backups of a user in the current region (including data backups and log backups).
     * @param BackupCount Total number of backups of a user in the current region (including data backups and log backups).
     */
    public void setBackupCount(Long BackupCount) {
        this.BackupCount = BackupCount;
    }

    /**
     * Get Total capacity of backups of a user in the current region. 
     * @return BackupVolume Total capacity of backups of a user in the current region.
     */
    public Long getBackupVolume() {
        return this.BackupVolume;
    }

    /**
     * Set Total capacity of backups of a user in the current region.
     * @param BackupVolume Total capacity of backups of a user in the current region.
     */
    public void setBackupVolume(Long BackupVolume) {
        this.BackupVolume = BackupVolume;
    }

    /**
     * Get Paid capacity of backups of a user in the current region, i.e., capacity that exceeds the free tier. 
     * @return BillingVolume Paid capacity of backups of a user in the current region, i.e., capacity that exceeds the free tier.
     */
    public Long getBillingVolume() {
        return this.BillingVolume;
    }

    /**
     * Set Paid capacity of backups of a user in the current region, i.e., capacity that exceeds the free tier.
     * @param BillingVolume Paid capacity of backups of a user in the current region, i.e., capacity that exceeds the free tier.
     */
    public void setBillingVolume(Long BillingVolume) {
        this.BillingVolume = BillingVolume;
    }

    /**
     * Get Backup capacity in the free tier of a user in the current region. 
     * @return FreeVolume Backup capacity in the free tier of a user in the current region.
     */
    public Long getFreeVolume() {
        return this.FreeVolume;
    }

    /**
     * Set Backup capacity in the free tier of a user in the current region.
     * @param FreeVolume Backup capacity in the free tier of a user in the current region.
     */
    public void setFreeVolume(Long FreeVolume) {
        this.FreeVolume = FreeVolume;
    }

    /**
     * Get Total capacity of backups of a user in the current region
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return RemoteBackupVolume Total capacity of backups of a user in the current region
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getRemoteBackupVolume() {
        return this.RemoteBackupVolume;
    }

    /**
     * Set Total capacity of backups of a user in the current region
Note: This field may return null, indicating that no valid value can be obtained.
     * @param RemoteBackupVolume Total capacity of backups of a user in the current region
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRemoteBackupVolume(Long RemoteBackupVolume) {
        this.RemoteBackupVolume = RemoteBackupVolume;
    }

    /**
     * Get Archive backup capacity, which includes data backups and log backups.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return BackupArchiveVolume Archive backup capacity, which includes data backups and log backups.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getBackupArchiveVolume() {
        return this.BackupArchiveVolume;
    }

    /**
     * Set Archive backup capacity, which includes data backups and log backups.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param BackupArchiveVolume Archive backup capacity, which includes data backups and log backups.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setBackupArchiveVolume(Long BackupArchiveVolume) {
        this.BackupArchiveVolume = BackupArchiveVolume;
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

    public DescribeBackupOverviewResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBackupOverviewResponse(DescribeBackupOverviewResponse source) {
        if (source.BackupCount != null) {
            this.BackupCount = new Long(source.BackupCount);
        }
        if (source.BackupVolume != null) {
            this.BackupVolume = new Long(source.BackupVolume);
        }
        if (source.BillingVolume != null) {
            this.BillingVolume = new Long(source.BillingVolume);
        }
        if (source.FreeVolume != null) {
            this.FreeVolume = new Long(source.FreeVolume);
        }
        if (source.RemoteBackupVolume != null) {
            this.RemoteBackupVolume = new Long(source.RemoteBackupVolume);
        }
        if (source.BackupArchiveVolume != null) {
            this.BackupArchiveVolume = new Long(source.BackupArchiveVolume);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BackupCount", this.BackupCount);
        this.setParamSimple(map, prefix + "BackupVolume", this.BackupVolume);
        this.setParamSimple(map, prefix + "BillingVolume", this.BillingVolume);
        this.setParamSimple(map, prefix + "FreeVolume", this.FreeVolume);
        this.setParamSimple(map, prefix + "RemoteBackupVolume", this.RemoteBackupVolume);
        this.setParamSimple(map, prefix + "BackupArchiveVolume", this.BackupArchiveVolume);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

