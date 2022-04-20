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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyConsumerRequest extends AbstractModel{

    /**
    * Log topic ID bound to the task
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * Whether the shipping task takes effect (default: no)
    */
    @SerializedName("Effective")
    @Expose
    private Boolean Effective;

    /**
    * Whether to ship metadata. Default value: `false`
    */
    @SerializedName("NeedContent")
    @Expose
    private Boolean NeedContent;

    /**
    * Metadata to ship if `NeedContent` is `true`
    */
    @SerializedName("Content")
    @Expose
    private ConsumerContent Content;

    /**
    * CKafka information
    */
    @SerializedName("Ckafka")
    @Expose
    private Ckafka Ckafka;

    /**
     * Get Log topic ID bound to the task 
     * @return TopicId Log topic ID bound to the task
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set Log topic ID bound to the task
     * @param TopicId Log topic ID bound to the task
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get Whether the shipping task takes effect (default: no) 
     * @return Effective Whether the shipping task takes effect (default: no)
     */
    public Boolean getEffective() {
        return this.Effective;
    }

    /**
     * Set Whether the shipping task takes effect (default: no)
     * @param Effective Whether the shipping task takes effect (default: no)
     */
    public void setEffective(Boolean Effective) {
        this.Effective = Effective;
    }

    /**
     * Get Whether to ship metadata. Default value: `false` 
     * @return NeedContent Whether to ship metadata. Default value: `false`
     */
    public Boolean getNeedContent() {
        return this.NeedContent;
    }

    /**
     * Set Whether to ship metadata. Default value: `false`
     * @param NeedContent Whether to ship metadata. Default value: `false`
     */
    public void setNeedContent(Boolean NeedContent) {
        this.NeedContent = NeedContent;
    }

    /**
     * Get Metadata to ship if `NeedContent` is `true` 
     * @return Content Metadata to ship if `NeedContent` is `true`
     */
    public ConsumerContent getContent() {
        return this.Content;
    }

    /**
     * Set Metadata to ship if `NeedContent` is `true`
     * @param Content Metadata to ship if `NeedContent` is `true`
     */
    public void setContent(ConsumerContent Content) {
        this.Content = Content;
    }

    /**
     * Get CKafka information 
     * @return Ckafka CKafka information
     */
    public Ckafka getCkafka() {
        return this.Ckafka;
    }

    /**
     * Set CKafka information
     * @param Ckafka CKafka information
     */
    public void setCkafka(Ckafka Ckafka) {
        this.Ckafka = Ckafka;
    }

    public ModifyConsumerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyConsumerRequest(ModifyConsumerRequest source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.Effective != null) {
            this.Effective = new Boolean(source.Effective);
        }
        if (source.NeedContent != null) {
            this.NeedContent = new Boolean(source.NeedContent);
        }
        if (source.Content != null) {
            this.Content = new ConsumerContent(source.Content);
        }
        if (source.Ckafka != null) {
            this.Ckafka = new Ckafka(source.Ckafka);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "Effective", this.Effective);
        this.setParamSimple(map, prefix + "NeedContent", this.NeedContent);
        this.setParamObj(map, prefix + "Content.", this.Content);
        this.setParamObj(map, prefix + "Ckafka.", this.Ckafka);

    }
}

