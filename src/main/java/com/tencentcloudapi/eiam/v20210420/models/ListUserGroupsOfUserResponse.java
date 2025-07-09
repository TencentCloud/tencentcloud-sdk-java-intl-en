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

public class ListUserGroupsOfUserResponse extends AbstractModel {

    /**
    * List of IDs of the user's user groups.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserGroupIds")
    @Expose
    private String [] UserGroupIds;

    /**
    * User ID, which is globally unique.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * List of information of the user's user groups.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserGroupInfoList")
    @Expose
    private UserGroupInfo [] UserGroupInfoList;

    /**
    * Total number of returned user group information items.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get List of IDs of the user's user groups.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return UserGroupIds List of IDs of the user's user groups.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String [] getUserGroupIds() {
        return this.UserGroupIds;
    }

    /**
     * Set List of IDs of the user's user groups.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param UserGroupIds List of IDs of the user's user groups.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setUserGroupIds(String [] UserGroupIds) {
        this.UserGroupIds = UserGroupIds;
    }

    /**
     * Get User ID, which is globally unique.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return UserId User ID, which is globally unique.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set User ID, which is globally unique.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param UserId User ID, which is globally unique.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get List of information of the user's user groups.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return UserGroupInfoList List of information of the user's user groups.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public UserGroupInfo [] getUserGroupInfoList() {
        return this.UserGroupInfoList;
    }

    /**
     * Set List of information of the user's user groups.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param UserGroupInfoList List of information of the user's user groups.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setUserGroupInfoList(UserGroupInfo [] UserGroupInfoList) {
        this.UserGroupInfoList = UserGroupInfoList;
    }

    /**
     * Get Total number of returned user group information items.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TotalCount Total number of returned user group information items.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of returned user group information items.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TotalCount Total number of returned user group information items.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
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

    public ListUserGroupsOfUserResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListUserGroupsOfUserResponse(ListUserGroupsOfUserResponse source) {
        if (source.UserGroupIds != null) {
            this.UserGroupIds = new String[source.UserGroupIds.length];
            for (int i = 0; i < source.UserGroupIds.length; i++) {
                this.UserGroupIds[i] = new String(source.UserGroupIds[i]);
            }
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.UserGroupInfoList != null) {
            this.UserGroupInfoList = new UserGroupInfo[source.UserGroupInfoList.length];
            for (int i = 0; i < source.UserGroupInfoList.length; i++) {
                this.UserGroupInfoList[i] = new UserGroupInfo(source.UserGroupInfoList[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "UserGroupIds.", this.UserGroupIds);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamArrayObj(map, prefix + "UserGroupInfoList.", this.UserGroupInfoList);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

