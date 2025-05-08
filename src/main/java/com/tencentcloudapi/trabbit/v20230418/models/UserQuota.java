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
package com.tencentcloudapi.trabbit.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserQuota extends AbstractModel {

    /**
    * Maximum number of users.
    */
    @SerializedName("MaxUser")
    @Expose
    private Long MaxUser;

    /**
    * Used number of users.
    */
    @SerializedName("UsedUser")
    @Expose
    private Long UsedUser;

    /**
     * Get Maximum number of users. 
     * @return MaxUser Maximum number of users.
     */
    public Long getMaxUser() {
        return this.MaxUser;
    }

    /**
     * Set Maximum number of users.
     * @param MaxUser Maximum number of users.
     */
    public void setMaxUser(Long MaxUser) {
        this.MaxUser = MaxUser;
    }

    /**
     * Get Used number of users. 
     * @return UsedUser Used number of users.
     */
    public Long getUsedUser() {
        return this.UsedUser;
    }

    /**
     * Set Used number of users.
     * @param UsedUser Used number of users.
     */
    public void setUsedUser(Long UsedUser) {
        this.UsedUser = UsedUser;
    }

    public UserQuota() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserQuota(UserQuota source) {
        if (source.MaxUser != null) {
            this.MaxUser = new Long(source.MaxUser);
        }
        if (source.UsedUser != null) {
            this.UsedUser = new Long(source.UsedUser);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaxUser", this.MaxUser);
        this.setParamSimple(map, prefix + "UsedUser", this.UsedUser);

    }
}

