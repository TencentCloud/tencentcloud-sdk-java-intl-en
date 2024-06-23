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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScreenInstanceInfo extends AbstractModel {

    /**
    * Statistical Indicator 0: All Instances, 1: Current Day, 2: YesterdayNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CountTag")
    @Expose
    private Long CountTag;

    /**
    * Total numberNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TotalNum")
    @Expose
    private Long TotalNum;

    /**
    * RunningNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("RunningNum")
    @Expose
    private Long RunningNum;

    /**
    * Pending Execution
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("WaitRunningNum")
    @Expose
    private Long WaitRunningNum;

    /**
    * Wait for Upstream
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DependencyNum")
    @Expose
    private Long DependencyNum;

    /**
    * Waiting for Event
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("WaitEventNum")
    @Expose
    private String WaitEventNum;

    /**
    * Terminating
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("StoppingNum")
    @Expose
    private Long StoppingNum;

    /**
    * SuccessNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("SucceedNum")
    @Expose
    private Long SucceedNum;

    /**
    * Failed
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("FailedNum")
    @Expose
    private Long FailedNum;

    /**
     * Get Statistical Indicator 0: All Instances, 1: Current Day, 2: YesterdayNote: This field may return null, indicating that no valid value can be obtained. 
     * @return CountTag Statistical Indicator 0: All Instances, 1: Current Day, 2: YesterdayNote: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getCountTag() {
        return this.CountTag;
    }

    /**
     * Set Statistical Indicator 0: All Instances, 1: Current Day, 2: YesterdayNote: This field may return null, indicating that no valid value can be obtained.
     * @param CountTag Statistical Indicator 0: All Instances, 1: Current Day, 2: YesterdayNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCountTag(Long CountTag) {
        this.CountTag = CountTag;
    }

    /**
     * Get Total numberNote: This field may return null, indicating that no valid value can be obtained. 
     * @return TotalNum Total numberNote: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getTotalNum() {
        return this.TotalNum;
    }

    /**
     * Set Total numberNote: This field may return null, indicating that no valid value can be obtained.
     * @param TotalNum Total numberNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTotalNum(Long TotalNum) {
        this.TotalNum = TotalNum;
    }

    /**
     * Get RunningNote: This field may return null, indicating that no valid value can be obtained. 
     * @return RunningNum RunningNote: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getRunningNum() {
        return this.RunningNum;
    }

    /**
     * Set RunningNote: This field may return null, indicating that no valid value can be obtained.
     * @param RunningNum RunningNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRunningNum(Long RunningNum) {
        this.RunningNum = RunningNum;
    }

    /**
     * Get Pending Execution
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return WaitRunningNum Pending Execution
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getWaitRunningNum() {
        return this.WaitRunningNum;
    }

    /**
     * Set Pending Execution
Note: This field may return null, indicating that no valid value can be obtained.
     * @param WaitRunningNum Pending Execution
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setWaitRunningNum(Long WaitRunningNum) {
        this.WaitRunningNum = WaitRunningNum;
    }

    /**
     * Get Wait for Upstream
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DependencyNum Wait for Upstream
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getDependencyNum() {
        return this.DependencyNum;
    }

    /**
     * Set Wait for Upstream
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DependencyNum Wait for Upstream
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDependencyNum(Long DependencyNum) {
        this.DependencyNum = DependencyNum;
    }

    /**
     * Get Waiting for Event
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return WaitEventNum Waiting for Event
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getWaitEventNum() {
        return this.WaitEventNum;
    }

    /**
     * Set Waiting for Event
Note: This field may return null, indicating that no valid value can be obtained.
     * @param WaitEventNum Waiting for Event
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setWaitEventNum(String WaitEventNum) {
        this.WaitEventNum = WaitEventNum;
    }

    /**
     * Get Terminating
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return StoppingNum Terminating
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getStoppingNum() {
        return this.StoppingNum;
    }

    /**
     * Set Terminating
Note: This field may return null, indicating that no valid value can be obtained.
     * @param StoppingNum Terminating
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setStoppingNum(Long StoppingNum) {
        this.StoppingNum = StoppingNum;
    }

    /**
     * Get SuccessNote: This field may return null, indicating that no valid value can be obtained. 
     * @return SucceedNum SuccessNote: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getSucceedNum() {
        return this.SucceedNum;
    }

    /**
     * Set SuccessNote: This field may return null, indicating that no valid value can be obtained.
     * @param SucceedNum SuccessNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSucceedNum(Long SucceedNum) {
        this.SucceedNum = SucceedNum;
    }

    /**
     * Get Failed
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return FailedNum Failed
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getFailedNum() {
        return this.FailedNum;
    }

    /**
     * Set Failed
Note: This field may return null, indicating that no valid value can be obtained.
     * @param FailedNum Failed
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setFailedNum(Long FailedNum) {
        this.FailedNum = FailedNum;
    }

    public ScreenInstanceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScreenInstanceInfo(ScreenInstanceInfo source) {
        if (source.CountTag != null) {
            this.CountTag = new Long(source.CountTag);
        }
        if (source.TotalNum != null) {
            this.TotalNum = new Long(source.TotalNum);
        }
        if (source.RunningNum != null) {
            this.RunningNum = new Long(source.RunningNum);
        }
        if (source.WaitRunningNum != null) {
            this.WaitRunningNum = new Long(source.WaitRunningNum);
        }
        if (source.DependencyNum != null) {
            this.DependencyNum = new Long(source.DependencyNum);
        }
        if (source.WaitEventNum != null) {
            this.WaitEventNum = new String(source.WaitEventNum);
        }
        if (source.StoppingNum != null) {
            this.StoppingNum = new Long(source.StoppingNum);
        }
        if (source.SucceedNum != null) {
            this.SucceedNum = new Long(source.SucceedNum);
        }
        if (source.FailedNum != null) {
            this.FailedNum = new Long(source.FailedNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CountTag", this.CountTag);
        this.setParamSimple(map, prefix + "TotalNum", this.TotalNum);
        this.setParamSimple(map, prefix + "RunningNum", this.RunningNum);
        this.setParamSimple(map, prefix + "WaitRunningNum", this.WaitRunningNum);
        this.setParamSimple(map, prefix + "DependencyNum", this.DependencyNum);
        this.setParamSimple(map, prefix + "WaitEventNum", this.WaitEventNum);
        this.setParamSimple(map, prefix + "StoppingNum", this.StoppingNum);
        this.setParamSimple(map, prefix + "SucceedNum", this.SucceedNum);
        this.setParamSimple(map, prefix + "FailedNum", this.FailedNum);

    }
}

