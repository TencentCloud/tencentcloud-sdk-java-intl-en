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
package com.tencentcloudapi.iai.v20200303.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyPersonBaseInfoRequest extends AbstractModel{

    /**
    * Person ID, which is the `PersonId` in the `CreatePerson` API
    */
    @SerializedName("PersonId")
    @Expose
    private String PersonId;

    /**
    * Name of the person to be modified
    */
    @SerializedName("PersonName")
    @Expose
    private String PersonName;

    /**
    * Gender of the person to be modified. 1: male; 2: female
    */
    @SerializedName("Gender")
    @Expose
    private Long Gender;

    /**
     * Get Person ID, which is the `PersonId` in the `CreatePerson` API 
     * @return PersonId Person ID, which is the `PersonId` in the `CreatePerson` API
     */
    public String getPersonId() {
        return this.PersonId;
    }

    /**
     * Set Person ID, which is the `PersonId` in the `CreatePerson` API
     * @param PersonId Person ID, which is the `PersonId` in the `CreatePerson` API
     */
    public void setPersonId(String PersonId) {
        this.PersonId = PersonId;
    }

    /**
     * Get Name of the person to be modified 
     * @return PersonName Name of the person to be modified
     */
    public String getPersonName() {
        return this.PersonName;
    }

    /**
     * Set Name of the person to be modified
     * @param PersonName Name of the person to be modified
     */
    public void setPersonName(String PersonName) {
        this.PersonName = PersonName;
    }

    /**
     * Get Gender of the person to be modified. 1: male; 2: female 
     * @return Gender Gender of the person to be modified. 1: male; 2: female
     */
    public Long getGender() {
        return this.Gender;
    }

    /**
     * Set Gender of the person to be modified. 1: male; 2: female
     * @param Gender Gender of the person to be modified. 1: male; 2: female
     */
    public void setGender(Long Gender) {
        this.Gender = Gender;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PersonId", this.PersonId);
        this.setParamSimple(map, prefix + "PersonName", this.PersonName);
        this.setParamSimple(map, prefix + "Gender", this.Gender);

    }
}

