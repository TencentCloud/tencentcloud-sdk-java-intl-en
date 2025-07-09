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

public class RejectedQuestion extends AbstractModel {

    /**
    * Reject question ID.
    */
    @SerializedName("RejectedBizId")
    @Expose
    private String RejectedBizId;

    /**
    * The question that has been rejected.
    */
    @SerializedName("Question")
    @Expose
    private String Question;

    /**
    * Status.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Status description.
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * Update time.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Whether editing is allowed.
    */
    @SerializedName("IsAllowEdit")
    @Expose
    private Boolean IsAllowEdit;

    /**
    * Whether deletion is allowed.
    */
    @SerializedName("IsAllowDelete")
    @Expose
    private Boolean IsAllowDelete;

    /**
     * Get Reject question ID. 
     * @return RejectedBizId Reject question ID.
     */
    public String getRejectedBizId() {
        return this.RejectedBizId;
    }

    /**
     * Set Reject question ID.
     * @param RejectedBizId Reject question ID.
     */
    public void setRejectedBizId(String RejectedBizId) {
        this.RejectedBizId = RejectedBizId;
    }

    /**
     * Get The question that has been rejected. 
     * @return Question The question that has been rejected.
     */
    public String getQuestion() {
        return this.Question;
    }

    /**
     * Set The question that has been rejected.
     * @param Question The question that has been rejected.
     */
    public void setQuestion(String Question) {
        this.Question = Question;
    }

    /**
     * Get Status. 
     * @return Status Status.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status.
     * @param Status Status.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Status description. 
     * @return StatusDesc Status description.
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set Status description.
     * @param StatusDesc Status description.
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
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
     * Get Whether editing is allowed. 
     * @return IsAllowEdit Whether editing is allowed.
     */
    public Boolean getIsAllowEdit() {
        return this.IsAllowEdit;
    }

    /**
     * Set Whether editing is allowed.
     * @param IsAllowEdit Whether editing is allowed.
     */
    public void setIsAllowEdit(Boolean IsAllowEdit) {
        this.IsAllowEdit = IsAllowEdit;
    }

    /**
     * Get Whether deletion is allowed. 
     * @return IsAllowDelete Whether deletion is allowed.
     */
    public Boolean getIsAllowDelete() {
        return this.IsAllowDelete;
    }

    /**
     * Set Whether deletion is allowed.
     * @param IsAllowDelete Whether deletion is allowed.
     */
    public void setIsAllowDelete(Boolean IsAllowDelete) {
        this.IsAllowDelete = IsAllowDelete;
    }

    public RejectedQuestion() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RejectedQuestion(RejectedQuestion source) {
        if (source.RejectedBizId != null) {
            this.RejectedBizId = new String(source.RejectedBizId);
        }
        if (source.Question != null) {
            this.Question = new String(source.Question);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.StatusDesc != null) {
            this.StatusDesc = new String(source.StatusDesc);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.IsAllowEdit != null) {
            this.IsAllowEdit = new Boolean(source.IsAllowEdit);
        }
        if (source.IsAllowDelete != null) {
            this.IsAllowDelete = new Boolean(source.IsAllowDelete);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RejectedBizId", this.RejectedBizId);
        this.setParamSimple(map, prefix + "Question", this.Question);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusDesc", this.StatusDesc);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "IsAllowEdit", this.IsAllowEdit);
        this.setParamSimple(map, prefix + "IsAllowDelete", this.IsAllowDelete);

    }
}

