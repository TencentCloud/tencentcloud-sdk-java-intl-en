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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEnableVpcCniProgressResponse extends AbstractModel {

    /**
    * Task status, which can be `Running`, `Succeed`, or `Failed`.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * The description for the task status when the task status is “Failed”, for example, failed to install the IPAMD component.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Task status, which can be `Running`, `Succeed`, or `Failed`. 
     * @return Status Task status, which can be `Running`, `Succeed`, or `Failed`.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Task status, which can be `Running`, `Succeed`, or `Failed`.
     * @param Status Task status, which can be `Running`, `Succeed`, or `Failed`.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get The description for the task status when the task status is “Failed”, for example, failed to install the IPAMD component.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return ErrorMessage The description for the task status when the task status is “Failed”, for example, failed to install the IPAMD component.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set The description for the task status when the task status is “Failed”, for example, failed to install the IPAMD component.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param ErrorMessage The description for the task status when the task status is “Failed”, for example, failed to install the IPAMD component.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
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

    public DescribeEnableVpcCniProgressResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEnableVpcCniProgressResponse(DescribeEnableVpcCniProgressResponse source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String(source.ErrorMessage);
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
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

