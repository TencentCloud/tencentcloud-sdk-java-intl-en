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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeniedAction extends AbstractModel {

    /**
    * Restricted operation name.
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * Restricted operation message code.
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * Restricted operation message.
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
     * Get Restricted operation name. 
     * @return Action Restricted operation name.
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Restricted operation name.
     * @param Action Restricted operation name.
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get Restricted operation message code. 
     * @return Code Restricted operation message code.
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set Restricted operation message code.
     * @param Code Restricted operation message code.
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get Restricted operation message. 
     * @return Message Restricted operation message.
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Restricted operation message.
     * @param Message Restricted operation message.
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    public DeniedAction() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeniedAction(DeniedAction source) {
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Message", this.Message);

    }
}

