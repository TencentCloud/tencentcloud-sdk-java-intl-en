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
package com.tencentcloudapi.tcmpp.v20240801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApprovalItem extends AbstractModel {

    /**
    * Application ID
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * Approval result. 2: Rejected;
3: Approved
    */
    @SerializedName("ApprovalResult")
    @Expose
    private Long ApprovalResult;

    /**
    * Approval notes. It’s required when the request is rejected. 
    */
    @SerializedName("ApprovalNote")
    @Expose
    private String ApprovalNote;

    /**
     * Get Application ID 
     * @return AppId Application ID
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set Application ID
     * @param AppId Application ID
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Approval result. 2: Rejected;
3: Approved 
     * @return ApprovalResult Approval result. 2: Rejected;
3: Approved
     */
    public Long getApprovalResult() {
        return this.ApprovalResult;
    }

    /**
     * Set Approval result. 2: Rejected;
3: Approved
     * @param ApprovalResult Approval result. 2: Rejected;
3: Approved
     */
    public void setApprovalResult(Long ApprovalResult) {
        this.ApprovalResult = ApprovalResult;
    }

    /**
     * Get Approval notes. It’s required when the request is rejected.  
     * @return ApprovalNote Approval notes. It’s required when the request is rejected. 
     */
    public String getApprovalNote() {
        return this.ApprovalNote;
    }

    /**
     * Set Approval notes. It’s required when the request is rejected. 
     * @param ApprovalNote Approval notes. It’s required when the request is rejected. 
     */
    public void setApprovalNote(String ApprovalNote) {
        this.ApprovalNote = ApprovalNote;
    }

    public ApprovalItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApprovalItem(ApprovalItem source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.ApprovalResult != null) {
            this.ApprovalResult = new Long(source.ApprovalResult);
        }
        if (source.ApprovalNote != null) {
            this.ApprovalNote = new String(source.ApprovalNote);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "ApprovalResult", this.ApprovalResult);
        this.setParamSimple(map, prefix + "ApprovalNote", this.ApprovalNote);

    }
}

