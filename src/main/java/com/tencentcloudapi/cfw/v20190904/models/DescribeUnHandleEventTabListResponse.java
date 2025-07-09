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

public class DescribeUnHandleEventTabListResponse extends AbstractModel {

    /**
    * Gets unhandled security events
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("Data")
    @Expose
    private UnHandleEvent Data;

    /**
    * Error code. 0: success; non-0: error
    */
    @SerializedName("ReturnCode")
    @Expose
    private Long ReturnCode;

    /**
    * Return message: success
    */
    @SerializedName("ReturnMsg")
    @Expose
    private String ReturnMsg;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Gets unhandled security events
Note: This field may return `null`, indicating that no valid value was found. 
     * @return Data Gets unhandled security events
Note: This field may return `null`, indicating that no valid value was found.
     */
    public UnHandleEvent getData() {
        return this.Data;
    }

    /**
     * Set Gets unhandled security events
Note: This field may return `null`, indicating that no valid value was found.
     * @param Data Gets unhandled security events
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setData(UnHandleEvent Data) {
        this.Data = Data;
    }

    /**
     * Get Error code. 0: success; non-0: error 
     * @return ReturnCode Error code. 0: success; non-0: error
     */
    public Long getReturnCode() {
        return this.ReturnCode;
    }

    /**
     * Set Error code. 0: success; non-0: error
     * @param ReturnCode Error code. 0: success; non-0: error
     */
    public void setReturnCode(Long ReturnCode) {
        this.ReturnCode = ReturnCode;
    }

    /**
     * Get Return message: success 
     * @return ReturnMsg Return message: success
     */
    public String getReturnMsg() {
        return this.ReturnMsg;
    }

    /**
     * Set Return message: success
     * @param ReturnMsg Return message: success
     */
    public void setReturnMsg(String ReturnMsg) {
        this.ReturnMsg = ReturnMsg;
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

    public DescribeUnHandleEventTabListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUnHandleEventTabListResponse(DescribeUnHandleEventTabListResponse source) {
        if (source.Data != null) {
            this.Data = new UnHandleEvent(source.Data);
        }
        if (source.ReturnCode != null) {
            this.ReturnCode = new Long(source.ReturnCode);
        }
        if (source.ReturnMsg != null) {
            this.ReturnMsg = new String(source.ReturnMsg);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "ReturnCode", this.ReturnCode);
        this.setParamSimple(map, prefix + "ReturnMsg", this.ReturnMsg);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

