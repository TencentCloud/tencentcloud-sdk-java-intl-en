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

public class PersonInfo extends AbstractModel{

    /**
    * Person name
    */
    @SerializedName("PersonName")
    @Expose
    private String PersonName;

    /**
    * Person ID
    */
    @SerializedName("PersonId")
    @Expose
    private String PersonId;

    /**
    * Person gender
    */
    @SerializedName("Gender")
    @Expose
    private Long Gender;

    /**
    * Content of person description field
    */
    @SerializedName("PersonExDescriptions")
    @Expose
    private String [] PersonExDescriptions;

    /**
    * List of contained face images
    */
    @SerializedName("FaceIds")
    @Expose
    private String [] FaceIds;

    /**
    * Person creation time and date (`CreationTimestamp`), whose value is the number of milliseconds between the UNIX epoch time and the group creation time. 
The UNIX epoch time is 00:00:00, Thursday, January 1, 1970, Coordinated Universal Time (UTC). For more information, please see the UNIX time document.
    */
    @SerializedName("CreationTimestamp")
    @Expose
    private Long CreationTimestamp;

    /**
     * Get Person name 
     * @return PersonName Person name
     */
    public String getPersonName() {
        return this.PersonName;
    }

    /**
     * Set Person name
     * @param PersonName Person name
     */
    public void setPersonName(String PersonName) {
        this.PersonName = PersonName;
    }

    /**
     * Get Person ID 
     * @return PersonId Person ID
     */
    public String getPersonId() {
        return this.PersonId;
    }

    /**
     * Set Person ID
     * @param PersonId Person ID
     */
    public void setPersonId(String PersonId) {
        this.PersonId = PersonId;
    }

    /**
     * Get Person gender 
     * @return Gender Person gender
     */
    public Long getGender() {
        return this.Gender;
    }

    /**
     * Set Person gender
     * @param Gender Person gender
     */
    public void setGender(Long Gender) {
        this.Gender = Gender;
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
     * Get List of contained face images 
     * @return FaceIds List of contained face images
     */
    public String [] getFaceIds() {
        return this.FaceIds;
    }

    /**
     * Set List of contained face images
     * @param FaceIds List of contained face images
     */
    public void setFaceIds(String [] FaceIds) {
        this.FaceIds = FaceIds;
    }

    /**
     * Get Person creation time and date (`CreationTimestamp`), whose value is the number of milliseconds between the UNIX epoch time and the group creation time. 
The UNIX epoch time is 00:00:00, Thursday, January 1, 1970, Coordinated Universal Time (UTC). For more information, please see the UNIX time document. 
     * @return CreationTimestamp Person creation time and date (`CreationTimestamp`), whose value is the number of milliseconds between the UNIX epoch time and the group creation time. 
The UNIX epoch time is 00:00:00, Thursday, January 1, 1970, Coordinated Universal Time (UTC). For more information, please see the UNIX time document.
     */
    public Long getCreationTimestamp() {
        return this.CreationTimestamp;
    }

    /**
     * Set Person creation time and date (`CreationTimestamp`), whose value is the number of milliseconds between the UNIX epoch time and the group creation time. 
The UNIX epoch time is 00:00:00, Thursday, January 1, 1970, Coordinated Universal Time (UTC). For more information, please see the UNIX time document.
     * @param CreationTimestamp Person creation time and date (`CreationTimestamp`), whose value is the number of milliseconds between the UNIX epoch time and the group creation time. 
The UNIX epoch time is 00:00:00, Thursday, January 1, 1970, Coordinated Universal Time (UTC). For more information, please see the UNIX time document.
     */
    public void setCreationTimestamp(Long CreationTimestamp) {
        this.CreationTimestamp = CreationTimestamp;
    }

    public PersonInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PersonInfo(PersonInfo source) {
        if (source.PersonName != null) {
            this.PersonName = new String(source.PersonName);
        }
        if (source.PersonId != null) {
            this.PersonId = new String(source.PersonId);
        }
        if (source.Gender != null) {
            this.Gender = new Long(source.Gender);
        }
        if (source.PersonExDescriptions != null) {
            this.PersonExDescriptions = new String[source.PersonExDescriptions.length];
            for (int i = 0; i < source.PersonExDescriptions.length; i++) {
                this.PersonExDescriptions[i] = new String(source.PersonExDescriptions[i]);
            }
        }
        if (source.FaceIds != null) {
            this.FaceIds = new String[source.FaceIds.length];
            for (int i = 0; i < source.FaceIds.length; i++) {
                this.FaceIds[i] = new String(source.FaceIds[i]);
            }
        }
        if (source.CreationTimestamp != null) {
            this.CreationTimestamp = new Long(source.CreationTimestamp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PersonName", this.PersonName);
        this.setParamSimple(map, prefix + "PersonId", this.PersonId);
        this.setParamSimple(map, prefix + "Gender", this.Gender);
        this.setParamArraySimple(map, prefix + "PersonExDescriptions.", this.PersonExDescriptions);
        this.setParamArraySimple(map, prefix + "FaceIds.", this.FaceIds);
        this.setParamSimple(map, prefix + "CreationTimestamp", this.CreationTimestamp);

    }
}

