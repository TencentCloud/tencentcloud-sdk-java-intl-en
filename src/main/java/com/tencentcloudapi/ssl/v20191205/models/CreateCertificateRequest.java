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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCertificateRequest extends AbstractModel {

    /**
    * Certificate product id. `3`: securesite ev pro; `4`: securesite ev; `5`: securesite ov pro; `6`: securesite ov; `7`: securesite ov wildcard; `8`: geotrust ev; `9`: geotrust ov; `10`: geotrust ov wildcard; `11`: trustasia dv multi-domain; `12`: trustasia dv wildcard; `13`: trustasia ov wildcard d3; `14`: trustasia ov d3; `15`: trustasia ov multi-domain d3; `16`: trustasia ev d3; `17`: trustasia ev multi-domain d3; `18`: globalsign ov; `19`: globalsign ov wildcard; `20`: globalsign ev; `21`: trustasia ov wildcard multi-domain d3; `22`: globalsign ov multi-domain; `23`: globalsign ov wildcard multi-domain; `24`: globalsign ev multi-domain; `25`: wotrus dv; `26`: wotrus dv multi-domain; `27`: wotrus dv wildcard; `28`: wotrus ov; `29`: wotrus ov multi-domain; `30`: wotrus ov wildcard; `31`: wotrus ev; `32`: wotrus ev multi-domain; `33`: DNSPod sm2 dv; `34`: DNSPod sm2 dv multi-domain; `35`: DNSPod sm2 dv wildcard; `37`: DNSPod sm2 ov; `38`: DNSPod sm2 ov multi-domain; `39`: DNSPod sm2 ov wildcard; `40`: DNSPod sm2 ev; `41`: DNSPod sm2 ev multi-domain; `42`: trustasia dv wildcard multi-domain; `43`: dnspod-ov ssl certificate; `44`: dnspod-ov wildcard ssl certificate; `45`: dnspod-ov multi-domain ssl certificate; `46`: dnspod-ev ssl certificate; `47`: dnspod-ev multi-domain ssl certificate; `48`: dnspod-dv ssl certificate; `49`: dnspod-dv wildcard ssl certificate; `50`: dnspod-dv multi-domain ssl certificate; `51`: DNSPod (sm2)-ov ssl certificate; `52`: DNSPod (sm2)-ov wildcard ssl certificate; `53`: DNSPod (sm2)-ov multi-domain ssl certificate; `54`: DNSPod (sm2)-dv ssl certificate; `55`: DNSPod (sm2)-dv wildcard ssl certificate; `56`: DNSPod (sm2)-dv multi-domain ssl certificate; `57`: securesite ov pro multi-domain; `58`: securesite ov multi-domain; `59`: securesite ev pro multi-domain; `60`: securesite ev multi-domain; `61`: geotrust ev multi-domain.
    */
    @SerializedName("ProductId")
    @Expose
    private Long ProductId;

    /**
    * Number of domains associated with the certificate
    */
    @SerializedName("DomainNum")
    @Expose
    private Long DomainNum;

    /**
    * Certificate validity period.
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * Whether to automatically use vouchers: 1 for yes, 0 for no; the default is 1.
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Long AutoVoucher;

    /**
    * Tag, generate tags for certificates.
    */
    @SerializedName("Tags")
    @Expose
    private Tags [] Tags;

    /**
     * Get Certificate product id. `3`: securesite ev pro; `4`: securesite ev; `5`: securesite ov pro; `6`: securesite ov; `7`: securesite ov wildcard; `8`: geotrust ev; `9`: geotrust ov; `10`: geotrust ov wildcard; `11`: trustasia dv multi-domain; `12`: trustasia dv wildcard; `13`: trustasia ov wildcard d3; `14`: trustasia ov d3; `15`: trustasia ov multi-domain d3; `16`: trustasia ev d3; `17`: trustasia ev multi-domain d3; `18`: globalsign ov; `19`: globalsign ov wildcard; `20`: globalsign ev; `21`: trustasia ov wildcard multi-domain d3; `22`: globalsign ov multi-domain; `23`: globalsign ov wildcard multi-domain; `24`: globalsign ev multi-domain; `25`: wotrus dv; `26`: wotrus dv multi-domain; `27`: wotrus dv wildcard; `28`: wotrus ov; `29`: wotrus ov multi-domain; `30`: wotrus ov wildcard; `31`: wotrus ev; `32`: wotrus ev multi-domain; `33`: DNSPod sm2 dv; `34`: DNSPod sm2 dv multi-domain; `35`: DNSPod sm2 dv wildcard; `37`: DNSPod sm2 ov; `38`: DNSPod sm2 ov multi-domain; `39`: DNSPod sm2 ov wildcard; `40`: DNSPod sm2 ev; `41`: DNSPod sm2 ev multi-domain; `42`: trustasia dv wildcard multi-domain; `43`: dnspod-ov ssl certificate; `44`: dnspod-ov wildcard ssl certificate; `45`: dnspod-ov multi-domain ssl certificate; `46`: dnspod-ev ssl certificate; `47`: dnspod-ev multi-domain ssl certificate; `48`: dnspod-dv ssl certificate; `49`: dnspod-dv wildcard ssl certificate; `50`: dnspod-dv multi-domain ssl certificate; `51`: DNSPod (sm2)-ov ssl certificate; `52`: DNSPod (sm2)-ov wildcard ssl certificate; `53`: DNSPod (sm2)-ov multi-domain ssl certificate; `54`: DNSPod (sm2)-dv ssl certificate; `55`: DNSPod (sm2)-dv wildcard ssl certificate; `56`: DNSPod (sm2)-dv multi-domain ssl certificate; `57`: securesite ov pro multi-domain; `58`: securesite ov multi-domain; `59`: securesite ev pro multi-domain; `60`: securesite ev multi-domain; `61`: geotrust ev multi-domain. 
     * @return ProductId Certificate product id. `3`: securesite ev pro; `4`: securesite ev; `5`: securesite ov pro; `6`: securesite ov; `7`: securesite ov wildcard; `8`: geotrust ev; `9`: geotrust ov; `10`: geotrust ov wildcard; `11`: trustasia dv multi-domain; `12`: trustasia dv wildcard; `13`: trustasia ov wildcard d3; `14`: trustasia ov d3; `15`: trustasia ov multi-domain d3; `16`: trustasia ev d3; `17`: trustasia ev multi-domain d3; `18`: globalsign ov; `19`: globalsign ov wildcard; `20`: globalsign ev; `21`: trustasia ov wildcard multi-domain d3; `22`: globalsign ov multi-domain; `23`: globalsign ov wildcard multi-domain; `24`: globalsign ev multi-domain; `25`: wotrus dv; `26`: wotrus dv multi-domain; `27`: wotrus dv wildcard; `28`: wotrus ov; `29`: wotrus ov multi-domain; `30`: wotrus ov wildcard; `31`: wotrus ev; `32`: wotrus ev multi-domain; `33`: DNSPod sm2 dv; `34`: DNSPod sm2 dv multi-domain; `35`: DNSPod sm2 dv wildcard; `37`: DNSPod sm2 ov; `38`: DNSPod sm2 ov multi-domain; `39`: DNSPod sm2 ov wildcard; `40`: DNSPod sm2 ev; `41`: DNSPod sm2 ev multi-domain; `42`: trustasia dv wildcard multi-domain; `43`: dnspod-ov ssl certificate; `44`: dnspod-ov wildcard ssl certificate; `45`: dnspod-ov multi-domain ssl certificate; `46`: dnspod-ev ssl certificate; `47`: dnspod-ev multi-domain ssl certificate; `48`: dnspod-dv ssl certificate; `49`: dnspod-dv wildcard ssl certificate; `50`: dnspod-dv multi-domain ssl certificate; `51`: DNSPod (sm2)-ov ssl certificate; `52`: DNSPod (sm2)-ov wildcard ssl certificate; `53`: DNSPod (sm2)-ov multi-domain ssl certificate; `54`: DNSPod (sm2)-dv ssl certificate; `55`: DNSPod (sm2)-dv wildcard ssl certificate; `56`: DNSPod (sm2)-dv multi-domain ssl certificate; `57`: securesite ov pro multi-domain; `58`: securesite ov multi-domain; `59`: securesite ev pro multi-domain; `60`: securesite ev multi-domain; `61`: geotrust ev multi-domain.
     */
    public Long getProductId() {
        return this.ProductId;
    }

    /**
     * Set Certificate product id. `3`: securesite ev pro; `4`: securesite ev; `5`: securesite ov pro; `6`: securesite ov; `7`: securesite ov wildcard; `8`: geotrust ev; `9`: geotrust ov; `10`: geotrust ov wildcard; `11`: trustasia dv multi-domain; `12`: trustasia dv wildcard; `13`: trustasia ov wildcard d3; `14`: trustasia ov d3; `15`: trustasia ov multi-domain d3; `16`: trustasia ev d3; `17`: trustasia ev multi-domain d3; `18`: globalsign ov; `19`: globalsign ov wildcard; `20`: globalsign ev; `21`: trustasia ov wildcard multi-domain d3; `22`: globalsign ov multi-domain; `23`: globalsign ov wildcard multi-domain; `24`: globalsign ev multi-domain; `25`: wotrus dv; `26`: wotrus dv multi-domain; `27`: wotrus dv wildcard; `28`: wotrus ov; `29`: wotrus ov multi-domain; `30`: wotrus ov wildcard; `31`: wotrus ev; `32`: wotrus ev multi-domain; `33`: DNSPod sm2 dv; `34`: DNSPod sm2 dv multi-domain; `35`: DNSPod sm2 dv wildcard; `37`: DNSPod sm2 ov; `38`: DNSPod sm2 ov multi-domain; `39`: DNSPod sm2 ov wildcard; `40`: DNSPod sm2 ev; `41`: DNSPod sm2 ev multi-domain; `42`: trustasia dv wildcard multi-domain; `43`: dnspod-ov ssl certificate; `44`: dnspod-ov wildcard ssl certificate; `45`: dnspod-ov multi-domain ssl certificate; `46`: dnspod-ev ssl certificate; `47`: dnspod-ev multi-domain ssl certificate; `48`: dnspod-dv ssl certificate; `49`: dnspod-dv wildcard ssl certificate; `50`: dnspod-dv multi-domain ssl certificate; `51`: DNSPod (sm2)-ov ssl certificate; `52`: DNSPod (sm2)-ov wildcard ssl certificate; `53`: DNSPod (sm2)-ov multi-domain ssl certificate; `54`: DNSPod (sm2)-dv ssl certificate; `55`: DNSPod (sm2)-dv wildcard ssl certificate; `56`: DNSPod (sm2)-dv multi-domain ssl certificate; `57`: securesite ov pro multi-domain; `58`: securesite ov multi-domain; `59`: securesite ev pro multi-domain; `60`: securesite ev multi-domain; `61`: geotrust ev multi-domain.
     * @param ProductId Certificate product id. `3`: securesite ev pro; `4`: securesite ev; `5`: securesite ov pro; `6`: securesite ov; `7`: securesite ov wildcard; `8`: geotrust ev; `9`: geotrust ov; `10`: geotrust ov wildcard; `11`: trustasia dv multi-domain; `12`: trustasia dv wildcard; `13`: trustasia ov wildcard d3; `14`: trustasia ov d3; `15`: trustasia ov multi-domain d3; `16`: trustasia ev d3; `17`: trustasia ev multi-domain d3; `18`: globalsign ov; `19`: globalsign ov wildcard; `20`: globalsign ev; `21`: trustasia ov wildcard multi-domain d3; `22`: globalsign ov multi-domain; `23`: globalsign ov wildcard multi-domain; `24`: globalsign ev multi-domain; `25`: wotrus dv; `26`: wotrus dv multi-domain; `27`: wotrus dv wildcard; `28`: wotrus ov; `29`: wotrus ov multi-domain; `30`: wotrus ov wildcard; `31`: wotrus ev; `32`: wotrus ev multi-domain; `33`: DNSPod sm2 dv; `34`: DNSPod sm2 dv multi-domain; `35`: DNSPod sm2 dv wildcard; `37`: DNSPod sm2 ov; `38`: DNSPod sm2 ov multi-domain; `39`: DNSPod sm2 ov wildcard; `40`: DNSPod sm2 ev; `41`: DNSPod sm2 ev multi-domain; `42`: trustasia dv wildcard multi-domain; `43`: dnspod-ov ssl certificate; `44`: dnspod-ov wildcard ssl certificate; `45`: dnspod-ov multi-domain ssl certificate; `46`: dnspod-ev ssl certificate; `47`: dnspod-ev multi-domain ssl certificate; `48`: dnspod-dv ssl certificate; `49`: dnspod-dv wildcard ssl certificate; `50`: dnspod-dv multi-domain ssl certificate; `51`: DNSPod (sm2)-ov ssl certificate; `52`: DNSPod (sm2)-ov wildcard ssl certificate; `53`: DNSPod (sm2)-ov multi-domain ssl certificate; `54`: DNSPod (sm2)-dv ssl certificate; `55`: DNSPod (sm2)-dv wildcard ssl certificate; `56`: DNSPod (sm2)-dv multi-domain ssl certificate; `57`: securesite ov pro multi-domain; `58`: securesite ov multi-domain; `59`: securesite ev pro multi-domain; `60`: securesite ev multi-domain; `61`: geotrust ev multi-domain.
     */
    public void setProductId(Long ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get Number of domains associated with the certificate 
     * @return DomainNum Number of domains associated with the certificate
     */
    public Long getDomainNum() {
        return this.DomainNum;
    }

    /**
     * Set Number of domains associated with the certificate
     * @param DomainNum Number of domains associated with the certificate
     */
    public void setDomainNum(Long DomainNum) {
        this.DomainNum = DomainNum;
    }

    /**
     * Get Certificate validity period. 
     * @return TimeSpan Certificate validity period.
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set Certificate validity period.
     * @param TimeSpan Certificate validity period.
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get Whether to automatically use vouchers: 1 for yes, 0 for no; the default is 1. 
     * @return AutoVoucher Whether to automatically use vouchers: 1 for yes, 0 for no; the default is 1.
     */
    public Long getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set Whether to automatically use vouchers: 1 for yes, 0 for no; the default is 1.
     * @param AutoVoucher Whether to automatically use vouchers: 1 for yes, 0 for no; the default is 1.
     */
    public void setAutoVoucher(Long AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    /**
     * Get Tag, generate tags for certificates. 
     * @return Tags Tag, generate tags for certificates.
     */
    public Tags [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag, generate tags for certificates.
     * @param Tags Tag, generate tags for certificates.
     */
    public void setTags(Tags [] Tags) {
        this.Tags = Tags;
    }

    public CreateCertificateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCertificateRequest(CreateCertificateRequest source) {
        if (source.ProductId != null) {
            this.ProductId = new Long(source.ProductId);
        }
        if (source.DomainNum != null) {
            this.DomainNum = new Long(source.DomainNum);
        }
        if (source.TimeSpan != null) {
            this.TimeSpan = new Long(source.TimeSpan);
        }
        if (source.AutoVoucher != null) {
            this.AutoVoucher = new Long(source.AutoVoucher);
        }
        if (source.Tags != null) {
            this.Tags = new Tags[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tags(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "DomainNum", this.DomainNum);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "AutoVoucher", this.AutoVoucher);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

