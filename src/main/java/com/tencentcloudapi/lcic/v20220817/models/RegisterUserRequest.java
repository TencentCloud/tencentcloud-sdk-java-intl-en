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

public class RegisterUserRequest extends AbstractModel {

    /**
    * LCIC SdkAppId	
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * Username	
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * User's ID in the customer system, which should be unique under the same application	
    */
    @SerializedName("OriginId")
    @Expose
    private String OriginId;

    /**
    * User's profile photo	
    */
    @SerializedName("Avatar")
    @Expose
    private String Avatar;

    /**
     * Get LCIC SdkAppId	 
     * @return SdkAppId LCIC SdkAppId	
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set LCIC SdkAppId	
     * @param SdkAppId LCIC SdkAppId	
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get Username	 
     * @return Name Username	
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Username	
     * @param Name Username	
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get User's ID in the customer system, which should be unique under the same application	 
     * @return OriginId User's ID in the customer system, which should be unique under the same application	
     */
    public String getOriginId() {
        return this.OriginId;
    }

    /**
     * Set User's ID in the customer system, which should be unique under the same application	
     * @param OriginId User's ID in the customer system, which should be unique under the same application	
     */
    public void setOriginId(String OriginId) {
        this.OriginId = OriginId;
    }

    /**
     * Get User's profile photo	 
     * @return Avatar User's profile photo	
     */
    public String getAvatar() {
        return this.Avatar;
    }

    /**
     * Set User's profile photo	
     * @param Avatar User's profile photo	
     */
    public void setAvatar(String Avatar) {
        this.Avatar = Avatar;
    }

    public RegisterUserRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegisterUserRequest(RegisterUserRequest source) {
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

