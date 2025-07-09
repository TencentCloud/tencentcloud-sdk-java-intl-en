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

public class UploadUpdateCertificateInstanceRequest extends AbstractModel {

    /**
    * Old Certificate ID for One-Click Update. Query the tencent cloud resources bound to this certificate ID and use the new certificate to update these resources.
    */
    @SerializedName("OldCertificateId")
    @Expose
    private String OldCertificateId;

    /**
    * Resource type that needs to be deployed, parameter value (lowercase): clb.
    */
    @SerializedName("ResourceTypes")
    @Expose
    private String [] ResourceTypes;

    /**
    * Public key certificate.
    */
    @SerializedName("CertificatePublicKey")
    @Expose
    private String CertificatePublicKey;

    /**
    * Private key certificate.
    */
    @SerializedName("CertificatePrivateKey")
    @Expose
    private String CertificatePrivateKey;

    /**
    * The list of regions where cloud resources need to be deployed. The cloud resource type supported in the region is required. Value: clb.
    */
    @SerializedName("ResourceTypesRegions")
    @Expose
    private ResourceTypeRegions [] ResourceTypesRegions;

    /**
     * Get Old Certificate ID for One-Click Update. Query the tencent cloud resources bound to this certificate ID and use the new certificate to update these resources. 
     * @return OldCertificateId Old Certificate ID for One-Click Update. Query the tencent cloud resources bound to this certificate ID and use the new certificate to update these resources.
     */
    public String getOldCertificateId() {
        return this.OldCertificateId;
    }

    /**
     * Set Old Certificate ID for One-Click Update. Query the tencent cloud resources bound to this certificate ID and use the new certificate to update these resources.
     * @param OldCertificateId Old Certificate ID for One-Click Update. Query the tencent cloud resources bound to this certificate ID and use the new certificate to update these resources.
     */
    public void setOldCertificateId(String OldCertificateId) {
        this.OldCertificateId = OldCertificateId;
    }

    /**
     * Get Resource type that needs to be deployed, parameter value (lowercase): clb. 
     * @return ResourceTypes Resource type that needs to be deployed, parameter value (lowercase): clb.
     */
    public String [] getResourceTypes() {
        return this.ResourceTypes;
    }

    /**
     * Set Resource type that needs to be deployed, parameter value (lowercase): clb.
     * @param ResourceTypes Resource type that needs to be deployed, parameter value (lowercase): clb.
     */
    public void setResourceTypes(String [] ResourceTypes) {
        this.ResourceTypes = ResourceTypes;
    }

    /**
     * Get Public key certificate. 
     * @return CertificatePublicKey Public key certificate.
     */
    public String getCertificatePublicKey() {
        return this.CertificatePublicKey;
    }

    /**
     * Set Public key certificate.
     * @param CertificatePublicKey Public key certificate.
     */
    public void setCertificatePublicKey(String CertificatePublicKey) {
        this.CertificatePublicKey = CertificatePublicKey;
    }

    /**
     * Get Private key certificate. 
     * @return CertificatePrivateKey Private key certificate.
     */
    public String getCertificatePrivateKey() {
        return this.CertificatePrivateKey;
    }

    /**
     * Set Private key certificate.
     * @param CertificatePrivateKey Private key certificate.
     */
    public void setCertificatePrivateKey(String CertificatePrivateKey) {
        this.CertificatePrivateKey = CertificatePrivateKey;
    }

    /**
     * Get The list of regions where cloud resources need to be deployed. The cloud resource type supported in the region is required. Value: clb. 
     * @return ResourceTypesRegions The list of regions where cloud resources need to be deployed. The cloud resource type supported in the region is required. Value: clb.
     */
    public ResourceTypeRegions [] getResourceTypesRegions() {
        return this.ResourceTypesRegions;
    }

    /**
     * Set The list of regions where cloud resources need to be deployed. The cloud resource type supported in the region is required. Value: clb.
     * @param ResourceTypesRegions The list of regions where cloud resources need to be deployed. The cloud resource type supported in the region is required. Value: clb.
     */
    public void setResourceTypesRegions(ResourceTypeRegions [] ResourceTypesRegions) {
        this.ResourceTypesRegions = ResourceTypesRegions;
    }

    public UploadUpdateCertificateInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UploadUpdateCertificateInstanceRequest(UploadUpdateCertificateInstanceRequest source) {
        if (source.OldCertificateId != null) {
            this.OldCertificateId = new String(source.OldCertificateId);
        }
        if (source.ResourceTypes != null) {
            this.ResourceTypes = new String[source.ResourceTypes.length];
            for (int i = 0; i < source.ResourceTypes.length; i++) {
                this.ResourceTypes[i] = new String(source.ResourceTypes[i]);
            }
        }
        if (source.CertificatePublicKey != null) {
            this.CertificatePublicKey = new String(source.CertificatePublicKey);
        }
        if (source.CertificatePrivateKey != null) {
            this.CertificatePrivateKey = new String(source.CertificatePrivateKey);
        }
        if (source.ResourceTypesRegions != null) {
            this.ResourceTypesRegions = new ResourceTypeRegions[source.ResourceTypesRegions.length];
            for (int i = 0; i < source.ResourceTypesRegions.length; i++) {
                this.ResourceTypesRegions[i] = new ResourceTypeRegions(source.ResourceTypesRegions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OldCertificateId", this.OldCertificateId);
        this.setParamArraySimple(map, prefix + "ResourceTypes.", this.ResourceTypes);
        this.setParamSimple(map, prefix + "CertificatePublicKey", this.CertificatePublicKey);
        this.setParamSimple(map, prefix + "CertificatePrivateKey", this.CertificatePrivateKey);
        this.setParamArrayObj(map, prefix + "ResourceTypesRegions.", this.ResourceTypesRegions);

    }
}

