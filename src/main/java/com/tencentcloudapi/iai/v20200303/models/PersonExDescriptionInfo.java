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

public class PersonExDescriptionInfo extends AbstractModel{

    /**
    * Person description field index, whose value starts from 0
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PersonExDescriptionIndex")
    @Expose
    private Long PersonExDescriptionIndex;

    /**
    * Content of the person description field to be updated
    */
    @SerializedName("PersonExDescription")
    @Expose
    private String PersonExDescription;

    /**
     * Get Person description field index, whose value starts from 0
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return PersonExDescriptionIndex Person description field index, whose value starts from 0
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getPersonExDescriptionIndex() {
        return this.PersonExDescriptionIndex;
    }

    /**
     * Set Person description field index, whose value starts from 0
Note: this field may return null, indicating that no valid values can be obtained.
     * @param PersonExDescriptionIndex Person description field index, whose value starts from 0
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPersonExDescriptionIndex(Long PersonExDescriptionIndex) {
        this.PersonExDescriptionIndex = PersonExDescriptionIndex;
    }

    /**
     * Get Content of the person description field to be updated 
     * @return PersonExDescription Content of the person description field to be updated
     */
    public String getPersonExDescription() {
        return this.PersonExDescription;
    }

    /**
     * Set Content of the person description field to be updated
     * @param PersonExDescription Content of the person description field to be updated
     */
    public void setPersonExDescription(String PersonExDescription) {
        this.PersonExDescription = PersonExDescription;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PersonExDescriptionIndex", this.PersonExDescriptionIndex);
        this.setParamSimple(map, prefix + "PersonExDescription", this.PersonExDescription);

    }
}

