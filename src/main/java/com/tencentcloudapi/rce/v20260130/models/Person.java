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
package com.tencentcloudapi.rce.v20260130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Person extends AbstractModel {

    /**
    * <p>The full name of the user if provided</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>The gender of the user if provided</p>
    */
    @SerializedName("Gender")
    @Expose
    private String Gender;

    /**
    * <p>The birthday of the user if provided</p><p>Parameter format: YYYY-MM-DD.</p>
    */
    @SerializedName("Birthday")
    @Expose
    private String Birthday;

    /**
    * <p>The degree of the user if provided</p>
    */
    @SerializedName("Degree")
    @Expose
    private String Degree;

    /**
    * <p>The occupation of the user if provided</p>
    */
    @SerializedName("Occupation")
    @Expose
    private String Occupation;

    /**
     * Get <p>The full name of the user if provided</p> 
     * @return Name <p>The full name of the user if provided</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>The full name of the user if provided</p>
     * @param Name <p>The full name of the user if provided</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>The gender of the user if provided</p> 
     * @return Gender <p>The gender of the user if provided</p>
     */
    public String getGender() {
        return this.Gender;
    }

    /**
     * Set <p>The gender of the user if provided</p>
     * @param Gender <p>The gender of the user if provided</p>
     */
    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    /**
     * Get <p>The birthday of the user if provided</p><p>Parameter format: YYYY-MM-DD.</p> 
     * @return Birthday <p>The birthday of the user if provided</p><p>Parameter format: YYYY-MM-DD.</p>
     */
    public String getBirthday() {
        return this.Birthday;
    }

    /**
     * Set <p>The birthday of the user if provided</p><p>Parameter format: YYYY-MM-DD.</p>
     * @param Birthday <p>The birthday of the user if provided</p><p>Parameter format: YYYY-MM-DD.</p>
     */
    public void setBirthday(String Birthday) {
        this.Birthday = Birthday;
    }

    /**
     * Get <p>The degree of the user if provided</p> 
     * @return Degree <p>The degree of the user if provided</p>
     */
    public String getDegree() {
        return this.Degree;
    }

    /**
     * Set <p>The degree of the user if provided</p>
     * @param Degree <p>The degree of the user if provided</p>
     */
    public void setDegree(String Degree) {
        this.Degree = Degree;
    }

    /**
     * Get <p>The occupation of the user if provided</p> 
     * @return Occupation <p>The occupation of the user if provided</p>
     */
    public String getOccupation() {
        return this.Occupation;
    }

    /**
     * Set <p>The occupation of the user if provided</p>
     * @param Occupation <p>The occupation of the user if provided</p>
     */
    public void setOccupation(String Occupation) {
        this.Occupation = Occupation;
    }

    public Person() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Person(Person source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Gender != null) {
            this.Gender = new String(source.Gender);
        }
        if (source.Birthday != null) {
            this.Birthday = new String(source.Birthday);
        }
        if (source.Degree != null) {
            this.Degree = new String(source.Degree);
        }
        if (source.Occupation != null) {
            this.Occupation = new String(source.Occupation);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Gender", this.Gender);
        this.setParamSimple(map, prefix + "Birthday", this.Birthday);
        this.setParamSimple(map, prefix + "Degree", this.Degree);
        this.setParamSimple(map, prefix + "Occupation", this.Occupation);

    }
}

