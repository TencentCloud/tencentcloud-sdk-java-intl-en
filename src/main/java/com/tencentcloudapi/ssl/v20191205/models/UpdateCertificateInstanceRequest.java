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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateCertificateInstanceRequest extends AbstractModel {

    /**
    * One-click update old certificate ID
    */
    @SerializedName("OldCertificateId")
    @Expose
    private String OldCertificateId;

    /**
    * Type of the resource that needs to be deployed. The following parameter values are optional: clb, cdn, waf, live, ddos, teo, apigateway, vod, tke, and tcb.
    */
    @SerializedName("ResourceTypes")
    @Expose
    private String [] ResourceTypes;

    /**
    * One-click update new certificate ID
    */
    @SerializedName("CertificateId")
    @Expose
    private String CertificateId;

    /**
    * List of regions that need to be deployed (deprecated)
    */
    @SerializedName("Regions")
    @Expose
    private String [] Regions;

    /**
    * List of regions for which cloud resources need to be deployed
    */
    @SerializedName("ResourceTypesRegions")
    @Expose
    private ResourceTypeRegions [] ResourceTypesRegions;

    /**
    * Public key of the certificate. If the public key of the certificate is uploaded, CertificateId does not need to be uploaded.
    */
    @SerializedName("CertificatePublicKey")
    @Expose
    private String CertificatePublicKey;

    /**
    * Private key of the certificate. If the public key of the certificate is uploaded, the private key of the certificate is required.
    */
    @SerializedName("CertificatePrivateKey")
    @Expose
    private String CertificatePrivateKey;

    /**
    * Whether an expiration reminder is ignored for the old certificate. 0: The notification is not ignored. 1: The notification is ignored.
    */
    @SerializedName("ExpiringNotificationSwitch")
    @Expose
    private Long ExpiringNotificationSwitch;

    /**
    * Whether repeated uploading of the same certificate is allowed. If the public key of the certificate is uploaded, this parameter can be configured.
    */
    @SerializedName("Repeatable")
    @Expose
    private Boolean Repeatable;

    /**
    * Whether downloading is allowed. If the public key of the certificate is uploaded, this parameter can be configured.
    */
    @SerializedName("AllowDownload")
    @Expose
    private Boolean AllowDownload;

    /**
    * Tag list. If the public key of the certificate is uploaded, this parameter can be configured.
    */
    @SerializedName("Tags")
    @Expose
    private Tags [] Tags;

    /**
    * Project ID. If the public key of the certificate is uploaded, this parameter can be configured.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
     * Get One-click update old certificate ID 
     * @return OldCertificateId One-click update old certificate ID
     */
    public String getOldCertificateId() {
        return this.OldCertificateId;
    }

    /**
     * Set One-click update old certificate ID
     * @param OldCertificateId One-click update old certificate ID
     */
    public void setOldCertificateId(String OldCertificateId) {
        this.OldCertificateId = OldCertificateId;
    }

    /**
     * Get Type of the resource that needs to be deployed. The following parameter values are optional: clb, cdn, waf, live, ddos, teo, apigateway, vod, tke, and tcb. 
     * @return ResourceTypes Type of the resource that needs to be deployed. The following parameter values are optional: clb, cdn, waf, live, ddos, teo, apigateway, vod, tke, and tcb.
     */
    public String [] getResourceTypes() {
        return this.ResourceTypes;
    }

    /**
     * Set Type of the resource that needs to be deployed. The following parameter values are optional: clb, cdn, waf, live, ddos, teo, apigateway, vod, tke, and tcb.
     * @param ResourceTypes Type of the resource that needs to be deployed. The following parameter values are optional: clb, cdn, waf, live, ddos, teo, apigateway, vod, tke, and tcb.
     */
    public void setResourceTypes(String [] ResourceTypes) {
        this.ResourceTypes = ResourceTypes;
    }

    /**
     * Get One-click update new certificate ID 
     * @return CertificateId One-click update new certificate ID
     */
    public String getCertificateId() {
        return this.CertificateId;
    }

    /**
     * Set One-click update new certificate ID
     * @param CertificateId One-click update new certificate ID
     */
    public void setCertificateId(String CertificateId) {
        this.CertificateId = CertificateId;
    }

    /**
     * Get List of regions that need to be deployed (deprecated) 
     * @return Regions List of regions that need to be deployed (deprecated)
     * @deprecated
     */
    @Deprecated
    public String [] getRegions() {
        return this.Regions;
    }

    /**
     * Set List of regions that need to be deployed (deprecated)
     * @param Regions List of regions that need to be deployed (deprecated)
     * @deprecated
     */
    @Deprecated
    public void setRegions(String [] Regions) {
        this.Regions = Regions;
    }

    /**
     * Get List of regions for which cloud resources need to be deployed 
     * @return ResourceTypesRegions List of regions for which cloud resources need to be deployed
     */
    public ResourceTypeRegions [] getResourceTypesRegions() {
        return this.ResourceTypesRegions;
    }

    /**
     * Set List of regions for which cloud resources need to be deployed
     * @param ResourceTypesRegions List of regions for which cloud resources need to be deployed
     */
    public void setResourceTypesRegions(ResourceTypeRegions [] ResourceTypesRegions) {
        this.ResourceTypesRegions = ResourceTypesRegions;
    }

    /**
     * Get Public key of the certificate. If the public key of the certificate is uploaded, CertificateId does not need to be uploaded. 
     * @return CertificatePublicKey Public key of the certificate. If the public key of the certificate is uploaded, CertificateId does not need to be uploaded.
     */
    public String getCertificatePublicKey() {
        return this.CertificatePublicKey;
    }

    /**
     * Set Public key of the certificate. If the public key of the certificate is uploaded, CertificateId does not need to be uploaded.
     * @param CertificatePublicKey Public key of the certificate. If the public key of the certificate is uploaded, CertificateId does not need to be uploaded.
     */
    public void setCertificatePublicKey(String CertificatePublicKey) {
        this.CertificatePublicKey = CertificatePublicKey;
    }

    /**
     * Get Private key of the certificate. If the public key of the certificate is uploaded, the private key of the certificate is required. 
     * @return CertificatePrivateKey Private key of the certificate. If the public key of the certificate is uploaded, the private key of the certificate is required.
     */
    public String getCertificatePrivateKey() {
        return this.CertificatePrivateKey;
    }

    /**
     * Set Private key of the certificate. If the public key of the certificate is uploaded, the private key of the certificate is required.
     * @param CertificatePrivateKey Private key of the certificate. If the public key of the certificate is uploaded, the private key of the certificate is required.
     */
    public void setCertificatePrivateKey(String CertificatePrivateKey) {
        this.CertificatePrivateKey = CertificatePrivateKey;
    }

    /**
     * Get Whether an expiration reminder is ignored for the old certificate. 0: The notification is not ignored. 1: The notification is ignored. 
     * @return ExpiringNotificationSwitch Whether an expiration reminder is ignored for the old certificate. 0: The notification is not ignored. 1: The notification is ignored.
     */
    public Long getExpiringNotificationSwitch() {
        return this.ExpiringNotificationSwitch;
    }

    /**
     * Set Whether an expiration reminder is ignored for the old certificate. 0: The notification is not ignored. 1: The notification is ignored.
     * @param ExpiringNotificationSwitch Whether an expiration reminder is ignored for the old certificate. 0: The notification is not ignored. 1: The notification is ignored.
     */
    public void setExpiringNotificationSwitch(Long ExpiringNotificationSwitch) {
        this.ExpiringNotificationSwitch = ExpiringNotificationSwitch;
    }

    /**
     * Get Whether repeated uploading of the same certificate is allowed. If the public key of the certificate is uploaded, this parameter can be configured. 
     * @return Repeatable Whether repeated uploading of the same certificate is allowed. If the public key of the certificate is uploaded, this parameter can be configured.
     */
    public Boolean getRepeatable() {
        return this.Repeatable;
    }

    /**
     * Set Whether repeated uploading of the same certificate is allowed. If the public key of the certificate is uploaded, this parameter can be configured.
     * @param Repeatable Whether repeated uploading of the same certificate is allowed. If the public key of the certificate is uploaded, this parameter can be configured.
     */
    public void setRepeatable(Boolean Repeatable) {
        this.Repeatable = Repeatable;
    }

    /**
     * Get Whether downloading is allowed. If the public key of the certificate is uploaded, this parameter can be configured. 
     * @return AllowDownload Whether downloading is allowed. If the public key of the certificate is uploaded, this parameter can be configured.
     */
    public Boolean getAllowDownload() {
        return this.AllowDownload;
    }

    /**
     * Set Whether downloading is allowed. If the public key of the certificate is uploaded, this parameter can be configured.
     * @param AllowDownload Whether downloading is allowed. If the public key of the certificate is uploaded, this parameter can be configured.
     */
    public void setAllowDownload(Boolean AllowDownload) {
        this.AllowDownload = AllowDownload;
    }

    /**
     * Get Tag list. If the public key of the certificate is uploaded, this parameter can be configured. 
     * @return Tags Tag list. If the public key of the certificate is uploaded, this parameter can be configured.
     */
    public Tags [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag list. If the public key of the certificate is uploaded, this parameter can be configured.
     * @param Tags Tag list. If the public key of the certificate is uploaded, this parameter can be configured.
     */
    public void setTags(Tags [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Project ID. If the public key of the certificate is uploaded, this parameter can be configured. 
     * @return ProjectId Project ID. If the public key of the certificate is uploaded, this parameter can be configured.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID. If the public key of the certificate is uploaded, this parameter can be configured.
     * @param ProjectId Project ID. If the public key of the certificate is uploaded, this parameter can be configured.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    public UpdateCertificateInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateCertificateInstanceRequest(UpdateCertificateInstanceRequest source) {
        if (source.OldCertificateId != null) {
            this.OldCertificateId = new String(source.OldCertificateId);
        }
        if (source.ResourceTypes != null) {
            this.ResourceTypes = new String[source.ResourceTypes.length];
            for (int i = 0; i < source.ResourceTypes.length; i++) {
                this.ResourceTypes[i] = new String(source.ResourceTypes[i]);
            }
        }
        if (source.CertificateId != null) {
            this.CertificateId = new String(source.CertificateId);
        }
        if (source.Regions != null) {
            this.Regions = new String[source.Regions.length];
            for (int i = 0; i < source.Regions.length; i++) {
                this.Regions[i] = new String(source.Regions[i]);
            }
        }
        if (source.ResourceTypesRegions != null) {
            this.ResourceTypesRegions = new ResourceTypeRegions[source.ResourceTypesRegions.length];
            for (int i = 0; i < source.ResourceTypesRegions.length; i++) {
                this.ResourceTypesRegions[i] = new ResourceTypeRegions(source.ResourceTypesRegions[i]);
            }
        }
        if (source.CertificatePublicKey != null) {
            this.CertificatePublicKey = new String(source.CertificatePublicKey);
        }
        if (source.CertificatePrivateKey != null) {
            this.CertificatePrivateKey = new String(source.CertificatePrivateKey);
        }
        if (source.ExpiringNotificationSwitch != null) {
            this.ExpiringNotificationSwitch = new Long(source.ExpiringNotificationSwitch);
        }
        if (source.Repeatable != null) {
            this.Repeatable = new Boolean(source.Repeatable);
        }
        if (source.AllowDownload != null) {
            this.AllowDownload = new Boolean(source.AllowDownload);
        }
        if (source.Tags != null) {
            this.Tags = new Tags[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tags(source.Tags[i]);
            }
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OldCertificateId", this.OldCertificateId);
        this.setParamArraySimple(map, prefix + "ResourceTypes.", this.ResourceTypes);
        this.setParamSimple(map, prefix + "CertificateId", this.CertificateId);
        this.setParamArraySimple(map, prefix + "Regions.", this.Regions);
        this.setParamArrayObj(map, prefix + "ResourceTypesRegions.", this.ResourceTypesRegions);
        this.setParamSimple(map, prefix + "CertificatePublicKey", this.CertificatePublicKey);
        this.setParamSimple(map, prefix + "CertificatePrivateKey", this.CertificatePrivateKey);
        this.setParamSimple(map, prefix + "ExpiringNotificationSwitch", this.ExpiringNotificationSwitch);
        this.setParamSimple(map, prefix + "Repeatable", this.Repeatable);
        this.setParamSimple(map, prefix + "AllowDownload", this.AllowDownload);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);

    }
}

