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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRuleOverviewResponse extends AbstractModel{

    /**
    * Total number of rules
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("AllTotal")
    @Expose
    private Long AllTotal;

    /**
    * Number of blocking rules
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("StrategyNum")
    @Expose
    private Long StrategyNum;

    /**
    * Number of enabled rules
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("StartRuleNum")
    @Expose
    private Long StartRuleNum;

    /**
    * Number of disabled rules
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("StopRuleNum")
    @Expose
    private Long StopRuleNum;

    /**
    * Remaining quota
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("RemainingNum")
    @Expose
    private Long RemainingNum;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total number of rules
Note: This field may return `null`, indicating that no valid value was found. 
     * @return AllTotal Total number of rules
Note: This field may return `null`, indicating that no valid value was found.
     */
    public Long getAllTotal() {
        return this.AllTotal;
    }

    /**
     * Set Total number of rules
Note: This field may return `null`, indicating that no valid value was found.
     * @param AllTotal Total number of rules
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setAllTotal(Long AllTotal) {
        this.AllTotal = AllTotal;
    }

    /**
     * Get Number of blocking rules
Note: This field may return `null`, indicating that no valid value was found. 
     * @return StrategyNum Number of blocking rules
Note: This field may return `null`, indicating that no valid value was found.
     */
    public Long getStrategyNum() {
        return this.StrategyNum;
    }

    /**
     * Set Number of blocking rules
Note: This field may return `null`, indicating that no valid value was found.
     * @param StrategyNum Number of blocking rules
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setStrategyNum(Long StrategyNum) {
        this.StrategyNum = StrategyNum;
    }

    /**
     * Get Number of enabled rules
Note: This field may return `null`, indicating that no valid value was found. 
     * @return StartRuleNum Number of enabled rules
Note: This field may return `null`, indicating that no valid value was found.
     */
    public Long getStartRuleNum() {
        return this.StartRuleNum;
    }

    /**
     * Set Number of enabled rules
Note: This field may return `null`, indicating that no valid value was found.
     * @param StartRuleNum Number of enabled rules
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setStartRuleNum(Long StartRuleNum) {
        this.StartRuleNum = StartRuleNum;
    }

    /**
     * Get Number of disabled rules
Note: This field may return `null`, indicating that no valid value was found. 
     * @return StopRuleNum Number of disabled rules
Note: This field may return `null`, indicating that no valid value was found.
     */
    public Long getStopRuleNum() {
        return this.StopRuleNum;
    }

    /**
     * Set Number of disabled rules
Note: This field may return `null`, indicating that no valid value was found.
     * @param StopRuleNum Number of disabled rules
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setStopRuleNum(Long StopRuleNum) {
        this.StopRuleNum = StopRuleNum;
    }

    /**
     * Get Remaining quota
Note: This field may return `null`, indicating that no valid value was found. 
     * @return RemainingNum Remaining quota
Note: This field may return `null`, indicating that no valid value was found.
     */
    public Long getRemainingNum() {
        return this.RemainingNum;
    }

    /**
     * Set Remaining quota
Note: This field may return `null`, indicating that no valid value was found.
     * @param RemainingNum Remaining quota
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setRemainingNum(Long RemainingNum) {
        this.RemainingNum = RemainingNum;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeRuleOverviewResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRuleOverviewResponse(DescribeRuleOverviewResponse source) {
        if (source.AllTotal != null) {
            this.AllTotal = new Long(source.AllTotal);
        }
        if (source.StrategyNum != null) {
            this.StrategyNum = new Long(source.StrategyNum);
        }
        if (source.StartRuleNum != null) {
            this.StartRuleNum = new Long(source.StartRuleNum);
        }
        if (source.StopRuleNum != null) {
            this.StopRuleNum = new Long(source.StopRuleNum);
        }
        if (source.RemainingNum != null) {
            this.RemainingNum = new Long(source.RemainingNum);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AllTotal", this.AllTotal);
        this.setParamSimple(map, prefix + "StrategyNum", this.StrategyNum);
        this.setParamSimple(map, prefix + "StartRuleNum", this.StartRuleNum);
        this.setParamSimple(map, prefix + "StopRuleNum", this.StopRuleNum);
        this.setParamSimple(map, prefix + "RemainingNum", this.RemainingNum);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

