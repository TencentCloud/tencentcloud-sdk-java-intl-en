/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSegmentsRequest extends AbstractModel {

    /**
    * Application ID
    */
    @SerializedName("BotBizId")
    @Expose
    private String BotBizId;

    /**
    * Document fragment ID.
    */
    @SerializedName("SegBizId")
    @Expose
    private String [] SegBizId;

    /**
     * Get Application ID 
     * @return BotBizId Application ID
     */
    public String getBotBizId() {
        return this.BotBizId;
    }

    /**
     * Set Application ID
     * @param BotBizId Application ID
     */
    public void setBotBizId(String BotBizId) {
        this.BotBizId = BotBizId;
    }

    /**
     * Get Document fragment ID. 
     * @return SegBizId Document fragment ID.
     */
    public String [] getSegBizId() {
        return this.SegBizId;
    }

    /**
     * Set Document fragment ID.
     * @param SegBizId Document fragment ID.
     */
    public void setSegBizId(String [] SegBizId) {
        this.SegBizId = SegBizId;
    }

    public DescribeSegmentsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSegmentsRequest(DescribeSegmentsRequest source) {
        if (source.BotBizId != null) {
            this.BotBizId = new String(source.BotBizId);
        }
        if (source.SegBizId != null) {
            this.SegBizId = new String[source.SegBizId.length];
            for (int i = 0; i < source.SegBizId.length; i++) {
                this.SegBizId[i] = new String(source.SegBizId[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BotBizId", this.BotBizId);
        this.setParamArraySimple(map, prefix + "SegBizId.", this.SegBizId);

    }
}

