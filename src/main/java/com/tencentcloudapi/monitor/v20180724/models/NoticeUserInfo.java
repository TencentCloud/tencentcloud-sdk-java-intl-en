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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NoticeUserInfo extends AbstractModel {

    /**
    * <p>Tencent Cloud user id, <strong>not account uin</strong></p>
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * <p>Username.</p>
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
     * Get <p>Tencent Cloud user id, <strong>not account uin</strong></p> 
     * @return UserId <p>Tencent Cloud user id, <strong>not account uin</strong></p>
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set <p>Tencent Cloud user id, <strong>not account uin</strong></p>
     * @param UserId <p>Tencent Cloud user id, <strong>not account uin</strong></p>
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get <p>Username.</p> 
     * @return UserName <p>Username.</p>
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set <p>Username.</p>
     * @param UserName <p>Username.</p>
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public NoticeUserInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NoticeUserInfo(NoticeUserInfo source) {
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

