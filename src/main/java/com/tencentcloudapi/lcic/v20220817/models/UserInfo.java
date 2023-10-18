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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserInfo extends AbstractModel {

    /**
    * 
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Avatar")
    @Expose
    private String Avatar;

    /**
     * Get 
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SdkAppId 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set 
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SdkAppId 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UserId 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UserId 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Name 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Name 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Avatar 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAvatar() {
        return this.Avatar;
    }

    /**
     * Set 
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Avatar 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAvatar(String Avatar) {
        this.Avatar = Avatar;
    }

    public UserInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserInfo(UserInfo source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Avatar != null) {
            this.Avatar = new String(source.Avatar);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Avatar", this.Avatar);

    }
}

