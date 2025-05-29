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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBinlogDownloadUrlRequest extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Binlog file ID
    */
    @SerializedName("BinlogId")
    @Expose
    private Long BinlogId;

    /**
    * Backup download source restriction condition.
    */
    @SerializedName("DownloadRestriction")
    @Expose
    private BackupLimitRestriction DownloadRestriction;

    /**
     * Get Cluster ID 
     * @return ClusterId Cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID
     * @param ClusterId Cluster ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Binlog file ID 
     * @return BinlogId Binlog file ID
     */
    public Long getBinlogId() {
        return this.BinlogId;
    }

    /**
     * Set Binlog file ID
     * @param BinlogId Binlog file ID
     */
    public void setBinlogId(Long BinlogId) {
        this.BinlogId = BinlogId;
    }

    /**
     * Get Backup download source restriction condition. 
     * @return DownloadRestriction Backup download source restriction condition.
     */
    public BackupLimitRestriction getDownloadRestriction() {
        return this.DownloadRestriction;
    }

    /**
     * Set Backup download source restriction condition.
     * @param DownloadRestriction Backup download source restriction condition.
     */
    public void setDownloadRestriction(BackupLimitRestriction DownloadRestriction) {
        this.DownloadRestriction = DownloadRestriction;
    }

    public DescribeBinlogDownloadUrlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBinlogDownloadUrlRequest(DescribeBinlogDownloadUrlRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.BinlogId != null) {
            this.BinlogId = new Long(source.BinlogId);
        }
        if (source.DownloadRestriction != null) {
            this.DownloadRestriction = new BackupLimitRestriction(source.DownloadRestriction);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "BinlogId", this.BinlogId);
        this.setParamObj(map, prefix + "DownloadRestriction.", this.DownloadRestriction);

    }
}

