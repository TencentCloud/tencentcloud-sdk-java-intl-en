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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AlarmRuleDetail extends AbstractModel {

    /**
    * Failure Trigger Condition

1: Trigger on the first failure

2: Trigger after all retries are completed (default)
    */
    @SerializedName("Trigger")
    @Expose
    private Long Trigger;

    /**
    * Backfill/Rerun Trigger Condition

1: Trigger on the first failure

2: Trigger after all retries are completed
    */
    @SerializedName("DataBackfillOrRerunTrigger")
    @Expose
    private Long DataBackfillOrRerunTrigger;

    /**
    * Timeout configuration of the periodic instance.

    */
    @SerializedName("TimeOutExtInfo")
    @Expose
    private TimeOutStrategyInfo [] TimeOutExtInfo;

    /**
    * Specifies the timeout configuration details for rerunning a backfill instance.

    */
    @SerializedName("DataBackfillOrRerunTimeOutExtInfo")
    @Expose
    private TimeOutStrategyInfo [] DataBackfillOrRerunTimeOutExtInfo;

    /**
    * Specifies the detail of Alarm configuration for project fluctuation.
    */
    @SerializedName("ProjectInstanceStatisticsAlarmInfoList")
    @Expose
    private ProjectInstanceStatisticsAlarmInfo [] ProjectInstanceStatisticsAlarmInfoList;

    /**
    * Describes the Alarm configuration information for offline integration reconciliation.
    */
    @SerializedName("ReconciliationExtInfo")
    @Expose
    private ReconciliationStrategyInfo [] ReconciliationExtInfo;

    /**
     * Get Failure Trigger Condition

1: Trigger on the first failure

2: Trigger after all retries are completed (default) 
     * @return Trigger Failure Trigger Condition

1: Trigger on the first failure

2: Trigger after all retries are completed (default)
     */
    public Long getTrigger() {
        return this.Trigger;
    }

    /**
     * Set Failure Trigger Condition

1: Trigger on the first failure

2: Trigger after all retries are completed (default)
     * @param Trigger Failure Trigger Condition

1: Trigger on the first failure

2: Trigger after all retries are completed (default)
     */
    public void setTrigger(Long Trigger) {
        this.Trigger = Trigger;
    }

    /**
     * Get Backfill/Rerun Trigger Condition

1: Trigger on the first failure

2: Trigger after all retries are completed 
     * @return DataBackfillOrRerunTrigger Backfill/Rerun Trigger Condition

1: Trigger on the first failure

2: Trigger after all retries are completed
     */
    public Long getDataBackfillOrRerunTrigger() {
        return this.DataBackfillOrRerunTrigger;
    }

    /**
     * Set Backfill/Rerun Trigger Condition

1: Trigger on the first failure

2: Trigger after all retries are completed
     * @param DataBackfillOrRerunTrigger Backfill/Rerun Trigger Condition

1: Trigger on the first failure

2: Trigger after all retries are completed
     */
    public void setDataBackfillOrRerunTrigger(Long DataBackfillOrRerunTrigger) {
        this.DataBackfillOrRerunTrigger = DataBackfillOrRerunTrigger;
    }

    /**
     * Get Timeout configuration of the periodic instance.
 
     * @return TimeOutExtInfo Timeout configuration of the periodic instance.

     */
    public TimeOutStrategyInfo [] getTimeOutExtInfo() {
        return this.TimeOutExtInfo;
    }

    /**
     * Set Timeout configuration of the periodic instance.

     * @param TimeOutExtInfo Timeout configuration of the periodic instance.

     */
    public void setTimeOutExtInfo(TimeOutStrategyInfo [] TimeOutExtInfo) {
        this.TimeOutExtInfo = TimeOutExtInfo;
    }

    /**
     * Get Specifies the timeout configuration details for rerunning a backfill instance.
 
     * @return DataBackfillOrRerunTimeOutExtInfo Specifies the timeout configuration details for rerunning a backfill instance.

     */
    public TimeOutStrategyInfo [] getDataBackfillOrRerunTimeOutExtInfo() {
        return this.DataBackfillOrRerunTimeOutExtInfo;
    }

    /**
     * Set Specifies the timeout configuration details for rerunning a backfill instance.

     * @param DataBackfillOrRerunTimeOutExtInfo Specifies the timeout configuration details for rerunning a backfill instance.

     */
    public void setDataBackfillOrRerunTimeOutExtInfo(TimeOutStrategyInfo [] DataBackfillOrRerunTimeOutExtInfo) {
        this.DataBackfillOrRerunTimeOutExtInfo = DataBackfillOrRerunTimeOutExtInfo;
    }

    /**
     * Get Specifies the detail of Alarm configuration for project fluctuation. 
     * @return ProjectInstanceStatisticsAlarmInfoList Specifies the detail of Alarm configuration for project fluctuation.
     */
    public ProjectInstanceStatisticsAlarmInfo [] getProjectInstanceStatisticsAlarmInfoList() {
        return this.ProjectInstanceStatisticsAlarmInfoList;
    }

    /**
     * Set Specifies the detail of Alarm configuration for project fluctuation.
     * @param ProjectInstanceStatisticsAlarmInfoList Specifies the detail of Alarm configuration for project fluctuation.
     */
    public void setProjectInstanceStatisticsAlarmInfoList(ProjectInstanceStatisticsAlarmInfo [] ProjectInstanceStatisticsAlarmInfoList) {
        this.ProjectInstanceStatisticsAlarmInfoList = ProjectInstanceStatisticsAlarmInfoList;
    }

    /**
     * Get Describes the Alarm configuration information for offline integration reconciliation. 
     * @return ReconciliationExtInfo Describes the Alarm configuration information for offline integration reconciliation.
     */
    public ReconciliationStrategyInfo [] getReconciliationExtInfo() {
        return this.ReconciliationExtInfo;
    }

    /**
     * Set Describes the Alarm configuration information for offline integration reconciliation.
     * @param ReconciliationExtInfo Describes the Alarm configuration information for offline integration reconciliation.
     */
    public void setReconciliationExtInfo(ReconciliationStrategyInfo [] ReconciliationExtInfo) {
        this.ReconciliationExtInfo = ReconciliationExtInfo;
    }

    public AlarmRuleDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlarmRuleDetail(AlarmRuleDetail source) {
        if (source.Trigger != null) {
            this.Trigger = new Long(source.Trigger);
        }
        if (source.DataBackfillOrRerunTrigger != null) {
            this.DataBackfillOrRerunTrigger = new Long(source.DataBackfillOrRerunTrigger);
        }
        if (source.TimeOutExtInfo != null) {
            this.TimeOutExtInfo = new TimeOutStrategyInfo[source.TimeOutExtInfo.length];
            for (int i = 0; i < source.TimeOutExtInfo.length; i++) {
                this.TimeOutExtInfo[i] = new TimeOutStrategyInfo(source.TimeOutExtInfo[i]);
            }
        }
        if (source.DataBackfillOrRerunTimeOutExtInfo != null) {
            this.DataBackfillOrRerunTimeOutExtInfo = new TimeOutStrategyInfo[source.DataBackfillOrRerunTimeOutExtInfo.length];
            for (int i = 0; i < source.DataBackfillOrRerunTimeOutExtInfo.length; i++) {
                this.DataBackfillOrRerunTimeOutExtInfo[i] = new TimeOutStrategyInfo(source.DataBackfillOrRerunTimeOutExtInfo[i]);
            }
        }
        if (source.ProjectInstanceStatisticsAlarmInfoList != null) {
            this.ProjectInstanceStatisticsAlarmInfoList = new ProjectInstanceStatisticsAlarmInfo[source.ProjectInstanceStatisticsAlarmInfoList.length];
            for (int i = 0; i < source.ProjectInstanceStatisticsAlarmInfoList.length; i++) {
                this.ProjectInstanceStatisticsAlarmInfoList[i] = new ProjectInstanceStatisticsAlarmInfo(source.ProjectInstanceStatisticsAlarmInfoList[i]);
            }
        }
        if (source.ReconciliationExtInfo != null) {
            this.ReconciliationExtInfo = new ReconciliationStrategyInfo[source.ReconciliationExtInfo.length];
            for (int i = 0; i < source.ReconciliationExtInfo.length; i++) {
                this.ReconciliationExtInfo[i] = new ReconciliationStrategyInfo(source.ReconciliationExtInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Trigger", this.Trigger);
        this.setParamSimple(map, prefix + "DataBackfillOrRerunTrigger", this.DataBackfillOrRerunTrigger);
        this.setParamArrayObj(map, prefix + "TimeOutExtInfo.", this.TimeOutExtInfo);
        this.setParamArrayObj(map, prefix + "DataBackfillOrRerunTimeOutExtInfo.", this.DataBackfillOrRerunTimeOutExtInfo);
        this.setParamArrayObj(map, prefix + "ProjectInstanceStatisticsAlarmInfoList.", this.ProjectInstanceStatisticsAlarmInfoList);
        this.setParamArrayObj(map, prefix + "ReconciliationExtInfo.", this.ReconciliationExtInfo);

    }
}

