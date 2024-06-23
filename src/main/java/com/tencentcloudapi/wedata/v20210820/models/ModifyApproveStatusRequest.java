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

public class ModifyApproveStatusRequest extends AbstractModel {

    /**
    * Approval Form IDs
    */
    @SerializedName("ApproveIds")
    @Expose
    private String [] ApproveIds;

    /**
    * Approval Remarks
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Status
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get Approval Form IDs 
     * @return ApproveIds Approval Form IDs
     */
    public String [] getApproveIds() {
        return this.ApproveIds;
    }

    /**
     * Set Approval Form IDs
     * @param ApproveIds Approval Form IDs
     */
    public void setApproveIds(String [] ApproveIds) {
        this.ApproveIds = ApproveIds;
    }

    /**
     * Get Approval Remarks 
     * @return Remark Approval Remarks
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Approval Remarks
     * @param Remark Approval Remarks
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Status 
     * @return Status Status
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Status
     * @param Status Status
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public ModifyApproveStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyApproveStatusRequest(ModifyApproveStatusRequest source) {
        if (source.ApproveIds != null) {
            this.ApproveIds = new String[source.ApproveIds.length];
            for (int i = 0; i < source.ApproveIds.length; i++) {
                this.ApproveIds[i] = new String(source.ApproveIds[i]);
            }
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ApproveIds.", this.ApproveIds);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

