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
package com.tencentcloudapi.eiam.v20210420.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListAuthorizedApplicationsToUserGroupResponse extends AbstractModel {

    /**
    * List of IDs of the applications accessible to the user group.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApplicationIds")
    @Expose
    private String [] ApplicationIds;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get List of IDs of the applications accessible to the user group.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ApplicationIds List of IDs of the applications accessible to the user group.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String [] getApplicationIds() {
        return this.ApplicationIds;
    }

    /**
     * Set List of IDs of the applications accessible to the user group.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ApplicationIds List of IDs of the applications accessible to the user group.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setApplicationIds(String [] ApplicationIds) {
        this.ApplicationIds = ApplicationIds;
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

    public ListAuthorizedApplicationsToUserGroupResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListAuthorizedApplicationsToUserGroupResponse(ListAuthorizedApplicationsToUserGroupResponse source) {
        if (source.ApplicationIds != null) {
            this.ApplicationIds = new String[source.ApplicationIds.length];
            for (int i = 0; i < source.ApplicationIds.length; i++) {
                this.ApplicationIds[i] = new String(source.ApplicationIds[i]);
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
        this.setParamArraySimple(map, prefix + "ApplicationIds.", this.ApplicationIds);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

