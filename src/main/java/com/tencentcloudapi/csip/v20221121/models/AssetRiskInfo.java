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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssetRiskInfo extends AbstractModel {

    /**
    * <p>Risk type</p>
    */
    @SerializedName("ResultType")
    @Expose
    private String ResultType;

    /**
    * <p>Total number of risks</p>
    */
    @SerializedName("RiskCount")
    @Expose
    private Long RiskCount;

    /**
    * <p>Number of severe risks</p>
    */
    @SerializedName("RiskCritical")
    @Expose
    private Long RiskCritical;

    /**
    * <p>High risk count</p>
    */
    @SerializedName("RiskHigh")
    @Expose
    private Long RiskHigh;

    /**
    * <p>Number of medium risks</p>
    */
    @SerializedName("RiskMedium")
    @Expose
    private Long RiskMedium;

    /**
    * <p>Number of low-risk assets</p>
    */
    @SerializedName("RiskLow")
    @Expose
    private Long RiskLow;

    /**
     * Get <p>Risk type</p> 
     * @return ResultType <p>Risk type</p>
     */
    public String getResultType() {
        return this.ResultType;
    }

    /**
     * Set <p>Risk type</p>
     * @param ResultType <p>Risk type</p>
     */
    public void setResultType(String ResultType) {
        this.ResultType = ResultType;
    }

    /**
     * Get <p>Total number of risks</p> 
     * @return RiskCount <p>Total number of risks</p>
     */
    public Long getRiskCount() {
        return this.RiskCount;
    }

    /**
     * Set <p>Total number of risks</p>
     * @param RiskCount <p>Total number of risks</p>
     */
    public void setRiskCount(Long RiskCount) {
        this.RiskCount = RiskCount;
    }

    /**
     * Get <p>Number of severe risks</p> 
     * @return RiskCritical <p>Number of severe risks</p>
     */
    public Long getRiskCritical() {
        return this.RiskCritical;
    }

    /**
     * Set <p>Number of severe risks</p>
     * @param RiskCritical <p>Number of severe risks</p>
     */
    public void setRiskCritical(Long RiskCritical) {
        this.RiskCritical = RiskCritical;
    }

    /**
     * Get <p>High risk count</p> 
     * @return RiskHigh <p>High risk count</p>
     */
    public Long getRiskHigh() {
        return this.RiskHigh;
    }

    /**
     * Set <p>High risk count</p>
     * @param RiskHigh <p>High risk count</p>
     */
    public void setRiskHigh(Long RiskHigh) {
        this.RiskHigh = RiskHigh;
    }

    /**
     * Get <p>Number of medium risks</p> 
     * @return RiskMedium <p>Number of medium risks</p>
     */
    public Long getRiskMedium() {
        return this.RiskMedium;
    }

    /**
     * Set <p>Number of medium risks</p>
     * @param RiskMedium <p>Number of medium risks</p>
     */
    public void setRiskMedium(Long RiskMedium) {
        this.RiskMedium = RiskMedium;
    }

    /**
     * Get <p>Number of low-risk assets</p> 
     * @return RiskLow <p>Number of low-risk assets</p>
     */
    public Long getRiskLow() {
        return this.RiskLow;
    }

    /**
     * Set <p>Number of low-risk assets</p>
     * @param RiskLow <p>Number of low-risk assets</p>
     */
    public void setRiskLow(Long RiskLow) {
        this.RiskLow = RiskLow;
    }

    public AssetRiskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetRiskInfo(AssetRiskInfo source) {
        if (source.ResultType != null) {
            this.ResultType = new String(source.ResultType);
        }
        if (source.RiskCount != null) {
            this.RiskCount = new Long(source.RiskCount);
        }
        if (source.RiskCritical != null) {
            this.RiskCritical = new Long(source.RiskCritical);
        }
        if (source.RiskHigh != null) {
            this.RiskHigh = new Long(source.RiskHigh);
        }
        if (source.RiskMedium != null) {
            this.RiskMedium = new Long(source.RiskMedium);
        }
        if (source.RiskLow != null) {
            this.RiskLow = new Long(source.RiskLow);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResultType", this.ResultType);
        this.setParamSimple(map, prefix + "RiskCount", this.RiskCount);
        this.setParamSimple(map, prefix + "RiskCritical", this.RiskCritical);
        this.setParamSimple(map, prefix + "RiskHigh", this.RiskHigh);
        this.setParamSimple(map, prefix + "RiskMedium", this.RiskMedium);
        this.setParamSimple(map, prefix + "RiskLow", this.RiskLow);

    }
}

