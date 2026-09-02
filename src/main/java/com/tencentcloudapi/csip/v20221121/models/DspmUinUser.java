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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DspmUinUser extends AbstractModel {

    /**
    * Account UIN
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * Name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Type of user. 1: root account, 2: sub-user
    */
    @SerializedName("UserType")
    @Expose
    private Long UserType;

    /**
     * Get Account UIN 
     * @return Uin Account UIN
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set Account UIN
     * @param Uin Account UIN
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get Name 
     * @return Name Name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name
     * @param Name Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Type of user. 1: root account, 2: sub-user 
     * @return UserType Type of user. 1: root account, 2: sub-user
     */
    public Long getUserType() {
        return this.UserType;
    }

    /**
     * Set Type of user. 1: root account, 2: sub-user
     * @param UserType Type of user. 1: root account, 2: sub-user
     */
    public void setUserType(Long UserType) {
        this.UserType = UserType;
    }

    public DspmUinUser() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmUinUser(DspmUinUser source) {
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.UserType != null) {
            this.UserType = new Long(source.UserType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "UserType", this.UserType);

    }
}

