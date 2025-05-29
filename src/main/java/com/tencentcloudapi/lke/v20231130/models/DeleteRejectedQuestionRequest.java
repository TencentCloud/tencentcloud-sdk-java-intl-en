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

public class DeleteRejectedQuestionRequest extends AbstractModel {

    /**
    * Application ID.
    */
    @SerializedName("BotBizId")
    @Expose
    private String BotBizId;

    /**
    * The unique ID of the data source for the rejected question.



    */
    @SerializedName("RejectedBizIds")
    @Expose
    private String [] RejectedBizIds;

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
     * Get The unique ID of the data source for the rejected question.


 
     * @return RejectedBizIds The unique ID of the data source for the rejected question.



     */
    public String [] getRejectedBizIds() {
        return this.RejectedBizIds;
    }

    /**
     * Set The unique ID of the data source for the rejected question.



     * @param RejectedBizIds The unique ID of the data source for the rejected question.



     */
    public void setRejectedBizIds(String [] RejectedBizIds) {
        this.RejectedBizIds = RejectedBizIds;
    }

    public DeleteRejectedQuestionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteRejectedQuestionRequest(DeleteRejectedQuestionRequest source) {
        if (source.BotBizId != null) {
            this.BotBizId = new String(source.BotBizId);
        }
        if (source.RejectedBizIds != null) {
            this.RejectedBizIds = new String[source.RejectedBizIds.length];
            for (int i = 0; i < source.RejectedBizIds.length; i++) {
                this.RejectedBizIds[i] = new String(source.RejectedBizIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BotBizId", this.BotBizId);
        this.setParamArraySimple(map, prefix + "RejectedBizIds.", this.RejectedBizIds);

    }
}

