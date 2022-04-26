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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUserResourcesAuthorizationResponse extends AbstractModel{

    /**
    * Unique application ID.
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * Application account.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApplicationAccounts")
    @Expose
    private String [] ApplicationAccounts;

    /**
    * Unique ID of the authorized user.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * Username of the authorized user.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Returned resource list.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AuthorizationUserResourceList")
    @Expose
    private AuthorizationUserResouceInfo [] AuthorizationUserResourceList;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Unique application ID. 
     * @return ApplicationId Unique application ID.
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set Unique application ID.
     * @param ApplicationId Unique application ID.
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get Application account.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ApplicationAccounts Application account.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String [] getApplicationAccounts() {
        return this.ApplicationAccounts;
    }

    /**
     * Set Application account.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ApplicationAccounts Application account.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setApplicationAccounts(String [] ApplicationAccounts) {
        this.ApplicationAccounts = ApplicationAccounts;
    }

    /**
     * Get Unique ID of the authorized user.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return UserId Unique ID of the authorized user.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set Unique ID of the authorized user.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param UserId Unique ID of the authorized user.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get Username of the authorized user.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return UserName Username of the authorized user.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Username of the authorized user.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param UserName Username of the authorized user.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get Returned resource list.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AuthorizationUserResourceList Returned resource list.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public AuthorizationUserResouceInfo [] getAuthorizationUserResourceList() {
        return this.AuthorizationUserResourceList;
    }

    /**
     * Set Returned resource list.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AuthorizationUserResourceList Returned resource list.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAuthorizationUserResourceList(AuthorizationUserResouceInfo [] AuthorizationUserResourceList) {
        this.AuthorizationUserResourceList = AuthorizationUserResourceList;
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

    public DescribeUserResourcesAuthorizationResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUserResourcesAuthorizationResponse(DescribeUserResourcesAuthorizationResponse source) {
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.ApplicationAccounts != null) {
            this.ApplicationAccounts = new String[source.ApplicationAccounts.length];
            for (int i = 0; i < source.ApplicationAccounts.length; i++) {
                this.ApplicationAccounts[i] = new String(source.ApplicationAccounts[i]);
            }
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.AuthorizationUserResourceList != null) {
            this.AuthorizationUserResourceList = new AuthorizationUserResouceInfo[source.AuthorizationUserResourceList.length];
            for (int i = 0; i < source.AuthorizationUserResourceList.length; i++) {
                this.AuthorizationUserResourceList[i] = new AuthorizationUserResouceInfo(source.AuthorizationUserResourceList[i]);
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
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamArraySimple(map, prefix + "ApplicationAccounts.", this.ApplicationAccounts);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamArrayObj(map, prefix + "AuthorizationUserResourceList.", this.AuthorizationUserResourceList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

