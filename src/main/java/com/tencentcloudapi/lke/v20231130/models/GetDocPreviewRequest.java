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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetDocPreviewRequest extends AbstractModel {

    /**
    * Document BizID.
    */
    @SerializedName("DocBizId")
    @Expose
    private String DocBizId;

    /**
    * Application ID.
    */
    @SerializedName("BotBizId")
    @Expose
    private String BotBizId;

    /**
    * Storage type: offline - offline file; realtime - real-time file. If empty, it defaults to offline.
    */
    @SerializedName("TypeKey")
    @Expose
    private String TypeKey;

    /**
     * Get Document BizID. 
     * @return DocBizId Document BizID.
     */
    public String getDocBizId() {
        return this.DocBizId;
    }

    /**
     * Set Document BizID.
     * @param DocBizId Document BizID.
     */
    public void setDocBizId(String DocBizId) {
        this.DocBizId = DocBizId;
    }

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
     * Get Storage type: offline - offline file; realtime - real-time file. If empty, it defaults to offline. 
     * @return TypeKey Storage type: offline - offline file; realtime - real-time file. If empty, it defaults to offline.
     */
    public String getTypeKey() {
        return this.TypeKey;
    }

    /**
     * Set Storage type: offline - offline file; realtime - real-time file. If empty, it defaults to offline.
     * @param TypeKey Storage type: offline - offline file; realtime - real-time file. If empty, it defaults to offline.
     */
    public void setTypeKey(String TypeKey) {
        this.TypeKey = TypeKey;
    }

    public GetDocPreviewRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetDocPreviewRequest(GetDocPreviewRequest source) {
        if (source.DocBizId != null) {
            this.DocBizId = new String(source.DocBizId);
        }
        if (source.BotBizId != null) {
            this.BotBizId = new String(source.BotBizId);
        }
        if (source.TypeKey != null) {
            this.TypeKey = new String(source.TypeKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DocBizId", this.DocBizId);
        this.setParamSimple(map, prefix + "BotBizId", this.BotBizId);
        this.setParamSimple(map, prefix + "TypeKey", this.TypeKey);

    }
}

