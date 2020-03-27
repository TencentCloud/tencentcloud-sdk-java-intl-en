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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserResponse extends AbstractModel{

    /**
    * List of eligible users
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Users")
    @Expose
    private User [] Users;

    /**
    * Total number of eligible users
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
     * Get List of eligible users
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Users List of eligible users
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public User [] getUsers() {
        return this.Users;
    }

    /**
     * Set List of eligible users
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Users List of eligible users
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setUsers(User [] Users) {
        this.Users = Users;
    }

    /**
     * Get Total number of eligible users 
     * @return TotalCount Total number of eligible users
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of eligible users
     * @param TotalCount Total number of eligible users
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Users.", this.Users);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);

    }
}

