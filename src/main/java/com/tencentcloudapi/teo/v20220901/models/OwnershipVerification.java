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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OwnershipVerification extends AbstractModel {

    /**
    * Information required for CNAME and domainless access when using DNS resolution verification. For details, see [Site/Domain Ownership Verification].
](https://www.tencentcloud.com/document/product/1552/70789?from_cn_redirect=1#7af6ecf8-afca-4e35-8811-b5797ed1bde5).
    */
    @SerializedName("DnsVerification")
    @Expose
    private DnsVerification DnsVerification;

    /**
    * CNAME, when there is no domain name access, the information required for file verification is used. For details, see [Site/Domain Ownership Verification
](https://www.tencentcloud.com/document/product/1552/70789?from_cn_redirect=1#7af6ecf8-afca-4e35-8811-b5797ed1bde5).
    */
    @SerializedName("FileVerification")
    @Expose
    private FileVerification FileVerification;

    /**
    * Information required for access via NS and switching DNS servers. For details, see [Modify DNS Server](https://www.tencentcloud.com/document/product/1552/90452?from_cn_redirect=1).
    */
    @SerializedName("NsVerification")
    @Expose
    private NsVerification NsVerification;

    /**
     * Get Information required for CNAME and domainless access when using DNS resolution verification. For details, see [Site/Domain Ownership Verification].
](https://www.tencentcloud.com/document/product/1552/70789?from_cn_redirect=1#7af6ecf8-afca-4e35-8811-b5797ed1bde5). 
     * @return DnsVerification Information required for CNAME and domainless access when using DNS resolution verification. For details, see [Site/Domain Ownership Verification].
](https://www.tencentcloud.com/document/product/1552/70789?from_cn_redirect=1#7af6ecf8-afca-4e35-8811-b5797ed1bde5).
     */
    public DnsVerification getDnsVerification() {
        return this.DnsVerification;
    }

    /**
     * Set Information required for CNAME and domainless access when using DNS resolution verification. For details, see [Site/Domain Ownership Verification].
](https://www.tencentcloud.com/document/product/1552/70789?from_cn_redirect=1#7af6ecf8-afca-4e35-8811-b5797ed1bde5).
     * @param DnsVerification Information required for CNAME and domainless access when using DNS resolution verification. For details, see [Site/Domain Ownership Verification].
](https://www.tencentcloud.com/document/product/1552/70789?from_cn_redirect=1#7af6ecf8-afca-4e35-8811-b5797ed1bde5).
     */
    public void setDnsVerification(DnsVerification DnsVerification) {
        this.DnsVerification = DnsVerification;
    }

    /**
     * Get CNAME, when there is no domain name access, the information required for file verification is used. For details, see [Site/Domain Ownership Verification
](https://www.tencentcloud.com/document/product/1552/70789?from_cn_redirect=1#7af6ecf8-afca-4e35-8811-b5797ed1bde5). 
     * @return FileVerification CNAME, when there is no domain name access, the information required for file verification is used. For details, see [Site/Domain Ownership Verification
](https://www.tencentcloud.com/document/product/1552/70789?from_cn_redirect=1#7af6ecf8-afca-4e35-8811-b5797ed1bde5).
     */
    public FileVerification getFileVerification() {
        return this.FileVerification;
    }

    /**
     * Set CNAME, when there is no domain name access, the information required for file verification is used. For details, see [Site/Domain Ownership Verification
](https://www.tencentcloud.com/document/product/1552/70789?from_cn_redirect=1#7af6ecf8-afca-4e35-8811-b5797ed1bde5).
     * @param FileVerification CNAME, when there is no domain name access, the information required for file verification is used. For details, see [Site/Domain Ownership Verification
](https://www.tencentcloud.com/document/product/1552/70789?from_cn_redirect=1#7af6ecf8-afca-4e35-8811-b5797ed1bde5).
     */
    public void setFileVerification(FileVerification FileVerification) {
        this.FileVerification = FileVerification;
    }

    /**
     * Get Information required for access via NS and switching DNS servers. For details, see [Modify DNS Server](https://www.tencentcloud.com/document/product/1552/90452?from_cn_redirect=1). 
     * @return NsVerification Information required for access via NS and switching DNS servers. For details, see [Modify DNS Server](https://www.tencentcloud.com/document/product/1552/90452?from_cn_redirect=1).
     */
    public NsVerification getNsVerification() {
        return this.NsVerification;
    }

    /**
     * Set Information required for access via NS and switching DNS servers. For details, see [Modify DNS Server](https://www.tencentcloud.com/document/product/1552/90452?from_cn_redirect=1).
     * @param NsVerification Information required for access via NS and switching DNS servers. For details, see [Modify DNS Server](https://www.tencentcloud.com/document/product/1552/90452?from_cn_redirect=1).
     */
    public void setNsVerification(NsVerification NsVerification) {
        this.NsVerification = NsVerification;
    }

    public OwnershipVerification() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OwnershipVerification(OwnershipVerification source) {
        if (source.DnsVerification != null) {
            this.DnsVerification = new DnsVerification(source.DnsVerification);
        }
        if (source.FileVerification != null) {
            this.FileVerification = new FileVerification(source.FileVerification);
        }
        if (source.NsVerification != null) {
            this.NsVerification = new NsVerification(source.NsVerification);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "DnsVerification.", this.DnsVerification);
        this.setParamObj(map, prefix + "FileVerification.", this.FileVerification);
        this.setParamObj(map, prefix + "NsVerification.", this.NsVerification);

    }
}

