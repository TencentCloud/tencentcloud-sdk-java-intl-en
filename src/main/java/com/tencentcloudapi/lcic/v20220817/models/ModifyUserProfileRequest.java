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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyUserProfileRequest extends AbstractModel {

    /**
    * The ID of the user whose profile will be modified.
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * The new username to use.
    */
    @SerializedName("Nickname")
    @Expose
    private String Nickname;

    /**
    * The URL of the new profile photo.
    */
    @SerializedName("Avatar")
    @Expose
    private String Avatar;

    /**
     * Get The ID of the user whose profile will be modified. 
     * @return UserId The ID of the user whose profile will be modified.
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set The ID of the user whose profile will be modified.
     * @param UserId The ID of the user whose profile will be modified.
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get The new username to use. 
     * @return Nickname The new username to use.
     */
    public String getNickname() {
        return this.Nickname;
    }

    /**
     * Set The new username to use.
     * @param Nickname The new username to use.
     */
    public void setNickname(String Nickname) {
        this.Nickname = Nickname;
    }

    /**
     * Get The URL of the new profile photo. 
     * @return Avatar The URL of the new profile photo.
     */
    public String getAvatar() {
        return this.Avatar;
    }

    /**
     * Set The URL of the new profile photo.
     * @param Avatar The URL of the new profile photo.
     */
    public void setAvatar(String Avatar) {
        this.Avatar = Avatar;
    }

    public ModifyUserProfileRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyUserProfileRequest(ModifyUserProfileRequest source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.Nickname != null) {
            this.Nickname = new String(source.Nickname);
        }
        if (source.Avatar != null) {
            this.Avatar = new String(source.Avatar);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "Nickname", this.Nickname);
        this.setParamSimple(map, prefix + "Avatar", this.Avatar);

    }
}

