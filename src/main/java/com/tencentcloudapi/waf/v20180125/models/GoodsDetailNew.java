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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GoodsDetailNew extends AbstractModel {

    /**
    * Time interval
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * Unit, support for purchasing d, m, y, i.e., (day, month, year)

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * Sub-product tag. It is mandatory for new purchase and renewal. For configuration change, it will be placed in oldConfig and newConfig.

SaaS Advanced Edition: sp_wsm_waf_premium
SaaS Enterprise Edition: sp_wsm_waf_enterprise
SaaS Ultimate Edition: sp_wsm_waf_ultimate
SaaS business expansion package: sp_wsm_waf_qpsep
SaaS domain name expansion package: sp_wsm_waf_domain

Advanced Edition - CLB: sp_wsm_waf_premium_clb
Enterprise Edition - CLB: sp_wsm_waf_enterprise_clb
Ultimate Edition - CLB: sp_wsm_waf_ultimate_clb
 Business expansion package - CLB: sp_wsm_waf_qpsep_clb
Domain name expansion package - CLB: sp_wsm_waf_domain_clb

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubProductCode")
    @Expose
    private String SubProductCode;

    /**
    * PID applied for a business product (corresponding to a pricing formula). The pricing model can be found through PID billing.
Advanced Edition: 1000827
Enterprise Edition: 1000830
Ultimate Edition: 1000832
Domain name package: 1000834
Business expansion package: 1000481
Advanced Edition - CLB: 1001150
Enterprise Edition - CLB: 1001152
Ultimate Edition - CLB: 1001154
Domain name package - CLB: 1001156
Business expansion package - CLB: 1001160

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Pid")
    @Expose
    private Long Pid;

    /**
    * WAF Instance Name

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 1: Auto-renewal, 0: No Auto-renewal

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * Actual Geographic Information of WAF Purchase

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RealRegion")
    @Expose
    private Long RealRegion;

    /**
    * Billing Detail Tag Array

SaaS Advanced Edition: sv_wsm_waf_package_premium
SaaS Enterprise Edition: sv_wsm_waf_package_enterprise
SaaS Ultimate Edition: sv_wsm_waf_package_ultimate
SaaS non-Chinese Mainland Advanced Edition: sv_wsm_waf_package_premium_intl
SaaS non-Chinese Mainland Enterprise Edition: sv_wsm_waf_package_enterprise_intl
SaaS non-Chinese Mainland Ultimate Edition: sv_wsm_waf_package_ultimate_intl
SaaS business expansion package: sv_wsm_waf_qps_ep
SaaS domain name expansion package: sv_wsm_waf_domain

Advanced Edition CLB: sv_wsm_waf_package_premium_clb
Enterprise Edition CLB: sv_wsm_waf_package_enterprise_clb
Ultimate Edition CLB: sv_wsm_waf_package_ultimate_clb
Non-Chinese Mainland Advanced Edition CLB: sv_wsm_waf_package_premium_clb_intl
Non-Chinese Mainland Enterprise Edition CLB: sv_wsm_waf_package_premium_clb_intl
Non-Chinese Mainland Ultimate Edition CLB: sv_wsm_waf_package_ultimate_clb_intl
Business expansion package CLB: sv_wsm_waf_qps_ep_clb
Domain name expansion package CLB: sv_wsm_waf_domain_clb

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LabelTypes")
    @Expose
    private String [] LabelTypes;

    /**
    * Number of Billing Detail Tags, Generally Corresponds One-to-One with SvLabelType

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LabelCounts")
    @Expose
    private Long [] LabelCounts;

    /**
    * Dynamic Configuration Usage, Instance Expiration Time

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CurDeadline")
    @Expose
    private String CurDeadline;

    /**
    * Purchasing Bot or API Security for Existing Instances

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Resource ID

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * CLB WAF or SaaS WAF mode.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MicroVersion")
    @Expose
    private String MicroVersion;

    /**
     * Get Time interval
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TimeSpan Time interval
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set Time interval
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TimeSpan Time interval
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get Unit, support for purchasing d, m, y, i.e., (day, month, year)

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TimeUnit Unit, support for purchasing d, m, y, i.e., (day, month, year)

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set Unit, support for purchasing d, m, y, i.e., (day, month, year)

Note: This field may return null, indicating that no valid values can be obtained.
     * @param TimeUnit Unit, support for purchasing d, m, y, i.e., (day, month, year)

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get Sub-product tag. It is mandatory for new purchase and renewal. For configuration change, it will be placed in oldConfig and newConfig.

SaaS Advanced Edition: sp_wsm_waf_premium
SaaS Enterprise Edition: sp_wsm_waf_enterprise
SaaS Ultimate Edition: sp_wsm_waf_ultimate
SaaS business expansion package: sp_wsm_waf_qpsep
SaaS domain name expansion package: sp_wsm_waf_domain

Advanced Edition - CLB: sp_wsm_waf_premium_clb
Enterprise Edition - CLB: sp_wsm_waf_enterprise_clb
Ultimate Edition - CLB: sp_wsm_waf_ultimate_clb
 Business expansion package - CLB: sp_wsm_waf_qpsep_clb
Domain name expansion package - CLB: sp_wsm_waf_domain_clb

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SubProductCode Sub-product tag. It is mandatory for new purchase and renewal. For configuration change, it will be placed in oldConfig and newConfig.

SaaS Advanced Edition: sp_wsm_waf_premium
SaaS Enterprise Edition: sp_wsm_waf_enterprise
SaaS Ultimate Edition: sp_wsm_waf_ultimate
SaaS business expansion package: sp_wsm_waf_qpsep
SaaS domain name expansion package: sp_wsm_waf_domain

Advanced Edition - CLB: sp_wsm_waf_premium_clb
Enterprise Edition - CLB: sp_wsm_waf_enterprise_clb
Ultimate Edition - CLB: sp_wsm_waf_ultimate_clb
 Business expansion package - CLB: sp_wsm_waf_qpsep_clb
Domain name expansion package - CLB: sp_wsm_waf_domain_clb

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSubProductCode() {
        return this.SubProductCode;
    }

    /**
     * Set Sub-product tag. It is mandatory for new purchase and renewal. For configuration change, it will be placed in oldConfig and newConfig.

SaaS Advanced Edition: sp_wsm_waf_premium
SaaS Enterprise Edition: sp_wsm_waf_enterprise
SaaS Ultimate Edition: sp_wsm_waf_ultimate
SaaS business expansion package: sp_wsm_waf_qpsep
SaaS domain name expansion package: sp_wsm_waf_domain

Advanced Edition - CLB: sp_wsm_waf_premium_clb
Enterprise Edition - CLB: sp_wsm_waf_enterprise_clb
Ultimate Edition - CLB: sp_wsm_waf_ultimate_clb
 Business expansion package - CLB: sp_wsm_waf_qpsep_clb
Domain name expansion package - CLB: sp_wsm_waf_domain_clb

Note: This field may return null, indicating that no valid values can be obtained.
     * @param SubProductCode Sub-product tag. It is mandatory for new purchase and renewal. For configuration change, it will be placed in oldConfig and newConfig.

SaaS Advanced Edition: sp_wsm_waf_premium
SaaS Enterprise Edition: sp_wsm_waf_enterprise
SaaS Ultimate Edition: sp_wsm_waf_ultimate
SaaS business expansion package: sp_wsm_waf_qpsep
SaaS domain name expansion package: sp_wsm_waf_domain

Advanced Edition - CLB: sp_wsm_waf_premium_clb
Enterprise Edition - CLB: sp_wsm_waf_enterprise_clb
Ultimate Edition - CLB: sp_wsm_waf_ultimate_clb
 Business expansion package - CLB: sp_wsm_waf_qpsep_clb
Domain name expansion package - CLB: sp_wsm_waf_domain_clb

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSubProductCode(String SubProductCode) {
        this.SubProductCode = SubProductCode;
    }

    /**
     * Get PID applied for a business product (corresponding to a pricing formula). The pricing model can be found through PID billing.
Advanced Edition: 1000827
Enterprise Edition: 1000830
Ultimate Edition: 1000832
Domain name package: 1000834
Business expansion package: 1000481
Advanced Edition - CLB: 1001150
Enterprise Edition - CLB: 1001152
Ultimate Edition - CLB: 1001154
Domain name package - CLB: 1001156
Business expansion package - CLB: 1001160

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Pid PID applied for a business product (corresponding to a pricing formula). The pricing model can be found through PID billing.
Advanced Edition: 1000827
Enterprise Edition: 1000830
Ultimate Edition: 1000832
Domain name package: 1000834
Business expansion package: 1000481
Advanced Edition - CLB: 1001150
Enterprise Edition - CLB: 1001152
Ultimate Edition - CLB: 1001154
Domain name package - CLB: 1001156
Business expansion package - CLB: 1001160

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPid() {
        return this.Pid;
    }

    /**
     * Set PID applied for a business product (corresponding to a pricing formula). The pricing model can be found through PID billing.
Advanced Edition: 1000827
Enterprise Edition: 1000830
Ultimate Edition: 1000832
Domain name package: 1000834
Business expansion package: 1000481
Advanced Edition - CLB: 1001150
Enterprise Edition - CLB: 1001152
Ultimate Edition - CLB: 1001154
Domain name package - CLB: 1001156
Business expansion package - CLB: 1001160

Note: This field may return null, indicating that no valid values can be obtained.
     * @param Pid PID applied for a business product (corresponding to a pricing formula). The pricing model can be found through PID billing.
Advanced Edition: 1000827
Enterprise Edition: 1000830
Ultimate Edition: 1000832
Domain name package: 1000834
Business expansion package: 1000481
Advanced Edition - CLB: 1001150
Enterprise Edition - CLB: 1001152
Ultimate Edition - CLB: 1001154
Domain name package - CLB: 1001156
Business expansion package - CLB: 1001160

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPid(Long Pid) {
        this.Pid = Pid;
    }

    /**
     * Get WAF Instance Name

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceName WAF Instance Name

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set WAF Instance Name

Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceName WAF Instance Name

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 1: Auto-renewal, 0: No Auto-renewal

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AutoRenewFlag 1: Auto-renewal, 0: No Auto-renewal

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set 1: Auto-renewal, 0: No Auto-renewal

Note: This field may return null, indicating that no valid values can be obtained.
     * @param AutoRenewFlag 1: Auto-renewal, 0: No Auto-renewal

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get Actual Geographic Information of WAF Purchase

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RealRegion Actual Geographic Information of WAF Purchase

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRealRegion() {
        return this.RealRegion;
    }

    /**
     * Set Actual Geographic Information of WAF Purchase

Note: This field may return null, indicating that no valid values can be obtained.
     * @param RealRegion Actual Geographic Information of WAF Purchase

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRealRegion(Long RealRegion) {
        this.RealRegion = RealRegion;
    }

    /**
     * Get Billing Detail Tag Array

SaaS Advanced Edition: sv_wsm_waf_package_premium
SaaS Enterprise Edition: sv_wsm_waf_package_enterprise
SaaS Ultimate Edition: sv_wsm_waf_package_ultimate
SaaS non-Chinese Mainland Advanced Edition: sv_wsm_waf_package_premium_intl
SaaS non-Chinese Mainland Enterprise Edition: sv_wsm_waf_package_enterprise_intl
SaaS non-Chinese Mainland Ultimate Edition: sv_wsm_waf_package_ultimate_intl
SaaS business expansion package: sv_wsm_waf_qps_ep
SaaS domain name expansion package: sv_wsm_waf_domain

Advanced Edition CLB: sv_wsm_waf_package_premium_clb
Enterprise Edition CLB: sv_wsm_waf_package_enterprise_clb
Ultimate Edition CLB: sv_wsm_waf_package_ultimate_clb
Non-Chinese Mainland Advanced Edition CLB: sv_wsm_waf_package_premium_clb_intl
Non-Chinese Mainland Enterprise Edition CLB: sv_wsm_waf_package_premium_clb_intl
Non-Chinese Mainland Ultimate Edition CLB: sv_wsm_waf_package_ultimate_clb_intl
Business expansion package CLB: sv_wsm_waf_qps_ep_clb
Domain name expansion package CLB: sv_wsm_waf_domain_clb

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LabelTypes Billing Detail Tag Array

SaaS Advanced Edition: sv_wsm_waf_package_premium
SaaS Enterprise Edition: sv_wsm_waf_package_enterprise
SaaS Ultimate Edition: sv_wsm_waf_package_ultimate
SaaS non-Chinese Mainland Advanced Edition: sv_wsm_waf_package_premium_intl
SaaS non-Chinese Mainland Enterprise Edition: sv_wsm_waf_package_enterprise_intl
SaaS non-Chinese Mainland Ultimate Edition: sv_wsm_waf_package_ultimate_intl
SaaS business expansion package: sv_wsm_waf_qps_ep
SaaS domain name expansion package: sv_wsm_waf_domain

Advanced Edition CLB: sv_wsm_waf_package_premium_clb
Enterprise Edition CLB: sv_wsm_waf_package_enterprise_clb
Ultimate Edition CLB: sv_wsm_waf_package_ultimate_clb
Non-Chinese Mainland Advanced Edition CLB: sv_wsm_waf_package_premium_clb_intl
Non-Chinese Mainland Enterprise Edition CLB: sv_wsm_waf_package_premium_clb_intl
Non-Chinese Mainland Ultimate Edition CLB: sv_wsm_waf_package_ultimate_clb_intl
Business expansion package CLB: sv_wsm_waf_qps_ep_clb
Domain name expansion package CLB: sv_wsm_waf_domain_clb

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getLabelTypes() {
        return this.LabelTypes;
    }

    /**
     * Set Billing Detail Tag Array

SaaS Advanced Edition: sv_wsm_waf_package_premium
SaaS Enterprise Edition: sv_wsm_waf_package_enterprise
SaaS Ultimate Edition: sv_wsm_waf_package_ultimate
SaaS non-Chinese Mainland Advanced Edition: sv_wsm_waf_package_premium_intl
SaaS non-Chinese Mainland Enterprise Edition: sv_wsm_waf_package_enterprise_intl
SaaS non-Chinese Mainland Ultimate Edition: sv_wsm_waf_package_ultimate_intl
SaaS business expansion package: sv_wsm_waf_qps_ep
SaaS domain name expansion package: sv_wsm_waf_domain

Advanced Edition CLB: sv_wsm_waf_package_premium_clb
Enterprise Edition CLB: sv_wsm_waf_package_enterprise_clb
Ultimate Edition CLB: sv_wsm_waf_package_ultimate_clb
Non-Chinese Mainland Advanced Edition CLB: sv_wsm_waf_package_premium_clb_intl
Non-Chinese Mainland Enterprise Edition CLB: sv_wsm_waf_package_premium_clb_intl
Non-Chinese Mainland Ultimate Edition CLB: sv_wsm_waf_package_ultimate_clb_intl
Business expansion package CLB: sv_wsm_waf_qps_ep_clb
Domain name expansion package CLB: sv_wsm_waf_domain_clb

Note: This field may return null, indicating that no valid values can be obtained.
     * @param LabelTypes Billing Detail Tag Array

SaaS Advanced Edition: sv_wsm_waf_package_premium
SaaS Enterprise Edition: sv_wsm_waf_package_enterprise
SaaS Ultimate Edition: sv_wsm_waf_package_ultimate
SaaS non-Chinese Mainland Advanced Edition: sv_wsm_waf_package_premium_intl
SaaS non-Chinese Mainland Enterprise Edition: sv_wsm_waf_package_enterprise_intl
SaaS non-Chinese Mainland Ultimate Edition: sv_wsm_waf_package_ultimate_intl
SaaS business expansion package: sv_wsm_waf_qps_ep
SaaS domain name expansion package: sv_wsm_waf_domain

Advanced Edition CLB: sv_wsm_waf_package_premium_clb
Enterprise Edition CLB: sv_wsm_waf_package_enterprise_clb
Ultimate Edition CLB: sv_wsm_waf_package_ultimate_clb
Non-Chinese Mainland Advanced Edition CLB: sv_wsm_waf_package_premium_clb_intl
Non-Chinese Mainland Enterprise Edition CLB: sv_wsm_waf_package_premium_clb_intl
Non-Chinese Mainland Ultimate Edition CLB: sv_wsm_waf_package_ultimate_clb_intl
Business expansion package CLB: sv_wsm_waf_qps_ep_clb
Domain name expansion package CLB: sv_wsm_waf_domain_clb

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLabelTypes(String [] LabelTypes) {
        this.LabelTypes = LabelTypes;
    }

    /**
     * Get Number of Billing Detail Tags, Generally Corresponds One-to-One with SvLabelType

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LabelCounts Number of Billing Detail Tags, Generally Corresponds One-to-One with SvLabelType

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long [] getLabelCounts() {
        return this.LabelCounts;
    }

    /**
     * Set Number of Billing Detail Tags, Generally Corresponds One-to-One with SvLabelType

Note: This field may return null, indicating that no valid values can be obtained.
     * @param LabelCounts Number of Billing Detail Tags, Generally Corresponds One-to-One with SvLabelType

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLabelCounts(Long [] LabelCounts) {
        this.LabelCounts = LabelCounts;
    }

    /**
     * Get Dynamic Configuration Usage, Instance Expiration Time

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CurDeadline Dynamic Configuration Usage, Instance Expiration Time

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCurDeadline() {
        return this.CurDeadline;
    }

    /**
     * Set Dynamic Configuration Usage, Instance Expiration Time

Note: This field may return null, indicating that no valid values can be obtained.
     * @param CurDeadline Dynamic Configuration Usage, Instance Expiration Time

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCurDeadline(String CurDeadline) {
        this.CurDeadline = CurDeadline;
    }

    /**
     * Get Purchasing Bot or API Security for Existing Instances

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceId Purchasing Bot or API Security for Existing Instances

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Purchasing Bot or API Security for Existing Instances

Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceId Purchasing Bot or API Security for Existing Instances

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Resource ID

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ResourceId Resource ID

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set Resource ID

Note: This field may return null, indicating that no valid values can be obtained.
     * @param ResourceId Resource ID

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get CLB WAF or SaaS WAF mode.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MicroVersion CLB WAF or SaaS WAF mode.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMicroVersion() {
        return this.MicroVersion;
    }

    /**
     * Set CLB WAF or SaaS WAF mode.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MicroVersion CLB WAF or SaaS WAF mode.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMicroVersion(String MicroVersion) {
        this.MicroVersion = MicroVersion;
    }

    public GoodsDetailNew() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GoodsDetailNew(GoodsDetailNew source) {
        if (source.TimeSpan != null) {
            this.TimeSpan = new Long(source.TimeSpan);
        }
        if (source.TimeUnit != null) {
            this.TimeUnit = new String(source.TimeUnit);
        }
        if (source.SubProductCode != null) {
            this.SubProductCode = new String(source.SubProductCode);
        }
        if (source.Pid != null) {
            this.Pid = new Long(source.Pid);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.RealRegion != null) {
            this.RealRegion = new Long(source.RealRegion);
        }
        if (source.LabelTypes != null) {
            this.LabelTypes = new String[source.LabelTypes.length];
            for (int i = 0; i < source.LabelTypes.length; i++) {
                this.LabelTypes[i] = new String(source.LabelTypes[i]);
            }
        }
        if (source.LabelCounts != null) {
            this.LabelCounts = new Long[source.LabelCounts.length];
            for (int i = 0; i < source.LabelCounts.length; i++) {
                this.LabelCounts[i] = new Long(source.LabelCounts[i]);
            }
        }
        if (source.CurDeadline != null) {
            this.CurDeadline = new String(source.CurDeadline);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.MicroVersion != null) {
            this.MicroVersion = new String(source.MicroVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "SubProductCode", this.SubProductCode);
        this.setParamSimple(map, prefix + "Pid", this.Pid);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "RealRegion", this.RealRegion);
        this.setParamArraySimple(map, prefix + "LabelTypes.", this.LabelTypes);
        this.setParamArraySimple(map, prefix + "LabelCounts.", this.LabelCounts);
        this.setParamSimple(map, prefix + "CurDeadline", this.CurDeadline);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "MicroVersion", this.MicroVersion);

    }
}

