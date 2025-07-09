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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyContentIdentifierRequest extends AbstractModel {

    /**
    * Content identifier id.
    */
    @SerializedName("ContentId")
    @Expose
    private String ContentId;

    /**
    * Content identifier description. length limit: 20 characters.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get Content identifier id. 
     * @return ContentId Content identifier id.
     */
    public String getContentId() {
        return this.ContentId;
    }

    /**
     * Set Content identifier id.
     * @param ContentId Content identifier id.
     */
    public void setContentId(String ContentId) {
        this.ContentId = ContentId;
    }

    /**
     * Get Content identifier description. length limit: 20 characters. 
     * @return Description Content identifier description. length limit: 20 characters.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Content identifier description. length limit: 20 characters.
     * @param Description Content identifier description. length limit: 20 characters.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public ModifyContentIdentifierRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyContentIdentifierRequest(ModifyContentIdentifierRequest source) {
        if (source.ContentId != null) {
            this.ContentId = new String(source.ContentId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ContentId", this.ContentId);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

