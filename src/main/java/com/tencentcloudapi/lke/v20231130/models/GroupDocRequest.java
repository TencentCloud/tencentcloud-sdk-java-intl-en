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

public class GroupDocRequest extends AbstractModel {

    /**
    * Application ID.
    */
    @SerializedName("BotBizId")
    @Expose
    private String BotBizId;

    /**
    * List of business IDs of operation objects.
    */
    @SerializedName("BizIds")
    @Expose
    private String [] BizIds;

    /**
    * Group ID.
    */
    @SerializedName("CateBizId")
    @Expose
    private String CateBizId;

    /**
     * Get Application ID. 
     * @return BotBizId Application ID.
     */
    public String getBotBizId() {
        return this.BotBizId;
    }

    /**
     * Set Application ID.
     * @param BotBizId Application ID.
     */
    public void setBotBizId(String BotBizId) {
        this.BotBizId = BotBizId;
    }

    /**
     * Get List of business IDs of operation objects. 
     * @return BizIds List of business IDs of operation objects.
     */
    public String [] getBizIds() {
        return this.BizIds;
    }

    /**
     * Set List of business IDs of operation objects.
     * @param BizIds List of business IDs of operation objects.
     */
    public void setBizIds(String [] BizIds) {
        this.BizIds = BizIds;
    }

    /**
     * Get Group ID. 
     * @return CateBizId Group ID.
     */
    public String getCateBizId() {
        return this.CateBizId;
    }

    /**
     * Set Group ID.
     * @param CateBizId Group ID.
     */
    public void setCateBizId(String CateBizId) {
        this.CateBizId = CateBizId;
    }

    public GroupDocRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GroupDocRequest(GroupDocRequest source) {
        if (source.BotBizId != null) {
            this.BotBizId = new String(source.BotBizId);
        }
        if (source.BizIds != null) {
            this.BizIds = new String[source.BizIds.length];
            for (int i = 0; i < source.BizIds.length; i++) {
                this.BizIds[i] = new String(source.BizIds[i]);
            }
        }
        if (source.CateBizId != null) {
            this.CateBizId = new String(source.CateBizId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BotBizId", this.BotBizId);
        this.setParamArraySimple(map, prefix + "BizIds.", this.BizIds);
        this.setParamSimple(map, prefix + "CateBizId", this.CateBizId);

    }
}

