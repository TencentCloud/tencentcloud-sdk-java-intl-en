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
package com.tencentcloudapi.controlcenter.v20230110.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BaselineInfoItem extends AbstractModel {

    /**
    * Specifies the unique identifier for account factory baseline item, can only contain english letters, digits, and @, ,._[]-:()()[]+=., with a length of 2-128 characters.
    */
    @SerializedName("Identifier")
    @Expose
    private String Identifier;

    /**
    * Account factory baseline item configuration. different baseline item configuration parameters.
    */
    @SerializedName("Configuration")
    @Expose
    private String Configuration;

    /**
    * Specifies the number of accounts for baseline applications.
    */
    @SerializedName("ApplyCount")
    @Expose
    private Long ApplyCount;

    /**
     * Get Specifies the unique identifier for account factory baseline item, can only contain english letters, digits, and @, ,._[]-:()()[]+=., with a length of 2-128 characters. 
     * @return Identifier Specifies the unique identifier for account factory baseline item, can only contain english letters, digits, and @, ,._[]-:()()[]+=., with a length of 2-128 characters.
     */
    public String getIdentifier() {
        return this.Identifier;
    }

    /**
     * Set Specifies the unique identifier for account factory baseline item, can only contain english letters, digits, and @, ,._[]-:()()[]+=., with a length of 2-128 characters.
     * @param Identifier Specifies the unique identifier for account factory baseline item, can only contain english letters, digits, and @, ,._[]-:()()[]+=., with a length of 2-128 characters.
     */
    public void setIdentifier(String Identifier) {
        this.Identifier = Identifier;
    }

    /**
     * Get Account factory baseline item configuration. different baseline item configuration parameters. 
     * @return Configuration Account factory baseline item configuration. different baseline item configuration parameters.
     */
    public String getConfiguration() {
        return this.Configuration;
    }

    /**
     * Set Account factory baseline item configuration. different baseline item configuration parameters.
     * @param Configuration Account factory baseline item configuration. different baseline item configuration parameters.
     */
    public void setConfiguration(String Configuration) {
        this.Configuration = Configuration;
    }

    /**
     * Get Specifies the number of accounts for baseline applications. 
     * @return ApplyCount Specifies the number of accounts for baseline applications.
     */
    public Long getApplyCount() {
        return this.ApplyCount;
    }

    /**
     * Set Specifies the number of accounts for baseline applications.
     * @param ApplyCount Specifies the number of accounts for baseline applications.
     */
    public void setApplyCount(Long ApplyCount) {
        this.ApplyCount = ApplyCount;
    }

    public BaselineInfoItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselineInfoItem(BaselineInfoItem source) {
        if (source.Identifier != null) {
            this.Identifier = new String(source.Identifier);
        }
        if (source.Configuration != null) {
            this.Configuration = new String(source.Configuration);
        }
        if (source.ApplyCount != null) {
            this.ApplyCount = new Long(source.ApplyCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Identifier", this.Identifier);
        this.setParamSimple(map, prefix + "Configuration", this.Configuration);
        this.setParamSimple(map, prefix + "ApplyCount", this.ApplyCount);

    }
}

