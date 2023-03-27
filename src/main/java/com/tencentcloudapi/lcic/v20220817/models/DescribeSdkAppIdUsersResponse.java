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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSdkAppIdUsersResponse extends AbstractModel{

    /**
    * The total number of users.
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * The information of the users. Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Users")
    @Expose
    private UserInfo [] Users;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The total number of users. 
     * @return Total The total number of users.
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set The total number of users.
     * @param Total The total number of users.
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get The information of the users. Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Users The information of the users. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public UserInfo [] getUsers() {
        return this.Users;
    }

    /**
     * Set The information of the users. Note: This field may return null, indicating that no valid values can be obtained.
     * @param Users The information of the users. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUsers(UserInfo [] Users) {
        this.Users = Users;
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

    public DescribeSdkAppIdUsersResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSdkAppIdUsersResponse(DescribeSdkAppIdUsersResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Users != null) {
            this.Users = new UserInfo[source.Users.length];
            for (int i = 0; i < source.Users.length; i++) {
                this.Users[i] = new UserInfo(source.Users[i]);
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
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "Users.", this.Users);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

