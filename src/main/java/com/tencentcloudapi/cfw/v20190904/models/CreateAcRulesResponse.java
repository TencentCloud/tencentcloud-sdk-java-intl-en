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

public class CreateAcRulesResponse extends AbstractModel {

    /**
    * Status value. 0: operation successful
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Returns redundant information
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("Info")
    @Expose
    private String Info;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Status value. 0: operation successful 
     * @return Status Status value. 0: operation successful
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status value. 0: operation successful
     * @param Status Status value. 0: operation successful
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Returns redundant information
Note: This field may return `null`, indicating that no valid value was found. 
     * @return Info Returns redundant information
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getInfo() {
        return this.Info;
    }

    /**
     * Set Returns redundant information
Note: This field may return `null`, indicating that no valid value was found.
     * @param Info Returns redundant information
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setInfo(String Info) {
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

    public CreateAcRulesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAcRulesResponse(CreateAcRulesResponse source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Info != null) {
            this.Info = new String(source.Info);
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

