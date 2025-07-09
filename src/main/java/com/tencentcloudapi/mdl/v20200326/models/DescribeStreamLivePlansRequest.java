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

public class DescribeStreamLivePlansRequest extends AbstractModel {

    /**
    * ID of the channel whose events you want to query
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
     * Get ID of the channel whose events you want to query 
     * @return ChannelId ID of the channel whose events you want to query
     */
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set ID of the channel whose events you want to query
     * @param ChannelId ID of the channel whose events you want to query
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
    }

    public DescribeStreamLivePlansRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeStreamLivePlansRequest(DescribeStreamLivePlansRequest source) {
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);

    }
}

