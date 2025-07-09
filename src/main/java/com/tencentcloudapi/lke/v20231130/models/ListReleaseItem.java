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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListReleaseItem extends AbstractModel {

    /**
    * Version ID.
    */
    @SerializedName("ReleaseBizId")
    @Expose
    private String ReleaseBizId;

    /**
    * Releaser.
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * Release description.
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * Update time.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Release status.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Release status description.
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * Reason for failure.
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * Number of successful releases.
    */
    @SerializedName("SuccessCount")
    @Expose
    private Long SuccessCount;

    /**
    * Number of failed releases.
    */
    @SerializedName("FailCount")
    @Expose
    private Long FailCount;

    /**
     * Get Version ID. 
     * @return ReleaseBizId Version ID.
     */
    public String getReleaseBizId() {
        return this.ReleaseBizId;
    }

    /**
     * Set Version ID.
     * @param ReleaseBizId Version ID.
     */
    public void setReleaseBizId(String ReleaseBizId) {
        this.ReleaseBizId = ReleaseBizId;
    }

    /**
     * Get Releaser. 
     * @return Operator Releaser.
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set Releaser.
     * @param Operator Releaser.
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get Release description. 
     * @return Desc Release description.
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set Release description.
     * @param Desc Release description.
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get Update time. 
     * @return UpdateTime Update time.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time.
     * @param UpdateTime Update time.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Release status. 
     * @return Status Release status.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Release status.
     * @param Status Release status.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Release status description. 
     * @return StatusDesc Release status description.
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set Release status description.
     * @param StatusDesc Release status description.
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * Get Reason for failure. 
     * @return Reason Reason for failure.
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set Reason for failure.
     * @param Reason Reason for failure.
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get Number of successful releases. 
     * @return SuccessCount Number of successful releases.
     */
    public Long getSuccessCount() {
        return this.SuccessCount;
    }

    /**
     * Set Number of successful releases.
     * @param SuccessCount Number of successful releases.
     */
    public void setSuccessCount(Long SuccessCount) {
        this.SuccessCount = SuccessCount;
    }

    /**
     * Get Number of failed releases. 
     * @return FailCount Number of failed releases.
     */
    public Long getFailCount() {
        return this.FailCount;
    }

    /**
     * Set Number of failed releases.
     * @param FailCount Number of failed releases.
     */
    public void setFailCount(Long FailCount) {
        this.FailCount = FailCount;
    }

    public ListReleaseItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListReleaseItem(ListReleaseItem source) {
        if (source.ReleaseBizId != null) {
            this.ReleaseBizId = new String(source.ReleaseBizId);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.StatusDesc != null) {
            this.StatusDesc = new String(source.StatusDesc);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.SuccessCount != null) {
            this.SuccessCount = new Long(source.SuccessCount);
        }
        if (source.FailCount != null) {
            this.FailCount = new Long(source.FailCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReleaseBizId", this.ReleaseBizId);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusDesc", this.StatusDesc);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "SuccessCount", this.SuccessCount);
        this.setParamSimple(map, prefix + "FailCount", this.FailCount);

    }
}

