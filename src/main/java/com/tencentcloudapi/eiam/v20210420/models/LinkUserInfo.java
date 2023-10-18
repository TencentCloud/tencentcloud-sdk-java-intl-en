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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LinkUserInfo extends AbstractModel {

    /**
    * User ID, which is globally unique and can contain up to 64 characters.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * Username.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
     * Get User ID, which is globally unique and can contain up to 64 characters.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return UserId User ID, which is globally unique and can contain up to 64 characters.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set User ID, which is globally unique and can contain up to 64 characters.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param UserId User ID, which is globally unique and can contain up to 64 characters.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get Username.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return UserName Username.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Username.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param UserName Username.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public LinkUserInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LinkUserInfo(LinkUserInfo source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);

    }
}

