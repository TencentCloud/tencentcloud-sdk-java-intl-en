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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScaleOutInstanceResponse extends AbstractModel {

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Order number.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DealNames")
    @Expose
    private String [] DealNames;

    /**
    * Client token.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * Scale-out workflow ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FlowId")
    @Expose
    private Long FlowId;

    /**
    * Big order ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BillId")
    @Expose
    private String BillId;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Instance ID. 
     * @return InstanceId Instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
     * @param InstanceId Instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Order number.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DealNames Order number.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getDealNames() {
        return this.DealNames;
    }

    /**
     * Set Order number.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DealNames Order number.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDealNames(String [] DealNames) {
        this.DealNames = DealNames;
    }

    /**
     * Get Client token.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ClientToken Client token.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set Client token.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ClientToken Client token.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get Scale-out workflow ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FlowId Scale-out workflow ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getFlowId() {
        return this.FlowId;
    }

    /**
     * Set Scale-out workflow ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FlowId Scale-out workflow ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFlowId(Long FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get Big order ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BillId Big order ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBillId() {
        return this.BillId;
    }

    /**
     * Set Big order ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BillId Big order ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBillId(String BillId) {
        this.BillId = BillId;
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

    public ScaleOutInstanceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScaleOutInstanceResponse(ScaleOutInstanceResponse source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.DealNames != null) {
            this.DealNames = new String[source.DealNames.length];
            for (int i = 0; i < source.DealNames.length; i++) {
                this.DealNames[i] = new String(source.DealNames[i]);
            }
        }
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
        }
        if (source.FlowId != null) {
            this.FlowId = new Long(source.FlowId);
        }
        if (source.BillId != null) {
            this.BillId = new String(source.BillId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "DealNames.", this.DealNames);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamSimple(map, prefix + "BillId", this.BillId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

