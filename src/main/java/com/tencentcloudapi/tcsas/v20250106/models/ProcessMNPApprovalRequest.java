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
package com.tencentcloudapi.tcsas.v20250106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProcessMNPApprovalRequest extends AbstractModel {

    /**
    * Approval ID
    */
    @SerializedName("ApprovalNo")
    @Expose
    private String ApprovalNo;

    /**
    * Platform ID
    */
    @SerializedName("PlatformId")
    @Expose
    private String PlatformId;

    /**
    * Approval details
    */
    @SerializedName("ApprovalItems")
    @Expose
    private ApprovalItem [] ApprovalItems;

    /**
     * Get Approval ID 
     * @return ApprovalNo Approval ID
     */
    public String getApprovalNo() {
        return this.ApprovalNo;
    }

    /**
     * Set Approval ID
     * @param ApprovalNo Approval ID
     */
    public void setApprovalNo(String ApprovalNo) {
        this.ApprovalNo = ApprovalNo;
    }

    /**
     * Get Platform ID 
     * @return PlatformId Platform ID
     */
    public String getPlatformId() {
        return this.PlatformId;
    }

    /**
     * Set Platform ID
     * @param PlatformId Platform ID
     */
    public void setPlatformId(String PlatformId) {
        this.PlatformId = PlatformId;
    }

    /**
     * Get Approval details 
     * @return ApprovalItems Approval details
     */
    public ApprovalItem [] getApprovalItems() {
        return this.ApprovalItems;
    }

    /**
     * Set Approval details
     * @param ApprovalItems Approval details
     */
    public void setApprovalItems(ApprovalItem [] ApprovalItems) {
        this.ApprovalItems = ApprovalItems;
    }

    public ProcessMNPApprovalRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProcessMNPApprovalRequest(ProcessMNPApprovalRequest source) {
        if (source.ApprovalNo != null) {
            this.ApprovalNo = new String(source.ApprovalNo);
        }
        if (source.PlatformId != null) {
            this.PlatformId = new String(source.PlatformId);
        }
        if (source.ApprovalItems != null) {
            this.ApprovalItems = new ApprovalItem[source.ApprovalItems.length];
            for (int i = 0; i < source.ApprovalItems.length; i++) {
                this.ApprovalItems[i] = new ApprovalItem(source.ApprovalItems[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApprovalNo", this.ApprovalNo);
        this.setParamSimple(map, prefix + "PlatformId", this.PlatformId);
        this.setParamArrayObj(map, prefix + "ApprovalItems.", this.ApprovalItems);

    }
}

