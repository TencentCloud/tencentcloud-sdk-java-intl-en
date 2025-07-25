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
package com.tencentcloudapi.apm.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SpanProcess extends AbstractModel {

    /**
    * Application service name.
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * Tags Tag array.
    */
    @SerializedName("Tags")
    @Expose
    private SpanTag [] Tags;

    /**
     * Get Application service name. 
     * @return ServiceName Application service name.
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set Application service name.
     * @param ServiceName Application service name.
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get Tags Tag array. 
     * @return Tags Tags Tag array.
     */
    public SpanTag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tags Tag array.
     * @param Tags Tags Tag array.
     */
    public void setTags(SpanTag [] Tags) {
        this.Tags = Tags;
    }

    public SpanProcess() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SpanProcess(SpanProcess source) {
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.Tags != null) {
            this.Tags = new SpanTag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new SpanTag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

