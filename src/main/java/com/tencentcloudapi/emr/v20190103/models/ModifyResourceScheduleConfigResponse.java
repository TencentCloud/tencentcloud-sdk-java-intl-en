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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyResourceScheduleConfigResponse extends AbstractModel{

    /**
    * `true`: Draft, indicating the resource pool is not refreshed.
    */
    @SerializedName("IsDraft")
    @Expose
    private Boolean IsDraft;

    /**
    * Verification error information. If it is not null, the verification fails and thus the configuration fails.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("ErrorMsg")
    @Expose
    private String ErrorMsg;

    /**
    * The response data.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Data")
    @Expose
    private String Data;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get `true`: Draft, indicating the resource pool is not refreshed. 
     * @return IsDraft `true`: Draft, indicating the resource pool is not refreshed.
     */
    public Boolean getIsDraft() {
        return this.IsDraft;
    }

    /**
     * Set `true`: Draft, indicating the resource pool is not refreshed.
     * @param IsDraft `true`: Draft, indicating the resource pool is not refreshed.
     */
    public void setIsDraft(Boolean IsDraft) {
        this.IsDraft = IsDraft;
    }

    /**
     * Get Verification error information. If it is not null, the verification fails and thus the configuration fails.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return ErrorMsg Verification error information. If it is not null, the verification fails and thus the configuration fails.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getErrorMsg() {
        return this.ErrorMsg;
    }

    /**
     * Set Verification error information. If it is not null, the verification fails and thus the configuration fails.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param ErrorMsg Verification error information. If it is not null, the verification fails and thus the configuration fails.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setErrorMsg(String ErrorMsg) {
        this.ErrorMsg = ErrorMsg;
    }

    /**
     * Get The response data.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Data The response data.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getData() {
        return this.Data;
    }

    /**
     * Set The response data.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Data The response data.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setData(String Data) {
        this.Data = Data;
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

    public ModifyResourceScheduleConfigResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyResourceScheduleConfigResponse(ModifyResourceScheduleConfigResponse source) {
        if (source.IsDraft != null) {
            this.IsDraft = new Boolean(source.IsDraft);
        }
        if (source.ErrorMsg != null) {
            this.ErrorMsg = new String(source.ErrorMsg);
        }
        if (source.Data != null) {
            this.Data = new String(source.Data);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsDraft", this.IsDraft);
        this.setParamSimple(map, prefix + "ErrorMsg", this.ErrorMsg);
        this.setParamSimple(map, prefix + "Data", this.Data);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

