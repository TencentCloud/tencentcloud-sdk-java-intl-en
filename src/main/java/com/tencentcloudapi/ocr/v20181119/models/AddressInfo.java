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

public class AddressInfo extends AbstractModel {

    /**
    * <p>Country</p>
    */
    @SerializedName("Country")
    @Expose
    private String Country;

    /**
    * <p>Postal code</p>
    */
    @SerializedName("PostalCode")
    @Expose
    private String PostalCode;

    /**
    * <p>Sub-region</p>
    */
    @SerializedName("Subdivision")
    @Expose
    private String Subdivision;

    /**
    * <p>District</p>
    */
    @SerializedName("District")
    @Expose
    private String District;

    /**
    * <p>City</p>
    */
    @SerializedName("City")
    @Expose
    private String City;

    /**
    * <p>Sub-district office</p>
    */
    @SerializedName("Subdistrict")
    @Expose
    private String Subdistrict;

    /**
    * <p>Complete address</p>
    */
    @SerializedName("FormattedAddress")
    @Expose
    private String FormattedAddress;

    /**
    * <p>First line of the address bar</p>
    */
    @SerializedName("LineOne")
    @Expose
    private String LineOne;

    /**
    * <p>Second line of the address bar</p>
    */
    @SerializedName("LineTwo")
    @Expose
    private String LineTwo;

    /**
    * <p>Third line of the address bar</p>
    */
    @SerializedName("LineThree")
    @Expose
    private String LineThree;

    /**
    * <p>Fourth line of the address bar</p>
    */
    @SerializedName("LineFour")
    @Expose
    private String LineFour;

    /**
    * <p>Fifth line of the address bar</p>
    */
    @SerializedName("LineFive")
    @Expose
    private String LineFive;

    /**
     * Get <p>Country</p> 
     * @return Country <p>Country</p>
     */
    public String getCountry() {
        return this.Country;
    }

    /**
     * Set <p>Country</p>
     * @param Country <p>Country</p>
     */
    public void setCountry(String Country) {
        this.Country = Country;
    }

    /**
     * Get <p>Postal code</p> 
     * @return PostalCode <p>Postal code</p>
     */
    public String getPostalCode() {
        return this.PostalCode;
    }

    /**
     * Set <p>Postal code</p>
     * @param PostalCode <p>Postal code</p>
     */
    public void setPostalCode(String PostalCode) {
        this.PostalCode = PostalCode;
    }

    /**
     * Get <p>Sub-region</p> 
     * @return Subdivision <p>Sub-region</p>
     */
    public String getSubdivision() {
        return this.Subdivision;
    }

    /**
     * Set <p>Sub-region</p>
     * @param Subdivision <p>Sub-region</p>
     */
    public void setSubdivision(String Subdivision) {
        this.Subdivision = Subdivision;
    }

    /**
     * Get <p>District</p> 
     * @return District <p>District</p>
     */
    public String getDistrict() {
        return this.District;
    }

    /**
     * Set <p>District</p>
     * @param District <p>District</p>
     */
    public void setDistrict(String District) {
        this.District = District;
    }

    /**
     * Get <p>City</p> 
     * @return City <p>City</p>
     */
    public String getCity() {
        return this.City;
    }

    /**
     * Set <p>City</p>
     * @param City <p>City</p>
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * Get <p>Sub-district office</p> 
     * @return Subdistrict <p>Sub-district office</p>
     */
    public String getSubdistrict() {
        return this.Subdistrict;
    }

    /**
     * Set <p>Sub-district office</p>
     * @param Subdistrict <p>Sub-district office</p>
     */
    public void setSubdistrict(String Subdistrict) {
        this.Subdistrict = Subdistrict;
    }

    /**
     * Get <p>Complete address</p> 
     * @return FormattedAddress <p>Complete address</p>
     */
    public String getFormattedAddress() {
        return this.FormattedAddress;
    }

    /**
     * Set <p>Complete address</p>
     * @param FormattedAddress <p>Complete address</p>
     */
    public void setFormattedAddress(String FormattedAddress) {
        this.FormattedAddress = FormattedAddress;
    }

    /**
     * Get <p>First line of the address bar</p> 
     * @return LineOne <p>First line of the address bar</p>
     */
    public String getLineOne() {
        return this.LineOne;
    }

    /**
     * Set <p>First line of the address bar</p>
     * @param LineOne <p>First line of the address bar</p>
     */
    public void setLineOne(String LineOne) {
        this.LineOne = LineOne;
    }

    /**
     * Get <p>Second line of the address bar</p> 
     * @return LineTwo <p>Second line of the address bar</p>
     */
    public String getLineTwo() {
        return this.LineTwo;
    }

    /**
     * Set <p>Second line of the address bar</p>
     * @param LineTwo <p>Second line of the address bar</p>
     */
    public void setLineTwo(String LineTwo) {
        this.LineTwo = LineTwo;
    }

    /**
     * Get <p>Third line of the address bar</p> 
     * @return LineThree <p>Third line of the address bar</p>
     */
    public String getLineThree() {
        return this.LineThree;
    }

    /**
     * Set <p>Third line of the address bar</p>
     * @param LineThree <p>Third line of the address bar</p>
     */
    public void setLineThree(String LineThree) {
        this.LineThree = LineThree;
    }

    /**
     * Get <p>Fourth line of the address bar</p> 
     * @return LineFour <p>Fourth line of the address bar</p>
     */
    public String getLineFour() {
        return this.LineFour;
    }

    /**
     * Set <p>Fourth line of the address bar</p>
     * @param LineFour <p>Fourth line of the address bar</p>
     */
    public void setLineFour(String LineFour) {
        this.LineFour = LineFour;
    }

    /**
     * Get <p>Fifth line of the address bar</p> 
     * @return LineFive <p>Fifth line of the address bar</p>
     */
    public String getLineFive() {
        return this.LineFive;
    }

    /**
     * Set <p>Fifth line of the address bar</p>
     * @param LineFive <p>Fifth line of the address bar</p>
     */
    public void setLineFive(String LineFive) {
        this.LineFive = LineFive;
    }

    public AddressInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddressInfo(AddressInfo source) {
        if (source.Country != null) {
            this.Country = new String(source.Country);
        }
        if (source.PostalCode != null) {
            this.PostalCode = new String(source.PostalCode);
        }
        if (source.Subdivision != null) {
            this.Subdivision = new String(source.Subdivision);
        }
        if (source.District != null) {
            this.District = new String(source.District);
        }
        if (source.City != null) {
            this.City = new String(source.City);
        }
        if (source.Subdistrict != null) {
            this.Subdistrict = new String(source.Subdistrict);
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
        this.setParamSimple(map, prefix + "District", this.District);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "Subdistrict", this.Subdistrict);
        this.setParamSimple(map, prefix + "FormattedAddress", this.FormattedAddress);
        this.setParamSimple(map, prefix + "LineOne", this.LineOne);
        this.setParamSimple(map, prefix + "LineTwo", this.LineTwo);
        this.setParamSimple(map, prefix + "LineThree", this.LineThree);
        this.setParamSimple(map, prefix + "LineFour", this.LineFour);
        this.setParamSimple(map, prefix + "LineFive", this.LineFive);

    }
}

