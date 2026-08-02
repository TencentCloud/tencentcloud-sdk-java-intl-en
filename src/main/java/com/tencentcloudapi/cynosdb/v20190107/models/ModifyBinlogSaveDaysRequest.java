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

public class ModifyBinlogSaveDaysRequest extends AbstractModel {

    /**
    * <p>Cluster ID.</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>Binlog retention days</p>
    */
    @SerializedName("BinlogSaveDays")
    @Expose
    private Long BinlogSaveDays;

    /**
    * <p>Cross-region backup retention period</p><p>Unit: Day</p>
    */
    @SerializedName("BinlogCrossRegionSaveDays")
    @Expose
    private Long BinlogCrossRegionSaveDays;

    /**
     * Get <p>Cluster ID.</p> 
     * @return ClusterId <p>Cluster ID.</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>Cluster ID.</p>
     * @param ClusterId <p>Cluster ID.</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>Binlog retention days</p> 
     * @return BinlogSaveDays <p>Binlog retention days</p>
     */
    public Long getBinlogSaveDays() {
        return this.BinlogSaveDays;
    }

    /**
     * Set <p>Binlog retention days</p>
     * @param BinlogSaveDays <p>Binlog retention days</p>
     */
    public void setBinlogSaveDays(Long BinlogSaveDays) {
        this.BinlogSaveDays = BinlogSaveDays;
    }

    /**
     * Get <p>Cross-region backup retention period</p><p>Unit: Day</p> 
     * @return BinlogCrossRegionSaveDays <p>Cross-region backup retention period</p><p>Unit: Day</p>
     */
    public Long getBinlogCrossRegionSaveDays() {
        return this.BinlogCrossRegionSaveDays;
    }

    /**
     * Set <p>Cross-region backup retention period</p><p>Unit: Day</p>
     * @param BinlogCrossRegionSaveDays <p>Cross-region backup retention period</p><p>Unit: Day</p>
     */
    public void setBinlogCrossRegionSaveDays(Long BinlogCrossRegionSaveDays) {
        this.BinlogCrossRegionSaveDays = BinlogCrossRegionSaveDays;
    }

    public ModifyBinlogSaveDaysRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyBinlogSaveDaysRequest(ModifyBinlogSaveDaysRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.BinlogSaveDays != null) {
            this.BinlogSaveDays = new Long(source.BinlogSaveDays);
        }
        if (source.BinlogCrossRegionSaveDays != null) {
            this.BinlogCrossRegionSaveDays = new Long(source.BinlogCrossRegionSaveDays);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "BinlogSaveDays", this.BinlogSaveDays);
        this.setParamSimple(map, prefix + "BinlogCrossRegionSaveDays", this.BinlogCrossRegionSaveDays);

    }
}

