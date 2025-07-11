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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateVulScanTaskResponse extends AbstractModel {

    /**
    * ID of the task to scan local images again for vulnerabilities
    */
    @SerializedName("LocalTaskID")
    @Expose
    private Long LocalTaskID;

    /**
    * ID of the task to scan repository images again for vulnerabilities
    */
    @SerializedName("RegistryTaskID")
    @Expose
    private Long RegistryTaskID;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get ID of the task to scan local images again for vulnerabilities 
     * @return LocalTaskID ID of the task to scan local images again for vulnerabilities
     */
    public Long getLocalTaskID() {
        return this.LocalTaskID;
    }

    /**
     * Set ID of the task to scan local images again for vulnerabilities
     * @param LocalTaskID ID of the task to scan local images again for vulnerabilities
     */
    public void setLocalTaskID(Long LocalTaskID) {
        this.LocalTaskID = LocalTaskID;
    }

    /**
     * Get ID of the task to scan repository images again for vulnerabilities 
     * @return RegistryTaskID ID of the task to scan repository images again for vulnerabilities
     */
    public Long getRegistryTaskID() {
        return this.RegistryTaskID;
    }

    /**
     * Set ID of the task to scan repository images again for vulnerabilities
     * @param RegistryTaskID ID of the task to scan repository images again for vulnerabilities
     */
    public void setRegistryTaskID(Long RegistryTaskID) {
        this.RegistryTaskID = RegistryTaskID;
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

    public CreateVulScanTaskResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateVulScanTaskResponse(CreateVulScanTaskResponse source) {
        if (source.LocalTaskID != null) {
            this.LocalTaskID = new Long(source.LocalTaskID);
        }
        if (source.RegistryTaskID != null) {
            this.RegistryTaskID = new Long(source.RegistryTaskID);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LocalTaskID", this.LocalTaskID);
        this.setParamSimple(map, prefix + "RegistryTaskID", this.RegistryTaskID);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

