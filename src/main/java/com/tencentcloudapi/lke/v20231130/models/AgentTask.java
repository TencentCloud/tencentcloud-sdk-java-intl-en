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

public class AgentTask extends AbstractModel {

    /**
    * 
    */
    @SerializedName("Index")
    @Expose
    private Long Index;

    /**
    * 
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get  
     * @return Index 
     */
    public Long getIndex() {
        return this.Index;
    }

    /**
     * Set 
     * @param Index 
     */
    public void setIndex(Long Index) {
        this.Index = Index;
    }

    /**
     * Get  
     * @return Content 
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 
     * @param Content 
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get  
     * @return Status 
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 
     * @param Status 
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public AgentTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentTask(AgentTask source) {
        if (source.Index != null) {
            this.Index = new Long(source.Index);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Index", this.Index);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

