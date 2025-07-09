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
    * CNAME, when there is no domain name access, the information required for DNS resolution verification is used. For details, refer to [Site/Domain Ownership Verification
](https://intl.cloud.tencent.com/document/product/1552/70789?from_cn_redirect=1#7af6ecf8-afca-4e35-8811-b5797ed1bde5).
Note: This field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("DnsVerification")
    @Expose
    private DnsVerification DnsVerification;

    /**
    * CNAME, when there is no domain name access, the information required for file verification is used. For details, refer to [Site/Domain Ownership Verification
](https://intl.cloud.tencent.com/document/product/1552/70789?from_cn_redirect=1#7af6ecf8-afca-4e35-8811-b5797ed1bde5).
Note: This field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("FileVerification")
    @Expose
    private FileVerification FileVerification;

    /**
    * u200cInformation required for switching DNS servers. It's applicable to sites connected via NSs. For details, see [Modifying DNS Server](https://intl.cloud.tencent.com/document/product/1552/90452?from_cn_redirect=1).
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("NsVerification")
    @Expose
    private NsVerification NsVerification;

    /**
     * Get CNAME, when there is no domain name access, the information required for DNS resolution verification is used. For details, refer to [Site/Domain Ownership Verification
](https://intl.cloud.tencent.com/document/product/1552/70789?from_cn_redirect=1#7af6ecf8-afca-4e35-8811-b5797ed1bde5).
Note: This field may return null, which indicates a failure to obtain a valid value. 
     * @return DnsVerification CNAME, when there is no domain name access, the information required for DNS resolution verification is used. For details, refer to [Site/Domain Ownership Verification
](https://intl.cloud.tencent.com/document/product/1552/70789?from_cn_redirect=1#7af6ecf8-afca-4e35-8811-b5797ed1bde5).
Note: This field may return null, which indicates a failure to obtain a valid value.
     */
    public DnsVerification getDnsVerification() {
        return this.DnsVerification;
    }

    /**
     * Set CNAME, when there is no domain name access, the information required for DNS resolution verification is used. For details, refer to [Site/Domain Ownership Verification
](https://intl.cloud.tencent.com/document/product/1552/70789?from_cn_redirect=1#7af6ecf8-afca-4e35-8811-b5797ed1bde5).
Note: This field may return null, which indicates a failure to obtain a valid value.
     * @param DnsVerification CNAME, when there is no domain name access, the information required for DNS resolution verification is used. For details, refer to [Site/Domain Ownership Verification
](https://intl.cloud.tencent.com/document/product/1552/70789?from_cn_redirect=1#7af6ecf8-afca-4e35-8811-b5797ed1bde5).
Note: This field may return null, which indicates a failure to obtain a valid value.
     */
    public void setDnsVerification(DnsVerification DnsVerification) {
        this.DnsVerification = DnsVerification;
    }

    /**
     * Get CNAME, when there is no domain name access, the information required for file verification is used. For details, refer to [Site/Domain Ownership Verification
](https://intl.cloud.tencent.com/document/product/1552/70789?from_cn_redirect=1#7af6ecf8-afca-4e35-8811-b5797ed1bde5).
Note: This field may return null, which indicates a failure to obtain a valid value. 
     * @return FileVerification CNAME, when there is no domain name access, the information required for file verification is used. For details, refer to [Site/Domain Ownership Verification
](https://intl.cloud.tencent.com/document/product/1552/70789?from_cn_redirect=1#7af6ecf8-afca-4e35-8811-b5797ed1bde5).
Note: This field may return null, which indicates a failure to obtain a valid value.
     */
    public FileVerification getFileVerification() {
        return this.FileVerification;
    }

    /**
     * Set CNAME, when there is no domain name access, the information required for file verification is used. For details, refer to [Site/Domain Ownership Verification
](https://intl.cloud.tencent.com/document/product/1552/70789?from_cn_redirect=1#7af6ecf8-afca-4e35-8811-b5797ed1bde5).
Note: This field may return null, which indicates a failure to obtain a valid value.
     * @param FileVerification CNAME, when there is no domain name access, the information required for file verification is used. For details, refer to [Site/Domain Ownership Verification
](https://intl.cloud.tencent.com/document/product/1552/70789?from_cn_redirect=1#7af6ecf8-afca-4e35-8811-b5797ed1bde5).
Note: This field may return null, which indicates a failure to obtain a valid value.
     */
    public void setFileVerification(FileVerification FileVerification) {
        this.FileVerification = FileVerification;
    }

    /**
     * Get u200cInformation required for switching DNS servers. It's applicable to sites connected via NSs. For details, see [Modifying DNS Server](https://intl.cloud.tencent.com/document/product/1552/90452?from_cn_redirect=1).
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return NsVerification u200cInformation required for switching DNS servers. It's applicable to sites connected via NSs. For details, see [Modifying DNS Server](https://intl.cloud.tencent.com/document/product/1552/90452?from_cn_redirect=1).
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public NsVerification getNsVerification() {
        return this.NsVerification;
    }

    /**
     * Set u200cInformation required for switching DNS servers. It's applicable to sites connected via NSs. For details, see [Modifying DNS Server](https://intl.cloud.tencent.com/document/product/1552/90452?from_cn_redirect=1).
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param NsVerification u200cInformation required for switching DNS servers. It's applicable to sites connected via NSs. For details, see [Modifying DNS Server](https://intl.cloud.tencent.com/document/product/1552/90452?from_cn_redirect=1).
Note: This field may return·null, indicating that no valid values can be obtained.
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

