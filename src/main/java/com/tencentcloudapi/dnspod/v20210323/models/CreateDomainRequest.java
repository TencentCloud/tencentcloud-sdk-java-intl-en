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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDomainRequest extends AbstractModel{

    /**
    * Domain
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Domain group ID
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * Whether the domain is starred. Valid values: yes, no.
    */
    @SerializedName("IsMark")
    @Expose
    private String IsMark;

    /**
     * Get Domain 
     * @return Domain Domain
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain
     * @param Domain Domain
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Domain group ID 
     * @return GroupId Domain group ID
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Domain group ID
     * @param GroupId Domain group ID
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Whether the domain is starred. Valid values: yes, no. 
     * @return IsMark Whether the domain is starred. Valid values: yes, no.
     */
    public String getIsMark() {
        return this.IsMark;
    }

    /**
     * Set Whether the domain is starred. Valid values: yes, no.
     * @param IsMark Whether the domain is starred. Valid values: yes, no.
     */
    public void setIsMark(String IsMark) {
        this.IsMark = IsMark;
    }

    public CreateDomainRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDomainRequest(CreateDomainRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.IsMark != null) {
            this.IsMark = new String(source.IsMark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "IsMark", this.IsMark);

    }
}

