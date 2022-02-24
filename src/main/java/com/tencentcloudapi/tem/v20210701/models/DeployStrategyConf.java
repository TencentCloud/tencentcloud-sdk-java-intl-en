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
package com.tencentcloudapi.tem.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeployStrategyConf extends AbstractModel{

    /**
    * Total batches
    */
    @SerializedName("TotalBatchCount")
    @Expose
    private Long TotalBatchCount;

    /**
    * Number of pods for the beta batch
    */
    @SerializedName("BetaBatchNum")
    @Expose
    private Long BetaBatchNum;

    /**
    * Batch deployment policy. `0`: automatically; `1`: manually; `2`: beta batch (manual)
    */
    @SerializedName("DeployStrategyType")
    @Expose
    private Long DeployStrategyType;

    /**
    * Interval between batches
    */
    @SerializedName("BatchInterval")
    @Expose
    private Long BatchInterval;

    /**
    * The minimum number of available pods
    */
    @SerializedName("MinAvailable")
    @Expose
    private Long MinAvailable;

    /**
     * Get Total batches 
     * @return TotalBatchCount Total batches
     */
    public Long getTotalBatchCount() {
        return this.TotalBatchCount;
    }

    /**
     * Set Total batches
     * @param TotalBatchCount Total batches
     */
    public void setTotalBatchCount(Long TotalBatchCount) {
        this.TotalBatchCount = TotalBatchCount;
    }

    /**
     * Get Number of pods for the beta batch 
     * @return BetaBatchNum Number of pods for the beta batch
     */
    public Long getBetaBatchNum() {
        return this.BetaBatchNum;
    }

    /**
     * Set Number of pods for the beta batch
     * @param BetaBatchNum Number of pods for the beta batch
     */
    public void setBetaBatchNum(Long BetaBatchNum) {
        this.BetaBatchNum = BetaBatchNum;
    }

    /**
     * Get Batch deployment policy. `0`: automatically; `1`: manually; `2`: beta batch (manual) 
     * @return DeployStrategyType Batch deployment policy. `0`: automatically; `1`: manually; `2`: beta batch (manual)
     */
    public Long getDeployStrategyType() {
        return this.DeployStrategyType;
    }

    /**
     * Set Batch deployment policy. `0`: automatically; `1`: manually; `2`: beta batch (manual)
     * @param DeployStrategyType Batch deployment policy. `0`: automatically; `1`: manually; `2`: beta batch (manual)
     */
    public void setDeployStrategyType(Long DeployStrategyType) {
        this.DeployStrategyType = DeployStrategyType;
    }

    /**
     * Get Interval between batches 
     * @return BatchInterval Interval between batches
     */
    public Long getBatchInterval() {
        return this.BatchInterval;
    }

    /**
     * Set Interval between batches
     * @param BatchInterval Interval between batches
     */
    public void setBatchInterval(Long BatchInterval) {
        this.BatchInterval = BatchInterval;
    }

    /**
     * Get The minimum number of available pods 
     * @return MinAvailable The minimum number of available pods
     */
    public Long getMinAvailable() {
        return this.MinAvailable;
    }

    /**
     * Set The minimum number of available pods
     * @param MinAvailable The minimum number of available pods
     */
    public void setMinAvailable(Long MinAvailable) {
        this.MinAvailable = MinAvailable;
    }

    public DeployStrategyConf() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeployStrategyConf(DeployStrategyConf source) {
        if (source.TotalBatchCount != null) {
            this.TotalBatchCount = new Long(source.TotalBatchCount);
        }
        if (source.BetaBatchNum != null) {
            this.BetaBatchNum = new Long(source.BetaBatchNum);
        }
        if (source.DeployStrategyType != null) {
            this.DeployStrategyType = new Long(source.DeployStrategyType);
        }
        if (source.BatchInterval != null) {
            this.BatchInterval = new Long(source.BatchInterval);
        }
        if (source.MinAvailable != null) {
            this.MinAvailable = new Long(source.MinAvailable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalBatchCount", this.TotalBatchCount);
        this.setParamSimple(map, prefix + "BetaBatchNum", this.BetaBatchNum);
        this.setParamSimple(map, prefix + "DeployStrategyType", this.DeployStrategyType);
        this.setParamSimple(map, prefix + "BatchInterval", this.BatchInterval);
        this.setParamSimple(map, prefix + "MinAvailable", this.MinAvailable);

    }
}

