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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCallDetailResponse extends AbstractModel{

    /**
    * Total number of returned users
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * User information list
    */
    @SerializedName("UserList")
    @Expose
    private UserInformation [] UserList;

    /**
    * Quality data
    */
    @SerializedName("Data")
    @Expose
    private QualityData [] Data;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total number of returned users 
     * @return Total Total number of returned users
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set Total number of returned users
     * @param Total Total number of returned users
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get User information list 
     * @return UserList User information list
     */
    public UserInformation [] getUserList() {
        return this.UserList;
    }

    /**
     * Set User information list
     * @param UserList User information list
     */
    public void setUserList(UserInformation [] UserList) {
        this.UserList = UserList;
    }

    /**
     * Get Quality data 
     * @return Data Quality data
     */
    public QualityData [] getData() {
        return this.Data;
    }

    /**
     * Set Quality data
     * @param Data Quality data
     */
    public void setData(QualityData [] Data) {
        this.Data = Data;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "UserList.", this.UserList);
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

