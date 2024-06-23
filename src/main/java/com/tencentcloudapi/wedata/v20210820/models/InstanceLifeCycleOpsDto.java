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

public class InstanceLifeCycleOpsDto extends AbstractModel {

    /**
    * Task ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Data Timestamp
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CurRunDate")
    @Expose
    private String CurRunDate;

    /**
    * Instance Lifecycle Count
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("LifeRound")
    @Expose
    private Long LifeRound;

    /**
    * Run Type Rerun/Supplement/Periodic/Non-periodic
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("RunType")
    @Expose
    private String RunType;

    /**
    * Number of Reruns
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Tries")
    @Expose
    private Long Tries;

    /**
    * Instance LifecycleNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("InstanceLifeDetailDtoList")
    @Expose
    private InstanceLifeDetailDto [] InstanceLifeDetailDtoList;

    /**
    * Runner Status
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("RunnerState")
    @Expose
    private String RunnerState;

    /**
    * Error codeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ErrorDesc")
    @Expose
    private String ErrorDesc;

    /**
    * Error Alert Level
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ErrorCodeLevel")
    @Expose
    private String ErrorCodeLevel;

    /**
    * Instance Log Summary
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("InstanceLogListOpsDto")
    @Expose
    private InstanceLogInfo InstanceLogListOpsDto;

    /**
    * Instance StatusNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("InstanceState")
    @Expose
    private String InstanceState;

    /**
     * Get Task ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TaskId Task ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TaskId Task ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Data Timestamp
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return CurRunDate Data Timestamp
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getCurRunDate() {
        return this.CurRunDate;
    }

    /**
     * Set Data Timestamp
Note: This field may return null, indicating that no valid value can be obtained.
     * @param CurRunDate Data Timestamp
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCurRunDate(String CurRunDate) {
        this.CurRunDate = CurRunDate;
    }

    /**
     * Get Instance Lifecycle Count
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return LifeRound Instance Lifecycle Count
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getLifeRound() {
        return this.LifeRound;
    }

    /**
     * Set Instance Lifecycle Count
Note: This field may return null, indicating that no valid value can be obtained.
     * @param LifeRound Instance Lifecycle Count
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setLifeRound(Long LifeRound) {
        this.LifeRound = LifeRound;
    }

    /**
     * Get Run Type Rerun/Supplement/Periodic/Non-periodic
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return RunType Run Type Rerun/Supplement/Periodic/Non-periodic
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getRunType() {
        return this.RunType;
    }

    /**
     * Set Run Type Rerun/Supplement/Periodic/Non-periodic
Note: This field may return null, indicating that no valid value can be obtained.
     * @param RunType Run Type Rerun/Supplement/Periodic/Non-periodic
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRunType(String RunType) {
        this.RunType = RunType;
    }

    /**
     * Get Number of Reruns
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Tries Number of Reruns
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getTries() {
        return this.Tries;
    }

    /**
     * Set Number of Reruns
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Tries Number of Reruns
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTries(Long Tries) {
        this.Tries = Tries;
    }

    /**
     * Get Instance LifecycleNote: This field may return null, indicating that no valid value can be obtained. 
     * @return InstanceLifeDetailDtoList Instance LifecycleNote: This field may return null, indicating that no valid value can be obtained.
     */
    public InstanceLifeDetailDto [] getInstanceLifeDetailDtoList() {
        return this.InstanceLifeDetailDtoList;
    }

    /**
     * Set Instance LifecycleNote: This field may return null, indicating that no valid value can be obtained.
     * @param InstanceLifeDetailDtoList Instance LifecycleNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setInstanceLifeDetailDtoList(InstanceLifeDetailDto [] InstanceLifeDetailDtoList) {
        this.InstanceLifeDetailDtoList = InstanceLifeDetailDtoList;
    }

    /**
     * Get Runner Status
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return RunnerState Runner Status
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getRunnerState() {
        return this.RunnerState;
    }

    /**
     * Set Runner Status
Note: This field may return null, indicating that no valid value can be obtained.
     * @param RunnerState Runner Status
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRunnerState(String RunnerState) {
        this.RunnerState = RunnerState;
    }

    /**
     * Get Error codeNote: This field may return null, indicating that no valid value can be obtained. 
     * @return ErrorDesc Error codeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getErrorDesc() {
        return this.ErrorDesc;
    }

    /**
     * Set Error codeNote: This field may return null, indicating that no valid value can be obtained.
     * @param ErrorDesc Error codeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setErrorDesc(String ErrorDesc) {
        this.ErrorDesc = ErrorDesc;
    }

    /**
     * Get Error Alert Level
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ErrorCodeLevel Error Alert Level
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getErrorCodeLevel() {
        return this.ErrorCodeLevel;
    }

    /**
     * Set Error Alert Level
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ErrorCodeLevel Error Alert Level
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setErrorCodeLevel(String ErrorCodeLevel) {
        this.ErrorCodeLevel = ErrorCodeLevel;
    }

    /**
     * Get Instance Log Summary
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return InstanceLogListOpsDto Instance Log Summary
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public InstanceLogInfo getInstanceLogListOpsDto() {
        return this.InstanceLogListOpsDto;
    }

    /**
     * Set Instance Log Summary
Note: This field may return null, indicating that no valid value can be obtained.
     * @param InstanceLogListOpsDto Instance Log Summary
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setInstanceLogListOpsDto(InstanceLogInfo InstanceLogListOpsDto) {
        this.InstanceLogListOpsDto = InstanceLogListOpsDto;
    }

    /**
     * Get Instance StatusNote: This field may return null, indicating that no valid value can be obtained. 
     * @return InstanceState Instance StatusNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getInstanceState() {
        return this.InstanceState;
    }

    /**
     * Set Instance StatusNote: This field may return null, indicating that no valid value can be obtained.
     * @param InstanceState Instance StatusNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setInstanceState(String InstanceState) {
        this.InstanceState = InstanceState;
    }

    public InstanceLifeCycleOpsDto() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceLifeCycleOpsDto(InstanceLifeCycleOpsDto source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.CurRunDate != null) {
            this.CurRunDate = new String(source.CurRunDate);
        }
        if (source.LifeRound != null) {
            this.LifeRound = new Long(source.LifeRound);
        }
        if (source.RunType != null) {
            this.RunType = new String(source.RunType);
        }
        if (source.Tries != null) {
            this.Tries = new Long(source.Tries);
        }
        if (source.InstanceLifeDetailDtoList != null) {
            this.InstanceLifeDetailDtoList = new InstanceLifeDetailDto[source.InstanceLifeDetailDtoList.length];
            for (int i = 0; i < source.InstanceLifeDetailDtoList.length; i++) {
                this.InstanceLifeDetailDtoList[i] = new InstanceLifeDetailDto(source.InstanceLifeDetailDtoList[i]);
            }
        }
        if (source.RunnerState != null) {
            this.RunnerState = new String(source.RunnerState);
        }
        if (source.ErrorDesc != null) {
            this.ErrorDesc = new String(source.ErrorDesc);
        }
        if (source.ErrorCodeLevel != null) {
            this.ErrorCodeLevel = new String(source.ErrorCodeLevel);
        }
        if (source.InstanceLogListOpsDto != null) {
            this.InstanceLogListOpsDto = new InstanceLogInfo(source.InstanceLogListOpsDto);
        }
        if (source.InstanceState != null) {
            this.InstanceState = new String(source.InstanceState);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "CurRunDate", this.CurRunDate);
        this.setParamSimple(map, prefix + "LifeRound", this.LifeRound);
        this.setParamSimple(map, prefix + "RunType", this.RunType);
        this.setParamSimple(map, prefix + "Tries", this.Tries);
        this.setParamArrayObj(map, prefix + "InstanceLifeDetailDtoList.", this.InstanceLifeDetailDtoList);
        this.setParamSimple(map, prefix + "RunnerState", this.RunnerState);
        this.setParamSimple(map, prefix + "ErrorDesc", this.ErrorDesc);
        this.setParamSimple(map, prefix + "ErrorCodeLevel", this.ErrorCodeLevel);
        this.setParamObj(map, prefix + "InstanceLogListOpsDto.", this.InstanceLogListOpsDto);
        this.setParamSimple(map, prefix + "InstanceState", this.InstanceState);

    }
}

