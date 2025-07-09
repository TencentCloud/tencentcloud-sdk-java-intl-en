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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccountDetailInfo extends AbstractModel {

    /**
    * Username

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Host name or IP address, which indicates the host to which the user belongs.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * User description information

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserDescription")
    @Expose
    private String UserDescription;

    /**
     * Get Username

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UserName Username

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Username

Note: This field may return null, indicating that no valid values can be obtained.
     * @param UserName Username

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get Host name or IP address, which indicates the host to which the user belongs.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Host Host name or IP address, which indicates the host to which the user belongs.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set Host name or IP address, which indicates the host to which the user belongs.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param Host Host name or IP address, which indicates the host to which the user belongs.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get User description information

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UserDescription User description information

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUserDescription() {
        return this.UserDescription;
    }

    /**
     * Set User description information

Note: This field may return null, indicating that no valid values can be obtained.
     * @param UserDescription User description information

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUserDescription(String UserDescription) {
        this.UserDescription = UserDescription;
    }

    public AccountDetailInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccountDetailInfo(AccountDetailInfo source) {
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.UserDescription != null) {
            this.UserDescription = new String(source.UserDescription);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "UserDescription", this.UserDescription);

    }
}

