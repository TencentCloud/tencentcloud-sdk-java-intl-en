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
    * End user's unique identifier in the customer system, up to 256 characters.
    */
    @SerializedName("UniqueCustomerID")
    @Expose
    private String UniqueCustomerID;

    /**
    * Entity type. Enumeration values: PERSON (individual) / COMPANY (company).
    */
    @SerializedName("EntityType")
    @Expose
    private String EntityType;

    /**
    * Personal information, required when EntityType=PERSON. 
Input restriction: EntityType=PERSON.
    */
    @SerializedName("Person")
    @Expose
    private Person Person;

    /**
    * Enterprise information, required when EntityType=COMPANY. Input restriction: EntityType=COMPANY.
    */
    @SerializedName("Company")
    @Expose
    private Company Company;

    /**
     * Get End user's unique identifier in the customer system, up to 256 characters. 
     * @return UniqueCustomerID End user's unique identifier in the customer system, up to 256 characters.
     */
    public String getUniqueCustomerID() {
        return this.UniqueCustomerID;
    }

    /**
     * Set End user's unique identifier in the customer system, up to 256 characters.
     * @param UniqueCustomerID End user's unique identifier in the customer system, up to 256 characters.
     */
    public void setUniqueCustomerID(String UniqueCustomerID) {
        this.UniqueCustomerID = UniqueCustomerID;
    }

    /**
     * Get Entity type. Enumeration values: PERSON (individual) / COMPANY (company). 
     * @return EntityType Entity type. Enumeration values: PERSON (individual) / COMPANY (company).
     */
    public String getEntityType() {
        return this.EntityType;
    }

    /**
     * Set Entity type. Enumeration values: PERSON (individual) / COMPANY (company).
     * @param EntityType Entity type. Enumeration values: PERSON (individual) / COMPANY (company).
     */
    public void setEntityType(String EntityType) {
        this.EntityType = EntityType;
    }

    /**
     * Get Personal information, required when EntityType=PERSON. 
Input restriction: EntityType=PERSON. 
     * @return Person Personal information, required when EntityType=PERSON. 
Input restriction: EntityType=PERSON.
     */
    public Person getPerson() {
        return this.Person;
    }

    /**
     * Set Personal information, required when EntityType=PERSON. 
Input restriction: EntityType=PERSON.
     * @param Person Personal information, required when EntityType=PERSON. 
Input restriction: EntityType=PERSON.
     */
    public void setPerson(Person Person) {
        this.Person = Person;
    }

    /**
     * Get Enterprise information, required when EntityType=COMPANY. Input restriction: EntityType=COMPANY. 
     * @return Company Enterprise information, required when EntityType=COMPANY. Input restriction: EntityType=COMPANY.
     */
    public Company getCompany() {
        return this.Company;
    }

    /**
     * Set Enterprise information, required when EntityType=COMPANY. Input restriction: EntityType=COMPANY.
     * @param Company Enterprise information, required when EntityType=COMPANY. Input restriction: EntityType=COMPANY.
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

