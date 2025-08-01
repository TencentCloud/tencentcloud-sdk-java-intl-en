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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApproveModify extends AbstractModel {

    /**
    * Approval Form ID
    */
    @SerializedName("ApproveId")
    @Expose
    private String ApproveId;

    /**
    * Modification successful?
    */
    @SerializedName("Success")
    @Expose
    private Boolean Success;

    /**
     * Get Approval Form ID 
     * @return ApproveId Approval Form ID
     */
    public String getApproveId() {
        return this.ApproveId;
    }

    /**
     * Set Approval Form ID
     * @param ApproveId Approval Form ID
     */
    public void setApproveId(String ApproveId) {
        this.ApproveId = ApproveId;
    }

    /**
     * Get Modification successful? 
     * @return Success Modification successful?
     */
    public Boolean getSuccess() {
        return this.Success;
    }

    /**
     * Set Modification successful?
     * @param Success Modification successful?
     */
    public void setSuccess(Boolean Success) {
        this.Success = Success;
    }

    public ApproveModify() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApproveModify(ApproveModify source) {
        if (source.ApproveId != null) {
            this.ApproveId = new String(source.ApproveId);
        }
        if (source.Success != null) {
            this.Success = new Boolean(source.Success);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApproveId", this.ApproveId);
        this.setParamSimple(map, prefix + "Success", this.Success);

    }
}

