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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WebhookReceiverBrief extends AbstractModel {

    /**
    * Bot ID.
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * Bot name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Robot type
Enumeration values:
WEBHOOK: webhook type
SCF: Cloud function type
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get Bot ID. 
     * @return ID Bot ID.
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set Bot ID.
     * @param ID Bot ID.
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get Bot name 
     * @return Name Bot name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Bot name
     * @param Name Bot name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Robot type
Enumeration values:
WEBHOOK: webhook type
SCF: Cloud function type 
     * @return Type Robot type
Enumeration values:
WEBHOOK: webhook type
SCF: Cloud function type
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Robot type
Enumeration values:
WEBHOOK: webhook type
SCF: Cloud function type
     * @param Type Robot type
Enumeration values:
WEBHOOK: webhook type
SCF: Cloud function type
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public WebhookReceiverBrief() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WebhookReceiverBrief(WebhookReceiverBrief source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

