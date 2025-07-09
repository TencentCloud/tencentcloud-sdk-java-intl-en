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

public class DescribeUserInfoRequest extends AbstractModel {

    /**
    * Username, which can contain up to 64 characters. You need to specify at least `UserName` or `UserId`. If both are specified, `UserName` will be used first.
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * User ID, which can contain up to 64 characters. You need to specify at least `UserName` or `UserId`. If both are specified, `UserName` will be used first.
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
     * Get Username, which can contain up to 64 characters. You need to specify at least `UserName` or `UserId`. If both are specified, `UserName` will be used first. 
     * @return UserName Username, which can contain up to 64 characters. You need to specify at least `UserName` or `UserId`. If both are specified, `UserName` will be used first.
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Username, which can contain up to 64 characters. You need to specify at least `UserName` or `UserId`. If both are specified, `UserName` will be used first.
     * @param UserName Username, which can contain up to 64 characters. You need to specify at least `UserName` or `UserId`. If both are specified, `UserName` will be used first.
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get User ID, which can contain up to 64 characters. You need to specify at least `UserName` or `UserId`. If both are specified, `UserName` will be used first. 
     * @return UserId User ID, which can contain up to 64 characters. You need to specify at least `UserName` or `UserId`. If both are specified, `UserName` will be used first.
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set User ID, which can contain up to 64 characters. You need to specify at least `UserName` or `UserId`. If both are specified, `UserName` will be used first.
     * @param UserId User ID, which can contain up to 64 characters. You need to specify at least `UserName` or `UserId`. If both are specified, `UserName` will be used first.
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    public DescribeUserInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUserInfoRequest(DescribeUserInfoRequest source) {
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "UserId", this.UserId);

    }
}

