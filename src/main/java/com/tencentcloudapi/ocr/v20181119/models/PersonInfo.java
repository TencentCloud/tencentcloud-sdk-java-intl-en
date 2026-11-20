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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PersonInfo extends AbstractModel {

    /**
    * Name of the inquirer
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Gender
    */
    @SerializedName("Gender")
    @Expose
    private String Gender;

    /**
    * Date of birth
    */
    @SerializedName("BirthDate")
    @Expose
    private String BirthDate;

    /**
    * Citizen ID number
    */
    @SerializedName("IdCardNo")
    @Expose
    private String IdCardNo;

    /**
     * Get Name of the inquirer 
     * @return Name Name of the inquirer
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name of the inquirer
     * @param Name Name of the inquirer
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Gender 
     * @return Gender Gender
     */
    public String getGender() {
        return this.Gender;
    }

    /**
     * Set Gender
     * @param Gender Gender
     */
    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    /**
     * Get Date of birth 
     * @return BirthDate Date of birth
     */
    public String getBirthDate() {
        return this.BirthDate;
    }

    /**
     * Set Date of birth
     * @param BirthDate Date of birth
     */
    public void setBirthDate(String BirthDate) {
        this.BirthDate = BirthDate;
    }

    /**
     * Get Citizen ID number 
     * @return IdCardNo Citizen ID number
     */
    public String getIdCardNo() {
        return this.IdCardNo;
    }

    /**
     * Set Citizen ID number
     * @param IdCardNo Citizen ID number
     */
    public void setIdCardNo(String IdCardNo) {
        this.IdCardNo = IdCardNo;
    }

    public PersonInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PersonInfo(PersonInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Gender != null) {
            this.Gender = new String(source.Gender);
        }
        if (source.BirthDate != null) {
            this.BirthDate = new String(source.BirthDate);
        }
        if (source.IdCardNo != null) {
            this.IdCardNo = new String(source.IdCardNo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Gender", this.Gender);
        this.setParamSimple(map, prefix + "BirthDate", this.BirthDate);
        this.setParamSimple(map, prefix + "IdCardNo", this.IdCardNo);

    }
}

