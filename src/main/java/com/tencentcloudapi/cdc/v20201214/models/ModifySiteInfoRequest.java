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
package com.tencentcloudapi.cdc.v20201214.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifySiteInfoRequest extends AbstractModel {

    /**
    * Equipment room ID
    */
    @SerializedName("SiteId")
    @Expose
    private String SiteId;

    /**
    * Site name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Site description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Note
    */
    @SerializedName("Note")
    @Expose
    private String Note;

    /**
    * Country where the site is located
    */
    @SerializedName("Country")
    @Expose
    private String Country;

    /**
    * Province where the site is located
    */
    @SerializedName("Province")
    @Expose
    private String Province;

    /**
    * City where the site is located
    */
    @SerializedName("City")
    @Expose
    private String City;

    /**
    * Postal code of the site area
    */
    @SerializedName("PostalCode")
    @Expose
    private String PostalCode;

    /**
    * Detailed address of the site
    */
    @SerializedName("AddressLine")
    @Expose
    private String AddressLine;

    /**
     * Get Equipment room ID 
     * @return SiteId Equipment room ID
     */
    public String getSiteId() {
        return this.SiteId;
    }

    /**
     * Set Equipment room ID
     * @param SiteId Equipment room ID
     */
    public void setSiteId(String SiteId) {
        this.SiteId = SiteId;
    }

    /**
     * Get Site name 
     * @return Name Site name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Site name
     * @param Name Site name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Site description 
     * @return Description Site description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Site description
     * @param Description Site description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Note 
     * @return Note Note
     */
    public String getNote() {
        return this.Note;
    }

    /**
     * Set Note
     * @param Note Note
     */
    public void setNote(String Note) {
        this.Note = Note;
    }

    /**
     * Get Country where the site is located 
     * @return Country Country where the site is located
     */
    public String getCountry() {
        return this.Country;
    }

    /**
     * Set Country where the site is located
     * @param Country Country where the site is located
     */
    public void setCountry(String Country) {
        this.Country = Country;
    }

    /**
     * Get Province where the site is located 
     * @return Province Province where the site is located
     */
    public String getProvince() {
        return this.Province;
    }

    /**
     * Set Province where the site is located
     * @param Province Province where the site is located
     */
    public void setProvince(String Province) {
        this.Province = Province;
    }

    /**
     * Get City where the site is located 
     * @return City City where the site is located
     */
    public String getCity() {
        return this.City;
    }

    /**
     * Set City where the site is located
     * @param City City where the site is located
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * Get Postal code of the site area 
     * @return PostalCode Postal code of the site area
     */
    public String getPostalCode() {
        return this.PostalCode;
    }

    /**
     * Set Postal code of the site area
     * @param PostalCode Postal code of the site area
     */
    public void setPostalCode(String PostalCode) {
        this.PostalCode = PostalCode;
    }

    /**
     * Get Detailed address of the site 
     * @return AddressLine Detailed address of the site
     */
    public String getAddressLine() {
        return this.AddressLine;
    }

    /**
     * Set Detailed address of the site
     * @param AddressLine Detailed address of the site
     */
    public void setAddressLine(String AddressLine) {
        this.AddressLine = AddressLine;
    }

    public ModifySiteInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySiteInfoRequest(ModifySiteInfoRequest source) {
        if (source.SiteId != null) {
            this.SiteId = new String(source.SiteId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Note != null) {
            this.Note = new String(source.Note);
        }
        if (source.Country != null) {
            this.Country = new String(source.Country);
        }
        if (source.Province != null) {
            this.Province = new String(source.Province);
        }
        if (source.City != null) {
            this.City = new String(source.City);
        }
        if (source.PostalCode != null) {
            this.PostalCode = new String(source.PostalCode);
        }
        if (source.AddressLine != null) {
            this.AddressLine = new String(source.AddressLine);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SiteId", this.SiteId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Note", this.Note);
        this.setParamSimple(map, prefix + "Country", this.Country);
        this.setParamSimple(map, prefix + "Province", this.Province);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "PostalCode", this.PostalCode);
        this.setParamSimple(map, prefix + "AddressLine", this.AddressLine);

    }
}

