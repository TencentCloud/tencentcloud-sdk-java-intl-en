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

public class BinlogConfigInfo extends AbstractModel {

    /**
    * Specifies the retention time of binlogs.
    */
    @SerializedName("BinlogSaveDays")
    @Expose
    private Long BinlogSaveDays;

    /**
    * Whether binlog cross-region backup is enabled.
    */
    @SerializedName("BinlogCrossRegionsEnable")
    @Expose
    private String BinlogCrossRegionsEnable;

    /**
    * binlog in a different region.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BinlogCrossRegions")
    @Expose
    private String [] BinlogCrossRegions;

    /**
     * Get Specifies the retention time of binlogs. 
     * @return BinlogSaveDays Specifies the retention time of binlogs.
     */
    public Long getBinlogSaveDays() {
        return this.BinlogSaveDays;
    }

    /**
     * Set Specifies the retention time of binlogs.
     * @param BinlogSaveDays Specifies the retention time of binlogs.
     */
    public void setBinlogSaveDays(Long BinlogSaveDays) {
        this.BinlogSaveDays = BinlogSaveDays;
    }

    /**
     * Get Whether binlog cross-region backup is enabled. 
     * @return BinlogCrossRegionsEnable Whether binlog cross-region backup is enabled.
     */
    public String getBinlogCrossRegionsEnable() {
        return this.BinlogCrossRegionsEnable;
    }

    /**
     * Set Whether binlog cross-region backup is enabled.
     * @param BinlogCrossRegionsEnable Whether binlog cross-region backup is enabled.
     */
    public void setBinlogCrossRegionsEnable(String BinlogCrossRegionsEnable) {
        this.BinlogCrossRegionsEnable = BinlogCrossRegionsEnable;
    }

    /**
     * Get binlog in a different region.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BinlogCrossRegions binlog in a different region.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getBinlogCrossRegions() {
        return this.BinlogCrossRegions;
    }

    /**
     * Set binlog in a different region.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BinlogCrossRegions binlog in a different region.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBinlogCrossRegions(String [] BinlogCrossRegions) {
        this.BinlogCrossRegions = BinlogCrossRegions;
    }

    public BinlogConfigInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BinlogConfigInfo(BinlogConfigInfo source) {
        if (source.BinlogSaveDays != null) {
            this.BinlogSaveDays = new Long(source.BinlogSaveDays);
        }
        if (source.BinlogCrossRegionsEnable != null) {
            this.BinlogCrossRegionsEnable = new String(source.BinlogCrossRegionsEnable);
        }
        if (source.BinlogCrossRegions != null) {
            this.BinlogCrossRegions = new String[source.BinlogCrossRegions.length];
            for (int i = 0; i < source.BinlogCrossRegions.length; i++) {
                this.BinlogCrossRegions[i] = new String(source.BinlogCrossRegions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BinlogSaveDays", this.BinlogSaveDays);
        this.setParamSimple(map, prefix + "BinlogCrossRegionsEnable", this.BinlogCrossRegionsEnable);
        this.setParamArraySimple(map, prefix + "BinlogCrossRegions.", this.BinlogCrossRegions);

    }
}

