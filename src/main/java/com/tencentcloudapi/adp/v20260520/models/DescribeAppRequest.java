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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAppRequest extends AbstractModel {

    /**
    * <p>Application ID.</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>Application domain: ADP_DOMAIN_DEV(1)=development domain, ADP_DOMAIN_PROD(2)=release domain. Enumeration values: 1: development domain, 2: production domain</p>
    */
    @SerializedName("Domain")
    @Expose
    private Long Domain;

    /**
    * <p>Field mask, specify the fields to return (return all fields if Paths is empty). Paths enumeration values: AppConfig (application configuration), SecretInfo (application key info), ShareUrlInfo (sharing link information), SpecialStatusInfo (special status information), SearchResourceStatus (search resource status), SharedKbList (list of shared knowledge bases referenced by the application), CorpShareConfig (corporate shared configuration), FileVolumeMountList (cloud disk mount list)</p>
    */
    @SerializedName("FieldMask")
    @Expose
    private FieldMask FieldMask;

    /**
    * <p>Specific status type (required when FieldMask includes SpecialStatusInfo). Enumeration values: 1: rollback status, 2: first-time import status</p>
    */
    @SerializedName("StatusType")
    @Expose
    private Long StatusType;

    /**
     * Get <p>Application ID.</p> 
     * @return AppId <p>Application ID.</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>Application ID.</p>
     * @param AppId <p>Application ID.</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>Application domain: ADP_DOMAIN_DEV(1)=development domain, ADP_DOMAIN_PROD(2)=release domain. Enumeration values: 1: development domain, 2: production domain</p> 
     * @return Domain <p>Application domain: ADP_DOMAIN_DEV(1)=development domain, ADP_DOMAIN_PROD(2)=release domain. Enumeration values: 1: development domain, 2: production domain</p>
     */
    public Long getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>Application domain: ADP_DOMAIN_DEV(1)=development domain, ADP_DOMAIN_PROD(2)=release domain. Enumeration values: 1: development domain, 2: production domain</p>
     * @param Domain <p>Application domain: ADP_DOMAIN_DEV(1)=development domain, ADP_DOMAIN_PROD(2)=release domain. Enumeration values: 1: development domain, 2: production domain</p>
     */
    public void setDomain(Long Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <p>Field mask, specify the fields to return (return all fields if Paths is empty). Paths enumeration values: AppConfig (application configuration), SecretInfo (application key info), ShareUrlInfo (sharing link information), SpecialStatusInfo (special status information), SearchResourceStatus (search resource status), SharedKbList (list of shared knowledge bases referenced by the application), CorpShareConfig (corporate shared configuration), FileVolumeMountList (cloud disk mount list)</p> 
     * @return FieldMask <p>Field mask, specify the fields to return (return all fields if Paths is empty). Paths enumeration values: AppConfig (application configuration), SecretInfo (application key info), ShareUrlInfo (sharing link information), SpecialStatusInfo (special status information), SearchResourceStatus (search resource status), SharedKbList (list of shared knowledge bases referenced by the application), CorpShareConfig (corporate shared configuration), FileVolumeMountList (cloud disk mount list)</p>
     */
    public FieldMask getFieldMask() {
        return this.FieldMask;
    }

    /**
     * Set <p>Field mask, specify the fields to return (return all fields if Paths is empty). Paths enumeration values: AppConfig (application configuration), SecretInfo (application key info), ShareUrlInfo (sharing link information), SpecialStatusInfo (special status information), SearchResourceStatus (search resource status), SharedKbList (list of shared knowledge bases referenced by the application), CorpShareConfig (corporate shared configuration), FileVolumeMountList (cloud disk mount list)</p>
     * @param FieldMask <p>Field mask, specify the fields to return (return all fields if Paths is empty). Paths enumeration values: AppConfig (application configuration), SecretInfo (application key info), ShareUrlInfo (sharing link information), SpecialStatusInfo (special status information), SearchResourceStatus (search resource status), SharedKbList (list of shared knowledge bases referenced by the application), CorpShareConfig (corporate shared configuration), FileVolumeMountList (cloud disk mount list)</p>
     */
    public void setFieldMask(FieldMask FieldMask) {
        this.FieldMask = FieldMask;
    }

    /**
     * Get <p>Specific status type (required when FieldMask includes SpecialStatusInfo). Enumeration values: 1: rollback status, 2: first-time import status</p> 
     * @return StatusType <p>Specific status type (required when FieldMask includes SpecialStatusInfo). Enumeration values: 1: rollback status, 2: first-time import status</p>
     */
    public Long getStatusType() {
        return this.StatusType;
    }

    /**
     * Set <p>Specific status type (required when FieldMask includes SpecialStatusInfo). Enumeration values: 1: rollback status, 2: first-time import status</p>
     * @param StatusType <p>Specific status type (required when FieldMask includes SpecialStatusInfo). Enumeration values: 1: rollback status, 2: first-time import status</p>
     */
    public void setStatusType(Long StatusType) {
        this.StatusType = StatusType;
    }

    public DescribeAppRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAppRequest(DescribeAppRequest source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.Domain != null) {
            this.Domain = new Long(source.Domain);
        }
        if (source.FieldMask != null) {
            this.FieldMask = new FieldMask(source.FieldMask);
        }
        if (source.StatusType != null) {
            this.StatusType = new Long(source.StatusType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamObj(map, prefix + "FieldMask.", this.FieldMask);
        this.setParamSimple(map, prefix + "StatusType", this.StatusType);

    }
}

