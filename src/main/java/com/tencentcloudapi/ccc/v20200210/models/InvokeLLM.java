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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InvokeLLM extends AbstractModel {

    /**
    * Specifies the content of the LLM request.
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * Whether the text is allowed to interrupt the robot speaking.
    */
    @SerializedName("Interrupt")
    @Expose
    private Boolean Interrupt;

    /**
     * Get Specifies the content of the LLM request. 
     * @return Content Specifies the content of the LLM request.
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set Specifies the content of the LLM request.
     * @param Content Specifies the content of the LLM request.
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get Whether the text is allowed to interrupt the robot speaking. 
     * @return Interrupt Whether the text is allowed to interrupt the robot speaking.
     */
    public Boolean getInterrupt() {
        return this.Interrupt;
    }

    /**
     * Set Whether the text is allowed to interrupt the robot speaking.
     * @param Interrupt Whether the text is allowed to interrupt the robot speaking.
     */
    public void setInterrupt(Boolean Interrupt) {
        this.Interrupt = Interrupt;
    }

    public InvokeLLM() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InvokeLLM(InvokeLLM source) {
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Interrupt != null) {
            this.Interrupt = new Boolean(source.Interrupt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Interrupt", this.Interrupt);

    }
}

