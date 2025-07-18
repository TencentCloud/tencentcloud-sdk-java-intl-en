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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GenerateDealsAndPayNewResponse extends AbstractModel {

    /**
    * Billing order response structure

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Data")
    @Expose
    private DealData Data;

    /**
    * 1: Success, 0: Failure
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Returned message

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ReturnMessage")
    @Expose
    private String ReturnMessage;

    /**
    * Purchased instance ID

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Billing order response structure

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Data Billing order response structure

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public DealData getData() {
        return this.Data;
    }

    /**
     * Set Billing order response structure

Note: This field may return null, indicating that no valid values can be obtained.
     * @param Data Billing order response structure

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setData(DealData Data) {
        this.Data = Data;
    }

    /**
     * Get 1: Success, 0: Failure 
     * @return Status 1: Success, 0: Failure
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 1: Success, 0: Failure
     * @param Status 1: Success, 0: Failure
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Returned message

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ReturnMessage Returned message

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getReturnMessage() {
        return this.ReturnMessage;
    }

    /**
     * Set Returned message

Note: This field may return null, indicating that no valid values can be obtained.
     * @param ReturnMessage Returned message

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setReturnMessage(String ReturnMessage) {
        this.ReturnMessage = ReturnMessage;
    }

    /**
     * Get Purchased instance ID

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceId Purchased instance ID

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Purchased instance ID

Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceId Purchased instance ID

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     * @param RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public GenerateDealsAndPayNewResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GenerateDealsAndPayNewResponse(GenerateDealsAndPayNewResponse source) {
        if (source.Data != null) {
            this.Data = new DealData(source.Data);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ReturnMessage != null) {
            this.ReturnMessage = new String(source.ReturnMessage);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
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
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ReturnMessage", this.ReturnMessage);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

