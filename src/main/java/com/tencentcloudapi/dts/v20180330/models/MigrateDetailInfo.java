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
package com.tencentcloudapi.dts.v20180330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MigrateDetailInfo extends AbstractModel {

    /**
    * Total number of steps
    */
    @SerializedName("StepAll")
    @Expose
    private Long StepAll;

    /**
    * Current step
    */
    @SerializedName("StepNow")
    @Expose
    private Long StepNow;

    /**
    * Overall progress, such as "10"
    */
    @SerializedName("Progress")
    @Expose
    private String Progress;

    /**
    * Progress of current step, such as "1"
    */
    @SerializedName("CurrentStepProgress")
    @Expose
    private String CurrentStepProgress;

    /**
    * Master/slave lag in MB, which is valid during incremental sync and currently supported by TencentDB for Redis and MySQL
    */
    @SerializedName("MasterSlaveDistance")
    @Expose
    private Long MasterSlaveDistance;

    /**
    * Master/slave lag in seconds, which is valid during incremental sync and currently supported by TencentDB for MySQL
    */
    @SerializedName("SecondsBehindMaster")
    @Expose
    private Long SecondsBehindMaster;

    /**
    * Step information
    */
    @SerializedName("StepInfo")
    @Expose
    private MigrateStepDetailInfo [] StepInfo;

    /**
     * Get Total number of steps 
     * @return StepAll Total number of steps
     */
    public Long getStepAll() {
        return this.StepAll;
    }

    /**
     * Set Total number of steps
     * @param StepAll Total number of steps
     */
    public void setStepAll(Long StepAll) {
        this.StepAll = StepAll;
    }

    /**
     * Get Current step 
     * @return StepNow Current step
     */
    public Long getStepNow() {
        return this.StepNow;
    }

    /**
     * Set Current step
     * @param StepNow Current step
     */
    public void setStepNow(Long StepNow) {
        this.StepNow = StepNow;
    }

    /**
     * Get Overall progress, such as "10" 
     * @return Progress Overall progress, such as "10"
     */
    public String getProgress() {
        return this.Progress;
    }

    /**
     * Set Overall progress, such as "10"
     * @param Progress Overall progress, such as "10"
     */
    public void setProgress(String Progress) {
        this.Progress = Progress;
    }

    /**
     * Get Progress of current step, such as "1" 
     * @return CurrentStepProgress Progress of current step, such as "1"
     */
    public String getCurrentStepProgress() {
        return this.CurrentStepProgress;
    }

    /**
     * Set Progress of current step, such as "1"
     * @param CurrentStepProgress Progress of current step, such as "1"
     */
    public void setCurrentStepProgress(String CurrentStepProgress) {
        this.CurrentStepProgress = CurrentStepProgress;
    }

    /**
     * Get Master/slave lag in MB, which is valid during incremental sync and currently supported by TencentDB for Redis and MySQL 
     * @return MasterSlaveDistance Master/slave lag in MB, which is valid during incremental sync and currently supported by TencentDB for Redis and MySQL
     */
    public Long getMasterSlaveDistance() {
        return this.MasterSlaveDistance;
    }

    /**
     * Set Master/slave lag in MB, which is valid during incremental sync and currently supported by TencentDB for Redis and MySQL
     * @param MasterSlaveDistance Master/slave lag in MB, which is valid during incremental sync and currently supported by TencentDB for Redis and MySQL
     */
    public void setMasterSlaveDistance(Long MasterSlaveDistance) {
        this.MasterSlaveDistance = MasterSlaveDistance;
    }

    /**
     * Get Master/slave lag in seconds, which is valid during incremental sync and currently supported by TencentDB for MySQL 
     * @return SecondsBehindMaster Master/slave lag in seconds, which is valid during incremental sync and currently supported by TencentDB for MySQL
     */
    public Long getSecondsBehindMaster() {
        return this.SecondsBehindMaster;
    }

    /**
     * Set Master/slave lag in seconds, which is valid during incremental sync and currently supported by TencentDB for MySQL
     * @param SecondsBehindMaster Master/slave lag in seconds, which is valid during incremental sync and currently supported by TencentDB for MySQL
     */
    public void setSecondsBehindMaster(Long SecondsBehindMaster) {
        this.SecondsBehindMaster = SecondsBehindMaster;
    }

    /**
     * Get Step information 
     * @return StepInfo Step information
     */
    public MigrateStepDetailInfo [] getStepInfo() {
        return this.StepInfo;
    }

    /**
     * Set Step information
     * @param StepInfo Step information
     */
    public void setStepInfo(MigrateStepDetailInfo [] StepInfo) {
        this.StepInfo = StepInfo;
    }

    public MigrateDetailInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MigrateDetailInfo(MigrateDetailInfo source) {
        if (source.StepAll != null) {
            this.StepAll = new Long(source.StepAll);
        }
        if (source.StepNow != null) {
            this.StepNow = new Long(source.StepNow);
        }
        if (source.Progress != null) {
            this.Progress = new String(source.Progress);
        }
        if (source.CurrentStepProgress != null) {
            this.CurrentStepProgress = new String(source.CurrentStepProgress);
        }
        if (source.MasterSlaveDistance != null) {
            this.MasterSlaveDistance = new Long(source.MasterSlaveDistance);
        }
        if (source.SecondsBehindMaster != null) {
            this.SecondsBehindMaster = new Long(source.SecondsBehindMaster);
        }
        if (source.StepInfo != null) {
            this.StepInfo = new MigrateStepDetailInfo[source.StepInfo.length];
            for (int i = 0; i < source.StepInfo.length; i++) {
                this.StepInfo[i] = new MigrateStepDetailInfo(source.StepInfo[i]);
            }
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
        this.setParamArrayObj(map, prefix + "StepInfo.", this.StepInfo);

    }
}

