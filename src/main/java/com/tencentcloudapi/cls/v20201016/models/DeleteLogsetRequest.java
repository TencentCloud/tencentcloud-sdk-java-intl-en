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

public class DeleteLogsetRequest extends AbstractModel {

    /**
    * Log Set Id. It can be obtained through the [logset list](https://www.tencentcloud.com/document/product/614/58624?from_cn_redirect=1).
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
     * Get Log Set Id. It can be obtained through the [logset list](https://www.tencentcloud.com/document/product/614/58624?from_cn_redirect=1). 
     * @return LogsetId Log Set Id. It can be obtained through the [logset list](https://www.tencentcloud.com/document/product/614/58624?from_cn_redirect=1).
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set Log Set Id. It can be obtained through the [logset list](https://www.tencentcloud.com/document/product/614/58624?from_cn_redirect=1).
     * @param LogsetId Log Set Id. It can be obtained through the [logset list](https://www.tencentcloud.com/document/product/614/58624?from_cn_redirect=1).
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    public DeleteLogsetRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteLogsetRequest(DeleteLogsetRequest source) {
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);

    }
}

