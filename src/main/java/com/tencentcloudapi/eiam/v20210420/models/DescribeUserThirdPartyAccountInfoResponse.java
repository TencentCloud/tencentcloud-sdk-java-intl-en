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

public class DescribeUserThirdPartyAccountInfoResponse extends AbstractModel {

    /**
    * User ID.
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * Username.
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Third-Party account binding information.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ThirdPartyAccounts")
    @Expose
    private ThirdPartyAccountInfo [] ThirdPartyAccounts;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get User ID. 
     * @return UserId User ID.
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set User ID.
     * @param UserId User ID.
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get Username. 
     * @return UserName Username.
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Username.
     * @param UserName Username.
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get Third-Party account binding information.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ThirdPartyAccounts Third-Party account binding information.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public ThirdPartyAccountInfo [] getThirdPartyAccounts() {
        return this.ThirdPartyAccounts;
    }

    /**
     * Set Third-Party account binding information.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ThirdPartyAccounts Third-Party account binding information.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setThirdPartyAccounts(ThirdPartyAccountInfo [] ThirdPartyAccounts) {
        this.ThirdPartyAccounts = ThirdPartyAccounts;
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

    public DescribeUserThirdPartyAccountInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUserThirdPartyAccountInfoResponse(DescribeUserThirdPartyAccountInfoResponse source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.ThirdPartyAccounts != null) {
            this.ThirdPartyAccounts = new ThirdPartyAccountInfo[source.ThirdPartyAccounts.length];
            for (int i = 0; i < source.ThirdPartyAccounts.length; i++) {
                this.ThirdPartyAccounts[i] = new ThirdPartyAccountInfo(source.ThirdPartyAccounts[i]);
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
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamArrayObj(map, prefix + "ThirdPartyAccounts.", this.ThirdPartyAccounts);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

