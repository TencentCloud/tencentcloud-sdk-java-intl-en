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

public class RunAMLNameScreeningRequest extends AbstractModel {

    /**
    * <p>Unique identifier of the end user in the customer system, up to 256 characters.</p>
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
    * Enterprise information, required when EntityType=COMPANY. 
Input restriction: EntityType=COMPANY.
    */
    @SerializedName("Company")
    @Expose
    private Company Company;

    /**
    * Whether continuous monitoring screening is enabled. Default value: false.
    */
    @SerializedName("EnableOngoingScreening")
    @Expose
    private Boolean EnableOngoingScreening;

    /**
     * Get <p>Unique identifier of the end user in the customer system, up to 256 characters.</p> 
     * @return UniqueCustomerID <p>Unique identifier of the end user in the customer system, up to 256 characters.</p>
     */
    public String getUniqueCustomerID() {
        return this.UniqueCustomerID;
    }

    /**
     * Set <p>Unique identifier of the end user in the customer system, up to 256 characters.</p>
     * @param UniqueCustomerID <p>Unique identifier of the end user in the customer system, up to 256 characters.</p>
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
     * Get Enterprise information, required when EntityType=COMPANY. 
Input restriction: EntityType=COMPANY. 
     * @return Company Enterprise information, required when EntityType=COMPANY. 
Input restriction: EntityType=COMPANY.
     */
    public Company getCompany() {
        return this.Company;
    }

    /**
     * Set Enterprise information, required when EntityType=COMPANY. 
Input restriction: EntityType=COMPANY.
     * @param Company Enterprise information, required when EntityType=COMPANY. 
Input restriction: EntityType=COMPANY.
     */
    public void setCompany(Company Company) {
        this.Company = Company;
    }

    /**
     * Get Whether continuous monitoring screening is enabled. Default value: false. 
     * @return EnableOngoingScreening Whether continuous monitoring screening is enabled. Default value: false.
     */
    public Boolean getEnableOngoingScreening() {
        return this.EnableOngoingScreening;
    }

    /**
     * Set Whether continuous monitoring screening is enabled. Default value: false.
     * @param EnableOngoingScreening Whether continuous monitoring screening is enabled. Default value: false.
     */
    public void setEnableOngoingScreening(Boolean EnableOngoingScreening) {
        this.EnableOngoingScreening = EnableOngoingScreening;
    }

    public RunAMLNameScreeningRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RunAMLNameScreeningRequest(RunAMLNameScreeningRequest source) {
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
        if (source.EnableOngoingScreening != null) {
            this.EnableOngoingScreening = new Boolean(source.EnableOngoingScreening);
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
        this.setParamSimple(map, prefix + "EnableOngoingScreening", this.EnableOngoingScreening);

    }
}

