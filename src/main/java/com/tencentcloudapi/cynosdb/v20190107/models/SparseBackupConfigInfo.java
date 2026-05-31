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

public class SparseBackupConfigInfo extends AbstractModel {

    /**
    * <p>Operation type: add, modify, remove</p>
    */
    @SerializedName("OpType")
    @Expose
    private String OpType;

    /**
    * <p>Configuration ID</p>
    */
    @SerializedName("ConfigId")
    @Expose
    private String ConfigId;

    /**
    * <p>Policy type: weekly/monthly/yearly</p>
    */
    @SerializedName("SparsePeriodConfig")
    @Expose
    private String SparsePeriodConfig;

    /**
    * <p>Cycle time configuration</p>
    */
    @SerializedName("SparsePeriodTime")
    @Expose
    private SparsePeriodTime SparsePeriodTime;

    /**
    * <p>Retention days (7-7320 days, longest 20 years)</p>
    */
    @SerializedName("SparseBackupSaveDays")
    @Expose
    private Long SparseBackupSaveDays;

    /**
     * Get <p>Operation type: add, modify, remove</p> 
     * @return OpType <p>Operation type: add, modify, remove</p>
     */
    public String getOpType() {
        return this.OpType;
    }

    /**
     * Set <p>Operation type: add, modify, remove</p>
     * @param OpType <p>Operation type: add, modify, remove</p>
     */
    public void setOpType(String OpType) {
        this.OpType = OpType;
    }

    /**
     * Get <p>Configuration ID</p> 
     * @return ConfigId <p>Configuration ID</p>
     */
    public String getConfigId() {
        return this.ConfigId;
    }

    /**
     * Set <p>Configuration ID</p>
     * @param ConfigId <p>Configuration ID</p>
     */
    public void setConfigId(String ConfigId) {
        this.ConfigId = ConfigId;
    }

    /**
     * Get <p>Policy type: weekly/monthly/yearly</p> 
     * @return SparsePeriodConfig <p>Policy type: weekly/monthly/yearly</p>
     */
    public String getSparsePeriodConfig() {
        return this.SparsePeriodConfig;
    }

    /**
     * Set <p>Policy type: weekly/monthly/yearly</p>
     * @param SparsePeriodConfig <p>Policy type: weekly/monthly/yearly</p>
     */
    public void setSparsePeriodConfig(String SparsePeriodConfig) {
        this.SparsePeriodConfig = SparsePeriodConfig;
    }

    /**
     * Get <p>Cycle time configuration</p> 
     * @return SparsePeriodTime <p>Cycle time configuration</p>
     */
    public SparsePeriodTime getSparsePeriodTime() {
        return this.SparsePeriodTime;
    }

    /**
     * Set <p>Cycle time configuration</p>
     * @param SparsePeriodTime <p>Cycle time configuration</p>
     */
    public void setSparsePeriodTime(SparsePeriodTime SparsePeriodTime) {
        this.SparsePeriodTime = SparsePeriodTime;
    }

    /**
     * Get <p>Retention days (7-7320 days, longest 20 years)</p> 
     * @return SparseBackupSaveDays <p>Retention days (7-7320 days, longest 20 years)</p>
     */
    public Long getSparseBackupSaveDays() {
        return this.SparseBackupSaveDays;
    }

    /**
     * Set <p>Retention days (7-7320 days, longest 20 years)</p>
     * @param SparseBackupSaveDays <p>Retention days (7-7320 days, longest 20 years)</p>
     */
    public void setSparseBackupSaveDays(Long SparseBackupSaveDays) {
        this.SparseBackupSaveDays = SparseBackupSaveDays;
    }

    public SparseBackupConfigInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SparseBackupConfigInfo(SparseBackupConfigInfo source) {
        if (source.OpType != null) {
            this.OpType = new String(source.OpType);
        }
        if (source.ConfigId != null) {
            this.ConfigId = new String(source.ConfigId);
        }
        if (source.SparsePeriodConfig != null) {
            this.SparsePeriodConfig = new String(source.SparsePeriodConfig);
        }
        if (source.SparsePeriodTime != null) {
            this.SparsePeriodTime = new SparsePeriodTime(source.SparsePeriodTime);
        }
        if (source.SparseBackupSaveDays != null) {
            this.SparseBackupSaveDays = new Long(source.SparseBackupSaveDays);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OpType", this.OpType);
        this.setParamSimple(map, prefix + "ConfigId", this.ConfigId);
        this.setParamSimple(map, prefix + "SparsePeriodConfig", this.SparsePeriodConfig);
        this.setParamObj(map, prefix + "SparsePeriodTime.", this.SparsePeriodTime);
        this.setParamSimple(map, prefix + "SparseBackupSaveDays", this.SparseBackupSaveDays);

    }
}

