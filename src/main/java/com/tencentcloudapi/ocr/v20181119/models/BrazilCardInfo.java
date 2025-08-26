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

public class BrazilCardInfo extends AbstractModel {

    /**
    * RNE document.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RNE")
    @Expose
    private BrazilRNEInfo RNE;

    /**
    * Specifies the document.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RNM")
    @Expose
    private BrazilRNMInfo RNM;

    /**
    * Driver license document.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DriverLicense")
    @Expose
    private BrazilDriverLicenseInfo DriverLicense;

    /**
    * ID card document.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IDCard")
    @Expose
    private BrazilIDCardInfo IDCard;

    /**
     * Get RNE document.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RNE RNE document.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public BrazilRNEInfo getRNE() {
        return this.RNE;
    }

    /**
     * Set RNE document.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RNE RNE document.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRNE(BrazilRNEInfo RNE) {
        this.RNE = RNE;
    }

    /**
     * Get Specifies the document.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RNM Specifies the document.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public BrazilRNMInfo getRNM() {
        return this.RNM;
    }

    /**
     * Set Specifies the document.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RNM Specifies the document.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRNM(BrazilRNMInfo RNM) {
        this.RNM = RNM;
    }

    /**
     * Get Driver license document.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DriverLicense Driver license document.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public BrazilDriverLicenseInfo getDriverLicense() {
        return this.DriverLicense;
    }

    /**
     * Set Driver license document.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DriverLicense Driver license document.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDriverLicense(BrazilDriverLicenseInfo DriverLicense) {
        this.DriverLicense = DriverLicense;
    }

    /**
     * Get ID card document.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IDCard ID card document.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public BrazilIDCardInfo getIDCard() {
        return this.IDCard;
    }

    /**
     * Set ID card document.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IDCard ID card document.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIDCard(BrazilIDCardInfo IDCard) {
        this.IDCard = IDCard;
    }

    public BrazilCardInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BrazilCardInfo(BrazilCardInfo source) {
        if (source.RNE != null) {
            this.RNE = new BrazilRNEInfo(source.RNE);
        }
        if (source.RNM != null) {
            this.RNM = new BrazilRNMInfo(source.RNM);
        }
        if (source.DriverLicense != null) {
            this.DriverLicense = new BrazilDriverLicenseInfo(source.DriverLicense);
        }
        if (source.IDCard != null) {
            this.IDCard = new BrazilIDCardInfo(source.IDCard);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "RNE.", this.RNE);
        this.setParamObj(map, prefix + "RNM.", this.RNM);
        this.setParamObj(map, prefix + "DriverLicense.", this.DriverLicense);
        this.setParamObj(map, prefix + "IDCard.", this.IDCard);

    }
}

