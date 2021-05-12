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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyClusterPasswordRequest extends AbstractModel{

    /**
    * ID of the cluster for which to modify the password
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Old cluster password
    */
    @SerializedName("OldPassword")
    @Expose
    private String OldPassword;

    /**
    * Expected expiration time of old cluster password
    */
    @SerializedName("OldPasswordExpireTime")
    @Expose
    private String OldPasswordExpireTime;

    /**
    * New cluster password, which must contain lowercase letters (a-z), uppercase letters (A-Z), and digits (0-9).
    */
    @SerializedName("NewPassword")
    @Expose
    private String NewPassword;

    /**
    * Update mode. 1: updates password, 2: updates old password expiration time. Default value: 1
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
     * Get ID of the cluster for which to modify the password 
     * @return ClusterId ID of the cluster for which to modify the password
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set ID of the cluster for which to modify the password
     * @param ClusterId ID of the cluster for which to modify the password
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Old cluster password 
     * @return OldPassword Old cluster password
     */
    public String getOldPassword() {
        return this.OldPassword;
    }

    /**
     * Set Old cluster password
     * @param OldPassword Old cluster password
     */
    public void setOldPassword(String OldPassword) {
        this.OldPassword = OldPassword;
    }

    /**
     * Get Expected expiration time of old cluster password 
     * @return OldPasswordExpireTime Expected expiration time of old cluster password
     */
    public String getOldPasswordExpireTime() {
        return this.OldPasswordExpireTime;
    }

    /**
     * Set Expected expiration time of old cluster password
     * @param OldPasswordExpireTime Expected expiration time of old cluster password
     */
    public void setOldPasswordExpireTime(String OldPasswordExpireTime) {
        this.OldPasswordExpireTime = OldPasswordExpireTime;
    }

    /**
     * Get New cluster password, which must contain lowercase letters (a-z), uppercase letters (A-Z), and digits (0-9). 
     * @return NewPassword New cluster password, which must contain lowercase letters (a-z), uppercase letters (A-Z), and digits (0-9).
     */
    public String getNewPassword() {
        return this.NewPassword;
    }

    /**
     * Set New cluster password, which must contain lowercase letters (a-z), uppercase letters (A-Z), and digits (0-9).
     * @param NewPassword New cluster password, which must contain lowercase letters (a-z), uppercase letters (A-Z), and digits (0-9).
     */
    public void setNewPassword(String NewPassword) {
        this.NewPassword = NewPassword;
    }

    /**
     * Get Update mode. 1: updates password, 2: updates old password expiration time. Default value: 1 
     * @return Mode Update mode. 1: updates password, 2: updates old password expiration time. Default value: 1
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set Update mode. 1: updates password, 2: updates old password expiration time. Default value: 1
     * @param Mode Update mode. 1: updates password, 2: updates old password expiration time. Default value: 1
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    public ModifyClusterPasswordRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyClusterPasswordRequest(ModifyClusterPasswordRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.OldPassword != null) {
            this.OldPassword = new String(source.OldPassword);
        }
        if (source.OldPasswordExpireTime != null) {
            this.OldPasswordExpireTime = new String(source.OldPasswordExpireTime);
        }
        if (source.NewPassword != null) {
            this.NewPassword = new String(source.NewPassword);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "OldPassword", this.OldPassword);
        this.setParamSimple(map, prefix + "OldPasswordExpireTime", this.OldPasswordExpireTime);
        this.setParamSimple(map, prefix + "NewPassword", this.NewPassword);
        this.setParamSimple(map, prefix + "Mode", this.Mode);

    }
}

