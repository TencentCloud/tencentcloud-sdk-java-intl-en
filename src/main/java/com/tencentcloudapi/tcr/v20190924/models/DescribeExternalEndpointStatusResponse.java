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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeExternalEndpointStatusResponse extends AbstractModel {

    /**
    * Public network access status. Valid values: Opening, Opened, Closed.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Reason
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Public network access status. Valid values: Opening, Opened, Closed. 
     * @return Status Public network access status. Valid values: Opening, Opened, Closed.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Public network access status. Valid values: Opening, Opened, Closed.
     * @param Status Public network access status. Valid values: Opening, Opened, Closed.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Reason
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Reason Reason
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set Reason
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Reason Reason
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
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

    public DescribeExternalEndpointStatusResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeExternalEndpointStatusResponse(DescribeExternalEndpointStatusResponse source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
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
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

