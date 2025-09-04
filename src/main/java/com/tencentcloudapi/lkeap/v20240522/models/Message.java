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
package com.tencentcloudapi.lkeap.v20240522.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Message extends AbstractModel {

    /**
    * Role.
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * Content.
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * Chain of thought content. The ReasoningConent parameter only supports output parameters, and is only returned by the deepseek-r1 model.
    */
    @SerializedName("ReasoningContent")
    @Expose
    private String ReasoningContent;

    /**
     * Get Role. 
     * @return Role Role.
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set Role.
     * @param Role Role.
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Get Content. 
     * @return Content Content.
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set Content.
     * @param Content Content.
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get Chain of thought content. The ReasoningConent parameter only supports output parameters, and is only returned by the deepseek-r1 model. 
     * @return ReasoningContent Chain of thought content. The ReasoningConent parameter only supports output parameters, and is only returned by the deepseek-r1 model.
     */
    public String getReasoningContent() {
        return this.ReasoningContent;
    }

    /**
     * Set Chain of thought content. The ReasoningConent parameter only supports output parameters, and is only returned by the deepseek-r1 model.
     * @param ReasoningContent Chain of thought content. The ReasoningConent parameter only supports output parameters, and is only returned by the deepseek-r1 model.
     */
    public void setReasoningContent(String ReasoningContent) {
        this.ReasoningContent = ReasoningContent;
    }

    public Message() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Message(Message source) {
        if (source.Role != null) {
            this.Role = new String(source.Role);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.ReasoningContent != null) {
            this.ReasoningContent = new String(source.ReasoningContent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "ReasoningContent", this.ReasoningContent);

    }
}

