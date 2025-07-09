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

public class DeleteUsersResponse extends AbstractModel {

    /**
    * Information of the users failed to be deleted. When the business parameter is `DeleteIdList`, this field will return the list of IDs of the users failed to be deleted. When the business parameter is `DeleteNameList`, this field will return the list of usernames of the users failed to be deleted.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FailedItems")
    @Expose
    private String [] FailedItems;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Information of the users failed to be deleted. When the business parameter is `DeleteIdList`, this field will return the list of IDs of the users failed to be deleted. When the business parameter is `DeleteNameList`, this field will return the list of usernames of the users failed to be deleted.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return FailedItems Information of the users failed to be deleted. When the business parameter is `DeleteIdList`, this field will return the list of IDs of the users failed to be deleted. When the business parameter is `DeleteNameList`, this field will return the list of usernames of the users failed to be deleted.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String [] getFailedItems() {
        return this.FailedItems;
    }

    /**
     * Set Information of the users failed to be deleted. When the business parameter is `DeleteIdList`, this field will return the list of IDs of the users failed to be deleted. When the business parameter is `DeleteNameList`, this field will return the list of usernames of the users failed to be deleted.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param FailedItems Information of the users failed to be deleted. When the business parameter is `DeleteIdList`, this field will return the list of IDs of the users failed to be deleted. When the business parameter is `DeleteNameList`, this field will return the list of usernames of the users failed to be deleted.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setFailedItems(String [] FailedItems) {
        this.FailedItems = FailedItems;
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

    public DeleteUsersResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteUsersResponse(DeleteUsersResponse source) {
        if (source.FailedItems != null) {
            this.FailedItems = new String[source.FailedItems.length];
            for (int i = 0; i < source.FailedItems.length; i++) {
                this.FailedItems[i] = new String(source.FailedItems[i]);
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
        this.setParamArraySimple(map, prefix + "FailedItems.", this.FailedItems);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

