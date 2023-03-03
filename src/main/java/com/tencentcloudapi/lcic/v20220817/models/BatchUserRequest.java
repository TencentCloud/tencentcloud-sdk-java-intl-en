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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchUserRequest extends AbstractModel{

    /**
    * The SDKAppID assigned by LCIC.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * The username.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * The user’s ID in your system, which must be unique across the same application.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OriginId")
    @Expose
    private String OriginId;

    /**
    * The user’s profile photo.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Avatar")
    @Expose
    private String Avatar;

    /**
     * Get The SDKAppID assigned by LCIC.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SdkAppId The SDKAppID assigned by LCIC.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set The SDKAppID assigned by LCIC.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param SdkAppId The SDKAppID assigned by LCIC.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get The username.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Name The username.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set The username.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param Name The username.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get The user’s ID in your system, which must be unique across the same application.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OriginId The user’s ID in your system, which must be unique across the same application.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getOriginId() {
        return this.OriginId;
    }

    /**
     * Set The user’s ID in your system, which must be unique across the same application.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param OriginId The user’s ID in your system, which must be unique across the same application.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOriginId(String OriginId) {
        this.OriginId = OriginId;
    }

    /**
     * Get The user’s profile photo.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Avatar The user’s profile photo.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAvatar() {
        return this.Avatar;
    }

    /**
     * Set The user’s profile photo.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param Avatar The user’s profile photo.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAvatar(String Avatar) {
        this.Avatar = Avatar;
    }

    public BatchUserRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchUserRequest(BatchUserRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.OriginId != null) {
            this.OriginId = new String(source.OriginId);
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
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "OriginId", this.OriginId);
        this.setParamSimple(map, prefix + "Avatar", this.Avatar);

    }
}

