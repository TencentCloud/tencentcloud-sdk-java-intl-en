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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DspmApproverStep extends AbstractModel {

    /**
    * List of approvers
    */
    @SerializedName("ApproverUinSet")
    @Expose
    private DspmUinUser [] ApproverUinSet;

    /**
    * Approver
    */
    @SerializedName("ApproverUin")
    @Expose
    private String ApproverUin;

    /**
    * Approval status. 0: Pending approval; 1: Approved; 2: Rejected
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Approval comments
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * Approval time.
    */
    @SerializedName("ApproveTime")
    @Expose
    private String ApproveTime;

    /**
     * Get List of approvers 
     * @return ApproverUinSet List of approvers
     */
    public DspmUinUser [] getApproverUinSet() {
        return this.ApproverUinSet;
    }

    /**
     * Set List of approvers
     * @param ApproverUinSet List of approvers
     */
    public void setApproverUinSet(DspmUinUser [] ApproverUinSet) {
        this.ApproverUinSet = ApproverUinSet;
    }

    /**
     * Get Approver 
     * @return ApproverUin Approver
     */
    public String getApproverUin() {
        return this.ApproverUin;
    }

    /**
     * Set Approver
     * @param ApproverUin Approver
     */
    public void setApproverUin(String ApproverUin) {
        this.ApproverUin = ApproverUin;
    }

    /**
     * Get Approval status. 0: Pending approval; 1: Approved; 2: Rejected 
     * @return Status Approval status. 0: Pending approval; 1: Approved; 2: Rejected
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Approval status. 0: Pending approval; 1: Approved; 2: Rejected
     * @param Status Approval status. 0: Pending approval; 1: Approved; 2: Rejected
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Approval comments 
     * @return Comment Approval comments
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set Approval comments
     * @param Comment Approval comments
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get Approval time. 
     * @return ApproveTime Approval time.
     */
    public String getApproveTime() {
        return this.ApproveTime;
    }

    /**
     * Set Approval time.
     * @param ApproveTime Approval time.
     */
    public void setApproveTime(String ApproveTime) {
        this.ApproveTime = ApproveTime;
    }

    public DspmApproverStep() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmApproverStep(DspmApproverStep source) {
        if (source.ApproverUinSet != null) {
            this.ApproverUinSet = new DspmUinUser[source.ApproverUinSet.length];
            for (int i = 0; i < source.ApproverUinSet.length; i++) {
                this.ApproverUinSet[i] = new DspmUinUser(source.ApproverUinSet[i]);
            }
        }
        if (source.ApproverUin != null) {
            this.ApproverUin = new String(source.ApproverUin);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.ApproveTime != null) {
            this.ApproveTime = new String(source.ApproveTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ApproverUinSet.", this.ApproverUinSet);
        this.setParamSimple(map, prefix + "ApproverUin", this.ApproverUin);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "ApproveTime", this.ApproveTime);

    }
}

