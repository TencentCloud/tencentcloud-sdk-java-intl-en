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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Address extends AbstractModel {

    /**
    * Country
    */
    @SerializedName("Country")
    @Expose
    private String Country;

    /**
    * Postal code
    */
    @SerializedName("PostalCode")
    @Expose
    private String PostalCode;

    /**
    * Sub-region
    */
    @SerializedName("Subdivision")
    @Expose
    private String Subdivision;

    /**
    * city
    */
    @SerializedName("City")
    @Expose
    private String City;

    /**
    * Complete address
    */
    @SerializedName("FormattedAddress")
    @Expose
    private String FormattedAddress;

    /**
    * First line of the address bar
    */
    @SerializedName("LineOne")
    @Expose
    private String LineOne;

    /**
    * Second line of the address bar
    */
    @SerializedName("LineTwo")
    @Expose
    private String LineTwo;

    /**
    * Third line of the address bar
    */
    @SerializedName("LineThree")
    @Expose
    private String LineThree;

    /**
    * Fourth line of the address bar
    */
    @SerializedName("LineFour")
    @Expose
    private String LineFour;

    /**
    * Fifth line of the address bar
    */
    @SerializedName("LineFive")
    @Expose
    private String LineFive;

    /**
     * Get Country 
     * @return Country Country
     */
    public String getCountry() {
        return this.Country;
    }

    /**
     * Set Country
     * @param Country Country
     */
    public void setCountry(String Country) {
        this.Country = Country;
    }

    /**
     * Get Postal code 
     * @return PostalCode Postal code
     */
    public String getPostalCode() {
        return this.PostalCode;
    }

    /**
     * Set Postal code
     * @param PostalCode Postal code
     */
    public void setPostalCode(String PostalCode) {
        this.PostalCode = PostalCode;
    }

    /**
     * Get Sub-region 
     * @return Subdivision Sub-region
     */
    public String getSubdivision() {
        return this.Subdivision;
    }

    /**
     * Set Sub-region
     * @param Subdivision Sub-region
     */
    public void setSubdivision(String Subdivision) {
        this.Subdivision = Subdivision;
    }

    /**
     * Get city 
     * @return City city
     */
    public String getCity() {
        return this.City;
    }

    /**
     * Set city
     * @param City city
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * Get Complete address 
     * @return FormattedAddress Complete address
     */
    public String getFormattedAddress() {
        return this.FormattedAddress;
    }

    /**
     * Set Complete address
     * @param FormattedAddress Complete address
     */
    public void setFormattedAddress(String FormattedAddress) {
        this.FormattedAddress = FormattedAddress;
    }

    /**
     * Get First line of the address bar 
     * @return LineOne First line of the address bar
     */
    public String getLineOne() {
        return this.LineOne;
    }

    /**
     * Set First line of the address bar
     * @param LineOne First line of the address bar
     */
    public void setLineOne(String LineOne) {
        this.LineOne = LineOne;
    }

    /**
     * Get Second line of the address bar 
     * @return LineTwo Second line of the address bar
     */
    public String getLineTwo() {
        return this.LineTwo;
    }

    /**
     * Set Second line of the address bar
     * @param LineTwo Second line of the address bar
     */
    public void setLineTwo(String LineTwo) {
        this.LineTwo = LineTwo;
    }

    /**
     * Get Third line of the address bar 
     * @return LineThree Third line of the address bar
     */
    public String getLineThree() {
        return this.LineThree;
    }

    /**
     * Set Third line of the address bar
     * @param LineThree Third line of the address bar
     */
    public void setLineThree(String LineThree) {
        this.LineThree = LineThree;
    }

    /**
     * Get Fourth line of the address bar 
     * @return LineFour Fourth line of the address bar
     */
    public String getLineFour() {
        return this.LineFour;
    }

    /**
     * Set Fourth line of the address bar
     * @param LineFour Fourth line of the address bar
     */
    public void setLineFour(String LineFour) {
        this.LineFour = LineFour;
    }

    /**
     * Get Fifth line of the address bar 
     * @return LineFive Fifth line of the address bar
     */
    public String getLineFive() {
        return this.LineFive;
    }

    /**
     * Set Fifth line of the address bar
     * @param LineFive Fifth line of the address bar
     */
    public void setLineFive(String LineFive) {
        this.LineFive = LineFive;
    }

    public Address() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Address(Address source) {
        if (source.Country != null) {
            this.Country = new String(source.Country);
        }
        if (source.PostalCode != null) {
            this.PostalCode = new String(source.PostalCode);
        }
        if (source.Subdivision != null) {
            this.Subdivision = new String(source.Subdivision);
        }
        if (source.City != null) {
            this.City = new String(source.City);
        }
        if (source.FormattedAddress != null) {
            this.FormattedAddress = new String(source.FormattedAddress);
        }
        if (source.LineOne != null) {
            this.LineOne = new String(source.LineOne);
        }
        if (source.LineTwo != null) {
            this.LineTwo = new String(source.LineTwo);
        }
        if (source.LineThree != null) {
            this.LineThree = new String(source.LineThree);
        }
        if (source.LineFour != null) {
            this.LineFour = new String(source.LineFour);
        }
        if (source.LineFive != null) {
            this.LineFive = new String(source.LineFive);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Country", this.Country);
        this.setParamSimple(map, prefix + "PostalCode", this.PostalCode);
        this.setParamSimple(map, prefix + "Subdivision", this.Subdivision);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "FormattedAddress", this.FormattedAddress);
        this.setParamSimple(map, prefix + "LineOne", this.LineOne);
        this.setParamSimple(map, prefix + "LineTwo", this.LineTwo);
        this.setParamSimple(map, prefix + "LineThree", this.LineThree);
        this.setParamSimple(map, prefix + "LineFour", this.LineFour);
        this.setParamSimple(map, prefix + "LineFive", this.LineFive);

    }
}

