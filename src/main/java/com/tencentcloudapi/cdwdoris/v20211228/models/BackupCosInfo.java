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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BackupCosInfo extends AbstractModel {

    /**
    * The cos bucket where the backup file is located.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CosBucket")
    @Expose
    private String CosBucket;

    /**
    * The full cos path where the backup file is located.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CosPath")
    @Expose
    private String CosPath;

    /**
    * Backup file name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SnapShotPath")
    @Expose
    private String SnapShotPath;

    /**
     * Get The cos bucket where the backup file is located.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CosBucket The cos bucket where the backup file is located.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCosBucket() {
        return this.CosBucket;
    }

    /**
     * Set The cos bucket where the backup file is located.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CosBucket The cos bucket where the backup file is located.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCosBucket(String CosBucket) {
        this.CosBucket = CosBucket;
    }

    /**
     * Get The full cos path where the backup file is located.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CosPath The full cos path where the backup file is located.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCosPath() {
        return this.CosPath;
    }

    /**
     * Set The full cos path where the backup file is located.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CosPath The full cos path where the backup file is located.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCosPath(String CosPath) {
        this.CosPath = CosPath;
    }

    /**
     * Get Backup file name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SnapShotPath Backup file name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSnapShotPath() {
        return this.SnapShotPath;
    }

    /**
     * Set Backup file name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SnapShotPath Backup file name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSnapShotPath(String SnapShotPath) {
        this.SnapShotPath = SnapShotPath;
    }

    public BackupCosInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupCosInfo(BackupCosInfo source) {
        if (source.CosBucket != null) {
            this.CosBucket = new String(source.CosBucket);
        }
        if (source.CosPath != null) {
            this.CosPath = new String(source.CosPath);
        }
        if (source.SnapShotPath != null) {
            this.SnapShotPath = new String(source.SnapShotPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CosBucket", this.CosBucket);
        this.setParamSimple(map, prefix + "CosPath", this.CosPath);
        this.setParamSimple(map, prefix + "SnapShotPath", this.SnapShotPath);

    }
}

