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

public class PersonGroupInfo extends AbstractModel{

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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamArraySimple(map, prefix + "PersonExDescriptions.", this.PersonExDescriptions);

    }
}

