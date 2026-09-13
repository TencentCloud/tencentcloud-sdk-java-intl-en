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
package com.tencentcloudapi.rce.v20260130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class User extends AbstractModel {

    /**
    * <p>The level of the user in your system</p>
    */
    @SerializedName("UserLevel")
    @Expose
    private String UserLevel;

    /**
    * <p>The point of the user in your system</p>
    */
    @SerializedName("UserPoint")
    @Expose
    private CreditPoint UserPoint;

    /**
    * <p>The type of the user in your system</p>
    */
    @SerializedName("UserType")
    @Expose
    private String UserType;

    /**
     * Get <p>The level of the user in your system</p> 
     * @return UserLevel <p>The level of the user in your system</p>
     */
    public String getUserLevel() {
        return this.UserLevel;
    }

    /**
     * Set <p>The level of the user in your system</p>
     * @param UserLevel <p>The level of the user in your system</p>
     */
    public void setUserLevel(String UserLevel) {
        this.UserLevel = UserLevel;
    }

    /**
     * Get <p>The point of the user in your system</p> 
     * @return UserPoint <p>The point of the user in your system</p>
     */
    public CreditPoint getUserPoint() {
        return this.UserPoint;
    }

    /**
     * Set <p>The point of the user in your system</p>
     * @param UserPoint <p>The point of the user in your system</p>
     */
    public void setUserPoint(CreditPoint UserPoint) {
        this.UserPoint = UserPoint;
    }

    /**
     * Get <p>The type of the user in your system</p> 
     * @return UserType <p>The type of the user in your system</p>
     */
    public String getUserType() {
        return this.UserType;
    }

    /**
     * Set <p>The type of the user in your system</p>
     * @param UserType <p>The type of the user in your system</p>
     */
    public void setUserType(String UserType) {
        this.UserType = UserType;
    }

    public User() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public User(User source) {
        if (source.UserLevel != null) {
            this.UserLevel = new String(source.UserLevel);
        }
        if (source.UserPoint != null) {
            this.UserPoint = new CreditPoint(source.UserPoint);
        }
        if (source.UserType != null) {
            this.UserType = new String(source.UserType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserLevel", this.UserLevel);
        this.setParamObj(map, prefix + "UserPoint.", this.UserPoint);
        this.setParamSimple(map, prefix + "UserType", this.UserType);

    }
}

