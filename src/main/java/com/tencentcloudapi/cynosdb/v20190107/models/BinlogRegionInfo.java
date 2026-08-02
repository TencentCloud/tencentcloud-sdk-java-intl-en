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

public class BinlogRegionInfo extends AbstractModel {

    /**
    * <p>Backup region</p>
    */
    @SerializedName("BackupRegion")
    @Expose
    private String BackupRegion;

    /**
    * <p>Backup ID</p>
    */
    @SerializedName("BackupId")
    @Expose
    private Long BackupId;

    /**
     * Get <p>Backup region</p> 
     * @return BackupRegion <p>Backup region</p>
     */
    public String getBackupRegion() {
        return this.BackupRegion;
    }

    /**
     * Set <p>Backup region</p>
     * @param BackupRegion <p>Backup region</p>
     */
    public void setBackupRegion(String BackupRegion) {
        this.BackupRegion = BackupRegion;
    }

    /**
     * Get <p>Backup ID</p> 
     * @return BackupId <p>Backup ID</p>
     */
    public Long getBackupId() {
        return this.BackupId;
    }

    /**
     * Set <p>Backup ID</p>
     * @param BackupId <p>Backup ID</p>
     */
    public void setBackupId(Long BackupId) {
        this.BackupId = BackupId;
    }

    public BinlogRegionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BinlogRegionInfo(BinlogRegionInfo source) {
        if (source.BackupRegion != null) {
            this.BackupRegion = new String(source.BackupRegion);
        }
        if (source.BackupId != null) {
            this.BackupId = new Long(source.BackupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BackupRegion", this.BackupRegion);
        this.setParamSimple(map, prefix + "BackupId", this.BackupId);

    }
}

