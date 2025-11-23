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
    * Country.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Country")
    @Expose
    private String Country;

    /**
    * Postal code.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PostalCode")
    @Expose
    private String PostalCode;

    /**
    * Specifies the sub-region.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Subdivision")
    @Expose
    private String Subdivision;

    /**
    * Specifies the city.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("City")
    @Expose
    private String City;

    /**
    * Complete address.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FormattedAddress")
    @Expose
    private String FormattedAddress;

    /**
    * First line of the address bar.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LineOne")
    @Expose
    private String LineOne;

    /**
    * Second line of the address bar.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LineTwo")
    @Expose
    private String LineTwo;

    /**
    * Specifies the third line of the address bar.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LineThree")
    @Expose
    private String LineThree;

    /**
    * Specifies the fourth line of the address bar.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LineFour")
    @Expose
    private String LineFour;

    /**
    * Specifies the fifth line in the address bar.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LineFive")
    @Expose
    private String LineFive;

    /**
     * Get Country.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Country Country.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCountry() {
        return this.Country;
    }

    /**
     * Set Country.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Country Country.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCountry(String Country) {
        this.Country = Country;
    }

    /**
     * Get Postal code.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PostalCode Postal code.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPostalCode() {
        return this.PostalCode;
    }

    /**
     * Set Postal code.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PostalCode Postal code.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPostalCode(String PostalCode) {
        this.PostalCode = PostalCode;
    }

    /**
     * Get Specifies the sub-region.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Subdivision Specifies the sub-region.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSubdivision() {
        return this.Subdivision;
    }

    /**
     * Set Specifies the sub-region.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Subdivision Specifies the sub-region.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSubdivision(String Subdivision) {
        this.Subdivision = Subdivision;
    }

    /**
     * Get Specifies the city.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return City Specifies the city.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCity() {
        return this.City;
    }

    /**
     * Set Specifies the city.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param City Specifies the city.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * Get Complete address.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FormattedAddress Complete address.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFormattedAddress() {
        return this.FormattedAddress;
    }

    /**
     * Set Complete address.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FormattedAddress Complete address.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFormattedAddress(String FormattedAddress) {
        this.FormattedAddress = FormattedAddress;
    }

    /**
     * Get First line of the address bar.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LineOne First line of the address bar.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLineOne() {
        return this.LineOne;
    }

    /**
     * Set First line of the address bar.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LineOne First line of the address bar.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLineOne(String LineOne) {
        this.LineOne = LineOne;
    }

    /**
     * Get Second line of the address bar.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LineTwo Second line of the address bar.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLineTwo() {
        return this.LineTwo;
    }

    /**
     * Set Second line of the address bar.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LineTwo Second line of the address bar.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLineTwo(String LineTwo) {
        this.LineTwo = LineTwo;
    }

    /**
     * Get Specifies the third line of the address bar.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LineThree Specifies the third line of the address bar.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLineThree() {
        return this.LineThree;
    }

    /**
     * Set Specifies the third line of the address bar.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LineThree Specifies the third line of the address bar.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLineThree(String LineThree) {
        this.LineThree = LineThree;
    }

    /**
     * Get Specifies the fourth line of the address bar.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LineFour Specifies the fourth line of the address bar.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLineFour() {
        return this.LineFour;
    }

    /**
     * Set Specifies the fourth line of the address bar.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LineFour Specifies the fourth line of the address bar.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLineFour(String LineFour) {
        this.LineFour = LineFour;
    }

    /**
     * Get Specifies the fifth line in the address bar.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LineFive Specifies the fifth line in the address bar.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLineFive() {
        return this.LineFive;
    }

    /**
     * Set Specifies the fifth line in the address bar.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LineFive Specifies the fifth line in the address bar.
Note: This field may return null, indicating that no valid values can be obtained.
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

