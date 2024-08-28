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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProductStatusInfo extends AbstractModel {

    /**
    * Protection status. 1: unprotected; 2: protecting; 3: in trial; 4 expired
    */
    @SerializedName("FWUserStatus")
    @Expose
    private Long FWUserStatus;

    /**
    * Whether application for trial is available. True indicates yes.
    */
    @SerializedName("CanApplyTrial")
    @Expose
    private Boolean CanApplyTrial;

    /**
    * Reason for unavailable trial (Leave it blank if the trial is available.)
    */
    @SerializedName("CanNotApplyReason")
    @Expose
    private String CanNotApplyReason;

    /**
    * Last trial end time (Leave it blank if no trial record exists.)
    */
    @SerializedName("LastTrialTime")
    @Expose
    private String LastTrialTime;

    /**
     * Get Protection status. 1: unprotected; 2: protecting; 3: in trial; 4 expired 
     * @return FWUserStatus Protection status. 1: unprotected; 2: protecting; 3: in trial; 4 expired
     */
    public Long getFWUserStatus() {
        return this.FWUserStatus;
    }

    /**
     * Set Protection status. 1: unprotected; 2: protecting; 3: in trial; 4 expired
     * @param FWUserStatus Protection status. 1: unprotected; 2: protecting; 3: in trial; 4 expired
     */
    public void setFWUserStatus(Long FWUserStatus) {
        this.FWUserStatus = FWUserStatus;
    }

    /**
     * Get Whether application for trial is available. True indicates yes. 
     * @return CanApplyTrial Whether application for trial is available. True indicates yes.
     */
    public Boolean getCanApplyTrial() {
        return this.CanApplyTrial;
    }

    /**
     * Set Whether application for trial is available. True indicates yes.
     * @param CanApplyTrial Whether application for trial is available. True indicates yes.
     */
    public void setCanApplyTrial(Boolean CanApplyTrial) {
        this.CanApplyTrial = CanApplyTrial;
    }

    /**
     * Get Reason for unavailable trial (Leave it blank if the trial is available.) 
     * @return CanNotApplyReason Reason for unavailable trial (Leave it blank if the trial is available.)
     */
    public String getCanNotApplyReason() {
        return this.CanNotApplyReason;
    }

    /**
     * Set Reason for unavailable trial (Leave it blank if the trial is available.)
     * @param CanNotApplyReason Reason for unavailable trial (Leave it blank if the trial is available.)
     */
    public void setCanNotApplyReason(String CanNotApplyReason) {
        this.CanNotApplyReason = CanNotApplyReason;
    }

    /**
     * Get Last trial end time (Leave it blank if no trial record exists.) 
     * @return LastTrialTime Last trial end time (Leave it blank if no trial record exists.)
     */
    public String getLastTrialTime() {
        return this.LastTrialTime;
    }

    /**
     * Set Last trial end time (Leave it blank if no trial record exists.)
     * @param LastTrialTime Last trial end time (Leave it blank if no trial record exists.)
     */
    public void setLastTrialTime(String LastTrialTime) {
        this.LastTrialTime = LastTrialTime;
    }

    public ProductStatusInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProductStatusInfo(ProductStatusInfo source) {
        if (source.FWUserStatus != null) {
            this.FWUserStatus = new Long(source.FWUserStatus);
        }
        if (source.CanApplyTrial != null) {
            this.CanApplyTrial = new Boolean(source.CanApplyTrial);
        }
        if (source.CanNotApplyReason != null) {
            this.CanNotApplyReason = new String(source.CanNotApplyReason);
        }
        if (source.LastTrialTime != null) {
            this.LastTrialTime = new String(source.LastTrialTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FWUserStatus", this.FWUserStatus);
        this.setParamSimple(map, prefix + "CanApplyTrial", this.CanApplyTrial);
        this.setParamSimple(map, prefix + "CanNotApplyReason", this.CanNotApplyReason);
        this.setParamSimple(map, prefix + "LastTrialTime", this.LastTrialTime);

    }
}

