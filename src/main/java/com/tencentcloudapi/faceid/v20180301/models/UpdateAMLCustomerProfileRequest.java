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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateAMLCustomerProfileRequest extends AbstractModel {

    /**
    * <p>User's unique identifier in the customer system, up to 256 characters.</p>
    */
    @SerializedName("UniqueCustomerID")
    @Expose
    private String UniqueCustomerID;

    /**
    * <p>Entity type. Enumeration values: PERSON / COMPANY</p><p>Enumeration values:</p><ul><li>PERSON: individual</li><li>COMPANY: company</li></ul>
    */
    @SerializedName("EntityType")
    @Expose
    private String EntityType;

    /**
    * <p>Personal information, required when EntityType=PERSON</p><p>Input limit: EntityType=PERSON</p>
    */
    @SerializedName("Person")
    @Expose
    private Person Person;

    /**
    * <p>Enterprise info. Required when EntityType=COMPANY</p><p>Input limitation: EntityType=COMPANY</p>
    */
    @SerializedName("Company")
    @Expose
    private Company Company;

    /**
     * Get <p>User's unique identifier in the customer system, up to 256 characters.</p> 
     * @return UniqueCustomerID <p>User's unique identifier in the customer system, up to 256 characters.</p>
     */
    public String getUniqueCustomerID() {
        return this.UniqueCustomerID;
    }

    /**
     * Set <p>User's unique identifier in the customer system, up to 256 characters.</p>
     * @param UniqueCustomerID <p>User's unique identifier in the customer system, up to 256 characters.</p>
     */
    public void setUniqueCustomerID(String UniqueCustomerID) {
        this.UniqueCustomerID = UniqueCustomerID;
    }

    /**
     * Get <p>Entity type. Enumeration values: PERSON / COMPANY</p><p>Enumeration values:</p><ul><li>PERSON: individual</li><li>COMPANY: company</li></ul> 
     * @return EntityType <p>Entity type. Enumeration values: PERSON / COMPANY</p><p>Enumeration values:</p><ul><li>PERSON: individual</li><li>COMPANY: company</li></ul>
     */
    public String getEntityType() {
        return this.EntityType;
    }

    /**
     * Set <p>Entity type. Enumeration values: PERSON / COMPANY</p><p>Enumeration values:</p><ul><li>PERSON: individual</li><li>COMPANY: company</li></ul>
     * @param EntityType <p>Entity type. Enumeration values: PERSON / COMPANY</p><p>Enumeration values:</p><ul><li>PERSON: individual</li><li>COMPANY: company</li></ul>
     */
    public void setEntityType(String EntityType) {
        this.EntityType = EntityType;
    }

    /**
     * Get <p>Personal information, required when EntityType=PERSON</p><p>Input limit: EntityType=PERSON</p> 
     * @return Person <p>Personal information, required when EntityType=PERSON</p><p>Input limit: EntityType=PERSON</p>
     */
    public Person getPerson() {
        return this.Person;
    }

    /**
     * Set <p>Personal information, required when EntityType=PERSON</p><p>Input limit: EntityType=PERSON</p>
     * @param Person <p>Personal information, required when EntityType=PERSON</p><p>Input limit: EntityType=PERSON</p>
     */
    public void setPerson(Person Person) {
        this.Person = Person;
    }

    /**
     * Get <p>Enterprise info. Required when EntityType=COMPANY</p><p>Input limitation: EntityType=COMPANY</p> 
     * @return Company <p>Enterprise info. Required when EntityType=COMPANY</p><p>Input limitation: EntityType=COMPANY</p>
     */
    public Company getCompany() {
        return this.Company;
    }

    /**
     * Set <p>Enterprise info. Required when EntityType=COMPANY</p><p>Input limitation: EntityType=COMPANY</p>
     * @param Company <p>Enterprise info. Required when EntityType=COMPANY</p><p>Input limitation: EntityType=COMPANY</p>
     */
    public void setCompany(Company Company) {
        this.Company = Company;
    }

    public UpdateAMLCustomerProfileRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateAMLCustomerProfileRequest(UpdateAMLCustomerProfileRequest source) {
        if (source.UniqueCustomerID != null) {
            this.UniqueCustomerID = new String(source.UniqueCustomerID);
        }
        if (source.EntityType != null) {
            this.EntityType = new String(source.EntityType);
        }
        if (source.Person != null) {
            this.Person = new Person(source.Person);
        }
        if (source.Company != null) {
            this.Company = new Company(source.Company);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UniqueCustomerID", this.UniqueCustomerID);
        this.setParamSimple(map, prefix + "EntityType", this.EntityType);
        this.setParamObj(map, prefix + "Person.", this.Person);
        this.setParamObj(map, prefix + "Company.", this.Company);

    }
}

