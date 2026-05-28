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
package com.tencentcloudapi.tdmysql.v20211122.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BackupMethodStatisticsOutPut extends AbstractModel {

    /**
    * <p>Auto-backup size in Byte</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AutoBackupSize")
    @Expose
    private Long [] AutoBackupSize;

    /**
    * <p>Manual backup size, unit Byte</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ManualBackupSize")
    @Expose
    private Long [] ManualBackupSize;

    /**
     * Get <p>Auto-backup size in Byte</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AutoBackupSize <p>Auto-backup size in Byte</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long [] getAutoBackupSize() {
        return this.AutoBackupSize;
    }

    /**
     * Set <p>Auto-backup size in Byte</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AutoBackupSize <p>Auto-backup size in Byte</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAutoBackupSize(Long [] AutoBackupSize) {
        this.AutoBackupSize = AutoBackupSize;
    }

    /**
     * Get <p>Manual backup size, unit Byte</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ManualBackupSize <p>Manual backup size, unit Byte</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long [] getManualBackupSize() {
        return this.ManualBackupSize;
    }

    /**
     * Set <p>Manual backup size, unit Byte</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ManualBackupSize <p>Manual backup size, unit Byte</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setManualBackupSize(Long [] ManualBackupSize) {
        this.ManualBackupSize = ManualBackupSize;
    }

    public BackupMethodStatisticsOutPut() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupMethodStatisticsOutPut(BackupMethodStatisticsOutPut source) {
        if (source.AutoBackupSize != null) {
            this.AutoBackupSize = new Long[source.AutoBackupSize.length];
            for (int i = 0; i < source.AutoBackupSize.length; i++) {
                this.AutoBackupSize[i] = new Long(source.AutoBackupSize[i]);
            }
        }
        if (source.ManualBackupSize != null) {
            this.ManualBackupSize = new Long[source.ManualBackupSize.length];
            for (int i = 0; i < source.ManualBackupSize.length; i++) {
                this.ManualBackupSize[i] = new Long(source.ManualBackupSize[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "AutoBackupSize.", this.AutoBackupSize);
        this.setParamArraySimple(map, prefix + "ManualBackupSize.", this.ManualBackupSize);

    }
}

