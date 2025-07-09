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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RateLimitTemplate extends AbstractModel {

    /**
    * Template name
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * Template details
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Detail")
    @Expose
    private RateLimitTemplateDetail Detail;

    /**
     * Get Template name
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Mode Template name
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set Template name
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Mode Template name
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get Template details
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Detail Template details
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public RateLimitTemplateDetail getDetail() {
        return this.Detail;
    }

    /**
     * Set Template details
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Detail Template details
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setDetail(RateLimitTemplateDetail Detail) {
        this.Detail = Detail;
    }

    public RateLimitTemplate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RateLimitTemplate(RateLimitTemplate source) {
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.Detail != null) {
            this.Detail = new RateLimitTemplateDetail(source.Detail);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamObj(map, prefix + "Detail.", this.Detail);

    }
}

