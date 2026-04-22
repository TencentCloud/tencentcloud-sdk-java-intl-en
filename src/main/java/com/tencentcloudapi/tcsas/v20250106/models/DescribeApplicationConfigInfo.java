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
package com.tencentcloudapi.tcsas.v20250106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeApplicationConfigInfo extends AbstractModel {

    /**
    * Android configuration list
    */
    @SerializedName("AndroidConfig")
    @Expose
    private ApplicationConfigInfo [] AndroidConfig;

    /**
    * iOS configuration list
    */
    @SerializedName("IosConfig")
    @Expose
    private ApplicationConfigInfo [] IosConfig;

    /**
     * Get Android configuration list 
     * @return AndroidConfig Android configuration list
     */
    public ApplicationConfigInfo [] getAndroidConfig() {
        return this.AndroidConfig;
    }

    /**
     * Set Android configuration list
     * @param AndroidConfig Android configuration list
     */
    public void setAndroidConfig(ApplicationConfigInfo [] AndroidConfig) {
        this.AndroidConfig = AndroidConfig;
    }

    /**
     * Get iOS configuration list 
     * @return IosConfig iOS configuration list
     */
    public ApplicationConfigInfo [] getIosConfig() {
        return this.IosConfig;
    }

    /**
     * Set iOS configuration list
     * @param IosConfig iOS configuration list
     */
    public void setIosConfig(ApplicationConfigInfo [] IosConfig) {
        this.IosConfig = IosConfig;
    }

    public DescribeApplicationConfigInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeApplicationConfigInfo(DescribeApplicationConfigInfo source) {
        if (source.AndroidConfig != null) {
            this.AndroidConfig = new ApplicationConfigInfo[source.AndroidConfig.length];
            for (int i = 0; i < source.AndroidConfig.length; i++) {
                this.AndroidConfig[i] = new ApplicationConfigInfo(source.AndroidConfig[i]);
            }
        }
        if (source.IosConfig != null) {
            this.IosConfig = new ApplicationConfigInfo[source.IosConfig.length];
            for (int i = 0; i < source.IosConfig.length; i++) {
                this.IosConfig[i] = new ApplicationConfigInfo(source.IosConfig[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "AndroidConfig.", this.AndroidConfig);
        this.setParamArrayObj(map, prefix + "IosConfig.", this.IosConfig);

    }
}

