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

public class ConversationAgentTask extends AbstractModel {

    /**
    * <p>Task content</p>
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * <p>Task number</p>
    */
    @SerializedName("Index")
    @Expose
    private String Index;

    /**
    * <p>Task status. pending: to be executed, processing: processing, success: completed, failed: processing failure, stop: canceled</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get <p>Task content</p> 
     * @return Content <p>Task content</p>
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set <p>Task content</p>
     * @param Content <p>Task content</p>
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get <p>Task number</p> 
     * @return Index <p>Task number</p>
     */
    public String getIndex() {
        return this.Index;
    }

    /**
     * Set <p>Task number</p>
     * @param Index <p>Task number</p>
     */
    public void setIndex(String Index) {
        this.Index = Index;
    }

    /**
     * Get <p>Task status. pending: to be executed, processing: processing, success: completed, failed: processing failure, stop: canceled</p> 
     * @return Status <p>Task status. pending: to be executed, processing: processing, success: completed, failed: processing failure, stop: canceled</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Task status. pending: to be executed, processing: processing, success: completed, failed: processing failure, stop: canceled</p>
     * @param Status <p>Task status. pending: to be executed, processing: processing, success: completed, failed: processing failure, stop: canceled</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public ConversationAgentTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConversationAgentTask(ConversationAgentTask source) {
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Index != null) {
            this.Index = new String(source.Index);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Index", this.Index);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

