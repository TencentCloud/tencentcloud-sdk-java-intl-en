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

public class UserAccessConfig extends AbstractModel {

    /**
    * <p>Customer-defined knowledge ID</p>
    */
    @SerializedName("CustomerKnowledgeId")
    @Expose
    private String CustomerKnowledgeId;

    /**
    * <p>Whether the document is public</p>
    */
    @SerializedName("IsPublic")
    @Expose
    private Boolean IsPublic;

    /**
     * Get <p>Customer-defined knowledge ID</p> 
     * @return CustomerKnowledgeId <p>Customer-defined knowledge ID</p>
     */
    public String getCustomerKnowledgeId() {
        return this.CustomerKnowledgeId;
    }

    /**
     * Set <p>Customer-defined knowledge ID</p>
     * @param CustomerKnowledgeId <p>Customer-defined knowledge ID</p>
     */
    public void setCustomerKnowledgeId(String CustomerKnowledgeId) {
        this.CustomerKnowledgeId = CustomerKnowledgeId;
    }

    /**
     * Get <p>Whether the document is public</p> 
     * @return IsPublic <p>Whether the document is public</p>
     */
    public Boolean getIsPublic() {
        return this.IsPublic;
    }

    /**
     * Set <p>Whether the document is public</p>
     * @param IsPublic <p>Whether the document is public</p>
     */
    public void setIsPublic(Boolean IsPublic) {
        this.IsPublic = IsPublic;
    }

    public UserAccessConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserAccessConfig(UserAccessConfig source) {
        if (source.CustomerKnowledgeId != null) {
            this.CustomerKnowledgeId = new String(source.CustomerKnowledgeId);
        }
        if (source.IsPublic != null) {
            this.IsPublic = new Boolean(source.IsPublic);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CustomerKnowledgeId", this.CustomerKnowledgeId);
        this.setParamSimple(map, prefix + "IsPublic", this.IsPublic);

    }
}

