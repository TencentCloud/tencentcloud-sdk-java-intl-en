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
package com.tencentcloudapi.mdl.v20200326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EventSettingsDestinationReq extends AbstractModel {

    /**
    * URL of the COS bucket to save recording files
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
     * Get URL of the COS bucket to save recording files 
     * @return Url URL of the COS bucket to save recording files
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set URL of the COS bucket to save recording files
     * @param Url URL of the COS bucket to save recording files
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    public EventSettingsDestinationReq() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EventSettingsDestinationReq(EventSettingsDestinationReq source) {
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);

    }
}

