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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DomainAliasInfo extends AbstractModel {

    /**
    * Domain alias ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Domain alias
    */
    @SerializedName("DomainAlias")
    @Expose
    private String DomainAlias;

    /**
     * Get Domain alias ID 
     * @return Id Domain alias ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Domain alias ID
     * @param Id Domain alias ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Domain alias 
     * @return DomainAlias Domain alias
     */
    public String getDomainAlias() {
        return this.DomainAlias;
    }

    /**
     * Set Domain alias
     * @param DomainAlias Domain alias
     */
    public void setDomainAlias(String DomainAlias) {
        this.DomainAlias = DomainAlias;
    }

    public DomainAliasInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DomainAliasInfo(DomainAliasInfo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.DomainAlias != null) {
            this.DomainAlias = new String(source.DomainAlias);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "DomainAlias", this.DomainAlias);

    }
}

