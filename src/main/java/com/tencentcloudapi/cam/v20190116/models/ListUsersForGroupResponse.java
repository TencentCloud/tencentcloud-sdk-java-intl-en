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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListUsersForGroupResponse extends AbstractModel{

    /**
    * Total number of users associated with the User Group
    */
    @SerializedName("TotalNum")
    @Expose
    private Long TotalNum;

    /**
    * Sub-user information
    */
    @SerializedName("UserInfo")
    @Expose
    private GroupMemberInfo [] UserInfo;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total number of users associated with the User Group 
     * @return TotalNum Total number of users associated with the User Group
     */
    public Long getTotalNum() {
        return this.TotalNum;
    }

    /**
     * Set Total number of users associated with the User Group
     * @param TotalNum Total number of users associated with the User Group
     */
    public void setTotalNum(Long TotalNum) {
        this.TotalNum = TotalNum;
    }

    /**
     * Get Sub-user information 
     * @return UserInfo Sub-user information
     */
    public GroupMemberInfo [] getUserInfo() {
        return this.UserInfo;
    }

    /**
     * Set Sub-user information
     * @param UserInfo Sub-user information
     */
    public void setUserInfo(GroupMemberInfo [] UserInfo) {
        this.UserInfo = UserInfo;
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

    public ListUsersForGroupResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListUsersForGroupResponse(ListUsersForGroupResponse source) {
        if (source.TotalNum != null) {
            this.TotalNum = new Long(source.TotalNum);
        }
        if (source.UserInfo != null) {
            this.UserInfo = new GroupMemberInfo[source.UserInfo.length];
            for (int i = 0; i < source.UserInfo.length; i++) {
                this.UserInfo[i] = new GroupMemberInfo(source.UserInfo[i]);
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
        this.setParamSimple(map, prefix + "TotalNum", this.TotalNum);
        this.setParamArrayObj(map, prefix + "UserInfo.", this.UserInfo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

