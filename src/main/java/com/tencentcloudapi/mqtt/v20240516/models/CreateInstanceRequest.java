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
package com.tencentcloudapi.mqtt.v20240516.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateInstanceRequest extends AbstractModel {

    /**
    * Instance type, which needs to correspond to SkuCode. for details, see the [get MQTT product sales spec](https://www.tencentcloud.com/document/api/1778/116232?from_cn_redirect=1) api.
BASIC: basic edition.
PRO edition.
PLATINUM version.

    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * Specifies the cluster name, cannot be empty, 3-64 characters, only comprised of digits, letters, "-", and "_".
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Product specification, which must correspond to InstanceType. see the [get MQTT product sales spec](https://www.tencentcloud.com/document/api/1778/116232?from_cn_redirect=1) api to obtain details.
    */
    @SerializedName("SkuCode")
    @Expose
    private String SkuCode;

    /**
    * Specifies the remark information with a maximum length of 128 characters.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Tag list
    */
    @SerializedName("TagList")
    @Expose
    private Tag [] TagList;

    /**
    * Specifies the VPC information associated with the instance. the available VPC and SUBNET under the current user must be provided.
    */
    @SerializedName("VpcList")
    @Expose
    private VpcInfo [] VpcList;

    /**
    * Whether public network access is enabled. default false (disabled).
    */
    @SerializedName("EnablePublic")
    @Expose
    private Boolean EnablePublic;

    /**
    * Public network bandwidth (unit: Mbps). this field is mandatory and must be more than 0 when EnablePublic is True.
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * Public network access allowlist. if not passed, it means deny all IP network access.
    */
    @SerializedName("IpRules")
    @Expose
    private IpRule [] IpRules;

    /**
    * Whether the instance is automatically renewed (0: no auto-renewal; 1: auto-renewal). this parameter is valid only when you purchase a prepaid cluster. default value: 1 (auto-renewal).
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * Specifies the purchase duration (measurement unit: month). this parameter is valid only when you purchase a prepaid cluster. default: 1m (month). valid values: 1-12, 24, 36, 48, 60.
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * Payment mode (0: postpaid; 1: prepaid). default: 0 (postpaid).
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
     * Get Instance type, which needs to correspond to SkuCode. for details, see the [get MQTT product sales spec](https://www.tencentcloud.com/document/api/1778/116232?from_cn_redirect=1) api.
BASIC: basic edition.
PRO edition.
PLATINUM version.
 
     * @return InstanceType Instance type, which needs to correspond to SkuCode. for details, see the [get MQTT product sales spec](https://www.tencentcloud.com/document/api/1778/116232?from_cn_redirect=1) api.
BASIC: basic edition.
PRO edition.
PLATINUM version.

     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Instance type, which needs to correspond to SkuCode. for details, see the [get MQTT product sales spec](https://www.tencentcloud.com/document/api/1778/116232?from_cn_redirect=1) api.
BASIC: basic edition.
PRO edition.
PLATINUM version.

     * @param InstanceType Instance type, which needs to correspond to SkuCode. for details, see the [get MQTT product sales spec](https://www.tencentcloud.com/document/api/1778/116232?from_cn_redirect=1) api.
BASIC: basic edition.
PRO edition.
PLATINUM version.

     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Specifies the cluster name, cannot be empty, 3-64 characters, only comprised of digits, letters, "-", and "_". 
     * @return Name Specifies the cluster name, cannot be empty, 3-64 characters, only comprised of digits, letters, "-", and "_".
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Specifies the cluster name, cannot be empty, 3-64 characters, only comprised of digits, letters, "-", and "_".
     * @param Name Specifies the cluster name, cannot be empty, 3-64 characters, only comprised of digits, letters, "-", and "_".
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Product specification, which must correspond to InstanceType. see the [get MQTT product sales spec](https://www.tencentcloud.com/document/api/1778/116232?from_cn_redirect=1) api to obtain details. 
     * @return SkuCode Product specification, which must correspond to InstanceType. see the [get MQTT product sales spec](https://www.tencentcloud.com/document/api/1778/116232?from_cn_redirect=1) api to obtain details.
     */
    public String getSkuCode() {
        return this.SkuCode;
    }

    /**
     * Set Product specification, which must correspond to InstanceType. see the [get MQTT product sales spec](https://www.tencentcloud.com/document/api/1778/116232?from_cn_redirect=1) api to obtain details.
     * @param SkuCode Product specification, which must correspond to InstanceType. see the [get MQTT product sales spec](https://www.tencentcloud.com/document/api/1778/116232?from_cn_redirect=1) api to obtain details.
     */
    public void setSkuCode(String SkuCode) {
        this.SkuCode = SkuCode;
    }

    /**
     * Get Specifies the remark information with a maximum length of 128 characters. 
     * @return Remark Specifies the remark information with a maximum length of 128 characters.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Specifies the remark information with a maximum length of 128 characters.
     * @param Remark Specifies the remark information with a maximum length of 128 characters.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Tag list 
     * @return TagList Tag list
     */
    public Tag [] getTagList() {
        return this.TagList;
    }

    /**
     * Set Tag list
     * @param TagList Tag list
     */
    public void setTagList(Tag [] TagList) {
        this.TagList = TagList;
    }

    /**
     * Get Specifies the VPC information associated with the instance. the available VPC and SUBNET under the current user must be provided. 
     * @return VpcList Specifies the VPC information associated with the instance. the available VPC and SUBNET under the current user must be provided.
     */
    public VpcInfo [] getVpcList() {
        return this.VpcList;
    }

    /**
     * Set Specifies the VPC information associated with the instance. the available VPC and SUBNET under the current user must be provided.
     * @param VpcList Specifies the VPC information associated with the instance. the available VPC and SUBNET under the current user must be provided.
     */
    public void setVpcList(VpcInfo [] VpcList) {
        this.VpcList = VpcList;
    }

    /**
     * Get Whether public network access is enabled. default false (disabled). 
     * @return EnablePublic Whether public network access is enabled. default false (disabled).
     */
    public Boolean getEnablePublic() {
        return this.EnablePublic;
    }

    /**
     * Set Whether public network access is enabled. default false (disabled).
     * @param EnablePublic Whether public network access is enabled. default false (disabled).
     */
    public void setEnablePublic(Boolean EnablePublic) {
        this.EnablePublic = EnablePublic;
    }

    /**
     * Get Public network bandwidth (unit: Mbps). this field is mandatory and must be more than 0 when EnablePublic is True. 
     * @return Bandwidth Public network bandwidth (unit: Mbps). this field is mandatory and must be more than 0 when EnablePublic is True.
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set Public network bandwidth (unit: Mbps). this field is mandatory and must be more than 0 when EnablePublic is True.
     * @param Bandwidth Public network bandwidth (unit: Mbps). this field is mandatory and must be more than 0 when EnablePublic is True.
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get Public network access allowlist. if not passed, it means deny all IP network access. 
     * @return IpRules Public network access allowlist. if not passed, it means deny all IP network access.
     */
    public IpRule [] getIpRules() {
        return this.IpRules;
    }

    /**
     * Set Public network access allowlist. if not passed, it means deny all IP network access.
     * @param IpRules Public network access allowlist. if not passed, it means deny all IP network access.
     */
    public void setIpRules(IpRule [] IpRules) {
        this.IpRules = IpRules;
    }

    /**
     * Get Whether the instance is automatically renewed (0: no auto-renewal; 1: auto-renewal). this parameter is valid only when you purchase a prepaid cluster. default value: 1 (auto-renewal). 
     * @return RenewFlag Whether the instance is automatically renewed (0: no auto-renewal; 1: auto-renewal). this parameter is valid only when you purchase a prepaid cluster. default value: 1 (auto-renewal).
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set Whether the instance is automatically renewed (0: no auto-renewal; 1: auto-renewal). this parameter is valid only when you purchase a prepaid cluster. default value: 1 (auto-renewal).
     * @param RenewFlag Whether the instance is automatically renewed (0: no auto-renewal; 1: auto-renewal). this parameter is valid only when you purchase a prepaid cluster. default value: 1 (auto-renewal).
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get Specifies the purchase duration (measurement unit: month). this parameter is valid only when you purchase a prepaid cluster. default: 1m (month). valid values: 1-12, 24, 36, 48, 60. 
     * @return TimeSpan Specifies the purchase duration (measurement unit: month). this parameter is valid only when you purchase a prepaid cluster. default: 1m (month). valid values: 1-12, 24, 36, 48, 60.
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set Specifies the purchase duration (measurement unit: month). this parameter is valid only when you purchase a prepaid cluster. default: 1m (month). valid values: 1-12, 24, 36, 48, 60.
     * @param TimeSpan Specifies the purchase duration (measurement unit: month). this parameter is valid only when you purchase a prepaid cluster. default: 1m (month). valid values: 1-12, 24, 36, 48, 60.
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get Payment mode (0: postpaid; 1: prepaid). default: 0 (postpaid). 
     * @return PayMode Payment mode (0: postpaid; 1: prepaid). default: 0 (postpaid).
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Payment mode (0: postpaid; 1: prepaid). default: 0 (postpaid).
     * @param PayMode Payment mode (0: postpaid; 1: prepaid). default: 0 (postpaid).
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    public CreateInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateInstanceRequest(CreateInstanceRequest source) {
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.SkuCode != null) {
            this.SkuCode = new String(source.SkuCode);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.TagList != null) {
            this.TagList = new Tag[source.TagList.length];
            for (int i = 0; i < source.TagList.length; i++) {
                this.TagList[i] = new Tag(source.TagList[i]);
            }
        }
        if (source.VpcList != null) {
            this.VpcList = new VpcInfo[source.VpcList.length];
            for (int i = 0; i < source.VpcList.length; i++) {
                this.VpcList[i] = new VpcInfo(source.VpcList[i]);
            }
        }
        if (source.EnablePublic != null) {
            this.EnablePublic = new Boolean(source.EnablePublic);
        }
        if (source.Bandwidth != null) {
            this.Bandwidth = new Long(source.Bandwidth);
        }
        if (source.IpRules != null) {
            this.IpRules = new IpRule[source.IpRules.length];
            for (int i = 0; i < source.IpRules.length; i++) {
                this.IpRules[i] = new IpRule(source.IpRules[i]);
            }
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new Long(source.RenewFlag);
        }
        if (source.TimeSpan != null) {
            this.TimeSpan = new Long(source.TimeSpan);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "SkuCode", this.SkuCode);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamArrayObj(map, prefix + "TagList.", this.TagList);
        this.setParamArrayObj(map, prefix + "VpcList.", this.VpcList);
        this.setParamSimple(map, prefix + "EnablePublic", this.EnablePublic);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamArrayObj(map, prefix + "IpRules.", this.IpRules);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);

    }
}

