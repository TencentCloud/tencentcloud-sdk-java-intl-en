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

public class CopyPersonRequest extends AbstractModel{

    /**
    * Person ID, which is the `PersonId` in the `CreatePerson` API.
    */
    @SerializedName("PersonId")
    @Expose
    private String PersonId;

    /**
    * List of groups to join. The array element value is the `GroupId` in the `CreateGroup` API.
    */
    @SerializedName("GroupIds")
    @Expose
    private String [] GroupIds;

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
     * Get List of groups to join. The array element value is the `GroupId` in the `CreateGroup` API. 
     * @return GroupIds List of groups to join. The array element value is the `GroupId` in the `CreateGroup` API.
     */
    public String [] getGroupIds() {
        return this.GroupIds;
    }

    /**
     * Set List of groups to join. The array element value is the `GroupId` in the `CreateGroup` API.
     * @param GroupIds List of groups to join. The array element value is the `GroupId` in the `CreateGroup` API.
     */
    public void setGroupIds(String [] GroupIds) {
        this.GroupIds = GroupIds;
    }

    public CopyPersonRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CopyPersonRequest(CopyPersonRequest source) {
        if (source.PersonId != null) {
            this.PersonId = new String(source.PersonId);
        }
        if (source.GroupIds != null) {
            this.GroupIds = new String[source.GroupIds.length];
            for (int i = 0; i < source.GroupIds.length; i++) {
                this.GroupIds[i] = new String(source.GroupIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PersonId", this.PersonId);
        this.setParamArraySimple(map, prefix + "GroupIds.", this.GroupIds);

    }
}

