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

public class QueryRewriteRequest extends AbstractModel {

    /**
    * The multi-round historical conversation that needs to be rewritten. Each round of historical conversation should include paired inputs of user (question) and assistant (answer). Due to the character limit of the model, a maximum of 4 rounds of conversations can be provided. The last round of conversation will be rewritten.
    */
    @SerializedName("Messages")
    @Expose
    private Message [] Messages;

    /**
    * Model name.
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
     * Get The multi-round historical conversation that needs to be rewritten. Each round of historical conversation should include paired inputs of user (question) and assistant (answer). Due to the character limit of the model, a maximum of 4 rounds of conversations can be provided. The last round of conversation will be rewritten. 
     * @return Messages The multi-round historical conversation that needs to be rewritten. Each round of historical conversation should include paired inputs of user (question) and assistant (answer). Due to the character limit of the model, a maximum of 4 rounds of conversations can be provided. The last round of conversation will be rewritten.
     */
    public Message [] getMessages() {
        return this.Messages;
    }

    /**
     * Set The multi-round historical conversation that needs to be rewritten. Each round of historical conversation should include paired inputs of user (question) and assistant (answer). Due to the character limit of the model, a maximum of 4 rounds of conversations can be provided. The last round of conversation will be rewritten.
     * @param Messages The multi-round historical conversation that needs to be rewritten. Each round of historical conversation should include paired inputs of user (question) and assistant (answer). Due to the character limit of the model, a maximum of 4 rounds of conversations can be provided. The last round of conversation will be rewritten.
     */
    public void setMessages(Message [] Messages) {
        this.Messages = Messages;
    }

    /**
     * Get Model name. 
     * @return Model Model name.
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set Model name.
     * @param Model Model name.
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    public QueryRewriteRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryRewriteRequest(QueryRewriteRequest source) {
        if (source.Messages != null) {
            this.Messages = new Message[source.Messages.length];
            for (int i = 0; i < source.Messages.length; i++) {
                this.Messages[i] = new Message(source.Messages[i]);
            }
        }
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Messages.", this.Messages);
        this.setParamSimple(map, prefix + "Model", this.Model);

    }
}

