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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCertDomainsRequest extends AbstractModel{

    /**
    * Base64-encoded string of certificate in PEM format
    */
    @SerializedName("Cert")
    @Expose
    private String Cert;

    /**
    * Managed certificate ID. `Cert` and `CertId` cannot be both empty. If they’re both filled in, `CerID` prevails.
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

    /**
    * Product of the domain name, either `cdn` (default) or `ecdn`.
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
     * Get Base64-encoded string of certificate in PEM format 
     * @return Cert Base64-encoded string of certificate in PEM format
     */
    public String getCert() {
        return this.Cert;
    }

    /**
     * Set Base64-encoded string of certificate in PEM format
     * @param Cert Base64-encoded string of certificate in PEM format
     */
    public void setCert(String Cert) {
        this.Cert = Cert;
    }

    /**
     * Get Managed certificate ID. `Cert` and `CertId` cannot be both empty. If they’re both filled in, `CerID` prevails. 
     * @return CertId Managed certificate ID. `Cert` and `CertId` cannot be both empty. If they’re both filled in, `CerID` prevails.
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * Set Managed certificate ID. `Cert` and `CertId` cannot be both empty. If they’re both filled in, `CerID` prevails.
     * @param CertId Managed certificate ID. `Cert` and `CertId` cannot be both empty. If they’re both filled in, `CerID` prevails.
     */
    public void setCertId(String CertId) {
        this.CertId = CertId;
    }

    /**
     * Get Product of the domain name, either `cdn` (default) or `ecdn`. 
     * @return Product Product of the domain name, either `cdn` (default) or `ecdn`.
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set Product of the domain name, either `cdn` (default) or `ecdn`.
     * @param Product Product of the domain name, either `cdn` (default) or `ecdn`.
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    public DescribeCertDomainsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCertDomainsRequest(DescribeCertDomainsRequest source) {
        if (source.Cert != null) {
            this.Cert = new String(source.Cert);
        }
        if (source.CertId != null) {
            this.CertId = new String(source.CertId);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Cert", this.Cert);
        this.setParamSimple(map, prefix + "CertId", this.CertId);
        this.setParamSimple(map, prefix + "Product", this.Product);

    }
}

