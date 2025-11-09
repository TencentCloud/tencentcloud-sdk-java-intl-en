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

public class RollbackProcessInfo extends AbstractModel {

    /**
    * Is it possible to switch vip.
    */
    @SerializedName("IsVipSwitchable")
    @Expose
    private Boolean IsVipSwitchable;

    /**
    * The exchangeable time of vip.
    */
    @SerializedName("VipSwitchableTime")
    @Expose
    private String VipSwitchableTime;

    /**
    * 
    */
    @SerializedName("ExchangeInstanceInfoList")
    @Expose
    private ExchangeInstanceInfo [] ExchangeInstanceInfoList;

    /**
    * 
    */
    @SerializedName("ExchangeRoGroupInfoList")
    @Expose
    private ExchangeRoGroupInfo [] ExchangeRoGroupInfoList;

    /**
    * Current step.
    */
    @SerializedName("CurrentStep")
    @Expose
    private String CurrentStep;

    /**
    * Current step progress.
    */
    @SerializedName("CurrentStepProgress")
    @Expose
    private Long CurrentStepProgress;

    /**
    * Remaining time of the current step.
    */
    @SerializedName("CurrentStepRemainingTime")
    @Expose
    private String CurrentStepRemainingTime;

    /**
     * Get Is it possible to switch vip. 
     * @return IsVipSwitchable Is it possible to switch vip.
     */
    public Boolean getIsVipSwitchable() {
        return this.IsVipSwitchable;
    }

    /**
     * Set Is it possible to switch vip.
     * @param IsVipSwitchable Is it possible to switch vip.
     */
    public void setIsVipSwitchable(Boolean IsVipSwitchable) {
        this.IsVipSwitchable = IsVipSwitchable;
    }

    /**
     * Get The exchangeable time of vip. 
     * @return VipSwitchableTime The exchangeable time of vip.
     */
    public String getVipSwitchableTime() {
        return this.VipSwitchableTime;
    }

    /**
     * Set The exchangeable time of vip.
     * @param VipSwitchableTime The exchangeable time of vip.
     */
    public void setVipSwitchableTime(String VipSwitchableTime) {
        this.VipSwitchableTime = VipSwitchableTime;
    }

    /**
     * Get  
     * @return ExchangeInstanceInfoList 
     */
    public ExchangeInstanceInfo [] getExchangeInstanceInfoList() {
        return this.ExchangeInstanceInfoList;
    }

    /**
     * Set 
     * @param ExchangeInstanceInfoList 
     */
    public void setExchangeInstanceInfoList(ExchangeInstanceInfo [] ExchangeInstanceInfoList) {
        this.ExchangeInstanceInfoList = ExchangeInstanceInfoList;
    }

    /**
     * Get  
     * @return ExchangeRoGroupInfoList 
     */
    public ExchangeRoGroupInfo [] getExchangeRoGroupInfoList() {
        return this.ExchangeRoGroupInfoList;
    }

    /**
     * Set 
     * @param ExchangeRoGroupInfoList 
     */
    public void setExchangeRoGroupInfoList(ExchangeRoGroupInfo [] ExchangeRoGroupInfoList) {
        this.ExchangeRoGroupInfoList = ExchangeRoGroupInfoList;
    }

    /**
     * Get Current step. 
     * @return CurrentStep Current step.
     */
    public String getCurrentStep() {
        return this.CurrentStep;
    }

    /**
     * Set Current step.
     * @param CurrentStep Current step.
     */
    public void setCurrentStep(String CurrentStep) {
        this.CurrentStep = CurrentStep;
    }

    /**
     * Get Current step progress. 
     * @return CurrentStepProgress Current step progress.
     */
    public Long getCurrentStepProgress() {
        return this.CurrentStepProgress;
    }

    /**
     * Set Current step progress.
     * @param CurrentStepProgress Current step progress.
     */
    public void setCurrentStepProgress(Long CurrentStepProgress) {
        this.CurrentStepProgress = CurrentStepProgress;
    }

    /**
     * Get Remaining time of the current step. 
     * @return CurrentStepRemainingTime Remaining time of the current step.
     */
    public String getCurrentStepRemainingTime() {
        return this.CurrentStepRemainingTime;
    }

    /**
     * Set Remaining time of the current step.
     * @param CurrentStepRemainingTime Remaining time of the current step.
     */
    public void setCurrentStepRemainingTime(String CurrentStepRemainingTime) {
        this.CurrentStepRemainingTime = CurrentStepRemainingTime;
    }

    public RollbackProcessInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RollbackProcessInfo(RollbackProcessInfo source) {
        if (source.IsVipSwitchable != null) {
            this.IsVipSwitchable = new Boolean(source.IsVipSwitchable);
        }
        if (source.VipSwitchableTime != null) {
            this.VipSwitchableTime = new String(source.VipSwitchableTime);
        }
        if (source.ExchangeInstanceInfoList != null) {
            this.ExchangeInstanceInfoList = new ExchangeInstanceInfo[source.ExchangeInstanceInfoList.length];
            for (int i = 0; i < source.ExchangeInstanceInfoList.length; i++) {
                this.ExchangeInstanceInfoList[i] = new ExchangeInstanceInfo(source.ExchangeInstanceInfoList[i]);
            }
        }
        if (source.ExchangeRoGroupInfoList != null) {
            this.ExchangeRoGroupInfoList = new ExchangeRoGroupInfo[source.ExchangeRoGroupInfoList.length];
            for (int i = 0; i < source.ExchangeRoGroupInfoList.length; i++) {
                this.ExchangeRoGroupInfoList[i] = new ExchangeRoGroupInfo(source.ExchangeRoGroupInfoList[i]);
            }
        }
        if (source.CurrentStep != null) {
            this.CurrentStep = new String(source.CurrentStep);
        }
        if (source.CurrentStepProgress != null) {
            this.CurrentStepProgress = new Long(source.CurrentStepProgress);
        }
        if (source.CurrentStepRemainingTime != null) {
            this.CurrentStepRemainingTime = new String(source.CurrentStepRemainingTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsVipSwitchable", this.IsVipSwitchable);
        this.setParamSimple(map, prefix + "VipSwitchableTime", this.VipSwitchableTime);
        this.setParamArrayObj(map, prefix + "ExchangeInstanceInfoList.", this.ExchangeInstanceInfoList);
        this.setParamArrayObj(map, prefix + "ExchangeRoGroupInfoList.", this.ExchangeRoGroupInfoList);
        this.setParamSimple(map, prefix + "CurrentStep", this.CurrentStep);
        this.setParamSimple(map, prefix + "CurrentStepProgress", this.CurrentStepProgress);
        this.setParamSimple(map, prefix + "CurrentStepRemainingTime", this.CurrentStepRemainingTime);

    }
}

