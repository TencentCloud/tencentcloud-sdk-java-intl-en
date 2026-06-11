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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteWebCallbackRequest extends AbstractModel {

    /**
    * ID of the alarm channel callback configuration. Search the alarm channel callback configuration list (https://www.tencentcloud.com/document/api/614/115229?from_cn_redirect=1) to get the ID of the alarm channel callback configuration.
    */
    @SerializedName("WebCallbackId")
    @Expose
    private String WebCallbackId;

    /**
     * Get ID of the alarm channel callback configuration. Search the alarm channel callback configuration list (https://www.tencentcloud.com/document/api/614/115229?from_cn_redirect=1) to get the ID of the alarm channel callback configuration. 
     * @return WebCallbackId ID of the alarm channel callback configuration. Search the alarm channel callback configuration list (https://www.tencentcloud.com/document/api/614/115229?from_cn_redirect=1) to get the ID of the alarm channel callback configuration.
     */
    public String getWebCallbackId() {
        return this.WebCallbackId;
    }

    /**
     * Set ID of the alarm channel callback configuration. Search the alarm channel callback configuration list (https://www.tencentcloud.com/document/api/614/115229?from_cn_redirect=1) to get the ID of the alarm channel callback configuration.
     * @param WebCallbackId ID of the alarm channel callback configuration. Search the alarm channel callback configuration list (https://www.tencentcloud.com/document/api/614/115229?from_cn_redirect=1) to get the ID of the alarm channel callback configuration.
     */
    public void setWebCallbackId(String WebCallbackId) {
        this.WebCallbackId = WebCallbackId;
    }

    public DeleteWebCallbackRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteWebCallbackRequest(DeleteWebCallbackRequest source) {
        if (source.WebCallbackId != null) {
            this.WebCallbackId = new String(source.WebCallbackId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WebCallbackId", this.WebCallbackId);

    }
}

