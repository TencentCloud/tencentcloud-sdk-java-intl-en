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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUserRolesResponse extends AbstractModel{

    /**
    * The total number of user roles meeting the enumeration conditions.
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * The user roles.
    */
    @SerializedName("UserRoles")
    @Expose
    private UserRole [] UserRoles;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The total number of user roles meeting the enumeration conditions. 
     * @return Total The total number of user roles meeting the enumeration conditions.
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set The total number of user roles meeting the enumeration conditions.
     * @param Total The total number of user roles meeting the enumeration conditions.
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get The user roles. 
     * @return UserRoles The user roles.
     */
    public UserRole [] getUserRoles() {
        return this.UserRoles;
    }

    /**
     * Set The user roles.
     * @param UserRoles The user roles.
     */
    public void setUserRoles(UserRole [] UserRoles) {
        this.UserRoles = UserRoles;
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

    public DescribeUserRolesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUserRolesResponse(DescribeUserRolesResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.UserRoles != null) {
            this.UserRoles = new UserRole[source.UserRoles.length];
            for (int i = 0; i < source.UserRoles.length; i++) {
                this.UserRoles[i] = new UserRole(source.UserRoles[i]);
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
        this.setParamArrayObj(map, prefix + "UserRoles.", this.UserRoles);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

