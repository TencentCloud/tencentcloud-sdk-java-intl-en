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
package com.tencentcloudapi.iai.v20200303.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyPersonGroupInfoRequest extends AbstractModel {

    /**
    * Group ID, which is the `GroupId` in the `CreateGroup` API.
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * Person ID, which is the `PersonId` in the `CreatePerson` API.
    */
    @SerializedName("PersonId")
    @Expose
    private String PersonId;

    /**
    * Custom description field of the person to be modified, which is a `key-value` pair.
    */
    @SerializedName("PersonExDescriptionInfos")
    @Expose
    private PersonExDescriptionInfo [] PersonExDescriptionInfos;

    /**
     * Get Group ID, which is the `GroupId` in the `CreateGroup` API. 
     * @return GroupId Group ID, which is the `GroupId` in the `CreateGroup` API.
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Group ID, which is the `GroupId` in the `CreateGroup` API.
     * @param GroupId Group ID, which is the `GroupId` in the `CreateGroup` API.
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Person ID, which is the `PersonId` in the `CreatePerson` API. 
     * @return PersonId Person ID, which is the `PersonId` in the `CreatePerson` API.
     */
    public String getPersonId() {
        return this.PersonId;
    }

    /**
     * Set Person ID, which is the `PersonId` in the `CreatePerson` API.
     * @param PersonId Person ID, which is the `PersonId` in the `CreatePerson` API.
     */
    public void setPersonId(String PersonId) {
        this.PersonId = PersonId;
    }

    /**
     * Get Custom description field of the person to be modified, which is a `key-value` pair. 
     * @return PersonExDescriptionInfos Custom description field of the person to be modified, which is a `key-value` pair.
     */
    public PersonExDescriptionInfo [] getPersonExDescriptionInfos() {
        return this.PersonExDescriptionInfos;
    }

    /**
     * Set Custom description field of the person to be modified, which is a `key-value` pair.
     * @param PersonExDescriptionInfos Custom description field of the person to be modified, which is a `key-value` pair.
     */
    public void setPersonExDescriptionInfos(PersonExDescriptionInfo [] PersonExDescriptionInfos) {
        this.PersonExDescriptionInfos = PersonExDescriptionInfos;
    }

    public ModifyPersonGroupInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyPersonGroupInfoRequest(ModifyPersonGroupInfoRequest source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.PersonId != null) {
            this.PersonId = new String(source.PersonId);
        }
        if (source.PersonExDescriptionInfos != null) {
            this.PersonExDescriptionInfos = new PersonExDescriptionInfo[source.PersonExDescriptionInfos.length];
            for (int i = 0; i < source.PersonExDescriptionInfos.length; i++) {
                this.PersonExDescriptionInfos[i] = new PersonExDescriptionInfo(source.PersonExDescriptionInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "PersonId", this.PersonId);
        this.setParamArrayObj(map, prefix + "PersonExDescriptionInfos.", this.PersonExDescriptionInfos);

    }
}

