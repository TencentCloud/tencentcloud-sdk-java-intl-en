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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLiveTranscodeRulesRequest extends AbstractModel {

    /**
    * An array of template IDs to be filtered.
    */
    @SerializedName("TemplateIds")
    @Expose
    private Long [] TemplateIds;

    /**
    * An array of domain names to be filtered.
    */
    @SerializedName("DomainNames")
    @Expose
    private String [] DomainNames;

    /**
     * Get An array of template IDs to be filtered. 
     * @return TemplateIds An array of template IDs to be filtered.
     */
    public Long [] getTemplateIds() {
        return this.TemplateIds;
    }

    /**
     * Set An array of template IDs to be filtered.
     * @param TemplateIds An array of template IDs to be filtered.
     */
    public void setTemplateIds(Long [] TemplateIds) {
        this.TemplateIds = TemplateIds;
    }

    /**
     * Get An array of domain names to be filtered. 
     * @return DomainNames An array of domain names to be filtered.
     */
    public String [] getDomainNames() {
        return this.DomainNames;
    }

    /**
     * Set An array of domain names to be filtered.
     * @param DomainNames An array of domain names to be filtered.
     */
    public void setDomainNames(String [] DomainNames) {
        this.DomainNames = DomainNames;
    }

    public DescribeLiveTranscodeRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLiveTranscodeRulesRequest(DescribeLiveTranscodeRulesRequest source) {
        if (source.TemplateIds != null) {
            this.TemplateIds = new Long[source.TemplateIds.length];
            for (int i = 0; i < source.TemplateIds.length; i++) {
                this.TemplateIds[i] = new Long(source.TemplateIds[i]);
            }
        }
        if (source.DomainNames != null) {
            this.DomainNames = new String[source.DomainNames.length];
            for (int i = 0; i < source.DomainNames.length; i++) {
                this.DomainNames[i] = new String(source.DomainNames[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "TemplateIds.", this.TemplateIds);
        this.setParamArraySimple(map, prefix + "DomainNames.", this.DomainNames);

    }
}

