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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SetCLSPushTargetRequest extends AbstractModel {

    /**
    * Domain name.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD services after December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications, whether in the default application or a newly created application.</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * Push target to set for logs in the Chinese mainland.
    */
    @SerializedName("ChineseMainlandCLSTargetInfo")
    @Expose
    private AreaCLSTargetInfo ChineseMainlandCLSTargetInfo;

    /**
    * Push target for logs outside the Chinese mainland to be set.
    */
    @SerializedName("OutsideChineseMainlandCLSTargetInfo")
    @Expose
    private AreaCLSTargetInfo OutsideChineseMainlandCLSTargetInfo;

    /**
     * Get Domain name. 
     * @return Domain Domain name.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain name.
     * @param Domain Domain name.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD services after December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications, whether in the default application or a newly created application.</b> 
     * @return SubAppId <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD services after December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications, whether in the default application or a newly created application.</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD services after December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications, whether in the default application or a newly created application.</b>
     * @param SubAppId <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD services after December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications, whether in the default application or a newly created application.</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get Push target to set for logs in the Chinese mainland. 
     * @return ChineseMainlandCLSTargetInfo Push target to set for logs in the Chinese mainland.
     */
    public AreaCLSTargetInfo getChineseMainlandCLSTargetInfo() {
        return this.ChineseMainlandCLSTargetInfo;
    }

    /**
     * Set Push target to set for logs in the Chinese mainland.
     * @param ChineseMainlandCLSTargetInfo Push target to set for logs in the Chinese mainland.
     */
    public void setChineseMainlandCLSTargetInfo(AreaCLSTargetInfo ChineseMainlandCLSTargetInfo) {
        this.ChineseMainlandCLSTargetInfo = ChineseMainlandCLSTargetInfo;
    }

    /**
     * Get Push target for logs outside the Chinese mainland to be set. 
     * @return OutsideChineseMainlandCLSTargetInfo Push target for logs outside the Chinese mainland to be set.
     */
    public AreaCLSTargetInfo getOutsideChineseMainlandCLSTargetInfo() {
        return this.OutsideChineseMainlandCLSTargetInfo;
    }

    /**
     * Set Push target for logs outside the Chinese mainland to be set.
     * @param OutsideChineseMainlandCLSTargetInfo Push target for logs outside the Chinese mainland to be set.
     */
    public void setOutsideChineseMainlandCLSTargetInfo(AreaCLSTargetInfo OutsideChineseMainlandCLSTargetInfo) {
        this.OutsideChineseMainlandCLSTargetInfo = OutsideChineseMainlandCLSTargetInfo;
    }

    public SetCLSPushTargetRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SetCLSPushTargetRequest(SetCLSPushTargetRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.ChineseMainlandCLSTargetInfo != null) {
            this.ChineseMainlandCLSTargetInfo = new AreaCLSTargetInfo(source.ChineseMainlandCLSTargetInfo);
        }
        if (source.OutsideChineseMainlandCLSTargetInfo != null) {
            this.OutsideChineseMainlandCLSTargetInfo = new AreaCLSTargetInfo(source.OutsideChineseMainlandCLSTargetInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamObj(map, prefix + "ChineseMainlandCLSTargetInfo.", this.ChineseMainlandCLSTargetInfo);
        this.setParamObj(map, prefix + "OutsideChineseMainlandCLSTargetInfo.", this.OutsideChineseMainlandCLSTargetInfo);

    }
}

