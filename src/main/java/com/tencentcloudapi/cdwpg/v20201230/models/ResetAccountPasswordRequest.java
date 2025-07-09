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
package com.tencentcloudapi.cdwpg.v20201230.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResetAccountPasswordRequest extends AbstractModel {

    /**
    * Instanceid.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * The username to be modified.
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * New password.
    */
    @SerializedName("NewPassword")
    @Expose
    private String NewPassword;

    /**
     * Get Instanceid. 
     * @return InstanceId Instanceid.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instanceid.
     * @param InstanceId Instanceid.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get The username to be modified. 
     * @return UserName The username to be modified.
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set The username to be modified.
     * @param UserName The username to be modified.
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get New password. 
     * @return NewPassword New password.
     */
    public String getNewPassword() {
        return this.NewPassword;
    }

    /**
     * Set New password.
     * @param NewPassword New password.
     */
    public void setNewPassword(String NewPassword) {
        this.NewPassword = NewPassword;
    }

    public ResetAccountPasswordRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResetAccountPasswordRequest(ResetAccountPasswordRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.NewPassword != null) {
            this.NewPassword = new String(source.NewPassword);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "NewPassword", this.NewPassword);

    }
}

