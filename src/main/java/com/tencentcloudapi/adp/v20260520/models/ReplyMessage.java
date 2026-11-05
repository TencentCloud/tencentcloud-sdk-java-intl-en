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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReplyMessage extends AbstractModel {

    /**
    * Message array containing multiple message objects
    */
    @SerializedName("ContentList")
    @Expose
    private ReplyContent [] ContentList;

    /**
     * Get Message array containing multiple message objects 
     * @return ContentList Message array containing multiple message objects
     */
    public ReplyContent [] getContentList() {
        return this.ContentList;
    }

    /**
     * Set Message array containing multiple message objects
     * @param ContentList Message array containing multiple message objects
     */
    public void setContentList(ReplyContent [] ContentList) {
        this.ContentList = ContentList;
    }

    public ReplyMessage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReplyMessage(ReplyMessage source) {
        if (source.ContentList != null) {
            this.ContentList = new ReplyContent[source.ContentList.length];
            for (int i = 0; i < source.ContentList.length; i++) {
                this.ContentList[i] = new ReplyContent(source.ContentList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ContentList.", this.ContentList);

    }
}

