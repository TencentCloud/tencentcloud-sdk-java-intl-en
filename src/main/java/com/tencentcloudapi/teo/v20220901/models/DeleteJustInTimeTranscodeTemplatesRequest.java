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

public class DeleteJustInTimeTranscodeTemplatesRequest extends AbstractModel {

    /**
    * Site ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Array of unique identifiers of instant transcoding templates to be deleted. Length limit: 100.
    */
    @SerializedName("TemplateIds")
    @Expose
    private String [] TemplateIds;

    /**
     * Get Site ID. 
     * @return ZoneId Site ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Site ID.
     * @param ZoneId Site ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Array of unique identifiers of instant transcoding templates to be deleted. Length limit: 100. 
     * @return TemplateIds Array of unique identifiers of instant transcoding templates to be deleted. Length limit: 100.
     */
    public String [] getTemplateIds() {
        return this.TemplateIds;
    }

    /**
     * Set Array of unique identifiers of instant transcoding templates to be deleted. Length limit: 100.
     * @param TemplateIds Array of unique identifiers of instant transcoding templates to be deleted. Length limit: 100.
     */
    public void setTemplateIds(String [] TemplateIds) {
        this.TemplateIds = TemplateIds;
    }

    public DeleteJustInTimeTranscodeTemplatesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteJustInTimeTranscodeTemplatesRequest(DeleteJustInTimeTranscodeTemplatesRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.TemplateIds != null) {
            this.TemplateIds = new String[source.TemplateIds.length];
            for (int i = 0; i < source.TemplateIds.length; i++) {
                this.TemplateIds[i] = new String(source.TemplateIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamArraySimple(map, prefix + "TemplateIds.", this.TemplateIds);

    }
}

