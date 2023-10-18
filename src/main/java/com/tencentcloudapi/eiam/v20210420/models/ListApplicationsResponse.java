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
package com.tencentcloudapi.eiam.v20210420.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListApplicationsResponse extends AbstractModel {

    /**
    * Total number of returned application information items.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Returned application information list.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApplicationInfoList")
    @Expose
    private ApplicationInformation [] ApplicationInfoList;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total number of returned application information items.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TotalCount Total number of returned application information items.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of returned application information items.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TotalCount Total number of returned application information items.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Returned application information list.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ApplicationInfoList Returned application information list.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public ApplicationInformation [] getApplicationInfoList() {
        return this.ApplicationInfoList;
    }

    /**
     * Set Returned application information list.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ApplicationInfoList Returned application information list.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setApplicationInfoList(ApplicationInformation [] ApplicationInfoList) {
        this.ApplicationInfoList = ApplicationInfoList;
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

    public ListApplicationsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListApplicationsResponse(ListApplicationsResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.ApplicationInfoList != null) {
            this.ApplicationInfoList = new ApplicationInformation[source.ApplicationInfoList.length];
            for (int i = 0; i < source.ApplicationInfoList.length; i++) {
                this.ApplicationInfoList[i] = new ApplicationInformation(source.ApplicationInfoList[i]);
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "ApplicationInfoList.", this.ApplicationInfoList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

