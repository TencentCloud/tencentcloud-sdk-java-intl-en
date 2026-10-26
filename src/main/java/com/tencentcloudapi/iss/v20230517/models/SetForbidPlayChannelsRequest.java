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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SetForbidPlayChannelsRequest extends AbstractModel {

    /**
    * Channel parameters to be disabled. Up to 200 channels can be set at a time.
    */
    @SerializedName("Channels")
    @Expose
    private SetForbidplayChannelParam [] Channels;

    /**
    * User uin, which can be the uin of a sub-user or a root user
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
     * Get Channel parameters to be disabled. Up to 200 channels can be set at a time. 
     * @return Channels Channel parameters to be disabled. Up to 200 channels can be set at a time.
     */
    public SetForbidplayChannelParam [] getChannels() {
        return this.Channels;
    }

    /**
     * Set Channel parameters to be disabled. Up to 200 channels can be set at a time.
     * @param Channels Channel parameters to be disabled. Up to 200 channels can be set at a time.
     */
    public void setChannels(SetForbidplayChannelParam [] Channels) {
        this.Channels = Channels;
    }

    /**
     * Get User uin, which can be the uin of a sub-user or a root user 
     * @return UserId User uin, which can be the uin of a sub-user or a root user
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set User uin, which can be the uin of a sub-user or a root user
     * @param UserId User uin, which can be the uin of a sub-user or a root user
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    public SetForbidPlayChannelsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SetForbidPlayChannelsRequest(SetForbidPlayChannelsRequest source) {
        if (source.Channels != null) {
            this.Channels = new SetForbidplayChannelParam[source.Channels.length];
            for (int i = 0; i < source.Channels.length; i++) {
                this.Channels[i] = new SetForbidplayChannelParam(source.Channels[i]);
            }
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Channels.", this.Channels);
        this.setParamSimple(map, prefix + "UserId", this.UserId);

    }
}

