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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KongCertificatesList extends AbstractModel {

    /**
    * Total Quantity of Certificate Lists
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * None.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CertificatesList")
    @Expose
    private KongCertificatesPreview [] CertificatesList;

    /**
    * Total number of pages in the certificate list
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Pages")
    @Expose
    private Long Pages;

    /**
     * Get Total Quantity of Certificate Lists 
     * @return Total Total Quantity of Certificate Lists
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set Total Quantity of Certificate Lists
     * @param Total Total Quantity of Certificate Lists
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get None.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CertificatesList None.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public KongCertificatesPreview [] getCertificatesList() {
        return this.CertificatesList;
    }

    /**
     * Set None.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CertificatesList None.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCertificatesList(KongCertificatesPreview [] CertificatesList) {
        this.CertificatesList = CertificatesList;
    }

    /**
     * Get Total number of pages in the certificate list
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Pages Total number of pages in the certificate list
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public Long getPages() {
        return this.Pages;
    }

    /**
     * Set Total number of pages in the certificate list
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Pages Total number of pages in the certificate list
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public void setPages(Long Pages) {
        this.Pages = Pages;
    }

    public KongCertificatesList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KongCertificatesList(KongCertificatesList source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.CertificatesList != null) {
            this.CertificatesList = new KongCertificatesPreview[source.CertificatesList.length];
            for (int i = 0; i < source.CertificatesList.length; i++) {
                this.CertificatesList[i] = new KongCertificatesPreview(source.CertificatesList[i]);
            }
        }
        if (source.Pages != null) {
            this.Pages = new Long(source.Pages);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "CertificatesList.", this.CertificatesList);
        this.setParamSimple(map, prefix + "Pages", this.Pages);

    }
}

