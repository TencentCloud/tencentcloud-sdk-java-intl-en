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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUsersForUserManagerResponse extends AbstractModel {

    /**
    * Total number
    */
    @SerializedName("TotalCnt")
    @Expose
    private Long TotalCnt;

    /**
    * User information list
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("UserManagerUserList")
    @Expose
    private UserManagerUserBriefInfo [] UserManagerUserList;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total number 
     * @return TotalCnt Total number
     */
    public Long getTotalCnt() {
        return this.TotalCnt;
    }

    /**
     * Set Total number
     * @param TotalCnt Total number
     */
    public void setTotalCnt(Long TotalCnt) {
        this.TotalCnt = TotalCnt;
    }

    /**
     * Get User information list
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return UserManagerUserList User information list
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public UserManagerUserBriefInfo [] getUserManagerUserList() {
        return this.UserManagerUserList;
    }

    /**
     * Set User information list
Note: This field may return null, indicating that no valid value can be obtained.
     * @param UserManagerUserList User information list
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setUserManagerUserList(UserManagerUserBriefInfo [] UserManagerUserList) {
        this.UserManagerUserList = UserManagerUserList;
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

    public DescribeUsersForUserManagerResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUsersForUserManagerResponse(DescribeUsersForUserManagerResponse source) {
        if (source.TotalCnt != null) {
            this.TotalCnt = new Long(source.TotalCnt);
        }
        if (source.UserManagerUserList != null) {
            this.UserManagerUserList = new UserManagerUserBriefInfo[source.UserManagerUserList.length];
            for (int i = 0; i < source.UserManagerUserList.length; i++) {
                this.UserManagerUserList[i] = new UserManagerUserBriefInfo(source.UserManagerUserList[i]);
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
        this.setParamSimple(map, prefix + "TotalCnt", this.TotalCnt);
        this.setParamArrayObj(map, prefix + "UserManagerUserList.", this.UserManagerUserList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

