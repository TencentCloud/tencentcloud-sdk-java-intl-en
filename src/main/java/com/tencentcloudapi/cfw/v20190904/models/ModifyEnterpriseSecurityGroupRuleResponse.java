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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyEnterpriseSecurityGroupRuleResponse extends AbstractModel {

    /**
    * Status value. `0`: Edited successfully; Others: Failed to edit
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * ID of new rule generated after the modification
    */
    @SerializedName("NewRuleUuid")
    @Expose
    private Long NewRuleUuid;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Status value. `0`: Edited successfully; Others: Failed to edit 
     * @return Status Status value. `0`: Edited successfully; Others: Failed to edit
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status value. `0`: Edited successfully; Others: Failed to edit
     * @param Status Status value. `0`: Edited successfully; Others: Failed to edit
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get ID of new rule generated after the modification 
     * @return NewRuleUuid ID of new rule generated after the modification
     */
    public Long getNewRuleUuid() {
        return this.NewRuleUuid;
    }

    /**
     * Set ID of new rule generated after the modification
     * @param NewRuleUuid ID of new rule generated after the modification
     */
    public void setNewRuleUuid(Long NewRuleUuid) {
        this.NewRuleUuid = NewRuleUuid;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public ModifyEnterpriseSecurityGroupRuleResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyEnterpriseSecurityGroupRuleResponse(ModifyEnterpriseSecurityGroupRuleResponse source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.NewRuleUuid != null) {
            this.NewRuleUuid = new Long(source.NewRuleUuid);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "NewRuleUuid", this.NewRuleUuid);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

