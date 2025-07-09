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

public class UpdateCertificateInstanceRequest extends AbstractModel {

    /**
    * The old certificate id for one-click update. by querying the cloud resources bound to this certificate id, and then updating these cloud resources with the new certificate.
    */
    @SerializedName("OldCertificateId")
    @Expose
    private String OldCertificateId;

    /**
    * Resource types that need to be deployed, with optional parameter values (lowercase): clb, cdn, waf, live, ddos, teo, apigateway, vod, tke, tcb, tse, cos.
    */
    @SerializedName("ResourceTypes")
    @Expose
    private String [] ResourceTypes;

    /**
    * New certificate id for one-click update. if this parameter is not provided, the public key certificate and private key certificate must be provided.
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
    * List of regions where cloud resources need to be deployed. the cloud resource type of the supported region must be passed. valid values: clb, tke, apigateway, waf, tcb, tse, cos.
    */
    @SerializedName("ResourceTypesRegions")
    @Expose
    private ResourceTypeRegions [] ResourceTypesRegions;

    /**
    * If a public key certificate is uploaded, the private key certificate must also be uploaded, and the CertificateId does not need to be transmitted.
    */
    @SerializedName("CertificatePublicKey")
    @Expose
    private String CertificatePublicKey;

    /**
    * If a private key certificate is uploaded, then a public key certificate must be uploaded; CertificateId is not required.
    */
    @SerializedName("CertificatePrivateKey")
    @Expose
    private String CertificatePrivateKey;

    /**
    * Whether to ignore expiration reminder for old certificate  0: do not ignore the notification. 1: ignore the notification, ignore the expiration reminder of OldCertificateId.
    */
    @SerializedName("ExpiringNotificationSwitch")
    @Expose
    private Long ExpiringNotificationSwitch;

    /**
    * It specifies whether the same certificate is allowed to be uploaded repeatedly. If the public key and private key certificates are selected for upload, this parameter can be configured. If there are duplicate certificates, the update task will fail.
    */
    @SerializedName("Repeatable")
    @Expose
    private Boolean Repeatable;

    /**
    * Whether to allow downloading. If you choose to upload a public/private key certificate, this parameter can be configured.
    */
    @SerializedName("AllowDownload")
    @Expose
    private Boolean AllowDownload;

    /**
    * Tag list. If you choose to upload a public/private key certificate, you can configure this parameter.
    */
    @SerializedName("Tags")
    @Expose
    private Tags [] Tags;

    /**
    * Project id. If you choose to upload a public/private key certificate, you can configure this parameter.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
     * Get The old certificate id for one-click update. by querying the cloud resources bound to this certificate id, and then updating these cloud resources with the new certificate. 
     * @return OldCertificateId The old certificate id for one-click update. by querying the cloud resources bound to this certificate id, and then updating these cloud resources with the new certificate.
     */
    public String getOldCertificateId() {
        return this.OldCertificateId;
    }

    /**
     * Set The old certificate id for one-click update. by querying the cloud resources bound to this certificate id, and then updating these cloud resources with the new certificate.
     * @param OldCertificateId The old certificate id for one-click update. by querying the cloud resources bound to this certificate id, and then updating these cloud resources with the new certificate.
     */
    public void setOldCertificateId(String OldCertificateId) {
        this.OldCertificateId = OldCertificateId;
    }

    /**
     * Get Resource types that need to be deployed, with optional parameter values (lowercase): clb, cdn, waf, live, ddos, teo, apigateway, vod, tke, tcb, tse, cos. 
     * @return ResourceTypes Resource types that need to be deployed, with optional parameter values (lowercase): clb, cdn, waf, live, ddos, teo, apigateway, vod, tke, tcb, tse, cos.
     */
    public String [] getResourceTypes() {
        return this.ResourceTypes;
    }

    /**
     * Set Resource types that need to be deployed, with optional parameter values (lowercase): clb, cdn, waf, live, ddos, teo, apigateway, vod, tke, tcb, tse, cos.
     * @param ResourceTypes Resource types that need to be deployed, with optional parameter values (lowercase): clb, cdn, waf, live, ddos, teo, apigateway, vod, tke, tcb, tse, cos.
     */
    public void setResourceTypes(String [] ResourceTypes) {
        this.ResourceTypes = ResourceTypes;
    }

    /**
     * Get New certificate id for one-click update. if this parameter is not provided, the public key certificate and private key certificate must be provided. 
     * @return CertificateId New certificate id for one-click update. if this parameter is not provided, the public key certificate and private key certificate must be provided.
     */
    public String getCertificateId() {
        return this.CertificateId;
    }

    /**
     * Set New certificate id for one-click update. if this parameter is not provided, the public key certificate and private key certificate must be provided.
     * @param CertificateId New certificate id for one-click update. if this parameter is not provided, the public key certificate and private key certificate must be provided.
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
     * Get List of regions where cloud resources need to be deployed. the cloud resource type of the supported region must be passed. valid values: clb, tke, apigateway, waf, tcb, tse, cos. 
     * @return ResourceTypesRegions List of regions where cloud resources need to be deployed. the cloud resource type of the supported region must be passed. valid values: clb, tke, apigateway, waf, tcb, tse, cos.
     */
    public ResourceTypeRegions [] getResourceTypesRegions() {
        return this.ResourceTypesRegions;
    }

    /**
     * Set List of regions where cloud resources need to be deployed. the cloud resource type of the supported region must be passed. valid values: clb, tke, apigateway, waf, tcb, tse, cos.
     * @param ResourceTypesRegions List of regions where cloud resources need to be deployed. the cloud resource type of the supported region must be passed. valid values: clb, tke, apigateway, waf, tcb, tse, cos.
     */
    public void setResourceTypesRegions(ResourceTypeRegions [] ResourceTypesRegions) {
        this.ResourceTypesRegions = ResourceTypesRegions;
    }

    /**
     * Get If a public key certificate is uploaded, the private key certificate must also be uploaded, and the CertificateId does not need to be transmitted. 
     * @return CertificatePublicKey If a public key certificate is uploaded, the private key certificate must also be uploaded, and the CertificateId does not need to be transmitted.
     */
    public String getCertificatePublicKey() {
        return this.CertificatePublicKey;
    }

    /**
     * Set If a public key certificate is uploaded, the private key certificate must also be uploaded, and the CertificateId does not need to be transmitted.
     * @param CertificatePublicKey If a public key certificate is uploaded, the private key certificate must also be uploaded, and the CertificateId does not need to be transmitted.
     */
    public void setCertificatePublicKey(String CertificatePublicKey) {
        this.CertificatePublicKey = CertificatePublicKey;
    }

    /**
     * Get If a private key certificate is uploaded, then a public key certificate must be uploaded; CertificateId is not required. 
     * @return CertificatePrivateKey If a private key certificate is uploaded, then a public key certificate must be uploaded; CertificateId is not required.
     */
    public String getCertificatePrivateKey() {
        return this.CertificatePrivateKey;
    }

    /**
     * Set If a private key certificate is uploaded, then a public key certificate must be uploaded; CertificateId is not required.
     * @param CertificatePrivateKey If a private key certificate is uploaded, then a public key certificate must be uploaded; CertificateId is not required.
     */
    public void setCertificatePrivateKey(String CertificatePrivateKey) {
        this.CertificatePrivateKey = CertificatePrivateKey;
    }

    /**
     * Get Whether to ignore expiration reminder for old certificate  0: do not ignore the notification. 1: ignore the notification, ignore the expiration reminder of OldCertificateId. 
     * @return ExpiringNotificationSwitch Whether to ignore expiration reminder for old certificate  0: do not ignore the notification. 1: ignore the notification, ignore the expiration reminder of OldCertificateId.
     */
    public Long getExpiringNotificationSwitch() {
        return this.ExpiringNotificationSwitch;
    }

    /**
     * Set Whether to ignore expiration reminder for old certificate  0: do not ignore the notification. 1: ignore the notification, ignore the expiration reminder of OldCertificateId.
     * @param ExpiringNotificationSwitch Whether to ignore expiration reminder for old certificate  0: do not ignore the notification. 1: ignore the notification, ignore the expiration reminder of OldCertificateId.
     */
    public void setExpiringNotificationSwitch(Long ExpiringNotificationSwitch) {
        this.ExpiringNotificationSwitch = ExpiringNotificationSwitch;
    }

    /**
     * Get It specifies whether the same certificate is allowed to be uploaded repeatedly. If the public key and private key certificates are selected for upload, this parameter can be configured. If there are duplicate certificates, the update task will fail. 
     * @return Repeatable It specifies whether the same certificate is allowed to be uploaded repeatedly. If the public key and private key certificates are selected for upload, this parameter can be configured. If there are duplicate certificates, the update task will fail.
     */
    public Boolean getRepeatable() {
        return this.Repeatable;
    }

    /**
     * Set It specifies whether the same certificate is allowed to be uploaded repeatedly. If the public key and private key certificates are selected for upload, this parameter can be configured. If there are duplicate certificates, the update task will fail.
     * @param Repeatable It specifies whether the same certificate is allowed to be uploaded repeatedly. If the public key and private key certificates are selected for upload, this parameter can be configured. If there are duplicate certificates, the update task will fail.
     */
    public void setRepeatable(Boolean Repeatable) {
        this.Repeatable = Repeatable;
    }

    /**
     * Get Whether to allow downloading. If you choose to upload a public/private key certificate, this parameter can be configured. 
     * @return AllowDownload Whether to allow downloading. If you choose to upload a public/private key certificate, this parameter can be configured.
     */
    public Boolean getAllowDownload() {
        return this.AllowDownload;
    }

    /**
     * Set Whether to allow downloading. If you choose to upload a public/private key certificate, this parameter can be configured.
     * @param AllowDownload Whether to allow downloading. If you choose to upload a public/private key certificate, this parameter can be configured.
     */
    public void setAllowDownload(Boolean AllowDownload) {
        this.AllowDownload = AllowDownload;
    }

    /**
     * Get Tag list. If you choose to upload a public/private key certificate, you can configure this parameter. 
     * @return Tags Tag list. If you choose to upload a public/private key certificate, you can configure this parameter.
     */
    public Tags [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag list. If you choose to upload a public/private key certificate, you can configure this parameter.
     * @param Tags Tag list. If you choose to upload a public/private key certificate, you can configure this parameter.
     */
    public void setTags(Tags [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Project id. If you choose to upload a public/private key certificate, you can configure this parameter. 
     * @return ProjectId Project id. If you choose to upload a public/private key certificate, you can configure this parameter.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project id. If you choose to upload a public/private key certificate, you can configure this parameter.
     * @param ProjectId Project id. If you choose to upload a public/private key certificate, you can configure this parameter.
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

