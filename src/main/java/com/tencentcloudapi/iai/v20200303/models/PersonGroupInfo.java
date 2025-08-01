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

public class PersonGroupInfo extends AbstractModel {

    /**
    * ID of the group that contains this person
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * Content of person description field
    */
    @SerializedName("PersonExDescriptions")
    @Expose
    private String [] PersonExDescriptions;

    /**
     * Get ID of the group that contains this person 
     * @return GroupId ID of the group that contains this person
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set ID of the group that contains this person
     * @param GroupId ID of the group that contains this person
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Content of person description field 
     * @return PersonExDescriptions Content of person description field
     */
    public String [] getPersonExDescriptions() {
        return this.PersonExDescriptions;
    }

    /**
     * Set Content of person description field
     * @param PersonExDescriptions Content of person description field
     */
    public void setPersonExDescriptions(String [] PersonExDescriptions) {
        this.PersonExDescriptions = PersonExDescriptions;
    }

    public PersonGroupInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PersonGroupInfo(PersonGroupInfo source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.PersonExDescriptions != null) {
            this.PersonExDescriptions = new String[source.PersonExDescriptions.length];
            for (int i = 0; i < source.PersonExDescriptions.length; i++) {
                this.PersonExDescriptions[i] = new String(source.PersonExDescriptions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamArraySimple(map, prefix + "PersonExDescriptions.", this.PersonExDescriptions);

    }
}

