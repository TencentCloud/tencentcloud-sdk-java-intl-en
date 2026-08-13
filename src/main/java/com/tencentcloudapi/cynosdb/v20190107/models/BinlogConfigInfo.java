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

public class BinlogConfigInfo extends AbstractModel {

    /**
    * <p>binlog retention time</p>
    */
    @SerializedName("BinlogSaveDays")
    @Expose
    private Long BinlogSaveDays;

    /**
    * <p>Whether cross-region backup of binlog is enabled</p>
    */
    @SerializedName("BinlogCrossRegionsEnable")
    @Expose
    private String BinlogCrossRegionsEnable;

    /**
    * <p>Cross-region binlog</p>
    */
    @SerializedName("BinlogCrossRegions")
    @Expose
    private String [] BinlogCrossRegions;

    /**
    * <p>Cross-region backup retention period</p><p>Unit: Day</p>
    */
    @SerializedName("BinlogCrossRegionSaveDays")
    @Expose
    private Long BinlogCrossRegionSaveDays;

    /**
    * <p>Safe info</p>
    */
    @SerializedName("AutoCopyVaults")
    @Expose
    private CreateBackupVaultItem [] AutoCopyVaults;

    /**
     * Get <p>binlog retention time</p> 
     * @return BinlogSaveDays <p>binlog retention time</p>
     */
    public Long getBinlogSaveDays() {
        return this.BinlogSaveDays;
    }

    /**
     * Set <p>binlog retention time</p>
     * @param BinlogSaveDays <p>binlog retention time</p>
     */
    public void setBinlogSaveDays(Long BinlogSaveDays) {
        this.BinlogSaveDays = BinlogSaveDays;
    }

    /**
     * Get <p>Whether cross-region backup of binlog is enabled</p> 
     * @return BinlogCrossRegionsEnable <p>Whether cross-region backup of binlog is enabled</p>
     */
    public String getBinlogCrossRegionsEnable() {
        return this.BinlogCrossRegionsEnable;
    }

    /**
     * Set <p>Whether cross-region backup of binlog is enabled</p>
     * @param BinlogCrossRegionsEnable <p>Whether cross-region backup of binlog is enabled</p>
     */
    public void setBinlogCrossRegionsEnable(String BinlogCrossRegionsEnable) {
        this.BinlogCrossRegionsEnable = BinlogCrossRegionsEnable;
    }

    /**
     * Get <p>Cross-region binlog</p> 
     * @return BinlogCrossRegions <p>Cross-region binlog</p>
     */
    public String [] getBinlogCrossRegions() {
        return this.BinlogCrossRegions;
    }

    /**
     * Set <p>Cross-region binlog</p>
     * @param BinlogCrossRegions <p>Cross-region binlog</p>
     */
    public void setBinlogCrossRegions(String [] BinlogCrossRegions) {
        this.BinlogCrossRegions = BinlogCrossRegions;
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

    /**
     * Get <p>Safe info</p> 
     * @return AutoCopyVaults <p>Safe info</p>
     */
    public CreateBackupVaultItem [] getAutoCopyVaults() {
        return this.AutoCopyVaults;
    }

    /**
     * Set <p>Safe info</p>
     * @param AutoCopyVaults <p>Safe info</p>
     */
    public void setAutoCopyVaults(CreateBackupVaultItem [] AutoCopyVaults) {
        this.AutoCopyVaults = AutoCopyVaults;
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
        if (source.BinlogCrossRegionSaveDays != null) {
            this.BinlogCrossRegionSaveDays = new Long(source.BinlogCrossRegionSaveDays);
        }
        if (source.AutoCopyVaults != null) {
            this.AutoCopyVaults = new CreateBackupVaultItem[source.AutoCopyVaults.length];
            for (int i = 0; i < source.AutoCopyVaults.length; i++) {
                this.AutoCopyVaults[i] = new CreateBackupVaultItem(source.AutoCopyVaults[i]);
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
        this.setParamSimple(map, prefix + "BinlogCrossRegionSaveDays", this.BinlogCrossRegionSaveDays);
        this.setParamArrayObj(map, prefix + "AutoCopyVaults.", this.AutoCopyVaults);

    }
}

