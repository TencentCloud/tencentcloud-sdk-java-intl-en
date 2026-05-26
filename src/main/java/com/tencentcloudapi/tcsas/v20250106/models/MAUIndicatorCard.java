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
package com.tencentcloudapi.tcsas.v20250106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MAUIndicatorCard extends AbstractModel {

    /**
    * Growth rate, calculated as (targetData - sourceData) / sourceData. Returns 0 when SourceMAUNum is 0.
    */
    @SerializedName("ComparisonRatio")
    @Expose
    private String ComparisonRatio;

    /**
    * Comparison result. Valid values: 1: Increase; 2: Decrease. Returns 0 when SourceMAUNum is 0.
    */
    @SerializedName("ComparisonResult")
    @Expose
    private Long ComparisonResult;

    /**
    * Previous month MAU. 
    */
    @SerializedName("SourceMAUNum")
    @Expose
    private Long SourceMAUNum;

    /**
    * Current month MAU.
    */
    @SerializedName("TargetMAUNum")
    @Expose
    private Long TargetMAUNum;

    /**
    * Data timestamp.
    */
    @SerializedName("FlushTime")
    @Expose
    private Long FlushTime;

    /**
     * Get Growth rate, calculated as (targetData - sourceData) / sourceData. Returns 0 when SourceMAUNum is 0. 
     * @return ComparisonRatio Growth rate, calculated as (targetData - sourceData) / sourceData. Returns 0 when SourceMAUNum is 0.
     */
    public String getComparisonRatio() {
        return this.ComparisonRatio;
    }

    /**
     * Set Growth rate, calculated as (targetData - sourceData) / sourceData. Returns 0 when SourceMAUNum is 0.
     * @param ComparisonRatio Growth rate, calculated as (targetData - sourceData) / sourceData. Returns 0 when SourceMAUNum is 0.
     */
    public void setComparisonRatio(String ComparisonRatio) {
        this.ComparisonRatio = ComparisonRatio;
    }

    /**
     * Get Comparison result. Valid values: 1: Increase; 2: Decrease. Returns 0 when SourceMAUNum is 0. 
     * @return ComparisonResult Comparison result. Valid values: 1: Increase; 2: Decrease. Returns 0 when SourceMAUNum is 0.
     */
    public Long getComparisonResult() {
        return this.ComparisonResult;
    }

    /**
     * Set Comparison result. Valid values: 1: Increase; 2: Decrease. Returns 0 when SourceMAUNum is 0.
     * @param ComparisonResult Comparison result. Valid values: 1: Increase; 2: Decrease. Returns 0 when SourceMAUNum is 0.
     */
    public void setComparisonResult(Long ComparisonResult) {
        this.ComparisonResult = ComparisonResult;
    }

    /**
     * Get Previous month MAU.  
     * @return SourceMAUNum Previous month MAU. 
     */
    public Long getSourceMAUNum() {
        return this.SourceMAUNum;
    }

    /**
     * Set Previous month MAU. 
     * @param SourceMAUNum Previous month MAU. 
     */
    public void setSourceMAUNum(Long SourceMAUNum) {
        this.SourceMAUNum = SourceMAUNum;
    }

    /**
     * Get Current month MAU. 
     * @return TargetMAUNum Current month MAU.
     */
    public Long getTargetMAUNum() {
        return this.TargetMAUNum;
    }

    /**
     * Set Current month MAU.
     * @param TargetMAUNum Current month MAU.
     */
    public void setTargetMAUNum(Long TargetMAUNum) {
        this.TargetMAUNum = TargetMAUNum;
    }

    /**
     * Get Data timestamp. 
     * @return FlushTime Data timestamp.
     */
    public Long getFlushTime() {
        return this.FlushTime;
    }

    /**
     * Set Data timestamp.
     * @param FlushTime Data timestamp.
     */
    public void setFlushTime(Long FlushTime) {
        this.FlushTime = FlushTime;
    }

    public MAUIndicatorCard() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MAUIndicatorCard(MAUIndicatorCard source) {
        if (source.ComparisonRatio != null) {
            this.ComparisonRatio = new String(source.ComparisonRatio);
        }
        if (source.ComparisonResult != null) {
            this.ComparisonResult = new Long(source.ComparisonResult);
        }
        if (source.SourceMAUNum != null) {
            this.SourceMAUNum = new Long(source.SourceMAUNum);
        }
        if (source.TargetMAUNum != null) {
            this.TargetMAUNum = new Long(source.TargetMAUNum);
        }
        if (source.FlushTime != null) {
            this.FlushTime = new Long(source.FlushTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ComparisonRatio", this.ComparisonRatio);
        this.setParamSimple(map, prefix + "ComparisonResult", this.ComparisonResult);
        this.setParamSimple(map, prefix + "SourceMAUNum", this.SourceMAUNum);
        this.setParamSimple(map, prefix + "TargetMAUNum", this.TargetMAUNum);
        this.setParamSimple(map, prefix + "FlushTime", this.FlushTime);

    }
}

