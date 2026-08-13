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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CustomModel extends AbstractModel {

    /**
    * <p>Gender</p><p>Enumeration value:</p><ul><li>male: man</li><li>female: woman</li><li>any: unlimited</li></ul>
    */
    @SerializedName("Gender")
    @Expose
    private String Gender;

    /**
    * <p>Age range.</p><p>Enumeration values:</p><ul><li>teen: youth</li><li>young_adult: adulthood</li><li>middle_aged: middle-aged</li><li>mature: mature</li></ul>
    */
    @SerializedName("Age")
    @Expose
    private String Age;

    /**
    * <p>Appearance</p><p>Enumeration value:</p><ul><li>caucasian: White</li><li>asian: Asian</li><li>latino: Latino</li><li>african: African</li><li>middle_eastern: Middle Eastern</li></ul>
    */
    @SerializedName("Appearance")
    @Expose
    private String Appearance;

    /**
    * <p>Body shape</p><p>Enumeration value:</p><ul><li>slim: Slim</li><li>standard: Standard</li><li>athletic: Healthy</li><li>chubby: Chubby</li></ul>
    */
    @SerializedName("BodyType")
    @Expose
    private String BodyType;

    /**
     * Get <p>Gender</p><p>Enumeration value:</p><ul><li>male: man</li><li>female: woman</li><li>any: unlimited</li></ul> 
     * @return Gender <p>Gender</p><p>Enumeration value:</p><ul><li>male: man</li><li>female: woman</li><li>any: unlimited</li></ul>
     */
    public String getGender() {
        return this.Gender;
    }

    /**
     * Set <p>Gender</p><p>Enumeration value:</p><ul><li>male: man</li><li>female: woman</li><li>any: unlimited</li></ul>
     * @param Gender <p>Gender</p><p>Enumeration value:</p><ul><li>male: man</li><li>female: woman</li><li>any: unlimited</li></ul>
     */
    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    /**
     * Get <p>Age range.</p><p>Enumeration values:</p><ul><li>teen: youth</li><li>young_adult: adulthood</li><li>middle_aged: middle-aged</li><li>mature: mature</li></ul> 
     * @return Age <p>Age range.</p><p>Enumeration values:</p><ul><li>teen: youth</li><li>young_adult: adulthood</li><li>middle_aged: middle-aged</li><li>mature: mature</li></ul>
     */
    public String getAge() {
        return this.Age;
    }

    /**
     * Set <p>Age range.</p><p>Enumeration values:</p><ul><li>teen: youth</li><li>young_adult: adulthood</li><li>middle_aged: middle-aged</li><li>mature: mature</li></ul>
     * @param Age <p>Age range.</p><p>Enumeration values:</p><ul><li>teen: youth</li><li>young_adult: adulthood</li><li>middle_aged: middle-aged</li><li>mature: mature</li></ul>
     */
    public void setAge(String Age) {
        this.Age = Age;
    }

    /**
     * Get <p>Appearance</p><p>Enumeration value:</p><ul><li>caucasian: White</li><li>asian: Asian</li><li>latino: Latino</li><li>african: African</li><li>middle_eastern: Middle Eastern</li></ul> 
     * @return Appearance <p>Appearance</p><p>Enumeration value:</p><ul><li>caucasian: White</li><li>asian: Asian</li><li>latino: Latino</li><li>african: African</li><li>middle_eastern: Middle Eastern</li></ul>
     */
    public String getAppearance() {
        return this.Appearance;
    }

    /**
     * Set <p>Appearance</p><p>Enumeration value:</p><ul><li>caucasian: White</li><li>asian: Asian</li><li>latino: Latino</li><li>african: African</li><li>middle_eastern: Middle Eastern</li></ul>
     * @param Appearance <p>Appearance</p><p>Enumeration value:</p><ul><li>caucasian: White</li><li>asian: Asian</li><li>latino: Latino</li><li>african: African</li><li>middle_eastern: Middle Eastern</li></ul>
     */
    public void setAppearance(String Appearance) {
        this.Appearance = Appearance;
    }

    /**
     * Get <p>Body shape</p><p>Enumeration value:</p><ul><li>slim: Slim</li><li>standard: Standard</li><li>athletic: Healthy</li><li>chubby: Chubby</li></ul> 
     * @return BodyType <p>Body shape</p><p>Enumeration value:</p><ul><li>slim: Slim</li><li>standard: Standard</li><li>athletic: Healthy</li><li>chubby: Chubby</li></ul>
     */
    public String getBodyType() {
        return this.BodyType;
    }

    /**
     * Set <p>Body shape</p><p>Enumeration value:</p><ul><li>slim: Slim</li><li>standard: Standard</li><li>athletic: Healthy</li><li>chubby: Chubby</li></ul>
     * @param BodyType <p>Body shape</p><p>Enumeration value:</p><ul><li>slim: Slim</li><li>standard: Standard</li><li>athletic: Healthy</li><li>chubby: Chubby</li></ul>
     */
    public void setBodyType(String BodyType) {
        this.BodyType = BodyType;
    }

    public CustomModel() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomModel(CustomModel source) {
        if (source.Gender != null) {
            this.Gender = new String(source.Gender);
        }
        if (source.Age != null) {
            this.Age = new String(source.Age);
        }
        if (source.Appearance != null) {
            this.Appearance = new String(source.Appearance);
        }
        if (source.BodyType != null) {
            this.BodyType = new String(source.BodyType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Gender", this.Gender);
        this.setParamSimple(map, prefix + "Age", this.Age);
        this.setParamSimple(map, prefix + "Appearance", this.Appearance);
        this.setParamSimple(map, prefix + "BodyType", this.BodyType);

    }
}

