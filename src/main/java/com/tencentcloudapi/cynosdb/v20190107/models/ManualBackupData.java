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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ManualBackupData extends AbstractModel {

    /**
    * 
    */
    @SerializedName("BackupType")
    @Expose
    private String BackupType;

    /**
    * 
    */
    @SerializedName("BackupMethod")
    @Expose
    private String BackupMethod;

    /**
    * 
    */
    @SerializedName("SnapshotTime")
    @Expose
    private String SnapshotTime;

    /**
    * Detailed information of cross-region backup items.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CrossRegionBackupInfos")
    @Expose
    private CrossRegionBackupItem [] CrossRegionBackupInfos;

    /**
     * Get  
     * @return BackupType 
     */
    public String getBackupType() {
        return this.BackupType;
    }

    /**
     * Set 
     * @param BackupType 
     */
    public void setBackupType(String BackupType) {
        this.BackupType = BackupType;
    }

    /**
     * Get  
     * @return BackupMethod 
     */
    public String getBackupMethod() {
        return this.BackupMethod;
    }

    /**
     * Set 
     * @param BackupMethod 
     */
    public void setBackupMethod(String BackupMethod) {
        this.BackupMethod = BackupMethod;
    }

    /**
     * Get  
     * @return SnapshotTime 
     */
    public String getSnapshotTime() {
        return this.SnapshotTime;
    }

    /**
     * Set 
     * @param SnapshotTime 
     */
    public void setSnapshotTime(String SnapshotTime) {
        this.SnapshotTime = SnapshotTime;
    }

    /**
     * Get Detailed information of cross-region backup items.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CrossRegionBackupInfos Detailed information of cross-region backup items.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public CrossRegionBackupItem [] getCrossRegionBackupInfos() {
        return this.CrossRegionBackupInfos;
    }

    /**
     * Set Detailed information of cross-region backup items.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CrossRegionBackupInfos Detailed information of cross-region backup items.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCrossRegionBackupInfos(CrossRegionBackupItem [] CrossRegionBackupInfos) {
        this.CrossRegionBackupInfos = CrossRegionBackupInfos;
    }

    public ManualBackupData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ManualBackupData(ManualBackupData source) {
        if (source.BackupType != null) {
            this.BackupType = new String(source.BackupType);
        }
        if (source.BackupMethod != null) {
            this.BackupMethod = new String(source.BackupMethod);
        }
        if (source.SnapshotTime != null) {
            this.SnapshotTime = new String(source.SnapshotTime);
        }
        if (source.CrossRegionBackupInfos != null) {
            this.CrossRegionBackupInfos = new CrossRegionBackupItem[source.CrossRegionBackupInfos.length];
            for (int i = 0; i < source.CrossRegionBackupInfos.length; i++) {
                this.CrossRegionBackupInfos[i] = new CrossRegionBackupItem(source.CrossRegionBackupInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BackupType", this.BackupType);
        this.setParamSimple(map, prefix + "BackupMethod", this.BackupMethod);
        this.setParamSimple(map, prefix + "SnapshotTime", this.SnapshotTime);
        this.setParamArrayObj(map, prefix + "CrossRegionBackupInfos.", this.CrossRegionBackupInfos);

    }
}

