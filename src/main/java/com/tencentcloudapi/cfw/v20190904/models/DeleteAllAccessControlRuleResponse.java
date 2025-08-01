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

public class DeleteAllAccessControlRuleResponse extends AbstractModel {

    /**
    * Status of the task. `0`: Modified successfully; Others: Modification failed
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Number of access control rules deleted.
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("Info")
    @Expose
    private Long Info;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Status of the task. `0`: Modified successfully; Others: Modification failed 
     * @return Status Status of the task. `0`: Modified successfully; Others: Modification failed
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status of the task. `0`: Modified successfully; Others: Modification failed
     * @param Status Status of the task. `0`: Modified successfully; Others: Modification failed
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Number of access control rules deleted.
Note: This field may return `null`, indicating that no valid value was found. 
     * @return Info Number of access control rules deleted.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public Long getInfo() {
        return this.Info;
    }

    /**
     * Set Number of access control rules deleted.
Note: This field may return `null`, indicating that no valid value was found.
     * @param Info Number of access control rules deleted.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setInfo(Long Info) {
        this.Info = Info;
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

    public DeleteAllAccessControlRuleResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteAllAccessControlRuleResponse(DeleteAllAccessControlRuleResponse source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Info != null) {
            this.Info = new Long(source.Info);
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
        this.setParamSimple(map, prefix + "Info", this.Info);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

