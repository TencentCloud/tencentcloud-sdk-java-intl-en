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
package com.tencentcloudapi.mdc.v20200828.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateOutputRistSettings extends AbstractModel {

    /**
    * 
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * 
    */
    @SerializedName("Profile")
    @Expose
    private String Profile;

    /**
    * 
    */
    @SerializedName("Buffer")
    @Expose
    private Long Buffer;

    /**
     * Get  
     * @return Mode 
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set 
     * @param Mode 
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get  
     * @return Profile 
     */
    public String getProfile() {
        return this.Profile;
    }

    /**
     * Set 
     * @param Profile 
     */
    public void setProfile(String Profile) {
        this.Profile = Profile;
    }

    /**
     * Get  
     * @return Buffer 
     */
    public Long getBuffer() {
        return this.Buffer;
    }

    /**
     * Set 
     * @param Buffer 
     */
    public void setBuffer(Long Buffer) {
        this.Buffer = Buffer;
    }

    public CreateOutputRistSettings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateOutputRistSettings(CreateOutputRistSettings source) {
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.Profile != null) {
            this.Profile = new String(source.Profile);
        }
        if (source.Buffer != null) {
            this.Buffer = new Long(source.Buffer);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "Profile", this.Profile);
        this.setParamSimple(map, prefix + "Buffer", this.Buffer);

    }
}

