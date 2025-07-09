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

public class ListUsersInUserGroupResponse extends AbstractModel {

    /**
    * User group ID, which is globally unique.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserGroupId")
    @Expose
    private String UserGroupId;

    /**
    * Returned user information list.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserInfo")
    @Expose
    private UserInfo [] UserInfo;

    /**
    * Total number of returned user information items.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TotalNum")
    @Expose
    private Long TotalNum;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get User group ID, which is globally unique.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return UserGroupId User group ID, which is globally unique.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getUserGroupId() {
        return this.UserGroupId;
    }

    /**
     * Set User group ID, which is globally unique.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param UserGroupId User group ID, which is globally unique.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setUserGroupId(String UserGroupId) {
        this.UserGroupId = UserGroupId;
    }

    /**
     * Get Returned user information list.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return UserInfo Returned user information list.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public UserInfo [] getUserInfo() {
        return this.UserInfo;
    }

    /**
     * Set Returned user information list.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param UserInfo Returned user information list.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setUserInfo(UserInfo [] UserInfo) {
        this.UserInfo = UserInfo;
    }

    /**
     * Get Total number of returned user information items.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TotalNum Total number of returned user information items.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getTotalNum() {
        return this.TotalNum;
    }

    /**
     * Set Total number of returned user information items.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TotalNum Total number of returned user information items.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTotalNum(Long TotalNum) {
        this.TotalNum = TotalNum;
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

    public ListUsersInUserGroupResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListUsersInUserGroupResponse(ListUsersInUserGroupResponse source) {
        if (source.UserGroupId != null) {
            this.UserGroupId = new String(source.UserGroupId);
        }
        if (source.UserInfo != null) {
            this.UserInfo = new UserInfo[source.UserInfo.length];
            for (int i = 0; i < source.UserInfo.length; i++) {
                this.UserInfo[i] = new UserInfo(source.UserInfo[i]);
            }
        }
        if (source.TotalNum != null) {
            this.TotalNum = new Long(source.TotalNum);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserGroupId", this.UserGroupId);
        this.setParamArrayObj(map, prefix + "UserInfo.", this.UserInfo);
        this.setParamSimple(map, prefix + "TotalNum", this.TotalNum);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

