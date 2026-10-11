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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyUserManagerPwdRequest extends AbstractModel {

    /**
    * <p>Cluster ID.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Username.</p>
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * <p>Password.</p>
    */
    @SerializedName("PassWord")
    @Expose
    private String PassWord;

    /**
    * <p>Whether to synchronize the password.</p>
    */
    @SerializedName("SyncPwd")
    @Expose
    private Boolean SyncPwd;

    /**
     * Get <p>Cluster ID.</p> 
     * @return InstanceId <p>Cluster ID.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Cluster ID.</p>
     * @param InstanceId <p>Cluster ID.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
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

    /**
     * Get <p>Password.</p> 
     * @return PassWord <p>Password.</p>
     */
    public String getPassWord() {
        return this.PassWord;
    }

    /**
     * Set <p>Password.</p>
     * @param PassWord <p>Password.</p>
     */
    public void setPassWord(String PassWord) {
        this.PassWord = PassWord;
    }

    /**
     * Get <p>Whether to synchronize the password.</p> 
     * @return SyncPwd <p>Whether to synchronize the password.</p>
     */
    public Boolean getSyncPwd() {
        return this.SyncPwd;
    }

    /**
     * Set <p>Whether to synchronize the password.</p>
     * @param SyncPwd <p>Whether to synchronize the password.</p>
     */
    public void setSyncPwd(Boolean SyncPwd) {
        this.SyncPwd = SyncPwd;
    }

    public ModifyUserManagerPwdRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyUserManagerPwdRequest(ModifyUserManagerPwdRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.PassWord != null) {
            this.PassWord = new String(source.PassWord);
        }
        if (source.SyncPwd != null) {
            this.SyncPwd = new Boolean(source.SyncPwd);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "PassWord", this.PassWord);
        this.setParamSimple(map, prefix + "SyncPwd", this.SyncPwd);

    }
}

