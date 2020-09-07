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

public class GetPersonGroupInfoRequest extends AbstractModel{

    /**
    * Person ID, which is the `PersonId` in the `CreatePerson` API
    */
    @SerializedName("PersonId")
    @Expose
    private String PersonId;

    /**
    * Starting number. Default value: 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of returned results. Default value: 10. Maximum value: 100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

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
     * Get Starting number. Default value: 0 
     * @return Offset Starting number. Default value: 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Starting number. Default value: 0
     * @param Offset Starting number. Default value: 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of returned results. Default value: 10. Maximum value: 100 
     * @return Limit Number of returned results. Default value: 10. Maximum value: 100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned results. Default value: 10. Maximum value: 100
     * @param Limit Number of returned results. Default value: 10. Maximum value: 100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PersonId", this.PersonId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

