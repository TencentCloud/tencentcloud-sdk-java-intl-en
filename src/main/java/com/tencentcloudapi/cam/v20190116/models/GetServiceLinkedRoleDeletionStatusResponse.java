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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetServiceLinkedRoleDeletionStatusResponse extends AbstractModel{

    /**
    * Status: NOT_STARTED, IN_PROGRESS, SUCCEEDED, FAILED
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Reasons why the deletion failed.
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * Service type
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * Service name
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Status: NOT_STARTED, IN_PROGRESS, SUCCEEDED, FAILED 
     * @return Status Status: NOT_STARTED, IN_PROGRESS, SUCCEEDED, FAILED
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Status: NOT_STARTED, IN_PROGRESS, SUCCEEDED, FAILED
     * @param Status Status: NOT_STARTED, IN_PROGRESS, SUCCEEDED, FAILED
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Reasons why the deletion failed. 
     * @return Reason Reasons why the deletion failed.
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set Reasons why the deletion failed.
     * @param Reason Reasons why the deletion failed.
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get Service type
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ServiceType Service type
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set Service type
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ServiceType Service type
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get Service name
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ServiceName Service name
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set Service name
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ServiceName Service name
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
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

    public GetServiceLinkedRoleDeletionStatusResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetServiceLinkedRoleDeletionStatusResponse(GetServiceLinkedRoleDeletionStatusResponse source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
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
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

