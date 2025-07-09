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
    * Nationality.
    */
    @SerializedName("Country")
    @Expose
    private String Country;

    /**
    * Post code.
    */
    @SerializedName("PostalCode")
    @Expose
    private String PostalCode;

    /**
    * Subregion.
    */
    @SerializedName("Subdivision")
    @Expose
    private String Subdivision;

    /**
    * City.
    */
    @SerializedName("City")
    @Expose
    private String City;

    /**
    * Complete address.
    */
    @SerializedName("FormattedAddress")
    @Expose
    private String FormattedAddress;

    /**
    * The first line of address.
    */
    @SerializedName("LineOne")
    @Expose
    private String LineOne;

    /**
    * The second line of address.
    */
    @SerializedName("LineTwo")
    @Expose
    private String LineTwo;

    /**
    * The third line of address.
    */
    @SerializedName("LineThree")
    @Expose
    private String LineThree;

    /**
    * The fourth line of address.
    */
    @SerializedName("LineFour")
    @Expose
    private String LineFour;

    /**
    * The fifth line of address.
    */
    @SerializedName("LineFive")
    @Expose
    private String LineFive;

    /**
     * Get Nationality. 
     * @return Country Nationality.
     */
    public String getCountry() {
        return this.Country;
    }

    /**
     * Set Nationality.
     * @param Country Nationality.
     */
    public void setCountry(String Country) {
        this.Country = Country;
    }

    /**
     * Get Post code. 
     * @return PostalCode Post code.
     */
    public String getPostalCode() {
        return this.PostalCode;
    }

    /**
     * Set Post code.
     * @param PostalCode Post code.
     */
    public void setPostalCode(String PostalCode) {
        this.PostalCode = PostalCode;
    }

    /**
     * Get Subregion. 
     * @return Subdivision Subregion.
     */
    public String getSubdivision() {
        return this.Subdivision;
    }

    /**
     * Set Subregion.
     * @param Subdivision Subregion.
     */
    public void setSubdivision(String Subdivision) {
        this.Subdivision = Subdivision;
    }

    /**
     * Get City. 
     * @return City City.
     */
    public String getCity() {
        return this.City;
    }

    /**
     * Set City.
     * @param City City.
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * Get Complete address. 
     * @return FormattedAddress Complete address.
     */
    public String getFormattedAddress() {
        return this.FormattedAddress;
    }

    /**
     * Set Complete address.
     * @param FormattedAddress Complete address.
     */
    public void setFormattedAddress(String FormattedAddress) {
        this.FormattedAddress = FormattedAddress;
    }

    /**
     * Get The first line of address. 
     * @return LineOne The first line of address.
     */
    public String getLineOne() {
        return this.LineOne;
    }

    /**
     * Set The first line of address.
     * @param LineOne The first line of address.
     */
    public void setLineOne(String LineOne) {
        this.LineOne = LineOne;
    }

    /**
     * Get The second line of address. 
     * @return LineTwo The second line of address.
     */
    public String getLineTwo() {
        return this.LineTwo;
    }

    /**
     * Set The second line of address.
     * @param LineTwo The second line of address.
     */
    public void setLineTwo(String LineTwo) {
        this.LineTwo = LineTwo;
    }

    /**
     * Get The third line of address. 
     * @return LineThree The third line of address.
     */
    public String getLineThree() {
        return this.LineThree;
    }

    /**
     * Set The third line of address.
     * @param LineThree The third line of address.
     */
    public void setLineThree(String LineThree) {
        this.LineThree = LineThree;
    }

    /**
     * Get The fourth line of address. 
     * @return LineFour The fourth line of address.
     */
    public String getLineFour() {
        return this.LineFour;
    }

    /**
     * Set The fourth line of address.
     * @param LineFour The fourth line of address.
     */
    public void setLineFour(String LineFour) {
        this.LineFour = LineFour;
    }

    /**
     * Get The fifth line of address. 
     * @return LineFive The fifth line of address.
     */
    public String getLineFive() {
        return this.LineFive;
    }

    /**
     * Set The fifth line of address.
     * @param LineFive The fifth line of address.
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

