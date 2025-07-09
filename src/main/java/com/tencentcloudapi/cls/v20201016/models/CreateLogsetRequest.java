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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateLogsetRequest extends AbstractModel {

    /**
    * Logset name, which must be unique
    */
    @SerializedName("LogsetName")
    @Expose
    private String LogsetName;

    /**
    * Tag description list. Up to 10 tag key-value pairs are supported and must be unique.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get Logset name, which must be unique 
     * @return LogsetName Logset name, which must be unique
     */
    public String getLogsetName() {
        return this.LogsetName;
    }

    /**
     * Set Logset name, which must be unique
     * @param LogsetName Logset name, which must be unique
     */
    public void setLogsetName(String LogsetName) {
        this.LogsetName = LogsetName;
    }

    /**
     * Get Tag description list. Up to 10 tag key-value pairs are supported and must be unique. 
     * @return Tags Tag description list. Up to 10 tag key-value pairs are supported and must be unique.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag description list. Up to 10 tag key-value pairs are supported and must be unique.
     * @param Tags Tag description list. Up to 10 tag key-value pairs are supported and must be unique.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public CreateLogsetRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLogsetRequest(CreateLogsetRequest source) {
        if (source.LogsetName != null) {
            this.LogsetName = new String(source.LogsetName);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogsetName", this.LogsetName);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

