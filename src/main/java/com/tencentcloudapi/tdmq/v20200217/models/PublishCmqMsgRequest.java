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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PublishCmqMsgRequest extends AbstractModel {

    /**
    * Topic name
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * Message content. The total message size is up to 1,024 KB.
    */
    @SerializedName("MsgContent")
    @Expose
    private String MsgContent;

    /**
    * Message tag. You can pass in multiple tags or a single route. Each tag or route can contain up to 64 characters.
    */
    @SerializedName("MsgTag")
    @Expose
    private String [] MsgTag;

    /**
     * Get Topic name 
     * @return TopicName Topic name
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set Topic name
     * @param TopicName Topic name
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get Message content. The total message size is up to 1,024 KB. 
     * @return MsgContent Message content. The total message size is up to 1,024 KB.
     */
    public String getMsgContent() {
        return this.MsgContent;
    }

    /**
     * Set Message content. The total message size is up to 1,024 KB.
     * @param MsgContent Message content. The total message size is up to 1,024 KB.
     */
    public void setMsgContent(String MsgContent) {
        this.MsgContent = MsgContent;
    }

    /**
     * Get Message tag. You can pass in multiple tags or a single route. Each tag or route can contain up to 64 characters. 
     * @return MsgTag Message tag. You can pass in multiple tags or a single route. Each tag or route can contain up to 64 characters.
     */
    public String [] getMsgTag() {
        return this.MsgTag;
    }

    /**
     * Set Message tag. You can pass in multiple tags or a single route. Each tag or route can contain up to 64 characters.
     * @param MsgTag Message tag. You can pass in multiple tags or a single route. Each tag or route can contain up to 64 characters.
     */
    public void setMsgTag(String [] MsgTag) {
        this.MsgTag = MsgTag;
    }

    public PublishCmqMsgRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PublishCmqMsgRequest(PublishCmqMsgRequest source) {
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.MsgContent != null) {
            this.MsgContent = new String(source.MsgContent);
        }
        if (source.MsgTag != null) {
            this.MsgTag = new String[source.MsgTag.length];
            for (int i = 0; i < source.MsgTag.length; i++) {
                this.MsgTag[i] = new String(source.MsgTag[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "MsgContent", this.MsgContent);
        this.setParamArraySimple(map, prefix + "MsgTag.", this.MsgTag);

    }
}

