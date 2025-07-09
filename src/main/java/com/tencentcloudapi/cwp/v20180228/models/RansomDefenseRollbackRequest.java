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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RansomDefenseRollbackRequest extends AbstractModel {

    /**
    * Snapshot time
    */
    @SerializedName("BackupTime")
    @Expose
    private String BackupTime;

    /**
    * Host QUUID
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * Information about the hard disks that need to be rolled back. Hard disks are directly separated by semicolons (;); blanks are all disks that have been snapshot: disk-id1|disk-name1;disk-id2|disk-name2.
    */
    @SerializedName("DiskInfo")
    @Expose
    private String DiskInfo;

    /**
     * Get Snapshot time 
     * @return BackupTime Snapshot time
     */
    public String getBackupTime() {
        return this.BackupTime;
    }

    /**
     * Set Snapshot time
     * @param BackupTime Snapshot time
     */
    public void setBackupTime(String BackupTime) {
        this.BackupTime = BackupTime;
    }

    /**
     * Get Host QUUID 
     * @return Quuid Host QUUID
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set Host QUUID
     * @param Quuid Host QUUID
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get Information about the hard disks that need to be rolled back. Hard disks are directly separated by semicolons (;); blanks are all disks that have been snapshot: disk-id1|disk-name1;disk-id2|disk-name2. 
     * @return DiskInfo Information about the hard disks that need to be rolled back. Hard disks are directly separated by semicolons (;); blanks are all disks that have been snapshot: disk-id1|disk-name1;disk-id2|disk-name2.
     */
    public String getDiskInfo() {
        return this.DiskInfo;
    }

    /**
     * Set Information about the hard disks that need to be rolled back. Hard disks are directly separated by semicolons (;); blanks are all disks that have been snapshot: disk-id1|disk-name1;disk-id2|disk-name2.
     * @param DiskInfo Information about the hard disks that need to be rolled back. Hard disks are directly separated by semicolons (;); blanks are all disks that have been snapshot: disk-id1|disk-name1;disk-id2|disk-name2.
     */
    public void setDiskInfo(String DiskInfo) {
        this.DiskInfo = DiskInfo;
    }

    public RansomDefenseRollbackRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RansomDefenseRollbackRequest(RansomDefenseRollbackRequest source) {
        if (source.BackupTime != null) {
            this.BackupTime = new String(source.BackupTime);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.DiskInfo != null) {
            this.DiskInfo = new String(source.DiskInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BackupTime", this.BackupTime);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "DiskInfo", this.DiskInfo);

    }
}

