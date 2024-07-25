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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SyncDetailInfo extends AbstractModel {

    /**
    * Total number of steps
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StepAll")
    @Expose
    private Long StepAll;

    /**
    * Current step
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StepNow")
    @Expose
    private Long StepNow;

    /**
    * Overall progress
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * Progress of the current step. Value range: 0-100. The value of `-1` indicates that you can't check the progress of the current step.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CurrentStepProgress")
    @Expose
    private Long CurrentStepProgress;

    /**
    * Data volume difference between the sync source and target
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MasterSlaveDistance")
    @Expose
    private Long MasterSlaveDistance;

    /**
    * Time difference between the sync source and target
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SecondsBehindMaster")
    @Expose
    private Long SecondsBehindMaster;

    /**
    * Overall description
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * Step details
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StepInfos")
    @Expose
    private StepInfo [] StepInfos;

    /**
    * Cause of the failure of initiating data consistency check
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CauseOfCompareDisable")
    @Expose
    private String CauseOfCompareDisable;

    /**
    * Task error and the corresponding solution
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ErrInfo")
    @Expose
    private ErrInfo ErrInfo;

    /**
     * Get Total number of steps
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StepAll Total number of steps
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStepAll() {
        return this.StepAll;
    }

    /**
     * Set Total number of steps
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StepAll Total number of steps
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStepAll(Long StepAll) {
        this.StepAll = StepAll;
    }

    /**
     * Get Current step
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StepNow Current step
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStepNow() {
        return this.StepNow;
    }

    /**
     * Set Current step
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StepNow Current step
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStepNow(Long StepNow) {
        this.StepNow = StepNow;
    }

    /**
     * Get Overall progress
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Progress Overall progress
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set Overall progress
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Progress Overall progress
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get Progress of the current step. Value range: 0-100. The value of `-1` indicates that you can't check the progress of the current step.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CurrentStepProgress Progress of the current step. Value range: 0-100. The value of `-1` indicates that you can't check the progress of the current step.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCurrentStepProgress() {
        return this.CurrentStepProgress;
    }

    /**
     * Set Progress of the current step. Value range: 0-100. The value of `-1` indicates that you can't check the progress of the current step.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CurrentStepProgress Progress of the current step. Value range: 0-100. The value of `-1` indicates that you can't check the progress of the current step.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCurrentStepProgress(Long CurrentStepProgress) {
        this.CurrentStepProgress = CurrentStepProgress;
    }

    /**
     * Get Data volume difference between the sync source and target
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MasterSlaveDistance Data volume difference between the sync source and target
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMasterSlaveDistance() {
        return this.MasterSlaveDistance;
    }

    /**
     * Set Data volume difference between the sync source and target
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MasterSlaveDistance Data volume difference between the sync source and target
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMasterSlaveDistance(Long MasterSlaveDistance) {
        this.MasterSlaveDistance = MasterSlaveDistance;
    }

    /**
     * Get Time difference between the sync source and target
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SecondsBehindMaster Time difference between the sync source and target
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getSecondsBehindMaster() {
        return this.SecondsBehindMaster;
    }

    /**
     * Set Time difference between the sync source and target
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SecondsBehindMaster Time difference between the sync source and target
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSecondsBehindMaster(Long SecondsBehindMaster) {
        this.SecondsBehindMaster = SecondsBehindMaster;
    }

    /**
     * Get Overall description
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Message Overall description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Overall description
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Message Overall description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get Step details
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StepInfos Step details
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public StepInfo [] getStepInfos() {
        return this.StepInfos;
    }

    /**
     * Set Step details
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StepInfos Step details
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStepInfos(StepInfo [] StepInfos) {
        this.StepInfos = StepInfos;
    }

    /**
     * Get Cause of the failure of initiating data consistency check
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CauseOfCompareDisable Cause of the failure of initiating data consistency check
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCauseOfCompareDisable() {
        return this.CauseOfCompareDisable;
    }

    /**
     * Set Cause of the failure of initiating data consistency check
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CauseOfCompareDisable Cause of the failure of initiating data consistency check
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCauseOfCompareDisable(String CauseOfCompareDisable) {
        this.CauseOfCompareDisable = CauseOfCompareDisable;
    }

    /**
     * Get Task error and the corresponding solution
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ErrInfo Task error and the corresponding solution
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ErrInfo getErrInfo() {
        return this.ErrInfo;
    }

    /**
     * Set Task error and the corresponding solution
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ErrInfo Task error and the corresponding solution
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setErrInfo(ErrInfo ErrInfo) {
        this.ErrInfo = ErrInfo;
    }

    public SyncDetailInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SyncDetailInfo(SyncDetailInfo source) {
        if (source.StepAll != null) {
            this.StepAll = new Long(source.StepAll);
        }
        if (source.StepNow != null) {
            this.StepNow = new Long(source.StepNow);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
        if (source.CurrentStepProgress != null) {
            this.CurrentStepProgress = new Long(source.CurrentStepProgress);
        }
        if (source.MasterSlaveDistance != null) {
            this.MasterSlaveDistance = new Long(source.MasterSlaveDistance);
        }
        if (source.SecondsBehindMaster != null) {
            this.SecondsBehindMaster = new Long(source.SecondsBehindMaster);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.StepInfos != null) {
            this.StepInfos = new StepInfo[source.StepInfos.length];
            for (int i = 0; i < source.StepInfos.length; i++) {
                this.StepInfos[i] = new StepInfo(source.StepInfos[i]);
            }
        }
        if (source.CauseOfCompareDisable != null) {
            this.CauseOfCompareDisable = new String(source.CauseOfCompareDisable);
        }
        if (source.ErrInfo != null) {
            this.ErrInfo = new ErrInfo(source.ErrInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StepAll", this.StepAll);
        this.setParamSimple(map, prefix + "StepNow", this.StepNow);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "CurrentStepProgress", this.CurrentStepProgress);
        this.setParamSimple(map, prefix + "MasterSlaveDistance", this.MasterSlaveDistance);
        this.setParamSimple(map, prefix + "SecondsBehindMaster", this.SecondsBehindMaster);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamArrayObj(map, prefix + "StepInfos.", this.StepInfos);
        this.setParamSimple(map, prefix + "CauseOfCompareDisable", this.CauseOfCompareDisable);
        this.setParamObj(map, prefix + "ErrInfo.", this.ErrInfo);

    }
}

