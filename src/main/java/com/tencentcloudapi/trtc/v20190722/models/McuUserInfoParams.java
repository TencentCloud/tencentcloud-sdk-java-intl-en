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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class McuUserInfoParams extends AbstractModel {

    /**
    * The user information.
    */
    @SerializedName("UserInfo")
    @Expose
    private MixUserInfo UserInfo;

    /**
    * Audio mix volume adjustment. value ranges from 0 to 100. 100 indicates the original uplink volume. the default value is 100 if left blank. a lower value results in a lower volume.
Note: this parameter takes effect only when configured in the volume allowlist and is unavailable in other scenarios.
    */
    @SerializedName("SoundLevel")
    @Expose
    private Long SoundLevel;

    /**
     * Get The user information. 
     * @return UserInfo The user information.
     */
    public MixUserInfo getUserInfo() {
        return this.UserInfo;
    }

    /**
     * Set The user information.
     * @param UserInfo The user information.
     */
    public void setUserInfo(MixUserInfo UserInfo) {
        this.UserInfo = UserInfo;
    }

    /**
     * Get Audio mix volume adjustment. value ranges from 0 to 100. 100 indicates the original uplink volume. the default value is 100 if left blank. a lower value results in a lower volume.
Note: this parameter takes effect only when configured in the volume allowlist and is unavailable in other scenarios. 
     * @return SoundLevel Audio mix volume adjustment. value ranges from 0 to 100. 100 indicates the original uplink volume. the default value is 100 if left blank. a lower value results in a lower volume.
Note: this parameter takes effect only when configured in the volume allowlist and is unavailable in other scenarios.
     */
    public Long getSoundLevel() {
        return this.SoundLevel;
    }

    /**
     * Set Audio mix volume adjustment. value ranges from 0 to 100. 100 indicates the original uplink volume. the default value is 100 if left blank. a lower value results in a lower volume.
Note: this parameter takes effect only when configured in the volume allowlist and is unavailable in other scenarios.
     * @param SoundLevel Audio mix volume adjustment. value ranges from 0 to 100. 100 indicates the original uplink volume. the default value is 100 if left blank. a lower value results in a lower volume.
Note: this parameter takes effect only when configured in the volume allowlist and is unavailable in other scenarios.
     */
    public void setSoundLevel(Long SoundLevel) {
        this.SoundLevel = SoundLevel;
    }

    public McuUserInfoParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public McuUserInfoParams(McuUserInfoParams source) {
        if (source.UserInfo != null) {
            this.UserInfo = new MixUserInfo(source.UserInfo);
        }
        if (source.SoundLevel != null) {
            this.SoundLevel = new Long(source.SoundLevel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "UserInfo.", this.UserInfo);
        this.setParamSimple(map, prefix + "SoundLevel", this.SoundLevel);

    }
}

