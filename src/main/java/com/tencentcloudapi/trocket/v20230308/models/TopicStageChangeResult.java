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
package com.tencentcloudapi.trocket.v20230308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TopicStageChangeResult extends AbstractModel {

    /**
    * Topic name
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * Success status
    */
    @SerializedName("Success")
    @Expose
    private Boolean Success;

    /**
    * Namespace. valid only for 4.x.
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

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
     * Get Success status 
     * @return Success Success status
     */
    public Boolean getSuccess() {
        return this.Success;
    }

    /**
     * Set Success status
     * @param Success Success status
     */
    public void setSuccess(Boolean Success) {
        this.Success = Success;
    }

    /**
     * Get Namespace. valid only for 4.x. 
     * @return Namespace Namespace. valid only for 4.x.
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set Namespace. valid only for 4.x.
     * @param Namespace Namespace. valid only for 4.x.
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    public TopicStageChangeResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TopicStageChangeResult(TopicStageChangeResult source) {
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.Success != null) {
            this.Success = new Boolean(source.Success);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "Success", this.Success);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);

    }
}

