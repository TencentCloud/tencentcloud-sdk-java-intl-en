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

public class DomainCreateInfo extends AbstractModel{

    /**
    * Domain ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Domain
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Domain Punycode
    */
    @SerializedName("Punycode")
    @Expose
    private String Punycode;

    /**
    * NS list of the domain
    */
    @SerializedName("GradeNsList")
    @Expose
    private String [] GradeNsList;

    /**
     * Get Domain ID 
     * @return Id Domain ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Domain ID
     * @param Id Domain ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

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
     * Get Domain Punycode 
     * @return Punycode Domain Punycode
     */
    public String getPunycode() {
        return this.Punycode;
    }

    /**
     * Set Domain Punycode
     * @param Punycode Domain Punycode
     */
    public void setPunycode(String Punycode) {
        this.Punycode = Punycode;
    }

    /**
     * Get NS list of the domain 
     * @return GradeNsList NS list of the domain
     */
    public String [] getGradeNsList() {
        return this.GradeNsList;
    }

    /**
     * Set NS list of the domain
     * @param GradeNsList NS list of the domain
     */
    public void setGradeNsList(String [] GradeNsList) {
        this.GradeNsList = GradeNsList;
    }

    public DomainCreateInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DomainCreateInfo(DomainCreateInfo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Punycode != null) {
            this.Punycode = new String(source.Punycode);
        }
        if (source.GradeNsList != null) {
            this.GradeNsList = new String[source.GradeNsList.length];
            for (int i = 0; i < source.GradeNsList.length; i++) {
                this.GradeNsList[i] = new String(source.GradeNsList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Punycode", this.Punycode);
        this.setParamArraySimple(map, prefix + "GradeNsList.", this.GradeNsList);

    }
}

