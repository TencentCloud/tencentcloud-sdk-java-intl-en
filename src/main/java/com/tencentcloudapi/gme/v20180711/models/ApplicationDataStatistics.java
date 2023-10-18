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
package com.tencentcloudapi.gme.v20180711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApplicationDataStatistics extends AbstractModel {

    /**
    * Application ID
    */
    @SerializedName("BizId")
    @Expose
    private Long BizId;

    /**
    * Number of DAU metrics
    */
    @SerializedName("DauDataNum")
    @Expose
    private Long DauDataNum;

    /**
    * DAUs in the Chinese mainland
    */
    @SerializedName("DauDataMainland")
    @Expose
    private StatisticsItem [] DauDataMainland;

    /**
    * DAUs outside the Chinese mainland
    */
    @SerializedName("DauDataOversea")
    @Expose
    private StatisticsItem [] DauDataOversea;

    /**
    * Total DAUs
    */
    @SerializedName("DauDataSum")
    @Expose
    private StatisticsItem [] DauDataSum;

    /**
    * Number of Voice Chat metrics
    */
    @SerializedName("DurationDataNum")
    @Expose
    private Long DurationDataNum;

    /**
    * Duration of Voice Chat in the Chinese mainland (in minutes)
    */
    @SerializedName("DurationDataMainland")
    @Expose
    private StatisticsItem [] DurationDataMainland;

    /**
    * Duration of Voice Chat outside the Chinese mainland (in minutes)
    */
    @SerializedName("DurationDataOversea")
    @Expose
    private StatisticsItem [] DurationDataOversea;

    /**
    * Total duration of Voice Chat (in minutes)
    */
    @SerializedName("DurationDataSum")
    @Expose
    private StatisticsItem [] DurationDataSum;

    /**
    * Number of PCU metrics
    */
    @SerializedName("PcuDataNum")
    @Expose
    private Long PcuDataNum;

    /**
    * PCUs in the Chinese mainland
    */
    @SerializedName("PcuDataMainland")
    @Expose
    private StatisticsItem [] PcuDataMainland;

    /**
    * PCUs outside the Chinese mainland
    */
    @SerializedName("PcuDataOversea")
    @Expose
    private StatisticsItem [] PcuDataOversea;

    /**
    * Total PCUs
    */
    @SerializedName("PcuDataSum")
    @Expose
    private StatisticsItem [] PcuDataSum;

    /**
     * Get Application ID 
     * @return BizId Application ID
     */
    public Long getBizId() {
        return this.BizId;
    }

    /**
     * Set Application ID
     * @param BizId Application ID
     */
    public void setBizId(Long BizId) {
        this.BizId = BizId;
    }

    /**
     * Get Number of DAU metrics 
     * @return DauDataNum Number of DAU metrics
     */
    public Long getDauDataNum() {
        return this.DauDataNum;
    }

    /**
     * Set Number of DAU metrics
     * @param DauDataNum Number of DAU metrics
     */
    public void setDauDataNum(Long DauDataNum) {
        this.DauDataNum = DauDataNum;
    }

    /**
     * Get DAUs in the Chinese mainland 
     * @return DauDataMainland DAUs in the Chinese mainland
     */
    public StatisticsItem [] getDauDataMainland() {
        return this.DauDataMainland;
    }

    /**
     * Set DAUs in the Chinese mainland
     * @param DauDataMainland DAUs in the Chinese mainland
     */
    public void setDauDataMainland(StatisticsItem [] DauDataMainland) {
        this.DauDataMainland = DauDataMainland;
    }

    /**
     * Get DAUs outside the Chinese mainland 
     * @return DauDataOversea DAUs outside the Chinese mainland
     */
    public StatisticsItem [] getDauDataOversea() {
        return this.DauDataOversea;
    }

    /**
     * Set DAUs outside the Chinese mainland
     * @param DauDataOversea DAUs outside the Chinese mainland
     */
    public void setDauDataOversea(StatisticsItem [] DauDataOversea) {
        this.DauDataOversea = DauDataOversea;
    }

    /**
     * Get Total DAUs 
     * @return DauDataSum Total DAUs
     */
    public StatisticsItem [] getDauDataSum() {
        return this.DauDataSum;
    }

    /**
     * Set Total DAUs
     * @param DauDataSum Total DAUs
     */
    public void setDauDataSum(StatisticsItem [] DauDataSum) {
        this.DauDataSum = DauDataSum;
    }

    /**
     * Get Number of Voice Chat metrics 
     * @return DurationDataNum Number of Voice Chat metrics
     */
    public Long getDurationDataNum() {
        return this.DurationDataNum;
    }

    /**
     * Set Number of Voice Chat metrics
     * @param DurationDataNum Number of Voice Chat metrics
     */
    public void setDurationDataNum(Long DurationDataNum) {
        this.DurationDataNum = DurationDataNum;
    }

    /**
     * Get Duration of Voice Chat in the Chinese mainland (in minutes) 
     * @return DurationDataMainland Duration of Voice Chat in the Chinese mainland (in minutes)
     */
    public StatisticsItem [] getDurationDataMainland() {
        return this.DurationDataMainland;
    }

    /**
     * Set Duration of Voice Chat in the Chinese mainland (in minutes)
     * @param DurationDataMainland Duration of Voice Chat in the Chinese mainland (in minutes)
     */
    public void setDurationDataMainland(StatisticsItem [] DurationDataMainland) {
        this.DurationDataMainland = DurationDataMainland;
    }

    /**
     * Get Duration of Voice Chat outside the Chinese mainland (in minutes) 
     * @return DurationDataOversea Duration of Voice Chat outside the Chinese mainland (in minutes)
     */
    public StatisticsItem [] getDurationDataOversea() {
        return this.DurationDataOversea;
    }

    /**
     * Set Duration of Voice Chat outside the Chinese mainland (in minutes)
     * @param DurationDataOversea Duration of Voice Chat outside the Chinese mainland (in minutes)
     */
    public void setDurationDataOversea(StatisticsItem [] DurationDataOversea) {
        this.DurationDataOversea = DurationDataOversea;
    }

    /**
     * Get Total duration of Voice Chat (in minutes) 
     * @return DurationDataSum Total duration of Voice Chat (in minutes)
     */
    public StatisticsItem [] getDurationDataSum() {
        return this.DurationDataSum;
    }

    /**
     * Set Total duration of Voice Chat (in minutes)
     * @param DurationDataSum Total duration of Voice Chat (in minutes)
     */
    public void setDurationDataSum(StatisticsItem [] DurationDataSum) {
        this.DurationDataSum = DurationDataSum;
    }

    /**
     * Get Number of PCU metrics 
     * @return PcuDataNum Number of PCU metrics
     */
    public Long getPcuDataNum() {
        return this.PcuDataNum;
    }

    /**
     * Set Number of PCU metrics
     * @param PcuDataNum Number of PCU metrics
     */
    public void setPcuDataNum(Long PcuDataNum) {
        this.PcuDataNum = PcuDataNum;
    }

    /**
     * Get PCUs in the Chinese mainland 
     * @return PcuDataMainland PCUs in the Chinese mainland
     */
    public StatisticsItem [] getPcuDataMainland() {
        return this.PcuDataMainland;
    }

    /**
     * Set PCUs in the Chinese mainland
     * @param PcuDataMainland PCUs in the Chinese mainland
     */
    public void setPcuDataMainland(StatisticsItem [] PcuDataMainland) {
        this.PcuDataMainland = PcuDataMainland;
    }

    /**
     * Get PCUs outside the Chinese mainland 
     * @return PcuDataOversea PCUs outside the Chinese mainland
     */
    public StatisticsItem [] getPcuDataOversea() {
        return this.PcuDataOversea;
    }

    /**
     * Set PCUs outside the Chinese mainland
     * @param PcuDataOversea PCUs outside the Chinese mainland
     */
    public void setPcuDataOversea(StatisticsItem [] PcuDataOversea) {
        this.PcuDataOversea = PcuDataOversea;
    }

    /**
     * Get Total PCUs 
     * @return PcuDataSum Total PCUs
     */
    public StatisticsItem [] getPcuDataSum() {
        return this.PcuDataSum;
    }

    /**
     * Set Total PCUs
     * @param PcuDataSum Total PCUs
     */
    public void setPcuDataSum(StatisticsItem [] PcuDataSum) {
        this.PcuDataSum = PcuDataSum;
    }

    public ApplicationDataStatistics() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplicationDataStatistics(ApplicationDataStatistics source) {
        if (source.BizId != null) {
            this.BizId = new Long(source.BizId);
        }
        if (source.DauDataNum != null) {
            this.DauDataNum = new Long(source.DauDataNum);
        }
        if (source.DauDataMainland != null) {
            this.DauDataMainland = new StatisticsItem[source.DauDataMainland.length];
            for (int i = 0; i < source.DauDataMainland.length; i++) {
                this.DauDataMainland[i] = new StatisticsItem(source.DauDataMainland[i]);
            }
        }
        if (source.DauDataOversea != null) {
            this.DauDataOversea = new StatisticsItem[source.DauDataOversea.length];
            for (int i = 0; i < source.DauDataOversea.length; i++) {
                this.DauDataOversea[i] = new StatisticsItem(source.DauDataOversea[i]);
            }
        }
        if (source.DauDataSum != null) {
            this.DauDataSum = new StatisticsItem[source.DauDataSum.length];
            for (int i = 0; i < source.DauDataSum.length; i++) {
                this.DauDataSum[i] = new StatisticsItem(source.DauDataSum[i]);
            }
        }
        if (source.DurationDataNum != null) {
            this.DurationDataNum = new Long(source.DurationDataNum);
        }
        if (source.DurationDataMainland != null) {
            this.DurationDataMainland = new StatisticsItem[source.DurationDataMainland.length];
            for (int i = 0; i < source.DurationDataMainland.length; i++) {
                this.DurationDataMainland[i] = new StatisticsItem(source.DurationDataMainland[i]);
            }
        }
        if (source.DurationDataOversea != null) {
            this.DurationDataOversea = new StatisticsItem[source.DurationDataOversea.length];
            for (int i = 0; i < source.DurationDataOversea.length; i++) {
                this.DurationDataOversea[i] = new StatisticsItem(source.DurationDataOversea[i]);
            }
        }
        if (source.DurationDataSum != null) {
            this.DurationDataSum = new StatisticsItem[source.DurationDataSum.length];
            for (int i = 0; i < source.DurationDataSum.length; i++) {
                this.DurationDataSum[i] = new StatisticsItem(source.DurationDataSum[i]);
            }
        }
        if (source.PcuDataNum != null) {
            this.PcuDataNum = new Long(source.PcuDataNum);
        }
        if (source.PcuDataMainland != null) {
            this.PcuDataMainland = new StatisticsItem[source.PcuDataMainland.length];
            for (int i = 0; i < source.PcuDataMainland.length; i++) {
                this.PcuDataMainland[i] = new StatisticsItem(source.PcuDataMainland[i]);
            }
        }
        if (source.PcuDataOversea != null) {
            this.PcuDataOversea = new StatisticsItem[source.PcuDataOversea.length];
            for (int i = 0; i < source.PcuDataOversea.length; i++) {
                this.PcuDataOversea[i] = new StatisticsItem(source.PcuDataOversea[i]);
            }
        }
        if (source.PcuDataSum != null) {
            this.PcuDataSum = new StatisticsItem[source.PcuDataSum.length];
            for (int i = 0; i < source.PcuDataSum.length; i++) {
                this.PcuDataSum[i] = new StatisticsItem(source.PcuDataSum[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BizId", this.BizId);
        this.setParamSimple(map, prefix + "DauDataNum", this.DauDataNum);
        this.setParamArrayObj(map, prefix + "DauDataMainland.", this.DauDataMainland);
        this.setParamArrayObj(map, prefix + "DauDataOversea.", this.DauDataOversea);
        this.setParamArrayObj(map, prefix + "DauDataSum.", this.DauDataSum);
        this.setParamSimple(map, prefix + "DurationDataNum", this.DurationDataNum);
        this.setParamArrayObj(map, prefix + "DurationDataMainland.", this.DurationDataMainland);
        this.setParamArrayObj(map, prefix + "DurationDataOversea.", this.DurationDataOversea);
        this.setParamArrayObj(map, prefix + "DurationDataSum.", this.DurationDataSum);
        this.setParamSimple(map, prefix + "PcuDataNum", this.PcuDataNum);
        this.setParamArrayObj(map, prefix + "PcuDataMainland.", this.PcuDataMainland);
        this.setParamArrayObj(map, prefix + "PcuDataOversea.", this.PcuDataOversea);
        this.setParamArrayObj(map, prefix + "PcuDataSum.", this.PcuDataSum);

    }
}

