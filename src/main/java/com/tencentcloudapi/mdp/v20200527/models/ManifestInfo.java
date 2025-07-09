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
package com.tencentcloudapi.mdp.v20200527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ManifestInfo extends AbstractModel {

    /**
    * Time window, in seconds.
    */
    @SerializedName("Windows")
    @Expose
    private Long Windows;

    /**
    * Enter the format of the output advertising tag. Optional values are: Date Range and Enhanced SCTE-35.
    */
    @SerializedName("AdMarkupType")
    @Expose
    private String AdMarkupType;

    /**
     * Get Time window, in seconds. 
     * @return Windows Time window, in seconds.
     */
    public Long getWindows() {
        return this.Windows;
    }

    /**
     * Set Time window, in seconds.
     * @param Windows Time window, in seconds.
     */
    public void setWindows(Long Windows) {
        this.Windows = Windows;
    }

    /**
     * Get Enter the format of the output advertising tag. Optional values are: Date Range and Enhanced SCTE-35. 
     * @return AdMarkupType Enter the format of the output advertising tag. Optional values are: Date Range and Enhanced SCTE-35.
     */
    public String getAdMarkupType() {
        return this.AdMarkupType;
    }

    /**
     * Set Enter the format of the output advertising tag. Optional values are: Date Range and Enhanced SCTE-35.
     * @param AdMarkupType Enter the format of the output advertising tag. Optional values are: Date Range and Enhanced SCTE-35.
     */
    public void setAdMarkupType(String AdMarkupType) {
        this.AdMarkupType = AdMarkupType;
    }

    public ManifestInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ManifestInfo(ManifestInfo source) {
        if (source.Windows != null) {
            this.Windows = new Long(source.Windows);
        }
        if (source.AdMarkupType != null) {
            this.AdMarkupType = new String(source.AdMarkupType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Windows", this.Windows);
        this.setParamSimple(map, prefix + "AdMarkupType", this.AdMarkupType);

    }
}

