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

public class AddStreamAuthData extends AbstractModel {

    /**
    * Authentication configuration ID (uuid).
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Whether to enable playback authentication. Valid values: `1`: enable, `0`: disable.
    */
    @SerializedName("PullState")
    @Expose
    private Long PullState;

    /**
    * Playback key (alphanumeric only, length: 0-10 characters)
    */
    @SerializedName("PullSecret")
    @Expose
    private String PullSecret;

    /**
    * Playback expiration time (unit: minute)
    */
    @SerializedName("PullExpired")
    @Expose
    private Long PullExpired;

    /**
    * Whether to enable stream authentication (1: enable, 0: disable)
    */
    @SerializedName("PushState")
    @Expose
    private Long PushState;

    /**
    * Stream key (only alphanumeric characters are supported, with a length of 0-10 characters)
    */
    @SerializedName("PushSecret")
    @Expose
    private String PushSecret;

    /**
    * Push expiration time (unit: minute)
    */
    @SerializedName("PushExpired")
    @Expose
    private Long PushExpired;

    /**
    * User ID.
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
     * Get Authentication configuration ID (uuid). 
     * @return Id Authentication configuration ID (uuid).
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Authentication configuration ID (uuid).
     * @param Id Authentication configuration ID (uuid).
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Whether to enable playback authentication. Valid values: `1`: enable, `0`: disable. 
     * @return PullState Whether to enable playback authentication. Valid values: `1`: enable, `0`: disable.
     */
    public Long getPullState() {
        return this.PullState;
    }

    /**
     * Set Whether to enable playback authentication. Valid values: `1`: enable, `0`: disable.
     * @param PullState Whether to enable playback authentication. Valid values: `1`: enable, `0`: disable.
     */
    public void setPullState(Long PullState) {
        this.PullState = PullState;
    }

    /**
     * Get Playback key (alphanumeric only, length: 0-10 characters) 
     * @return PullSecret Playback key (alphanumeric only, length: 0-10 characters)
     */
    public String getPullSecret() {
        return this.PullSecret;
    }

    /**
     * Set Playback key (alphanumeric only, length: 0-10 characters)
     * @param PullSecret Playback key (alphanumeric only, length: 0-10 characters)
     */
    public void setPullSecret(String PullSecret) {
        this.PullSecret = PullSecret;
    }

    /**
     * Get Playback expiration time (unit: minute) 
     * @return PullExpired Playback expiration time (unit: minute)
     */
    public Long getPullExpired() {
        return this.PullExpired;
    }

    /**
     * Set Playback expiration time (unit: minute)
     * @param PullExpired Playback expiration time (unit: minute)
     */
    public void setPullExpired(Long PullExpired) {
        this.PullExpired = PullExpired;
    }

    /**
     * Get Whether to enable stream authentication (1: enable, 0: disable) 
     * @return PushState Whether to enable stream authentication (1: enable, 0: disable)
     */
    public Long getPushState() {
        return this.PushState;
    }

    /**
     * Set Whether to enable stream authentication (1: enable, 0: disable)
     * @param PushState Whether to enable stream authentication (1: enable, 0: disable)
     */
    public void setPushState(Long PushState) {
        this.PushState = PushState;
    }

    /**
     * Get Stream key (only alphanumeric characters are supported, with a length of 0-10 characters) 
     * @return PushSecret Stream key (only alphanumeric characters are supported, with a length of 0-10 characters)
     */
    public String getPushSecret() {
        return this.PushSecret;
    }

    /**
     * Set Stream key (only alphanumeric characters are supported, with a length of 0-10 characters)
     * @param PushSecret Stream key (only alphanumeric characters are supported, with a length of 0-10 characters)
     */
    public void setPushSecret(String PushSecret) {
        this.PushSecret = PushSecret;
    }

    /**
     * Get Push expiration time (unit: minute) 
     * @return PushExpired Push expiration time (unit: minute)
     */
    public Long getPushExpired() {
        return this.PushExpired;
    }

    /**
     * Set Push expiration time (unit: minute)
     * @param PushExpired Push expiration time (unit: minute)
     */
    public void setPushExpired(Long PushExpired) {
        this.PushExpired = PushExpired;
    }

    /**
     * Get User ID. 
     * @return AppId User ID.
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set User ID.
     * @param AppId User ID.
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    public AddStreamAuthData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddStreamAuthData(AddStreamAuthData source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.PullState != null) {
            this.PullState = new Long(source.PullState);
        }
        if (source.PullSecret != null) {
            this.PullSecret = new String(source.PullSecret);
        }
        if (source.PullExpired != null) {
            this.PullExpired = new Long(source.PullExpired);
        }
        if (source.PushState != null) {
            this.PushState = new Long(source.PushState);
        }
        if (source.PushSecret != null) {
            this.PushSecret = new String(source.PushSecret);
        }
        if (source.PushExpired != null) {
            this.PushExpired = new Long(source.PushExpired);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "PullState", this.PullState);
        this.setParamSimple(map, prefix + "PullSecret", this.PullSecret);
        this.setParamSimple(map, prefix + "PullExpired", this.PullExpired);
        this.setParamSimple(map, prefix + "PushState", this.PushState);
        this.setParamSimple(map, prefix + "PushSecret", this.PushSecret);
        this.setParamSimple(map, prefix + "PushExpired", this.PushExpired);
        this.setParamSimple(map, prefix + "AppId", this.AppId);

    }
}

