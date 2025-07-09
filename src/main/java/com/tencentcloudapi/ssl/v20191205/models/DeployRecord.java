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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeployRecord extends AbstractModel {

    /**
    * Total number.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Total successes
    */
    @SerializedName("SuccessTotalCount")
    @Expose
    private Long SuccessTotalCount;

    /**
    * Total failed deployments.
    */
    @SerializedName("FailedTotalCount")
    @Expose
    private Long FailedTotalCount;

    /**
    * Deployment in progress total number.
    */
    @SerializedName("RunningTotalCount")
    @Expose
    private Long RunningTotalCount;

    /**
    * Deployment record type 0 specifies deployment, 1 indicates rollback.
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Deployment record detail list.
    */
    @SerializedName("RecordDetailList")
    @Expose
    private DeployRecordList [] RecordDetailList;

    /**
    * Hosted resource deployment state: `0` (awaiting deployment), `1` (deployment successful), `2` (deployment failed), `3` (deploying), `4` (rollback successful), `5` (rollback failure).
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Managed resource creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get Total number. 
     * @return TotalCount Total number.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number.
     * @param TotalCount Total number.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Total successes 
     * @return SuccessTotalCount Total successes
     */
    public Long getSuccessTotalCount() {
        return this.SuccessTotalCount;
    }

    /**
     * Set Total successes
     * @param SuccessTotalCount Total successes
     */
    public void setSuccessTotalCount(Long SuccessTotalCount) {
        this.SuccessTotalCount = SuccessTotalCount;
    }

    /**
     * Get Total failed deployments. 
     * @return FailedTotalCount Total failed deployments.
     */
    public Long getFailedTotalCount() {
        return this.FailedTotalCount;
    }

    /**
     * Set Total failed deployments.
     * @param FailedTotalCount Total failed deployments.
     */
    public void setFailedTotalCount(Long FailedTotalCount) {
        this.FailedTotalCount = FailedTotalCount;
    }

    /**
     * Get Deployment in progress total number. 
     * @return RunningTotalCount Deployment in progress total number.
     */
    public Long getRunningTotalCount() {
        return this.RunningTotalCount;
    }

    /**
     * Set Deployment in progress total number.
     * @param RunningTotalCount Deployment in progress total number.
     */
    public void setRunningTotalCount(Long RunningTotalCount) {
        this.RunningTotalCount = RunningTotalCount;
    }

    /**
     * Get Deployment record type 0 specifies deployment, 1 indicates rollback. 
     * @return Type Deployment record type 0 specifies deployment, 1 indicates rollback.
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Deployment record type 0 specifies deployment, 1 indicates rollback.
     * @param Type Deployment record type 0 specifies deployment, 1 indicates rollback.
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Deployment record detail list. 
     * @return RecordDetailList Deployment record detail list.
     */
    public DeployRecordList [] getRecordDetailList() {
        return this.RecordDetailList;
    }

    /**
     * Set Deployment record detail list.
     * @param RecordDetailList Deployment record detail list.
     */
    public void setRecordDetailList(DeployRecordList [] RecordDetailList) {
        this.RecordDetailList = RecordDetailList;
    }

    /**
     * Get Hosted resource deployment state: `0` (awaiting deployment), `1` (deployment successful), `2` (deployment failed), `3` (deploying), `4` (rollback successful), `5` (rollback failure). 
     * @return Status Hosted resource deployment state: `0` (awaiting deployment), `1` (deployment successful), `2` (deployment failed), `3` (deploying), `4` (rollback successful), `5` (rollback failure).
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Hosted resource deployment state: `0` (awaiting deployment), `1` (deployment successful), `2` (deployment failed), `3` (deploying), `4` (rollback successful), `5` (rollback failure).
     * @param Status Hosted resource deployment state: `0` (awaiting deployment), `1` (deployment successful), `2` (deployment failed), `3` (deploying), `4` (rollback successful), `5` (rollback failure).
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Managed resource creation time. 
     * @return CreateTime Managed resource creation time.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Managed resource creation time.
     * @param CreateTime Managed resource creation time.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public DeployRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeployRecord(DeployRecord source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.SuccessTotalCount != null) {
            this.SuccessTotalCount = new Long(source.SuccessTotalCount);
        }
        if (source.FailedTotalCount != null) {
            this.FailedTotalCount = new Long(source.FailedTotalCount);
        }
        if (source.RunningTotalCount != null) {
            this.RunningTotalCount = new Long(source.RunningTotalCount);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.RecordDetailList != null) {
            this.RecordDetailList = new DeployRecordList[source.RecordDetailList.length];
            for (int i = 0; i < source.RecordDetailList.length; i++) {
                this.RecordDetailList[i] = new DeployRecordList(source.RecordDetailList[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "SuccessTotalCount", this.SuccessTotalCount);
        this.setParamSimple(map, prefix + "FailedTotalCount", this.FailedTotalCount);
        this.setParamSimple(map, prefix + "RunningTotalCount", this.RunningTotalCount);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "RecordDetailList.", this.RecordDetailList);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

