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

public class ActionAlterUserRequest extends AbstractModel {

    /**
    * User information
    */
    @SerializedName("UserInfo")
    @Expose
    private UserInfo UserInfo;

    /**
    * API type
    */
    @SerializedName("ApiType")
    @Expose
    private String ApiType;

    /**
    * User permission type. 0: ordinary user; 1: administrator.
    */
    @SerializedName("UserPrivilege")
    @Expose
    private Long UserPrivilege;

    /**
     * Get User information 
     * @return UserInfo User information
     */
    public UserInfo getUserInfo() {
        return this.UserInfo;
    }

    /**
     * Set User information
     * @param UserInfo User information
     */
    public void setUserInfo(UserInfo UserInfo) {
        this.UserInfo = UserInfo;
    }

    /**
     * Get API type 
     * @return ApiType API type
     */
    public String getApiType() {
        return this.ApiType;
    }

    /**
     * Set API type
     * @param ApiType API type
     */
    public void setApiType(String ApiType) {
        this.ApiType = ApiType;
    }

    /**
     * Get User permission type. 0: ordinary user; 1: administrator. 
     * @return UserPrivilege User permission type. 0: ordinary user; 1: administrator.
     */
    public Long getUserPrivilege() {
        return this.UserPrivilege;
    }

    /**
     * Set User permission type. 0: ordinary user; 1: administrator.
     * @param UserPrivilege User permission type. 0: ordinary user; 1: administrator.
     */
    public void setUserPrivilege(Long UserPrivilege) {
        this.UserPrivilege = UserPrivilege;
    }

    public ActionAlterUserRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ActionAlterUserRequest(ActionAlterUserRequest source) {
        if (source.UserInfo != null) {
            this.UserInfo = new UserInfo(source.UserInfo);
        }
        if (source.ApiType != null) {
            this.ApiType = new String(source.ApiType);
        }
        if (source.UserPrivilege != null) {
            this.UserPrivilege = new Long(source.UserPrivilege);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "UserInfo.", this.UserInfo);
        this.setParamSimple(map, prefix + "ApiType", this.ApiType);
        this.setParamSimple(map, prefix + "UserPrivilege", this.UserPrivilege);

    }
}

