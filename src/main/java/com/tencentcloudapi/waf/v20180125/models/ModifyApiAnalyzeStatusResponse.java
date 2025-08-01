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

public class ModifyApiAnalyzeStatusResponse extends AbstractModel {

    /**
    * Number of Activated. If the returned value is 3 (greater than the number of domains supported for activation), the activation has failed.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * Domain list not supported to enable

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UnSupportedList")
    @Expose
    private String [] UnSupportedList;

    /**
    * Domain list with enabling/disabling failed

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FailDomainList")
    @Expose
    private String [] FailDomainList;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Number of Activated. If the returned value is 3 (greater than the number of domains supported for activation), the activation has failed.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Count Number of Activated. If the returned value is 3 (greater than the number of domains supported for activation), the activation has failed.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Number of Activated. If the returned value is 3 (greater than the number of domains supported for activation), the activation has failed.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param Count Number of Activated. If the returned value is 3 (greater than the number of domains supported for activation), the activation has failed.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get Domain list not supported to enable

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UnSupportedList Domain list not supported to enable

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getUnSupportedList() {
        return this.UnSupportedList;
    }

    /**
     * Set Domain list not supported to enable

Note: This field may return null, indicating that no valid values can be obtained.
     * @param UnSupportedList Domain list not supported to enable

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUnSupportedList(String [] UnSupportedList) {
        this.UnSupportedList = UnSupportedList;
    }

    /**
     * Get Domain list with enabling/disabling failed

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FailDomainList Domain list with enabling/disabling failed

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getFailDomainList() {
        return this.FailDomainList;
    }

    /**
     * Set Domain list with enabling/disabling failed

Note: This field may return null, indicating that no valid values can be obtained.
     * @param FailDomainList Domain list with enabling/disabling failed

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFailDomainList(String [] FailDomainList) {
        this.FailDomainList = FailDomainList;
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

    public ModifyApiAnalyzeStatusResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyApiAnalyzeStatusResponse(ModifyApiAnalyzeStatusResponse source) {
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.UnSupportedList != null) {
            this.UnSupportedList = new String[source.UnSupportedList.length];
            for (int i = 0; i < source.UnSupportedList.length; i++) {
                this.UnSupportedList[i] = new String(source.UnSupportedList[i]);
            }
        }
        if (source.FailDomainList != null) {
            this.FailDomainList = new String[source.FailDomainList.length];
            for (int i = 0; i < source.FailDomainList.length; i++) {
                this.FailDomainList[i] = new String(source.FailDomainList[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamArraySimple(map, prefix + "UnSupportedList.", this.UnSupportedList);
        this.setParamArraySimple(map, prefix + "FailDomainList.", this.FailDomainList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

