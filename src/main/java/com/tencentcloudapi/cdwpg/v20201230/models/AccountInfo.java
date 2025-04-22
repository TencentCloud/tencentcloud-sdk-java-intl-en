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
package com.tencentcloudapi.cdwpg.v20201230.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccountInfo extends AbstractModel {

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Account name.
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Account attribute.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Perms")
    @Expose
    private String [] Perms;

    /**
     * Get Instance ID. 
     * @return InstanceId Instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
     * @param InstanceId Instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Account name. 
     * @return UserName Account name.
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Account name.
     * @param UserName Account name.
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get Account attribute.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Perms Account attribute.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getPerms() {
        return this.Perms;
    }

    /**
     * Set Account attribute.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Perms Account attribute.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPerms(String [] Perms) {
        this.Perms = Perms;
    }

    public AccountInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccountInfo(AccountInfo source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Perms != null) {
            this.Perms = new String[source.Perms.length];
            for (int i = 0; i < source.Perms.length; i++) {
                this.Perms[i] = new String(source.Perms[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamArraySimple(map, prefix + "Perms.", this.Perms);

    }
}

