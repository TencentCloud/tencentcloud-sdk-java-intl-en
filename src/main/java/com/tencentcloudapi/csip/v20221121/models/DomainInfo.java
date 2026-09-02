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

public class DomainInfo extends AbstractModel {

    /**
    * <p>Domain name</p>
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * <p>Analysis time</p>
    */
    @SerializedName("AnalysisTime")
    @Expose
    private String AnalysisTime;

    /**
    * <p>Tag.</p>
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
     * Get <p>Domain name</p> 
     * @return Domain <p>Domain name</p>
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>Domain name</p>
     * @param Domain <p>Domain name</p>
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <p>Analysis time</p> 
     * @return AnalysisTime <p>Analysis time</p>
     */
    public String getAnalysisTime() {
        return this.AnalysisTime;
    }

    /**
     * Set <p>Analysis time</p>
     * @param AnalysisTime <p>Analysis time</p>
     */
    public void setAnalysisTime(String AnalysisTime) {
        this.AnalysisTime = AnalysisTime;
    }

    /**
     * Get <p>Tag.</p> 
     * @return Tags <p>Tag.</p>
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>Tag.</p>
     * @param Tags <p>Tag.</p>
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    public DomainInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DomainInfo(DomainInfo source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.AnalysisTime != null) {
            this.AnalysisTime = new String(source.AnalysisTime);
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "AnalysisTime", this.AnalysisTime);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);

    }
}

